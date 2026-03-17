package jagex2.client;

import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

import deob.*;
import jagex2.config.*;
import jagex2.dash3d.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.*;
import jagex2.io.*;
import jagex2.sound.JagFX;
import jagex2.wordfilter.WordFilter;
import jagex2.wordfilter.WordPack;
import sign.signlink;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.ab")
	public int field1229;

	@ObfuscatedName("client.bb")
	public int field1230;

	@ObfuscatedName("client.cb")
	public String field1231;

	@ObfuscatedName("client.db")
	public LinkList[][][] field1232 = new LinkList[4][104][104];

	@ObfuscatedName("client.eb")
	public final long[] field1233 = new long[100];

	@ObfuscatedName("client.fb")
	public int inMultizone;

	@ObfuscatedName("client.gb")
	public final boolean field1235 = false;

	@ObfuscatedName("client.hb")
	public int field1236;

	@ObfuscatedName("client.ib")
	public int field1237;

	@ObfuscatedName("client.jb")
	public int field1238;

	@ObfuscatedName("client.kb")
	public int field1239;

	@ObfuscatedName("client.lb")
	public int field1240;

	@ObfuscatedName("client.mb")
	public final int field1241 = 3353893;

	@ObfuscatedName("client.nb")
	public final boolean field1242 = false;

	@ObfuscatedName("client.ob")
	public byte[][][] field1243;

	@ObfuscatedName("client.pb")
	public String field1244;

	@ObfuscatedName("client.qb")
	public String field1245;

	@ObfuscatedName("client.rb")
	public int[] field1246;

	@ObfuscatedName("client.sb")
	public int[] field1247;

	@ObfuscatedName("client.tb")
	public int[] field1248;

	@ObfuscatedName("client.ub")
	public String[] field1249 = new String[200];

	@ObfuscatedName("client.vb")
	public int field1250;

	@ObfuscatedName("client.wb")
	public int field1251 = 2;

	@ObfuscatedName("client.xb")
	public final byte field1252 = 3;

	@ObfuscatedName("client.yb")
	public int field1253;

	@ObfuscatedName("client.zb")
	public int[] field1254 = new int[4000];

	@ObfuscatedName("client.ac")
	public PixMap field1281;

	@ObfuscatedName("client.bc")
	public int field1282;

	@ObfuscatedName("client.cc")
	public long field1283;

	@ObfuscatedName("client.dc")
	public int field1284;

	@ObfuscatedName("client.ec")
	public int field1285;

	@ObfuscatedName("client.fc")
	public int field1286;

	@ObfuscatedName("client.gc")
	public int field1287;

	@ObfuscatedName("client.hc")
	public int field1288;

	@ObfuscatedName("client.ic")
	public int field1289;

	@ObfuscatedName("client.jc")
	public int field1290;

	@ObfuscatedName("client.kc")
	public Pix8 redstone1;

	@ObfuscatedName("client.lc")
	public Pix8 redstone2;

	@ObfuscatedName("client.mc")
	public Pix8 redstone3;

	@ObfuscatedName("client.nc")
	public Pix8 field1294;

	@ObfuscatedName("client.oc")
	public Pix8 field1295;

	@ObfuscatedName("client.pc")
	public static int field1296;

	@ObfuscatedName("client.qc")
	public final boolean field1297 = true;

	@ObfuscatedName("client.rc")
	public int field1298;

	@ObfuscatedName("client.sc")
	public final int[] field1299 = new int[33];

	@ObfuscatedName("client.U")
	public static final String field1223 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.W")
	public static final int[] field1225 = new int[32];

	@ObfuscatedName("client.Kc")
	public static final int field1317;

	@ObfuscatedName("client.xd")
	public static final int field1356;

	@ObfuscatedName("client.Rd")
	public static final boolean field1376;

	@ObfuscatedName("client.Re")
	public static final BigInteger field1428;

	@ObfuscatedName("client.Ef")
	public static final BigInteger field1466;

	@ObfuscatedName("client.Eg")
	public static final byte field1518;

	@ObfuscatedName("client.kh")
	public static final int[] field1550;

	@ObfuscatedName("client.Wi")
	public static final int field1640;

	@ObfuscatedName("client.ij")
	public static final int[] field1652;

	@ObfuscatedName("client.jj")
	public static int field1653;

	@ObfuscatedName("client.lj")
	public static boolean field1655;

	@ObfuscatedName("client.nj")
	public static final int[][] field1657;

	@ObfuscatedName("client.L")
	public final byte field1214 = 5;

	@ObfuscatedName("client.M")
	public final String[] field1215 = new String[5];

	@ObfuscatedName("client.N")
	public final boolean[] field1216 = new boolean[5];

	@ObfuscatedName("client.O")
	public final int field1217 = 443;

	@ObfuscatedName("client.R")
	public final int[] field1220 = new int[50];

	@ObfuscatedName("client.T")
	public final int field1222 = 477;

	@ObfuscatedName("client.X")
	public final int[] field1226 = new int[7];

	@ObfuscatedName("client.Ab")
	public int[] field1255 = new int[4000];

	@ObfuscatedName("client.Cb")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.Eb")
	public Packet out = Packet.alloc(-7939, 1);

	@ObfuscatedName("client.Fb")
	public final int[] field1260 = new int[5];

	@ObfuscatedName("client.Gb")
	public final int field1261 = -43664;

	@ObfuscatedName("client.Hb")
	public final byte field1262 = -120;

	@ObfuscatedName("client.Mb")
	public boolean field1267 = false;

	@ObfuscatedName("client.Wb")
	public final IfType field1277 = new IfType();

	@ObfuscatedName("client.tc")
	public final int[] field1300 = new int[Skill.count];

	@ObfuscatedName("client.uc")
	public final int[] field1301 = new int[9];

	@ObfuscatedName("client.yc")
	public int field1305 = 1;

	@ObfuscatedName("client.Hc")
	public boolean field1314 = false;

	@ObfuscatedName("client.Ic")
	public boolean field1315 = false;

	@ObfuscatedName("client.Lc")
	public final byte field1318 = 90;

	@ObfuscatedName("client.Mc")
	public final int[] field1319 = new int[256];

	@ObfuscatedName("client.Nc")
	public final int[] field1320 = new int[5];

	@ObfuscatedName("client.Oc")
	public boolean ingame = false;

	@ObfuscatedName("client.Pc")
	public boolean field1322 = false;

	@ObfuscatedName("client.Xc")
	public final Pix8[] field1330 = new Pix8[2];

	@ObfuscatedName("client.ad")
	public boolean field1333 = false;

	@ObfuscatedName("client.hd")
	public LinkList field1340 = new LinkList(-822);

	@ObfuscatedName("client.ld")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.nd")
	public final boolean field1346 = true;

	@ObfuscatedName("client.od")
	public int field1347 = 78;

	@ObfuscatedName("client.pd")
	public String field1348 = "";

	@ObfuscatedName("client.qd")
	public String field1349 = "";

	@ObfuscatedName("client.rd")
	public int field1350 = -1;

	@ObfuscatedName("client.sd")
	public Pix32[] hitmarks = new Pix32[20];

	@ObfuscatedName("client.yd")
	public final int field1357 = -501;

	@ObfuscatedName("client.Ad")
	public Pix32[] mapfunction = new Pix32[100];

	@ObfuscatedName("client.Cd")
	public boolean field1361 = true;

	@ObfuscatedName("client.Dd")
	public final int field1362 = 12122;

	@ObfuscatedName("client.Ed")
	public int field1363 = -1;

	@ObfuscatedName("client.Fd")
	public final int[] field1364 = new int[100];

	@ObfuscatedName("client.Gd")
	public final String[] field1365 = new String[100];

	@ObfuscatedName("client.Hd")
	public final String[] field1366 = new String[100];

	@ObfuscatedName("client.Id")
	public String field1367 = "";

	@ObfuscatedName("client.Jd")
	public Pix8[] sideicons = new Pix8[13];

	@ObfuscatedName("client.Ld")
	public final int[] field1370 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Nd")
	public final boolean field1372 = false;

	@ObfuscatedName("client.Pd")
	public final byte field1374 = 0;

	@ObfuscatedName("client.Qd")
	public final byte field1375 = 86;

	@ObfuscatedName("client.Zd")
	public final int[] field1384 = new int[5];

	@ObfuscatedName("client.ce")
	public boolean field1387 = false;

	@ObfuscatedName("client.ee")
	public final int[] field1389 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.fe")
	public final boolean field1390 = false;

	@ObfuscatedName("client.he")
	public boolean field1392 = false;

	@ObfuscatedName("client.ke")
	public final CRC32 field1395 = new CRC32();

	@ObfuscatedName("client.ne")
	public boolean field1398 = true;

	@ObfuscatedName("client.pe")
	public String field1400 = "";

	@ObfuscatedName("client.qe")
	public final int[] field1401 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.re")
	public int[][] field1402 = new int[104][104];

	@ObfuscatedName("client.te")
	public int[] field1404 = new int[1000];

	@ObfuscatedName("client.ue")
	public int[] field1405 = new int[1000];

	@ObfuscatedName("client.De")
	public final int[] field1414 = new int[5];

	@ObfuscatedName("client.Ee")
	public int field1415 = -1;

	@ObfuscatedName("client.Fe")
	public int field1416 = -1;

	@ObfuscatedName("client.Ge")
	public Pix32[] headicons = new Pix32[20];

	@ObfuscatedName("client.He")
	public final boolean field1418 = false;

	@ObfuscatedName("client.Ie")
	public final int field1419 = 833;

	@ObfuscatedName("client.Me")
	public final int field1423 = 5063219;

	@ObfuscatedName("client.Ne")
	public boolean field1424 = false;

	@ObfuscatedName("client.Oe")
	public String field1425 = "";

	@ObfuscatedName("client.Qe")
	public int chatComId = -1;

	@ObfuscatedName("client.Se")
	public int sideTab = 3;

	@ObfuscatedName("client.Te")
	public final byte field1430 = 9;

	@ObfuscatedName("client.We")
	public boolean field1433 = false;

	@ObfuscatedName("client.Xe")
	public Pix8[] mapscene = new Pix8[100];

	@ObfuscatedName("client.Ye")
	public String field1435 = "";

	@ObfuscatedName("client.Ze")
	public int[][] field1436 = new int[104][104];

	@ObfuscatedName("client.df")
	public boolean field1440 = false;

	@ObfuscatedName("client.kf")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.mf")
	public final byte field1448 = -123;

	@ObfuscatedName("client.nf")
	public final int field1449 = 436;

	@ObfuscatedName("client.of")
	public final byte field1450 = 111;

	@ObfuscatedName("client.pf")
	public boolean field1451 = false;

	@ObfuscatedName("client.qf")
	public final int field1452 = -593;

	@ObfuscatedName("client.rf")
	public int mainModalId = -1;

	@ObfuscatedName("client.Cf")
	public final int[] field1464 = new int[50];

	@ObfuscatedName("client.Hf")
	public boolean field1469 = false;

	@ObfuscatedName("client.If")
	public final int[] field1470 = new int[33];

	@ObfuscatedName("client.Tf")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Vf")
	public final int field1483 = 100;

	@ObfuscatedName("client.Wf")
	public final int[] field1484 = new int[100];

	@ObfuscatedName("client.Xf")
	public boolean midiActive = true;

	@ObfuscatedName("client.Yf")
	public final byte field1486 = 7;

	@ObfuscatedName("client.Zf")
	public final byte field1487 = 6;

	@ObfuscatedName("client.bg")
	public int[] field1489 = new int[200];

	@ObfuscatedName("client.ig")
	public boolean field1496 = true;

	@ObfuscatedName("client.jg")
	public int field1497 = -1;

	@ObfuscatedName("client.lg")
	public final int[] field1499 = new int[50];

	@ObfuscatedName("client.mg")
	public int[][] field1500 = new int[104][104];

	@ObfuscatedName("client.pg")
	public final byte field1503 = -44;

	@ObfuscatedName("client.qg")
	public byte[] field1504 = new byte[16384];

	@ObfuscatedName("client.rg")
	public final int[] field1505 = new int[5];

	@ObfuscatedName("client.tg")
	public final int field1507 = 50;

	@ObfuscatedName("client.ug")
	public final int[] field1508 = new int[this.field1507];

	@ObfuscatedName("client.vg")
	public final int[] field1509 = new int[this.field1507];

	@ObfuscatedName("client.wg")
	public final int[] field1510 = new int[this.field1507];

	@ObfuscatedName("client.xg")
	public final int[] field1511 = new int[this.field1507];

	@ObfuscatedName("client.yg")
	public final int[] field1512 = new int[this.field1507];

	@ObfuscatedName("client.zg")
	public final int[] field1513 = new int[this.field1507];

	@ObfuscatedName("client.Ag")
	public final int[] field1514 = new int[this.field1507];

	@ObfuscatedName("client.Bg")
	public final String[] field1515 = new String[this.field1507];

	@ObfuscatedName("client.Fg")
	public int mainOverlayId = -1;

	@ObfuscatedName("client.Gg")
	public boolean dialogInputOpen = false;

	@ObfuscatedName("client.Hg")
	public CollisionMap[] field1521 = new CollisionMap[4];

	@ObfuscatedName("client.Ig")
	public Packet field1522 = Packet.alloc(-7939, 1);

	@ObfuscatedName("client.Jg")
	public int[] field1523 = new int[2000];

	@ObfuscatedName("client.Lg")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Mg")
	public int tutComId = -1;

	@ObfuscatedName("client.Pg")
	public int field1529 = 5;

	@ObfuscatedName("client.Qg")
	public String[] field1530 = new String[500];

	@ObfuscatedName("client.Tg")
	public final byte field1533 = 86;

	@ObfuscatedName("client.Ug")
	public final int field1534 = 2048;

	@ObfuscatedName("client.Vg")
	public final int field1535 = 2047;

	@ObfuscatedName("client.Wg")
	public ClientPlayer[] field1536 = new ClientPlayer[this.field1534];

	@ObfuscatedName("client.Yg")
	public int[] field1538 = new int[this.field1534];

	@ObfuscatedName("client.ah")
	public int[] field1540 = new int[this.field1534];

	@ObfuscatedName("client.bh")
	public Packet[] field1541 = new Packet[this.field1534];

	@ObfuscatedName("client.eh")
	public boolean field1544 = false;

	@ObfuscatedName("client.hh")
	public int field1547 = -1;

	@ObfuscatedName("client.lh")
	public Packet in = Packet.alloc(-7939, 1);

	@ObfuscatedName("client.mh")
	public final int[] field1552 = new int[151];

	@ObfuscatedName("client.rh")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.wh")
	public boolean field1562 = false;

	@ObfuscatedName("client.xh")
	public String field1563 = "";

	@ObfuscatedName("client.yh")
	public String field1564 = "";

	@ObfuscatedName("client.zh")
	public final boolean field1565 = true;

	@ObfuscatedName("client.Ah")
	public final int[] field1566 = new int[151];

	@ObfuscatedName("client.Ch")
	public final boolean field1568 = true;

	@ObfuscatedName("client.Dh")
	public final int[] field1569 = new int[Skill.count];

	@ObfuscatedName("client.Gh")
	public LinkList field1572 = new LinkList(-822);

	@ObfuscatedName("client.Ih")
	public final int field1574 = 2301979;

	@ObfuscatedName("client.Jh")
	public long[] field1575 = new long[200];

	@ObfuscatedName("client.Lh")
	public final boolean[] field1577 = new boolean[5];

	@ObfuscatedName("client.Sh")
	public boolean resumedPauseButton = false;

	@ObfuscatedName("client.Th")
	public boolean field1585 = false;

	@ObfuscatedName("client.Vh")
	public int field1587 = 1;

	@ObfuscatedName("client.Wh")
	public final int[] field1588 = new int[2000];

	@ObfuscatedName("client.Xh")
	public int field1589 = -1;

	@ObfuscatedName("client.Yh")
	public boolean field1590 = false;

	@ObfuscatedName("client.Zh")
	public boolean field1591 = false;

	@ObfuscatedName("client.ai")
	public final int field1592 = -48671;

	@ObfuscatedName("client.bi")
	public final int field1593 = 7759444;

	@ObfuscatedName("client.gi")
	public String field1598 = "";

	@ObfuscatedName("client.ii")
	public boolean midiFading = true;

	@ObfuscatedName("client.pi")
	public int[] field1607 = new int[500];

	@ObfuscatedName("client.qi")
	public int[] field1608 = new int[500];

	@ObfuscatedName("client.ri")
	public int[] field1609 = new int[500];

	@ObfuscatedName("client.si")
	public int[] field1610 = new int[500];

	@ObfuscatedName("client.Ci")
	public Pix32[] field1620 = new Pix32[1000];

	@ObfuscatedName("client.Di")
	public int field1621 = 128;

	@ObfuscatedName("client.Hi")
	public final int field1625 = 814;

	@ObfuscatedName("client.Ni")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.Oi")
	public int sideModalId = -1;

	@ObfuscatedName("client.Qi")
	public int field1634 = 2;

	@ObfuscatedName("client.Xi")
	public final FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Yi")
	public final boolean field1642 = true;

	@ObfuscatedName("client.aj")
	public LinkList field1644 = new LinkList(-822);

	@ObfuscatedName("client.oj")
	public int field1658 = -1;

	@ObfuscatedName("client.tj")
	public int field1663 = 2;

	@ObfuscatedName("client.vj")
	public boolean field1665 = false;

	@ObfuscatedName("client.xj")
	public final byte field1667 = -111;

	@ObfuscatedName("client.zj")
	public final int[] field1669 = new int[Skill.count];

	@ObfuscatedName("client.Fj")
	public ClientNpc[] field1675 = new ClientNpc[16384];

	@ObfuscatedName("client.Hj")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.Ij")
	public final boolean field1678 = false;

	@ObfuscatedName("client.Lj")
	public boolean field1681 = false;

	@ObfuscatedName("client.K")
	public int field1213;

	@ObfuscatedName("client.P")
	public static int field1218;

	@ObfuscatedName("client.Q")
	public int field1219;

	@ObfuscatedName("client.S")
	public int field1221;

	@ObfuscatedName("client.V")
	public int field1224;

	@ObfuscatedName("client.Y")
	public int field1227;

	@ObfuscatedName("client.Z")
	public int field1228;

	@ObfuscatedName("client.Bb")
	public int runenergy;

	@ObfuscatedName("client.Db")
	public static int field1258;

	@ObfuscatedName("client.Ib")
	public int field1263;

	@ObfuscatedName("client.Jb")
	public int field1264;

	@ObfuscatedName("client.Kb")
	public int field1265;

	@ObfuscatedName("client.Lb")
	public int field1266;

	@ObfuscatedName("client.wc")
	public int field1303;

	@ObfuscatedName("client.xc")
	public int field1304;

	@ObfuscatedName("client.zc")
	public int field1306;

	@ObfuscatedName("client.Cc")
	public int field1309;

	@ObfuscatedName("client.Dc")
	public int field1310;

	@ObfuscatedName("client.Ec")
	public int field1311;

	@ObfuscatedName("client.Fc")
	public int field1312;

	@ObfuscatedName("client.Gc")
	public int field1313;

	@ObfuscatedName("client.Jc")
	public static int field1316;

	@ObfuscatedName("client.Qc")
	public int field1323;

	@ObfuscatedName("client.Rc")
	public int field1324;

	@ObfuscatedName("client.Sc")
	public int field1325;

	@ObfuscatedName("client.Tc")
	public int field1326;

	@ObfuscatedName("client.Uc")
	public int field1327;

	@ObfuscatedName("client.Vc")
	public int field1328;

	@ObfuscatedName("client.Wc")
	public int field1329;

	@ObfuscatedName("client.Zc")
	public int field1332;

	@ObfuscatedName("client.bd")
	public int field1334;

	@ObfuscatedName("client.cd")
	public int field1335;

	@ObfuscatedName("client.dd")
	public int field1336;

	@ObfuscatedName("client.ed")
	public int runweight;

	@ObfuscatedName("client.fd")
	public int field1338;

	@ObfuscatedName("client.gd")
	public int field1339;

	@ObfuscatedName("client.id")
	public int field1341;

	@ObfuscatedName("client.kd")
	public int nextMusicDelay;

	@ObfuscatedName("client.md")
	public int field1345;

	@ObfuscatedName("client.Md")
	public int field1371;

	@ObfuscatedName("client.Sd")
	public int field1377;

	@ObfuscatedName("client.Td")
	public int field1378;

	@ObfuscatedName("client.Ud")
	public int field1379;

	@ObfuscatedName("client.Xd")
	public int field1382;

	@ObfuscatedName("client.Yd")
	public int field1383;

	@ObfuscatedName("client.ae")
	public static int field1385;

	@ObfuscatedName("client.be")
	public int field1386;

	@ObfuscatedName("client.de")
	public int field1388;

	@ObfuscatedName("client.ge")
	public int field1391;

	@ObfuscatedName("client.le")
	public int field1396;

	@ObfuscatedName("client.me")
	public static int field1397;

	@ObfuscatedName("client.oe")
	public int field1399;

	@ObfuscatedName("client.se")
	public int field1403;

	@ObfuscatedName("client.ye")
	public int field1409;

	@ObfuscatedName("client.ze")
	public int field1410;

	@ObfuscatedName("client.Ae")
	public int field1411;

	@ObfuscatedName("client.Be")
	public static int field1412;

	@ObfuscatedName("client.Ce")
	public static int field1413;

	@ObfuscatedName("client.Ke")
	public int field1421;

	@ObfuscatedName("client.Le")
	public int field1422;

	@ObfuscatedName("client.Pe")
	public int field1426;

	@ObfuscatedName("client.Ve")
	public int field1432;

	@ObfuscatedName("client.af")
	public int field1437;

	@ObfuscatedName("client.bf")
	public int field1438;

	@ObfuscatedName("client.cf")
	public int field1439;

	@ObfuscatedName("client.ef")
	public int minimapFlagX;

	@ObfuscatedName("client.ff")
	public int field1442;

	@ObfuscatedName("client.hf")
	public static int field1444;

	@ObfuscatedName("client.jf")
	public int field1445;

	@ObfuscatedName("client.lf")
	public int minimapState;

	@ObfuscatedName("client.sf")
	public static int field1454;

	@ObfuscatedName("client.Df")
	public int field1465;

	@ObfuscatedName("client.Ff")
	public int field1467;

	@ObfuscatedName("client.Gf")
	public static int field1468;

	@ObfuscatedName("client.Jf")
	public int field1471;

	@ObfuscatedName("client.Kf")
	public int field1472;

	@ObfuscatedName("client.Lf")
	public int field1473;

	@ObfuscatedName("client.Mf")
	public int field1474;

	@ObfuscatedName("client.Pf")
	public int field1477;

	@ObfuscatedName("client.Qf")
	public int field1478;

	@ObfuscatedName("client.Rf")
	public int field1479;

	@ObfuscatedName("client.Sf")
	public int entityRemovalCount;

	@ObfuscatedName("client.Uf")
	public int field1482;

	@ObfuscatedName("client.ag")
	public int field1488;

	@ObfuscatedName("client.cg")
	public int field1490;

	@ObfuscatedName("client.kg")
	public int field1498;

	@ObfuscatedName("client.og")
	public int field1502;

	@ObfuscatedName("client.sg")
	public int field1506;

	@ObfuscatedName("client.Cg")
	public int field1516;

	@ObfuscatedName("client.Dg")
	public static int field1517;

	@ObfuscatedName("client.Rg")
	public int field1531;

	@ObfuscatedName("client.Sg")
	public int field1532;

	@ObfuscatedName("client.Xg")
	public int field1537;

	@ObfuscatedName("client.Zg")
	public int field1539;

	@ObfuscatedName("client.fh")
	public int field1545;

	@ObfuscatedName("client.gh")
	public int field1546;

	@ObfuscatedName("client.ih")
	public static int field1548;

	@ObfuscatedName("client.jh")
	public int field1549;

	@ObfuscatedName("client.oh")
	public int ptype0;

	@ObfuscatedName("client.ph")
	public int ptype1;

	@ObfuscatedName("client.qh")
	public int ptype2;

	@ObfuscatedName("client.sh")
	public int field1558;

	@ObfuscatedName("client.th")
	public int field1559;

	@ObfuscatedName("client.uh")
	public int field1560;

	@ObfuscatedName("client.vh")
	public int field1561;

	@ObfuscatedName("client.Bh")
	public static int field1567;

	@ObfuscatedName("client.Hh")
	public static int field1573;

	@ObfuscatedName("client.Mh")
	public int field1578;

	@ObfuscatedName("client.Nh")
	public int field1579;

	@ObfuscatedName("client.Oh")
	public int field1580;

	@ObfuscatedName("client.Ph")
	public int field1581;

	@ObfuscatedName("client.Qh")
	public int field1582;

	@ObfuscatedName("client.Uh")
	public int field1586;

	@ObfuscatedName("client.fi")
	public int field1597;

	@ObfuscatedName("client.hi")
	public int midiSong;

	@ObfuscatedName("client.ji")
	public int field1601;

	@ObfuscatedName("client.ki")
	public int field1602;

	@ObfuscatedName("client.ti")
	public static int field1611;

	@ObfuscatedName("client.ui")
	public int field1612;

	@ObfuscatedName("client.vi")
	public int field1613;

	@ObfuscatedName("client.wi")
	public int field1614;

	@ObfuscatedName("client.yi")
	public int field1616;

	@ObfuscatedName("client.Ei")
	public int field1622;

	@ObfuscatedName("client.Fi")
	public int field1623;

	@ObfuscatedName("client.Gi")
	public int field1624;

	@ObfuscatedName("client.Pi")
	public int field1633;

	@ObfuscatedName("client.Ri")
	public int psize;

	@ObfuscatedName("client.Si")
	public int ptype;

	@ObfuscatedName("client.Ti")
	public int field1637;

	@ObfuscatedName("client.Ui")
	public int field1638;

	@ObfuscatedName("client.Vi")
	public int field1639;

	@ObfuscatedName("client.Zi")
	public static int field1643;

	@ObfuscatedName("client.ej")
	public static int field1648;

	@ObfuscatedName("client.fj")
	public int field1649;

	@ObfuscatedName("client.gj")
	public int field1650;

	@ObfuscatedName("client.hj")
	public static int field1651;

	@ObfuscatedName("client.kj")
	public static int portOff;

	@ObfuscatedName("client.sj")
	public int field1662;

	@ObfuscatedName("client.uj")
	public int field1664;

	@ObfuscatedName("client.wj")
	public int field1666;

	@ObfuscatedName("client.Aj")
	public int field1670;

	@ObfuscatedName("client.Bj")
	public int field1671;

	@ObfuscatedName("client.Cj")
	public int field1672;

	@ObfuscatedName("client.Dj")
	public int field1673;

	@ObfuscatedName("client.Ej")
	public int field1674;

	@ObfuscatedName("client.Gj")
	public int npcCount;

	@ObfuscatedName("client.hg")
	public long field1495;

	@ObfuscatedName("client.dh")
	public long field1543;

	@ObfuscatedName("client.cj")
	public long field1646;

	@ObfuscatedName("client.dj")
	public long field1647;

	@ObfuscatedName("client.Yc")
	public World field1331;

	@ObfuscatedName("client.yj")
	public static ClientPlayer field1668;

	@ObfuscatedName("client.Ac")
	public Pix32 field1307;

	@ObfuscatedName("client.Bc")
	public Pix32 field1308;

	@ObfuscatedName("client.Vd")
	public Pix32 mapmarker0;

	@ObfuscatedName("client.Wd")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.gf")
	public Pix32 field1443;

	@ObfuscatedName("client.Nf")
	public Pix32 field1475;

	@ObfuscatedName("client.Of")
	public Pix32 field1476;

	@ObfuscatedName("client.ng")
	public Pix32 compass;

	@ObfuscatedName("client.ch")
	public Pix32 mapedge;

	@ObfuscatedName("client.li")
	public Pix32 mapdots0;

	@ObfuscatedName("client.mi")
	public Pix32 mapdots1;

	@ObfuscatedName("client.ni")
	public Pix32 mapdots2;

	@ObfuscatedName("client.oi")
	public Pix32 mapdots3;

	@ObfuscatedName("client.Eh")
	public Pix8 scrollbar0;

	@ObfuscatedName("client.Fh")
	public Pix8 scrollbar1;

	@ObfuscatedName("client.ci")
	public Pix8 backbase1;

	@ObfuscatedName("client.di")
	public Pix8 backbase2;

	@ObfuscatedName("client.ei")
	public Pix8 backhmid1;

	@ObfuscatedName("client.zi")
	public Pix8 invback;

	@ObfuscatedName("client.Ai")
	public Pix8 mapback;

	@ObfuscatedName("client.Bi")
	public Pix8 chatback;

	@ObfuscatedName("client.Ii")
	public Pix8 field1626;

	@ObfuscatedName("client.Ji")
	public Pix8 field1627;

	@ObfuscatedName("client.Ki")
	public Pix8 field1628;

	@ObfuscatedName("client.Li")
	public Pix8 field1629;

	@ObfuscatedName("client.Mi")
	public Pix8 field1630;

	@ObfuscatedName("client.Jj")
	public Pix8 field1679;

	@ObfuscatedName("client.Kj")
	public Pix8 field1680;

	@ObfuscatedName("client.dg")
	public PixFont field1491;

	@ObfuscatedName("client.eg")
	public PixFont field1492;

	@ObfuscatedName("client.fg")
	public PixFont field1493;

	@ObfuscatedName("client.gg")
	public PixFont field1494;

	@ObfuscatedName("client.Nb")
	public PixMap field1268;

	@ObfuscatedName("client.Ob")
	public PixMap field1269;

	@ObfuscatedName("client.Pb")
	public PixMap field1270;

	@ObfuscatedName("client.Qb")
	public PixMap field1271;

	@ObfuscatedName("client.Rb")
	public PixMap field1272;

	@ObfuscatedName("client.Sb")
	public PixMap field1273;

	@ObfuscatedName("client.Tb")
	public PixMap field1274;

	@ObfuscatedName("client.Ub")
	public PixMap field1275;

	@ObfuscatedName("client.Vb")
	public PixMap field1276;

	@ObfuscatedName("client.Xb")
	public PixMap field1278;

	@ObfuscatedName("client.Yb")
	public PixMap field1279;

	@ObfuscatedName("client.Zb")
	public PixMap field1280;

	@ObfuscatedName("client.ve")
	public PixMap field1406;

	@ObfuscatedName("client.we")
	public PixMap field1407;

	@ObfuscatedName("client.xe")
	public PixMap field1408;

	@ObfuscatedName("client.tf")
	public PixMap field1455;

	@ObfuscatedName("client.uf")
	public PixMap field1456;

	@ObfuscatedName("client.vf")
	public PixMap field1457;

	@ObfuscatedName("client.wf")
	public PixMap field1458;

	@ObfuscatedName("client.xf")
	public PixMap field1459;

	@ObfuscatedName("client.yf")
	public PixMap field1460;

	@ObfuscatedName("client.zf")
	public PixMap field1461;

	@ObfuscatedName("client.Af")
	public PixMap field1462;

	@ObfuscatedName("client.Bf")
	public PixMap field1463;

	@ObfuscatedName("client.Ue")
	public OnDemand onDemand;

	@ObfuscatedName("client.Bd")
	public Isaac randomIn;

	@ObfuscatedName("client.zd")
	public JagFile field1358;

	@ObfuscatedName("client.Kh")
	public MouseTracking field1576;

	@ObfuscatedName("client.Kg")
	public ClientStream stream;

	@ObfuscatedName("client.xi")
	public String field1615;

	@ObfuscatedName("client.Je")
	public Socket field1420;

	@ObfuscatedName("client.jd")
	public static boolean field1342;

	@ObfuscatedName("client.Rh")
	public static boolean field1583;

	@ObfuscatedName("client.mj")
	public static boolean lowMem;

	@ObfuscatedName("client.td")
	public int[] field1352;

	@ObfuscatedName("client.ud")
	public int[] field1353;

	@ObfuscatedName("client.vd")
	public int[] field1354;

	@ObfuscatedName("client.wd")
	public int[] field1355;

	@ObfuscatedName("client.ie")
	public int[] field1393;

	@ObfuscatedName("client.je")
	public int[] field1394;

	@ObfuscatedName("client.Ng")
	public int[] field1527;

	@ObfuscatedName("client.Og")
	public int[] field1528;

	@ObfuscatedName("client.pj")
	public int[] field1659;

	@ObfuscatedName("client.qj")
	public int[] field1660;

	@ObfuscatedName("client.rj")
	public int[] field1661;

	@ObfuscatedName("client.bj")
	public Pix8[] field1645;

	@ObfuscatedName("client.vc")
	public byte[][] field1302;

	@ObfuscatedName("client.Kd")
	public byte[][] field1369;

	@ObfuscatedName("client.Od")
	public int[][][] field1373;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1225[var1] = var0 - 1;
			var0 += var0;
		}
		field1317 = -303;
		field1356 = 2;
		field1376 = true;
		field1428 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		field1466 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		field1518 = 7;
		field1550 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		field1640 = -39788;
		field1652 = new int[99];
		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1652[var3] = var2 / 4;
		}
		field1653 = 10;
		field1655 = true;
		field1657 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	public static void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 274);
			if (arg0.length == 5) {
				field1653 = Integer.parseInt(arg0[0]);
				portOff = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method462();
				} else if (arg0[2].equals("highmem")) {
					method481();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					field1655 = false;
				} else if (arg0[3].equals("members")) {
					field1655 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.method1(false, 765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public static void method462() {
		World.field282 = true;
		Pix3D.lowMem = true;
		lowMem = true;
		ClientBuild.field42 = true;
	}

	@ObfuscatedName("client.t(I)V")
	public static void method481() {
		World.field282 = false;
		Pix3D.lowMem = false;
		lowMem = false;
		ClientBuild.field42 = false;
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static String method485(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return "@red@";
		} else if (var2 < -6) {
			return "@or3@";
		} else if (var2 < -3) {
			return "@or2@";
		} else if (var2 < 0) {
			return "@or1@";
		} else if (var2 > 9) {
			return "@gre@";
		} else if (var2 > 6) {
			return "@gr3@";
		} else if (var2 > 3) {
			return "@gr2@";
		} else if (var2 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public static String method505(int arg0, boolean arg1) {
		String var2 = String.valueOf(arg0);
		if (arg1) {
			throw new NullPointerException();
		}
		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + "," + var2.substring(var3);
		}
		if (var2.length() > 8) {
			var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
		} else if (var2.length() > 4) {
			var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
		}
		return " " + var2;
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static String method518(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		} else if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		} else {
			return arg0 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public boolean animateInterface(int arg0, int arg1) {
		boolean var3 = false;
		IfType var4 = IfType.list[arg1];
		for (int var5 = 0; var5 < var4.field90.length && var4.field90[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.field90[var5]];
			if (var6.field75 == 1) {
				var3 |= this.animateInterface(arg0, var6.field73);
			}
			if (var6.field75 == 6 && (var6.modelAnim != -1 || var6.modelAnim2 != -1)) {
				boolean var7 = this.method542(var6);
				int var8;
				if (var7) {
					var8 = var6.modelAnim2;
				} else {
					var8 = var6.modelAnim;
				}
				if (var8 != -1) {
					SeqType var9 = SeqType.list[var8];
					var6.field72 += arg0;
					while (var6.field72 > var9.getDelay(var6.field71)) {
						var6.field72 -= var9.getDelay(var6.field71) + 1;
						var6.field71++;
						if (var6.field71 >= var9.numFrames) {
							var6.field71 -= var9.loops;
							if (var6.field71 < 0 || var6.field71 >= var9.numFrames) {
								var6.field71 = 0;
							}
						}
						var3 = true;
					}
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("client.e(I)V")
	public void method423() {
		int var1 = this.field1671;
		int var2 = this.field1672;
		int var3 = this.field1673;
		int var4 = this.field1674;
		Pix2D.fillRect(var4, 6116423, var3, var1, var2);
		Pix2D.fillRect(16, 0, var3 - 2, var1 + 1, var2 + 1);
		Pix2D.drawRect(var3 - 2, 0, var4 - 19, var1 + 1, var2 + 18);
		this.field1493.drawString(var1 + 3, "Choose Option", 6116423, var2 + 14);
		int var5 = super.mouseX;
		int var6 = super.mouseY;
		if (this.field1670 == 0) {
			var5 -= 4;
			var6 -= 4;
		}
		if (this.field1670 == 1) {
			var5 -= 553;
			var6 -= 205;
		}
		if (this.field1670 == 2) {
			var5 -= 17;
			var6 -= 357;
		}
		for (int var7 = 0; var7 < this.field1396; var7++) {
			int var8 = var2 + (this.field1396 - 1 - var7) * 15 + 31;
			int var9 = 16777215;
			if (var5 > var1 && var5 < var1 + var3 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}
			this.field1493.drawStringTag(this.field1530[var7], this.field1449, true, var8, var1 + 3, var9);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void method424(int arg0) {
		if (this.field1455 != null) {
			return;
		}
		super.field15 = null;
		this.field1281 = null;
		this.field1279 = null;
		this.field1278 = null;
		this.field1280 = null;
		this.field1406 = null;
		this.field1407 = null;
		this.field1408 = null;
		this.field1458 = new PixMap(265, field1356, 128, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1459 = new PixMap(265, field1356, 128, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1455 = new PixMap(171, field1356, 509, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1456 = new PixMap(132, field1356, 360, this.getBaseComponent(field1518));
		Pix2D.cls();
		if (arg0 != -43664) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		this.field1457 = new PixMap(200, field1356, 360, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1460 = new PixMap(238, field1356, 202, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1461 = new PixMap(238, field1356, 203, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1462 = new PixMap(94, field1356, 74, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1463 = new PixMap(94, field1356, 75, this.getBaseComponent(field1518));
		Pix2D.cls();
		if (this.field1358 != null) {
			this.method467();
			this.method499();
		}
		this.field1333 = true;
	}

	@ObfuscatedName("client.a(IZIIIII)V")
	public void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = Model.field599[var7];
			int var13 = Model.field600[var7];
			int var14 = var13 * 0 - arg5 * var12 >> 16;
			var11 = var12 * 0 + arg5 * var13 >> 16;
			var10 = var14;
		}
		if (var8 != 0) {
			int var15 = Model.field599[var8];
			int var16 = Model.field600[var8];
			int var17 = var11 * var15 + var16 * 0 >> 16;
			var11 = var11 * var16 - var15 * 0 >> 16;
			var9 = var17;
		}
		this.field1236 = arg3 - var9;
		this.field1237 = arg2 - var10;
		this.field1238 = arg0 - var11;
		this.field1239 = arg1;
		this.field1240 = arg4;
	}

	@ObfuscatedName("client.g(I)V")
	public void otherOverlays() {
		this.method482();
		if (this.field1561 == 1) {
			this.cross[this.field1560 / 100].plotSprite(this.field1486, this.field1558 - 8 - 4, this.field1559 - 8 - 4);
		}
		if (this.field1561 == 2) {
			this.cross[this.field1560 / 100 + 4].plotSprite(this.field1486, this.field1558 - 8 - 4, this.field1559 - 8 - 4);
			field1517++;
			if (field1517 > 57) {
				field1517 = 0;
				// ANTICHEAT_CYCLELOGIC5
				this.out.p1Enc(100);
			}
		}
		if (this.mainOverlayId != -1) {
			this.animateInterface(this.field1391, this.mainOverlayId);
			this.drawInterface(0, IfType.list[this.mainOverlayId], 0, 0);
		}
		if (this.mainModalId != -1) {
			this.animateInterface(this.field1391, this.mainModalId);
			this.drawInterface(0, IfType.list[this.mainModalId], 0, 0);
		}
		this.getSpecialArea();
		if (!this.field1267) {
			this.method476();
			this.method439();
		} else if (this.field1670 == 0) {
			this.method423();
		}
		if (this.inMultizone == 1) {
			this.headicons[1].plotSprite(this.field1486, 472, 296);
		}
		if (this.field1219 != 0) {
			int var1 = this.field1219 / 50;
			int var2 = var1 / 60;
			int var3 = var1 % 60;
			if (var3 < 10) {
				this.field1492.drawString(4, "System update in: " + var2 + ":0" + var3, 16776960, 329);
			} else {
				this.field1492.drawString(4, "System update in: " + var2 + ":" + var3, 16776960, 329);
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public void method427() {
		try {
			this.field1350 = -1;
			this.field1340.clear();
			this.field1572.clear();
			Pix3D.clearTexels();
			this.method533();
			this.field1331.method50();
			for (int var1 = 0; var1 < 4; var1++) {
				this.field1521[var1].method352();
			}
			System.gc();
			ClientBuild var2 = new ClientBuild(104, this.field1373, 104, -127, this.field1243);
			int var3 = this.field1302.length;
			ClientBuild.field42 = World.field282;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = this.field1246[var4] >> 8;
				int var6 = this.field1246[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					ClientBuild.field42 = false;
				}
			}
			if (ClientBuild.field42) {
				this.field1331.method51(this.field1478);
			} else {
				this.field1331.method51(0);
			}
			// NO_TIMEOUT
			this.out.p1Enc(120);
			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (this.field1246[var7] >> 8) * 64 - this.field1471;
				int var9 = (this.field1246[var7] & 0xFF) * 64 - this.field1472;
				byte[] var10 = this.field1302[var7];
				if (var10 != null) {
					var2.method15((this.field1338 - 6) * 8, var10, var9, (this.field1339 - 6) * 8, var8);
				}
			}
			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (this.field1246[var11] >> 8) * 64 - this.field1471;
				int var13 = (this.field1246[var11] & 0xFF) * 64 - this.field1472;
				byte[] var14 = this.field1302[var11];
				if (var14 == null && this.field1339 < 800) {
					var2.method14(var13, var12);
				}
			}
			// NO_TIMEOUT
			this.out.p1Enc(120);
			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = this.field1369[var15];
				if (var16 != null) {
					int var17 = (this.field1246[var15] >> 8) * 64 - this.field1471;
					int var18 = (this.field1246[var15] & 0xFF) * 64 - this.field1472;
					var2.method18(var18, var16, this.field1331, var17, this.field1521);
				}
			}
			// NO_TIMEOUT
			this.out.p1Enc(120);
			var2.method20(this.field1521, this.field1331);
			this.field1280.setPixels(field1376);
			// NO_TIMEOUT
			this.out.p1Enc(120);
			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					this.method460(var19, var20);
				}
			}
			this.method497();
		} catch (Exception var33) {
		}
		LocType.mc1.clear();
		if (lowMem && signlink.cache_dat != null) {
			int var22 = this.onDemand.getFileCount(field1651, 0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.onDemand.getModelUse(var23);
				if ((var24 & 0x79) == 0) {
					Model.method124(var23);
				}
			}
		}
		System.gc();
		Pix3D.initPool();
		this.onDemand.clearPrefetches();
		int var25 = (this.field1338 - 6) / 8 - 1;
		int var26 = (this.field1338 + 6) / 8 + 1;
		int var27 = (this.field1339 - 6) / 8 - 1;
		int var28 = (this.field1339 + 6) / 8 + 1;
		if (this.field1585) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}
		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var29 == var25 || var29 == var26 || var30 == var27 || var30 == var28) {
					int var31 = this.onDemand.getMapFile(0, var29, var30);
					if (var31 != -1) {
						this.onDemand.prefetch(3, var31);
					}
					int var32 = this.onDemand.getMapFile(1, var29, var30);
					if (var32 != -1) {
						this.onDemand.prefetch(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public void method428(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.d(B)V")
	public void method429() {
		if (this.field1311 != 0) {
			return;
		}
		int var1 = super.mouseClickButton;
		if (this.field1612 == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var1 = 0;
		}
		if (!this.field1267) {
			if (var1 == 1 && this.field1396 > 0) {
				int var12 = this.field1609[this.field1396 - 1];
				if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
					int var13 = this.field1607[this.field1396 - 1];
					int var14 = this.field1608[this.field1396 - 1];
					IfType var15 = IfType.list[var14];
					if (var15.field95 || var15.field98) {
						this.field1562 = false;
						this.field1666 = 0;
						this.field1309 = var14;
						this.field1310 = var13;
						this.field1311 = 2;
						this.field1312 = super.mouseClickX;
						this.field1313 = super.mouseClickY;
						if (IfType.list[var14].field74 == this.mainModalId) {
							this.field1311 = 1;
						}
						if (IfType.list[var14].field74 == this.chatComId) {
							this.field1311 = 3;
						}
						return;
					}
				}
			}
			if (var1 == 1 && (this.field1465 == 1 || this.method473(this.field1396 - 1)) && this.field1396 > 2) {
				var1 = 2;
			}
			if (var1 == 1 && this.field1396 > 0) {
				this.method468(this.field1396 - 1);
			}
			if (var1 != 2 || this.field1396 <= 0) {
				return;
			}
			this.method503();
			return;
		}
		if (var1 != 1) {
			int var2 = super.mouseX;
			int var3 = super.mouseY;
			if (this.field1670 == 0) {
				var2 -= 4;
				var3 -= 4;
			}
			if (this.field1670 == 1) {
				var2 -= 553;
				var3 -= 205;
			}
			if (this.field1670 == 2) {
				var2 -= 17;
				var3 -= 357;
			}
			if (var2 < this.field1671 - 10 || var2 > this.field1671 + this.field1673 + 10 || var3 < this.field1672 - 10 || var3 > this.field1672 + this.field1674 + 10) {
				this.field1267 = false;
				if (this.field1670 == 1) {
					this.redrawSidebar = true;
				}
				if (this.field1670 == 2) {
					this.redrawChatback = true;
				}
			}
		}
		if (var1 == 1) {
			int var4 = this.field1671;
			int var5 = this.field1672;
			int var6 = this.field1673;
			int var7 = super.mouseClickX;
			int var8 = super.mouseClickY;
			if (this.field1670 == 0) {
				var7 -= 4;
				var8 -= 4;
			}
			if (this.field1670 == 1) {
				var7 -= 553;
				var8 -= 205;
			}
			if (this.field1670 == 2) {
				var7 -= 17;
				var8 -= 357;
			}
			int var9 = -1;
			for (int var10 = 0; var10 < this.field1396; var10++) {
				int var11 = var5 + (this.field1396 - 1 - var10) * 15 + 31;
				if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
					var9 = var10;
				}
			}
			if (var9 != -1) {
				this.method468(var9);
			}
			this.field1267 = false;
			if (this.field1670 == 1) {
				this.redrawSidebar = true;
			}
			if (this.field1670 == 2) {
				this.redrawChatback = true;
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public boolean method430(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var2 = 0; var2 < this.field1531; var2++) {
			if (arg0.equalsIgnoreCase(this.field1249[var2])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(field1668.field457);
	}

	@ObfuscatedName("client.b(I)V")
	@Override
	public void mainloop() {
		if (this.field1451 || this.field1590 || this.field1314) {
			return;
		}
		field1218++;
		if (this.ingame) {
			this.method530(this.field1529);
		} else {
			this.method495();
		}
		this.onDemandLoop();
	}

	@ObfuscatedName("client.h(I)V")
	public void onDemandLoop() {
		while (true) {
			OnDemandRequest var1 = this.onDemand.loop();
			if (var1 == null) {
				return;
			}
			if (var1.archive == 0) {
				Model.method123(var1.file, var1.data);
				if ((this.onDemand.getModelUse(var1.file) & 0x62) != 0) {
					this.redrawSidebar = true;
					if (this.chatComId != -1) {
						this.redrawChatback = true;
					}
				}
			}
			if (var1.archive == 1 && var1.data != null) {
				AnimFrame.unpack(var1.data);
			}
			if (var1.archive == 2 && var1.file == this.midiSong && var1.data != null) {
				this.method484(this.midiFading, var1.data);
			}
			if (var1.archive == 3 && this.field1545 == 1) {
				for (int var2 = 0; var2 < this.field1302.length; var2++) {
					if (this.field1247[var2] == var1.file) {
						this.field1302[var2] = var1.data;
						if (var1.data == null) {
							this.field1247[var2] = -1;
						}
						break;
					}
					if (this.field1248[var2] == var1.file) {
						this.field1369[var2] = var1.data;
						if (var1.data == null) {
							this.field1248[var2] = -1;
						}
						break;
					}
				}
			}
			if (var1.archive == 93 && this.onDemand.hasMapLocFile(var1.file)) {
				ClientBuild.method17(new Packet(var1.data, (byte) 1), this.onDemand);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public boolean method432(IfType arg0) {
		int var2 = arg0.field77;
		if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
			if (var2 >= 801) {
				var2 -= 701;
			} else if (var2 >= 701) {
				var2 -= 601;
			} else if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}
			this.field1530[this.field1396] = "Remove @whi@" + this.field1249[var2];
			this.field1609[this.field1396] = 513;
			this.field1396++;
			this.field1530[this.field1396] = "Message @whi@" + this.field1249[var2];
			this.field1609[this.field1396] = 902;
			this.field1396++;
			return true;
		} else if (var2 >= 401 && var2 <= 500) {
			this.field1530[this.field1396] = "Remove @whi@" + arg0.field109;
			this.field1609[this.field1396] = 884;
			this.field1396++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public void getNpcPosNewVis(Packet arg0, int arg1) {
		while (true) {
			if (arg0.field710 + 21 < arg1 * 8) {
				int var3 = arg0.gBit(14);
				if (var3 != 16383) {
					if (this.field1675[var3] == null) {
						this.field1675[var3] = new ClientNpc();
					}
					ClientNpc var4 = this.field1675[var3];
					this.npcIds[this.npcCount++] = var3;
					var4.field442 = field1218;
					var4.field453 = NpcType.list(arg0.gBit(11));
					var4.field401 = var4.field453.size;
					var4.field445 = var4.field453.turnspeed;
					var4.field404 = var4.field453.walkanim;
					var4.field405 = var4.field453.walkanim_b;
					var4.field406 = var4.field453.walkanim_r;
					var4.field407 = var4.field453.walkanim_l;
					var4.field402 = var4.field453.readyanim;
					int var5 = arg0.gBit(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = arg0.gBit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg0.gBit(1);
					var4.method110(field1668.field447[0] + var5, var7 == 1, field1668.field448[0] + var6);
					int var8 = arg0.gBit(1);
					if (var8 == 1) {
						this.field1540[this.field1539++] = var3;
					}
					continue;
				}
			}
			arg0.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public String method434(byte arg0, int arg1) {
		if (arg0 != this.field1375) {
			this.maininit();
		}
		return arg1 < 999999999 ? String.valueOf(arg1) : "*";
	}

	@ObfuscatedName("client.i(I)V")
	public void method435() {
		for (int var1 = 0; var1 < this.field1345; var1++) {
			if (this.field1499[var1] <= 0) {
				boolean var2 = false;
				try {
					if (this.field1464[var1] != this.field1658 || this.field1220[var1] != this.field1547) {
						Packet var3 = JagFX.generate(this.field1464[var1], this.field1220[var1]);
						if (System.currentTimeMillis() + (long) (var3.data / 22) > this.field1495 + (long) (this.field1290 / 22)) {
							this.field1290 = var3.data;
							this.field1495 = System.currentTimeMillis();
							if (this.method554(var3.pos, var3.data)) {
								this.field1658 = this.field1464[var1];
								this.field1547 = this.field1220[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!this.method454()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}
				if (var2 && this.field1499[var1] != -5) {
					this.field1499[var1] = -5;
				} else {
					this.field1345--;
					for (int var5 = var1; var5 < this.field1345; var5++) {
						this.field1464[var5] = this.field1464[var5 + 1];
						this.field1220[var5] = this.field1220[var5 + 1];
						this.field1499[var5] = this.field1499[var5 + 1];
					}
					var1--;
				}
			} else {
				int var10002 = this.field1499[var1]--;
			}
		}
		if (this.nextMusicDelay > 0) {
			this.nextMusicDelay -= 20;
			if (this.nextMusicDelay < 0) {
				this.nextMusicDelay = 0;
			}
			if (this.nextMusicDelay == 0 && this.midiActive && !lowMem) {
				this.midiSong = this.nextMidiSong;
				this.midiFading = true;
				this.onDemand.request(2, this.midiSong);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void ifAnimReset(int arg0) {
		IfType var2 = IfType.list[arg0];
		for (int var3 = 0; var3 < var2.field90.length && var2.field90[var3] != -1; var3++) {
			IfType var4 = IfType.list[var2.field90[var3]];
			if (var4.field75 == 1) {
				this.ifAnimReset(var4.field73);
			}
			var4.field71 = 0;
			var4.field72 = 0;
		}
	}

	@ObfuscatedName("client.a(Ly;II)V")
	public void method437(ClientEntity arg0, int arg1) {
		this.method438(arg0.field397, arg0.field398, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public void method438(int arg0, int arg1, int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			this.field1415 = -1;
			this.field1416 = -1;
			return;
		}
		int var4 = this.method458(arg0, arg1, this.field1478) - arg2;
		int var5 = arg0 - this.field1236;
		int var6 = var4 - this.field1237;
		int var7 = arg1 - this.field1238;
		int var8 = Model.field599[this.field1239];
		int var9 = Model.field600[this.field1239];
		int var10 = Model.field599[this.field1240];
		int var11 = Model.field600[this.field1240];
		int var12 = var7 * var10 + var5 * var11 >> 16;
		int var13 = var7 * var11 - var5 * var10 >> 16;
		int var15 = var6 * var9 - var13 * var8 >> 16;
		int var16 = var6 * var8 + var13 * var9 >> 16;
		if (var16 >= 50) {
			this.field1415 = Pix3D.originX + (var12 << 9) / var16;
			this.field1416 = Pix3D.originY + (var15 << 9) / var16;
		} else {
			this.field1415 = -1;
			this.field1416 = -1;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public void method439() {
		if (this.field1396 < 2 && this.field1227 == 0 && this.field1612 == 0) {
			return;
		}
		String var1;
		if (this.field1227 == 1 && this.field1396 < 2) {
			var1 = "Use " + this.field1231 + " with...";
		} else if (this.field1612 == 1 && this.field1396 < 2) {
			var1 = this.field1615 + "...";
		} else {
			var1 = this.field1530[this.field1396 - 1];
		}
		if (this.field1396 > 2) {
			var1 = var1 + "@whi@ / " + (this.field1396 - 2) + " more options";
		}
		this.field1493.drawStringAntiMacro(this.field1362, 4, var1, 16777215, field1218 / 1000);
	}

	@ObfuscatedName("client.a(ZZ)V")
	public void method440(boolean arg0) {
		for (int var2 = 0; var2 < this.npcCount; var2++) {
			ClientNpc var3 = this.field1675[this.npcIds[var2]];
			int var4 = (this.npcIds[var2] << 14) + 536870912;
			if (var3 != null && var3.method113() && var3.field453.alwaysontop == arg0) {
				int var5 = var3.field397 >> 7;
				int var6 = var3.field398 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field401 == 1 && (var3.field397 & 0x7F) == 64 && (var3.field398 & 0x7F) == 64) {
						if (this.field1436[var5][var6] == this.field1284) {
							continue;
						}
						this.field1436[var5][var6] = this.field1284;
					}
					this.field1331.method61(this.method458(var3.field397, var3.field398, this.field1478), var3, var3.field397, var4, var3.field398, (var3.field401 - 1) * 64 + 60, var3.field399, this.field1478, var3.field400);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLib;)V")
	public void method441(int arg0, int arg1, Pix32 arg2) {
		if (this.field1667 != -111) {
			this.field1315 = !this.field1315;
		}
		int var4 = this.field1622 + this.field1633 & 0x7FF;
		int var5 = arg1 * arg1 + arg0 * arg0;
		if (var5 > 6400) {
			return;
		}
		int var6 = Model.field599[var4];
		int var7 = Model.field600[var4];
		int var8 = var6 * 256 / (this.field1586 + 256);
		int var9 = var7 * 256 / (this.field1586 + 256);
		int var10 = arg0 * var8 + arg1 * var9 >> 16;
		int var11 = arg0 * var9 - arg1 * var8 >> 16;
		if (var5 > 2500) {
			arg2.scanlinePlotSprite(var10 + 94 + 4 - arg2.owi / 2, this.mapback, 83 - var11 - arg2.ohi / 2 - 4);
		} else {
			arg2.plotSprite(this.field1486, var10 + 94 + 4 - arg2.owi / 2, 83 - var11 - arg2.ohi / 2 - 4);
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void unload() {
		signlink.reporterror = false;
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var1) {
		}
		this.stream = null;
		this.method486();
		if (this.field1576 != null) {
			this.field1576.active = false;
		}
		this.field1576 = null;
		this.onDemand.stop();
		this.onDemand = null;
		this.out = null;
		this.field1522 = null;
		this.in = null;
		this.field1246 = null;
		this.field1302 = null;
		this.field1369 = null;
		this.field1247 = null;
		this.field1248 = null;
		this.field1373 = null;
		this.field1243 = null;
		this.field1331 = null;
		this.field1521 = null;
		this.field1402 = null;
		this.field1500 = null;
		this.field1254 = null;
		this.field1255 = null;
		this.field1504 = null;
		this.field1278 = null;
		this.field1279 = null;
		this.field1280 = null;
		this.field1281 = null;
		this.field1406 = null;
		this.field1407 = null;
		this.field1408 = null;
		this.field1268 = null;
		this.field1269 = null;
		this.field1270 = null;
		this.field1271 = null;
		this.field1272 = null;
		this.field1273 = null;
		this.field1274 = null;
		this.field1275 = null;
		this.field1276 = null;
		this.invback = null;
		this.mapback = null;
		this.chatback = null;
		this.backbase1 = null;
		this.backbase2 = null;
		this.backhmid1 = null;
		this.sideicons = null;
		this.redstone1 = null;
		this.redstone2 = null;
		this.redstone3 = null;
		this.field1294 = null;
		this.field1295 = null;
		this.field1626 = null;
		this.field1627 = null;
		this.field1628 = null;
		this.field1629 = null;
		this.field1630 = null;
		this.compass = null;
		this.hitmarks = null;
		this.headicons = null;
		this.cross = null;
		this.mapdots0 = null;
		this.mapdots1 = null;
		this.mapdots2 = null;
		this.mapdots3 = null;
		this.mapscene = null;
		this.mapfunction = null;
		this.field1436 = null;
		this.field1536 = null;
		this.field1538 = null;
		this.field1540 = null;
		this.field1541 = null;
		this.entityRemovalIds = null;
		this.field1675 = null;
		this.npcIds = null;
		this.field1232 = null;
		this.field1644 = null;
		this.field1572 = null;
		this.field1340 = null;
		this.field1607 = null;
		this.field1608 = null;
		this.field1609 = null;
		this.field1610 = null;
		this.field1530 = null;
		this.field1523 = null;
		this.field1404 = null;
		this.field1405 = null;
		this.field1620 = null;
		this.field1443 = null;
		this.field1249 = null;
		this.field1575 = null;
		this.field1489 = null;
		this.field1458 = null;
		this.field1459 = null;
		this.field1455 = null;
		this.field1456 = null;
		this.field1457 = null;
		this.field1460 = null;
		this.field1461 = null;
		this.field1462 = null;
		this.field1463 = null;
		this.method522();
		LocType.unload();
		NpcType.unload();
		ObjType.unload();
		FloType.list = null;
		IdkType.list = null;
		IfType.list = null;
		UnkType.field1120 = null;
		SeqType.list = null;
		SpotType.list = null;
		SpotType.modelCache = null;
		VarpType.list = null;
		super.field15 = null;
		ClientPlayer.field480 = null;
		Pix3D.unload();
		World.method49();
		Model.method121();
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.a(ZLd;I)I")
	public int method442(IfType arg0, int arg1) {
		if (arg0.field83 == null || arg1 >= arg0.field83.length) {
			return -2;
		}
		try {
			int[] var3 = arg0.field83[arg1];
			int var4 = 0;
			int var5 = 0;
			byte var6 = 0;
			while (true) {
				int var7 = var3[var5++];
				int var8 = 0;
				byte var9 = 0;
				if (var7 == 0) {
					return var4;
				}
				if (var7 == 1) {
					var8 = this.field1300[var3[var5++]];
				}
				if (var7 == 2) {
					var8 = this.field1569[var3[var5++]];
				}
				if (var7 == 3) {
					var8 = this.field1669[var3[var5++]];
				}
				if (var7 == 4) {
					IfType var10 = IfType.list[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ObjType.numDefinitions && (!ObjType.list(var11).members || field1655)) {
						for (int var12 = 0; var12 < var10.field69.length; var12++) {
							if (var10.field69[var12] == var11 + 1) {
								var8 += var10.field70[var12];
							}
						}
					}
				}
				if (var7 == 5) {
					var8 = this.field1523[var3[var5++]];
				}
				if (var7 == 6) {
					var8 = field1652[this.field1569[var3[var5++]] - 1];
				}
				if (var7 == 7) {
					var8 = this.field1523[var3[var5++]] * 100 / 46875;
				}
				if (var7 == 8) {
					var8 = field1668.field463;
				}
				if (var7 == 9) {
					for (int var13 = 0; var13 < Skill.count; var13++) {
						if (Skill.used[var13]) {
							var8 += this.field1569[var13];
						}
					}
				}
				if (var7 == 10) {
					IfType var14 = IfType.list[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ObjType.numDefinitions && (!ObjType.list(var15).members || field1655)) {
						for (int var16 = 0; var16 < var14.field69.length; var16++) {
							if (var14.field69[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}
				if (var7 == 11) {
					var8 = this.runenergy;
				}
				if (var7 == 12) {
					var8 = this.runweight;
				}
				if (var7 == 13) {
					int var17 = this.field1523[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 0x1 << var18) == 0 ? 0 : 1;
				}
				if (var7 == 14) {
					int var19 = var3[var5++];
					VarbitType var20 = VarbitType.list[var19];
					int var21 = var20.basevar;
					int var22 = var20.startbit;
					int var23 = var20.endbit;
					int var24 = field1225[var23 - var22];
					var8 = this.field1523[var21] >> var22 & var24;
				}
				if (var7 == 15) {
					var9 = 1;
				}
				if (var7 == 16) {
					var9 = 2;
				}
				if (var7 == 17) {
					var9 = 3;
				}
				if (var7 == 18) {
					var8 = (field1668.field397 >> 7) + this.field1471;
				}
				if (var7 == 19) {
					var8 = (field1668.field398 >> 7) + this.field1472;
				}
				if (var7 == 20) {
					var8 = var3[var5++];
				}
				if (var9 == 0) {
					if (var6 == 0) {
						var4 += var8;
					}
					if (var6 == 1) {
						var4 -= var8;
					}
					if (var6 == 2 && var8 != 0) {
						var4 /= var8;
					}
					if (var6 == 3) {
						var4 *= var8;
					}
					var6 = 0;
				} else {
					var6 = var9;
				}
			}
		} catch (Exception var25) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(BLd;)V")
	public void method443(IfType arg0) {
		int var2 = arg0.field77;
		if (this.field1448 != -123) {
			return;
		}
		if ((var2 < 1 || var2 > 100) && (var2 < 701 || var2 > 800)) {
			if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
				int var4 = this.field1531;
				if (this.field1532 != 2) {
					var4 = 0;
				}
				if (var2 > 800) {
					var2 -= 701;
				} else {
					var2 -= 101;
				}
				if (var2 >= var4) {
					arg0.field109 = "";
					arg0.field76 = 0;
				} else {
					if (this.field1489[var2] == 0) {
						arg0.field109 = "@red@Offline";
					} else if (this.field1489[var2] == field1653) {
						arg0.field109 = "@gre@World-" + (this.field1489[var2] - 9);
					} else {
						arg0.field109 = "@yel@World-" + (this.field1489[var2] - 9);
					}
					arg0.field76 = 1;
				}
			} else if (var2 == 203) {
				int var5 = this.field1531;
				if (this.field1532 != 2) {
					var5 = 0;
				}
				arg0.field87 = var5 * 15 + 20;
				if (arg0.field87 <= arg0.field79) {
					arg0.field87 = arg0.field79 + 1;
				}
			} else if (var2 >= 401 && var2 <= 500) {
				var2 -= 401;
				if (var2 >= this.field1377) {
					arg0.field109 = "";
					arg0.field76 = 0;
				} else {
					arg0.field109 = JString.toScreenName(JString.toRawUsername(this.field1233[var2]));
					arg0.field76 = 1;
				}
			} else if (var2 == 503) {
				arg0.field87 = this.field1377 * 15 + 20;
				if (arg0.field87 <= arg0.field79) {
					arg0.field87 = arg0.field79 + 1;
				}
			} else if (var2 == 327) {
				arg0.field124 = 150;
				arg0.field125 = (int) (Math.sin((double) field1218 / 40.0D) * 256.0D) & 0x7FF;
				if (this.field1387) {
					for (int var6 = 0; var6 < 7; var6++) {
						int var7 = this.field1226[var6];
						if (var7 >= 0 && !IdkType.list[var7].checkModel()) {
							return;
						}
					}
					this.field1387 = false;
					Model[] var8 = new Model[7];
					int var9 = 0;
					for (int var10 = 0; var10 < 7; var10++) {
						int var11 = this.field1226[var10];
						if (var11 >= 0) {
							var8[var9++] = IdkType.list[var11].getModelNoCheck();
						}
					}
					Model var12 = new Model(var9, -643, var8);
					for (int var13 = 0; var13 < 5; var13++) {
						if (this.field1505[var13] != 0) {
							var12.recolour(field1657[var13][0], field1657[var13][this.field1505[var13]]);
							if (var13 == 1) {
								var12.recolour(field1550[0], field1550[this.field1505[var13]]);
							}
						}
					}
					var12.prepareAnim();
					var12.animate(SeqType.list[field1668.field402].frames[0]);
					var12.calculateNormals(64, 850, -30, -50, -30, true);
					arg0.model1Type = 5;
					arg0.field118 = 0;
					IfType.method36(var12);
				}
			} else if (var2 == 324) {
				if (this.field1475 == null) {
					this.field1475 = arg0.field115;
					this.field1476 = arg0.field116;
				}
				if (this.field1398) {
					arg0.field115 = this.field1476;
				} else {
					arg0.field115 = this.field1475;
				}
			} else if (var2 == 325) {
				if (this.field1475 == null) {
					this.field1475 = arg0.field115;
					this.field1476 = arg0.field116;
				}
				if (this.field1398) {
					arg0.field115 = this.field1475;
				} else {
					arg0.field115 = this.field1476;
				}
			} else if (var2 == 600) {
				arg0.field109 = this.field1367;
				if (field1218 % 20 < 10) {
					arg0.field109 = arg0.field109 + "|";
				} else {
					arg0.field109 = arg0.field109 + " ";
				}
			} else {
				if (var2 == 613) {
					if (this.field1282 < 1) {
						arg0.field109 = "";
					} else if (this.field1544) {
						arg0.field111 = 16711680;
						arg0.field109 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.field111 = 16777215;
						arg0.field109 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var2 == 650 || var2 == 655) {
					if (this.field1386 == 0) {
						arg0.field109 = "";
					} else {
						String var14;
						if (this.field1426 == 0) {
							var14 = "earlier today";
						} else if (this.field1426 == 1) {
							var14 = "yesterday";
						} else {
							var14 = this.field1426 + " days ago";
						}
						arg0.field109 = "You last logged in " + var14 + " from: " + signlink.dns;
					}
				}
				if (var2 == 651) {
					if (this.field1303 == 0) {
						arg0.field109 = "0 unread messages";
						arg0.field111 = 16776960;
					}
					if (this.field1303 == 1) {
						arg0.field109 = "1 unread message";
						arg0.field111 = 65280;
					}
					if (this.field1303 > 1) {
						arg0.field109 = this.field1303 + " unread messages";
						arg0.field111 = 65280;
					}
				}
				if (var2 == 652) {
					if (this.field1445 == 201) {
						if (this.field1516 == 1) {
							arg0.field109 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.field109 = "";
						}
					} else if (this.field1445 == 200) {
						arg0.field109 = "You have not yet set any password recovery questions.";
					} else {
						String var15;
						if (this.field1445 == 0) {
							var15 = "Earlier today";
						} else if (this.field1445 == 1) {
							var15 = "Yesterday";
						} else {
							var15 = this.field1445 + " days ago";
						}
						arg0.field109 = var15 + " you changed your recovery questions";
					}
				}
				if (var2 == 653) {
					if (this.field1445 == 201) {
						if (this.field1516 == 1) {
							arg0.field109 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.field109 = "";
						}
					} else if (this.field1445 == 200) {
						arg0.field109 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.field109 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var2 == 654) {
					if (this.field1445 == 201) {
						if (this.field1516 == 1) {
							arg0.field109 = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg0.field109 = "";
						}
					} else if (this.field1445 == 200) {
						arg0.field109 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.field109 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} else if (var2 == 1 && this.field1532 == 0) {
			arg0.field109 = "Loading friend list";
			arg0.field76 = 0;
		} else if (var2 == 1 && this.field1532 == 1) {
			arg0.field109 = "Connecting to friendserver";
			arg0.field76 = 0;
		} else if (var2 == 2 && this.field1532 != 2) {
			arg0.field109 = "Please wait...";
			arg0.field76 = 0;
		} else {
			int var3 = this.field1531;
			if (this.field1532 != 2) {
				var3 = 0;
			}
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}
			if (var2 >= var3) {
				arg0.field109 = "";
				arg0.field76 = 0;
			} else {
				arg0.field109 = this.field1249[var2];
				arg0.field76 = 1;
			}
		}
	}

	@ObfuscatedName("client.a(IIILab;Z)V")
	public void method444(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (arg3 == field1668 || this.field1396 >= 400) {
			return;
		}
		String var5;
		if (arg3.field464 == 0) {
			var5 = arg3.field457 + method485(arg3.field463, field1668.field463) + " (level-" + arg3.field463 + ")";
		} else {
			var5 = arg3.field457 + " (skill-" + arg3.field464 + ")";
		}
		if (this.field1227 == 1) {
			this.field1530[this.field1396] = "Use " + this.field1231 + " with @whi@" + var5;
			this.field1609[this.field1396] = 275;
			this.field1610[this.field1396] = arg1;
			this.field1607[this.field1396] = arg0;
			this.field1608[this.field1396] = arg2;
			this.field1396++;
		} else if (this.field1612 != 1) {
			for (int var6 = 4; var6 >= 0; var6--) {
				if (this.field1215[var6] != null) {
					this.field1530[this.field1396] = this.field1215[var6] + " @whi@" + var5;
					short var7 = 0;
					if (this.field1215[var6].equalsIgnoreCase("attack")) {
						if (arg3.field463 > field1668.field463) {
							var7 = 2000;
						}
					} else if (this.field1216[var6]) {
						var7 = 2000;
					}
					if (var6 == 0) {
						this.field1609[this.field1396] = var7 + 639;
					}
					if (var6 == 1) {
						this.field1609[this.field1396] = var7 + 499;
					}
					if (var6 == 2) {
						this.field1609[this.field1396] = var7 + 27;
					}
					if (var6 == 3) {
						this.field1609[this.field1396] = var7 + 387;
					}
					if (var6 == 4) {
						this.field1609[this.field1396] = var7 + 185;
					}
					this.field1610[this.field1396] = arg1;
					this.field1607[this.field1396] = arg0;
					this.field1608[this.field1396] = arg2;
					this.field1396++;
				}
			}
		} else if ((this.field1614 & 0x8) == 8) {
			this.field1530[this.field1396] = this.field1615 + " @whi@" + var5;
			this.field1609[this.field1396] = 131;
			this.field1610[this.field1396] = arg1;
			this.field1607[this.field1396] = arg0;
			this.field1608[this.field1396] = arg2;
			this.field1396++;
		}
		for (int var8 = 0; var8 < this.field1396; var8++) {
			if (this.field1609[var8] == 718) {
				this.field1530[var8] = "Walk here @whi@" + var5;
				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void method445() {
		this.field1284++;
		this.method513(true);
		this.method440(true);
		this.method513(false);
		this.method440(false);
		this.method463(this.field1568);
		this.method478();
		if (!this.field1424) {
			int var1 = this.field1621;
			if (this.field1488 / 256 > var1) {
				var1 = this.field1488 / 256;
			}
			if (this.field1577[4] && this.field1320[4] + 128 > var1) {
				var1 = this.field1320[4] + 128;
			}
			int var2 = this.field1622 + this.field1304 & 0x7FF;
			this.method425(this.field1438, var1, this.method458(field1668.field397, field1668.field398, this.field1478) - 50, this.field1437, var2, var1 * 3 + 600);
		}
		int var3;
		if (this.field1424) {
			var3 = this.method529();
		} else {
			var3 = this.method528();
		}
		int var4 = this.field1236;
		int var5 = this.field1237;
		int var6 = this.field1238;
		int var7 = this.field1239;
		int var8 = this.field1240;
		for (int var9 = 0; var9 < 5; var9++) {
			if (this.field1577[var9]) {
				int var10 = (int) (Math.random() * (double) (this.field1414[var9] * 2 + 1) + Math.sin((double) this.field1384[var9] * ((double) this.field1260[var9] / 100.0D)) * (double) this.field1320[var9] - (double) this.field1414[var9]);
				if (var9 == 0) {
					this.field1236 += var10;
				}
				if (var9 == 1) {
					this.field1237 += var10;
				}
				if (var9 == 2) {
					this.field1238 += var10;
				}
				if (var9 == 3) {
					this.field1240 = this.field1240 + var10 & 0x7FF;
				}
				if (var9 == 4) {
					this.field1239 += var10;
					if (this.field1239 < 128) {
						this.field1239 = 128;
					}
					if (this.field1239 > 383) {
						this.field1239 = 383;
					}
				}
			}
		}
		int var11 = Pix3D.cycle;
		Model.field594 = true;
		Model.field597 = 0;
		Model.field595 = super.mouseX - 4;
		Model.field596 = super.mouseY - 4;
		Pix2D.cls();
		this.field1331.method89(this.field1236, this.field1238, this.field1240, this.field1237, var3, this.field1239);
		this.field1331.method64();
		this.method523();
		this.method534();
		this.method465(var11);
		this.otherOverlays();
		this.field1280.draw(4, super.graphics, 4);
		this.field1236 = var4;
		this.field1237 = var5;
		this.field1238 = var6;
		this.field1239 = var7;
		this.field1240 = var8;
	}

	@ObfuscatedName("client.b(Z)V")
	public void method446(boolean arg0) {
		if (arg0) {
			this.ptype = -1;
		}
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1383 = (this.field1383 + 1) % 4;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1Enc(154);
			this.out.p1(this.field1383);
			this.out.p1(this.field1388);
			this.out.p1(this.field1221);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1388 = (this.field1388 + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1Enc(154);
			this.out.p1(this.field1383);
			this.out.p1(this.field1388);
			this.out.p1(this.field1221);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1221 = (this.field1221 + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1Enc(154);
			this.out.p1(this.field1383);
			this.out.p1(this.field1388);
			this.out.p1(this.field1221);
		}
		if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.closeModal();
			this.field1367 = "";
			this.field1544 = false;
			for (int var2 = 0; var2 < IfType.list.length; var2++) {
				if (IfType.list[var2] != null && IfType.list[var2].field77 == 600) {
					this.field1497 = this.mainModalId = IfType.list[var2].field74;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZIIBI)Z")
	public boolean method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				this.field1402[var12][var13] = 0;
				this.field1500[var12][var13] = 99999999;
			}
		}
		int var14 = arg5;
		int var15 = arg0;
		this.field1402[arg5][arg0] = 99;
		this.field1500[arg5][arg0] = 0;
		byte var16 = 0;
		int var17 = 0;
		this.field1254[0] = arg5;
		int var33 = var16 + 1;
		this.field1255[0] = arg0;
		boolean var18 = false;
		int var19 = this.field1254.length;
		int[][] var20 = this.field1521[this.field1478].field1094;
		while (var17 != var33) {
			var14 = this.field1254[var17];
			var15 = this.field1255[var17];
			var17 = (var17 + 1) % var19;
			if (var14 == arg1 && var15 == arg9) {
				var18 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && this.field1521[this.field1478].method361(var14, arg8, arg1, arg9, arg6 - 1, var15)) {
					var18 = true;
					break;
				}
				if (arg6 < 10 && this.field1521[this.field1478].method362(arg1, arg9, var14, arg6 - 1, arg8, var15)) {
					var18 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && this.field1521[this.field1478].method363(arg1, arg2, arg4, arg9, var15, var14, arg3)) {
				var18 = true;
				break;
			}
			int var21 = this.field1500[var14][var15] + 1;
			if (var14 > 0 && this.field1402[var14 - 1][var15] == 0 && (var20[var14 - 1][var15] & 0x280108) == 0) {
				this.field1254[var33] = var14 - 1;
				this.field1255[var33] = var15;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 - 1][var15] = 2;
				this.field1500[var14 - 1][var15] = var21;
			}
			if (var14 < 103 && this.field1402[var14 + 1][var15] == 0 && (var20[var14 + 1][var15] & 0x280180) == 0) {
				this.field1254[var33] = var14 + 1;
				this.field1255[var33] = var15;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 + 1][var15] = 8;
				this.field1500[var14 + 1][var15] = var21;
			}
			if (var15 > 0 && this.field1402[var14][var15 - 1] == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				this.field1254[var33] = var14;
				this.field1255[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14][var15 - 1] = 1;
				this.field1500[var14][var15 - 1] = var21;
			}
			if (var15 < 103 && this.field1402[var14][var15 + 1] == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				this.field1254[var33] = var14;
				this.field1255[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14][var15 + 1] = 4;
				this.field1500[var14][var15 + 1] = var21;
			}
			if (var14 > 0 && var15 > 0 && this.field1402[var14 - 1][var15 - 1] == 0 && (var20[var14 - 1][var15 - 1] & 0x28010E) == 0 && (var20[var14 - 1][var15] & 0x280108) == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				this.field1254[var33] = var14 - 1;
				this.field1255[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 - 1][var15 - 1] = 3;
				this.field1500[var14 - 1][var15 - 1] = var21;
			}
			if (var14 < 103 && var15 > 0 && this.field1402[var14 + 1][var15 - 1] == 0 && (var20[var14 + 1][var15 - 1] & 0x280183) == 0 && (var20[var14 + 1][var15] & 0x280180) == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				this.field1254[var33] = var14 + 1;
				this.field1255[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 + 1][var15 - 1] = 9;
				this.field1500[var14 + 1][var15 - 1] = var21;
			}
			if (var14 > 0 && var15 < 103 && this.field1402[var14 - 1][var15 + 1] == 0 && (var20[var14 - 1][var15 + 1] & 0x280138) == 0 && (var20[var14 - 1][var15] & 0x280108) == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				this.field1254[var33] = var14 - 1;
				this.field1255[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 - 1][var15 + 1] = 6;
				this.field1500[var14 - 1][var15 + 1] = var21;
			}
			if (var14 < 103 && var15 < 103 && this.field1402[var14 + 1][var15 + 1] == 0 && (var20[var14 + 1][var15 + 1] & 0x2801E0) == 0 && (var20[var14 + 1][var15] & 0x280180) == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				this.field1254[var33] = var14 + 1;
				this.field1255[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				this.field1402[var14 + 1][var15 + 1] = 12;
				this.field1500[var14 + 1][var15 + 1] = var21;
			}
		}
		this.field1422 = 0;
		if (!var18) {
			if (arg7) {
				int var22 = 100;
				for (int var23 = 1; var23 < 2; var23++) {
					for (int var24 = arg1 - var23; var24 <= arg1 + var23; var24++) {
						for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
							if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && this.field1500[var24][var25] < var22) {
								var22 = this.field1500[var24][var25];
								var14 = var24;
								var15 = var25;
								this.field1422 = 1;
								var18 = true;
							}
						}
					}
					if (var18) {
						break;
					}
				}
			}
			if (!var18) {
				return false;
			}
		}
		byte var26 = 0;
		this.field1254[0] = var14;
		int var34 = var26 + 1;
		this.field1255[0] = var15;
		int var27;
		int var28 = var27 = this.field1402[var14][var15];
		while (var14 != arg5 || var15 != arg0) {
			if (var28 != var27) {
				var27 = var28;
				this.field1254[var34] = var14;
				this.field1255[var34++] = var15;
			}
			if ((var28 & 0x2) != 0) {
				var14++;
			} else if ((var28 & 0x8) != 0) {
				var14--;
			}
			if ((var28 & 0x1) != 0) {
				var15++;
			} else if ((var28 & 0x4) != 0) {
				var15--;
			}
			var28 = this.field1402[var14][var15];
		}
		if (var34 > 0) {
			int var29 = var34;
			if (var34 > 25) {
				var29 = 25;
			}
			var34--;
			int var30 = this.field1254[var34];
			int var31 = this.field1255[var34];
			if (arg10 == 0) {
				// MOVE_GAMECLICK
				this.out.p1Enc(207);
				this.out.p1(var29 + var29 + 3);
			}
			if (arg10 == 1) {
				// MOVE_MINIMAPCLICK
				this.out.p1Enc(86);
				this.out.p1(var29 + var29 + 3 + 14);
			}
			if (arg10 == 2) {
				// MOVE_OPCLICK
				this.out.p1Enc(138);
				this.out.p1(var29 + var29 + 3);
			}
			if (super.keyHeld[5] == 1) {
				this.out.p1(1);
			} else {
				this.out.p1(0);
			}
			this.out.p2(var30 + this.field1471);
			this.out.p2(var31 + this.field1472);
			this.minimapFlagX = this.field1254[0];
			this.field1442 = this.field1255[0];
			for (int var32 = 1; var32 < var29; var32++) {
				var34--;
				this.out.p1(this.field1254[var34] - var30);
				this.out.p1(this.field1255[var34] - var31);
			}
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOff + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ZI)V")
	public void clientVar(int arg0) {
		int var2 = VarpType.list[arg0].clientcode;
		if (var2 == 0) {
			return;
		}
		int var3 = this.field1523[arg0];
		if (var2 == 1) {
			if (var3 == 1) {
				Pix3D.initColourTable(0.9D);
			}
			if (var3 == 2) {
				Pix3D.initColourTable(0.8D);
			}
			if (var3 == 3) {
				Pix3D.initColourTable(0.7D);
			}
			if (var3 == 4) {
				Pix3D.initColourTable(0.6D);
			}
			ObjType.spriteCache.clear();
			this.field1333 = true;
		}
		if (var2 == 3) {
			boolean var4 = this.midiActive;
			if (var3 == 0) {
				this.method517(this.midiActive, 0);
				this.midiActive = true;
			}
			if (var3 == 1) {
				this.method517(this.midiActive, -400);
				this.midiActive = true;
			}
			if (var3 == 2) {
				this.method517(this.midiActive, -800);
				this.midiActive = true;
			}
			if (var3 == 3) {
				this.method517(this.midiActive, -1200);
				this.midiActive = true;
			}
			if (var3 == 4) {
				this.midiActive = false;
			}
			if (this.midiActive != var4 && !lowMem) {
				if (this.midiActive) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				} else {
					this.method486();
				}
				this.nextMusicDelay = 0;
			}
		}
		if (var2 == 4) {
			if (var3 == 0) {
				this.field1496 = true;
				this.method428(0);
			}
			if (var3 == 1) {
				this.field1496 = true;
				this.method428(-400);
			}
			if (var3 == 2) {
				this.field1496 = true;
				this.method428(-800);
			}
			if (var3 == 3) {
				this.field1496 = true;
				this.method428(-1200);
			}
			if (var3 == 4) {
				this.field1496 = false;
			}
		}
		if (var2 == 5) {
			this.field1465 = var3;
		}
		if (var2 == 6) {
			this.field1477 = var3;
		}
		if (var2 == 8) {
			this.field1490 = var3;
			this.redrawChatback = true;
		}
		if (var2 == 9) {
			this.field1298 = var3;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public void method449(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = this.field1331.method76(arg4, arg0, arg2);
		if (var6 != 0) {
			int var7 = this.field1331.method80(arg4, arg0, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}
			int[] var11 = this.field1443.data;
			int var12 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.list(var13);
			if (var14.mapscene == -1) {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}
				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			} else {
				Pix8 var15 = this.mapscene[var14.mapscene];
				if (var15 != null) {
					int var16 = (var14.width * 4 - var15.wi) / 2;
					int var17 = (var14.length * 4 - var15.hi) / 2;
					var15.plotSprite(this.field1486, arg0 * 4 + var16 + 48, (104 - arg2 - var14.length) * 4 + 48 + var17);
				}
			}
		}
		int var18 = this.field1331.method78(arg4, arg0, arg2);
		if (var18 != 0) {
			int var19 = this.field1331.method80(arg4, arg0, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.list(var22);
			if (var23.mapscene != -1) {
				Pix8 var24 = this.mapscene[var23.mapscene];
				if (var24 != null) {
					int var25 = (var23.width * 4 - var24.wi) / 2;
					int var26 = (var23.length * 4 - var24.hi) / 2;
					var24.plotSprite(this.field1486, arg0 * 4 + var25 + 48, (104 - arg2 - var23.length) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 15658734;
				if (var18 > 0) {
					var27 = 15597568;
				}
				int[] var28 = this.field1443.data;
				int var29 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
				if (var20 == 0 || var20 == 2) {
					var28[var29 + 1536] = var27;
					var28[var29 + 1024 + 1] = var27;
					var28[var29 + 512 + 2] = var27;
					var28[var29 + 3] = var27;
				} else {
					var28[var29] = var27;
					var28[var29 + 512 + 1] = var27;
					var28[var29 + 1024 + 2] = var27;
					var28[var29 + 1536 + 3] = var27;
				}
			}
		}
		int var30 = this.field1331.method79(arg4, arg0, arg2);
		if (var30 == 0) {
			return;
		}
		int var31 = var30 >> 14 & 0x7FFF;
		LocType var32 = LocType.list(var31);
		if (var32.mapscene == -1) {
			return;
		}
		Pix8 var33 = this.mapscene[var32.mapscene];
		if (var33 != null) {
			int var34 = (var32.width * 4 - var33.wi) / 2;
			int var35 = (var32.length * 4 - var33.hi) / 2;
			var33.plotSprite(this.field1486, arg0 * 4 + var34 + 48, (104 - arg2 - var32.length) * 4 + 48 + var35);
			return;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void method450() {
		if (lowMem && this.field1545 == 2 && ClientBuild.field43 != this.field1478) {
			this.field1280.setPixels(field1376);
			this.field1492.centreString(257, 151, 0, "Loading - please wait.");
			this.field1492.centreString(256, 150, 16777215, "Loading - please wait.");
			this.field1280.draw(4, super.graphics, 4);
			this.field1545 = 1;
			this.field1543 = System.currentTimeMillis();
		}
		if (this.field1545 == 1) {
			int var1 = this.method451();
			if (var1 != 0 && System.currentTimeMillis() - this.field1543 > 360000L) {
				signlink.reporterror(this.field1563 + " glcfb " + this.field1647 + "," + var1 + "," + lowMem + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.field1478 + "," + this.field1338 + "," + this.field1339);
				this.field1543 = System.currentTimeMillis();
			}
		}
		if (this.field1545 == 2 && this.field1478 != this.field1350) {
			this.field1350 = this.field1478;
			this.method487(this.field1478);
		}
	}

	@ObfuscatedName("client.e(B)I")
	public int method451() {
		for (int var1 = 0; var1 < this.field1302.length; var1++) {
			if (this.field1302[var1] == null && this.field1247[var1] != -1) {
				return -1;
			}
			if (this.field1369[var1] == null && this.field1248[var1] != -1) {
				return -2;
			}
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.field1302.length; var3++) {
			byte[] var4 = this.field1369[var3];
			if (var4 != null) {
				int var5 = (this.field1246[var3] >> 8) * 64 - this.field1471;
				int var6 = (this.field1246[var3] & 0xFF) * 64 - this.field1472;
				var2 &= ClientBuild.method16(var4, var6, var5);
			}
		}
		if (!var2) {
			return -3;
		} else if (this.field1665) {
			return -4;
		} else {
			this.field1545 = 2;
			ClientBuild.field43 = this.field1478;
			this.method427();
			// MAP_BUILD_COMPLETE
			this.out.p1Enc(214);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (lowMem && arg5 != this.field1478) {
			return;
		}
		int var8 = 0;
		if (arg1 == 0) {
			var8 = this.field1331.method76(arg5, arg2, arg6);
		}
		if (arg1 == 1) {
			var8 = this.field1331.method77(arg6, arg2, arg5, this.field1419);
		}
		if (arg1 == 2) {
			var8 = this.field1331.method78(arg5, arg2, arg6);
		}
		if (arg1 == 3) {
			var8 = this.field1331.method79(arg5, arg2, arg6);
		}
		if (var8 != 0) {
			int var9 = this.field1331.method80(arg5, arg2, arg6, var8);
			int var10 = var8 >> 14 & 0x7FFF;
			int var11 = var9 & 0x1F;
			int var12 = var9 >> 6;
			if (arg1 == 0) {
				this.field1331.method67(arg5, arg6, arg2);
				LocType var13 = LocType.list(var10);
				if (var13.blockwalk) {
					this.field1521[arg5].method357(var11, var13.blockrange, var12, arg6, arg2);
				}
			}
			if (arg1 == 1) {
				this.field1331.method68(arg6, arg5, arg2, this.field1262);
			}
			if (arg1 == 2) {
				this.field1331.method69(arg6, arg5, arg2);
				LocType var14 = LocType.list(var10);
				if (arg2 + var14.width > 103 || arg6 + var14.width > 103 || arg2 + var14.length > 103 || arg6 + var14.length > 103) {
					return;
				}
				if (var14.blockwalk) {
					this.field1521[arg5].method358(var14.width, arg2, arg6, var12, var14.blockrange, var14.length);
				}
			}
			if (arg1 == 3) {
				this.field1331.method70(arg2, arg5, arg6);
				LocType var15 = LocType.list(var10);
				if (var15.blockwalk && var15.active) {
					this.field1521[arg5].method360(arg2, arg6);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		int var16 = arg5;
		if (arg5 < 3 && (this.field1243[1][arg2][arg6] & 0x2) == 2) {
			var16 = arg5 + 1;
		}
		ClientBuild.method31(this.field1331, var16, arg5, this.field1565, arg4, arg3, arg0, this.field1521[arg5], this.field1373, arg6, arg2);
		return;
	}

	@ObfuscatedName("client.c(Z)V")
	public void closeModal() {
		// CLOSE_MODAL
		this.out.p1Enc(51);
		if (this.sideModalId != -1) {
			this.sideModalId = -1;
			this.redrawSidebar = true;
			this.resumedPauseButton = false;
			this.redrawSideicons = true;
		}
		if (this.chatComId != -1) {
			this.chatComId = -1;
			this.redrawChatback = true;
			this.resumedPauseButton = false;
		}
		this.mainModalId = -1;
	}

	@ObfuscatedName("client.m(I)Z")
	public boolean method454() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(I)V")
	public void method455() {
		if (this.field1227 == 0 && this.field1612 == 0) {
			this.field1530[this.field1396] = "Walk here";
			this.field1609[this.field1396] = 718;
			this.field1607[this.field1396] = super.mouseX;
			this.field1608[this.field1396] = super.mouseY;
			this.field1396++;
		}
		int var1 = -1;
		for (int var2 = 0; var2 < Model.field597; var2++) {
			int var3 = Model.field598[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var3 != var1) {
				var1 = var3;
				if (var6 == 2 && this.field1331.method80(this.field1478, var4, var5, var3) >= 0) {
					LocType var8 = LocType.list(var7);
					if (this.field1227 == 1) {
						this.field1530[this.field1396] = "Use " + this.field1231 + " with @cya@" + var8.name;
						this.field1609[this.field1396] = 810;
						this.field1610[this.field1396] = var3;
						this.field1607[this.field1396] = var4;
						this.field1608[this.field1396] = var5;
						this.field1396++;
					} else if (this.field1612 != 1) {
						if (var8.op != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.op[var9] != null) {
									this.field1530[this.field1396] = var8.op[var9] + " @cya@" + var8.name;
									if (var9 == 0) {
										this.field1609[this.field1396] = 625;
									}
									if (var9 == 1) {
										this.field1609[this.field1396] = 721;
									}
									if (var9 == 2) {
										this.field1609[this.field1396] = 743;
									}
									if (var9 == 3) {
										this.field1609[this.field1396] = 357;
									}
									if (var9 == 4) {
										this.field1609[this.field1396] = 1071;
									}
									this.field1610[this.field1396] = var3;
									this.field1607[this.field1396] = var4;
									this.field1608[this.field1396] = var5;
									this.field1396++;
								}
							}
						}
						this.field1530[this.field1396] = "Examine @cya@" + var8.name;
						this.field1609[this.field1396] = 1381;
						this.field1610[this.field1396] = var3;
						this.field1607[this.field1396] = var4;
						this.field1608[this.field1396] = var5;
						this.field1396++;
					} else if ((this.field1614 & 0x4) == 4) {
						this.field1530[this.field1396] = this.field1615 + " @cya@" + var8.name;
						this.field1609[this.field1396] = 899;
						this.field1610[this.field1396] = var3;
						this.field1607[this.field1396] = var4;
						this.field1608[this.field1396] = var5;
						this.field1396++;
					}
				}
				if (var6 == 1) {
					ClientNpc var10 = this.field1675[var7];
					if (var10.field453.size == 1 && (var10.field397 & 0x7F) == 64 && (var10.field398 & 0x7F) == 64) {
						for (int var11 = 0; var11 < this.npcCount; var11++) {
							ClientNpc var12 = this.field1675[this.npcIds[var11]];
							if (var12 != null && var12 != var10 && var12.field453.size == 1 && var12.field397 == var10.field397 && var12.field398 == var10.field398) {
								this.method541(var4, var5, var12.field453, this.npcIds[var11]);
							}
						}
						for (int var13 = 0; var13 < this.field1537; var13++) {
							ClientPlayer var14 = this.field1536[this.field1538[var13]];
							if (var14 != null && var14.field397 == var10.field397 && var14.field398 == var10.field398) {
								this.method444(var4, this.field1538[var13], var5, var14);
							}
						}
					}
					this.method541(var4, var5, var10.field453, var7);
				}
				if (var6 == 0) {
					ClientPlayer var15 = this.field1536[var7];
					if ((var15.field397 & 0x7F) == 64 && (var15.field398 & 0x7F) == 64) {
						for (int var16 = 0; var16 < this.npcCount; var16++) {
							ClientNpc var17 = this.field1675[this.npcIds[var16]];
							if (var17 != null && var17.field453.size == 1 && var17.field397 == var15.field397 && var17.field398 == var15.field398) {
								this.method541(var4, var5, var17.field453, this.npcIds[var16]);
							}
						}
						for (int var18 = 0; var18 < this.field1537; var18++) {
							ClientPlayer var19 = this.field1536[this.field1538[var18]];
							if (var19 != null && var19 != var15 && var19.field397 == var15.field397 && var19.field398 == var15.field398) {
								this.method444(var4, this.field1538[var18], var5, var19);
							}
						}
					}
					this.method444(var4, var7, var5, var15);
				}
				if (var6 == 3) {
					LinkList var20 = this.field1232[this.field1478][var4][var5];
					if (var20 != null) {
						for (ClientObj var21 = (ClientObj) var20.tail(); var21 != null; var21 = (ClientObj) var20.prev()) {
							ObjType var22 = ObjType.list(var21.field494);
							if (this.field1227 == 1) {
								this.field1530[this.field1396] = "Use " + this.field1231 + " with @lre@" + var22.name;
								this.field1609[this.field1396] = 111;
								this.field1610[this.field1396] = var21.field494;
								this.field1607[this.field1396] = var4;
								this.field1608[this.field1396] = var5;
								this.field1396++;
							} else if (this.field1612 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.op != null && var22.op[var23] != null) {
										this.field1530[this.field1396] = var22.op[var23] + " @lre@" + var22.name;
										if (var23 == 0) {
											this.field1609[this.field1396] = 139;
										}
										if (var23 == 1) {
											this.field1609[this.field1396] = 778;
										}
										if (var23 == 2) {
											this.field1609[this.field1396] = 617;
										}
										if (var23 == 3) {
											this.field1609[this.field1396] = 224;
										}
										if (var23 == 4) {
											this.field1609[this.field1396] = 662;
										}
										this.field1610[this.field1396] = var21.field494;
										this.field1607[this.field1396] = var4;
										this.field1608[this.field1396] = var5;
										this.field1396++;
									} else if (var23 == 2) {
										this.field1530[this.field1396] = "Take @lre@" + var22.name;
										this.field1609[this.field1396] = 617;
										this.field1610[this.field1396] = var21.field494;
										this.field1607[this.field1396] = var4;
										this.field1608[this.field1396] = var5;
										this.field1396++;
									}
								}
								this.field1530[this.field1396] = "Examine @lre@" + var22.name;
								this.field1609[this.field1396] = 1152;
								this.field1610[this.field1396] = var21.field494;
								this.field1607[this.field1396] = var4;
								this.field1608[this.field1396] = var5;
								this.field1396++;
							} else if ((this.field1614 & 0x1) == 1) {
								this.field1530[this.field1396] = this.field1615 + " @lre@" + var22.name;
								this.field1609[this.field1396] = 370;
								this.field1610[this.field1396] = var21.field494;
								this.field1607[this.field1396] = var4;
								this.field1608[this.field1396] = var5;
								this.field1396++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void method456(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.field1348 = "";
				this.field1349 = "Connecting to server...";
				this.method461(true);
			}
			this.stream = new ClientStream(-158, this.openSocket(portOff + 43594), this);
			long var4 = JString.toUserhash(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.out.data = 0;
			this.out.p1(14);
			this.out.p1(var6);
			this.stream.write(2, this.out.pos);
			for (int var7 = 0; var7 < 8; var7++) {
				this.stream.read();
			}
			int var8 = this.stream.read();
			if (var8 == 0) {
				this.stream.read(this.in.pos, 0, 8);
				this.in.data = 0;
				this.field1647 = this.in.g8();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1647 >> 32), (int) this.field1647 };
				this.out.data = 0;
				this.out.p1(10);
				this.out.p4(var9[0]);
				this.out.p4(var9[1]);
				this.out.p4(var9[2]);
				this.out.p4(var9[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(arg0);
				this.out.pjstr(arg1);
				this.out.rsaenc(field1428, field1466);
				this.field1522.data = 0;
				if (arg2) {
					this.field1522.p1(18);
				} else {
					this.field1522.p1(16);
				}
				this.field1522.p1(this.out.data + 36 + 1 + 1 + 2);
				this.field1522.p1(255);
				this.field1522.p2(274);
				this.field1522.p1(lowMem ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					this.field1522.p4(this.field1301[var10]);
				}
				this.field1522.pdata(this.out.pos, this.out.data);
				this.out.random = new Isaac(true, var9);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				this.randomIn = new Isaac(true, var9);
				this.stream.write(this.field1522.data, this.field1522.pos);
				var8 = this.stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}
				this.method456(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.field1282 = this.stream.read();
				field1583 = this.stream.read() == 1;
				this.field1646 = 0L;
				this.field1399 = 0;
				this.field1576.length = 0;
				super.focus = true;
				this.field1361 = true;
				this.ingame = true;
				this.out.data = 0;
				this.in.data = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.field1637 = 0;
				this.field1219 = 0;
				this.field1639 = 0;
				this.field1616 = 0;
				this.field1396 = 0;
				this.field1267 = false;
				super.idleTimer = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					this.field1366[var12] = null;
				}
				this.field1227 = 0;
				this.field1612 = 0;
				this.field1545 = 0;
				this.field1345 = 0;
				this.field1662 = (int) (Math.random() * 100.0D) - 50;
				this.field1250 = (int) (Math.random() * 110.0D) - 55;
				this.field1304 = (int) (Math.random() * 80.0D) - 40;
				this.field1633 = (int) (Math.random() * 120.0D) - 60;
				this.field1586 = (int) (Math.random() * 30.0D) - 20;
				this.field1622 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.minimapState = 0;
				this.field1350 = -1;
				this.minimapFlagX = 0;
				this.field1442 = 0;
				this.field1537 = 0;
				this.npcCount = 0;
				for (int var13 = 0; var13 < this.field1534; var13++) {
					this.field1536[var13] = null;
					this.field1541[var13] = null;
				}
				for (int var14 = 0; var14 < 16384; var14++) {
					this.field1675[var14] = null;
				}
				field1668 = this.field1536[this.field1535] = new ClientPlayer();
				this.field1572.clear();
				this.field1340.clear();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							this.field1232[var15][var16][var17] = null;
						}
					}
				}
				this.field1644 = new LinkList(-822);
				this.field1532 = 0;
				this.field1531 = 0;
				this.tutComId = -1;
				this.chatComId = -1;
				this.mainModalId = -1;
				this.sideModalId = -1;
				this.mainOverlayId = -1;
				this.resumedPauseButton = false;
				this.sideTab = 3;
				this.dialogInputOpen = false;
				this.field1267 = false;
				this.field1681 = false;
				this.field1245 = null;
				this.inMultizone = 0;
				this.field1589 = -1;
				this.field1398 = true;
				this.method514();
				for (int var18 = 0; var18 < 5; var18++) {
					this.field1505[var18] = 0;
				}
				for (int var19 = 0; var19 < 5; var19++) {
					this.field1215[var19] = null;
					this.field1216[var19] = false;
				}
				field1648 = 0;
				field1385 = 0;
				field1567 = 0;
				field1316 = 0;
				field1468 = 0;
				field1573 = 0;
				field1611 = 0;
				field1296 = 0;
				field1444 = 0;
				this.method500();
			} else if (var8 == 3) {
				this.field1348 = "";
				this.field1349 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.field1348 = "Your account has been disabled.";
				this.field1349 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.field1348 = "Your account is already logged in.";
				this.field1349 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.field1348 = "RuneScape has been updated!";
				this.field1349 = "Please reload this page.";
			} else if (var8 == 7) {
				this.field1348 = "This world is full.";
				this.field1349 = "Please use a different world.";
			} else if (var8 == 8) {
				this.field1348 = "Unable to connect.";
				this.field1349 = "Login server offline.";
			} else if (var8 == 9) {
				this.field1348 = "Login limit exceeded.";
				this.field1349 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.field1348 = "Unable to connect.";
				this.field1349 = "Bad session id.";
			} else if (var8 == 11) {
				this.field1349 = "Login server rejected session.";
				this.field1349 = "Please try again.";
			} else if (var8 == 12) {
				this.field1348 = "You need a members account to login to this world.";
				this.field1349 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.field1348 = "Could not complete login.";
				this.field1349 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.field1348 = "The server is being updated.";
				this.field1349 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.ingame = true;
				this.out.data = 0;
				this.in.data = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.field1637 = 0;
				this.field1219 = 0;
				this.field1396 = 0;
				this.field1267 = false;
				this.field1543 = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.field1348 = "Login attempts exceeded.";
				this.field1349 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.field1348 = "You are standing in a members-only area.";
				this.field1349 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.field1348 = "Invalid loginserver requested";
				this.field1349 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = this.stream.read(); var20 >= 0; var20--) {
					this.field1348 = "You have only just left another world";
					this.field1349 = "Your profile will be transferred in: " + var20 + " seconds";
					this.method461(true);
					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}
				this.method456(arg0, arg1, arg2);
			} else if (var8 == -1) {
				this.field1348 = "No response from server";
				this.field1349 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				this.field1348 = "Unexpected server response";
				this.field1349 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			this.field1348 = "";
			this.field1349 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public void method457(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && this.tutComId != -1) {
			this.field1245 = arg2;
			super.mouseClickButton = 0;
		}
		if (this.chatComId == -1) {
			this.redrawChatback = true;
		}
		for (int var4 = 99; var4 > 0; var4--) {
			this.field1364[var4] = this.field1364[var4 - 1];
			this.field1365[var4] = this.field1365[var4 - 1];
			this.field1366[var4] = this.field1366[var4 - 1];
		}
		this.field1364[0] = arg0;
		this.field1365[0] = arg1;
		this.field1366[0] = arg2;
	}

	@ObfuscatedName("client.b(IIII)I")
	public int method458(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
			return 0;
		}
		int var6 = arg2;
		if (arg2 < 3 && (this.field1243[1][var4][var5] & 0x2) == 2) {
			var6 = arg2 + 1;
		}
		int var7 = arg0 & 0x7F;
		int var8 = arg1 & 0x7F;
		int var9 = this.field1373[var6][var4][var5] * (128 - var7) + this.field1373[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = this.field1373[var6][var4][var5 + 1] * (128 - var7) + this.field1373[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return var9 * (128 - var8) + var10 * var8 >> 7;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = this.field1331.method80(this.field1478, arg1, arg0, arg3);
		if (var6 == -1) {
			return false;
		}
		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1548++;
		if (field1548 > 1086) {
			field1548 = 0;
			// ANTICHEAT_CYCLELOGIC2
			this.out.p1Enc(149);
			this.out.p1(0);
			int var9 = this.out.data;
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p2(16791);
			}
			this.out.p1(254);
			this.out.p2((int) (Math.random() * 65536.0D));
			this.out.p2(16128);
			this.out.p2(52610);
			this.out.p2((int) (Math.random() * 65536.0D));
			this.out.p2(55420);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p2(35025);
			}
			this.out.p2(46628);
			this.out.p1((int) (Math.random() * 256.0D));
			this.out.psize1(this.out.data - var9, this.field1213);
		}
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var10 = LocType.list(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.width;
				var12 = var10.length;
			} else {
				var11 = var10.length;
				var12 = var10.width;
			}
			int var13 = var10.forceapproach;
			if (var8 != 0) {
				var13 = (var13 << var8 & 0xF) + (var13 >> 4 - var8);
			}
			this.method447(field1668.field448[0], arg1, var11, var12, var13, field1668.field447[0], 0, false, 0, arg0, 2);
		} else {
			this.method447(field1668.field448[0], arg1, 0, 0, 0, field1668.field447[0], var7 + 1, false, var8, arg0, 2);
		}
		this.field1558 = super.mouseClickX;
		this.field1559 = super.mouseClickY;
		this.field1561 = 2;
		this.field1560 = 0;
		this.out.p1Enc(arg2);
		this.out.p2(arg1 + this.field1471);
		this.out.p2(arg0 + this.field1472);
		this.out.p2(var5);
		return true;
	}

	@ObfuscatedName("client.d(II)V")
	public void method460(int arg0, int arg1) {
		LinkList var3 = this.field1232[this.field1478][arg0][arg1];
		if (var3 == null) {
			this.field1331.method71(this.field1478, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next(this.field1374)) {
			ObjType var7 = ObjType.list(var6.field494);
			int var8 = var7.cost;
			if (var7.stackable) {
				var8 *= var6.field495 + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.pushFront(var5);
		ClientObj var9 = null;
		ClientObj var10 = null;
		for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next(this.field1374)) {
			if (var11.field494 != var5.field494 && var9 == null) {
				var9 = var11;
			}
			if (var11.field494 != var5.field494 && var11.field494 != var9.field494 && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		this.field1331.method57(arg1, var12, this.field1478, var9, var5, arg0, this.method458(arg0 * 128 + 64, arg1 * 128 + 64, this.field1478), var10);
	}

	@ObfuscatedName("client.b(ZZ)V")
	public void method461(boolean arg0) {
		this.method424(this.field1261);
		this.field1457.setPixels(field1376);
		this.field1679.plotSprite(this.field1486, 0, 0);
		if (this.field1421 == 0) {
			this.field1491.centreStringTag(180, 180, this.onDemand.message, 7711145, true);
			byte var2 = 80;
			this.field1493.centreStringTag(180, 80, "Welcome to RuneScape", 16776960, true);
			int var5 = var2 + 30;
			this.field1680.plotSprite(this.field1486, 27, 100);
			this.field1493.centreStringTag(100, 125, "New User", 16777215, true);
			this.field1680.plotSprite(this.field1486, 187, 100);
			this.field1493.centreStringTag(260, 125, "Existing User", 16777215, true);
		}
		if (this.field1421 == 2) {
			byte var3 = 60;
			int var6;
			if (this.field1348.length() > 0) {
				this.field1493.centreStringTag(180, 45, this.field1348, 16776960, true);
				this.field1493.centreStringTag(180, 60, this.field1349, 16776960, true);
				var6 = var3 + 30;
			} else {
				this.field1493.centreStringTag(180, 53, this.field1349, 16776960, true);
				var6 = var3 + 30;
			}
			this.field1493.drawStringTag("Username: " + this.field1563 + (this.field1371 == 0 & field1218 % 40 < 20 ? "@yel@|" : ""), this.field1449, true, 90, 90, 16777215);
			var6 += 15;
			this.field1493.drawStringTag("Password: " + JString.getRepeatedCharacter(this.field1564) + (this.field1371 == 1 & field1218 % 40 < 20 ? "@yel@|" : ""), this.field1449, true, 105, 92, 16777215);
			var6 += 15;
			if (!arg0) {
				this.field1680.plotSprite(this.field1486, 27, 130);
				this.field1493.centreStringTag(100, 155, "Login", 16777215, true);
				this.field1680.plotSprite(this.field1486, 187, 130);
				this.field1493.centreStringTag(260, 155, "Cancel", 16777215, true);
			}
		}
		if (this.field1421 == 3) {
			this.field1493.centreStringTag(180, 40, "Create a free account", 16776960, true);
			byte var4 = 65;
			this.field1493.centreStringTag(180, 65, "To create a new account you need to", 16777215, true);
			int var7 = var4 + 15;
			this.field1493.centreStringTag(180, 80, "go back to the main RuneScape webpage", 16777215, true);
			int var8 = var7 + 15;
			this.field1493.centreStringTag(180, 95, "and choose the red 'create account'", 16777215, true);
			int var9 = var8 + 15;
			this.field1493.centreStringTag(180, 110, "button at the top right of that page.", 16777215, true);
			int var10 = var9 + 15;
			this.field1680.plotSprite(this.field1486, 107, 130);
			this.field1493.centreStringTag(180, 155, "Cancel", 16777215, true);
		}
		this.field1457.draw(202, super.graphics, 171);
		if (!this.field1333) {
			return;
		}
		this.field1333 = false;
		this.field1455.draw(128, super.graphics, 0);
		this.field1456.draw(202, super.graphics, 371);
		this.field1460.draw(0, super.graphics, 265);
		this.field1461.draw(562, super.graphics, 265);
		this.field1462.draw(128, super.graphics, 171);
		this.field1463.draw(562, super.graphics, 171);
	}

	@ObfuscatedName("client.e(Z)V")
	public void method463(boolean arg0) {
		for (ClientProj var2 = (ClientProj) this.field1572.head(); var2 != null; var2 = (ClientProj) this.field1572.next(this.field1374)) {
			if (var2.field499 != this.field1478 || field1218 > var2.field505) {
				var2.unlink();
			} else if (field1218 >= var2.field504) {
				if (var2.field508 > 0) {
					ClientNpc var3 = this.field1675[var2.field508 - 1];
					if (var3 != null && var3.field397 >= 0 && var3.field397 < 13312 && var3.field398 >= 0 && var3.field398 < 13312) {
						var2.method119(field1218, this.method458(var3.field397, var3.field398, var2.field499) - var2.field503, var3.field397, var3.field398);
					}
				}
				if (var2.field508 < 0) {
					int var4 = -var2.field508 - 1;
					ClientPlayer var5;
					if (var4 == this.field1363) {
						var5 = field1668;
					} else {
						var5 = this.field1536[var4];
					}
					if (var5 != null && var5.field397 >= 0 && var5.field397 < 13312 && var5.field398 >= 0 && var5.field398 < 13312) {
						var2.method119(field1218, this.method458(var5.field397, var5.field398, var2.field499) - var2.field503, var5.field397, var5.field398);
					}
				}
				var2.method120(this.field1391);
				this.field1331.method61((int) var2.field512, var2, (int) var2.field510, -1, (int) var2.field511, 60, var2.field518, this.field1478, false);
			}
		}
		field1413++;
		this.ingame &= arg0;
		if (field1413 > 1174) {
			field1413 = 0;
			// ANTICHEAT_CYCLELOGIC1
			this.out.p1Enc(12);
			this.out.p1(0);
			int var6 = this.out.data;
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p2(11499);
			}
			this.out.p2(10548);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(139);
			}
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(94);
			}
			this.out.p2(51693);
			this.out.p1(16);
			this.out.p2(15036);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(65);
			}
			this.out.p1((int) (Math.random() * 256.0D));
			this.out.p2(22990);
			this.out.psize1(this.out.data - var6, this.field1213);
		}
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public void method464(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.scrollbar0.plotSprite(this.field1486, arg3, arg1);
		this.scrollbar1.plotSprite(this.field1486, arg3, arg1 + arg4 - 16);
		Pix2D.fillRect(arg4 - 32, this.field1574, 16, arg3, arg1 + 16);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}
		int var7 = (arg4 - var6 - 32) * arg0 / (arg2 - arg4);
		Pix2D.fillRect(var6, this.field1423, 16, arg3, arg1 + var7 + 16);
		Pix2D.vline(this.field1593, var6, arg3, arg1 + var7 + 16);
		Pix2D.vline(this.field1593, var6, arg3 + 1, arg1 + 16 + var7);
		Pix2D.hline(16, this.field1593, arg3, arg1 + var7 + 16);
		Pix2D.hline(16, this.field1593, arg3, arg1 + var7 + 17);
		Pix2D.vline(this.field1241, var6, arg3 + 15, arg1 + 16 + var7);
		Pix2D.vline(this.field1241, var6 - 1, arg3 + 14, arg1 + var7 + 17);
		Pix2D.hline(16, this.field1241, arg3, arg1 + var7 + var6 + 15);
		Pix2D.hline(15, this.field1241, arg3 + 1, arg1 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.e(II)V")
	public void method465(int arg0) {
		if (lowMem) {
			return;
		}
		if (Pix3D.texCycle[17] >= arg0) {
			Pix8 var2 = Pix3D.textures[17];
			int var3 = var2.wi * var2.hi - 1;
			int var4 = var2.wi * this.field1391 * 2;
			byte[] var5 = var2.data;
			byte[] var6 = this.field1504;
			for (int var7 = 0; var7 <= var3; var7++) {
				var6[var7] = var5[var7 - var4 & var3];
			}
			var2.data = var6;
			this.field1504 = var5;
			Pix3D.pushTexture(17);
		}
		if (Pix3D.texCycle[24] < arg0) {
			return;
		}
		Pix8 var8 = Pix3D.textures[24];
		int var9 = var8.wi * var8.hi - 1;
		int var10 = var8.wi * this.field1391 * 2;
		byte[] var11 = var8.data;
		byte[] var12 = this.field1504;
		for (int var13 = 0; var13 <= var9; var13++) {
			var12[var13] = var11[var13 - var10 & var9];
		}
		var8.data = var12;
		this.field1504 = var11;
		Pix3D.pushTexture(24);
		return;
	}

	@ObfuscatedName("client.o(I)V")
	public void method466() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.field1370[0] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 0;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1370[1] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 1;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1370[2] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 2;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.field1370[3] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 3;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1370[4] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 4;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1370[5] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 5;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.field1370[6] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 6;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.field1370[7] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 7;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1370[8] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 8;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1370[9] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 9;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.field1370[10] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 10;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1370[11] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 11;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1370[12] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 12;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.field1370[13] != -1) {
			this.redrawSidebar = true;
			this.sideTab = 13;
			this.redrawSideicons = true;
			return;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void method467() {
		byte[] var1 = this.field1358.read("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		this.field1458.setPixels(field1376);
		var2.quickPlotSprite(0, 0);
		this.field1459.setPixels(field1376);
		var2.quickPlotSprite(0, -637);
		this.field1455.setPixels(field1376);
		var2.quickPlotSprite(0, -128);
		this.field1456.setPixels(field1376);
		var2.quickPlotSprite(-371, -202);
		this.field1457.setPixels(field1376);
		var2.quickPlotSprite(-171, -202);
		this.field1460.setPixels(field1376);
		var2.quickPlotSprite(-265, 0);
		this.field1461.setPixels(field1376);
		var2.quickPlotSprite(-265, -562);
		this.field1462.setPixels(field1376);
		var2.quickPlotSprite(-171, -128);
		this.field1463.setPixels(field1376);
		var2.quickPlotSprite(-171, -562);
		int[] var3 = new int[var2.wi];
		for (int var4 = 0; var4 < var2.hi; var4++) {
			for (int var5 = 0; var5 < var2.wi; var5++) {
				var3[var5] = var2.data[var2.wi + var2.wi * var4 - var5 - 1];
			}
			for (int var6 = 0; var6 < var2.wi; var6++) {
				var2.data[var6 + var2.wi * var4] = var3[var6];
			}
		}
		this.field1458.setPixels(field1376);
		var2.quickPlotSprite(0, 382);
		this.field1459.setPixels(field1376);
		var2.quickPlotSprite(0, -255);
		this.field1455.setPixels(field1376);
		var2.quickPlotSprite(0, 254);
		this.field1456.setPixels(field1376);
		var2.quickPlotSprite(-371, 180);
		this.field1457.setPixels(field1376);
		var2.quickPlotSprite(-171, 180);
		this.field1460.setPixels(field1376);
		var2.quickPlotSprite(-265, 382);
		this.field1461.setPixels(field1376);
		var2.quickPlotSprite(-265, -180);
		this.field1462.setPixels(field1376);
		var2.quickPlotSprite(-171, 254);
		this.field1463.setPixels(field1376);
		var2.quickPlotSprite(-171, -180);
		Pix32 var7 = new Pix32(this.field1358, "logo", 0);
		this.field1455.setPixels(field1376);
		var7.plotSprite(this.field1486, 382 - var7.wi / 2 - 128, 18);
		System.gc();
	}

	@ObfuscatedName("client.b(BI)V")
	public void method468(int arg0) {
		if (arg0 < 0) {
			return;
		}
		if (this.dialogInputOpen) {
			this.dialogInputOpen = false;
			this.redrawChatback = true;
		}
		int var2 = this.field1607[arg0];
		int var3 = this.field1608[arg0];
		int var4 = this.field1609[arg0];
		int var5 = this.field1610[arg0];
		if (this.field1487 != 6) {
			this.field1529 = -128;
		}
		if (var4 >= 2000) {
			var4 -= 2000;
		}
		if (var4 == 829) {
			ClientNpc var6 = this.field1675[var5];
			if (var6 != null) {
				this.method447(field1668.field448[0], var6.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var6.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				// OPNPCU
				this.out.p1Enc(150);
				this.out.p2(var5);
				this.out.p2(this.field1230);
				this.out.p2(this.field1228);
				this.out.p2(this.field1229);
			}
		}
		if (var4 == 524) {
			String var7 = this.field1530[arg0];
			int var8 = var7.indexOf("@whi@");
			if (var8 != -1) {
				this.closeModal();
				this.field1367 = var7.substring(var8 + 5).trim();
				this.field1544 = false;
				for (int var9 = 0; var9 < IfType.list.length; var9++) {
					if (IfType.list[var9] != null && IfType.list[var9].field77 == 600) {
						this.field1497 = this.mainModalId = IfType.list[var9].field74;
						break;
					}
				}
			}
		}
		if (var4 == 275) {
			ClientPlayer var10 = this.field1536[var5];
			if (var10 != null) {
				this.method447(field1668.field448[0], var10.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var10.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				// OPPLAYERU
				this.out.p1Enc(36);
				this.out.p2(var5);
				this.out.p2(this.field1230);
				this.out.p2(this.field1228);
				this.out.p2(this.field1229);
			}
		}
		if (var4 == 743) {
			field1385++;
			if (field1385 >= 124) {
				// ANTICHEAT_OPLOGIC2
				this.out.p1Enc(201);
				this.out.p2(37954);
			}
			// OPLOC3
			this.interactWithLoc(var3, var2, 187, var5);
		}
		if (var4 == 718) {
			if (this.field1267) {
				this.field1331.method88(var2 - 4, var3 - 4, this.field1450);
			} else {
				this.field1331.method88(super.mouseClickX - 4, super.mouseClickY - 4, this.field1450);
			}
		}
		if (var4 == 721) {
			field1648 += var3;
			if (field1648 >= 139) {
				// ANTICHEAT_OPLOGIC1
				this.out.p1Enc(219);
				this.out.p4(0);
			}
			// OPLOC2
			this.interactWithLoc(var3, var2, 103, var5);
		}
		if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
			String var11 = this.field1530[arg0];
			int var12 = var11.indexOf("@whi@");
			if (var12 != -1) {
				long var13 = JString.toUserhash(var11.substring(var12 + 5).trim());
				if (var4 == 605) {
					this.addFriend(var13);
				}
				if (var4 == 47) {
					this.addIgnore(var13);
				}
				if (var4 == 513) {
					this.delFriend(var13);
				}
				if (var4 == 884) {
					this.delIgnore(this.field1390, var13);
				}
			}
		}
		if (var4 == 563) {
			// OPHELDT
			this.out.p1Enc(135);
			this.out.p2(var5);
			this.out.p2(var2);
			this.out.p2(var3);
			this.out.p2(this.field1613);
			this.field1263 = 0;
			this.field1264 = var3;
			this.field1265 = var2;
			this.field1266 = 2;
			if (IfType.list[var3].field74 == this.mainModalId) {
				this.field1266 = 1;
			}
			if (IfType.list[var3].field74 == this.chatComId) {
				this.field1266 = 3;
			}
		}
		if (var4 == 435) {
			// IF_BUTTON
			this.out.p1Enc(9);
			this.out.p2(var3);
			IfType var15 = IfType.list[var3];
			if (var15.field83 != null && var15.field83[0][0] == 5) {
				int var16 = var15.field83[0][1];
				this.field1523[var16] = 1 - this.field1523[var16];
				this.clientVar(var16);
				this.redrawSidebar = true;
			}
		}
		if (var4 == 810 && this.interactWithLoc(var3, var2, 60, var5)) {
			// OPLOCU
			this.out.p2(this.field1230);
			this.out.p2(this.field1228);
			this.out.p2(this.field1229);
		}
		if (var4 == 102) {
			this.field1227 = 1;
			this.field1228 = var2;
			this.field1229 = var3;
			this.field1230 = var5;
			this.field1231 = ObjType.list(var5).name;
			this.field1612 = 0;
			this.redrawSidebar = true;
			return;
		}
		if (var4 == 1328) {
			ObjType var17 = ObjType.list(var5);
			IfType var18 = IfType.list[var3];
			String var19;
			if (var18 != null && var18.field70[var2] >= 100000) {
				var19 = var18.field70[var2] + " x " + var17.name;
			} else if (var17.desc == null) {
				var19 = "It's a " + var17.name + ".";
			} else {
				var19 = new String(var17.desc);
			}
			this.method457(0, "", var19);
		}
		if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
			ClientPlayer var20 = this.field1536[var5];
			if (var20 != null) {
				this.method447(field1668.field448[0], var20.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var20.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				if (var4 == 387) {
					field1468 += var5;
					if (field1468 >= 66) {
						// ANTICHEAT_OPLOGIC5
						this.out.p1Enc(235);
						this.out.p1(154);
					}
					// OPPLAYER4
					this.out.p1Enc(98);
				}
				if (var4 == 185) {
					// OPPLAYER5
					this.out.p1Enc(174);
				}
				if (var4 == 639) {
					field1316++;
					if (field1316 >= 52) {
						// ANTICHEAT_OPLOGIC4
						this.out.p1Enc(80);
						this.out.p1(131);
					}
					// OPPLAYER1
					this.out.p1Enc(109);
				}
				if (var4 == 27) {
					// OPPLAYER3
					this.out.p1Enc(196);
				}
				if (var4 == 499) {
					// OPPLAYER2
					this.out.p1Enc(166);
				}
				this.out.p2(var5);
			}
		}
		if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
			ClientNpc var21 = this.field1675[var5];
			if (var21 != null) {
				this.method447(field1668.field448[0], var21.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var21.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				if (var4 == 309) {
					// OPNPC3
					this.out.p1Enc(223);
				}
				if (var4 == 242) {
					// OPNPC1
					this.out.p1Enc(236);
				}
				if (var4 == 852) {
					// OPNPC4
					this.out.p1Enc(147);
				}
				if (var4 == 793) {
					// OPNPC5
					this.out.p1Enc(189);
				}
				if (var4 == 209) {
					// OPNPC2
					this.out.p1Enc(233);
				}
				this.out.p2(var5);
			}
		}
		if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
			if (var4 == 331) {
				// INV_BUTTON4
				this.out.p1Enc(179);
			}
			if (var4 == 113) {
				// INV_BUTTON2
				this.out.p1Enc(82);
			}
			if (var4 == 555) {
				// INV_BUTTON3
				this.out.p1Enc(239);
			}
			if (var4 == 354) {
				// INV_BUTTON5
				this.out.p1Enc(46);
			}
			if (var4 == 582) {
				if ((var5 & 0x3) == 0) {
					field1573++;
				}
				if (field1573 >= 133) {
					// ANTICHEAT_OPLOGIC6
					this.out.p1Enc(250);
					this.out.p2(6118);
				}
				// INV_BUTTON1
				this.out.p1Enc(74);
			}
			this.out.p2(var5);
			this.out.p2(var2);
			this.out.p2(var3);
			this.field1263 = 0;
			this.field1264 = var3;
			this.field1265 = var2;
			this.field1266 = 2;
			if (IfType.list[var3].field74 == this.mainModalId) {
				this.field1266 = 1;
			}
			if (IfType.list[var3].field74 == this.chatComId) {
				this.field1266 = 3;
			}
		}
		if (var4 == 997 && !this.resumedPauseButton) {
			// RESUME_PAUSEBUTTON
			this.out.p1Enc(72);
			this.out.p2(var3);
			this.resumedPauseButton = true;
		}
		if (var4 == 1714) {
			ClientNpc var22 = this.field1675[var5];
			if (var22 != null) {
				String var23;
				if (var22.field453.desc == null) {
					var23 = "It's a " + var22.field453.name + ".";
				} else {
					var23 = new String(var22.field453.desc);
				}
				this.method457(0, "", var23);
			}
		}
		if (var4 == 240) {
			ClientNpc var24 = this.field1675[var5];
			if (var24 != null) {
				this.method447(field1668.field448[0], var24.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var24.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				// OPNPCT
				this.out.p1Enc(181);
				this.out.p2(var5);
				this.out.p2(this.field1613);
			}
		}
		if (var4 == 902) {
			String var25 = this.field1530[arg0];
			int var26 = var25.indexOf("@whi@");
			if (var26 != -1) {
				long var27 = JString.toUserhash(var25.substring(var26 + 5).trim());
				int var29 = -1;
				for (int var30 = 0; var30 < this.field1531; var30++) {
					if (this.field1575[var30] == var27) {
						var29 = var30;
						break;
					}
				}
				if (var29 != -1 && this.field1489[var29] > 0) {
					this.redrawChatback = true;
					this.dialogInputOpen = false;
					this.field1681 = true;
					this.field1400 = "";
					this.field1467 = 3;
					this.field1283 = this.field1575[var29];
					this.field1435 = "Enter message to send to " + this.field1249[var29];
				}
			}
		}
		if (var4 == 1381) {
			int var31 = var5 >> 14 & 0x7FFF;
			LocType var32 = LocType.list(var31);
			String var33;
			if (var32.desc == null) {
				var33 = "It's a " + var32.name + ".";
			} else {
				var33 = new String(var32.desc);
			}
			this.method457(0, "", var33);
		}
		if (var4 == 231) {
			IfType var34 = IfType.list[var3];
			boolean var35 = true;
			if (var34.field77 > 0) {
				var35 = this.method521(var34, this.field1601);
			}
			if (var35) {
				// IF_BUTTON
				this.out.p1Enc(9);
				this.out.p2(var3);
			}
		}
		if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
			boolean var36 = this.method447(field1668.field448[0], var2, 0, 0, 0, field1668.field447[0], 0, false, 0, var3, 2);
			if (!var36) {
				this.method447(field1668.field448[0], var2, 1, 1, 0, field1668.field447[0], 0, false, 0, var3, 2);
			}
			this.field1558 = super.mouseClickX;
			this.field1559 = super.mouseClickY;
			this.field1561 = 2;
			this.field1560 = 0;
			if (var4 == 662) {
				field1567 += this.field1472;
				if (field1567 >= 118) {
					// ANTICHEAT_OPLOGIC3
					this.out.p1Enc(41);
					this.out.p4(0);
				}
				// OPOBJ5
				this.out.p1Enc(117);
			}
			if (var4 == 139) {
				if ((var2 & 0x3) == 0) {
					field1611++;
				}
				if (field1611 >= 123) {
					// ANTICHEAT_OPLOGIC7
					this.out.p1Enc(25);
					this.out.p4(0);
				}
				// OPOBJ1
				this.out.p1Enc(247);
			}
			if (var4 == 224) {
				field1296 += var3;
				if (field1296 >= 75) {
					// ANTICHEAT_OPLOGIC8
					this.out.p1Enc(0);
					this.out.p1(19);
				}
				// OPOBJ4
				this.out.p1Enc(62);
			}
			if (var4 == 617) {
				// OPOBJ3
				this.out.p1Enc(108);
			}
			if (var4 == 778) {
				// OPOBJ2
				this.out.p1Enc(169);
			}
			this.out.p2(var2 + this.field1471);
			this.out.p2(var3 + this.field1472);
			this.out.p2(var5);
		}
		if (var4 == 1071) {
			// OPLOC5
			this.interactWithLoc(var3, var2, 127, var5);
		}
		if (var4 == 507 || var4 == 957) {
			String var38 = this.field1530[arg0];
			int var39 = var38.indexOf("@whi@");
			if (var39 != -1) {
				String var40 = var38.substring(var39 + 5).trim();
				String var41 = JString.toScreenName(JString.toRawUsername(JString.toUserhash(var40)));
				boolean var42 = false;
				for (int var43 = 0; var43 < this.field1537; var43++) {
					ClientPlayer var44 = this.field1536[this.field1538[var43]];
					if (var44 != null && var44.field457 != null && var44.field457.equalsIgnoreCase(var41)) {
						this.method447(field1668.field448[0], var44.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var44.field448[0], 2);
						if (var4 == 507) {
							field1468 += var5;
							if (field1468 >= 66) {
								// ANTICHEAT_OPLOGIC5
								this.out.p1Enc(235);
								this.out.p1(154);
							}
							// OPPLAYER4
							this.out.p1Enc(98);
						}
						if (var4 == 957) {
							field1316++;
							if (field1316 >= 52) {
								// ANTICHEAT_OPLOGIC4
								this.out.p1Enc(80);
								this.out.p1(131);
							}
							// OPPLAYER1
							this.out.p1Enc(109);
						}
						this.out.p2(this.field1538[var43]);
						var42 = true;
						break;
					}
				}
				if (!var42) {
					this.method457(0, "", "Unable to find " + var41);
				}
			}
		}
		if (var4 == 131) {
			ClientPlayer var45 = this.field1536[var5];
			if (var45 != null) {
				this.method447(field1668.field448[0], var45.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var45.field448[0], 2);
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 2;
				this.field1560 = 0;
				// OPPLAYERT
				this.out.p1Enc(240);
				this.out.p2(var5);
				this.out.p2(this.field1613);
			}
		}
		if (var4 == 398) {
			// OPHELDU
			this.out.p1Enc(136);
			this.out.p2(var5);
			this.out.p2(var2);
			this.out.p2(var3);
			this.out.p2(this.field1230);
			this.out.p2(this.field1228);
			this.out.p2(this.field1229);
			this.field1263 = 0;
			this.field1264 = var3;
			this.field1265 = var2;
			this.field1266 = 2;
			if (IfType.list[var3].field74 == this.mainModalId) {
				this.field1266 = 1;
			}
			if (IfType.list[var3].field74 == this.chatComId) {
				this.field1266 = 3;
			}
		}
		if (var4 == 737) {
			this.closeModal();
		}
		if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
			if (var4 == 681) {
				field1444++;
				if (field1444 >= 116) {
					// ANTICHEAT_OPLOGIC9
					this.out.p1Enc(24);
					this.out.p3(13018169);
				}
				// OPHELD4
				this.out.p1Enc(216);
			}
			if (var4 == 100) {
				// OPHELD5
				this.out.p1Enc(42);
			}
			if (var4 == 694) {
				// OPHELD1
				this.out.p1Enc(185);
			}
			if (var4 == 962) {
				// OPHELD2
				this.out.p1Enc(2);
			}
			if (var4 == 795) {
				// OPHELD3
				this.out.p1Enc(123);
			}
			this.out.p2(var5);
			this.out.p2(var2);
			this.out.p2(var3);
			this.field1263 = 0;
			this.field1264 = var3;
			this.field1265 = var2;
			this.field1266 = 2;
			if (IfType.list[var3].field74 == this.mainModalId) {
				this.field1266 = 1;
			}
			if (IfType.list[var3].field74 == this.chatComId) {
				this.field1266 = 3;
			}
		}
		if (var4 == 357) {
			// OPLOC4
			this.interactWithLoc(var3, var2, 157, var5);
		}
		if (var4 == 1152) {
			ObjType var46 = ObjType.list(var5);
			String var47;
			if (var46.desc == null) {
				var47 = "It's a " + var46.name + ".";
			} else {
				var47 = new String(var46.desc);
			}
			this.method457(0, "", var47);
		}
		if (var4 == 370) {
			boolean var48 = this.method447(field1668.field448[0], var2, 0, 0, 0, field1668.field447[0], 0, false, 0, var3, 2);
			if (!var48) {
				this.method447(field1668.field448[0], var2, 1, 1, 0, field1668.field447[0], 0, false, 0, var3, 2);
			}
			this.field1558 = super.mouseClickX;
			this.field1559 = super.mouseClickY;
			this.field1561 = 2;
			this.field1560 = 0;
			// OPOBJT
			this.out.p1Enc(91);
			this.out.p2(var2 + this.field1471);
			this.out.p2(var3 + this.field1472);
			this.out.p2(var5);
			this.out.p2(this.field1613);
		}
		if (var4 == 899 && this.interactWithLoc(var3, var2, 213, var5)) {
			// OPLOCT
			this.out.p2(this.field1613);
		}
		if (var4 == 625) {
			// OPLOC1
			this.interactWithLoc(var3, var2, 215, var5);
		}
		if (var4 == 111) {
			boolean var50 = this.method447(field1668.field448[0], var2, 0, 0, 0, field1668.field447[0], 0, false, 0, var3, 2);
			if (!var50) {
				this.method447(field1668.field448[0], var2, 1, 1, 0, field1668.field447[0], 0, false, 0, var3, 2);
			}
			this.field1558 = super.mouseClickX;
			this.field1559 = super.mouseClickY;
			this.field1561 = 2;
			this.field1560 = 0;
			// OPOBJU
			this.out.p1Enc(39);
			this.out.p2(var2 + this.field1471);
			this.out.p2(var3 + this.field1472);
			this.out.p2(var5);
			this.out.p2(this.field1230);
			this.out.p2(this.field1228);
			this.out.p2(this.field1229);
		}
		if (var4 == 274) {
			IfType var52 = IfType.list[var3];
			this.field1612 = 1;
			this.field1613 = var3;
			this.field1614 = var52.field128;
			this.field1227 = 0;
			this.redrawSidebar = true;
			String var53 = var52.field126;
			if (var53.indexOf(" ") != -1) {
				var53 = var53.substring(0, var53.indexOf(" "));
			}
			String var54 = var52.field126;
			if (var54.indexOf(" ") != -1) {
				var54 = var54.substring(var54.indexOf(" ") + 1);
			}
			this.field1615 = var53 + " " + var52.field127 + " " + var54;
			if (this.field1614 == 16) {
				this.redrawSidebar = true;
				this.sideTab = 3;
				this.redrawSideicons = true;
			}
			return;
		}
		if (var4 == 225) {
			// IF_BUTTON
			this.out.p1Enc(9);
			this.out.p2(var3);
			IfType var55 = IfType.list[var3];
			if (var55.field83 != null && var55.field83[0][0] == 5) {
				int var56 = var55.field83[0][1];
				if (this.field1523[var56] != var55.field85[0]) {
					this.field1523[var56] = var55.field85[0];
					this.clientVar(var56);
					this.redrawSidebar = true;
				}
			}
		}

		this.field1227 = 0;
		this.field1612 = 0;
		this.redrawSidebar = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)Lxb;")
	public JagFile method469(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;
		try {
			if (this.fileStreams[0] != null) {
				var6 = this.fileStreams[0].readFromFile(arg1);
			}
		} catch (Exception var28) {
		}
		if (var6 != null) {
			this.field1395.reset();
			this.field1395.update(var6);
			int var8 = (int) this.field1395.getValue();
			if (var8 != arg3) {
				var6 = null;
			}
		}
		if (var6 != null) {
			return new JagFile(0, var6);
		}
		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			this.messageBox("Requesting " + arg0, arg4);
			try {
				int var12 = 0;
				DataInputStream var13 = this.method492(arg2 + arg3);
				byte[] var14 = new byte[6];
				var13.readFully(var14, 0, 6);
				Packet var15 = new Packet(var14, (byte) 1);
				var15.data = 3;
				int var16 = var15.g3() + 6;
				int var17 = 6;
				var6 = new byte[var16];
				for (int var18 = 0; var18 < 6; var18++) {
					var6[var18] = var14[var18];
				}
				while (var17 < var16) {
					int var19 = var16 - var17;
					if (var19 > 1000) {
						var19 = 1000;
					}
					int var20 = var13.read(var6, var17, var19);
					if (var20 < 0) {
						(new StringBuffer("Length error: ")).append(var17).append("/").append(var16).toString();
						throw new IOException("EOF");
					}
					var17 += var20;
					int var21 = var17 * 100 / var16;
					if (var21 != var12) {
						this.messageBox("Loading " + arg0 + " - " + var21 + "%", arg4);
					}
					var12 = var21;
				}
				var13.close();
				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].writeToFile(var6.length, arg1, var6);
					}
				} catch (Exception var27) {
					this.fileStreams[0] = null;
				}
				if (var6 != null) {
					this.field1395.reset();
					this.field1395.update(var6);
					int var22 = (int) this.field1395.getValue();
					if (var22 != arg3) {
						var6 = null;
						var10++;
						var11 = "Checksum error: " + var22;
					}
				}
			} catch (IOException var29) {
				if (var11.equals("Unknown error")) {
					var11 = "Connection error";
				}
				var6 = null;
			} catch (NullPointerException var30) {
				var11 = "Null error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var31) {
				var11 = "Bounds error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var32) {
				var11 = "Unexpected error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var6 == null) {
				for (int var24 = var7; var24 > 0; var24--) {
					if (var10 >= 3) {
						this.messageBox("Game updated - please reload page", arg4);
						var24 = 10;
					} else {
						this.messageBox(var11 + " - Retrying in " + var24, arg4);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var26) {
					}
				}
				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}
				this.field1469 = !this.field1469;
			}
		}
		return new JagFile(0, var6);
	}

	@ObfuscatedName("client.a(IJ)V")
	public void delFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var3 = 0; var3 < this.field1531; var3++) {
			if (this.field1575[var3] == arg0) {
				this.field1531--;
				this.redrawSidebar = true;
				for (int var4 = var3; var4 < this.field1531; var4++) {
					this.field1249[var4] = this.field1249[var4 + 1];
					this.field1489[var4] = this.field1489[var4 + 1];
					this.field1575[var4] = this.field1575[var4 + 1];
				}
				// FRIENDLIST_DEL
				this.out.p1Enc(106);
				this.out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void method471() {
		this.field1281.setPixels(field1376);
		Pix3D.scanline = this.field1659;
		this.chatback.plotSprite(this.field1486, 0, 0);
		if (this.field1681) {
			this.field1493.centreString(239, 40, 0, this.field1435);
			this.field1493.centreString(239, 60, 128, this.field1400 + "*");
		} else if (this.dialogInputOpen) {
			this.field1493.centreString(239, 40, 0, "Enter amount:");
			this.field1493.centreString(239, 60, 128, this.field1598 + "*");
		} else if (this.field1245 != null) {
			this.field1493.centreString(239, 40, 0, this.field1245);
			this.field1493.centreString(239, 60, 128, "Click to continue");
		} else if (this.chatComId != -1) {
			this.drawInterface(0, IfType.list[this.chatComId], 0, 0);
		} else if (this.tutComId == -1) {
			PixFont var1 = this.field1492;
			int var2 = 0;
			Pix2D.setClipping(77, 463, 0, 0);
			for (int var3 = 0; var3 < 100; var3++) {
				if (this.field1366[var3] != null) {
					int var4 = this.field1364[var3];
					int var5 = this.field1498 + 70 - var2 * 14;
					String var6 = this.field1365[var3];
					byte var7 = 0;
					if (var6 != null && var6.startsWith("@cr1@")) {
						var6 = var6.substring(5);
						var7 = 1;
					}
					if (var6 != null && var6.startsWith("@cr2@")) {
						var6 = var6.substring(5);
						var7 = 2;
					}
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, this.field1366[var3], 0, var5);
						}
						var2++;
					}
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.field1383 == 0 || this.field1383 == 1 && this.method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								this.field1330[0].plotSprite(this.field1486, 4, var5 - 12);
								var8 += 14;
							}
							if (var7 == 2) {
								this.field1330[1].plotSprite(this.field1486, var8, var5 - 12);
								var8 += 14;
							}
							var1.drawString(var8, var6 + ":", 0, var5);
							int var9 = var8 + var1.stringWid(var6) + 8;
							var1.drawString(var9, this.field1366[var3], 255, var5);
						}
						var2++;
					}
					if ((var4 == 3 || var4 == 7) && this.field1490 == 0 && (var4 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, "From", 0, var5);
							int var10 = var1.stringWid("From ") + 4;
							if (var7 == 1) {
								this.field1330[0].plotSprite(this.field1486, var10, var5 - 12);
								var10 += 14;
							}
							if (var7 == 2) {
								this.field1330[1].plotSprite(this.field1486, var10, var5 - 12);
								var10 += 14;
							}
							var1.drawString(var10, var6 + ":", 0, var5);
							int var11 = var10 + var1.stringWid(var6) + 8;
							var1.drawString(var11, this.field1366[var3], 8388608, var5);
						}
						var2++;
					}
					if (var4 == 4 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var6 + " " + this.field1366[var3], 8388736, var5);
						}
						var2++;
					}
					if (var4 == 5 && this.field1490 == 0 && this.field1388 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, this.field1366[var3], 8388608, var5);
						}
						var2++;
					}
					if (var4 == 6 && this.field1490 == 0 && this.field1388 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, "To " + var6 + ":", 0, var5);
							var1.drawString(var1.stringWid("To " + var6) + 12, this.field1366[var3], 8388608, var5);
						}
						var2++;
					}
					if (var4 == 8 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var6 + " " + this.field1366[var3], 8270336, var5);
						}
						var2++;
					}
				}
			}
			Pix2D.resetClipping();
			this.field1347 = var2 * 14 + 7;
			if (this.field1347 < 78) {
				this.field1347 = 78;
			}
			this.method464(this.field1347 - this.field1498 - 77, 0, this.field1347, 463, 77);
			String var12;
			if (field1668 == null || field1668.field457 == null) {
				var12 = JString.toScreenName(this.field1563);
			} else {
				var12 = field1668.field457;
			}
			var1.drawString(4, var12 + ":", 0, 90);
			var1.drawString(var1.stringWid(var12 + ": ") + 6, this.field1425 + "*", 255, 90);
			Pix2D.hline(479, 0, 0, 77);
		} else {
			this.drawInterface(0, IfType.list[this.tutComId], 0, 0);
		}
		if (this.field1267 && this.field1670 == 2) {
			this.method423();
		}
		this.field1281.draw(17, super.graphics, 357);
		this.field1280.setPixels(field1376);
		Pix3D.scanline = this.field1661;
	}

	@ObfuscatedName("client.a()V")
	@Override
	public void maininit() {
		this.messageBox("Starting up", 20);
		if (signlink.sunjava) {
			super.field8 = 5;
		}
		if (field1342) {
			this.field1451 = true;
			return;
		}
		field1342 = true;
		boolean var1 = false;
		String var2 = this.method501();
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.246")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.247")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.249")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.253")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.254")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.field1314 = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.fileStreams[var3] = new FileStream(signlink.cache_dat, 29615, signlink.cache_idx[var3], var3 + 1, 500000);
			}
		}
		try {
			this.method555();
			this.field1358 = this.method469("title screen", 1, "title", this.field1301[1], 25);
			this.field1491 = new PixFont(this.field1358, false, "p11_full", (byte) 0);
			this.field1492 = new PixFont(this.field1358, false, "p12_full", (byte) 0);
			this.field1493 = new PixFont(this.field1358, false, "b12_full", (byte) 0);
			this.field1494 = new PixFont(this.field1358, true, "q8_full", (byte) 0);
			this.method467();
			this.method499();
			JagFile var4 = this.method469("config", 2, "config", this.field1301[2], 30);
			JagFile var5 = this.method469("interface", 3, "interface", this.field1301[3], 35);
			JagFile var6 = this.method469("2d graphics", 4, "media", this.field1301[4], 40);
			JagFile var7 = this.method469("textures", 6, "textures", this.field1301[6], 45);
			JagFile var8 = this.method469("chat system", 7, "wordenc", this.field1301[7], 50);
			JagFile var9 = this.method469("sound effects", 8, "sounds", this.field1301[8], 55);
			this.field1243 = new byte[4][104][104];
			this.field1373 = new int[4][105][105];
			this.field1331 = new World(4, 104, 104, this.field1373, (byte) 6);
			for (int var10 = 0; var10 < 4; var10++) {
				this.field1521[var10] = new CollisionMap(104, 104, true);
			}
			this.field1443 = new Pix32(512, 512);
			JagFile var11 = this.method469("update list", 5, "versionlist", this.field1301[5], 60);
			this.messageBox("Connecting to update server", 60);
			this.onDemand = new OnDemand();
			this.onDemand.method265(var11, this);
			AnimFrame.method44(this.onDemand.getAnimFrameCount());
			Model.method122(this.onDemand.getFileCount(field1651, 0), this.onDemand);
			if (!lowMem) {
				this.midiSong = 0;
				try {
					this.midiSong = Integer.parseInt(this.getParameter("music"));
				} catch (Exception var70) {
				}
				this.midiFading = true;
				this.onDemand.request(2, this.midiSong);
				while (this.onDemand.remaining() > 0) {
					this.onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var69) {
					}
					if (this.onDemand.failCount > 3) {
						this.showLoadError("ondemand");
						return;
					}
				}
			}
			this.messageBox("Requesting animations", 65);
			int var12 = this.onDemand.getFileCount(field1651, 1);
			for (int var13 = 0; var13 < var12; var13++) {
				this.onDemand.request(1, var13);
			}
			while (this.onDemand.remaining() > 0) {
				int var14 = var12 - this.onDemand.remaining();
				if (var14 > 0) {
					this.messageBox("Loading animations - " + var14 * 100 / var12 + "%", 65);
				}
				this.onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var68) {
				}
				if (this.onDemand.failCount > 3) {
					this.showLoadError("ondemand");
					return;
				}
			}
			this.messageBox("Requesting models", 70);
			int var15 = this.onDemand.getFileCount(field1651, 0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = this.onDemand.getModelUse(var16);
				if ((var17 & 0x1) != 0) {
					this.onDemand.request(0, var16);
				}
			}
			int var18 = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int var19 = var18 - this.onDemand.remaining();
				if (var19 > 0) {
					this.messageBox("Loading models - " + var19 * 100 / var18 + "%", 70);
				}
				this.onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var67) {
				}
			}
			if (this.fileStreams[0] != null) {
				this.messageBox("Requesting maps", 75);
				this.onDemand.request(3, this.onDemand.getMapFile(0, 47, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 47, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(0, 49, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 49, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(0, 47, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 47, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 148));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 148));
				int var20 = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int var21 = var20 - this.onDemand.remaining();
					if (var21 > 0) {
						this.messageBox("Loading maps - " + var21 * 100 / var20 + "%", 75);
					}
					this.onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var66) {
					}
				}
			}
			int var22 = this.onDemand.getFileCount(field1651, 0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.onDemand.getModelUse(var23);
				byte var25 = 0;
				if ((var24 & 0x8) != 0) {
					var25 = 10;
				} else if ((var24 & 0x20) != 0) {
					var25 = 9;
				} else if ((var24 & 0x10) != 0) {
					var25 = 8;
				} else if ((var24 & 0x40) != 0) {
					var25 = 7;
				} else if ((var24 & 0x80) != 0) {
					var25 = 6;
				} else if ((var24 & 0x2) != 0) {
					var25 = 5;
				} else if ((var24 & 0x4) != 0) {
					var25 = 4;
				}
				if ((var24 & 0x1) != 0) {
					var25 = 3;
				}
				if (var25 != 0) {
					this.onDemand.prefetchPriority(var23, 0, var25);
				}
			}
			this.onDemand.prefetchMaps(field1655);
			if (!lowMem) {
				int var26 = this.onDemand.getFileCount(field1651, 2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (this.onDemand.isMidiJingle(var27)) {
						this.onDemand.prefetchPriority(var27, 2, (byte) 1);
					}
				}
			}
			this.messageBox("Unpacking media", 80);
			this.invback = new Pix8(var6, "invback", 0);
			this.chatback = new Pix8(var6, "chatback", 0);
			this.mapback = new Pix8(var6, "mapback", 0);
			this.backbase1 = new Pix8(var6, "backbase1", 0);
			this.backbase2 = new Pix8(var6, "backbase2", 0);
			this.backhmid1 = new Pix8(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				this.sideicons[var28] = new Pix8(var6, "sideicons", var28);
			}
			this.compass = new Pix32(var6, "compass", 0);
			this.mapedge = new Pix32(var6, "mapedge", 0);
			this.mapedge.trim();
			try {
				for (int var29 = 0; var29 < 100; var29++) {
					this.mapscene[var29] = new Pix8(var6, "mapscene", var29);
				}
			} catch (Exception var74) {
			}
			try {
				for (int var30 = 0; var30 < 100; var30++) {
					this.mapfunction[var30] = new Pix32(var6, "mapfunction", var30);
				}
			} catch (Exception var73) {
			}
			try {
				for (int var31 = 0; var31 < 20; var31++) {
					this.hitmarks[var31] = new Pix32(var6, "hitmarks", var31);
				}
			} catch (Exception var72) {
			}
			try {
				for (int var32 = 0; var32 < 20; var32++) {
					this.headicons[var32] = new Pix32(var6, "headicons", var32);
				}
			} catch (Exception var71) {
			}
			this.mapmarker0 = new Pix32(var6, "mapmarker", 0);
			this.mapmarker1 = new Pix32(var6, "mapmarker", 1);
			for (int var33 = 0; var33 < 8; var33++) {
				this.cross[var33] = new Pix32(var6, "cross", var33);
			}
			this.mapdots0 = new Pix32(var6, "mapdots", 0);
			this.mapdots1 = new Pix32(var6, "mapdots", 1);
			this.mapdots2 = new Pix32(var6, "mapdots", 2);
			this.mapdots3 = new Pix32(var6, "mapdots", 3);
			this.scrollbar0 = new Pix8(var6, "scrollbar", 0);
			this.scrollbar1 = new Pix8(var6, "scrollbar", 1);
			this.redstone1 = new Pix8(var6, "redstone1", 0);
			this.redstone2 = new Pix8(var6, "redstone2", 0);
			this.redstone3 = new Pix8(var6, "redstone3", 0);
			this.field1294 = new Pix8(var6, "redstone1", 0);
			this.field1294.hflip();
			this.field1295 = new Pix8(var6, "redstone2", 0);
			this.field1295.hflip();
			this.field1626 = new Pix8(var6, "redstone1", 0);
			this.field1626.vflip();
			this.field1627 = new Pix8(var6, "redstone2", 0);
			this.field1627.vflip();
			this.field1628 = new Pix8(var6, "redstone3", 0);
			this.field1628.vflip();
			this.field1629 = new Pix8(var6, "redstone1", 0);
			this.field1629.hflip();
			this.field1629.vflip();
			this.field1630 = new Pix8(var6, "redstone2", 0);
			this.field1630.hflip();
			this.field1630.vflip();
			for (int var34 = 0; var34 < 2; var34++) {
				this.field1330[var34] = new Pix8(var6, "mod_icons", var34);
			}
			Pix32 var35 = new Pix32(var6, "backleft1", 0);
			this.field1268 = new PixMap(var35.hi, field1356, var35.wi, this.getBaseComponent(field1518));
			var35.quickPlotSprite(0, 0);
			Pix32 var36 = new Pix32(var6, "backleft2", 0);
			this.field1269 = new PixMap(var36.hi, field1356, var36.wi, this.getBaseComponent(field1518));
			var36.quickPlotSprite(0, 0);
			Pix32 var37 = new Pix32(var6, "backright1", 0);
			this.field1270 = new PixMap(var37.hi, field1356, var37.wi, this.getBaseComponent(field1518));
			var37.quickPlotSprite(0, 0);
			Pix32 var38 = new Pix32(var6, "backright2", 0);
			this.field1271 = new PixMap(var38.hi, field1356, var38.wi, this.getBaseComponent(field1518));
			var38.quickPlotSprite(0, 0);
			Pix32 var39 = new Pix32(var6, "backtop1", 0);
			this.field1272 = new PixMap(var39.hi, field1356, var39.wi, this.getBaseComponent(field1518));
			var39.quickPlotSprite(0, 0);
			Pix32 var40 = new Pix32(var6, "backvmid1", 0);
			this.field1273 = new PixMap(var40.hi, field1356, var40.wi, this.getBaseComponent(field1518));
			var40.quickPlotSprite(0, 0);
			Pix32 var41 = new Pix32(var6, "backvmid2", 0);
			this.field1274 = new PixMap(var41.hi, field1356, var41.wi, this.getBaseComponent(field1518));
			var41.quickPlotSprite(0, 0);
			Pix32 var42 = new Pix32(var6, "backvmid3", 0);
			this.field1275 = new PixMap(var42.hi, field1356, var42.wi, this.getBaseComponent(field1518));
			var42.quickPlotSprite(0, 0);
			Pix32 var43 = new Pix32(var6, "backhmid2", 0);
			this.field1276 = new PixMap(var43.hi, field1356, var43.wi, this.getBaseComponent(field1518));
			var43.quickPlotSprite(0, 0);
			int var44 = (int) (Math.random() * 21.0D) - 10;
			int var45 = (int) (Math.random() * 21.0D) - 10;
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 41.0D) - 20;
			for (int var48 = 0; var48 < 100; var48++) {
				if (this.mapfunction[var48] != null) {
					this.mapfunction[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
				}
				if (this.mapscene[var48] != null) {
					this.mapscene[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
				}
			}
			this.messageBox("Unpacking textures", 83);
			Pix3D.unpackTextures(var7);
			Pix3D.initColourTable(0.8D);
			Pix3D.initPool();
			this.messageBox("Unpacking config", 86);
			SeqType.init(var4);
			LocType.method323(var4);
			FloType.init(var4);
			ObjType.init(var4);
			NpcType.init(var4);
			IdkType.init(var4);
			SpotType.init(var4);
			VarpType.init(var4);
			VarbitType.method380(var4);
			ObjType.memServer = field1655;
			if (!lowMem) {
				this.messageBox("Unpacking sounds", 90);
				byte[] var49 = var9.read("sounds.dat", null);
				Packet var50 = new Packet(var49, (byte) 1);
				JagFX.unpack(var50);
			}
			this.messageBox("Unpacking interfaces", 95);
			PixFont[] var51 = new PixFont[] { this.field1491, this.field1492, this.field1493, this.field1494 };
			IfType.method32(var5, var6, var51);
			this.messageBox("Preparing game engine", 100);
			for (int var52 = 0; var52 < 33; var52++) {
				int var53 = 999;
				int var54 = 0;
				for (int var55 = 0; var55 < 34; var55++) {
					if (this.mapback.data[var55 + var52 * this.mapback.wi] == 0) {
						if (var53 == 999) {
							var53 = var55;
						}
					} else if (var53 != 999) {
						var54 = var55;
						break;
					}
				}
				this.field1299[var52] = var53;
				this.field1470[var52] = var54 - var53;
			}
			for (int var56 = 5; var56 < 156; var56++) {
				int var57 = 999;
				int var58 = 0;
				for (int var59 = 25; var59 < 172; var59++) {
					if (this.mapback.data[var59 + var56 * this.mapback.wi] == 0 && (var59 > 34 || var56 > 34)) {
						if (var57 == 999) {
							var57 = var59;
						}
					} else if (var57 != 999) {
						var58 = var59;
						break;
					}
				}
				this.field1552[var56 - 5] = var57 - 25;
				this.field1566[var56 - 5] = var58 - var57;
			}
			Pix3D.setClipping(479, 96);
			this.field1659 = Pix3D.scanline;
			Pix3D.setClipping(190, 261);
			this.field1660 = Pix3D.scanline;
			Pix3D.setClipping(512, 334);
			this.field1661 = Pix3D.scanline;
			int[] var60 = new int[9];
			for (int var61 = 0; var61 < 9; var61++) {
				int var62 = var61 * 32 + 128 + 15;
				int var63 = var62 * 3 + 600;
				int var64 = Pix3D.sinTable[var62];
				var60[var61] = var63 * var64 >> 16;
			}
			World.method86(var60);
			WordFilter.unpack(var8);
			this.field1576 = new MouseTracking(field1640, this);
			this.startThread(this.field1576, 10);
		} catch (Exception var75) {
			var75.printStackTrace();
			signlink.reporterror("loaderror " + this.field1244 + " " + this.field1324);
			this.field1590 = true;
		}
	}

	@ObfuscatedName("client.a(IILd;IIIIZI)V")
	public void method472(int arg0, IfType arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
		if (this.field1433) {
			this.field1502 = 32;
		} else {
			this.field1502 = 0;
		}
		this.field1433 = false;
		if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg3 && arg2 < arg3 + 16) {
			arg1.field88 -= this.field1409 * 4;
			if (arg6) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg3 + arg0 - 16 && arg2 < arg3 + arg0) {
			arg1.field88 += this.field1409 * 4;
			if (arg6) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg5 >= arg4 - this.field1502 && arg5 < arg4 + this.field1502 + 16 && arg2 >= arg3 + 16 && arg2 < arg3 + arg0 - 16 && this.field1409 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}
			int var10 = arg2 - arg3 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg1.field88 = (arg7 - arg0) * var10 / var11;
			if (arg6) {
				this.redrawSidebar = true;
			}
			this.field1433 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public boolean method473(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var2 = this.field1609[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}
		return var2 == 605;
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public void getNpcPosOldVis(int arg0, int arg1, Packet arg2) {
		arg2.gBitStart();
		int var4 = arg2.gBit(8);
		if (var4 < this.npcCount) {
			for (int var5 = var4; var5 < this.npcCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var5];
			}
		}
		if (var4 > this.npcCount) {
			signlink.reporterror(this.field1563 + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.npcCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.npcIds[var6];
			ClientNpc var8 = this.field1675[var7];
			int var9 = arg2.gBit(1);
			if (var9 == 0) {
				this.npcIds[this.npcCount++] = var7;
				var8.field442 = field1218;
			} else {
				int var10 = arg2.gBit(2);
				if (var10 == 0) {
					this.npcIds[this.npcCount++] = var7;
					var8.field442 = field1218;
					this.field1540[this.field1539++] = var7;
				} else if (var10 == 1) {
					this.npcIds[this.npcCount++] = var7;
					var8.field442 = field1218;
					int var11 = arg2.gBit(3);
					var8.method111(var11, false);
					int var12 = arg2.gBit(1);
					if (var12 == 1) {
						this.field1540[this.field1539++] = var7;
					}
				} else if (var10 == 2) {
					this.npcIds[this.npcCount++] = var7;
					var8.field442 = field1218;
					int var13 = arg2.gBit(3);
					var8.method111(var13, true);
					int var14 = arg2.gBit(3);
					var8.method111(var14, true);
					int var15 = arg2.gBit(1);
					if (var15 == 1) {
						this.field1540[this.field1539++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public void zonePacket(int arg0, Packet arg1) {
		if (arg0 == 138 || arg0 == 173) {
			// LOC_ADD_CHANGE || LOC_DEL
			int var3 = arg1.g1();
			int var4 = this.field1334 + (var3 >> 4 & 0x7);
			int var5 = this.field1335 + (var3 & 0x7);
			int var6 = arg1.g1();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = this.field1389[var7];
			int var10;
			if (arg0 == 173) {
				var10 = -1;
			} else {
				var10 = arg1.g2();
			}
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				this.method490(var5, -1, var10, this.field1478, var8, var4, var9, var7, 0);
			}
		} else if (arg0 == 48) {
			// LOC_ANIM
			int var11 = arg1.g1();
			int var12 = this.field1334 + (var11 >> 4 & 0x7);
			int var13 = this.field1335 + (var11 & 0x7);
			int var14 = arg1.g1();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = this.field1389[var15];
			int var18 = arg1.g2();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = this.field1373[this.field1478][var12][var13];
				int var20 = this.field1373[this.field1478][var12 + 1][var13];
				int var21 = this.field1373[this.field1478][var12 + 1][var13 + 1];
				int var22 = this.field1373[this.field1478][var12][var13 + 1];
				if (var17 == 0) {
					Wall var23 = this.field1331.method72(var13, this.field1478, var12);
					if (var23 != null) {
						int var24 = var23.field272 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field270 = new ClientLocAnim(2, var16 + 4, var18, var24, var21, this.field1323, false, var20, var22, var19);
							var23.field271 = new ClientLocAnim(2, var16 + 1 & 0x3, var18, var24, var21, this.field1323, false, var20, var22, var19);
						} else {
							var23.field270 = new ClientLocAnim(var15, var16, var18, var24, var21, this.field1323, false, var20, var22, var19);
						}
					}
				}
				if (var17 == 1) {
					Decor var25 = this.field1331.method73(var12, this.field1478, var13);
					if (var25 != null) {
						var25.field162 = new ClientLocAnim(4, 0, var18, var25.field163 >> 14 & 0x7FFF, var21, this.field1323, false, var20, var22, var19);
					}
				}
				if (var17 == 2) {
					Sprite var26 = this.field1331.method74(var12, this.field1478, this.field1297, var13);
					if (var15 == 11) {
						var15 = 10;
					}
					if (var26 != null) {
						var26.field255 = new ClientLocAnim(var15, var16, var18, var26.field263 >> 14 & 0x7FFF, var21, this.field1323, false, var20, var22, var19);
					}
				}
				if (var17 == 3) {
					GroundDecor var27 = this.field1331.method75(var12, this.field1478, var13);
					if (var27 != null) {
						var27.field194 = new ClientLocAnim(22, var16, var18, var27.field195 >> 14 & 0x7FFF, var21, this.field1323, false, var20, var22, var19);
					}
				}
			}
		} else if (arg0 == 81) {
			// OBJ_ADD
			int var28 = arg1.g1();
			int var29 = this.field1334 + (var28 >> 4 & 0x7);
			int var30 = this.field1335 + (var28 & 0x7);
			int var31 = arg1.g2();
			int var32 = arg1.g2();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				ClientObj var33 = new ClientObj();
				var33.field494 = var31;
				var33.field495 = var32;
				if (this.field1232[this.field1478][var29][var30] == null) {
					this.field1232[this.field1478][var29][var30] = new LinkList(-822);
				}
				this.field1232[this.field1478][var29][var30].push(var33);
				this.method460(var29, var30);
			}
		} else if (arg0 == 52) {
			// OBJ_DEL
			int var34 = arg1.g1();
			int var35 = this.field1334 + (var34 >> 4 & 0x7);
			int var36 = this.field1335 + (var34 & 0x7);
			int var37 = arg1.g2();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				LinkList var38 = this.field1232[this.field1478][var35][var36];
				if (var38 != null) {
					for (ClientObj var39 = (ClientObj) var38.head(); var39 != null; var39 = (ClientObj) var38.next(this.field1374)) {
						if (var39.field494 == (var37 & 0x7FFF)) {
							var39.unlink();
							break;
						}
					}
					if (var38.head() == null) {
						this.field1232[this.field1478][var35][var36] = null;
					}
					this.method460(var35, var36);
				}
			}
		} else if (arg0 == 107) {
			// MAP_PROJANIM
			int var40 = arg1.g1();
			int var41 = this.field1334 + (var40 >> 4 & 0x7);
			int var42 = this.field1335 + (var40 & 0x7);
			int var43 = var41 + arg1.g1b();
			int var44 = var42 + arg1.g1b();
			int var45 = arg1.g2b();
			int var46 = arg1.g2();
			int var47 = arg1.g1() * 4;
			int var48 = arg1.g1() * 4;
			int var49 = arg1.g2();
			int var50 = arg1.g2();
			int var51 = arg1.g1();
			int var52 = arg1.g1();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				int var53 = var41 * 128 + 64;
				int var54 = var42 * 128 + 64;
				int var55 = var43 * 128 + 64;
				int var56 = var44 * 128 + 64;
				ClientProj var57 = new ClientProj(var53, var52, var48, var50 + field1218, var51, var49 + field1218, this.field1478, var46, this.field1346, this.method458(var53, var54, this.field1478) - var47, var45, var54);
				var57.method119(var49 + field1218, this.method458(var55, var56, this.field1478) - var48, var55, var56);
				this.field1572.push(var57);
			}
		} else if (arg0 == 85) {
			// MAP_ANIM
			int var58 = arg1.g1();
			int var59 = this.field1334 + (var58 >> 4 & 0x7);
			int var60 = this.field1335 + (var58 & 0x7);
			int var61 = arg1.g2();
			int var62 = arg1.g1();
			int var63 = arg1.g2();
			if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
				int var64 = var59 * 128 + 64;
				int var65 = var60 * 128 + 64;
				MapSpotAnim var66 = new MapSpotAnim(var63, var65, var64, this.field1478, 0, this.method458(var64, var65, this.field1478) - var62, var61, field1218);
				this.field1340.push(var66);
			}
		} else if (arg0 == 219) {
			// OBJ_REVEAL
			int var67 = arg1.g1();
			int var68 = this.field1334 + (var67 >> 4 & 0x7);
			int var69 = this.field1335 + (var67 & 0x7);
			int var70 = arg1.g2();
			int var71 = arg1.g2();
			int var72 = arg1.g2();
			if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var72 != this.field1363) {
				ClientObj var73 = new ClientObj();
				var73.field494 = var70;
				var73.field495 = var71;
				if (this.field1232[this.field1478][var68][var69] == null) {
					this.field1232[this.field1478][var68][var69] = new LinkList(-822);
				}
				this.field1232[this.field1478][var68][var69].push(var73);
				this.method460(var68, var69);
			}
		} else if (arg0 == 176) {
			// P_LOCMERGE
			int var74 = arg1.g1();
			int var75 = this.field1334 + (var74 >> 4 & 0x7);
			int var76 = this.field1335 + (var74 & 0x7);
			int var77 = arg1.g1();
			int var78 = var77 >> 2;
			int var79 = var77 & 0x3;
			int var80 = this.field1389[var78];
			int var81 = arg1.g2();
			int var82 = arg1.g2();
			int var83 = arg1.g2();
			int var84 = arg1.g2();
			byte var85 = arg1.g1b();
			byte var86 = arg1.g1b();
			byte var87 = arg1.g1b();
			byte var88 = arg1.g1b();
			ClientPlayer var89;
			if (var84 == this.field1363) {
				var89 = field1668;
			} else {
				var89 = this.field1536[var84];
			}
			if (var89 != null) {
				LocType var90 = LocType.list(var81);
				int var91 = this.field1373[this.field1478][var75][var76];
				int var92 = this.field1373[this.field1478][var75 + 1][var76];
				int var93 = this.field1373[this.field1478][var75 + 1][var76 + 1];
				int var94 = this.field1373[this.field1478][var75][var76 + 1];
				Model var95 = var90.getModel(var78, var79, var91, var92, var93, var94, -1);
				if (var95 != null) {
					this.method490(var76, var83 + 1, -1, this.field1478, 0, var75, var80, 0, var82 + 1);
					var89.field467 = var82 + field1218;
					var89.field468 = var83 + field1218;
					var89.field472 = var95;
					int var96 = var90.width;
					int var97 = var90.length;
					if (var79 == 1 || var79 == 3) {
						var96 = var90.length;
						var97 = var90.width;
					}
					var89.field469 = var75 * 128 + var96 * 64;
					var89.field471 = var76 * 128 + var97 * 64;
					var89.field470 = this.method458(var89.field469, var89.field471, this.field1478);
					if (var85 > var87) {
						byte var98 = var85;
						var85 = var87;
						var87 = var98;
					}
					if (var86 > var88) {
						byte var99 = var86;
						var86 = var88;
						var88 = var99;
					}
					var89.field473 = var75 + var85;
					var89.field475 = var75 + var87;
					var89.field474 = var76 + var86;
					var89.field476 = var76 + var88;
				}
			}
		} else if (arg0 == 95) {
			// OBJ_COUNT
			int var100 = arg1.g1();
			int var101 = this.field1334 + (var100 >> 4 & 0x7);
			int var102 = this.field1335 + (var100 & 0x7);
			int var103 = arg1.g2();
			int var104 = arg1.g2();
			int var105 = arg1.g2();
			if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
				LinkList var106 = this.field1232[this.field1478][var101][var102];
				if (var106 != null) {
					for (ClientObj var107 = (ClientObj) var106.head(); var107 != null; var107 = (ClientObj) var106.next(this.field1374)) {
						if (var107.field494 == (var103 & 0x7FFF) && var107.field495 == var104) {
							var107.field495 = var105;
							break;
						}
					}
					this.method460(var101, var102);
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public void method476() {
		if (this.field1311 != 0) {
			return;
		}
		this.field1530[0] = "Cancel";
		this.field1609[0] = 1106;
		this.field1396 = 1;
		this.method491();
		this.field1546 = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (this.mainModalId == -1) {
				this.method455();
			} else {
				this.method477(super.mouseY, super.mouseX, 4, IfType.list[this.mainModalId], 0, 4);
			}
		}
		if (this.field1546 != this.field1664) {
			this.field1664 = this.field1546;
		}
		this.field1546 = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.sideModalId != -1) {
				this.method477(super.mouseY, super.mouseX, 205, IfType.list[this.sideModalId], 0, 553);
			} else if (this.field1370[this.sideTab] != -1) {
				this.method477(super.mouseY, super.mouseX, 205, IfType.list[this.field1370[this.sideTab]], 0, 553);
			}
		}
		if (this.field1546 != this.field1432) {
			this.redrawSidebar = true;
			this.field1432 = this.field1546;
		}
		this.field1546 = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (this.chatComId != -1) {
				this.method477(super.mouseY, super.mouseX, 357, IfType.list[this.chatComId], 0, 17);
			} else if (super.mouseY < 434 && super.mouseX < 426) {
				this.method498(super.mouseX - 17, super.mouseY - 357);
			}
		}
		if (this.chatComId != -1 && this.field1546 != this.field1482) {
			this.redrawChatback = true;
			this.field1482 = this.field1546;
		}
		boolean var1 = false;
		while (!var1) {
			var1 = true;
			for (int var2 = 0; var2 < this.field1396 - 1; var2++) {
				if (this.field1609[var2] < 1000 && this.field1609[var2 + 1] > 1000) {
					String var3 = this.field1530[var2];
					this.field1530[var2] = this.field1530[var2 + 1];
					this.field1530[var2 + 1] = var3;
					int var4 = this.field1609[var2];
					this.field1609[var2] = this.field1609[var2 + 1];
					this.field1609[var2 + 1] = var4;
					int var5 = this.field1607[var2];
					this.field1607[var2] = this.field1607[var2 + 1];
					this.field1607[var2 + 1] = var5;
					int var6 = this.field1608[var2];
					this.field1608[var2] = this.field1608[var2 + 1];
					this.field1608[var2 + 1] = var6;
					int var7 = this.field1610[var2];
					this.field1610[var2] = this.field1610[var2 + 1];
					this.field1610[var2 + 1] = var7;
					var1 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void refresh() {
		this.field1333 = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	@Override
	public void messageBox(String arg0, int arg1) {
		this.field1324 = arg1;
		this.field1244 = arg0;
		this.method424(this.field1261);
		if (this.field1358 == null) {
			super.messageBox(arg0, arg1);
			return;
		}
		this.field1457.setPixels(field1376);
		this.field1493.centreString(180, 54, 16777215, "RuneScape is loading - please wait...");
		Pix2D.drawRect(304, 9179409, 34, 28, 62);
		Pix2D.drawRect(302, 0, 32, 29, 63);
		Pix2D.fillRect(30, 9179409, arg1 * 3, 30, 64);
		Pix2D.fillRect(30, 0, 300 - arg1 * 3, arg1 * 3 + 30, 64);
		this.field1493.centreString(180, 85, 16777215, arg0);
		this.field1457.draw(202, super.graphics, 171);
		if (!this.field1333) {
			return;
		}
		this.field1333 = false;
		if (!this.field1322) {
			this.field1458.draw(0, super.graphics, 0);
			this.field1459.draw(637, super.graphics, 0);
		}
		this.field1455.draw(128, super.graphics, 0);
		this.field1456.draw(202, super.graphics, 371);
		this.field1460.draw(0, super.graphics, 265);
		this.field1461.draw(562, super.graphics, 265);
		this.field1462.draw(128, super.graphics, 171);
		this.field1463.draw(562, super.graphics, 171);
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public void method477(int arg0, int arg1, int arg2, IfType arg3, int arg4, int arg5) {
		if (arg3.field75 != 0 || arg3.field90 == null || arg3.field89 || (arg1 < arg5 || arg0 < arg2 || arg1 > arg5 + arg3.field78 || arg0 > arg2 + arg3.field79)) {
			return;
		}
		int var7 = arg3.field90.length;
		for (int var8 = 0; var8 < var7; var8++) {
			int var9 = arg3.field91[var8] + arg5;
			int var10 = arg3.field92[var8] + arg2 - arg4;
			IfType var11 = IfType.list[arg3.field90[var8]];
			int var12 = var9 + var11.field81;
			int var13 = var10 + var11.field82;
			if ((var11.field86 >= 0 || var11.field113 != 0) && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
				if (var11.field86 >= 0) {
					this.field1546 = var11.field86;
				} else {
					this.field1546 = var11.field73;
				}
			}
			if (var11.field75 == 0) {
				this.method477(arg0, arg1, var13, var11, var11.field88, var12);
				if (var11.field87 > var11.field79) {
					this.method472(var11.field79, var11, arg0, var13, var12 + var11.field78, arg1, true, var11.field87);
				}
			} else {
				if (var11.field76 == 1 && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					boolean var14 = false;
					if (var11.field77 != 0) {
						var14 = this.method432(var11);
					}
					if (!var14) {
						this.field1530[this.field1396] = var11.field129;
						this.field1609[this.field1396] = 231;
						this.field1608[this.field1396] = var11.field73;
						this.field1396++;
					}
				}
				if (var11.field76 == 2 && this.field1612 == 0 && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					String var15 = var11.field126;
					if (var15.indexOf(" ") != -1) {
						var15 = var15.substring(0, var15.indexOf(" "));
					}
					this.field1530[this.field1396] = var15 + " @gre@" + var11.field127;
					this.field1609[this.field1396] = 274;
					this.field1608[this.field1396] = var11.field73;
					this.field1396++;
				}
				if (var11.field76 == 3 && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					this.field1530[this.field1396] = "Close";
					this.field1609[this.field1396] = 737;
					this.field1608[this.field1396] = var11.field73;
					this.field1396++;
				}
				if (var11.field76 == 4 && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					this.field1530[this.field1396] = var11.field129;
					this.field1609[this.field1396] = 435;
					this.field1608[this.field1396] = var11.field73;
					this.field1396++;
				}
				if (var11.field76 == 5 && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					this.field1530[this.field1396] = var11.field129;
					this.field1609[this.field1396] = 225;
					this.field1608[this.field1396] = var11.field73;
					this.field1396++;
				}
				if (var11.field76 == 6 && !this.resumedPauseButton && arg1 >= var12 && arg0 >= var13 && arg1 < var12 + var11.field78 && arg0 < var13 + var11.field79) {
					this.field1530[this.field1396] = var11.field129;
					this.field1609[this.field1396] = 997;
					this.field1608[this.field1396] = var11.field73;
					this.field1396++;
				}
				if (var11.field75 == 2) {
					int var16 = 0;
					for (int var17 = 0; var17 < var11.field79; var17++) {
						for (int var18 = 0; var18 < var11.field78; var18++) {
							int var19 = var12 + var18 * (var11.field99 + 32);
							int var20 = var13 + var17 * (var11.field100 + 32);
							if (var16 < 20) {
								var19 += var11.field102[var16];
								var20 += var11.field103[var16];
							}
							if (arg1 >= var19 && arg0 >= var20 && arg1 < var19 + 32 && arg0 < var20 + 32) {
								this.field1378 = var16;
								this.field1379 = var11.field73;
								if (var11.field69[var16] > 0) {
									ObjType var21 = ObjType.list(var11.field69[var16] - 1);
									if (this.field1227 == 1 && var11.field96) {
										if (var11.field73 != this.field1229 || var16 != this.field1228) {
											this.field1530[this.field1396] = "Use " + this.field1231 + " with @lre@" + var21.name;
											this.field1609[this.field1396] = 398;
											this.field1610[this.field1396] = var21.id;
											this.field1607[this.field1396] = var16;
											this.field1608[this.field1396] = var11.field73;
											this.field1396++;
										}
									} else if (this.field1612 != 1 || !var11.field96) {
										if (var11.field96) {
											for (int var22 = 4; var22 >= 3; var22--) {
												if (var21.iop != null && var21.iop[var22] != null) {
													this.field1530[this.field1396] = var21.iop[var22] + " @lre@" + var21.name;
													if (var22 == 3) {
														this.field1609[this.field1396] = 681;
													}
													if (var22 == 4) {
														this.field1609[this.field1396] = 100;
													}
													this.field1610[this.field1396] = var21.id;
													this.field1607[this.field1396] = var16;
													this.field1608[this.field1396] = var11.field73;
													this.field1396++;
												} else if (var22 == 4) {
													this.field1530[this.field1396] = "Drop @lre@" + var21.name;
													this.field1609[this.field1396] = 100;
													this.field1610[this.field1396] = var21.id;
													this.field1607[this.field1396] = var16;
													this.field1608[this.field1396] = var11.field73;
													this.field1396++;
												}
											}
										}
										if (var11.field97) {
											this.field1530[this.field1396] = "Use @lre@" + var21.name;
											this.field1609[this.field1396] = 102;
											this.field1610[this.field1396] = var21.id;
											this.field1607[this.field1396] = var16;
											this.field1608[this.field1396] = var11.field73;
											this.field1396++;
										}
										if (var11.field96 && var21.iop != null) {
											for (int var23 = 2; var23 >= 0; var23--) {
												if (var21.iop[var23] != null) {
													this.field1530[this.field1396] = var21.iop[var23] + " @lre@" + var21.name;
													if (var23 == 0) {
														this.field1609[this.field1396] = 694;
													}
													if (var23 == 1) {
														this.field1609[this.field1396] = 962;
													}
													if (var23 == 2) {
														this.field1609[this.field1396] = 795;
													}
													this.field1610[this.field1396] = var21.id;
													this.field1607[this.field1396] = var16;
													this.field1608[this.field1396] = var11.field73;
													this.field1396++;
												}
											}
										}
										if (var11.field104 != null) {
											for (int var24 = 4; var24 >= 0; var24--) {
												if (var11.field104[var24] != null) {
													this.field1530[this.field1396] = var11.field104[var24] + " @lre@" + var21.name;
													if (var24 == 0) {
														this.field1609[this.field1396] = 582;
													}
													if (var24 == 1) {
														this.field1609[this.field1396] = 113;
													}
													if (var24 == 2) {
														this.field1609[this.field1396] = 555;
													}
													if (var24 == 3) {
														this.field1609[this.field1396] = 331;
													}
													if (var24 == 4) {
														this.field1609[this.field1396] = 354;
													}
													this.field1610[this.field1396] = var21.id;
													this.field1607[this.field1396] = var16;
													this.field1608[this.field1396] = var11.field73;
													this.field1396++;
												}
											}
										}
										this.field1530[this.field1396] = "Examine @lre@" + var21.name;
										this.field1609[this.field1396] = 1328;
										this.field1610[this.field1396] = var21.id;
										this.field1607[this.field1396] = var16;
										this.field1608[this.field1396] = var11.field73;
										this.field1396++;
									} else if ((this.field1614 & 0x10) == 16) {
										this.field1530[this.field1396] = this.field1615 + " @lre@" + var21.name;
										this.field1609[this.field1396] = 563;
										this.field1610[this.field1396] = var21.id;
										this.field1607[this.field1396] = var16;
										this.field1608[this.field1396] = var11.field73;
										this.field1396++;
									}
								}
							}
							var16++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void method478() {
		for (MapSpotAnim var1 = (MapSpotAnim) this.field1340.head(); var1 != null; var1 = (MapSpotAnim) this.field1340.next(this.field1374)) {
			if (var1.field605 != this.field1478 || var1.field611) {
				var1.unlink();
			} else if (field1218 >= var1.field604) {
				var1.method150(this.field1391);
				if (var1.field611) {
					var1.unlink();
				} else {
					this.field1331.method61(var1.field608, var1, var1.field606, -1, var1.field607, 60, 0, var1.field605, false);
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void method479() {
		if (this.field1639 > 0) {
			this.method488();
			return;
		}
		this.field1280.setPixels(field1376);
		this.field1492.centreString(257, 144, 0, "Connection lost");
		this.field1492.centreString(256, 143, 16777215, "Connection lost");
		this.field1492.centreString(257, 159, 0, "Please wait - attempting to reestablish");
		this.field1492.centreString(256, 158, 16777215, "Please wait - attempting to reestablish");
		this.field1280.draw(4, super.graphics, 4);
		this.minimapState = 0;
		this.minimapFlagX = 0;
		ClientStream var1 = this.stream;
		this.ingame = false;
		this.method456(this.field1563, this.field1564, true);
		if (!this.ingame) {
			this.method488();
		}
		try {
			var1.close();
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("client.s(I)Ljava/net/Socket;")
	public Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@Override
	public void run() {
		if (this.field1591) {
			this.method493();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void method482() {
		if (this.field1490 == 0) {
			return;
		}
		PixFont var1 = this.field1492;
		int var2 = 0;
		if (this.field1219 != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (this.field1366[var3] != null) {
				int var4 = this.field1364[var3];
				String var5 = this.field1365[var3];
				byte var6 = 0;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					var6 = 1;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					var6 = 2;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(var5))) {
					int var7 = 329 - var2 * 13;
					var1.drawString(4, "From", 0, var7);
					var1.drawString(4, "From", 65535, var7 - 1);
					int var8 = var1.stringWid("From ") + 4;
					if (var6 == 1) {
						this.field1330[0].plotSprite(this.field1486, var8, var7 - 12);
						var8 += 14;
					}
					if (var6 == 2) {
						this.field1330[1].plotSprite(this.field1486, var8, var7 - 12);
						var8 += 14;
					}
					var1.drawString(var8, var5 + ": " + this.field1366[var3], 0, var7);
					var1.drawString(var8, var5 + ": " + this.field1366[var3], 65535, var7 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if (var4 == 5 && this.field1388 < 2) {
					int var9 = 329 - var2 * 13;
					var1.drawString(4, this.field1366[var3], 0, var9);
					var1.drawString(4, this.field1366[var3], 65535, var9 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if (var4 == 6 && this.field1388 < 2) {
					int var10 = 329 - var2 * 13;
					var1.drawString(4, "To " + var5 + ": " + this.field1366[var3], 0, var10);
					var1.drawString(4, "To " + var5 + ": " + this.field1366[var3], 65535, var10 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public void getPlayerPosExtended(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < this.field1539; var3++) {
			int var4 = this.field1540[var3];
			ClientPlayer var5 = this.field1536[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x80) == 128) {
				var6 += arg0.g1() << 8;
			}
			this.getPlayerPosExtended(var6, var4, var5, arg0);
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public void method484(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.v(I)V")
	public void method486() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IZ)V")
	public void method487(int arg0) {
		int[] var2 = this.field1443.data;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((this.field1243[arg0][var7][var5] & 0x18) == 0) {
					this.field1331.method85(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (this.field1243[arg0 + 1][var7][var5] & 0x8) != 0) {
					this.field1331.method85(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.field1443.setPixels(field1376);
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((this.field1243[arg0][var11][var10] & 0x18) == 0) {
					this.method449(var11, var8, var10, var9, arg0);
				}
				if (arg0 < 3 && (this.field1243[arg0 + 1][var11][var10] & 0x8) != 0) {
					this.method449(var11, var8, var10, var9, arg0 + 1);
				}
			}
		}
		this.field1280.setPixels(field1376);
		this.field1403 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = this.field1331.method79(this.field1478, var12, var13);
				if (var14 != 0) {
					int var15 = var14 >> 14 & 0x7FFF;
					int var16 = LocType.list(var15).mapfunction;
					if (var16 >= 0) {
						int var17 = var12;
						int var18 = var13;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							int[][] var19 = this.field1521[this.field1478].field1094;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var17 > 0 && var17 > var12 - 3 && (var19[var17 - 1][var18] & 0x280108) == 0) {
									var17--;
								}
								if (var21 == 1 && var17 < 103 && var17 < var12 + 3 && (var19[var17 + 1][var18] & 0x280180) == 0) {
									var17++;
								}
								if (var21 == 2 && var18 > 0 && var18 > var13 - 3 && (var19[var17][var18 - 1] & 0x280102) == 0) {
									var18--;
								}
								if (var21 == 3 && var18 < 103 && var18 < var13 + 3 && (var19[var17][var18 + 1] & 0x280120) == 0) {
									var18++;
								}
							}
						}
						this.field1620[this.field1403] = this.mapfunction[var16];
						this.field1404[this.field1403] = var17;
						this.field1405[this.field1403] = var18;
						this.field1403++;
					}
				}
			}
		}
		field1412++;
		if (field1412 > 112) {
			field1412 = 0;
			// ANTICHEAT_CYCLELOGIC3
			this.out.p1Enc(52);
			this.out.p1(50);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void method488() {
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var2) {
		}
		this.stream = null;
		this.ingame = false;
		this.field1421 = 0;
		this.field1563 = "";
		this.field1564 = "";
		this.method533();
		this.field1331.method50();
		for (int var1 = 0; var1 < 4; var1++) {
			this.field1521[var1].method352();
		}
		System.gc();
		this.method486();
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
	}

	@ObfuscatedName("client.a(ILnb;)V")
	public void method489(LocChange arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (arg0.field728 == 0) {
			var2 = this.field1331.method76(arg0.field727, arg0.field729, arg0.field730);
		}
		if (arg0.field728 == 1) {
			var2 = this.field1331.method77(arg0.field730, arg0.field729, arg0.field727, this.field1419);
		}
		if (arg0.field728 == 2) {
			var2 = this.field1331.method78(arg0.field727, arg0.field729, arg0.field730);
		}
		if (arg0.field728 == 3) {
			var2 = this.field1331.method79(arg0.field727, arg0.field729, arg0.field730);
		}
		if (var2 != 0) {
			int var6 = this.field1331.method80(arg0.field727, arg0.field729, arg0.field730, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}
		arg0.field731 = var3;
		arg0.field733 = var4;
		arg0.field732 = var5;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	@Override
	public void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var10 = null;
		for (LocChange var11 = (LocChange) this.field1644.head(); var11 != null; var11 = (LocChange) this.field1644.next(this.field1374)) {
			if (var11.field727 == arg3 && var11.field729 == arg5 && var11.field730 == arg0 && var11.field728 == arg6) {
				var10 = var11;
				break;
			}
		}
		if (var10 == null) {
			var10 = new LocChange();
			var10.field727 = arg3;
			var10.field728 = arg6;
			var10.field729 = arg5;
			var10.field730 = arg0;
			this.method489(var10);
			this.field1644.push(var10);
		}
		var10.field734 = arg2;
		var10.field736 = arg7;
		var10.field735 = arg4;
		var10.field737 = arg8;
		var10.field738 = arg1;
	}

	@ObfuscatedName("client.h(Z)V")
	public void method491() {
		if (this.field1490 == 0) {
			return;
		}
		int var1 = 0;
		if (this.field1219 != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (this.field1366[var2] != null) {
				int var3 = this.field1364[var2];
				String var4 = this.field1365[var2];
				if (var4 != null && var4.startsWith("@cr1@")) {
					var4 = var4.substring(5);
				}
				if (var4 != null && var4.startsWith("@cr2@")) {
					var4 = var4.substring(5);
				}
				if ((var3 == 3 || var3 == 7) && (var3 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(var4))) {
					int var5 = 329 - var1 * 13;
					if (super.mouseX > 4 && super.mouseY - 4 > var5 - 10 && super.mouseY - 4 <= var5 + 3) {
						int var6 = this.field1492.stringWid("From:  " + var4 + this.field1366[var2]) + 25;
						if (var6 > 450) {
							var6 = 450;
						}
						if (super.mouseX < var6 + 4) {
							if (this.field1282 >= 1) {
								this.field1530[this.field1396] = "Report abuse @whi@" + var4;
								this.field1609[this.field1396] = 2524;
								this.field1396++;
							}
							this.field1530[this.field1396] = "Add ignore @whi@" + var4;
							this.field1609[this.field1396] = 2047;
							this.field1396++;
							this.field1530[this.field1396] = "Add friend @whi@" + var4;
							this.field1609[this.field1396] = 2605;
							this.field1396++;
						}
					}
					var1++;
					if (var1 >= 5) {
						return;
					}
				}
				if ((var3 == 5 || var3 == 6) && this.field1388 < 2) {
					var1++;
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream method492(String arg0) throws IOException {
		if (this.field1469) {
			if (this.field1420 != null) {
				try {
					this.field1420.close();
				} catch (Exception var4) {
				}
				this.field1420 = null;
			}
			this.field1420 = this.openSocket(43595);
			this.field1420.setSoTimeout(10000);
			InputStream var2 = this.field1420.getInputStream();
			OutputStream var3 = this.field1420.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void method493() {
		this.field1392 = true;
		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (this.field1322) {
				this.field1382++;
				this.method494();
				this.method494();
				this.method536();
				var3++;
				if (var3 > 10) {
					long var5 = System.currentTimeMillis();
					int var7 = (int) (var5 - var1) / 10 - var4;
					var4 = 40 - var7;
					if (var4 < 5) {
						var4 = 5;
					}
					var3 = 0;
					var1 = var5;
				}
				try {
					Thread.sleep((long) var4);
				} catch (Exception var8) {
				}
			}
		} catch (Exception var9) {
		}
		this.field1392 = false;
	}

	@ObfuscatedName("client.g(B)V")
	public void method494() {
		if (this.field1430 != 9) {
			for (int var1 = 1; var1 > 0; var1++) {
			}
		}
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				this.field1393[var2 + 32512] = 255;
			}
		}
		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = var5 + (var6 << 7);
			this.field1393[var7] = 192;
		}
		for (int var8 = 1; var8 < 255; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = var9 + (var8 << 7);
				this.field1394[var10] = (this.field1393[var10 - 1] + this.field1393[var10 + 1] + this.field1393[var10 - 128] + this.field1393[var10 + 128]) / 4;
			}
		}
		this.field1479 += 128;
		if (this.field1479 > this.field1527.length) {
			this.field1479 -= this.field1527.length;
			int var11 = (int) (Math.random() * 12.0D);
			this.method508(this.field1645[var11]);
		}
		for (int var12 = 1; var12 < 255; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = var13 + (var12 << 7);
				int var15 = this.field1394[var14 + 128] - this.field1527[var14 + this.field1479 & this.field1527.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}
				this.field1393[var14] = var15;
			}
		}
		for (int var16 = 0; var16 < 255; var16++) {
			this.field1319[var16] = this.field1319[var16 + 1];
		}
		this.field1319[255] = (int) (Math.sin((double) field1218 / 14.0D) * 16.0D + Math.sin((double) field1218 / 15.0D) * 14.0D + Math.sin((double) field1218 / 16.0D) * 12.0D);
		if (this.field1410 > 0) {
			this.field1410 -= 4;
		}
		if (this.field1411 > 0) {
			this.field1411 -= 4;
		}
		if (this.field1410 != 0 || this.field1411 != 0) {
			return;
		}
		int var17 = (int) (Math.random() * 2000.0D);
		if (var17 == 0) {
			this.field1410 = 1024;
		}
		if (var17 == 1) {
			this.field1411 = 1024;
			return;
		}
	}

	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.x(I)V")
	public void method495() {
		if (this.field1421 == 0) {
			int var1 = super.sHei / 2 - 80;
			int var2 = super.sWid / 2 + 20;
			int var13 = var2 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var1 - 75 && super.mouseClickX <= var1 + 75 && super.mouseClickY >= var13 - 20 && super.mouseClickY <= var13 + 20) {
				this.field1421 = 3;
				this.field1371 = 0;
			}
			int var3 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var3 - 75 && super.mouseClickX <= var3 + 75 && super.mouseClickY >= var13 - 20 && super.mouseClickY <= var13 + 20) {
				this.field1348 = "";
				this.field1349 = "Enter your username & password.";
				this.field1421 = 2;
				this.field1371 = 0;
			}
		} else if (this.field1421 == 2) {
			int var4 = super.sWid / 2 - 40;
			int var14 = var4 + 30;
			int var15 = var14 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var15 - 15 && super.mouseClickY < var15) {
				this.field1371 = 0;
			}
			var4 = var15 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var4 - 15 && super.mouseClickY < var4) {
				this.field1371 = 1;
			}
			var4 += 15;
			int var5 = super.sHei / 2 - 80;
			int var6 = super.sWid / 2 + 50;
			int var16 = var6 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var5 - 75 && super.mouseClickX <= var5 + 75 && super.mouseClickY >= var16 - 20 && super.mouseClickY <= var16 + 20) {
				this.method456(this.field1563, this.field1564, false);
				if (this.ingame) {
					return;
				}
			}
			int var7 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var7 - 75 && super.mouseClickX <= var7 + 75 && super.mouseClickY >= var16 - 20 && super.mouseClickY <= var16 + 20) {
				this.field1421 = 0;
				this.field1563 = "";
				this.field1564 = "";
			}
			while (true) {
				while (true) {
					int var8 = this.pollKey();
					if (var8 == -1) {
						return;
					}
					boolean var9 = false;
					for (int var10 = 0; var10 < field1223.length(); var10++) {
						if (var8 == field1223.charAt(var10)) {
							var9 = true;
							break;
						}
					}
					if (this.field1371 == 0) {
						if (var8 == 8 && this.field1563.length() > 0) {
							this.field1563 = this.field1563.substring(0, this.field1563.length() - 1);
						}
						if (var8 == 9 || var8 == 10 || var8 == 13) {
							this.field1371 = 1;
						}
						if (var9) {
							this.field1563 = this.field1563 + (char) var8;
						}
						if (this.field1563.length() > 12) {
							this.field1563 = this.field1563.substring(0, 12);
						}
					} else if (this.field1371 == 1) {
						if (var8 == 8 && this.field1564.length() > 0) {
							this.field1564 = this.field1564.substring(0, this.field1564.length() - 1);
						}
						if (var8 == 9 || var8 == 10 || var8 == 13) {
							this.field1371 = 0;
						}
						if (var9) {
							this.field1564 = this.field1564 + (char) var8;
						}
						if (this.field1564.length() > 20) {
							this.field1564 = this.field1564.substring(0, 20);
						}
					}
				}
			}
		} else if (this.field1421 == 3) {
			int var11 = super.sHei / 2;
			int var12 = super.sWid / 2 + 50;
			int var17 = var12 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var11 - 75 && super.mouseClickX <= var11 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.field1421 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILib;)V")
	public void method496(int arg0, int arg1, Pix32 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 <= 4225 || var4 >= 90000) {
			this.method441(arg1, arg0, arg2);
			return;
		}
		int var5 = this.field1622 + this.field1633 & 0x7FF;
		int var6 = Model.field599[var5];
		int var7 = Model.field600[var5];
		int var8 = var6 * 256 / (this.field1586 + 256);
		int var9 = var7 * 256 / (this.field1586 + 256);
		int var10 = arg1 * var8 + arg0 * var9 >> 16;
		int var11 = arg1 * var9 - arg0 * var8 >> 16;
		double var12 = Math.atan2((double) var10, (double) var11);
		int var14 = (int) (Math.sin(var12) * 63.0D);
		int var15 = (int) (Math.cos(var12) * 57.0D);
		this.mapedge.rotatePlotSprite(var14 + 94 + 4 - 10, 83 - var15 - 20, var12);
	}

	@ObfuscatedName("client.h(B)V")
	public void method497() {
		for (LocChange var1 = (LocChange) this.field1644.head(); var1 != null; var1 = (LocChange) this.field1644.next(this.field1374)) {
			if (var1.field738 == -1) {
				var1.field737 = 0;
				this.method489(var1);
			} else {
				var1.unlink();
			}
		}
	}

	@Override
	public String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IZI)V")
	public void method498(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.field1366[var4] != null) {
				int var5 = this.field1364[var4];
				int var6 = this.field1498 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}
				String var7 = this.field1365[var4];
				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
				}
				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
				}
				if (var5 == 0) {
					var3++;
				}
				if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.field1383 == 0 || this.field1383 == 1 && this.method430(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field1668.field457)) {
						if (this.field1282 >= 1) {
							this.field1530[this.field1396] = "Report abuse @whi@" + var7;
							this.field1609[this.field1396] = 524;
							this.field1396++;
						}
						this.field1530[this.field1396] = "Add ignore @whi@" + var7;
						this.field1609[this.field1396] = 47;
						this.field1396++;
						this.field1530[this.field1396] = "Add friend @whi@" + var7;
						this.field1609[this.field1396] = 605;
						this.field1396++;
					}
					var3++;
				}
				if ((var5 == 3 || var5 == 7) && this.field1490 == 0 && (var5 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (this.field1282 >= 1) {
							this.field1530[this.field1396] = "Report abuse @whi@" + var7;
							this.field1609[this.field1396] = 524;
							this.field1396++;
						}
						this.field1530[this.field1396] = "Add ignore @whi@" + var7;
						this.field1609[this.field1396] = 47;
						this.field1396++;
						this.field1530[this.field1396] = "Add friend @whi@" + var7;
						this.field1609[this.field1396] = 605;
						this.field1396++;
					}
					var3++;
				}
				if (var5 == 4 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						this.field1530[this.field1396] = "Accept trade @whi@" + var7;
						this.field1609[this.field1396] = 507;
						this.field1396++;
					}
					var3++;
				}
				if ((var5 == 5 || var5 == 6) && this.field1490 == 0 && this.field1388 < 2) {
					var3++;
				}
				if (var5 == 8 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						this.field1530[this.field1396] = "Accept duel @whi@" + var7;
						this.field1609[this.field1396] = 957;
						this.field1396++;
					}
					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void method499() {
		this.field1679 = new Pix8(this.field1358, "titlebox", 0);
		this.field1680 = new Pix8(this.field1358, "titlebutton", 0);
		this.field1645 = new Pix8[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(this.getParameter("fl_icon"));
		} catch (Exception var18) {
		}
		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				this.field1645[var2] = new Pix8(this.field1358, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				this.field1645[var3] = new Pix8(this.field1358, "runes", (var3 & 0x3) + 12);
			}
		}
		this.field1307 = new Pix32(128, 265);
		this.field1308 = new Pix32(128, 265);
		for (int var4 = 0; var4 < 33920; var4++) {
			this.field1307.data[var4] = this.field1458.data[var4];
		}
		for (int var5 = 0; var5 < 33920; var5++) {
			this.field1308.data[var5] = this.field1459.data[var5];
		}
		this.field1353 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			this.field1353[var6] = var6 * 262144;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			this.field1353[var7 + 64] = var7 * 1024 + 16711680;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			this.field1353[var8 + 128] = var8 * 4 + 16776960;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			this.field1353[var9 + 192] = 16777215;
		}
		this.field1354 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			this.field1354[var10] = var10 * 1024;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			this.field1354[var11 + 64] = var11 * 4 + 65280;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			this.field1354[var12 + 128] = var12 * 262144 + 65535;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			this.field1354[var13 + 192] = 16777215;
		}
		this.field1355 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			this.field1355[var14] = var14 * 4;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			this.field1355[var15 + 64] = var15 * 262144 + 255;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			this.field1355[var16 + 128] = var16 * 1024 + 16711935;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			this.field1355[var17 + 192] = 16777215;
		}
		this.field1352 = new int[256];
		this.field1527 = new int[32768];
		this.field1528 = new int[32768];
		this.method508(null);
		this.field1393 = new int[32768];
		this.field1394 = new int[32768];
		this.messageBox("Connecting to fileserver", 10);
		if (!this.field1322) {
			this.field1591 = true;
			this.field1322 = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void method500() {
		if (this.field1281 != null) {
			return;
		}
		this.method522();
		super.field15 = null;
		this.field1455 = null;
		this.field1456 = null;
		this.field1457 = null;
		this.field1458 = null;
		this.field1459 = null;
		this.field1460 = null;
		this.field1461 = null;
		this.field1462 = null;
		this.field1463 = null;
		this.field1281 = new PixMap(96, field1356, 479, this.getBaseComponent(field1518));
		this.field1279 = new PixMap(156, field1356, 172, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.mapback.plotSprite(this.field1486, 0, 0);
		this.field1278 = new PixMap(261, field1356, 190, this.getBaseComponent(field1518));
		this.field1280 = new PixMap(334, field1356, 512, this.getBaseComponent(field1518));
		Pix2D.cls();
		this.field1406 = new PixMap(50, field1356, 496, this.getBaseComponent(field1518));
		this.field1407 = new PixMap(37, field1356, 269, this.getBaseComponent(field1518));
		this.field1408 = new PixMap(45, field1356, 249, this.getBaseComponent(field1518));
		this.field1333 = true;
	}

	@ObfuscatedName("client.A(I)Ljava/lang/String;")
	public String method501() {
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public void getPlayerPosOldVis(Packet arg0, int arg1) {
		int var3 = arg0.gBit(8);
		if (var3 < this.field1537) {
			for (int var4 = var3; var4 < this.field1537; var4++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.field1538[var4];
			}
		}
		if (var3 > this.field1537) {
			signlink.reporterror(this.field1563 + " Too many players");
			throw new RuntimeException("eek");
		}
		this.field1537 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.field1538[var5];
			ClientPlayer var7 = this.field1536[var6];
			int var8 = arg0.gBit(1);
			if (var8 == 0) {
				this.field1538[this.field1537++] = var6;
				var7.field442 = field1218;
			} else {
				int var9 = arg0.gBit(2);
				if (var9 == 0) {
					this.field1538[this.field1537++] = var6;
					var7.field442 = field1218;
					this.field1540[this.field1539++] = var6;
				} else if (var9 == 1) {
					this.field1538[this.field1537++] = var6;
					var7.field442 = field1218;
					int var10 = arg0.gBit(3);
					var7.method111(var10, false);
					int var11 = arg0.gBit(1);
					if (var11 == 1) {
						this.field1540[this.field1539++] = var6;
					}
				} else if (var9 == 2) {
					this.field1538[this.field1537++] = var6;
					var7.field442 = field1218;
					int var12 = arg0.gBit(3);
					var7.method111(var12, true);
					int var13 = arg0.gBit(3);
					var7.method111(var13, true);
					int var14 = arg0.gBit(1);
					if (var14 == 1) {
						this.field1540[this.field1539++] = var6;
					}
				} else if (var9 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public void method503() {
		int var1 = this.field1493.stringWid("Choose Option");
		for (int var2 = 0; var2 < this.field1396; var2++) {
			int var3 = this.field1493.stringWid(this.field1530[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}
		var1 += 8;
		int var4 = this.field1396 * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var5 = super.mouseClickX - var1 / 2 - 4;
			if (var5 + var1 > 512) {
				var5 = 512 - var1;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			int var6 = super.mouseClickY - 4;
			if (var6 + var4 > 334) {
				var6 = 334 - var4;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			this.field1267 = true;
			this.field1670 = 0;
			this.field1671 = var5;
			this.field1672 = var6;
			this.field1673 = var1;
			this.field1674 = this.field1396 * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var7 = super.mouseClickX - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 + var1 > 190) {
				var7 = 190 - var1;
			}
			int var8 = super.mouseClickY - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 + var4 > 261) {
				var8 = 261 - var4;
			}
			this.field1267 = true;
			this.field1670 = 1;
			this.field1671 = var7;
			this.field1672 = var8;
			this.field1673 = var1;
			this.field1674 = this.field1396 * 15 + 22;
		}
		if (super.mouseClickX <= 17 || super.mouseClickY <= 357 || super.mouseClickX >= 496 || super.mouseClickY >= 453) {
			return;
		}
		int var9 = super.mouseClickX - var1 / 2 - 17;
		if (var9 < 0) {
			var9 = 0;
		} else if (var9 + var1 > 479) {
			var9 = 479 - var1;
		}
		int var10 = super.mouseClickY - 357;
		if (var10 < 0) {
			var10 = 0;
		} else if (var10 + var4 > 96) {
			var10 = 96 - var4;
		}
		this.field1267 = true;
		this.field1670 = 2;
		this.field1671 = var9;
		this.field1672 = var10;
		this.field1673 = var1;
		this.field1674 = this.field1396 * 15 + 22;
	}

	@ObfuscatedName("client.a(JZ)V")
	public void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.field1377 >= 100) {
			this.method457(0, "", "Your ignore list is full. Max of 100 hit");
			return;
		}
		String var3 = JString.toScreenName(JString.toRawUsername(arg0));
		for (int var4 = 0; var4 < this.field1377; var4++) {
			if (this.field1233[var4] == arg0) {
				this.method457(0, "", var3 + " is already on your ignore list");
				return;
			}
		}
		for (int var5 = 0; var5 < this.field1531; var5++) {
			if (this.field1575[var5] == arg0) {
				this.method457(0, "", "Please remove " + var3 + " from your friend list first");
				return;
			}
		}
		this.field1233[this.field1377++] = arg0;
		this.redrawSidebar = true;
		// IGNORELIST_ADD
		this.out.p1Enc(255);
		this.out.p8(arg0);
	}

	@Override
	public void init() {
		field1653 = Integer.parseInt(this.getParameter("nodeid"));
		portOff = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method462();
		} else {
			method481();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1655 = false;
		} else {
			field1655 = true;
		}
		this.method2();
	}

	@ObfuscatedName("client.i(Z)V")
	public void method506() {
		this.field1278.setPixels(field1376);
		Pix3D.scanline = this.field1660;
		this.invback.plotSprite(this.field1486, 0, 0);
		if (this.sideModalId != -1) {
			this.drawInterface(0, IfType.list[this.sideModalId], 0, 0);
		} else if (this.field1370[this.sideTab] != -1) {
			this.drawInterface(0, IfType.list[this.field1370[this.sideTab]], 0, 0);
		}
		if (this.field1267 && this.field1670 == 1) {
			this.method423();
		}
		this.field1278.draw(553, super.graphics, 205);
		this.field1280.setPixels(field1376);
		Pix3D.scanline = this.field1661;
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public void getNpcPosExtended(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < this.field1539; var3++) {
			int var4 = this.field1540[var3];
			ClientNpc var5 = this.field1675[var4];
			int var6 = arg1.g1();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.g1();
				int var8 = arg1.g1();
				var5.method114(field1218, var7, var8);
				var5.field416 = field1218 + 300;
				var5.field417 = arg1.g1();
				var5.field418 = arg1.g1();
			}
			if ((var6 & 0x2) == 2) {
				int var9 = arg1.g2();
				if (var9 == 65535) {
					var9 = -1;
				}
				if (var9 == var5.field425) {
					var5.field429 = 0;
				}
				int var10 = arg1.g1();
				if (var9 == var5.field425 && var9 != -1) {
					int var11 = SeqType.list[var9].duplicatebehaviour;
					if (var11 == 1) {
						var5.field426 = 0;
						var5.field427 = 0;
						var5.field428 = var10;
						var5.field429 = 0;
					}
					if (var11 == 2) {
						var5.field429 = 0;
					}
				} else if (var9 == -1 || var5.field425 == -1 || SeqType.list[var9].priority >= SeqType.list[var5.field425].priority) {
					var5.field425 = var9;
					var5.field426 = 0;
					var5.field427 = 0;
					var5.field428 = var10;
					var5.field429 = 0;
					var5.field451 = var5.field446;
				}
			}
			if ((var6 & 0x4) == 4) {
				var5.field419 = arg1.g2();
				if (var5.field419 == 65535) {
					var5.field419 = -1;
				}
			}
			if ((var6 & 0x8) == 8) {
				var5.field409 = arg1.gjstr();
				var5.field410 = 100;
			}
			if ((var6 & 0x10) == 16) {
				int var12 = arg1.g1();
				int var13 = arg1.g1();
				var5.method114(field1218, var12, var13);
				var5.field416 = field1218 + 300;
				var5.field417 = arg1.g1();
				var5.field418 = arg1.g1();
			}
			if ((var6 & 0x20) == 32) {
				var5.field453 = NpcType.list(arg1.g2());
				var5.field401 = var5.field453.size;
				var5.field445 = var5.field453.turnspeed;
				var5.field404 = var5.field453.walkanim;
				var5.field405 = var5.field453.walkanim_b;
				var5.field406 = var5.field453.walkanim_r;
				var5.field407 = var5.field453.walkanim_l;
				var5.field402 = var5.field453.readyanim;
			}
			if ((var6 & 0x40) == 64) {
				var5.field430 = arg1.g2();
				int var14 = arg1.g4();
				var5.field434 = var14 >> 16;
				var5.field433 = field1218 + (var14 & 0xFFFF);
				var5.field431 = 0;
				var5.field432 = 0;
				if (var5.field433 > field1218) {
					var5.field431 = -1;
				}
				if (var5.field430 == 65535) {
					var5.field430 = -1;
				}
			}
			if ((var6 & 0x80) == 128) {
				var5.field420 = arg1.g2();
				var5.field421 = arg1.g2();
			}
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public void method508(Pix8 arg0) {
		for (int var2 = 0; var2 < this.field1527.length; var2++) {
			this.field1527[var2] = 0;
		}
		for (int var3 = 0; var3 < 5000; var3++) {
			int var4 = (int) (Math.random() * 128.0D * (double) 256);
			this.field1527[var4] = (int) (Math.random() * 256.0D);
		}
		for (int var5 = 0; var5 < 20; var5++) {
			for (int var6 = 1; var6 < 255; var6++) {
				for (int var7 = 1; var7 < 127; var7++) {
					int var8 = var7 + (var6 << 7);
					this.field1528[var8] = (this.field1527[var8 - 1] + this.field1527[var8 + 1] + this.field1527[var8 - 128] + this.field1527[var8 + 128]) / 4;
				}
			}
			int[] var9 = this.field1527;
			this.field1527 = this.field1528;
			this.field1528 = var9;
		}
		if (arg0 == null) {
			return;
		}
		int var10 = 0;
		for (int var11 = 0; var11 < arg0.hi; var11++) {
			for (int var12 = 0; var12 < arg0.wi; var12++) {
				if (arg0.data[var10++] != 0) {
					int var13 = var12 + arg0.xof + 16;
					int var14 = var11 + arg0.yof + 16;
					int var15 = var13 + (var14 << 7);
					this.field1527[var15] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLab;Llb;)V")
	public void getPlayerPosExtended(int arg0, int arg1, ClientPlayer arg2, Packet arg3) {
		if (this.field1252 != 3) {
			return;
		}
		if ((arg0 & 0x1) == 1) {
			int var5 = arg3.g1();
			byte[] var6 = new byte[var5];
			Packet var7 = new Packet(var6, (byte) 1);
			arg3.gdata(var5, var6);
			this.field1541[arg1] = var7;
			arg2.method116(var7, this.field1217);
		}
		if ((arg0 & 0x2) == 2) {
			int var8 = arg3.g2();
			if (var8 == 65535) {
				var8 = -1;
			}
			if (var8 == arg2.field425) {
				arg2.field429 = 0;
			}
			int var9 = arg3.g1();
			if (var8 == arg2.field425 && var8 != -1) {
				int var10 = SeqType.list[var8].duplicatebehaviour;
				if (var10 == 1) {
					arg2.field426 = 0;
					arg2.field427 = 0;
					arg2.field428 = var9;
					arg2.field429 = 0;
				}
				if (var10 == 2) {
					arg2.field429 = 0;
				}
			} else if (var8 == -1 || arg2.field425 == -1 || SeqType.list[var8].priority >= SeqType.list[arg2.field425].priority) {
				arg2.field425 = var8;
				arg2.field426 = 0;
				arg2.field427 = 0;
				arg2.field428 = var9;
				arg2.field429 = 0;
				arg2.field451 = arg2.field446;
			}
		}
		if ((arg0 & 0x4) == 4) {
			arg2.field419 = arg3.g2();
			if (arg2.field419 == 65535) {
				arg2.field419 = -1;
			}
		}
		if ((arg0 & 0x8) == 8) {
			arg2.field409 = arg3.gjstr();
			arg2.field411 = 0;
			arg2.field412 = 0;
			arg2.field410 = 150;
			this.method457(2, arg2.field457, arg2.field409);
		}
		if ((arg0 & 0x10) == 16) {
			int var11 = arg3.g1();
			int var12 = arg3.g1();
			arg2.method114(field1218, var11, var12);
			arg2.field416 = field1218 + 300;
			arg2.field417 = arg3.g1();
			arg2.field418 = arg3.g1();
		}
		if ((arg0 & 0x20) == 32) {
			arg2.field420 = arg3.g2();
			arg2.field421 = arg3.g2();
		}
		if ((arg0 & 0x40) == 64) {
			int var13 = arg3.g2();
			int var14 = arg3.g1();
			int var15 = arg3.g1();
			int var16 = arg3.data;
			if (arg2.field457 != null && arg2.field458) {
				long var17 = JString.toUserhash(arg2.field457);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < this.field1377; var20++) {
						if (this.field1233[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}
				if (!var19 && this.field1306 == 0) {
					try {
						String var21 = WordPack.unpack(var15, arg3);
						String var22 = WordFilter.filter(var21);
						arg2.field409 = var22;
						arg2.field411 = var13 >> 8;
						arg2.field412 = var13 & 0xFF;
						arg2.field410 = 150;
						if (var14 == 2 || var14 == 3) {
							this.method457(1, "@cr2@" + arg2.field457, var22);
						} else if (var14 == 1) {
							this.method457(1, "@cr1@" + arg2.field457, var22);
						} else {
							this.method457(2, arg2.field457, var22);
						}
					} catch (Exception var27) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg3.data = var16 + var15;
		}
		if ((arg0 & 0x100) == 256) {
			arg2.field430 = arg3.g2();
			int var24 = arg3.g4();
			arg2.field434 = var24 >> 16;
			arg2.field433 = field1218 + (var24 & 0xFFFF);
			arg2.field431 = 0;
			arg2.field432 = 0;
			if (arg2.field433 > field1218) {
				arg2.field431 = -1;
			}
			if (arg2.field430 == 65535) {
				arg2.field430 = -1;
			}
		}
		if ((arg0 & 0x200) == 512) {
			arg2.field435 = arg3.g1();
			arg2.field437 = arg3.g1();
			arg2.field436 = arg3.g1();
			arg2.field438 = arg3.g1();
			arg2.field439 = arg3.g2() + field1218;
			arg2.field440 = arg3.g2() + field1218;
			arg2.field441 = arg3.g1();
			arg2.method112();
		}
		if ((arg0 & 0x400) == 1024) {
			int var25 = arg3.g1();
			int var26 = arg3.g1();
			arg2.method114(field1218, var25, var26);
			arg2.field416 = field1218 + 300;
			arg2.field417 = arg3.g1();
			arg2.field418 = arg3.g1();
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.field1531 >= 100 && this.field1224 != 1) {
			this.method457(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else if (this.field1531 >= 200) {
			this.method457(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else {
			String var3 = JString.toScreenName(JString.toRawUsername(arg0));
			for (int var4 = 0; var4 < this.field1531; var4++) {
				if (this.field1575[var4] == arg0) {
					this.method457(0, "", var3 + " is already on your friend list");
					return;
				}
			}
			for (int var5 = 0; var5 < this.field1377; var5++) {
				if (this.field1233[var5] == arg0) {
					this.method457(0, "", "Please remove " + var3 + " from your ignore list first");
					return;
				}
			}
			if (!var3.equals(field1668.field457)) {
				this.field1249[this.field1531] = var3;
				this.field1575[this.field1531] = arg0;
				this.field1489[this.field1531] = 0;
				this.field1531++;
				this.redrawSidebar = true;
				// FRIENDLIST_ADD
				this.out.p1Enc(13);
				this.out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	@Override
	public void maindraw() {
		if (this.field1451 || this.field1590 || this.field1314) {
			this.method516();
			return;
		}
		field1258++;
		if (this.ingame) {
			this.method550();
		} else {
			this.method461(false);
		}
		this.field1409 = 0;
	}

	@ObfuscatedName("client.i(B)V")
	public void method511() {
		this.field1279.setPixels(field1376);
		if (this.minimapState == 2) {
			byte[] var1 = this.mapback.data;
			int[] var2 = Pix2D.pixels;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}
			this.compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, this.field1470, 25, this.field1299, this.field1622, 0);
			this.field1280.setPixels(field1376);
			return;
		}
		int var5 = this.field1622 + this.field1633 & 0x7FF;
		int var6 = field1668.field397 / 32 + 48;
		int var7 = 464 - field1668.field398 / 32;
		this.field1443.scanlineRotatePlotSprite(this.field1586 + 256, var6, 146, 151, 25, this.field1566, var7, this.field1552, var5, 5);
		if (this.field1214 != 5) {
			return;
		}
		this.compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, this.field1470, 25, this.field1299, this.field1622, 0);
		for (int var8 = 0; var8 < this.field1403; var8++) {
			int var9 = this.field1404[var8] * 4 + 2 - field1668.field397 / 32;
			int var10 = this.field1405[var8] * 4 + 2 - field1668.field398 / 32;
			this.method441(var10, var9, this.field1620[var8]);
		}
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				LinkList var13 = this.field1232[this.field1478][var11][var12];
				if (var13 != null) {
					int var14 = var11 * 4 + 2 - field1668.field397 / 32;
					int var15 = var12 * 4 + 2 - field1668.field398 / 32;
					this.method441(var15, var14, this.mapdots0);
				}
			}
		}
		for (int var16 = 0; var16 < this.npcCount; var16++) {
			ClientNpc var17 = this.field1675[this.npcIds[var16]];
			if (var17 != null && var17.method113() && var17.field453.minimap) {
				int var18 = var17.field397 / 32 - field1668.field397 / 32;
				int var19 = var17.field398 / 32 - field1668.field398 / 32;
				this.method441(var19, var18, this.mapdots1);
			}
		}
		for (int var20 = 0; var20 < this.field1537; var20++) {
			ClientPlayer var21 = this.field1536[this.field1538[var20]];
			if (var21 != null && var21.method113()) {
				int var22 = var21.field397 / 32 - field1668.field397 / 32;
				int var23 = var21.field398 / 32 - field1668.field398 / 32;
				boolean var24 = false;
				long var25 = JString.toUserhash(var21.field457);
				for (int var27 = 0; var27 < this.field1531; var27++) {
					if (var25 == this.field1575[var27] && this.field1489[var27] != 0) {
						var24 = true;
						break;
					}
				}
				if (var24) {
					this.method441(var23, var22, this.mapdots3);
				} else {
					this.method441(var23, var22, this.mapdots2);
				}
			}
		}
		if (this.field1616 != 0 && field1218 % 20 < 10) {
			if (this.field1616 == 1 && this.field1336 >= 0 && this.field1336 < this.field1675.length) {
				ClientNpc var28 = this.field1675[this.field1336];
				if (var28 != null) {
					int var29 = var28.field397 / 32 - field1668.field397 / 32;
					int var30 = var28.field398 / 32 - field1668.field398 / 32;
					this.method496(var29, var30, this.mapmarker1);
				}
			}
			if (this.field1616 == 2) {
				int var31 = (this.field1578 - this.field1471) * 4 + 2 - field1668.field397 / 32;
				int var32 = (this.field1579 - this.field1472) * 4 + 2 - field1668.field398 / 32;
				this.method496(var31, var32, this.mapmarker1);
			}
			if (this.field1616 == 10 && this.field1597 >= 0 && this.field1597 < this.field1536.length) {
				ClientPlayer var33 = this.field1536[this.field1597];
				if (var33 != null) {
					int var34 = var33.field397 / 32 - field1668.field397 / 32;
					int var35 = var33.field398 / 32 - field1668.field398 / 32;
					this.method496(var34, var35, this.mapmarker1);
				}
			}
		}
		if (this.minimapFlagX != 0) {
			int var36 = this.minimapFlagX * 4 + 2 - field1668.field397 / 32;
			int var37 = this.field1442 * 4 + 2 - field1668.field398 / 32;
			this.method441(var37, var36, this.mapmarker0);
		}
		Pix2D.fillRect(3, 16777215, 3, 97, 78);
		this.field1280.setPixels(field1376);
	}

	@ObfuscatedName("client.j(Z)V")
	public void method512() {
		for (int var1 = -1; var1 < this.field1537; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = this.field1535;
			} else {
				var2 = this.field1538[var1];
			}
			ClientPlayer var3 = this.field1536[var2];
			if (var3 != null) {
				this.method544(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public void method513(boolean arg0) {
		if (field1668.field397 >> 7 == this.minimapFlagX && field1668.field398 >> 7 == this.field1442) {
			this.minimapFlagX = 0;
			field1397++;
			if (field1397 > 122) {
				field1397 = 0;
				// ANTICHEAT_CYCLELOGIC6
				this.out.p1Enc(188);
				this.out.p1(62);
			}
		}
		int var2 = this.field1537;
		if (arg0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			ClientPlayer var4;
			int var5;
			if (arg0) {
				var4 = field1668;
				var5 = this.field1535 << 14;
			} else {
				var4 = this.field1536[this.field1538[var3]];
				var5 = this.field1538[var3] << 14;
			}
			if (var4 != null && var4.method113()) {
				var4.field477 = false;
				if ((lowMem && this.field1537 > 50 || this.field1537 > 200) && !arg0 && var4.field422 == var4.field402) {
					var4.field477 = true;
				}
				int var6 = var4.field397 >> 7;
				int var7 = var4.field398 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field472 == null || field1218 < var4.field467 || field1218 >= var4.field468) {
						if ((var4.field397 & 0x7F) == 64 && (var4.field398 & 0x7F) == 64) {
							if (this.field1436[var6][var7] == this.field1284) {
								continue;
							}
							this.field1436[var6][var7] = this.field1284;
						}
						var4.field466 = this.method458(var4.field397, var4.field398, this.field1478);
						this.field1331.method61(var4.field466, var4, var4.field397, var5, var4.field398, 60, var4.field399, this.field1478, var4.field400);
					} else {
						var4.field477 = false;
						var4.field466 = this.method458(var4.field397, var4.field398, this.field1478);
						this.field1331.method62(var4.field476, var4.field399, var4.field475, var4.field466, var4.field473, var4.field397, this.field1478, var4, var4.field398, var4.field474, var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void method514() {
		this.field1387 = true;
		for (int var1 = 0; var1 < 7; var1++) {
			this.field1226[var1] = -1;
			for (int var2 = 0; var2 < IdkType.numDefinitions; var2++) {
				if (!IdkType.list[var2].disable && IdkType.list[var2].part == var1 + (this.field1398 ? 0 : 7)) {
					this.field1226[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public void getSpecialArea() {
		this.field1306 = 0;
		int var1 = (field1668.field397 >> 7) + this.field1471;
		int var2 = (field1668.field398 >> 7) + this.field1472;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			this.field1306 = 1;
		}
		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			this.field1306 = 1;
		}
		if (this.field1306 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			this.field1306 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void method516() {
		Graphics var1 = this.getBaseComponent(field1518).getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		this.setFramerate();
		if (this.field1590) {
			this.field1322 = false;
			var1.setFont(new Font("Helvetica", 1, 16));
			var1.setColor(Color.yellow);
			byte var2 = 35;
			var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
			int var4 = var2 + 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, 85);
			int var5 = var4 + 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
			int var6 = var5 + 30;
			var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
			int var7 = var6 + 30;
			var1.drawString("3: Try using a different game-world", 30, 195);
			int var9 = var7 + 30;
			var1.drawString("4: Try rebooting your computer", 30, 225);
			int var11 = var9 + 30;
			var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
		}
		if (this.field1314) {
			this.field1322 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.field1451) {
			return;
		}
		this.field1322 = false;
		var1.setColor(Color.yellow);
		byte var3 = 35;
		var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
		int var8 = var3 + 50;
		var1.setColor(Color.white);
		var1.drawString("To fix this try the following (in order):", 30, 85);
		int var10 = var8 + 50;
		var1.setColor(Color.white);
		var1.setFont(new Font("Helvetica", 1, 12));
		var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
		int var12 = var10 + 30;
		var1.drawString("2: Try rebooting your computer, and reloading", 30, 165);
		int var13 = var12 + 30;
	}

	@ObfuscatedName("client.b(IZI)V")
	public void method517(boolean arg0, int arg1) {
		signlink.midivol = arg1;
		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.b(IBLlb;)V")
	public void getPlayerPos(int arg0, Packet arg1) {
		this.entityRemovalCount = 0;
		this.field1539 = 0;
		this.getPlayerPosLocal(arg1, arg0);
		this.getPlayerPosOldVis(arg1, arg0);
		this.getPlayerPosNewVis(arg1, arg0, this.field1222);
		this.getPlayerPosExtended(arg1, arg0);
		if (this.field1503 != -44) {
			return;
		}
		for (int var3 = 0; var3 < this.entityRemovalCount; var3++) {
			int var4 = this.entityRemovalIds[var3];
			if (this.field1536[var4].field442 != field1218) {
				this.field1536[var4] = null;
			}
		}
		if (arg1.data != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.data + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.field1537; var5++) {
			if (this.field1536[this.field1538[var5]] == null) {
				signlink.reporterror(this.field1563 + " null entry in pl list - pos:" + var5 + " size:" + this.field1537);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.F(I)Z")
	public boolean tcpIn() {
		if (this.stream == null) {
			return false;
		}
		try {
			int var1 = this.stream.available();
			if (var1 == 0) {
				return false;
			}
			if (this.ptype == -1) {
				this.stream.read(this.in.pos, 0, 1);
				this.ptype = this.in.pos[0] & 0xFF;
				if (this.randomIn != null) {
					this.ptype = this.ptype - this.randomIn.takeNextValue() & 0xFF;
				}
				this.psize = Protocol.SERVERPROT_SIZE[this.ptype];
				var1--;
			}
			if (this.psize == -1) {
				if (var1 <= 0) {
					return false;
				}
				this.stream.read(this.in.pos, 0, 1);
				this.psize = this.in.pos[0] & 0xFF;
				var1--;
			}
			if (this.psize == -2) {
				if (var1 <= 1) {
					return false;
				}
				this.stream.read(this.in.pos, 0, 2);
				this.in.data = 0;
				this.psize = this.in.g2();
				var1 -= 2;
			}
			if (var1 < this.psize) {
				return false;
			}
			this.in.data = 0;
			this.stream.read(this.in.pos, 0, this.psize);
			this.field1637 = 0;
			this.ptype2 = this.ptype1;
			this.ptype1 = this.ptype0;
			this.ptype0 = this.ptype;

			if (this.ptype == 207) {
				// SET_MULTIWAY
				this.inMultizone = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 241) {
				// IF_SETTAB_ACTIVE
				this.sideTab = this.in.g1();
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 203) {
				// VARP_SMALL
				int var2 = this.in.g2();
				byte var3 = this.in.g1b();
				this.field1588[var2] = var3;
				if (this.field1523[var2] != var3) {
					this.field1523[var2] = var3;
					this.clientVar(var2);
					this.redrawSidebar = true;
					if (this.tutComId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 115) {
				// UNSET_MAP_FLAG
				this.minimapFlagX = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 64) {
				// CAM_SHAKE
				int var4 = this.in.g1();
				int var5 = this.in.g1();
				int var6 = this.in.g1();
				int var7 = this.in.g1();
				this.field1577[var4] = true;
				this.field1414[var4] = var5;
				this.field1320[var4] = var6;
				this.field1260[var4] = var7;
				this.field1384[var4] = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 95 || this.ptype == 176 || this.ptype == 219 || this.ptype == 85 || this.ptype == 107 || this.ptype == 52 || this.ptype == 81 || this.ptype == 48 || this.ptype == 173 || this.ptype == 138) {
				this.zonePacket(this.ptype, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 211) {
				// IF_OPENMAIN
				int var8 = this.in.g2();
				this.ifAnimReset(var8);
				if (this.sideModalId != -1) {
					this.sideModalId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatComId != -1) {
					this.chatComId = -1;
					this.redrawChatback = true;
				}
				if (this.dialogInputOpen) {
					this.dialogInputOpen = false;
					this.redrawChatback = true;
				}
				this.mainModalId = var8;
				this.resumedPauseButton = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 192) {
				// IF_SETPLAYERHEAD
				int var9 = this.in.g2();
				IfType.list[var9].model1Type = 3;
				IfType.list[var9].field118 = (field1668.field462[0] << 24) + (field1668.field462[4] << 18) + (field1668.field461[0] << 12) + (field1668.field461[8] << 6) + field1668.field461[11];
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 210) {
				// P_COUNTDIALOG
				this.field1681 = false;
				this.dialogInputOpen = true;
				this.field1598 = "";
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 130) {
				// TUT_OPEN
				int var10 = this.in.g2b();
				this.tutComId = var10;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 167) {
				// PLAYER_INFO
				this.getPlayerPos(this.psize, this.in);
				this.field1665 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 34) {
				// SYNTH_SOUND
				int var11 = this.in.g2();
				int var12 = this.in.g1();
				int var13 = this.in.g2();
				if (this.field1496 && !lowMem && this.field1345 < 50) {
					this.field1464[this.field1345] = var11;
					this.field1220[this.field1345] = var12;
					this.field1499[this.field1345] = var13 + JagFX.delays[var11];
					this.field1345++;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 91) {
				// LAST_LOGIN_INFO
				this.field1386 = this.in.g4();
				this.field1426 = this.in.g2();
				this.field1445 = this.in.g1();
				this.field1303 = this.in.g2();
				this.field1516 = this.in.g1();
				if (this.field1386 != 0 && this.mainModalId == -1) {
					signlink.dnslookup(JString.formatIPv4(this.field1386));
					this.closeModal();
					short var14 = 650;
					if (this.field1445 != 201 || this.field1516 == 1) {
						var14 = 655;
					}
					this.field1367 = "";
					this.field1544 = false;
					for (int var15 = 0; var15 < IfType.list.length; var15++) {
						if (IfType.list[var15] != null && IfType.list[var15].field77 == var14) {
							this.mainModalId = IfType.list[var15].field74;
							break;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 88) {
				// LOGOUT
				this.method488();
				this.ptype = -1;
				return false;
			}
			if (this.ptype == 134) {
				// IF_SETANIM
				int var16 = this.in.g2();
				int var17 = this.in.g2b();
				IfType var18 = IfType.list[var16];
				var18.modelAnim = var17;
				if (var17 == -1) {
					var18.field71 = 0;
					var18.field72 = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 156) {
				// HINT_ARROW
				this.field1616 = this.in.g1();
				if (this.field1616 == 1) {
					this.field1336 = this.in.g2();
				}
				if (this.field1616 >= 2 && this.field1616 <= 6) {
					if (this.field1616 == 2) {
						this.field1581 = 64;
						this.field1582 = 64;
					}
					if (this.field1616 == 3) {
						this.field1581 = 0;
						this.field1582 = 64;
					}
					if (this.field1616 == 4) {
						this.field1581 = 128;
						this.field1582 = 64;
					}
					if (this.field1616 == 5) {
						this.field1581 = 64;
						this.field1582 = 0;
					}
					if (this.field1616 == 6) {
						this.field1581 = 64;
						this.field1582 = 128;
					}
					this.field1616 = 2;
					this.field1578 = this.in.g2();
					this.field1579 = this.in.g2();
					this.field1580 = this.in.g1();
				}
				if (this.field1616 == 10) {
					this.field1597 = this.in.g2();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 67) {
				// UPDATE_RUNWEIGHT
				if (this.sideTab == 12) {
					this.redrawSidebar = true;
				}
				this.runweight = this.in.g2b();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 3) {
				// UPDATE_IGNORELIST
				this.field1377 = this.psize / 8;
				for (int var19 = 0; var19 < this.field1377; var19++) {
					this.field1233[var19] = this.in.g8();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 142) {
				// IF_SETNPCHEAD
				int var20 = this.in.g2();
				int var21 = this.in.g2();
				IfType.list[var20].model1Type = 2;
				IfType.list[var20].field118 = var21;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 215) {
				// IF_SETTAB
				int var22 = this.in.g2();
				int var23 = this.in.g1();
				if (var22 == 65535) {
					var22 = -1;
				}
				this.field1370[var23] = var22;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 153) {
				// UPDATE_ZONE_FULL_FOLLOWS
				this.field1334 = this.in.g1();
				this.field1335 = this.in.g1();
				for (int var24 = this.field1334; var24 < this.field1334 + 8; var24++) {
					for (int var25 = this.field1335; var25 < this.field1335 + 8; var25++) {
						if (this.field1232[this.field1478][var24][var25] != null) {
							this.field1232[this.field1478][var24][var25] = null;
							this.method460(var24, var25);
						}
					}
				}
				for (LocChange var26 = (LocChange) this.field1644.head(); var26 != null; var26 = (LocChange) this.field1644.next(this.field1374)) {
					if (var26.field729 >= this.field1334 && var26.field729 < this.field1334 + 8 && var26.field730 >= this.field1335 && var26.field730 < this.field1335 + 8 && var26.field727 == this.field1478) {
						var26.field738 = 0;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 114) {
				// CHAT_FILTER_SETTINGS
				this.field1383 = this.in.g1();
				this.field1388 = this.in.g1();
				this.field1221 = this.in.g1();
				this.redrawPrivacySettings = true;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 158) {
				// IF_OPENMAIN_SIDE
				int var27 = this.in.g2();
				int var28 = this.in.g2();
				if (this.chatComId != -1) {
					this.chatComId = -1;
					this.redrawChatback = true;
				}
				if (this.dialogInputOpen) {
					this.dialogInputOpen = false;
					this.redrawChatback = true;
				}
				this.mainModalId = var27;
				this.sideModalId = var28;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.resumedPauseButton = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 240) {
				// IF_OPENOVERLAY
				int var29 = this.in.g2b();
				if (var29 >= 0) {
					this.ifAnimReset(var29);
				}
				this.mainOverlayId = var29;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 195) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				this.field1334 = this.in.g1();
				this.field1335 = this.in.g1();
				while (this.in.data < this.psize) {
					int var30 = this.in.g1();
					this.zonePacket(var30, this.in);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 161) {
				// MESSAGE_GAME
				String var31 = this.in.gjstr();
				if (var31.endsWith(":tradereq:")) {
					String var32 = var31.substring(0, var31.indexOf(":"));
					long var33 = JString.toUserhash(var32);
					boolean var35 = false;
					for (int var36 = 0; var36 < this.field1377; var36++) {
						if (this.field1233[var36] == var33) {
							var35 = true;
							break;
						}
					}
					if (!var35 && this.field1306 == 0) {
						this.method457(4, var32, "wishes to trade with you.");
					}
				} else if (var31.endsWith(":duelreq:")) {
					String var37 = var31.substring(0, var31.indexOf(":"));
					long var38 = JString.toUserhash(var37);
					boolean var40 = false;
					for (int var41 = 0; var41 < this.field1377; var41++) {
						if (this.field1233[var41] == var38) {
							var40 = true;
							break;
						}
					}
					if (!var40 && this.field1306 == 0) {
						this.method457(8, var37, "wishes to duel with you.");
					}
				} else {
					this.method457(0, "", var31);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 101) {
				// CAM_RESET
				this.field1424 = false;
				for (int var42 = 0; var42 < 5; var42++) {
					this.field1577[var42] = false;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 16) {
				// IF_OPENSIDE
				int var43 = this.in.g2();
				this.ifAnimReset(var43);
				if (this.chatComId != -1) {
					this.chatComId = -1;
					this.redrawChatback = true;
				}
				if (this.dialogInputOpen) {
					this.dialogInputOpen = false;
					this.redrawChatback = true;
				}
				this.sideModalId = var43;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.mainModalId = -1;
				this.resumedPauseButton = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 44) {
				// IF_SETTEXT
				int var44 = this.in.g2();
				String var45 = this.in.gjstr();
				IfType.list[var44].field109 = var45;
				if (IfType.list[var44].field74 == this.field1370[this.sideTab]) {
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 245) {
				// VARP_LARGE
				int var46 = this.in.g2();
				int var47 = this.in.g4();
				this.field1588[var46] = var47;
				if (this.field1523[var46] != var47) {
					this.field1523[var46] = var47;
					this.clientVar(var46);
					this.redrawSidebar = true;
					if (this.tutComId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 166) {
				// IF_OPENCHAT
				int var48 = this.in.g2();
				this.ifAnimReset(var48);
				if (this.sideModalId != -1) {
					this.sideModalId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				this.chatComId = var48;
				this.redrawChatback = true;
				this.mainModalId = -1;
				this.resumedPauseButton = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 28) {
				// IF_SETOBJECT
				int var49 = this.in.g2();
				int var50 = this.in.g2();
				int var51 = this.in.g2();
				ObjType var52 = ObjType.list(var50);
				IfType.list[var49].model1Type = 4;
				IfType.list[var49].field118 = var50;
				IfType.list[var49].field124 = var52.xan2d;
				IfType.list[var49].field125 = var52.yan2d;
				IfType.list[var49].field123 = var52.zoom2d * 100 / var51;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 54) {
				// IF_SETSCROLLPOS
				int var53 = this.in.g2();
				int var54 = this.in.g2();
				IfType var55 = IfType.list[var53];
				if (var55 != null && var55.field75 == 0) {
					if (var54 < 0) {
						var54 = 0;
					}
					if (var54 > var55.field87 - var55.field79) {
						var54 = var55.field87 - var55.field79;
					}
					var55.field88 = var54;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 47) {
				// RESET_ANIMS
				for (int var56 = 0; var56 < this.field1536.length; var56++) {
					if (this.field1536[var56] != null) {
						this.field1536[var56].field425 = -1;
					}
				}
				for (int var57 = 0; var57 < this.field1675.length; var57++) {
					if (this.field1675[var57] != null) {
						this.field1675[var57].field425 = -1;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 194) {
				// MINIMAP_TOGGLE
				this.minimapState = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 90) {
				// TUT_FLASH
				this.field1589 = this.in.g1();
				if (this.field1589 == this.sideTab) {
					if (this.field1589 == 3) {
						this.sideTab = 1;
					} else {
						this.sideTab = 3;
					}
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 89) {
				// UPDATE_REBOOT_TIMER
				this.field1219 = this.in.g2() * 30;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 190) {
				// VARP_SYNC
				for (int var58 = 0; var58 < this.field1523.length; var58++) {
					if (this.field1523[var58] != this.field1588[var58]) {
						this.field1523[var58] = this.field1588[var58];
						this.clientVar(var58);
						this.redrawSidebar = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 83) {
				// UPDATE_RUNENERGY
				if (this.sideTab == 12) {
					this.redrawSidebar = true;
				}
				this.runenergy = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 231) {
				// REBUILD_NORMAL
				int var59 = this.in.g2();
				int var60 = this.in.g2();
				if (this.field1338 == var59 && this.field1339 == var60 && this.field1545 == 2) {
					this.ptype = -1;
					return true;
				}
				this.field1338 = var59;
				this.field1339 = var60;
				this.field1471 = (this.field1338 - 6) * 8;
				this.field1472 = (this.field1339 - 6) * 8;
				this.field1585 = false;
				if ((this.field1338 / 8 == 48 || this.field1338 / 8 == 49) && this.field1339 / 8 == 48) {
					this.field1585 = true;
				}
				if (this.field1338 / 8 == 48 && this.field1339 / 8 == 148) {
					this.field1585 = true;
				}
				this.field1545 = 1;
				this.field1543 = System.currentTimeMillis();
				this.field1280.setPixels(field1376);
				this.field1492.centreString(257, 151, 0, "Loading - please wait.");
				this.field1492.centreString(256, 150, 16777215, "Loading - please wait.");
				this.field1280.draw(4, super.graphics, 4);
				int var61 = 0;
				for (int var62 = (this.field1338 - 6) / 8; var62 <= (this.field1338 + 6) / 8; var62++) {
					for (int var63 = (this.field1339 - 6) / 8; var63 <= (this.field1339 + 6) / 8; var63++) {
						var61++;
					}
				}
				this.field1302 = new byte[var61][];
				this.field1369 = new byte[var61][];
				this.field1246 = new int[var61];
				this.field1247 = new int[var61];
				this.field1248 = new int[var61];
				int var64 = 0;
				for (int var65 = (this.field1338 - 6) / 8; var65 <= (this.field1338 + 6) / 8; var65++) {
					for (int var66 = (this.field1339 - 6) / 8; var66 <= (this.field1339 + 6) / 8; var66++) {
						this.field1246[var64] = (var65 << 8) + var66;
						if (this.field1585 && (var66 == 49 || var66 == 149 || var66 == 147 || var65 == 50 || var65 == 49 && var66 == 47)) {
							this.field1247[var64] = -1;
							this.field1248[var64] = -1;
							var64++;
						} else {
							int var67 = this.field1247[var64] = this.onDemand.getMapFile(0, var65, var66);
							if (var67 != -1) {
								this.onDemand.request(3, var67);
							}
							int var68 = this.field1248[var64] = this.onDemand.getMapFile(1, var65, var66);
							if (var68 != -1) {
								this.onDemand.request(3, var68);
							}
							var64++;
						}
					}
				}
				int var69 = this.field1471 - this.field1473;
				int var70 = this.field1472 - this.field1474;
				this.field1473 = this.field1471;
				this.field1474 = this.field1472;
				for (int var71 = 0; var71 < 16384; var71++) {
					ClientNpc var72 = this.field1675[var71];
					if (var72 != null) {
						for (int var73 = 0; var73 < 10; var73++) {
							var72.field447[var73] -= var69;
							var72.field448[var73] -= var70;
						}
						var72.field397 -= var69 * 128;
						var72.field398 -= var70 * 128;
					}
				}
				for (int var74 = 0; var74 < this.field1534; var74++) {
					ClientPlayer var75 = this.field1536[var74];
					if (var75 != null) {
						for (int var76 = 0; var76 < 10; var76++) {
							var75.field447[var76] -= var69;
							var75.field448[var76] -= var70;
						}
						var75.field397 -= var69 * 128;
						var75.field398 -= var70 * 128;
					}
				}
				this.field1665 = true;
				byte var77 = 0;
				byte var78 = 104;
				byte var79 = 1;
				if (var69 < 0) {
					var77 = 103;
					var78 = -1;
					var79 = -1;
				}
				byte var80 = 0;
				byte var81 = 104;
				byte var82 = 1;
				if (var70 < 0) {
					var80 = 103;
					var81 = -1;
					var82 = -1;
				}
				for (int var83 = var77; var83 != var78; var83 += var79) {
					for (int var84 = var80; var84 != var81; var84 += var82) {
						int var85 = var83 + var69;
						int var86 = var84 + var70;
						for (int var87 = 0; var87 < 4; var87++) {
							if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
								this.field1232[var87][var83][var84] = this.field1232[var87][var85][var86];
							} else {
								this.field1232[var87][var83][var84] = null;
							}
						}
					}
				}
				for (LocChange var88 = (LocChange) this.field1644.head(); var88 != null; var88 = (LocChange) this.field1644.next(this.field1374)) {
					var88.field729 -= var69;
					var88.field730 -= var70;
					if (var88.field729 < 0 || var88.field730 < 0 || var88.field729 >= 104 || var88.field730 >= 104) {
						var88.unlink();
					}
				}
				if (this.minimapFlagX != 0) {
					this.minimapFlagX -= var69;
					this.field1442 -= var70;
				}
				this.field1424 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 171) {
				// IF_CLOSE
				if (this.sideModalId != -1) {
					this.sideModalId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatComId != -1) {
					this.chatComId = -1;
					this.redrawChatback = true;
				}
				if (this.dialogInputOpen) {
					this.dialogInputOpen = false;
					this.redrawChatback = true;
				}
				this.mainModalId = -1;
				this.resumedPauseButton = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 247) {
				// UPDATE_FRIENDLIST
				long var89 = this.in.g8();
				int var91 = this.in.g1();
				String var92 = JString.toScreenName(JString.toRawUsername(var89));
				for (int var93 = 0; var93 < this.field1531; var93++) {
					if (var89 == this.field1575[var93]) {
						if (this.field1489[var93] != var91) {
							this.field1489[var93] = var91;
							this.redrawSidebar = true;
							if (var91 > 0) {
								this.method457(5, "", var92 + " has logged in.");
							}
							if (var91 == 0) {
								this.method457(5, "", var92 + " has logged out.");
							}
						}
						var92 = null;
						break;
					}
				}
				if (var92 != null && this.field1531 < 200) {
					this.field1575[this.field1531] = var89;
					this.field1249[this.field1531] = var92;
					this.field1489[this.field1531] = var91;
					this.field1531++;
					this.redrawSidebar = true;
				}
				boolean var94 = false;
				while (!var94) {
					var94 = true;
					for (int var95 = 0; var95 < this.field1531 - 1; var95++) {
						if (this.field1489[var95] != field1653 && this.field1489[var95 + 1] == field1653 || this.field1489[var95] == 0 && this.field1489[var95 + 1] != 0) {
							int var96 = this.field1489[var95];
							this.field1489[var95] = this.field1489[var95 + 1];
							this.field1489[var95 + 1] = var96;
							String var97 = this.field1249[var95];
							this.field1249[var95] = this.field1249[var95 + 1];
							this.field1249[var95 + 1] = var97;
							long var98 = this.field1575[var95];
							this.field1575[var95] = this.field1575[var95 + 1];
							this.field1575[var95 + 1] = var98;
							this.redrawSidebar = true;
							var94 = false;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 10) {
				// IF_SETHIDE
				int var100 = this.in.g2();
				boolean var101 = this.in.g1() == 1;
				IfType.list[var100].field89 = var101;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 105) {
				// UPDATE_STAT
				this.redrawSidebar = true;
				int var102 = this.in.g1();
				int var103 = this.in.g4();
				int var104 = this.in.g1();
				this.field1669[var102] = var103;
				this.field1300[var102] = var104;
				this.field1569[var102] = 1;
				for (int var105 = 0; var105 < 98; var105++) {
					if (var103 >= field1652[var105]) {
						this.field1569[var102] = var105 + 2;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 23) {
				// MIDI_SONG
				int var106 = this.in.g2();
				if (var106 == 65535) {
					var106 = -1;
				}
				if (var106 != this.nextMidiSong && this.midiActive && !lowMem && this.nextMusicDelay == 0) {
					this.midiSong = var106;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				}
				this.nextMidiSong = var106;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 15) {
				// MIDI_JINGLE
				int var107 = this.in.g2();
				int var108 = this.in.g2();
				if (this.midiActive && !lowMem) {
					this.midiSong = var107;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
					this.nextMusicDelay = var108;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 200) {
				// CAM_MOVETO
				this.field1424 = true;
				this.field1285 = this.in.g1();
				this.field1286 = this.in.g1();
				this.field1287 = this.in.g2();
				this.field1288 = this.in.g1();
				this.field1289 = this.in.g1();
				if (this.field1289 >= 100) {
					this.field1236 = this.field1285 * 128 + 64;
					this.field1238 = this.field1286 * 128 + 64;
					this.field1237 = this.method458(this.field1236, this.field1238, this.field1478) - this.field1287;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 172) {
				// UPDATE_INV_PARTIAL
				this.redrawSidebar = true;
				int var109 = this.in.g2();
				IfType var110 = IfType.list[var109];
				while (this.in.data < this.psize) {
					int var111 = this.in.g1();
					int var112 = this.in.g2();
					int var113 = this.in.g1();
					if (var113 == 255) {
						var113 = this.in.g4();
					}
					if (var111 >= 0 && var111 < var110.field69.length) {
						var110.field69[var111] = var112;
						var110.field70[var111] = var113;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 17) {
				// SET_PLAYER_OP
				int var114 = this.in.g1();
				int var115 = this.in.g1();
				String var116 = this.in.gjstr();
				if (var114 >= 1 && var114 <= 5) {
					if (var116.equalsIgnoreCase("null")) {
						var116 = null;
					}
					this.field1215[var114 - 1] = var116;
					this.field1216[var114 - 1] = var115 == 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 32) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				this.field1334 = this.in.g1();
				this.field1335 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 106) {
				// UPDATE_INV_FULL
				this.redrawSidebar = true;
				int var117 = this.in.g2();
				IfType var118 = IfType.list[var117];
				int var119 = this.in.g1();
				for (int var120 = 0; var120 < var119; var120++) {
					var118.field69[var120] = this.in.g2();
					int var121 = this.in.g1();
					if (var121 == 255) {
						var121 = this.in.g4();
					}
					var118.field70[var120] = var121;
				}
				for (int var122 = var119; var122 < var118.field69.length; var122++) {
					var118.field69[var122] = 0;
					var118.field70[var122] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 133) {
				// UPDATE_PID
				this.field1363 = this.in.g2();
				this.field1224 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 129) {
				// IF_SETMODEL
				int var123 = this.in.g2();
				int var124 = this.in.g2();
				IfType.list[var123].model1Type = 1;
				IfType.list[var123].field118 = var124;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 233) {
				// CAM_LOOKAT
				this.field1424 = true;
				this.field1325 = this.in.g1();
				this.field1326 = this.in.g1();
				this.field1327 = this.in.g2();
				this.field1328 = this.in.g1();
				this.field1329 = this.in.g1();
				if (this.field1329 >= 100) {
					int var125 = this.field1325 * 128 + 64;
					int var126 = this.field1326 * 128 + 64;
					int var127 = this.method458(var125, var126, this.field1478) - this.field1327;
					int var128 = var125 - this.field1236;
					int var129 = var127 - this.field1237;
					int var130 = var126 - this.field1238;
					int var131 = (int) Math.sqrt((double) (var128 * var128 + var130 * var130));
					this.field1239 = (int) (Math.atan2((double) var129, (double) var131) * 325.949D) & 0x7FF;
					this.field1240 = (int) (Math.atan2((double) var128, (double) var130) * -325.949D) & 0x7FF;
					if (this.field1239 < 128) {
						this.field1239 = 128;
					}
					if (this.field1239 > 383) {
						this.field1239 = 383;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 227) {
				// UPDATE_INV_STOP_TRANSMIT
				int var132 = this.in.g2();
				IfType var133 = IfType.list[var132];
				for (int var134 = 0; var134 < var133.field69.length; var134++) {
					var133.field69[var134] = -1;
					var133.field69[var134] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 77) {
				// IF_SETPOSITION
				int var135 = this.in.g2();
				int var136 = this.in.g2b();
				int var137 = this.in.g2b();
				IfType var138 = IfType.list[var135];
				var138.field81 = var136;
				var138.field82 = var137;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 185) {
				// FRIENDLIST_LOADED
				this.field1532 = this.in.g1();
				this.redrawSidebar = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 197) {
				// NPC_INFO
				this.getNpcPos(this.psize, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 183) {
				// IF_SETCOLOUR
				int var139 = this.in.g2();
				int var140 = this.in.g2();
				int var141 = var140 >> 10 & 0x1F;
				int var142 = var140 >> 5 & 0x1F;
				int var143 = var140 & 0x1F;
				IfType.list[var139].field111 = (var141 << 19) + (var142 << 11) + (var143 << 3);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 235) {
				// MESSAGE_PRIVATE
				long var144 = this.in.g8();
				int var146 = this.in.g4();
				int var147 = this.in.g1();
				boolean var148 = false;
				for (int var149 = 0; var149 < 100; var149++) {
					if (this.field1484[var149] == var146) {
						var148 = true;
						break;
					}
				}
				if (var147 <= 1) {
					for (int var150 = 0; var150 < this.field1377; var150++) {
						if (this.field1233[var150] == var144) {
							var148 = true;
							break;
						}
					}
				}
				if (!var148 && this.field1306 == 0) {
					try {
						this.field1484[this.field1602] = var146;
						this.field1602 = (this.field1602 + 1) % 100;
						String var151 = WordPack.unpack(this.psize - 13, this.in);
						String var152 = WordFilter.filter(var151);
						if (var147 == 2 || var147 == 3) {
							this.method457(7, "@cr2@" + JString.toScreenName(JString.toRawUsername(var144)), var152);
						} else if (var147 == 1) {
							this.method457(7, "@cr1@" + JString.toScreenName(JString.toRawUsername(var144)), var152);
						} else {
							this.method457(3, JString.toScreenName(JString.toRawUsername(var144)), var152);
						}
					} catch (Exception var157) {
						signlink.reporterror("cde1");
					}
				}
				this.ptype = -1;
				return true;
			}

			signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
			this.method488();
		} catch (IOException var158) {
			this.method479();
		} catch (Exception var159) {
			var159.printStackTrace();
			String var155 = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (this.field1471 + field1668.field447[0]) + "," + (this.field1472 + field1668.field448[0]) + " - ";
			for (int var156 = 0; var156 < this.psize && var156 < 50; var156++) {
				var155 = var155 + this.in.pos[var156] + ",";
			}
			signlink.reporterror(var155);
			this.method488();
		}
		return true;
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public boolean method521(IfType arg0, int arg1) {
		if (arg1 != 0) {
			throw new NullPointerException();
		}
		int var3 = arg0.field77;
		if (this.field1532 == 2) {
			if (var3 == 201) {
				this.redrawChatback = true;
				this.dialogInputOpen = false;
				this.field1681 = true;
				this.field1400 = "";
				this.field1467 = 1;
				this.field1435 = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.redrawChatback = true;
				this.dialogInputOpen = false;
				this.field1681 = true;
				this.field1400 = "";
				this.field1467 = 2;
				this.field1435 = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			this.field1639 = 250;
			return true;
		}
		if (var3 == 501) {
			this.redrawChatback = true;
			this.dialogInputOpen = false;
			this.field1681 = true;
			this.field1400 = "";
			this.field1467 = 4;
			this.field1435 = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.redrawChatback = true;
			this.dialogInputOpen = false;
			this.field1681 = true;
			this.field1400 = "";
			this.field1467 = 5;
			this.field1435 = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.field1226[var4];
			if (var6 != -1) {
				while (true) {
					if (var5 == 0) {
						var6--;
						if (var6 < 0) {
							var6 = IdkType.numDefinitions - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.numDefinitions) {
							var6 = 0;
						}
					}
					if (!IdkType.list[var6].disable && IdkType.list[var6].part == var4 + (this.field1398 ? 0 : 7)) {
						this.field1226[var4] = var6;
						this.field1387 = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.field1505[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = field1657[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= field1657[var7].length) {
					var9 = 0;
				}
			}
			this.field1505[var7] = var9;
			this.field1387 = true;
		}
		if (var3 == 324 && !this.field1398) {
			this.field1398 = true;
			this.method514();
		}
		if (var3 == 325 && this.field1398) {
			this.field1398 = false;
			this.method514();
		}
		if (var3 == 326) {
			// IDK_SAVEDESIGN
			this.out.p1Enc(125);
			this.out.p1(this.field1398 ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.out.p1(this.field1226[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.out.p1(this.field1505[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			this.field1544 = !this.field1544;
		}
		if (var3 >= 601 && var3 <= 612) {
			this.closeModal();
			if (this.field1367.length() > 0) {
				// SEND_SNAPSHOT
				this.out.p1Enc(137);
				this.out.p8(JString.toUserhash(this.field1367));
				this.out.p1(var3 - 601);
				this.out.p1(this.field1544 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.G(I)V")
	public void method522() {
		this.field1322 = false;
		while (this.field1392) {
			this.field1322 = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		this.field1679 = null;
		this.field1680 = null;
		this.field1645 = null;
		this.field1352 = null;
		this.field1353 = null;
		this.field1354 = null;
		this.field1355 = null;
		this.field1527 = null;
		this.field1528 = null;
		this.field1393 = null;
		this.field1394 = null;
		this.field1307 = null;
		this.field1308 = null;
	}

	@ObfuscatedName("client.H(I)V")
	public void method523() {
		this.field1506 = 0;
		for (int var1 = -1; var1 < this.field1537 + this.npcCount; var1++) {
			ClientEntity var2;
			if (var1 == -1) {
				var2 = field1668;
			} else if (var1 < this.field1537) {
				var2 = this.field1536[this.field1538[var1]];
			} else {
				var2 = this.field1675[this.npcIds[var1 - this.field1537]];
			}
			if (var2 != null && var2.method113()) {
				if (var1 >= this.field1537) {
					NpcType var6 = ((ClientNpc) var2).field453;
					if (var6.headicon >= 0 && var6.headicon < this.headicons.length) {
						this.method437(var2, var2.field443 + 15);
						if (this.field1415 > -1) {
							this.headicons[var6.headicon].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - 30);
						}
					}
					if (this.field1616 == 1 && this.field1336 == this.npcIds[var1 - this.field1537] && field1218 % 20 < 10) {
						this.method437(var2, var2.field443 + 15);
						if (this.field1415 > -1) {
							this.headicons[2].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - 28);
						}
					}
				} else {
					int var3 = 30;
					ClientPlayer var4 = (ClientPlayer) var2;
					if (var4.headicons != 0) {
						this.method437(var2, var2.field443 + 15);
						if (this.field1415 > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.headicons & 0x1 << var5) != 0) {
									this.headicons[var5].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - var3);
									var3 -= 25;
								}
							}
						}
					}
					if (var1 >= 0 && this.field1616 == 10 && this.field1597 == this.field1538[var1]) {
						this.method437(var2, var2.field443 + 15);
						if (this.field1415 > -1) {
							this.headicons[7].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - var3);
						}
					}
				}
				if (var2.field409 != null && (var1 >= this.field1537 || this.field1383 == 0 || this.field1383 == 3 || this.field1383 == 1 && this.method430(((ClientPlayer) var2).field457))) {
					this.method437(var2, var2.field443);
					if (this.field1415 > -1 && this.field1506 < this.field1507) {
						this.field1511[this.field1506] = this.field1493.stringWid(var2.field409) / 2;
						this.field1510[this.field1506] = this.field1493.height;
						this.field1508[this.field1506] = this.field1415;
						this.field1509[this.field1506] = this.field1416;
						this.field1512[this.field1506] = var2.field411;
						this.field1513[this.field1506] = var2.field412;
						this.field1514[this.field1506] = var2.field410;
						this.field1515[this.field1506++] = var2.field409;
						if (this.field1477 == 0 && var2.field412 == 1) {
							this.field1510[this.field1506] += 10;
							this.field1509[this.field1506] += 5;
						}
						if (this.field1477 == 0 && var2.field412 == 2) {
							this.field1511[this.field1506] = 60;
						}
					}
				}
				if (var2.field416 > field1218) {
					this.method437(var2, var2.field443 + 15);
					if (this.field1415 > -1) {
						int var7 = var2.field417 * 30 / var2.field418;
						if (var7 > 30) {
							var7 = 30;
						}
						Pix2D.fillRect(5, 65280, var7, this.field1415 - 15, this.field1416 - 3);
						Pix2D.fillRect(5, 16711680, 30 - var7, this.field1415 - 15 + var7, this.field1416 - 3);
					}
				}
				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field415[var8] > field1218) {
						this.method437(var2, var2.field443 / 2);
						if (this.field1415 > -1) {
							if (var8 == 1) {
								this.field1416 -= 20;
							}
							if (var8 == 2) {
								this.field1415 -= 15;
								this.field1416 -= 10;
							}
							if (var8 == 3) {
								this.field1415 += 15;
								this.field1416 -= 10;
							}
							this.hitmarks[var2.field414[var8]].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - 12);
							this.field1491.centreString(this.field1415, this.field1416 + 4, 0, String.valueOf(var2.field413[var8]));
							this.field1491.centreString(this.field1415 - 1, this.field1416 + 3, 16777215, String.valueOf(var2.field413[var8]));
						}
					}
				}
			}
		}
		for (int var9 = 0; var9 < this.field1506; var9++) {
			int var10 = this.field1508[var9];
			int var11 = this.field1509[var9];
			int var12 = this.field1511[var9];
			int var13 = this.field1510[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > this.field1509[var15] - this.field1510[var15] && var11 - var13 < this.field1509[var15] + 2 && var10 - var12 < this.field1508[var15] + this.field1511[var15] && var10 + var12 > this.field1508[var15] - this.field1511[var15] && this.field1509[var15] - this.field1510[var15] < var11) {
						var11 = this.field1509[var15] - this.field1510[var15];
						var14 = true;
					}
				}
			}
			this.field1415 = this.field1508[var9];
			this.field1416 = this.field1509[var9] = var11;
			String var16 = this.field1515[var9];
			if (this.field1477 == 0) {
				int var17 = 16776960;
				if (this.field1512[var9] < 6) {
					var17 = this.field1401[this.field1512[var9]];
				}
				if (this.field1512[var9] == 6) {
					var17 = this.field1284 % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.field1512[var9] == 7) {
					var17 = this.field1284 % 20 < 10 ? 255 : 65535;
				}
				if (this.field1512[var9] == 8) {
					var17 = this.field1284 % 20 < 10 ? 45056 : 8454016;
				}
				if (this.field1512[var9] == 9) {
					int var18 = 150 - this.field1514[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}
				if (this.field1512[var9] == 10) {
					int var19 = 150 - this.field1514[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 16711680;
					} else if (var19 < 100) {
						var17 = 16711935 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 327680 + 255 - (var19 - 100) * 5;
					}
				}
				if (this.field1512[var9] == 11) {
					int var20 = 150 - this.field1514[var9];
					if (var20 < 50) {
						var17 = 16777215 - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 65280;
					} else if (var20 < 150) {
						var17 = 16777215 - (var20 - 100) * 327680;
					}
				}
				if (this.field1513[var9] == 0) {
					this.field1493.centreString(this.field1415, this.field1416 + 1, 0, var16);
					this.field1493.centreString(this.field1415, this.field1416, var17, var16);
				}
				if (this.field1513[var9] == 1) {
					this.field1493.centreStringWave(var16, this.field1416 + 1, this.field1415, 0, this.field1284);
					this.field1493.centreStringWave(var16, this.field1416, this.field1415, var17, this.field1284);
				}
				if (this.field1513[var9] == 2) {
					int var21 = this.field1493.stringWid(var16);
					int var22 = (150 - this.field1514[var9]) * (var21 + 100) / 150;
					Pix2D.setClipping(334, this.field1415 + 50, this.field1415 - 50, 0);
					this.field1493.drawString(this.field1415 + 50 - var22, var16, 0, this.field1416 + 1);
					this.field1493.drawString(this.field1415 + 50 - var22, var16, var17, this.field1416);
					Pix2D.resetClipping();
				}
			} else {
				this.field1493.centreString(this.field1415, this.field1416 + 1, 0, var16);
				this.field1493.centreString(this.field1415, this.field1416, 16776960, var16);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public void method524() {
		int var1 = this.field1285 * 128 + 64;
		int var2 = this.field1286 * 128 + 64;
		int var3 = this.method458(var1, var2, this.field1478) - this.field1287;
		if (this.field1236 < var1) {
			this.field1236 += this.field1288 + (var1 - this.field1236) * this.field1289 / 1000;
			if (this.field1236 > var1) {
				this.field1236 = var1;
			}
		}
		if (this.field1236 > var1) {
			this.field1236 -= this.field1288 + (this.field1236 - var1) * this.field1289 / 1000;
			if (this.field1236 < var1) {
				this.field1236 = var1;
			}
		}
		if (this.field1237 < var3) {
			this.field1237 += this.field1288 + (var3 - this.field1237) * this.field1289 / 1000;
			if (this.field1237 > var3) {
				this.field1237 = var3;
			}
		}
		if (this.field1237 > var3) {
			this.field1237 -= this.field1288 + (this.field1237 - var3) * this.field1289 / 1000;
			if (this.field1237 < var3) {
				this.field1237 = var3;
			}
		}
		if (this.field1238 < var2) {
			this.field1238 += this.field1288 + (var2 - this.field1238) * this.field1289 / 1000;
			if (this.field1238 > var2) {
				this.field1238 = var2;
			}
		}
		if (this.field1238 > var2) {
			this.field1238 -= this.field1288 + (this.field1238 - var2) * this.field1289 / 1000;
			if (this.field1238 < var2) {
				this.field1238 = var2;
			}
		}
		int var4 = this.field1325 * 128 + 64;
		int var5 = this.field1326 * 128 + 64;
		int var6 = this.method458(var4, var5, this.field1478) - this.field1327;
		int var7 = var4 - this.field1236;
		int var8 = var6 - this.field1237;
		int var9 = var5 - this.field1238;
		int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
		int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
		if (var11 < 128) {
			var11 = 128;
		}
		if (var11 > 383) {
			var11 = 383;
		}
		if (this.field1239 < var11) {
			this.field1239 += this.field1328 + (var11 - this.field1239) * this.field1329 / 1000;
			if (this.field1239 > var11) {
				this.field1239 = var11;
			}
		}
		if (this.field1239 > var11) {
			this.field1239 -= this.field1328 + (this.field1239 - var11) * this.field1329 / 1000;
			if (this.field1239 < var11) {
				this.field1239 = var11;
			}
		}
		int var13 = var12 - this.field1240;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 > 0) {
			this.field1240 += this.field1328 + var13 * this.field1329 / 1000;
			this.field1240 &= 0x7FF;
		}
		if (var13 < 0) {
			this.field1240 -= this.field1328 + -var13 * this.field1329 / 1000;
			this.field1240 &= 0x7FF;
		}
		int var14 = var12 - this.field1240;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			this.field1240 = var12;
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void method525() {
		for (int var1 = -1; var1 < this.field1537; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = this.field1535;
			} else {
				var2 = this.field1538[var1];
			}
			ClientPlayer var3 = this.field1536[var2];
			if (var3 != null && var3.field410 > 0) {
				var3.field410--;
				if (var3.field410 == 0) {
					var3.field409 = null;
				}
			}
		}
		for (int var4 = 0; var4 < this.npcCount; var4++) {
			int var5 = this.npcIds[var4];
			ClientNpc var6 = this.field1675[var5];
			if (var6 != null && var6.field410 > 0) {
				var6.field410--;
				if (var6.field410 == 0) {
					var6.field409 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public void method526() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.field1382);
		if (this.onDemand != null) {
			System.out.println("Od-cycle:" + this.onDemand.cycle);
		}
		System.out.println("loop-cycle:" + field1218);
		System.out.println("draw-cycle:" + field1258);
		System.out.println("ptype:" + this.ptype);
		System.out.println("psize:" + this.psize);
		if (this.stream != null) {
			this.stream.method43();
		}
		super.debug = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	@Override
	public Component getBaseComponent(byte arg0) {
		if (arg0 != 7) {
			this.field1323 = -291;
		}
		if (signlink.mainapp == null) {
			return this;
		} else {
			return signlink.mainapp;
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public void getPlayerPosLocal(Packet arg0, int arg1) {
		arg0.gBitStart();
		int var3 = arg0.gBit(1);
		if (var3 == 0) {
			return;
		}
		int var4 = arg0.gBit(2);
		if (var4 == 0) {
			this.field1540[this.field1539++] = this.field1535;
		} else if (var4 == 1) {
			int var5 = arg0.gBit(3);
			field1668.method111(var5, false);
			int var6 = arg0.gBit(1);
			if (var6 == 1) {
				this.field1540[this.field1539++] = this.field1535;
			}
		} else if (var4 == 2) {
			int var7 = arg0.gBit(3);
			field1668.method111(var7, true);
			int var8 = arg0.gBit(3);
			field1668.method111(var8, true);
			int var9 = arg0.gBit(1);
			if (var9 == 1) {
				this.field1540[this.field1539++] = this.field1535;
			}
		} else if (var4 == 3) {
			this.field1478 = arg0.gBit(2);
			int var10 = arg0.gBit(7);
			int var11 = arg0.gBit(7);
			int var12 = arg0.gBit(1);
			field1668.method110(var10, var12 == 1, var11);
			int var13 = arg0.gBit(1);
			if (var13 == 1) {
				this.field1540[this.field1539++] = this.field1535;
			}
		}
	}

	@ObfuscatedName("client.K(I)I")
	public int method528() {
		int var1 = 3;
		if (this.field1239 < 310) {
			int var2 = this.field1236 >> 7;
			int var3 = this.field1238 >> 7;
			int var4 = field1668.field397 >> 7;
			int var5 = field1668.field398 >> 7;
			if ((this.field1243[this.field1478][var2][var3] & 0x4) != 0) {
				var1 = this.field1478;
			}
			int var6;
			if (var4 > var2) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}
			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}
			if (var6 > var7) {
				int var8 = var7 * 65536 / var6;
				int var9 = 32768;
				while (var2 != var4) {
					if (var2 < var4) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}
					if ((this.field1243[this.field1478][var2][var3] & 0x4) != 0) {
						var1 = this.field1478;
					}
					var9 += var8;
					if (var9 >= 65536) {
						var9 -= 65536;
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((this.field1243[this.field1478][var2][var3] & 0x4) != 0) {
							var1 = this.field1478;
						}
					}
				}
			} else {
				int var10 = var6 * 65536 / var7;
				int var11 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}
					if ((this.field1243[this.field1478][var2][var3] & 0x4) != 0) {
						var1 = this.field1478;
					}
					var11 += var10;
					if (var11 >= 65536) {
						var11 -= 65536;
						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}
						if ((this.field1243[this.field1478][var2][var3] & 0x4) != 0) {
							var1 = this.field1478;
						}
					}
				}
			}
		}
		if ((this.field1243[this.field1478][field1668.field397 >> 7][field1668.field398 >> 7] & 0x4) != 0) {
			var1 = this.field1478;
		}
		return var1;
	}

	@ObfuscatedName("client.L(I)I")
	public int method529() {
		int var1 = this.method458(this.field1236, this.field1238, this.field1478);
		return var1 - this.field1237 >= 800 || (this.field1243[this.field1478][this.field1236 >> 7][this.field1238 >> 7] & 0x4) == 0 ? 3 : this.field1478;
	}

	@ObfuscatedName("client.M(I)V")
	public void method530(int arg0) {
		if (this.field1219 > 1) {
			this.field1219--;
		}
		if (this.field1639 > 0) {
			this.field1639--;
		}
		for (int var2 = 0; var2 < 5 && this.tcpIn(); var2++) {
		}
		if (!this.ingame) {
			return;
		}
		Object var3 = this.field1576.lock;
		synchronized (this.field1576.lock) {
			if (!field1583) {
				this.field1576.length = 0;
			} else if (super.mouseClickButton != 0 || this.field1576.length >= 40) {
				// EVENT_MOUSE_MOVE
				this.out.p1Enc(222);
				this.out.p1(0);
				int var4 = this.out.data;
				int var5 = 0;
				for (int var6 = 0; var6 < this.field1576.length && var4 - this.out.data < 240; var6++) {
					var5++;
					int var7 = this.field1576.y[var6];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 502) {
						var7 = 502;
					}
					int var8 = this.field1576.x[var6];
					if (var8 < 0) {
						var8 = 0;
					} else if (var8 > 764) {
						var8 = 764;
					}
					int var9 = var7 * 765 + var8;
					if (this.field1576.y[var6] == -1 && this.field1576.x[var6] == -1) {
						var8 = -1;
						var7 = -1;
						var9 = 524287;
					}
					if (var8 != this.field1649 || var7 != this.field1650) {
						int var10 = var8 - this.field1649;
						this.field1649 = var8;
						int var11 = var7 - this.field1650;
						this.field1650 = var7;
						if (this.field1399 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
							var10 += 32;
							var11 += 32;
							this.out.p2((this.field1399 << 12) + (var10 << 6) + var11);
							this.field1399 = 0;
						} else if (this.field1399 < 8) {
							this.out.p3((this.field1399 << 19) + var9 + 8388608);
							this.field1399 = 0;
						} else {
							this.out.p4((this.field1399 << 19) + var9 - 1073741824);
							this.field1399 = 0;
						}
					} else if (this.field1399 < 2047) {
						this.field1399++;
					}
				}
				this.out.psize1(this.out.data - var4, this.field1213);
				if (var5 >= this.field1576.length) {
					this.field1576.length = 0;
				} else {
					this.field1576.length -= var5;
					for (int var12 = 0; var12 < this.field1576.length; var12++) {
						this.field1576.x[var12] = this.field1576.x[var12 + var5];
						this.field1576.y[var12] = this.field1576.y[var12 + var5];
					}
				}
			}
		}
		if (super.mouseClickButton != 0) {
			long var13 = (super.mouseClickTime - this.field1646) / 50L;
			if (var13 > 4095L) {
				var13 = 4095L;
			}
			this.field1646 = super.mouseClickTime;
			int var15 = super.mouseClickY;
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 502) {
				var15 = 502;
			}
			int var16 = super.mouseClickX;
			if (var16 < 0) {
				var16 = 0;
			} else if (var16 > 764) {
				var16 = 764;
			}
			int var17 = var15 * 765 + var16;
			byte var18 = 0;
			if (super.mouseClickButton == 2) {
				var18 = 1;
			}
			int var19 = (int) var13;
			// EVENT_MOUSE_CLICK
			this.out.p1Enc(20);
			this.out.p4((var19 << 20) + (var18 << 19) + var17);
		}
		if (this.field1439 > 0) {
			this.field1439--;
		}
		if (super.keyHeld[1] == 1 || super.keyHeld[2] == 1 || super.keyHeld[3] == 1 || super.keyHeld[4] == 1) {
			this.field1440 = true;
		}
		if (this.field1440 && this.field1439 <= 0) {
			this.field1439 = 20;
			this.field1440 = false;
			// EVENT_CAMERA_POSITION
			this.out.p1Enc(53);
			this.out.p2(this.field1621);
			this.out.p2(this.field1622);
		}
		if (super.focus && !this.field1361) {
			this.field1361 = true;
			// EVENT_APPLET_FOCUS
			this.out.p1Enc(73);
			this.out.p1(1);
		}
		if (!super.focus && this.field1361) {
			this.field1361 = false;
			// EVENT_APPLET_FOCUS
			this.out.p1Enc(73);
			this.out.p1(0);
		}
		this.method450();
		this.method552();
		this.method435();
		this.field1637++;
		if (this.field1637 > 750) {
			this.method479();
		}
		this.method512();
		this.method543();
		this.method525();
		this.field1391++;
		if (this.field1561 != 0) {
			this.field1560 += 20;
			if (this.field1560 >= 400) {
				this.field1561 = 0;
			}
		}
		if (this.field1266 != 0) {
			this.field1263++;
			if (this.field1263 >= 15) {
				if (this.field1266 == 2) {
					this.redrawSidebar = true;
				}
				if (this.field1266 == 3) {
					this.redrawChatback = true;
				}
				this.field1266 = 0;
			}
		}
		if (this.field1311 != 0) {
			this.field1666++;
			if (super.mouseX > this.field1312 + 5 || super.mouseX < this.field1312 - 5 || super.mouseY > this.field1313 + 5 || super.mouseY < this.field1313 - 5) {
				this.field1562 = true;
			}
			if (super.mouseButton == 0) {
				if (this.field1311 == 2) {
					this.redrawSidebar = true;
				}
				if (this.field1311 == 3) {
					this.redrawChatback = true;
				}
				this.field1311 = 0;
				if (this.field1562 && this.field1666 >= 5) {
					this.field1379 = -1;
					this.method476();
					if (this.field1379 == this.field1309 && this.field1378 != this.field1310) {
						IfType var20 = IfType.list[this.field1309];
						byte var21 = 0;
						if (this.field1298 == 1 && var20.field77 == 206) {
							var21 = 1;
						}
						if (var20.field69[this.field1378] <= 0) {
							var21 = 0;
						}
						if (var20.field98) {
							int var22 = this.field1310;
							int var23 = this.field1378;
							var20.field69[var23] = var20.field69[var22];
							var20.field70[var23] = var20.field70[var22];
							var20.field69[var22] = -1;
							var20.field70[var22] = 0;
						} else if (var21 == 1) {
							int var24 = this.field1310;
							int var25 = this.field1378;
							while (var24 != var25) {
								if (var24 > var25) {
									var20.method33(var24, var24 - 1);
									var24--;
								} else if (var24 < var25) {
									var20.method33(var24, var24 + 1);
									var24++;
								}
							}
						} else {
							var20.method33(this.field1310, this.field1378);
						}
						// INV_BUTTOND
						this.out.p1Enc(93);
						this.out.p2(this.field1309);
						this.out.p2(this.field1310);
						this.out.p2(this.field1378);
						this.out.p1(var21);
					}
				} else if ((this.field1465 == 1 || this.method473(this.field1396 - 1)) && this.field1396 > 2) {
					this.method503();
				} else if (this.field1396 > 0) {
					this.method468(this.field1396 - 1);
				}
				this.field1263 = 10;
				super.mouseClickButton = 0;
			}
		}
		field1643++;
		if (field1643 > 62) {
			field1643 = 0;
			// ANTICHEAT_CYCLELOGIC7
			this.out.p1Enc(89);
		}
		if (World.field316 != -1) {
			int var26 = World.field316;
			int var27 = World.field317;
			boolean var28 = this.method447(field1668.field448[0], var26, 0, 0, 0, field1668.field447[0], 0, true, 0, var27, 0);
			World.field316 = -1;
			if (var28) {
				this.field1558 = super.mouseClickX;
				this.field1559 = super.mouseClickY;
				this.field1561 = 1;
				this.field1560 = 0;
			}
		}
		if (super.mouseClickButton == 1 && this.field1245 != null) {
			this.field1245 = null;
			this.redrawChatback = true;
			super.mouseClickButton = 0;
		}
		this.method429();
		this.method538();
		this.method466();
		this.method446(this.field1418);
		if (super.mouseButton == 1 || super.mouseClickButton == 1) {
			this.field1409++;
		}
		if (this.field1545 == 2) {
			this.method537();
		}
		if (this.field1545 == 2 && this.field1424) {
			this.method524();
		}
		for (int var29 = 0; var29 < 5; var29++) {
			int var10002 = this.field1384[var29]++;
		}
		this.method539();
		super.idleTimer++;
		if (super.idleTimer > 4500) {
			this.field1639 = 250;
			super.idleTimer -= 500;
			// IDLE_TIMER
			this.out.p1Enc(209);
		}
		this.field1253++;
		if (arg0 < 5 || arg0 > 5) {
			this.ptype = this.in.g1();
		}
		if (this.field1253 > 500) {
			this.field1253 = 0;
			int var30 = (int) (Math.random() * 8.0D);
			if ((var30 & 0x1) == 1) {
				this.field1662 += this.field1663;
			}
			if ((var30 & 0x2) == 2) {
				this.field1250 += this.field1251;
			}
			if ((var30 & 0x4) == 4) {
				this.field1304 += this.field1305;
			}
		}
		if (this.field1662 < -50) {
			this.field1663 = 2;
		}
		if (this.field1662 > 50) {
			this.field1663 = -2;
		}
		if (this.field1250 < -55) {
			this.field1251 = 2;
		}
		if (this.field1250 > 55) {
			this.field1251 = -2;
		}
		if (this.field1304 < -40) {
			this.field1305 = 1;
		}
		if (this.field1304 > 40) {
			this.field1305 = -1;
		}
		this.field1332++;
		if (this.field1332 > 500) {
			this.field1332 = 0;
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x1) == 1) {
				this.field1633 += this.field1634;
			}
			if ((var31 & 0x2) == 2) {
				this.field1586 += this.field1587;
			}
		}
		if (this.field1633 < -60) {
			this.field1634 = 2;
		}
		if (this.field1633 > 60) {
			this.field1634 = -2;
		}
		if (this.field1586 < -20) {
			this.field1587 = 1;
		}
		if (this.field1586 > 10) {
			this.field1587 = -1;
		}
		this.field1638++;
		if (this.field1638 > 50) {
			// NO_TIMEOUT
			this.out.p1Enc(120);
		}
		try {
			if (this.stream != null && this.out.data > 0) {
				this.stream.write(this.out.data, this.out.pos);
				this.out.data = 0;
				this.field1638 = 0;
			}
		} catch (IOException var33) {
			this.method479();
		} catch (Exception var34) {
			this.method488();
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public void delIgnore(boolean arg0, long arg1) {
		if (arg0) {
			this.ptype = this.in.g1();
		}
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field1377; var4++) {
			if (this.field1233[var4] == arg1) {
				this.field1377--;
				this.redrawSidebar = true;
				for (int var5 = var4; var5 < this.field1377; var5++) {
					this.field1233[var5] = this.field1233[var5 + 1];
				}
				// IGNORELIST_DEL
				this.out.p1Enc(101);
				this.out.p8(arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public int method532(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.N(I)V")
	public void method533() {
		LocType.mc1.clear();
		LocType.mc2.clear();
		NpcType.modelCache.clear();
		ObjType.modelcache.clear();
		ObjType.spriteCache.clear();
		ClientPlayer.field480.clear();
		SpotType.modelCache.clear();
	}

	@ObfuscatedName("client.O(I)V")
	public void method534() {
		if (this.field1616 == 2) {
			this.method438((this.field1578 - this.field1471 << 7) + this.field1581, (this.field1579 - this.field1472 << 7) + this.field1582, this.field1580 * 2);
			if (this.field1415 > -1 && field1218 % 20 < 10) {
				this.headicons[2].plotSprite(this.field1486, this.field1415 - 12, this.field1416 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILd;IIB)V")
	public void drawInterface(int arg0, IfType arg1, int arg2, int arg3) {
		if (arg1.field75 != 0 || arg1.field90 == null || arg1.field89 && this.field1664 != arg1.field73 && this.field1432 != arg1.field73 && this.field1482 != arg1.field73) {
			return;
		}
		int var5 = Pix2D.clipMinX;
		int var6 = Pix2D.clipMinY;
		int var7 = Pix2D.clipMaxX;
		int var8 = Pix2D.clipMaxY;
		Pix2D.setClipping(arg2 + arg1.field79, arg0 + arg1.field78, arg0, arg2);
		int var9 = arg1.field90.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg1.field91[var10] + arg0;
			int var12 = arg1.field92[var10] + arg2 - arg3;
			IfType var13 = IfType.list[arg1.field90[var10]];
			int var14 = var11 + var13.field81;
			int var15 = var12 + var13.field82;
			if (var13.field77 > 0) {
				this.method443(var13);
			}
			if (var13.field75 == 0) {
				if (var13.field88 > var13.field87 - var13.field79) {
					var13.field88 = var13.field87 - var13.field79;
				}
				if (var13.field88 < 0) {
					var13.field88 = 0;
				}
				this.drawInterface(var14, var13, var15, var13.field88);
				if (var13.field87 > var13.field79) {
					this.method464(var13.field88, var15, var13.field87, var14 + var13.field78, var13.field79);
				}
			} else if (var13.field75 != 1) {
				if (var13.field75 == 2) {
					int var16 = 0;
					for (int var17 = 0; var17 < var13.field79; var17++) {
						for (int var18 = 0; var18 < var13.field78; var18++) {
							int var19 = var14 + var18 * (var13.field99 + 32);
							int var20 = var15 + var17 * (var13.field100 + 32);
							if (var16 < 20) {
								var19 += var13.field102[var16];
								var20 += var13.field103[var16];
							}
							if (var13.field69[var16] > 0) {
								int var21 = 0;
								int var22 = 0;
								int var23 = var13.field69[var16] - 1;
								if (var19 > Pix2D.clipMinX - 32 && var19 < Pix2D.clipMaxX && var20 > Pix2D.clipMinY - 32 && var20 < Pix2D.clipMaxY || this.field1311 != 0 && this.field1310 == var16) {
									int var24 = 0;
									if (this.field1227 == 1 && this.field1228 == var16 && this.field1229 == var13.field73) {
										var24 = 16777215;
									}
									Pix32 var25 = ObjType.getSprite(var23, var24, var13.field70[var16]);
									if (var25 != null) {
										if (this.field1311 != 0 && this.field1310 == var16 && this.field1309 == var13.field73) {
											var21 = super.mouseX - this.field1312;
											var22 = super.mouseY - this.field1313;
											if (var21 < 5 && var21 > -5) {
												var21 = 0;
											}
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (this.field1666 < 5) {
												var21 = 0;
												var22 = 0;
											}
											var25.transPlotSprite(var20 + var22, var19 + var21);
											if (var20 + var22 < Pix2D.clipMinY && arg1.field88 > 0) {
												int var26 = this.field1391 * (Pix2D.clipMinY - var20 - var22) / 3;
												if (var26 > this.field1391 * 10) {
													var26 = this.field1391 * 10;
												}
												if (var26 > arg1.field88) {
													var26 = arg1.field88;
												}
												arg1.field88 -= var26;
												this.field1313 += var26;
											}
											if (var20 + var22 + 32 > Pix2D.clipMaxY && arg1.field88 < arg1.field87 - arg1.field79) {
												int var27 = this.field1391 * (var20 + var22 + 32 - Pix2D.clipMaxY) / 3;
												if (var27 > this.field1391 * 10) {
													var27 = this.field1391 * 10;
												}
												if (var27 > arg1.field87 - arg1.field79 - arg1.field88) {
													var27 = arg1.field87 - arg1.field79 - arg1.field88;
												}
												arg1.field88 += var27;
												this.field1313 -= var27;
											}
										} else if (this.field1266 != 0 && this.field1265 == var16 && this.field1264 == var13.field73) {
											var25.transPlotSprite(var20, var19);
										} else {
											var25.plotSprite(this.field1486, var19, var20);
										}
										if (var25.owi == 33 || var13.field70[var16] != 1) {
											int var28 = var13.field70[var16];
											this.field1491.drawString(var19 + var21 + 1, method518(var28), 0, var20 + var22 + 10);
											this.field1491.drawString(var19 + var21, method518(var28), 16776960, var20 + var22 + 9);
										}
									}
								}
							} else if (var13.field101 != null && var16 < 20) {
								Pix32 var29 = var13.field101[var16];
								if (var29 != null) {
									var29.plotSprite(this.field1486, var19, var20);
								}
							}
							var16++;
						}
					}
				} else if (var13.field75 == 3) {
					boolean var30 = false;
					if (this.field1482 == var13.field73 || this.field1432 == var13.field73 || this.field1664 == var13.field73) {
						var30 = true;
					}
					int var31;
					if (this.method542(var13)) {
						var31 = var13.field112;
						if (var30 && var13.field114 != 0) {
							var31 = var13.field114;
						}
					} else {
						var31 = var13.field111;
						if (var30 && var13.field113 != 0) {
							var31 = var13.field113;
						}
					}
					if (var13.field80 == 0) {
						if (var13.field105) {
							Pix2D.fillRect(var13.field79, var31, var13.field78, var14, var15);
						} else {
							Pix2D.drawRect(var13.field78, var31, var13.field79, var14, var15);
						}
					} else if (var13.field105) {
						Pix2D.fillRectTrans(var13.field78, var13.field79, var15, var31, var14, 256 - (var13.field80 & 0xFF));
					} else {
						Pix2D.drawRectTrans(var13.field78, var15, var14, var31, var13.field79, 256 - (var13.field80 & 0xFF));
					}
				} else if (var13.field75 == 4) {
					PixFont var32 = var13.field108;
					String var33 = var13.field109;
					boolean var34 = false;
					if (this.field1482 == var13.field73 || this.field1432 == var13.field73 || this.field1664 == var13.field73) {
						var34 = true;
					}
					int var35;
					if (this.method542(var13)) {
						var35 = var13.field112;
						if (var34 && var13.field114 != 0) {
							var35 = var13.field114;
						}
						if (var13.field110.length() > 0) {
							var33 = var13.field110;
						}
					} else {
						var35 = var13.field111;
						if (var34 && var13.field113 != 0) {
							var35 = var13.field113;
						}
					}
					if (var13.field76 == 6 && this.resumedPauseButton) {
						var33 = "Please wait...";
						var35 = var13.field111;
					}
					if (Pix2D.width == 479) {
						if (var35 == 16776960) {
							var35 = 255;
						}
						if (var35 == 49152) {
							var35 = 16777215;
						}
					}
					int var36 = var15 + var32.height;
					while (var33.length() > 0) {
						if (var33.indexOf("%") != -1) {
							label344: while (true) {
								int var37 = var33.indexOf("%1");
								if (var37 == -1) {
									while (true) {
										int var38 = var33.indexOf("%2");
										if (var38 == -1) {
											while (true) {
												int var39 = var33.indexOf("%3");
												if (var39 == -1) {
													while (true) {
														int var40 = var33.indexOf("%4");
														if (var40 == -1) {
															while (true) {
																int var41 = var33.indexOf("%5");
																if (var41 == -1) {
																	break label344;
																}
																var33 = var33.substring(0, var41) + this.method434(this.field1533, this.method442(var13, 4)) + var33.substring(var41 + 2);
															}
														}
														var33 = var33.substring(0, var40) + this.method434(this.field1533, this.method442(var13, 3)) + var33.substring(var40 + 2);
													}
												}
												var33 = var33.substring(0, var39) + this.method434(this.field1533, this.method442(var13, 2)) + var33.substring(var39 + 2);
											}
										}
										var33 = var33.substring(0, var38) + this.method434(this.field1533, this.method442(var13, 1)) + var33.substring(var38 + 2);
									}
								}
								var33 = var33.substring(0, var37) + this.method434(this.field1533, this.method442(var13, 0)) + var33.substring(var37 + 2);
							}
						}
						int var42 = var33.indexOf("\\n");
						String var43;
						if (var42 == -1) {
							var43 = var33;
							var33 = "";
						} else {
							var43 = var33.substring(0, var42);
							var33 = var33.substring(var42 + 2);
						}
						if (var13.field106) {
							var32.centreStringTag(var14 + var13.field78 / 2, var36, var43, var35, var13.field107);
						} else {
							var32.drawStringTag(var43, this.field1449, var13.field107, var36, var14, var35);
						}
						var36 += var32.height;
					}
				} else if (var13.field75 == 5) {
					Pix32 var44;
					if (this.method542(var13)) {
						var44 = var13.field116;
					} else {
						var44 = var13.field115;
					}
					if (var44 != null) {
						var44.plotSprite(this.field1486, var14, var15);
					}
				} else if (var13.field75 == 6) {
					int var45 = Pix3D.originX;
					int var46 = Pix3D.originY;
					Pix3D.originX = var14 + var13.field78 / 2;
					Pix3D.originY = var15 + var13.field79 / 2;
					int var47 = Pix3D.sinTable[var13.field124] * var13.field123 >> 16;
					int var48 = Pix3D.cosTable[var13.field124] * var13.field123 >> 16;
					boolean var49 = this.method542(var13);
					int var50;
					if (var49) {
						var50 = var13.modelAnim2;
					} else {
						var50 = var13.modelAnim;
					}
					Model var51;
					if (var50 == -1) {
						var51 = var13.method34(-1, -1, var49);
					} else {
						SeqType var52 = SeqType.list[var50];
						var51 = var13.method34(var52.frames[var13.field71], var52.iframes[var13.field71], var49);
					}
					if (var51 != null) {
						var51.objRender(var13.field125, 0, var13.field124, 0, var47, var48);
					}
					Pix3D.originX = var45;
					Pix3D.originY = var46;
				} else if (var13.field75 == 7) {
					PixFont var53 = var13.field108;
					int var54 = 0;
					for (int var55 = 0; var55 < var13.field79; var55++) {
						for (int var56 = 0; var56 < var13.field78; var56++) {
							if (var13.field69[var54] > 0) {
								ObjType var57 = ObjType.list(var13.field69[var54] - 1);
								String var58 = var57.name;
								if (var57.stackable || var13.field70[var54] != 1) {
									var58 = var58 + " x" + method505(var13.field70[var54], this.field1678);
								}
								int var59 = var14 + var56 * (var13.field99 + 115);
								int var60 = var15 + var55 * (var13.field100 + 12);
								if (var13.field106) {
									var53.centreStringTag(var59 + var13.field78 / 2, var60, var58, var13.field111, var13.field107);
								} else {
									var53.drawStringTag(var58, this.field1449, var13.field107, var60, var59, var13.field111);
								}
							}
							var54++;
						}
					}
				}
			}
		}
		Pix2D.setClipping(var8, var7, var5, var6);
	}

	@ObfuscatedName("client.P(I)V")
	public void method536() {
		if (this.field1410 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (this.field1410 > 768) {
					this.field1352[var1] = this.method532(this.field1353[var1], 1024 - this.field1410, this.field1354[var1]);
				} else if (this.field1410 > 256) {
					this.field1352[var1] = this.field1354[var1];
				} else {
					this.field1352[var1] = this.method532(this.field1354[var1], 256 - this.field1410, this.field1353[var1]);
				}
			}
		} else if (this.field1411 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (this.field1411 > 768) {
					this.field1352[var2] = this.method532(this.field1353[var2], 1024 - this.field1411, this.field1355[var2]);
				} else if (this.field1411 > 256) {
					this.field1352[var2] = this.field1355[var2];
				} else {
					this.field1352[var2] = this.method532(this.field1355[var2], 256 - this.field1411, this.field1353[var2]);
				}
			}
		} else {
			for (int var3 = 0; var3 < 256; var3++) {
				this.field1352[var3] = this.field1353[var3];
			}
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.field1458.data[var4] = this.field1307.data[var4];
		}
		int var5 = 0;
		int var6 = 1152;
		for (int var7 = 1; var7 < 255; var7++) {
			int var8 = this.field1319[var7] * (256 - var7) / 256;
			int var9 = var8 + 22;
			if (var9 < 0) {
				var9 = 0;
			}
			var5 += var9;
			for (int var10 = var9; var10 < 128; var10++) {
				int var11 = this.field1393[var5++];
				if (var11 == 0) {
					var6++;
				} else {
					int var13 = 256 - var11;
					int var14 = this.field1352[var11];
					int var15 = this.field1458.data[var6];
					this.field1458.data[var6++] = ((var14 & 0xFF00FF) * var11 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
				}
			}
			var6 += var9;
		}
		this.field1458.draw(0, super.graphics, 0);
		for (int var16 = 0; var16 < 33920; var16++) {
			this.field1459.data[var16] = this.field1308.data[var16];
		}
		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < 255; var19++) {
			int var20 = this.field1319[var19] * (256 - var19) / 256;
			int var21 = 103 - var20;
			int var22 = var18 + var20;
			for (int var23 = 0; var23 < var21; var23++) {
				int var24 = this.field1393[var17++];
				if (var24 == 0) {
					var22++;
				} else {
					int var26 = 256 - var24;
					int var27 = this.field1352[var24];
					int var28 = this.field1459.data[var22];
					this.field1459.data[var22++] = ((var27 & 0xFF00FF) * var24 + (var28 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var27 & 0xFF00) * var24 + (var28 & 0xFF00) * var26 & 0xFF0000) >> 8;
				}
			}
			var17 += 128 - var21;
			var18 = var22 + 128 - var21 - var20;
		}
		this.field1459.draw(637, super.graphics, 0);
	}

	@ObfuscatedName("client.l(Z)V")
	public void method537() {
		try {
			int var1 = field1668.field397 + this.field1662;
			int var2 = field1668.field398 + this.field1250;
			if (this.field1437 - var1 < -500 || this.field1437 - var1 > 500 || this.field1438 - var2 < -500 || this.field1438 - var2 > 500) {
				this.field1437 = var1;
				this.field1438 = var2;
			}
			if (this.field1437 != var1) {
				this.field1437 += (var1 - this.field1437) / 16;
			}
			if (this.field1438 != var2) {
				this.field1438 += (var2 - this.field1438) / 16;
			}
			if (super.keyHeld[1] == 1) {
				this.field1623 += (-this.field1623 - 24) / 2;
			} else if (super.keyHeld[2] == 1) {
				this.field1623 += (24 - this.field1623) / 2;
			} else {
				this.field1623 /= 2;
			}
			if (super.keyHeld[3] == 1) {
				this.field1624 += (12 - this.field1624) / 2;
			} else if (super.keyHeld[4] == 1) {
				this.field1624 += (-this.field1624 - 12) / 2;
			} else {
				this.field1624 /= 2;
			}
			this.field1622 = this.field1622 + this.field1623 / 2 & 0x7FF;
			this.field1621 += this.field1624 / 2;
			if (this.field1621 < 128) {
				this.field1621 = 128;
			}
			if (this.field1621 > 383) {
				this.field1621 = 383;
			}
			int var3 = this.field1437 >> 7;
			int var4 = this.field1438 >> 7;
			int var5 = this.method458(this.field1437, this.field1438, this.field1478);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = this.field1478;
						if (var9 < 3 && (this.field1243[1][var7][var8] & 0x2) == 2) {
							var9++;
						}
						int var10 = var5 - this.field1373[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}
			int var11 = var6 * 192;
			if (var11 > 98048) {
				var11 = 98048;
			}
			if (var11 < 32768) {
				var11 = 32768;
			}
			if (var11 > this.field1488) {
				this.field1488 += (var11 - this.field1488) / 24;
			} else if (var11 < this.field1488) {
				this.field1488 += (var11 - this.field1488) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field1668.field397 + "," + field1668.field398 + "," + this.field1437 + "," + this.field1438 + "," + this.field1338 + "," + this.field1339 + "," + this.field1471 + "," + this.field1472);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public void method538() {
		if (this.field1592 != -48671) {
			this.maininit();
		}
		if (this.minimapState != 0 || super.mouseClickButton != 1) {
			return;
		}
		int var1 = super.mouseClickX - 25 - 550;
		int var2 = super.mouseClickY - 5 - 4;
		if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
			return;
		}
		var1 -= 73;
		var2 -= 75;
		int var3 = this.field1622 + this.field1633 & 0x7FF;
		int var4 = Pix3D.sinTable[var3];
		int var5 = Pix3D.cosTable[var3];
		int var6 = var4 * (this.field1586 + 256) >> 8;
		int var7 = var5 * (this.field1586 + 256) >> 8;
		int var8 = var2 * var6 + var1 * var7 >> 11;
		int var9 = var2 * var7 - var1 * var6 >> 11;
		int var10 = field1668.field397 + var8 >> 7;
		int var11 = field1668.field398 - var9 >> 7;
		boolean var12 = this.method447(field1668.field448[0], var10, 0, 0, 0, field1668.field447[0], 0, true, 0, var11, 1);
		if (!var12) {
			return;
		}
		this.out.p1(var1);
		this.out.p1(var2);
		this.out.p2(this.field1622);
		this.out.p1(57);
		this.out.p1(this.field1633);
		this.out.p1(this.field1586);
		this.out.p1(89);
		this.out.p2(field1668.field397);
		this.out.p2(field1668.field398);
		this.out.p1(this.field1422);
		this.out.p1(63);
		return;
	}

	@ObfuscatedName("client.j(B)V")
	public void method539() {
		field1454++;
		if (field1454 > 192) {
			field1454 = 0;
			// ANTICHEAT_CYCLELOGIC4
			this.out.p1Enc(230);
			this.out.p1(232);
		}
		while (true) {
			int var1;
			do {
				while (true) {
					var1 = this.pollKey();
					if (var1 == -1) {
						return;
					}
					if (this.mainModalId != -1 && this.mainModalId == this.field1497) {
						if (var1 == 8 && this.field1367.length() > 0) {
							this.field1367 = this.field1367.substring(0, this.field1367.length() - 1);
						}
						break;
					}
					if (this.field1681) {
						if (var1 >= 32 && var1 <= 122 && this.field1400.length() < 80) {
							this.field1400 = this.field1400 + (char) var1;
							this.redrawChatback = true;
						}
						if (var1 == 8 && this.field1400.length() > 0) {
							this.field1400 = this.field1400.substring(0, this.field1400.length() - 1);
							this.redrawChatback = true;
						}
						if (var1 == 13 || var1 == 10) {
							this.field1681 = false;
							this.redrawChatback = true;
							if (this.field1467 == 1) {
								long var2 = JString.toUserhash(this.field1400);
								this.addFriend(var2);
							}
							if (this.field1467 == 2 && this.field1531 > 0) {
								long var4 = JString.toUserhash(this.field1400);
								this.delFriend(var4);
							}
							if (this.field1467 == 3 && this.field1400.length() > 0) {
								// MESSAGE_PRIVATE
								this.out.p1Enc(139);
								this.out.p1(0);
								int var6 = this.out.data;
								this.out.p8(this.field1283);
								WordPack.pack(this.field1400, this.out);
								this.out.psize1(this.out.data - var6, this.field1213);
								this.field1400 = JString.toSentenceCase(this.field1400);
								this.field1400 = WordFilter.filter(this.field1400);
								this.method457(6, JString.toScreenName(JString.toRawUsername(this.field1283)), this.field1400);
								if (this.field1388 == 2) {
									this.field1388 = 1;
									this.redrawPrivacySettings = true;
									// CHAT_SETMODE
									this.out.p1Enc(154);
									this.out.p1(this.field1383);
									this.out.p1(this.field1388);
									this.out.p1(this.field1221);
								}
							}
							if (this.field1467 == 4 && this.field1377 < 100) {
								long var7 = JString.toUserhash(this.field1400);
								this.addIgnore(var7);
							}
							if (this.field1467 == 5 && this.field1377 > 0) {
								long var9 = JString.toUserhash(this.field1400);
								this.delIgnore(this.field1390, var9);
							}
						}
					} else if (this.dialogInputOpen) {
						if (var1 >= 48 && var1 <= 57 && this.field1598.length() < 10) {
							this.field1598 = this.field1598 + (char) var1;
							this.redrawChatback = true;
						}
						if (var1 == 8 && this.field1598.length() > 0) {
							this.field1598 = this.field1598.substring(0, this.field1598.length() - 1);
							this.redrawChatback = true;
						}
						if (var1 == 13 || var1 == 10) {
							if (this.field1598.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(this.field1598);
								} catch (Exception var16) {
								}
								// RESUME_P_COUNTDIALOG
								this.out.p1Enc(102);
								this.out.p4(var11);
							}
							this.dialogInputOpen = false;
							this.redrawChatback = true;
						}
					} else if (this.chatComId == -1) {
						if (var1 >= 32 && (var1 <= 122 || (this.field1425.startsWith("::") && var1 <= 126)) && this.field1425.length() < 80) {
							this.field1425 = this.field1425 + (char) var1;
							this.redrawChatback = true;
						}
						if (var1 == 8 && this.field1425.length() > 0) {
							this.field1425 = this.field1425.substring(0, this.field1425.length() - 1);
							this.redrawChatback = true;
						}
						if ((var1 == 13 || var1 == 10) && this.field1425.length() > 0) {
							if (this.field1282 == 2) {
								if (this.field1425.equals("::clientdrop")) {
									this.method479();
								}
								if (this.field1425.equals("::lag")) {
									this.method526();
								}
								if (this.field1425.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < this.onDemand.getFileCount(field1651, 2); var12++) {
										this.onDemand.prefetchPriority(var12, 2, (byte) 1);
									}
								}
							}
							if (this.field1425.startsWith("::")) {
								// CLIENT_CHEAT
								this.out.p1Enc(224);
								this.out.p1(this.field1425.length() - 1);
								this.out.pjstr(this.field1425.substring(2));
							} else {
								byte var13 = 0;
								if (this.field1425.startsWith("yellow:")) {
									var13 = 0;
									this.field1425 = this.field1425.substring(7);
								}
								if (this.field1425.startsWith("red:")) {
									var13 = 1;
									this.field1425 = this.field1425.substring(4);
								}
								if (this.field1425.startsWith("green:")) {
									var13 = 2;
									this.field1425 = this.field1425.substring(6);
								}
								if (this.field1425.startsWith("cyan:")) {
									var13 = 3;
									this.field1425 = this.field1425.substring(5);
								}
								if (this.field1425.startsWith("purple:")) {
									var13 = 4;
									this.field1425 = this.field1425.substring(7);
								}
								if (this.field1425.startsWith("white:")) {
									var13 = 5;
									this.field1425 = this.field1425.substring(6);
								}
								if (this.field1425.startsWith("flash1:")) {
									var13 = 6;
									this.field1425 = this.field1425.substring(7);
								}
								if (this.field1425.startsWith("flash2:")) {
									var13 = 7;
									this.field1425 = this.field1425.substring(7);
								}
								if (this.field1425.startsWith("flash3:")) {
									var13 = 8;
									this.field1425 = this.field1425.substring(7);
								}
								if (this.field1425.startsWith("glow1:")) {
									var13 = 9;
									this.field1425 = this.field1425.substring(6);
								}
								if (this.field1425.startsWith("glow2:")) {
									var13 = 10;
									this.field1425 = this.field1425.substring(6);
								}
								if (this.field1425.startsWith("glow3:")) {
									var13 = 11;
									this.field1425 = this.field1425.substring(6);
								}
								byte var14 = 0;
								if (this.field1425.startsWith("wave:")) {
									var14 = 1;
									this.field1425 = this.field1425.substring(5);
								}
								if (this.field1425.startsWith("scroll:")) {
									var14 = 2;
									this.field1425 = this.field1425.substring(7);
								}
								// MESSAGE_PUBLIC
								this.out.p1Enc(253);
								this.out.p1(0);
								int var15 = this.out.data;
								this.out.p1(var13);
								this.out.p1(var14);
								WordPack.pack(this.field1425, this.out);
								this.out.psize1(this.out.data - var15, this.field1213);
								this.field1425 = JString.toSentenceCase(this.field1425);
								this.field1425 = WordFilter.filter(this.field1425);
								field1668.field409 = this.field1425;
								field1668.field411 = var13;
								field1668.field412 = var14;
								field1668.field410 = 150;
								if (this.field1282 == 2) {
									this.method457(2, "@cr2@" + field1668.field457, field1668.field409);
								} else if (this.field1282 == 1) {
									this.method457(2, "@cr1@" + field1668.field457, field1668.field409);
								} else {
									this.method457(2, field1668.field457, field1668.field409);
								}
								if (this.field1383 == 2) {
									this.field1383 = 3;
									this.redrawPrivacySettings = true;
									// CHAT_SETMODE
									this.out.p1Enc(154);
									this.out.p1(this.field1383);
									this.out.p1(this.field1388);
									this.out.p1(this.field1221);
								}
							}
							this.field1425 = "";
							this.redrawChatback = true;
						}
					}
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);
			if (this.field1367.length() < 12) {
				this.field1367 = this.field1367 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public void showLoadError(String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public void method541(int arg0, int arg1, NpcType arg2, int arg3) {
		if (this.field1396 >= 400) {
			return;
		}
		String var5 = arg2.name;
		if (arg2.vislevel != 0) {
			var5 = var5 + method485(arg2.vislevel, field1668.field463) + " (level-" + arg2.vislevel + ")";
		}
		if (this.field1227 == 1) {
			this.field1530[this.field1396] = "Use " + this.field1231 + " with @yel@" + var5;
			this.field1609[this.field1396] = 829;
			this.field1610[this.field1396] = arg3;
			this.field1607[this.field1396] = arg0;
			this.field1608[this.field1396] = arg1;
			this.field1396++;
		} else if (this.field1612 != 1) {
			if (arg2.op != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (arg2.op[var6] != null && !arg2.op[var6].equalsIgnoreCase("attack")) {
						this.field1530[this.field1396] = arg2.op[var6] + " @yel@" + var5;
						if (var6 == 0) {
							this.field1609[this.field1396] = 242;
						}
						if (var6 == 1) {
							this.field1609[this.field1396] = 209;
						}
						if (var6 == 2) {
							this.field1609[this.field1396] = 309;
						}
						if (var6 == 3) {
							this.field1609[this.field1396] = 852;
						}
						if (var6 == 4) {
							this.field1609[this.field1396] = 793;
						}
						this.field1610[this.field1396] = arg3;
						this.field1607[this.field1396] = arg0;
						this.field1608[this.field1396] = arg1;
						this.field1396++;
					}
				}
			}
			if (arg2.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg2.op[var7] != null && arg2.op[var7].equalsIgnoreCase("attack")) {
						short var8 = 0;
						if (arg2.vislevel > field1668.field463) {
							var8 = 2000;
						}
						this.field1530[this.field1396] = arg2.op[var7] + " @yel@" + var5;
						if (var7 == 0) {
							this.field1609[this.field1396] = var8 + 242;
						}
						if (var7 == 1) {
							this.field1609[this.field1396] = var8 + 209;
						}
						if (var7 == 2) {
							this.field1609[this.field1396] = var8 + 309;
						}
						if (var7 == 3) {
							this.field1609[this.field1396] = var8 + 852;
						}
						if (var7 == 4) {
							this.field1609[this.field1396] = var8 + 793;
						}
						this.field1610[this.field1396] = arg3;
						this.field1607[this.field1396] = arg0;
						this.field1608[this.field1396] = arg1;
						this.field1396++;
					}
				}
			}
			this.field1530[this.field1396] = "Examine @yel@" + var5;
			this.field1609[this.field1396] = 1714;
			this.field1610[this.field1396] = arg3;
			this.field1607[this.field1396] = arg0;
			this.field1608[this.field1396] = arg1;
			this.field1396++;
		} else if ((this.field1614 & 0x2) == 2) {
			this.field1530[this.field1396] = this.field1615 + " @yel@" + var5;
			this.field1609[this.field1396] = 240;
			this.field1610[this.field1396] = arg3;
			this.field1607[this.field1396] = arg0;
			this.field1608[this.field1396] = arg1;
			this.field1396++;
			return;
		}
	}

	@ObfuscatedName("client.b(Ld;I)Z")
	public boolean method542(IfType arg0) {
		if (arg0.field84 == null) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.field84.length; var2++) {
			int var3 = this.method442(arg0, var2);
			int var4 = arg0.field85[var2];
			if (arg0.field84[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field84[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field84[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.k(B)V")
	public void method543() {
		for (int var1 = 0; var1 < this.npcCount; var1++) {
			int var2 = this.npcIds[var1];
			ClientNpc var3 = this.field1675[var2];
			if (var3 != null) {
				this.method544(var3, var3.field453.size);
			}
		}
	}

	@ObfuscatedName("client.b(Ly;II)V")
	public void method544(ClientEntity arg0, int arg1) {
		if (arg0.field397 < 128 || arg0.field398 < 128 || arg0.field397 >= 13184 || arg0.field398 >= 13184) {
			arg0.field425 = -1;
			arg0.field430 = -1;
			arg0.field439 = 0;
			arg0.field440 = 0;
			arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
			arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
			arg0.method112();
		}
		if (arg0 == field1668 && (arg0.field397 < 1536 || arg0.field398 < 1536 || arg0.field397 >= 11776 || arg0.field398 >= 11776)) {
			arg0.field425 = -1;
			arg0.field430 = -1;
			arg0.field439 = 0;
			arg0.field440 = 0;
			arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
			arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
			arg0.method112();
		}
		if (arg0.field439 > field1218) {
			this.method545(arg0);
		} else if (arg0.field440 >= field1218) {
			this.method546(arg0, this.field1549);
		} else {
			this.method547(arg0);
		}
		this.method548(arg0);
		this.method549(arg0);
	}

	@ObfuscatedName("client.a(Ly;I)V")
	public void method545(ClientEntity arg0) {
		int var2 = arg0.field439 - field1218;
		int var3 = arg0.field435 * 128 + arg0.field401 * 64;
		int var4 = arg0.field437 * 128 + arg0.field401 * 64;
		arg0.field397 += (var3 - arg0.field397) / var2;
		arg0.field398 += (var4 - arg0.field398) / var2;
		arg0.field450 = 0;
		if (arg0.field441 == 0) {
			arg0.field444 = 1024;
		}
		if (arg0.field441 == 1) {
			arg0.field444 = 1536;
		}
		if (arg0.field441 == 2) {
			arg0.field444 = 0;
		}
		if (arg0.field441 == 3) {
			arg0.field444 = 512;
		}
	}

	@ObfuscatedName("client.b(Ly;I)V")
	public void method546(ClientEntity arg0, int arg1) {
		this.psize += arg1;
		if (arg0.field440 == field1218 || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > SeqType.list[arg0.field425].getDelay(arg0.field426)) {
			int var3 = arg0.field440 - arg0.field439;
			int var4 = field1218 - arg0.field439;
			int var5 = arg0.field435 * 128 + arg0.field401 * 64;
			int var6 = arg0.field437 * 128 + arg0.field401 * 64;
			int var7 = arg0.field436 * 128 + arg0.field401 * 64;
			int var8 = arg0.field438 * 128 + arg0.field401 * 64;
			arg0.field397 = (var5 * (var3 - var4) + var7 * var4) / var3;
			arg0.field398 = (var6 * (var3 - var4) + var8 * var4) / var3;
		}
		arg0.field450 = 0;
		if (arg0.field441 == 0) {
			arg0.field444 = 1024;
		}
		if (arg0.field441 == 1) {
			arg0.field444 = 1536;
		}
		if (arg0.field441 == 2) {
			arg0.field444 = 0;
		}
		if (arg0.field441 == 3) {
			arg0.field444 = 512;
		}
		arg0.field399 = arg0.field444;
	}

	@ObfuscatedName("client.a(ILy;)V")
	public void method547(ClientEntity arg0) {
		arg0.field422 = arg0.field402;
		if (arg0.field446 == 0) {
			arg0.field450 = 0;
			return;
		}
		if (arg0.field425 != -1 && arg0.field428 == 0) {
			SeqType var2 = SeqType.list[arg0.field425];
			if (arg0.field451 > 0 && var2.preanim_move == 0) {
				arg0.field450++;
				return;
			}
			if (arg0.field451 <= 0 && var2.postanim_move == 0) {
				arg0.field450++;
				return;
			}
		}
		int var3 = arg0.field397;
		int var4 = arg0.field398;
		int var5 = arg0.field447[arg0.field446 - 1] * 128 + arg0.field401 * 64;
		int var6 = arg0.field448[arg0.field446 - 1] * 128 + arg0.field401 * 64;
		if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
			arg0.field397 = var5;
			arg0.field398 = var6;
			return;
		}
		if (var3 < var5) {
			if (var4 < var6) {
				arg0.field444 = 1280;
			} else if (var4 > var6) {
				arg0.field444 = 1792;
			} else {
				arg0.field444 = 1536;
			}
		} else if (var3 > var5) {
			if (var4 < var6) {
				arg0.field444 = 768;
			} else if (var4 > var6) {
				arg0.field444 = 256;
			} else {
				arg0.field444 = 512;
			}
		} else if (var4 < var6) {
			arg0.field444 = 1024;
		} else {
			arg0.field444 = 0;
		}
		int var7 = arg0.field444 - arg0.field399 & 0x7FF;
		if (var7 > 1024) {
			var7 -= 2048;
		}
		int var8 = arg0.field405;
		if (var7 >= -256 && var7 <= 256) {
			var8 = arg0.field404;
		} else if (var7 >= 256 && var7 < 768) {
			var8 = arg0.field407;
		} else if (var7 >= -768 && var7 <= -256) {
			var8 = arg0.field406;
		}
		if (var8 == -1) {
			var8 = arg0.field404;
		}
		arg0.field422 = var8;
		int var9 = 4;
		if (arg0.field399 != arg0.field444 && arg0.field419 == -1 && arg0.field445 != 0) {
			var9 = 2;
		}
		if (arg0.field446 > 2) {
			var9 = 6;
		}
		if (arg0.field446 > 3) {
			var9 = 8;
		}
		if (arg0.field450 > 0 && arg0.field446 > 1) {
			var9 = 8;
			arg0.field450--;
		}
		if (arg0.field449[arg0.field446 - 1]) {
			var9 <<= 0x1;
		}
		if (var9 >= 8 && arg0.field422 == arg0.field404 && arg0.field408 != -1) {
			arg0.field422 = arg0.field408;
		}
		if (var3 < var5) {
			arg0.field397 += var9;
			if (arg0.field397 > var5) {
				arg0.field397 = var5;
			}
		} else if (var3 > var5) {
			arg0.field397 -= var9;
			if (arg0.field397 < var5) {
				arg0.field397 = var5;
			}
		}
		if (var4 < var6) {
			arg0.field398 += var9;
			if (arg0.field398 > var6) {
				arg0.field398 = var6;
			}
		} else if (var4 > var6) {
			arg0.field398 -= var9;
			if (arg0.field398 < var6) {
				arg0.field398 = var6;
			}
		}
		if (arg0.field397 != var5 || arg0.field398 != var6) {
			return;
		}
		arg0.field446--;
		if (arg0.field451 > 0) {
			arg0.field451--;
			return;
		}
	}

	@ObfuscatedName("client.c(Ly;I)V")
	public void method548(ClientEntity arg0) {
		if (arg0.field445 == 0) {
			return;
		}
		if (arg0.field419 != -1 && arg0.field419 < 32768) {
			ClientNpc var2 = this.field1675[arg0.field419];
			if (var2 != null) {
				int var3 = arg0.field397 - var2.field397;
				int var4 = arg0.field398 - var2.field398;
				if (var3 != 0 || var4 != 0) {
					arg0.field444 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field419 >= 32768) {
			int var5 = arg0.field419 - 32768;
			if (var5 == this.field1363) {
				var5 = this.field1535;
			}
			ClientPlayer var6 = this.field1536[var5];
			if (var6 != null) {
				int var7 = arg0.field397 - var6.field397;
				int var8 = arg0.field398 - var6.field398;
				if (var7 != 0 || var8 != 0) {
					arg0.field444 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field420 != 0 || arg0.field421 != 0) && (arg0.field446 == 0 || arg0.field450 > 0)) {
			int var9 = arg0.field397 - (arg0.field420 - this.field1471 - this.field1471) * 64;
			int var10 = arg0.field398 - (arg0.field421 - this.field1472 - this.field1472) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.field444 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
			}
			arg0.field420 = 0;
			arg0.field421 = 0;
		}
		int var11 = arg0.field444 - arg0.field399 & 0x7FF;
		if (var11 == 0) {
			return;
		}
		if (var11 < arg0.field445 || var11 > 2048 - arg0.field445) {
			arg0.field399 = arg0.field444;
		} else if (var11 > 1024) {
			arg0.field399 -= arg0.field445;
		} else {
			arg0.field399 += arg0.field445;
		}
		arg0.field399 &= 0x7FF;
		if (arg0.field422 != arg0.field402 || arg0.field399 == arg0.field444) {
			return;
		}
		if (arg0.field403 != -1) {
			arg0.field422 = arg0.field403;
			return;
		}
		arg0.field422 = arg0.field404;
		return;
	}

	@ObfuscatedName("client.d(Ly;I)V")
	public void method549(ClientEntity arg0) {
		arg0.field400 = false;
		if (arg0.field422 != -1) {
			SeqType var2 = SeqType.list[arg0.field422];
			arg0.field424++;
			if (arg0.field423 < var2.numFrames && arg0.field424 > var2.getDelay(arg0.field423)) {
				arg0.field424 = 0;
				arg0.field423++;
			}
			if (arg0.field423 >= var2.numFrames) {
				arg0.field424 = 0;
				arg0.field423 = 0;
			}
		}
		if (arg0.field430 != -1 && field1218 >= arg0.field433) {
			if (arg0.field431 < 0) {
				arg0.field431 = 0;
			}
			SeqType var3 = SpotType.list[arg0.field430].seq;
			arg0.field432++;
			while (arg0.field431 < var3.numFrames && arg0.field432 > var3.getDelay(arg0.field431)) {
				arg0.field432 -= var3.getDelay(arg0.field431);
				arg0.field431++;
			}
			if (arg0.field431 >= var3.numFrames && (arg0.field431 < 0 || arg0.field431 >= var3.numFrames)) {
				arg0.field430 = -1;
			}
		}
		if (arg0.field425 != -1 && arg0.field428 <= 1) {
			SeqType var4 = SeqType.list[arg0.field425];
			if (var4.preanim_move == 1 && arg0.field451 > 0 && arg0.field439 <= field1218 && arg0.field440 < field1218) {
				arg0.field428 = 1;
				return;
			}
		}
		if (arg0.field425 != -1 && arg0.field428 == 0) {
			SeqType var5 = SeqType.list[arg0.field425];
			arg0.field427++;
			while (arg0.field426 < var5.numFrames && arg0.field427 > var5.getDelay(arg0.field426)) {
				arg0.field427 -= var5.getDelay(arg0.field426);
				arg0.field426++;
			}
			if (arg0.field426 >= var5.numFrames) {
				arg0.field426 -= var5.loops;
				arg0.field429++;
				if (arg0.field429 >= var5.maxloops) {
					arg0.field425 = -1;
				}
				if (arg0.field426 < 0 || arg0.field426 >= var5.numFrames) {
					arg0.field425 = -1;
				}
			}
			arg0.field400 = var5.reachforward;
		}
		if (arg0.field428 > 0) {
			arg0.field428--;
		}
	}

	@ObfuscatedName("client.R(I)V")
	public void method550() {
		if (this.field1333) {
			this.field1333 = false;
			this.field1268.draw(0, super.graphics, 4);
			this.field1269.draw(0, super.graphics, 357);
			this.field1270.draw(722, super.graphics, 4);
			this.field1271.draw(743, super.graphics, 205);
			this.field1272.draw(0, super.graphics, 0);
			this.field1273.draw(516, super.graphics, 4);
			this.field1274.draw(516, super.graphics, 205);
			this.field1275.draw(496, super.graphics, 357);
			this.field1276.draw(0, super.graphics, 338);
			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;
			if (this.field1545 != 2) {
				this.field1280.draw(4, super.graphics, 4);
				this.field1279.draw(550, super.graphics, 4);
			}
		}
		if (this.field1545 == 2) {
			this.method445();
		}
		if (this.field1267 && this.field1670 == 1) {
			this.redrawSidebar = true;
		}
		if (this.sideModalId != -1) {
			boolean var1 = this.animateInterface(this.field1391, this.sideModalId);
			if (var1) {
				this.redrawSidebar = true;
			}
		}
		if (this.field1266 == 2) {
			this.redrawSidebar = true;
		}
		if (this.field1311 == 2) {
			this.redrawSidebar = true;
		}
		if (this.redrawSidebar) {
			this.method506();
			this.redrawSidebar = false;
		}
		if (this.chatComId == -1) {
			this.field1277.field88 = this.field1347 - this.field1498 - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.method472(77, this.field1277, super.mouseY - 357, 0, 463, super.mouseX - 17, false, this.field1347);
			}
			int var2 = this.field1347 - this.field1277.field88 - 77;
			if (var2 < 0) {
				var2 = 0;
			}
			if (var2 > this.field1347 - 77) {
				var2 = this.field1347 - 77;
			}
			if (this.field1498 != var2) {
				this.field1498 = var2;
				this.redrawChatback = true;
			}
		}
		if (this.chatComId != -1) {
			boolean var3 = this.animateInterface(this.field1391, this.chatComId);
			if (var3) {
				this.redrawChatback = true;
			}
		}
		if (this.field1266 == 3) {
			this.redrawChatback = true;
		}
		if (this.field1311 == 3) {
			this.redrawChatback = true;
		}
		if (this.field1245 != null) {
			this.redrawChatback = true;
		}
		if (this.field1267 && this.field1670 == 2) {
			this.redrawChatback = true;
		}
		if (this.redrawChatback) {
			this.method471();
			this.redrawChatback = false;
		}
		if (this.field1545 == 2) {
			this.method511();
			this.field1279.draw(550, super.graphics, 4);
		}
		if (this.field1589 != -1) {
			this.redrawSideicons = true;
		}
		if (this.redrawSideicons) {
			if (this.field1589 != -1 && this.field1589 == this.sideTab) {
				this.field1589 = -1;
				// TUT_CLICKSIDE
				this.out.p1Enc(94);
				this.out.p1(this.sideTab);
			}
			this.redrawSideicons = false;
			this.field1408.setPixels(field1376);
			this.backhmid1.plotSprite(this.field1486, 0, 0);
			if (this.sideModalId == -1) {
				if (this.field1370[this.sideTab] != -1) {
					if (this.sideTab == 0) {
						this.redstone1.plotSprite(this.field1486, 22, 10);
					}
					if (this.sideTab == 1) {
						this.redstone2.plotSprite(this.field1486, 54, 8);
					}
					if (this.sideTab == 2) {
						this.redstone2.plotSprite(this.field1486, 82, 8);
					}
					if (this.sideTab == 3) {
						this.redstone3.plotSprite(this.field1486, 110, 8);
					}
					if (this.sideTab == 4) {
						this.field1295.plotSprite(this.field1486, 153, 8);
					}
					if (this.sideTab == 5) {
						this.field1295.plotSprite(this.field1486, 181, 8);
					}
					if (this.sideTab == 6) {
						this.field1294.plotSprite(this.field1486, 209, 9);
					}
				}
				if (this.field1370[0] != -1 && (this.field1589 != 0 || field1218 % 20 < 10)) {
					this.sideicons[0].plotSprite(this.field1486, 29, 13);
				}
				if (this.field1370[1] != -1 && (this.field1589 != 1 || field1218 % 20 < 10)) {
					this.sideicons[1].plotSprite(this.field1486, 53, 11);
				}
				if (this.field1370[2] != -1 && (this.field1589 != 2 || field1218 % 20 < 10)) {
					this.sideicons[2].plotSprite(this.field1486, 82, 11);
				}
				if (this.field1370[3] != -1 && (this.field1589 != 3 || field1218 % 20 < 10)) {
					this.sideicons[3].plotSprite(this.field1486, 115, 12);
				}
				if (this.field1370[4] != -1 && (this.field1589 != 4 || field1218 % 20 < 10)) {
					this.sideicons[4].plotSprite(this.field1486, 153, 13);
				}
				if (this.field1370[5] != -1 && (this.field1589 != 5 || field1218 % 20 < 10)) {
					this.sideicons[5].plotSprite(this.field1486, 180, 11);
				}
				if (this.field1370[6] != -1 && (this.field1589 != 6 || field1218 % 20 < 10)) {
					this.sideicons[6].plotSprite(this.field1486, 208, 13);
				}
			}
			this.field1408.draw(516, super.graphics, 160);
			this.field1407.setPixels(field1376);
			this.backbase2.plotSprite(this.field1486, 0, 0);
			if (this.sideModalId == -1) {
				if (this.field1370[this.sideTab] != -1) {
					if (this.sideTab == 7) {
						this.field1626.plotSprite(this.field1486, 42, 0);
					}
					if (this.sideTab == 8) {
						this.field1627.plotSprite(this.field1486, 74, 0);
					}
					if (this.sideTab == 9) {
						this.field1627.plotSprite(this.field1486, 102, 0);
					}
					if (this.sideTab == 10) {
						this.field1628.plotSprite(this.field1486, 130, 1);
					}
					if (this.sideTab == 11) {
						this.field1630.plotSprite(this.field1486, 173, 0);
					}
					if (this.sideTab == 12) {
						this.field1630.plotSprite(this.field1486, 201, 0);
					}
					if (this.sideTab == 13) {
						this.field1629.plotSprite(this.field1486, 229, 0);
					}
				}
				if (this.field1370[8] != -1 && (this.field1589 != 8 || field1218 % 20 < 10)) {
					this.sideicons[7].plotSprite(this.field1486, 74, 2);
				}
				if (this.field1370[9] != -1 && (this.field1589 != 9 || field1218 % 20 < 10)) {
					this.sideicons[8].plotSprite(this.field1486, 102, 3);
				}
				if (this.field1370[10] != -1 && (this.field1589 != 10 || field1218 % 20 < 10)) {
					this.sideicons[9].plotSprite(this.field1486, 137, 4);
				}
				if (this.field1370[11] != -1 && (this.field1589 != 11 || field1218 % 20 < 10)) {
					this.sideicons[10].plotSprite(this.field1486, 174, 2);
				}
				if (this.field1370[12] != -1 && (this.field1589 != 12 || field1218 % 20 < 10)) {
					this.sideicons[11].plotSprite(this.field1486, 201, 2);
				}
				if (this.field1370[13] != -1 && (this.field1589 != 13 || field1218 % 20 < 10)) {
					this.sideicons[12].plotSprite(this.field1486, 226, 2);
				}
			}
			this.field1407.draw(496, super.graphics, 466);
			this.field1280.setPixels(field1376);
		}
		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;
			this.field1406.setPixels(field1376);
			this.backbase1.plotSprite(this.field1486, 0, 0);
			this.field1492.centreStringTag(55, 28, "Public chat", 16777215, true);
			if (this.field1383 == 0) {
				this.field1492.centreStringTag(55, 41, "On", 65280, true);
			}
			if (this.field1383 == 1) {
				this.field1492.centreStringTag(55, 41, "Friends", 16776960, true);
			}
			if (this.field1383 == 2) {
				this.field1492.centreStringTag(55, 41, "Off", 16711680, true);
			}
			if (this.field1383 == 3) {
				this.field1492.centreStringTag(55, 41, "Hide", 65535, true);
			}
			this.field1492.centreStringTag(184, 28, "Private chat", 16777215, true);
			if (this.field1388 == 0) {
				this.field1492.centreStringTag(184, 41, "On", 65280, true);
			}
			if (this.field1388 == 1) {
				this.field1492.centreStringTag(184, 41, "Friends", 16776960, true);
			}
			if (this.field1388 == 2) {
				this.field1492.centreStringTag(184, 41, "Off", 16711680, true);
			}
			this.field1492.centreStringTag(324, 28, "Trade/duel", 16777215, true);
			if (this.field1221 == 0) {
				this.field1492.centreStringTag(324, 41, "On", 65280, true);
			}
			if (this.field1221 == 1) {
				this.field1492.centreStringTag(324, 41, "Friends", 16776960, true);
			}
			if (this.field1221 == 2) {
				this.field1492.centreStringTag(324, 41, "Off", 16711680, true);
			}
			this.field1492.centreStringTag(458, 33, "Report abuse", 16777215, true);
			this.field1406.draw(0, super.graphics, 453);
			this.field1280.setPixels(field1376);
		}
		this.field1391 = 0;
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public void getNpcPos(int arg0, Packet arg1) {
		this.entityRemovalCount = 0;
		this.field1539 = 0;
		int var3 = arg0;
		this.getNpcPosOldVis(var3, this.field1341, arg1);
		this.getNpcPosNewVis(arg1, var3);
		this.getNpcPosExtended(var3, arg1);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var5 = this.entityRemovalIds[var4];
			if (this.field1675[var5].field442 != field1218) {
				this.field1675[var5].field453 = null;
				this.field1675[var5] = null;
			}
		}
		if (arg1.data != var3) {
			signlink.reporterror(this.field1563 + " size mismatch in getnpcpos - pos:" + arg1.data + " psize:" + var3);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.npcCount; var6++) {
			if (this.field1675[this.npcIds[var6]] == null) {
				signlink.reporterror(this.field1563 + " null entry in npc list - pos:" + var6 + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.S(I)V")
	public void method552() {
		if (this.field1545 != 2) {
			return;
		}
		for (LocChange var1 = (LocChange) this.field1644.head(); var1 != null; var1 = (LocChange) this.field1644.next(this.field1374)) {
			if (var1.field738 > 0) {
				var1.field738--;
			}
			if (var1.field738 != 0) {
				if (var1.field737 > 0) {
					var1.field737--;
				}
				if (var1.field737 == 0 && var1.field729 >= 1 && var1.field730 >= 1 && var1.field729 <= 102 && var1.field730 <= 102 && (var1.field734 < 0 || ClientBuild.method30(var1.field734, var1.field736))) {
					this.method452(var1.field735, var1.field728, var1.field729, var1.field736, var1.field734, var1.field727, var1.field730);
					var1.field737 = -1;
					if (var1.field734 == var1.field731 && var1.field731 == -1) {
						var1.unlink();
					} else if (var1.field734 == var1.field731 && var1.field735 == var1.field732 && var1.field736 == var1.field733) {
						var1.unlink();
					}
				}
			} else if (var1.field731 < 0 || ClientBuild.method30(var1.field731, var1.field733)) {
				this.method452(var1.field732, var1.field728, var1.field729, var1.field733, var1.field731, var1.field727, var1.field730);
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public void getPlayerPosNewVis(Packet arg0, int arg1, int arg2) {
		while (true) {
			if (arg0.field710 + 10 < arg1 * 8) {
				int var4 = arg0.gBit(11);
				if (var4 != 2047) {
					if (this.field1536[var4] == null) {
						this.field1536[var4] = new ClientPlayer();
						if (this.field1541[var4] != null) {
							this.field1536[var4].method116(this.field1541[var4], this.field1217);
						}
					}
					this.field1538[this.field1537++] = var4;
					ClientPlayer var5 = this.field1536[var4];
					var5.field442 = field1218;
					int var6 = arg0.gBit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg0.gBit(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					int var8 = arg0.gBit(1);
					var5.method110(field1668.field447[0] + var6, var8 == 1, field1668.field448[0] + var7);
					int var9 = arg0.gBit(1);
					if (var9 == 1) {
						this.field1540[this.field1539++] = var4;
					}
					continue;
				}
			}
			arg0.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("client.a([BIB)Z")
	public boolean method554(byte[] arg0, int arg1) {
		return arg0 == null ? true : signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.T(I)V")
	public void method555() {
		int var1 = 5;
		this.field1301[8] = 0;
		int var2 = 0;
		while (this.field1301[8] == 0) {
			String var3 = "Unknown problem";
			this.messageBox("Connecting to web server", 20);
			try {
				DataInputStream var4 = this.method492("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 274);
				Packet var5 = new Packet(new byte[40], (byte) 1);
				var4.readFully(var5.pos, 0, 40);
				var4.close();
				for (int var6 = 0; var6 < 9; var6++) {
					this.field1301[var6] = var5.g4();
				}
				int var7 = var5.g4();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + this.field1301[var9];
				}
				if (var7 != var8) {
					var3 = "checksum problem";
					this.field1301[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				this.field1301[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				this.field1301[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				this.field1301[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (this.field1301[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						this.messageBox("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						this.messageBox(var3 + " - Will retry in " + var10 + " secs.", 10);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var11) {
					}
				}
				var1 *= 2;
				if (var1 > 60) {
					var1 = 60;
				}
				this.field1469 = !this.field1469;
			}
		}
	}
}
