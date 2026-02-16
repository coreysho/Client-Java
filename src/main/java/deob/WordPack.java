package deob;

@ObfuscatedName("zb")
public final class WordPack {

	@ObfuscatedName("zb.a")
	public static final char[] field878 = new char[100];

	@ObfuscatedName("zb.b")
	public static final char[] field879 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("zb.a(BILlb;)Ljava/lang/String;")
	public static String method302(int arg0, Packet arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method224();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field878[var2++] = field879[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field878[var2++] = field879[var6];
			} else {
				var3 = var6;
			}
			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field878[var2++] = field879[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field878[var2++] = field879[var7];
			} else {
				var3 = var7;
			}
		}
		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field878[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field878[var9] = (char) (field878[var9] - 32);
				var8 = false;
			}
			if (var10 == '.' || var10 == '!') {
				var8 = true;
			}
		}
		return new String(field878, 0, var2);
	}

	@ObfuscatedName("zb.a(Ljava/lang/String;BLlb;)V")
	public static void method303(String arg0, Packet arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		String var2 = arg0.toLowerCase();
		int var3 = -1;
		for (int var4 = 0; var4 < var2.length(); var4++) {
			char var5 = var2.charAt(var4);
			int var6 = 0;
			for (int var7 = 0; var7 < field879.length; var7++) {
				if (var5 == field879[var7]) {
					var6 = var7;
					break;
				}
			}
			if (var6 > 12) {
				var6 += 195;
			}
			if (var3 == -1) {
				if (var6 < 13) {
					var3 = var6;
				} else {
					arg1.method214(var6);
				}
			} else if (var6 < 13) {
				arg1.method214((var3 << 4) + var6);
				var3 = -1;
			} else {
				arg1.method214((var3 << 4) + (var6 >> 4));
				var3 = var6 & 0xF;
			}
		}
		if (var3 != -1) {
			arg1.method214(var3 << 4);
		}
	}
}
