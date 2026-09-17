#!/usr/bin/env python3
"""Mutation test for tools/clienttests/run_groundtest.py.

A passing harness proves nothing until a broken client makes it fail. Each entry below breaks one
thing the overlay is supposed to do, runs the harness, and reports WHICH check caught it - because
a mutation that trips some other check proves only that something noticed.

The anchor must be UNIQUE in Client.java. A mutation that lands in a comment is a green tick that
means nothing, and this class of mistake has cost this fork four silent passes already (see the
note in content/tools/follower_mutate.py), so a pattern that matches zero or many times is a loud
skip rather than a quiet first-match edit.

    python3 tools/clienttests/mutate_groundtest.py [filter]
"""
import os
import subprocess
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(os.path.dirname(HERE))
CLIENT = os.path.join(ROOT, 'src/main/java/jagex2/client/Client.java')
RUNNER = os.path.join(HERE, 'run_groundtest.py')

MUTS = [
    # ---- the gap, which is what the round was for
    ('the column laid out over the tracked count again, so a hidden row leaves a hole',
     'int rowY = this.projectY - (shown - 1) * GROUND_ITEM_ROW_H;',
     'int rowY = this.projectY - (distinct - 1) * GROUND_ITEM_ROW_H;'),
    ('a skipped row still advancing the cursor, which is the bug in its original form',
     '\t\t\t\t\tif (colour == GI_ROW_SKIP) {\n\t\t\t\t\t\tcontinue;\n\t\t\t\t\t}',
     '\t\t\t\t\tif (colour == GI_ROW_SKIP) {\n\t\t\t\t\t\trowY += GROUND_ITEM_ROW_H;\n'
     '\t\t\t\t\t\tcontinue;\n\t\t\t\t\t}'),
    ('a pile with nothing visible still recording itself as scrollable',
     '\t\t\t\tif (visible == 0) {\n\t\t\t\t\tcontinue;\n\t\t\t\t}', ''),
    # ---- the window and the wheel
    ('the whole pile drawn rather than a window of it',
     'int shown = visible < GI_ROWS_SHOWN ? visible : GI_ROWS_SHOWN;',
     'int shown = visible;'),
    ('the wheel not consumed, so a turn over a pile also zooms the camera',
     '\t\t\tsuper.mouseScrollDelta = 0;\n\t\t\treturn true;', '\t\t\treturn true;'),
    ('a pile that fits eating the wheel anyway, so it can never zoom over a drop',
     '\t\t\tif (this.giPileRows[i] <= GI_ROWS_SHOWN) {\n'
     '\t\t\t\tcontinue;                                    // nothing to scroll: leave it to zoom\n'
     '\t\t\t}', ''),
    ('the offset not reset when the cursor moves to a different pile',
     '\t\t\t\tthis.giScrollOffset = 0;\n\t\t\t}\n\t\t\tthis.giScrollOffset += super.mouseScrollDelta;',
     '\t\t\t}\n\t\t\tthis.giScrollOffset += super.mouseScrollDelta;'),
    ('the offset not clamped on the wheel, so it runs off the end of the pile',
     '\t\t\tif (this.giScrollOffset > max) {\n\t\t\t\tthis.giScrollOffset = max;\n\t\t\t}', ''),
    ('the offset not re-clamped in the draw, so a pile shrinking leaves it past its own end',
     '\t\t\t\t\tif (offset > visible - shown) {\n\t\t\t\t\t\toffset = visible - shown;\n\t\t\t\t\t}',
     ''),
    # ---- the bar
    ('the bar drawn on a pile that fits, a control with nothing to control',
     'if (visible > shown) {', 'if (visible >= shown) {'),
    ('the thumb not moving with the window',
     'int thumbY = top + track * offset / visible;', 'int thumbY = top;'),
    ('the bar outside the pile\'s hover box, so pointing at it does not scroll',
     '\t\t\t\t\tminLeft = barX;', ''),
    # ---- what Alt still does
    #
    # NO MUTATION for "one click target per DRAWN row": the window guard is a single branch that
    # governs the draw and the zone together, so every way of breaking the zone half breaks the
    # draw half too and is caught by the window check instead. Saying so beats a mutation that
    # reports the wrong claim as the one that noticed.
    ('the click target carrying the label instead of the bare name, so a rule set on a pile of '
     'coins stops matching one coin',
     'this.giZoneName[z] = type.field811;', 'this.giZoneName[z] = label;'),
]


def main():
    only = sys.argv[1] if len(sys.argv) > 1 else None
    with open(CLIENT, encoding='utf-8', newline='') as f:
        orig = f.read()
    muts = [m for m in MUTS if not only or only in m[0]]
    print('running %d of %d mutations' % (len(muts), len(MUTS)))
    bad = loose = 0
    for why, find, repl in muts:
        n = orig.count(find)
        if n != 1:
            print('  SKIP (pattern %s) %s'
                  % ('not found' if n == 0 else 'matches %d times' % n, why))
            bad += 1
            continue
        try:
            with open(CLIENT, 'w', encoding='utf-8', newline='') as f:
                f.write(orig.replace(find, repl))
            r = subprocess.run([sys.executable, RUNNER], capture_output=True, text=True)
        finally:
            with open(CLIENT, 'w', encoding='utf-8', newline='') as f:
                f.write(orig)
        fired = [l.strip()[5:].strip() for l in r.stdout.split('\n') if l.startswith('FAIL')]
        if r.returncode == 0:
            print('  %-5s %-74s %s' % ('GREEN', why, 'NOT CAUGHT'))
            bad += 1
        elif fired:
            print('  %-5s %-74s %s' % ('red', why, 'caught by: ' + fired[0][:60]))
        else:
            print('  %-5s %-74s %s' % ('red', why,
                  'caught, but by a non-zero exit with no check named - a crash is not a catch'))
            loose += 1
    print()
    if bad:
        print('%d MUTATIONS SURVIVED OR SKIPPED' % bad)
    elif loose:
        print('every mutation was caught, but %d only by a crash' % loose)
    else:
        print('every mutation was caught, each by a named check')
    return 1 if bad or loose else 0


if __name__ == '__main__':
    sys.exit(main())
