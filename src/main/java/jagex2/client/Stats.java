package jagex2.client;

import deob.ObfuscatedName;

public class Stats {

	@ObfuscatedName("WCVISEZF.a")
	public static int field1503 = 25;

	@ObfuscatedName("WCVISEZF.b")
	public static String[] field1504 = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", "runecraft", "construction", "hexediting", "-unused-", "-unused-" };

	// Slot 21 was Jagex's "yodelling" placeholder. Construction (2026-09-10) - enabling it adds its level
	// to the stat tab's Total Lvl (clientscript op9 sums the enabled slots). The server sends stat 21
	// either way; this array is only what the client counts.
	@ObfuscatedName("WCVISEZF.c")
	public static boolean[] field1505 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false };
}
