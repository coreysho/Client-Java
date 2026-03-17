package jagex2.client;

import deob.ObfuscatedName;
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

import java.applet.AppletContext;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

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
	public final long[] ignoreUserhash = new long[100];

	@ObfuscatedName("client.fb")
	public int inMultizone;

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

	@ObfuscatedName("client.ob")
	public byte[][][] mapl;

	@ObfuscatedName("client.pb")
	public String lastProgressMessage;

	@ObfuscatedName("client.qb")
	public String tutComMessage;

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
	public int macroCameraCycle;

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
	public Pix8 redstone1h;

	@ObfuscatedName("client.oc")
	public Pix8 redstone2h;

	@ObfuscatedName("client.pc")
	public static int field1296;

	@ObfuscatedName("client.rc")
	public int bankArrangeMode;

	@ObfuscatedName("client.sc")
	public final int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.U")
	public static final String field1223 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.W")
	public static final int[] readbit = new int[32];

	@ObfuscatedName("client.Re")
	public static final BigInteger field1428;

	@ObfuscatedName("client.Ef")
	public static final BigInteger field1466;

	@ObfuscatedName("client.kh")
	public static final int[] field1550;

	@ObfuscatedName("client.ij")
	public static final int[] levelExperience;

	@ObfuscatedName("client.jj")
	public static int nodeId;

	@ObfuscatedName("client.lj")
	public static boolean memServer;

	@ObfuscatedName("client.nj")
	public static final int[][] field1657;

	@ObfuscatedName("client.L")
	public final byte field1214 = 5;

	@ObfuscatedName("client.M")
	public final String[] field1215 = new String[5];

	@ObfuscatedName("client.N")
	public final boolean[] field1216 = new boolean[5];

	@ObfuscatedName("client.R")
	public final int[] field1220 = new int[50];

	@ObfuscatedName("client.X")
	public final int[] field1226 = new int[7];

	@ObfuscatedName("client.Ab")
	public int[] field1255 = new int[4000];

	@ObfuscatedName("client.Cb")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.Eb")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.Fb")
	public final int[] field1260 = new int[5];

	@ObfuscatedName("client.Mb")
	public boolean field1267 = false;

	@ObfuscatedName("client.Wb")
	public final IfType field1277 = new IfType();

	@ObfuscatedName("client.tc")
	public final int[] field1300 = new int[Skill.count];

	@ObfuscatedName("client.uc")
	public final int[] getJagChecksum = new int[9];

	@ObfuscatedName("client.yc")
	public int field1305 = 1;

	@ObfuscatedName("client.Hc")
	public boolean errorHost = false;

	@ObfuscatedName("client.Mc")
	public final int[] field1319 = new int[256];

	@ObfuscatedName("client.Nc")
	public final int[] field1320 = new int[5];

	@ObfuscatedName("client.Oc")
	public boolean ingame = false;

	@ObfuscatedName("client.Pc")
	public boolean field1322 = false;

	@ObfuscatedName("client.Xc")
	public final Pix8[] modIcons = new Pix8[2];

	@ObfuscatedName("client.ad")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.hd")
	public LinkList field1340 = new LinkList();

	@ObfuscatedName("client.ld")
	public boolean redrawSidebar = false;

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

	@ObfuscatedName("client.Ad")
	public Pix32[] mapfunction = new Pix32[100];

	@ObfuscatedName("client.Cd")
	public boolean focusIn = true;

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

	@ObfuscatedName("client.Zd")
	public final int[] camShakeCycle = new int[5];

	@ObfuscatedName("client.ce")
	public boolean field1387 = false;

	@ObfuscatedName("client.ee")
	public final int[] field1389 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

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

	@ObfuscatedName("client.Me")
	public final int field1423 = 5063219;

	@ObfuscatedName("client.Ne")
	public boolean cinemaCam = false;

	@ObfuscatedName("client.Oe")
	public String field1425 = "";

	@ObfuscatedName("client.Qe")
	public int chatComId = -1;

	@ObfuscatedName("client.Se")
	public int sideTab = 3;

	@ObfuscatedName("client.We")
	public boolean field1433 = false;

	@ObfuscatedName("client.Xe")
	public Pix8[] mapscene = new Pix8[100];

	@ObfuscatedName("client.Ye")
	public String field1435 = "";

	@ObfuscatedName("client.Ze")
	public int[][] field1436 = new int[104][104];

	@ObfuscatedName("client.df")
	public boolean sendCamera = false;

	@ObfuscatedName("client.kf")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.pf")
	public boolean errorStarted = false;

	@ObfuscatedName("client.rf")
	public int mainModalId = -1;

	@ObfuscatedName("client.Cf")
	public final int[] field1464 = new int[50];

	@ObfuscatedName("client.Hf")
	public boolean field1469 = false;

	@ObfuscatedName("client.If")
	public final int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.Tf")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Wf")
	public final int[] field1484 = new int[100];

	@ObfuscatedName("client.Xf")
	public boolean midiActive = true;

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

	@ObfuscatedName("client.qg")
	public byte[] field1504 = new byte[16384];

	@ObfuscatedName("client.rg")
	public final int[] field1505 = new int[5];

	@ObfuscatedName("client.tg")
	public final int field1507 = 50;

	@ObfuscatedName("client.ug")
	public final int[] field1508 = new int[field1507];

	@ObfuscatedName("client.vg")
	public final int[] field1509 = new int[field1507];

	@ObfuscatedName("client.wg")
	public final int[] field1510 = new int[field1507];

	@ObfuscatedName("client.xg")
	public final int[] field1511 = new int[field1507];

	@ObfuscatedName("client.yg")
	public final int[] field1512 = new int[field1507];

	@ObfuscatedName("client.zg")
	public final int[] field1513 = new int[field1507];

	@ObfuscatedName("client.Ag")
	public final int[] field1514 = new int[field1507];

	@ObfuscatedName("client.Bg")
	public final String[] field1515 = new String[field1507];

	@ObfuscatedName("client.Fg")
	public int mainOverlayId = -1;

	@ObfuscatedName("client.Gg")
	public boolean dialogInputOpen = false;

	@ObfuscatedName("client.Hg")
	public CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("client.Ig")
	public Packet field1522 = Packet.alloc(1);

	@ObfuscatedName("client.Jg")
	public int[] field1523 = new int[2000];

	@ObfuscatedName("client.Lg")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Mg")
	public int tutComId = -1;

	@ObfuscatedName("client.Qg")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Ug")
	public final int field1534 = 2048;

	@ObfuscatedName("client.Vg")
	public final int field1535 = 2047;

	@ObfuscatedName("client.Wg")
	public ClientPlayer[] field1536 = new ClientPlayer[field1534];

	@ObfuscatedName("client.Yg")
	public int[] field1538 = new int[field1534];

	@ObfuscatedName("client.ah")
	public int[] field1540 = new int[field1534];

	@ObfuscatedName("client.bh")
	public Packet[] field1541 = new Packet[field1534];

	@ObfuscatedName("client.eh")
	public boolean field1544 = false;

	@ObfuscatedName("client.hh")
	public int field1547 = -1;

	@ObfuscatedName("client.lh")
	public Packet in = Packet.alloc(1);

	@ObfuscatedName("client.mh")
	public final int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.rh")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.wh")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.xh")
	public String field1563 = "";

	@ObfuscatedName("client.yh")
	public String field1564 = "";

	@ObfuscatedName("client.Ah")
	public final int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Dh")
	public final int[] field1569 = new int[Skill.count];

	@ObfuscatedName("client.Gh")
	public LinkList field1572 = new LinkList();

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
	public boolean errorLoading = false;

	@ObfuscatedName("client.Zh")
	public boolean field1591 = false;

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
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Ni")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.Oi")
	public int sideModalId = -1;

	@ObfuscatedName("client.Qi")
	public int field1634 = 2;

	@ObfuscatedName("client.Xi")
	public final FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.aj")
	public LinkList field1644 = new LinkList();

	@ObfuscatedName("client.oj")
	public int field1658 = -1;

	@ObfuscatedName("client.tj")
	public int field1663 = 2;

	@ObfuscatedName("client.vj")
	public boolean field1665 = false;

	@ObfuscatedName("client.zj")
	public final int[] field1669 = new int[Skill.count];

	@ObfuscatedName("client.Fj")
	public ClientNpc[] field1675 = new ClientNpc[16384];

	@ObfuscatedName("client.Hj")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.Lj")
	public boolean field1681 = false;

	@ObfuscatedName("client.P")
	public static int loopCycle;

	@ObfuscatedName("client.Q")
	public int rebootTimer;

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
	public int selectedCycle;

	@ObfuscatedName("client.Jb")
	public int field1264;

	@ObfuscatedName("client.Kb")
	public int field1265;

	@ObfuscatedName("client.Lb")
	public int selectedArea;

	@ObfuscatedName("client.wc")
	public int field1303;

	@ObfuscatedName("client.xc")
	public int field1304;

	@ObfuscatedName("client.zc")
	public int field1306;

	@ObfuscatedName("client.Cc")
	public int objDragComId;

	@ObfuscatedName("client.Dc")
	public int objDragSlot;

	@ObfuscatedName("client.Ec")
	public int objDragArea;

	@ObfuscatedName("client.Fc")
	public int objGrabX;

	@ObfuscatedName("client.Gc")
	public int objGrabY;

	@ObfuscatedName("client.Jc")
	public static int field1316;

	@ObfuscatedName("client.Rc")
	public int lastProgressPercent;

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
	public int macroMinimapCycle;

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

	@ObfuscatedName("client.kd")
	public int nextMusicDelay;

	@ObfuscatedName("client.md")
	public int field1345;

	@ObfuscatedName("client.Md")
	public int field1371;

	@ObfuscatedName("client.Sd")
	public int ignoreCount;

	@ObfuscatedName("client.Td")
	public int hoveredSlot;

	@ObfuscatedName("client.Ud")
	public int hoveredSlotComId;

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
	public int worldUpdateNum;

	@ObfuscatedName("client.le")
	public int menuNumEntries;

	@ObfuscatedName("client.me")
	public static int field1397;

	@ObfuscatedName("client.oe")
	public int mouseTrackedDelta;

	@ObfuscatedName("client.se")
	public int field1403;

	@ObfuscatedName("client.ye")
	public int scrollCycle;

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
	public int sendCameraDelay;

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
	public int oneMouseButton;

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
	public int sceneState;

	@ObfuscatedName("client.gh")
	public int field1546;

	@ObfuscatedName("client.ih")
	public static int field1548;

	@ObfuscatedName("client.oh")
	public int ptype0;

	@ObfuscatedName("client.ph")
	public int ptype1;

	@ObfuscatedName("client.qh")
	public int ptype2;

	@ObfuscatedName("client.sh")
	public int crossX;

	@ObfuscatedName("client.th")
	public int crossY;

	@ObfuscatedName("client.uh")
	public int crossCycle;

	@ObfuscatedName("client.vh")
	public int crossMode;

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
	public int orbitCameraYaw;

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
	public int timeoutTimer;

	@ObfuscatedName("client.Ui")
	public int noTimeoutTimer;

	@ObfuscatedName("client.Vi")
	public int logoutTimer;

	@ObfuscatedName("client.Zi")
	public static int cyclelogic7;

	@ObfuscatedName("client.ej")
	public static int field1648;

	@ObfuscatedName("client.fj")
	public int mouseTrackedX;

	@ObfuscatedName("client.gj")
	public int mouseTrackedY;

	@ObfuscatedName("client.hj")
	public static int field1651;

	@ObfuscatedName("client.kj")
	public static int portOff;

	@ObfuscatedName("client.sj")
	public int field1662;

	@ObfuscatedName("client.uj")
	public int field1664;

	@ObfuscatedName("client.wj")
	public int objDragCycles;

	@ObfuscatedName("client.Aj")
	public int menuArea;

	@ObfuscatedName("client.Bj")
	public int menuX;

	@ObfuscatedName("client.Cj")
	public int menuY;

	@ObfuscatedName("client.Dj")
	public int menuWidth;

	@ObfuscatedName("client.Ej")
	public int menuHeight;

	@ObfuscatedName("client.Gj")
	public int npcCount;

	@ObfuscatedName("client.hg")
	public long field1495;

	@ObfuscatedName("client.dh")
	public long field1543;

	@ObfuscatedName("client.cj")
	public long prevMouseClickTime;

	@ObfuscatedName("client.dj")
	public long field1647;

	@ObfuscatedName("client.Yc")
	public World world;

	@ObfuscatedName("client.yj")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.Ac")
	public Pix32 field1307;

	@ObfuscatedName("client.Bc")
	public Pix32 field1308;

	@ObfuscatedName("client.Vd")
	public Pix32 mapmarker0;

	@ObfuscatedName("client.Wd")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.gf")
	public Pix32 minimap;

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
	public Pix8 redstone1v;

	@ObfuscatedName("client.Ji")
	public Pix8 redstone2v;

	@ObfuscatedName("client.Ki")
	public Pix8 redstone3v;

	@ObfuscatedName("client.Li")
	public Pix8 redstone1hv;

	@ObfuscatedName("client.Mi")
	public Pix8 redstone2hv;

	@ObfuscatedName("client.Jj")
	public Pix8 field1679;

	@ObfuscatedName("client.Kj")
	public Pix8 field1680;

	@ObfuscatedName("client.dg")
	public PixFont p11;

	@ObfuscatedName("client.eg")
	public PixFont p12;

	@ObfuscatedName("client.fg")
	public PixFont b12;

	@ObfuscatedName("client.gg")
	public PixFont q8;

	@ObfuscatedName("client.Nb")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.Ob")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.Pb")
	public PixMap areaBackright1;

	@ObfuscatedName("client.Qb")
	public PixMap areaBackright2;

	@ObfuscatedName("client.Rb")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.Sb")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.Tb")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.Ub")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.Vb")
	public PixMap areaBackhmid2;

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
	public PixMap imageTitle2;

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
	public JagFile title;

	@ObfuscatedName("client.Kh")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.Kg")
	public ClientStream stream;

	@ObfuscatedName("client.xi")
	public String field1615;

	@ObfuscatedName("client.Je")
	public Socket field1420;

	@ObfuscatedName("client.jd")
	public static boolean alreadyStarted;

	@ObfuscatedName("client.Rh")
	public static boolean mouseTracked;

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
	public int[] chatbackScanline;

	@ObfuscatedName("client.qj")
	public int[] sidebarScanline;

	@ObfuscatedName("client.rj")
	public int[] viewportScanline;

	@ObfuscatedName("client.bj")
	public Pix8[] field1645;

	@ObfuscatedName("client.vc")
	public byte[][] field1302;

	@ObfuscatedName("client.Kd")
	public byte[][] field1369;

	@ObfuscatedName("client.Od")
	public int[][][] groundh;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			readbit[var1] = var0 - 1;
			var0 += var0;
		}
		field1428 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		field1466 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		field1550 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		levelExperience = new int[99];
		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var2 += var5;
			levelExperience[var3] = var2 / 4;
		}
		nodeId = 10;
		memServer = true;
		field1657 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	public static void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 274);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOff = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMem();
				} else if (arg0[2].equals("highmem")) {
					setHighMem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					memServer = false;
				} else if (arg0[3].equals("members")) {
					memServer = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public static void setLowMem() {
		World.lowMem = true;
		Pix3D.lowMem = true;
		lowMem = true;
		ClientBuild.lowMem = true;
	}

	@ObfuscatedName("client.t(I)V")
	public static void setHighMem() {
		World.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		ClientBuild.lowMem = false;
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static String combatColourCode(int arg1, int arg2) {
		int var3 = arg2 - arg1;
		if (var3 < -9) {
			return "@red@";
		} else if (var3 < -6) {
			return "@or3@";
		} else if (var3 < -3) {
			return "@or2@";
		} else if (var3 < 0) {
			return "@or1@";
		} else if (var3 > 9) {
			return "@gre@";
		} else if (var3 > 6) {
			return "@gr3@";
		} else if (var3 > 3) {
			return "@gr2@";
		} else if (var3 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public static String niceNumber(int arg0) {
		String var2 = String.valueOf(arg0);
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
	public static String invNumber(int arg1) {
		if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public boolean animateInterface(int arg0, int arg1) {
		boolean var3 = false;
		IfType var4 = IfType.list[arg1];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.children[var5]];
			if (var6.type == 1) {
				var3 |= animateInterface(arg0, var6.id);
			}
			if (var6.type == 6 && (var6.modelAnim != -1 || var6.modelAnim2 != -1)) {
				boolean var7 = getIfActive(var6);
				int var8;
				if (var7) {
					var8 = var6.modelAnim2;
				} else {
					var8 = var6.modelAnim;
				}
				if (var8 != -1) {
					SeqType var9 = SeqType.list[var8];
					var6.animCycle += arg0;
					while (var6.animCycle > var9.getDelay(var6.animFrame)) {
						var6.animCycle -= var9.getDelay(var6.animFrame) + 1;
						var6.animFrame++;
						if (var6.animFrame >= var9.numFrames) {
							var6.animFrame -= var9.loops;
							if (var6.animFrame < 0 || var6.animFrame >= var9.numFrames) {
								var6.animFrame = 0;
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
	public void drawMinimenu() {
		int var3 = menuX;
		int var4 = menuY;
		int var5 = menuWidth;
		int var6 = menuHeight;
		int var7 = 6116423;
		Pix2D.fillRect(var6, var7, var5, var3, var4);
		Pix2D.fillRect(16, 0, var5 - 2, var3 + 1, var4 + 1);
		Pix2D.drawRect(var5 - 2, 0, var6 - 19, var3 + 1, var4 + 18);
		b12.drawString(var3 + 3, "Choose Option", var7, var4 + 14);
		int var8 = super.mouseX;
		int var9 = super.mouseY;
		if (menuArea == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (menuArea == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (menuArea == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		for (int var10 = 0; var10 < menuNumEntries; var10++) {
			int var11 = var4 + (menuNumEntries - 1 - var10) * 15 + 31;
			int var12 = 16777215;
			if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
				var12 = 16776960;
			}
			b12.drawStringTag(menuOption[var10], true, var11, var3 + 3, var12);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void prepareTitle() {
		if (imageTitle2 != null) {
			return;
		}
		super.drawArea = null;
		field1281 = null;
		field1279 = null;
		field1278 = null;
		field1280 = null;
		field1406 = null;
		field1407 = null;
		field1408 = null;
		field1458 = new PixMap(265, 128, getBaseComponent());
		Pix2D.cls();
		field1459 = new PixMap(265, 128, getBaseComponent());
		Pix2D.cls();
		imageTitle2 = new PixMap(171, 509, getBaseComponent());
		Pix2D.cls();
		field1456 = new PixMap(132, 360, getBaseComponent());
		Pix2D.cls();
		field1457 = new PixMap(200, 360, getBaseComponent());
		Pix2D.cls();
		field1460 = new PixMap(238, 202, getBaseComponent());
		Pix2D.cls();
		field1461 = new PixMap(238, 203, getBaseComponent());
		Pix2D.cls();
		field1462 = new PixMap(94, 74, getBaseComponent());
		Pix2D.cls();
		field1463 = new PixMap(94, 75, getBaseComponent());
		Pix2D.cls();
		if (title != null) {
			loadTitleBackground();
			loadTitleImages();
		}
		redrawFrame = true;
	}

	@ObfuscatedName("client.a(IZIIIII)V")
	public void method425(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 2048 - arg5 & 0x7FF;
		int var10 = 0;
		int var11 = 0;
		int var12 = arg6;
		if (var8 != 0) {
			int var13 = Model.sinTable[var8];
			int var14 = Model.cosTable[var8];
			int var15 = var11 * var14 - arg6 * var13 >> 16;
			var12 = var11 * var13 + arg6 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.sinTable[var9];
			int var17 = Model.cosTable[var9];
			int var18 = var12 * var16 + var10 * var17 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		field1236 = arg4 - var10;
		field1237 = arg3 - var11;
		field1238 = arg0 - var12;
		field1239 = arg2;
		field1240 = arg5;
	}

	@ObfuscatedName("client.g(I)V")
	public void otherOverlays() {
		method482();
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossX - 8 - 4, crossY - 8 - 4);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossX - 8 - 4, crossY - 8 - 4);
			field1517++;
			if (field1517 > 57) {
				field1517 = 0;
				out.p1Enc(100);
			}
		}
		if (mainOverlayId != -1) {
			animateInterface(worldUpdateNum, mainOverlayId);
			drawInterface(0, IfType.list[mainOverlayId], 0, 0);
		}
		if (mainModalId != -1) {
			animateInterface(worldUpdateNum, mainModalId);
			drawInterface(0, IfType.list[mainModalId], 0, 0);
		}
		getSpecialArea();
		if (!field1267) {
			buildMinimenu();
			method439();
		} else if (menuArea == 0) {
			drawMinimenu();
		}
		if (inMultizone == 1) {
			headicons[1].plotSprite(472, 296);
		}
		if (rebootTimer == 0) {
			return;
		}
		int var2 = rebootTimer / 50;
		int var3 = var2 / 60;
		int var4 = var2 % 60;
		if (var4 < 10) {
			p12.drawString(4, "System update in: " + var3 + ":0" + var4, 16776960, 329);
		} else {
			p12.drawString(4, "System update in: " + var3 + ":" + var4, 16776960, 329);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public void method427() {
		try {
			field1350 = -1;
			field1340.clear();
			field1572.clear();
			Pix3D.clearTexels();
			clearCaches();
			world.resetMap();
			for (int var2 = 0; var2 < 4; var2++) {
				collision[var2].reset();
			}
			System.gc();
			ClientBuild var3 = new ClientBuild(104, groundh, 104, mapl);
			int var4 = field1302.length;
			ClientBuild.lowMem = World.lowMem;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = field1246[var5] >> 8;
				int var7 = field1246[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					ClientBuild.lowMem = false;
				}
			}
			if (ClientBuild.lowMem) {
				world.fillBaseLevel(field1478);
			} else {
				world.fillBaseLevel(0);
			}
			out.p1Enc(120);
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (field1246[var8] >> 8) * 64 - field1471;
				int var10 = (field1246[var8] & 0xFF) * 64 - field1472;
				byte[] var11 = field1302[var8];
				if (var11 != null) {
					var3.loadGround((field1338 - 6) * 8, var11, var10, (field1339 - 6) * 8, var9);
				}
			}
			for (int var12 = 0; var12 < var4; var12++) {
				int var13 = (field1246[var12] >> 8) * 64 - field1471;
				int var14 = (field1246[var12] & 0xFF) * 64 - field1472;
				byte[] var15 = field1302[var12];
				if (var15 == null && field1339 < 800) {
					var3.fadeAdjacent(var14, var13, 64, 64);
				}
			}
			out.p1Enc(120);
			for (int var16 = 0; var16 < var4; var16++) {
				byte[] var17 = field1369[var16];
				if (var17 != null) {
					int var18 = (field1246[var16] >> 8) * 64 - field1471;
					int var19 = (field1246[var16] & 0xFF) * 64 - field1472;
					var3.loadLocations(var19, var17, world, var18, collision);
				}
			}
			out.p1Enc(120);
			var3.finishBuild(collision, world);
			field1280.setPixels();
			out.p1Enc(120);
			for (int var20 = 0; var20 < 104; var20++) {
				for (int var21 = 0; var21 < 104; var21++) {
					method460(var20, var21);
				}
			}
			method497();
		} catch (Exception var34) {
		}
		LocType.mc1.clear();
		if (lowMem && signlink.cache_dat != null) {
			int var23 = onDemand.getFileCount(0);
			for (int var24 = 0; var24 < var23; var24++) {
				int var25 = onDemand.getModelUse(var24);
				if ((var25 & 0x79) == 0) {
					Model.unload(var24);
				}
			}
		}
		System.gc();
		Pix3D.initPool(20);
		onDemand.clearPrefetches();
		int var26 = (field1338 - 6) / 8 - 1;
		int var27 = (field1338 + 6) / 8 + 1;
		int var28 = (field1339 - 6) / 8 - 1;
		int var29 = (field1339 + 6) / 8 + 1;
		if (field1585) {
			var26 = 49;
			var27 = 50;
			var28 = 49;
			var29 = 50;
		}
		for (int var30 = var26; var30 <= var27; var30++) {
			for (int var31 = var28; var31 <= var29; var31++) {
				if (var30 == var26 || var30 == var27 || var31 == var28 || var31 == var29) {
					int var32 = onDemand.getMapFile(0, var30, var31);
					if (var32 != -1) {
						onDemand.prefetch(3, var32);
					}
					int var33 = onDemand.getMapFile(1, var30, var31);
					if (var33 != -1) {
						onDemand.prefetch(3, var33);
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
	public void mouseLoop() {
		if (objDragArea != 0) {
			return;
		}
		int var2 = super.mouseClickButton;
		if (field1612 == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var2 = 0;
		}
		if (!field1267) {
			if (var2 == 1 && menuNumEntries > 0) {
				int var13 = field1609[menuNumEntries - 1];
				if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
					int var14 = field1607[menuNumEntries - 1];
					int var15 = field1608[menuNumEntries - 1];
					IfType var16 = IfType.list[var15];
					if (var16.field95 || var16.objReplace) {
						objGrabThreshold = false;
						objDragCycles = 0;
						objDragComId = var15;
						objDragSlot = var14;
						objDragArea = 2;
						objGrabX = super.mouseClickX;
						objGrabY = super.mouseClickY;
						if (IfType.list[var15].field74 == mainModalId) {
							objDragArea = 1;
						}
						if (IfType.list[var15].field74 == chatComId) {
							objDragArea = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
				var2 = 2;
			}
			if (var2 == 1 && menuNumEntries > 0) {
				doAction(menuNumEntries - 1);
			}
			if (var2 != 2 || menuNumEntries <= 0) {
				return;
			}
			openMenu();
			return;
		}
		if (var2 != 1) {
			int var3 = super.mouseX;
			int var4 = super.mouseY;
			if (menuArea == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (menuArea == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (menuArea == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < menuX - 10 || var3 > menuX + menuWidth + 10 || var4 < menuY - 10 || var4 > menuY + menuHeight + 10) {
				field1267 = false;
				if (menuArea == 1) {
					redrawSidebar = true;
				}
				if (menuArea == 2) {
					redrawChatback = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = menuX;
		int var6 = menuY;
		int var7 = menuWidth;
		int var8 = super.mouseClickX;
		int var9 = super.mouseClickY;
		if (menuArea == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (menuArea == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (menuArea == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < menuNumEntries; var11++) {
			int var12 = var6 + (menuNumEntries - 1 - var11) * 15 + 31;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			doAction(var10);
		}
		field1267 = false;
		if (menuArea == 1) {
			redrawSidebar = true;
		}
		if (menuArea == 2) {
			redrawChatback = true;
			return;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public boolean method430(String arg1) {
		if (arg1 == null) {
			return false;
		}
		for (int var3 = 0; var3 < field1531; var3++) {
			if (arg1.equalsIgnoreCase(field1249[var3])) {
				return true;
			}
		}
		return arg1.equalsIgnoreCase(localPlayer.field457);
	}

	@ObfuscatedName("client.b(I)V")
	@Override
	public void mainloop() {
		if (errorStarted || errorLoading || errorHost) {
			return;
		}
		loopCycle++;
		if (ingame) {
			gameLoop();
		} else {
			titleScreenLoop();
		}
		onDemandLoop();
	}

	@ObfuscatedName("client.h(I)V")
	public void onDemandLoop() {
		while (true) {
			OnDemandRequest var3 = onDemand.loop();
			if (var3 == null) {
				return;
			}
			if (var3.archive == 0) {
				Model.unpack(var3.file, var3.data);
				if ((onDemand.getModelUse(var3.file) & 0x62) != 0) {
					redrawSidebar = true;
					if (chatComId != -1) {
						redrawChatback = true;
					}
				}
			}
			if (var3.archive == 1 && var3.data != null) {
				AnimFrame.unpack(var3.data);
			}
			if (var3.archive == 2 && var3.file == midiSong && var3.data != null) {
				method484(midiFading, var3.data);
			}
			if (var3.archive == 3 && sceneState == 1) {
				for (int var4 = 0; var4 < field1302.length; var4++) {
					if (field1247[var4] == var3.file) {
						field1302[var4] = var3.data;
						if (var3.data == null) {
							field1247[var4] = -1;
						}
						break;
					}
					if (field1248[var4] == var3.file) {
						field1369[var4] = var3.data;
						if (var3.data == null) {
							field1248[var4] = -1;
						}
						break;
					}
				}
			}
			if (var3.archive == 93 && onDemand.hasMapLocFile(var3.file)) {
				ClientBuild.prefetchLocations(new Packet(var3.data), onDemand);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public boolean method432(IfType arg0) {
		int var3 = arg0.clientCode;
		if (var3 >= 1 && var3 <= 200 || !(var3 < 701 || var3 > 900)) {
			if (var3 >= 801) {
				var3 -= 701;
			} else if (var3 >= 701) {
				var3 -= 601;
			} else if (var3 >= 101) {
				var3 -= 101;
			} else {
				var3--;
			}
			menuOption[menuNumEntries] = "Remove @whi@" + field1249[var3];
			field1609[menuNumEntries] = 513;
			menuNumEntries++;
			menuOption[menuNumEntries] = "Message @whi@" + field1249[var3];
			field1609[menuNumEntries] = 902;
			menuNumEntries++;
			return true;
		} else if (var3 >= 401 && var3 <= 500) {
			menuOption[menuNumEntries] = "Remove @whi@" + arg0.field109;
			field1609[menuNumEntries] = 884;
			menuNumEntries++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public void getNpcPosNewVis(Packet arg1, int arg2) {
		while (true) {
			if (arg1.field710 + 21 < arg2 * 8) {
				int var4 = arg1.gBit(14);
				if (var4 != 16383) {
					if (field1675[var4] == null) {
						field1675[var4] = new ClientNpc();
					}
					ClientNpc var5 = field1675[var4];
					npcIds[npcCount++] = var4;
					var5.field442 = loopCycle;
					var5.field453 = NpcType.list(arg1.gBit(11));
					var5.field401 = var5.field453.size;
					var5.field445 = var5.field453.turnspeed;
					var5.field404 = var5.field453.walkanim;
					var5.field405 = var5.field453.walkanim_b;
					var5.field406 = var5.field453.walkanim_r;
					var5.field407 = var5.field453.walkanim_l;
					var5.field402 = var5.field453.readyanim;
					int var6 = arg1.gBit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg1.gBit(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					int var8 = arg1.gBit(1);
					var5.method110(localPlayer.field447[0] + var6, var8 == 1, false, localPlayer.field448[0] + var7);
					int var9 = arg1.gBit(1);
					if (var9 == 1) {
						field1540[field1539++] = var4;
					}
					continue;
				}
			}
			arg1.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public String method434(int arg1) {
		return arg1 < 999999999 ? String.valueOf(arg1) : "*";
	}

	@ObfuscatedName("client.i(I)V")
	public void soundsDoQueue() {
		for (int var2 = 0; var2 < field1345; var2++) {
			if (field1499[var2] <= 0) {
				boolean var3 = false;
				try {
					if (field1464[var2] != field1658 || field1220[var2] != field1547) {
						Packet var4 = JagFX.generate(field1464[var2], field1220[var2]);
						if (System.currentTimeMillis() + (long) (var4.data / 22) > field1495 + (long) (field1290 / 22)) {
							field1290 = var4.data;
							field1495 = System.currentTimeMillis();
							if (method554(var4.pos, var4.data)) {
								field1658 = field1464[var2];
								field1547 = field1220[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!method454()) {
						var3 = true;
					}
				} catch (Exception var7) {
				}
				if (var3 && field1499[var2] != -5) {
					field1499[var2] = -5;
				} else {
					field1345--;
					for (int var6 = var2; var6 < field1345; var6++) {
						field1464[var6] = field1464[var6 + 1];
						field1220[var6] = field1220[var6 + 1];
						field1499[var6] = field1499[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = field1499[var2]--;
			}
		}
		if (nextMusicDelay <= 0) {
			return;
		}
		nextMusicDelay -= 20;
		if (nextMusicDelay < 0) {
			nextMusicDelay = 0;
		}
		if (nextMusicDelay == 0 && midiActive && !lowMem) {
			midiSong = nextMidiSong;
			midiFading = true;
			onDemand.request(2, midiSong);
			return;
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void ifAnimReset(int arg0) {
		IfType var4 = IfType.list[arg0];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.children[var5]];
			if (var6.type == 1) {
				ifAnimReset(var6.id);
			}
			var6.animFrame = 0;
			var6.animCycle = 0;
		}
	}

	@ObfuscatedName("client.a(Ly;II)V")
	public void method437(ClientEntity arg0, int arg2) {
		method438(arg0.field397, arg0.field398, arg2);
	}

	@ObfuscatedName("client.a(IIII)V")
	public void method438(int arg1, int arg2, int arg3) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			field1415 = -1;
			field1416 = -1;
			return;
		}
		int var5 = method458(arg1, arg2, field1478) - arg3;
		int var6 = arg1 - field1236;
		int var7 = var5 - field1237;
		int var8 = arg2 - field1238;
		int var9 = Model.sinTable[field1239];
		int var10 = Model.cosTable[field1239];
		int var11 = Model.sinTable[field1240];
		int var12 = Model.cosTable[field1240];
		int var13 = var8 * var11 + var6 * var12 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		int var16 = var7 * var10 - var14 * var9 >> 16;
		int var17 = var7 * var9 + var14 * var10 >> 16;
		if (var17 >= 50) {
			field1415 = Pix3D.originX + (var13 << 9) / var17;
			field1416 = Pix3D.originY + (var16 << 9) / var17;
		} else {
			field1415 = -1;
			field1416 = -1;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public void method439() {
		if (menuNumEntries < 2 && field1227 == 0 && field1612 == 0) {
			return;
		}
		String var2;
		if (field1227 == 1 && menuNumEntries < 2) {
			var2 = "Use " + field1231 + " with...";
		} else if (field1612 == 1 && menuNumEntries < 2) {
			var2 = field1615 + "...";
		} else {
			var2 = menuOption[menuNumEntries - 1];
		}
		if (menuNumEntries > 2) {
			var2 = var2 + "@whi@ / " + (menuNumEntries - 2) + " more options";
		}
		b12.drawStringAntiMacro(4, var2, 15, 16777215, loopCycle / 1000, true);
	}

	@ObfuscatedName("client.a(ZZ)V")
	public void method440(boolean arg0) {
		for (int var3 = 0; var3 < npcCount; var3++) {
			ClientNpc var4 = field1675[npcIds[var3]];
			int var5 = (npcIds[var3] << 14) + 536870912;
			if (var4 != null && var4.method113() && var4.field453.alwaysontop == arg0) {
				int var6 = var4.field397 >> 7;
				int var7 = var4.field398 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field401 == 1 && (var4.field397 & 0x7F) == 64 && (var4.field398 & 0x7F) == 64) {
						if (field1436[var6][var7] == field1284) {
							continue;
						}
						field1436[var6][var7] = field1284;
					}
					world.addDynamic(method458(var4.field397, var4.field398, field1478), var4, var4.field397, var5, var4.field398, (var4.field401 - 1) * 64 + 60, var4.field399, field1478, var4.field400);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLib;)V")
	public void method441(int arg0, int arg1, Pix32 arg3) {
		int var5 = orbitCameraYaw + field1633 & 0x7FF;
		int var6 = arg1 * arg1 + arg0 * arg0;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.sinTable[var5];
		int var8 = Model.cosTable[var5];
		int var9 = var7 * 256 / (field1586 + 256);
		int var10 = var8 * 256 / (field1586 + 256);
		int var11 = arg0 * var9 + arg1 * var10 >> 16;
		int var12 = arg0 * var10 - arg1 * var9 >> 16;
		if (var6 > 2500) {
			arg3.scanlinePlotSprite(var11 + 94 + 4 - arg3.owi / 2, mapback, 83 - var12 - arg3.ohi / 2 - 4);
		} else {
			arg3.plotSprite(var11 + 94 + 4 - arg3.owi / 2, 83 - var12 - arg3.ohi / 2 - 4);
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void unload() {
		signlink.reporterror = false;
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var2) {
		}
		stream = null;
		method486();
		if (mouseTracking != null) {
			mouseTracking.active = false;
		}
		mouseTracking = null;
		onDemand.stop();
		onDemand = null;
		out = null;
		field1522 = null;
		in = null;
		field1246 = null;
		field1302 = null;
		field1369 = null;
		field1247 = null;
		field1248 = null;
		groundh = null;
		mapl = null;
		world = null;
		collision = null;
		field1402 = null;
		field1500 = null;
		field1254 = null;
		field1255 = null;
		field1504 = null;
		field1278 = null;
		field1279 = null;
		field1280 = null;
		field1281 = null;
		field1406 = null;
		field1407 = null;
		field1408 = null;
		areaBackleft1 = null;
		areaBackleft2 = null;
		areaBackright1 = null;
		areaBackright2 = null;
		areaBacktop1 = null;
		areaBackvmid1 = null;
		areaBackvmid2 = null;
		areaBackvmid3 = null;
		areaBackhmid2 = null;
		invback = null;
		mapback = null;
		chatback = null;
		backbase1 = null;
		backbase2 = null;
		backhmid1 = null;
		sideicons = null;
		redstone1 = null;
		redstone2 = null;
		redstone3 = null;
		redstone1h = null;
		redstone2h = null;
		redstone1v = null;
		redstone2v = null;
		redstone3v = null;
		redstone1hv = null;
		redstone2hv = null;
		compass = null;
		hitmarks = null;
		headicons = null;
		cross = null;
		mapdots0 = null;
		mapdots1 = null;
		mapdots2 = null;
		mapdots3 = null;
		mapscene = null;
		mapfunction = null;
		field1436 = null;
		field1536 = null;
		field1538 = null;
		field1540 = null;
		field1541 = null;
		entityRemovalIds = null;
		field1675 = null;
		npcIds = null;
		field1232 = null;
		field1644 = null;
		field1572 = null;
		field1340 = null;
		field1607 = null;
		field1608 = null;
		field1609 = null;
		field1610 = null;
		menuOption = null;
		field1523 = null;
		field1404 = null;
		field1405 = null;
		field1620 = null;
		minimap = null;
		field1249 = null;
		field1575 = null;
		field1489 = null;
		field1458 = null;
		field1459 = null;
		imageTitle2 = null;
		field1456 = null;
		field1457 = null;
		field1460 = null;
		field1461 = null;
		field1462 = null;
		field1463 = null;
		method522();
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
		super.drawArea = null;
		ClientPlayer.field480 = null;
		Pix3D.unload();
		World.unload();
		Model.unload((byte) 1);
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.a(ZLd;I)I")
	public int method442(IfType arg1, int arg2) {
		if (arg1.field83 == null || arg2 >= arg1.field83.length) {
			return -2;
		}
		try {
			int[] var4 = arg1.field83[arg2];
			int var5 = 0;
			int var6 = 0;
			byte var7 = 0;
			while (true) {
				int var8 = var4[var6++];
				int var9 = 0;
				byte var10 = 0;
				if (var8 == 0) {
					return var5;
				}
				if (var8 == 1) {
					var9 = field1300[var4[var6++]];
				}
				if (var8 == 2) {
					var9 = field1569[var4[var6++]];
				}
				if (var8 == 3) {
					var9 = field1669[var4[var6++]];
				}
				if (var8 == 4) {
					IfType var11 = IfType.list[var4[var6++]];
					int var12 = var4[var6++];
					if (var12 >= 0 && var12 < ObjType.numDefinitions && (!ObjType.list(var12).members || memServer)) {
						for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
							if (var11.linkObjType[var13] == var12 + 1) {
								var9 += var11.linkObjNumber[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var9 = field1523[var4[var6++]];
				}
				if (var8 == 6) {
					var9 = levelExperience[field1569[var4[var6++]] - 1];
				}
				if (var8 == 7) {
					var9 = field1523[var4[var6++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var9 = localPlayer.field463;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < Skill.count; var14++) {
						if (Skill.used[var14]) {
							var9 += field1569[var14];
						}
					}
				}
				if (var8 == 10) {
					IfType var15 = IfType.list[var4[var6++]];
					int var16 = var4[var6++] + 1;
					if (var16 >= 0 && var16 < ObjType.numDefinitions && (!ObjType.list(var16).members || memServer)) {
						for (int var17 = 0; var17 < var15.linkObjType.length; var17++) {
							if (var15.linkObjType[var17] == var16) {
								var9 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var9 = runenergy;
				}
				if (var8 == 12) {
					var9 = runweight;
				}
				if (var8 == 13) {
					int var18 = field1523[var4[var6++]];
					int var19 = var4[var6++];
					var9 = (var18 & 0x1 << var19) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var20 = var4[var6++];
					VarbitType var21 = VarbitType.list[var20];
					int var22 = var21.basevar;
					int var23 = var21.startbit;
					int var24 = var21.endbit;
					int var25 = readbit[var24 - var23];
					var9 = field1523[var22] >> var23 & var25;
				}
				if (var8 == 15) {
					var10 = 1;
				}
				if (var8 == 16) {
					var10 = 2;
				}
				if (var8 == 17) {
					var10 = 3;
				}
				if (var8 == 18) {
					var9 = (localPlayer.field397 >> 7) + field1471;
				}
				if (var8 == 19) {
					var9 = (localPlayer.field398 >> 7) + field1472;
				}
				if (var8 == 20) {
					var9 = var4[var6++];
				}
				if (var10 == 0) {
					if (var7 == 0) {
						var5 += var9;
					}
					if (var7 == 1) {
						var5 -= var9;
					}
					if (var7 == 2 && var9 != 0) {
						var5 /= var9;
					}
					if (var7 == 3) {
						var5 *= var9;
					}
					var7 = 0;
				} else {
					var7 = var10;
				}
			}
		} catch (Exception var26) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(BLd;)V")
	public void method443(IfType arg1) {
		int var3 = arg1.clientCode;
		if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
			if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
				int var5 = field1531;
				if (field1532 != 2) {
					var5 = 0;
				}
				if (var3 > 800) {
					var3 -= 701;
				} else {
					var3 -= 101;
				}
				if (var3 >= var5) {
					arg1.field109 = "";
					arg1.field76 = 0;
				} else {
					if (field1489[var3] == 0) {
						arg1.field109 = "@red@Offline";
					} else if (field1489[var3] == nodeId) {
						arg1.field109 = "@gre@World-" + (field1489[var3] - 9);
					} else {
						arg1.field109 = "@yel@World-" + (field1489[var3] - 9);
					}
					arg1.field76 = 1;
				}
			} else if (var3 == 203) {
				int var6 = field1531;
				if (field1532 != 2) {
					var6 = 0;
				}
				arg1.field87 = var6 * 15 + 20;
				if (arg1.field87 <= arg1.field79) {
					arg1.field87 = arg1.field79 + 1;
				}
			} else if (var3 >= 401 && var3 <= 500) {
				var3 -= 401;
				if (var3 >= ignoreCount) {
					arg1.field109 = "";
					arg1.field76 = 0;
				} else {
					arg1.field109 = JString.toScreenName(JString.toRawUsername(ignoreUserhash[var3]));
					arg1.field76 = 1;
				}
			} else if (var3 == 503) {
				arg1.field87 = ignoreCount * 15 + 20;
				if (arg1.field87 <= arg1.field79) {
					arg1.field87 = arg1.field79 + 1;
				}
			} else if (var3 == 327) {
				arg1.field124 = 150;
				arg1.field125 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
				if (field1387) {
					for (int var7 = 0; var7 < 7; var7++) {
						int var8 = field1226[var7];
						if (var8 >= 0 && !IdkType.list[var8].checkModel()) {
							return;
						}
					}
					field1387 = false;
					Model[] var9 = new Model[7];
					int var10 = 0;
					for (int var11 = 0; var11 < 7; var11++) {
						int var12 = field1226[var11];
						if (var12 >= 0) {
							var9[var10++] = IdkType.list[var12].getModelNoCheck();
						}
					}
					Model var13 = new Model(var10, var9);
					for (int var14 = 0; var14 < 5; var14++) {
						if (field1505[var14] != 0) {
							var13.recolour(field1657[var14][0], field1657[var14][field1505[var14]]);
							if (var14 == 1) {
								var13.recolour(field1550[0], field1550[field1505[var14]]);
							}
						}
					}
					var13.prepareAnim();
					var13.animate(SeqType.list[localPlayer.field402].frames[0]);
					var13.calculateNormals(64, 850, -30, -50, -30, true);
					arg1.model1Type = 5;
					arg1.field118 = 0;
					IfType.method36(0, var13, 5);
				}
			} else if (var3 == 324) {
				if (field1475 == null) {
					field1475 = arg1.field115;
					field1476 = arg1.field116;
				}
				if (field1398) {
					arg1.field115 = field1476;
				} else {
					arg1.field115 = field1475;
				}
			} else if (var3 == 325) {
				if (field1475 == null) {
					field1475 = arg1.field115;
					field1476 = arg1.field116;
				}
				if (field1398) {
					arg1.field115 = field1475;
				} else {
					arg1.field115 = field1476;
				}
			} else if (var3 == 600) {
				arg1.field109 = field1367;
				if (loopCycle % 20 < 10) {
					arg1.field109 = arg1.field109 + "|";
				} else {
					arg1.field109 = arg1.field109 + " ";
				}
			} else {
				if (var3 == 613) {
					if (field1282 < 1) {
						arg1.field109 = "";
					} else if (field1544) {
						arg1.field111 = 16711680;
						arg1.field109 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.field111 = 16777215;
						arg1.field109 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var3 == 650 || var3 == 655) {
					if (field1386 == 0) {
						arg1.field109 = "";
					} else {
						String var15;
						if (field1426 == 0) {
							var15 = "earlier today";
						} else if (field1426 == 1) {
							var15 = "yesterday";
						} else {
							var15 = field1426 + " days ago";
						}
						arg1.field109 = "You last logged in " + var15 + " from: " + signlink.dns;
					}
				}
				if (var3 == 651) {
					if (field1303 == 0) {
						arg1.field109 = "0 unread messages";
						arg1.field111 = 16776960;
					}
					if (field1303 == 1) {
						arg1.field109 = "1 unread message";
						arg1.field111 = 65280;
					}
					if (field1303 > 1) {
						arg1.field109 = field1303 + " unread messages";
						arg1.field111 = 65280;
					}
				}
				if (var3 == 652) {
					if (field1445 == 201) {
						if (field1516 == 1) {
							arg1.field109 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg1.field109 = "";
						}
					} else if (field1445 == 200) {
						arg1.field109 = "You have not yet set any password recovery questions.";
					} else {
						String var16;
						if (field1445 == 0) {
							var16 = "Earlier today";
						} else if (field1445 == 1) {
							var16 = "Yesterday";
						} else {
							var16 = field1445 + " days ago";
						}
						arg1.field109 = var16 + " you changed your recovery questions";
					}
				}
				if (var3 == 653) {
					if (field1445 == 201) {
						if (field1516 == 1) {
							arg1.field109 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg1.field109 = "";
						}
					} else if (field1445 == 200) {
						arg1.field109 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.field109 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var3 == 654) {
					if (field1445 == 201) {
						if (field1516 == 1) {
							arg1.field109 = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg1.field109 = "";
						}
					} else if (field1445 == 200) {
						arg1.field109 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.field109 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} else if (var3 == 1 && field1532 == 0) {
			arg1.field109 = "Loading friend list";
			arg1.field76 = 0;
		} else if (var3 == 1 && field1532 == 1) {
			arg1.field109 = "Connecting to friendserver";
			arg1.field76 = 0;
		} else if (var3 == 2 && field1532 != 2) {
			arg1.field109 = "Please wait...";
			arg1.field76 = 0;
		} else {
			int var4 = field1531;
			if (field1532 != 2) {
				var4 = 0;
			}
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= var4) {
				arg1.field109 = "";
				arg1.field76 = 0;
			} else {
				arg1.field109 = field1249[var3];
				arg1.field76 = 1;
			}
		}
	}

	@ObfuscatedName("client.a(IIILab;Z)V")
	public void method444(int arg0, int arg1, int arg2, ClientPlayer arg3, boolean arg4) {
		if (!arg4 || (arg3 == localPlayer || menuNumEntries >= 400)) {
			return;
		}
		String var6;
		if (arg3.field464 == 0) {
			var6 = arg3.field457 + combatColourCode(arg3.field463, localPlayer.field463) + " (level-" + arg3.field463 + ")";
		} else {
			var6 = arg3.field457 + " (skill-" + arg3.field464 + ")";
		}
		if (field1227 == 1) {
			menuOption[menuNumEntries] = "Use " + field1231 + " with @whi@" + var6;
			field1609[menuNumEntries] = 275;
			field1610[menuNumEntries] = arg1;
			field1607[menuNumEntries] = arg0;
			field1608[menuNumEntries] = arg2;
			menuNumEntries++;
		} else if (field1612 != 1) {
			for (int var7 = 4; var7 >= 0; var7--) {
				if (field1215[var7] != null) {
					menuOption[menuNumEntries] = field1215[var7] + " @whi@" + var6;
					short var8 = 0;
					if (field1215[var7].equalsIgnoreCase("attack")) {
						if (arg3.field463 > localPlayer.field463) {
							var8 = 2000;
						}
					} else if (field1216[var7]) {
						var8 = 2000;
					}
					if (var7 == 0) {
						field1609[menuNumEntries] = var8 + 639;
					}
					if (var7 == 1) {
						field1609[menuNumEntries] = var8 + 499;
					}
					if (var7 == 2) {
						field1609[menuNumEntries] = var8 + 27;
					}
					if (var7 == 3) {
						field1609[menuNumEntries] = var8 + 387;
					}
					if (var7 == 4) {
						field1609[menuNumEntries] = var8 + 185;
					}
					field1610[menuNumEntries] = arg1;
					field1607[menuNumEntries] = arg0;
					field1608[menuNumEntries] = arg2;
					menuNumEntries++;
				}
			}
		} else if ((field1614 & 0x8) == 8) {
			menuOption[menuNumEntries] = field1615 + " @whi@" + var6;
			field1609[menuNumEntries] = 131;
			field1610[menuNumEntries] = arg1;
			field1607[menuNumEntries] = arg0;
			field1608[menuNumEntries] = arg2;
			menuNumEntries++;
		}
		for (int var9 = 0; var9 < menuNumEntries; var9++) {
			if (field1609[var9] == 718) {
				menuOption[var9] = "Walk here @whi@" + var6;
				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void method445() {
		field1284++;
		method513(true);
		method440(true);
		method513(false);
		method440(false);
		method463();
		method478();
		if (!cinemaCam) {
			int var2 = orbitCameraPitch;
			if (field1488 / 256 > var2) {
				var2 = field1488 / 256;
			}
			if (field1577[4] && field1320[4] + 128 > var2) {
				var2 = field1320[4] + 128;
			}
			int var3 = orbitCameraYaw + field1304 & 0x7FF;
			method425(field1438, var2, method458(localPlayer.field397, localPlayer.field398, field1478) - 50, field1437, var3, var2 * 3 + 600);
		}
		int var4;
		if (cinemaCam) {
			var4 = method529();
		} else {
			var4 = method528();
		}
		int var5 = field1236;
		int var6 = field1237;
		int var7 = field1238;
		int var8 = field1239;
		int var9 = field1240;
		for (int var10 = 0; var10 < 5; var10++) {
			if (field1577[var10]) {
				int var11 = (int) (Math.random() * (double) (field1414[var10] * 2 + 1) + Math.sin((double) camShakeCycle[var10] * ((double) field1260[var10] / 100.0D)) * (double) field1320[var10] - (double) field1414[var10]);
				if (var10 == 0) {
					field1236 += var11;
				}
				if (var10 == 1) {
					field1237 += var11;
				}
				if (var10 == 2) {
					field1238 += var11;
				}
				if (var10 == 3) {
					field1240 = field1240 + var11 & 0x7FF;
				}
				if (var10 == 4) {
					field1239 += var11;
					if (field1239 < 128) {
						field1239 = 128;
					}
					if (field1239 > 383) {
						field1239 = 383;
					}
				}
			}
		}
		int var12 = Pix3D.cycle;
		Model.mouseCheck = true;
		Model.pickedCount = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;
		Pix2D.cls();
		world.renderAll(field1236, field1238, field1240, field1237, var4, field1239);
		world.removeSprites();
		method523();
		method534();
		method465(var12);
		otherOverlays();
		field1280.draw(4, super.graphics, 4);
		field1236 = var5;
		field1237 = var6;
		field1238 = var7;
		field1239 = var8;
		field1240 = var9;
	}

	@ObfuscatedName("client.b(Z)V")
	public void chatModeLoop() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			field1383 = (field1383 + 1) % 4;
			redrawPrivacySettings = true;
			redrawChatback = true;
			out.p1Enc(154);
			out.p1(field1383);
			out.p1(field1388);
			out.p1(field1221);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			field1388 = (field1388 + 1) % 3;
			redrawPrivacySettings = true;
			redrawChatback = true;
			out.p1Enc(154);
			out.p1(field1383);
			out.p1(field1388);
			out.p1(field1221);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			field1221 = (field1221 + 1) % 3;
			redrawPrivacySettings = true;
			redrawChatback = true;
			out.p1Enc(154);
			out.p1(field1383);
			out.p1(field1388);
			out.p1(field1221);
		}
		if (super.mouseClickX < 412 || super.mouseClickX > 512 || super.mouseClickY < 467 || super.mouseClickY > 499) {
			return;
		}
		closeModal();
		field1367 = "";
		field1544 = false;
		for (int var2 = 0; var2 < IfType.list.length; var2++) {
			if (IfType.list[var2] != null && IfType.list[var2].clientCode == 600) {
				field1497 = mainModalId = IfType.list[var2].field74;
				return;
			}
		}
		return;
	}

	@ObfuscatedName("client.a(IIIIIIIZIIBI)Z")
	public boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var16 = 0; var16 < var14; var16++) {
				field1402[var15][var16] = 0;
				field1500[var15][var16] = 99999999;
			}
		}
		int var17 = arg5;
		int var18 = arg0;
		field1402[arg5][arg0] = 99;
		field1500[arg5][arg0] = 0;
		byte var19 = 0;
		int var20 = 0;
		field1254[var19] = arg5;
		int var36 = var19 + 1;
		field1255[var19] = arg0;
		boolean var21 = false;
		int var22 = field1254.length;
		int[][] var23 = collision[field1478].flags;
		while (var20 != var36) {
			var17 = field1254[var20];
			var18 = field1255[var20];
			var20 = (var20 + 1) % var22;
			if (var17 == arg1 && var18 == arg9) {
				var21 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && collision[field1478].testWall(var17, arg8, arg1, arg9, arg6 - 1, var18)) {
					var21 = true;
					break;
				}
				if (arg6 < 10 && collision[field1478].testWDecor(arg1, arg9, var17, arg6 - 1, arg8, var18)) {
					var21 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && collision[field1478].testLoc(arg1, arg2, arg4, arg9, var18, var17, arg3)) {
				var21 = true;
				break;
			}
			int var24 = field1500[var17][var18] + 1;
			if (var17 > 0 && field1402[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 0x280108) == 0) {
				field1254[var36] = var17 - 1;
				field1255[var36] = var18;
				var36 = (var36 + 1) % var22;
				field1402[var17 - 1][var18] = 2;
				field1500[var17 - 1][var18] = var24;
			}
			if (var17 < var13 - 1 && field1402[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 0x280180) == 0) {
				field1254[var36] = var17 + 1;
				field1255[var36] = var18;
				var36 = (var36 + 1) % var22;
				field1402[var17 + 1][var18] = 8;
				field1500[var17 + 1][var18] = var24;
			}
			if (var18 > 0 && field1402[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				field1254[var36] = var17;
				field1255[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				field1402[var17][var18 - 1] = 1;
				field1500[var17][var18 - 1] = var24;
			}
			if (var18 < var14 - 1 && field1402[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				field1254[var36] = var17;
				field1255[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				field1402[var17][var18 + 1] = 4;
				field1500[var17][var18 + 1] = var24;
			}
			if (var17 > 0 && var18 > 0 && field1402[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 0x28010E) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				field1254[var36] = var17 - 1;
				field1255[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				field1402[var17 - 1][var18 - 1] = 3;
				field1500[var17 - 1][var18 - 1] = var24;
			}
			if (var17 < var13 - 1 && var18 > 0 && field1402[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 0x280183) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				field1254[var36] = var17 + 1;
				field1255[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				field1402[var17 + 1][var18 - 1] = 9;
				field1500[var17 + 1][var18 - 1] = var24;
			}
			if (var17 > 0 && var18 < var14 - 1 && field1402[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 0x280138) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				field1254[var36] = var17 - 1;
				field1255[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				field1402[var17 - 1][var18 + 1] = 6;
				field1500[var17 - 1][var18 + 1] = var24;
			}
			if (var17 < var13 - 1 && var18 < var14 - 1 && field1402[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 0x2801E0) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				field1254[var36] = var17 + 1;
				field1255[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				field1402[var17 + 1][var18 + 1] = 12;
				field1500[var17 + 1][var18 + 1] = var24;
			}
		}
		field1422 = 0;
		if (!var21) {
			if (arg7) {
				int var25 = 100;
				for (int var26 = 1; var26 < 2; var26++) {
					for (int var27 = arg1 - var26; var27 <= arg1 + var26; var27++) {
						for (int var28 = arg9 - var26; var28 <= arg9 + var26; var28++) {
							if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field1500[var27][var28] < var25) {
								var25 = field1500[var27][var28];
								var17 = var27;
								var18 = var28;
								field1422 = 1;
								var21 = true;
							}
						}
					}
					if (var21) {
						break;
					}
				}
			}
			if (!var21) {
				return false;
			}
		}
		byte var29 = 0;
		field1254[var29] = var17;
		int var37 = var29 + 1;
		field1255[var29] = var18;
		int var30;
		int var31 = var30 = field1402[var17][var18];
		while (var17 != arg5 || var18 != arg0) {
			if (var31 != var30) {
				var30 = var31;
				field1254[var37] = var17;
				field1255[var37++] = var18;
			}
			if ((var31 & 0x2) != 0) {
				var17++;
			} else if ((var31 & 0x8) != 0) {
				var17--;
			}
			if ((var31 & 0x1) != 0) {
				var18++;
			} else if ((var31 & 0x4) != 0) {
				var18--;
			}
			var31 = field1402[var17][var18];
		}
		if (var37 > 0) {
			int var32 = var37;
			if (var37 > 25) {
				var32 = 25;
			}
			var37--;
			int var33 = field1254[var37];
			int var34 = field1255[var37];
			if (arg11 == 0) {
				out.p1Enc(207);
				out.p1(var32 + var32 + 3);
			}
			if (arg11 == 1) {
				out.p1Enc(86);
				out.p1(var32 + var32 + 3 + 14);
			}
			if (arg11 == 2) {
				out.p1Enc(138);
				out.p1(var32 + var32 + 3);
			}
			if (super.keyHeld[5] == 1) {
				out.p1(1);
			} else {
				out.p1(0);
			}
			out.p2(var33 + field1471);
			out.p2(var34 + field1472);
			minimapFlagX = field1254[0];
			field1442 = field1255[0];
			for (int var35 = 1; var35 < var32; var35++) {
				var37--;
				out.p1(field1254[var37] - var33);
				out.p1(field1255[var37] - var34);
			}
			return true;
		} else if (arg11 == 1) {
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
	public void clientVar(int arg1) {
		int var3 = VarpType.list[arg1].clientcode;
		if (var3 == 0) {
			return;
		}
		int var4 = field1523[arg1];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.initColourTable(0.9D);
			}
			if (var4 == 2) {
				Pix3D.initColourTable(0.8D);
			}
			if (var4 == 3) {
				Pix3D.initColourTable(0.7D);
			}
			if (var4 == 4) {
				Pix3D.initColourTable(0.6D);
			}
			ObjType.spriteCache.clear();
			redrawFrame = true;
		}
		if (var3 == 3) {
			boolean var5 = midiActive;
			if (var4 == 0) {
				method517(midiActive, 0);
				midiActive = true;
			}
			if (var4 == 1) {
				method517(midiActive, -400);
				midiActive = true;
			}
			if (var4 == 2) {
				method517(midiActive, -800);
				midiActive = true;
			}
			if (var4 == 3) {
				method517(midiActive, -1200);
				midiActive = true;
			}
			if (var4 == 4) {
				midiActive = false;
			}
			if (midiActive != var5 && !lowMem) {
				if (midiActive) {
					midiSong = nextMidiSong;
					midiFading = true;
					onDemand.request(2, midiSong);
				} else {
					method486();
				}
				nextMusicDelay = 0;
			}
		}
		if (var3 == 4) {
			if (var4 == 0) {
				field1496 = true;
				method428(0);
			}
			if (var4 == 1) {
				field1496 = true;
				method428(-400);
			}
			if (var4 == 2) {
				field1496 = true;
				method428(-800);
			}
			if (var4 == 3) {
				field1496 = true;
				method428(-1200);
			}
			if (var4 == 4) {
				field1496 = false;
			}
		}
		if (var3 == 5) {
			oneMouseButton = var4;
		}
		if (var3 == 6) {
			field1477 = var4;
		}
		if (var3 == 8) {
			field1490 = var4;
			redrawChatback = true;
		}
		if (var3 == 9) {
			bankArrangeMode = var4;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public void method449(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var7 = world.getWall(arg4, arg0, arg2);
		if (var7 != 0) {
			int var8 = world.typeCode2(arg4, arg0, arg2, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg1;
			if (var7 > 0) {
				var11 = arg3;
			}
			int[] var12 = minimap.data;
			int var13 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
			int var14 = var7 >> 14 & 0x7FFF;
			LocType var15 = LocType.list(var14);
			if (var15.mapscene == -1) {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}
				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			} else {
				Pix8 var16 = mapscene[var15.mapscene];
				if (var16 != null) {
					int var17 = (var15.width * 4 - var16.wi) / 2;
					int var18 = (var15.length * 4 - var16.hi) / 2;
					var16.plotSprite(arg0 * 4 + var17 + 48, (104 - arg2 - var15.length) * 4 + 48 + var18);
				}
			}
		}
		int var19 = world.getScene(arg4, arg0, arg2);
		if (var19 != 0) {
			int var20 = world.typeCode2(arg4, arg0, arg2, var19);
			int var21 = var20 >> 6 & 0x3;
			int var22 = var20 & 0x1F;
			int var23 = var19 >> 14 & 0x7FFF;
			LocType var24 = LocType.list(var23);
			if (var24.mapscene != -1) {
				Pix8 var25 = mapscene[var24.mapscene];
				if (var25 != null) {
					int var26 = (var24.width * 4 - var25.wi) / 2;
					int var27 = (var24.length * 4 - var25.hi) / 2;
					var25.plotSprite(arg0 * 4 + var26 + 48, (104 - arg2 - var24.length) * 4 + 48 + var27);
				}
			} else if (var22 == 9) {
				int var28 = 15658734;
				if (var19 > 0) {
					var28 = 15597568;
				}
				int[] var29 = minimap.data;
				int var30 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
				if (var21 == 0 || var21 == 2) {
					var29[var30 + 1536] = var28;
					var29[var30 + 1024 + 1] = var28;
					var29[var30 + 512 + 2] = var28;
					var29[var30 + 3] = var28;
				} else {
					var29[var30] = var28;
					var29[var30 + 512 + 1] = var28;
					var29[var30 + 1024 + 2] = var28;
					var29[var30 + 1536 + 3] = var28;
				}
			}
		}
		int var31 = world.getGd(arg4, arg0, arg2);
		if (var31 == 0) {
			return;
		}
		int var32 = var31 >> 14 & 0x7FFF;
		LocType var33 = LocType.list(var32);
		if (var33.mapscene == -1) {
			return;
		}
		Pix8 var34 = mapscene[var33.mapscene];
		if (var34 != null) {
			int var35 = (var33.width * 4 - var34.wi) / 2;
			int var36 = (var33.length * 4 - var34.hi) / 2;
			var34.plotSprite(arg0 * 4 + var35 + 48, (104 - arg2 - var33.length) * 4 + 48 + var36);
			return;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void checkMinimap() {
		if (lowMem && sceneState == 2 && ClientBuild.minusedlevel != field1478) {
			field1280.setPixels();
			p12.centreString(257, 151, 0, "Loading - please wait.");
			p12.centreString(256, 150, 16777215, "Loading - please wait.");
			field1280.draw(4, super.graphics, 4);
			sceneState = 1;
			field1543 = System.currentTimeMillis();
		}
		if (sceneState == 1) {
			int var1 = method451();
			if (var1 != 0 && System.currentTimeMillis() - field1543 > 360000L) {
				signlink.reporterror(field1563 + " glcfb " + field1647 + "," + var1 + "," + lowMem + "," + fileStreams[0] + "," + onDemand.remaining() + "," + field1478 + "," + field1338 + "," + field1339);
				field1543 = System.currentTimeMillis();
			}
		}
		if (sceneState == 2 && field1478 != field1350) {
			field1350 = field1478;
			method487(field1478);
		}
	}

	@ObfuscatedName("client.e(B)I")
	public int method451() {
		for (int var2 = 0; var2 < field1302.length; var2++) {
			if (field1302[var2] == null && field1247[var2] != -1) {
				return -1;
			}
			if (field1369[var2] == null && field1248[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		for (int var4 = 0; var4 < field1302.length; var4++) {
			byte[] var5 = field1369[var4];
			if (var5 != null) {
				int var6 = (field1246[var4] >> 8) * 64 - field1471;
				int var7 = (field1246[var4] & 0xFF) * 64 - field1472;
				var3 &= ClientBuild.checkLocations(var5, var7, var6);
			}
		}
		if (!var3) {
			return -3;
		} else if (field1665) {
			return -4;
		} else {
			sceneState = 2;
			ClientBuild.minusedlevel = field1478;
			method427();
			out.p1Enc(214);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public void method452(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6, int arg7) {if (arg2 < 1 || arg7 < 1 || arg2 > 102 || arg7 > 102) {
			return;
		}
		if (lowMem && arg6 != field1478) {
			return;
		}
		int var10 = 0;
		if (arg1 == 0) {
			var10 = world.getWall(arg6, arg2, arg7);
		}
		if (arg1 == 1) {
			var10 = world.getDecor(arg7, arg2, arg6);
		}
		if (arg1 == 2) {
			var10 = world.getScene(arg6, arg2, arg7);
		}
		if (arg1 == 3) {
			var10 = world.getGd(arg6, arg2, arg7);
		}
		if (var10 != 0) {
			int var11 = world.typeCode2(arg6, arg2, arg7, var10);
			int var12 = var10 >> 14 & 0x7FFF;
			int var13 = var11 & 0x1F;
			int var14 = var11 >> 6;
			if (arg1 == 0) {
				world.delWall(arg6, arg7, arg2);
				LocType var15 = LocType.list(var12);
				if (var15.blockwalk) {
					collision[arg6].delWall(var13, var15.blockrange, var14, arg7, arg2);
				}
			}
			if (arg1 == 1) {
				world.delDecor(arg7, arg6, arg2);
			}
			if (arg1 == 2) {
				world.delLoc(arg7, arg6, arg2);
				LocType var16 = LocType.list(var12);
				if (arg2 + var16.width > 103 || arg7 + var16.width > 103 || arg2 + var16.length > 103 || arg7 + var16.length > 103) {
					return;
				}
				if (var16.blockwalk) {
					collision[arg6].delLoc(var16.width, arg2, arg7, var14, var16.blockrange, var16.length);
				}
			}
			if (arg1 == 3) {
				world.delGroundDecor(arg2, arg6, arg7);
				LocType var17 = LocType.list(var12);
				if (var17.blockwalk && var17.active) {
					collision[arg6].unblockGroundDecor(arg2, arg7);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		int var18 = arg6;
		if (arg6 < 3 && (mapl[1][arg2][arg7] & 0x2) == 2) {
			var18 = arg6 + 1;
		}
		ClientBuild.changeLocUnchecked(world, var18, arg6, arg5, arg3, arg0, collision[arg6], groundh, arg7, arg2);
		return;
	}

	@ObfuscatedName("client.c(Z)V")
	public void closeModal() {
		out.p1Enc(51);
		if (sideModalId != -1) {
			sideModalId = -1;
			redrawSidebar = true;
			resumedPauseButton = false;
			redrawSideicons = true;
		}
		if (chatComId != -1) {
			chatComId = -1;
			redrawChatback = true;
			resumedPauseButton = false;
		}
		mainModalId = -1;
	}

	@ObfuscatedName("client.m(I)Z")
	public boolean method454() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(I)V")
	public void method455() {
		if (field1227 == 0 && field1612 == 0) {
			menuOption[menuNumEntries] = "Walk here";
			field1609[menuNumEntries] = 718;
			field1607[menuNumEntries] = super.mouseX;
			field1608[menuNumEntries] = super.mouseY;
			menuNumEntries++;
		}
		int var2 = -1;
		for (int var3 = 0; var3 < Model.pickedCount; var3++) {
			int var4 = Model.pickedEntityTypecode[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var4 != var2) {
				var2 = var4;
				if (var7 == 2 && world.typeCode2(field1478, var5, var6, var4) >= 0) {
					LocType var9 = LocType.list(var8);
					if (field1227 == 1) {
						menuOption[menuNumEntries] = "Use " + field1231 + " with @cya@" + var9.name;
						field1609[menuNumEntries] = 810;
						field1610[menuNumEntries] = var4;
						field1607[menuNumEntries] = var5;
						field1608[menuNumEntries] = var6;
						menuNumEntries++;
					} else if (field1612 != 1) {
						if (var9.op != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.op[var10] != null) {
									menuOption[menuNumEntries] = var9.op[var10] + " @cya@" + var9.name;
									if (var10 == 0) {
										field1609[menuNumEntries] = 625;
									}
									if (var10 == 1) {
										field1609[menuNumEntries] = 721;
									}
									if (var10 == 2) {
										field1609[menuNumEntries] = 743;
									}
									if (var10 == 3) {
										field1609[menuNumEntries] = 357;
									}
									if (var10 == 4) {
										field1609[menuNumEntries] = 1071;
									}
									field1610[menuNumEntries] = var4;
									field1607[menuNumEntries] = var5;
									field1608[menuNumEntries] = var6;
									menuNumEntries++;
								}
							}
						}
						menuOption[menuNumEntries] = "Examine @cya@" + var9.name;
						field1609[menuNumEntries] = 1381;
						field1610[menuNumEntries] = var4;
						field1607[menuNumEntries] = var5;
						field1608[menuNumEntries] = var6;
						menuNumEntries++;
					} else if ((field1614 & 0x4) == 4) {
						menuOption[menuNumEntries] = field1615 + " @cya@" + var9.name;
						field1609[menuNumEntries] = 899;
						field1610[menuNumEntries] = var4;
						field1607[menuNumEntries] = var5;
						field1608[menuNumEntries] = var6;
						menuNumEntries++;
					}
				}
				if (var7 == 1) {
					ClientNpc var11 = field1675[var8];
					if (var11.field453.size == 1 && (var11.field397 & 0x7F) == 64 && (var11.field398 & 0x7F) == 64) {
						for (int var12 = 0; var12 < npcCount; var12++) {
							ClientNpc var13 = field1675[npcIds[var12]];
							if (var13 != null && var13 != var11 && var13.field453.size == 1 && var13.field397 == var11.field397 && var13.field398 == var11.field398) {
								method541(var5, var6, var13.field453, npcIds[var12]);
							}
						}
						for (int var14 = 0; var14 < field1537; var14++) {
							ClientPlayer var15 = field1536[field1538[var14]];
							if (var15 != null && var15.field397 == var11.field397 && var15.field398 == var11.field398) {
								method444(var5, field1538[var14], var6, var15, true);
							}
						}
					}
					method541(var5, var6, var11.field453, var8);
				}
				if (var7 == 0) {
					ClientPlayer var16 = field1536[var8];
					if ((var16.field397 & 0x7F) == 64 && (var16.field398 & 0x7F) == 64) {
						for (int var17 = 0; var17 < npcCount; var17++) {
							ClientNpc var18 = field1675[npcIds[var17]];
							if (var18 != null && var18.field453.size == 1 && var18.field397 == var16.field397 && var18.field398 == var16.field398) {
								method541(var5, var6, var18.field453, npcIds[var17]);
							}
						}
						for (int var19 = 0; var19 < field1537; var19++) {
							ClientPlayer var20 = field1536[field1538[var19]];
							if (var20 != null && var20 != var16 && var20.field397 == var16.field397 && var20.field398 == var16.field398) {
								method444(var5, field1538[var19], var6, var20, true);
							}
						}
					}
					method444(var5, var8, var6, var16, true);
				}
				if (var7 == 3) {
					LinkList var21 = field1232[field1478][var5][var6];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.tail(); var22 != null; var22 = (ClientObj) var21.prev()) {
							ObjType var23 = ObjType.list(var22.field494);
							if (field1227 == 1) {
								menuOption[menuNumEntries] = "Use " + field1231 + " with @lre@" + var23.name;
								field1609[menuNumEntries] = 111;
								field1610[menuNumEntries] = var22.field494;
								field1607[menuNumEntries] = var5;
								field1608[menuNumEntries] = var6;
								menuNumEntries++;
							} else if (field1612 != 1) {
								for (int var24 = 4; var24 >= 0; var24--) {
									if (var23.op != null && var23.op[var24] != null) {
										menuOption[menuNumEntries] = var23.op[var24] + " @lre@" + var23.name;
										if (var24 == 0) {
											field1609[menuNumEntries] = 139;
										}
										if (var24 == 1) {
											field1609[menuNumEntries] = 778;
										}
										if (var24 == 2) {
											field1609[menuNumEntries] = 617;
										}
										if (var24 == 3) {
											field1609[menuNumEntries] = 224;
										}
										if (var24 == 4) {
											field1609[menuNumEntries] = 662;
										}
										field1610[menuNumEntries] = var22.field494;
										field1607[menuNumEntries] = var5;
										field1608[menuNumEntries] = var6;
										menuNumEntries++;
									} else if (var24 == 2) {
										menuOption[menuNumEntries] = "Take @lre@" + var23.name;
										field1609[menuNumEntries] = 617;
										field1610[menuNumEntries] = var22.field494;
										field1607[menuNumEntries] = var5;
										field1608[menuNumEntries] = var6;
										menuNumEntries++;
									}
								}
								menuOption[menuNumEntries] = "Examine @lre@" + var23.name;
								field1609[menuNumEntries] = 1152;
								field1610[menuNumEntries] = var22.field494;
								field1607[menuNumEntries] = var5;
								field1608[menuNumEntries] = var6;
								menuNumEntries++;
							} else if ((field1614 & 0x1) == 1) {
								menuOption[menuNumEntries] = field1615 + " @lre@" + var23.name;
								field1609[menuNumEntries] = 370;
								field1610[menuNumEntries] = var22.field494;
								field1607[menuNumEntries] = var5;
								field1608[menuNumEntries] = var6;
								menuNumEntries++;
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
				field1348 = "";
				field1349 = "Connecting to server...";
				method461(true);
			}
			stream = new ClientStream(openSocket(portOff + 43594), this);
			long var4 = JString.toUserhash(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			out.data = 0;
			out.p1(14);
			out.p1(var6);
			stream.write(2, out.pos, 0);
			for (int var7 = 0; var7 < 8; var7++) {
				stream.read();
			}
			int var8 = stream.read();
			if (var8 == 0) {
				stream.read(in.pos, 0, 8);
				in.data = 0;
				field1647 = in.g8();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field1647 >> 32), (int) field1647 };
				out.data = 0;
				out.p1(10);
				out.p4(var9[0]);
				out.p4(var9[1]);
				out.p4(var9[2]);
				out.p4(var9[3]);
				out.p4(signlink.uid);
				out.pjstr(arg0);
				out.pjstr(arg1);
				out.rsaenc(field1428, field1466);
				field1522.data = 0;
				if (arg2) {
					field1522.p1(18);
				} else {
					field1522.p1(16);
				}
				field1522.p1(out.data + 36 + 1 + 1 + 2);
				field1522.p1(255);
				field1522.p2(274);
				field1522.p1(lowMem ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					field1522.p4(getJagChecksum[var10]);
				}
				field1522.pdata(out.pos, 0, out.data);
				out.random = new Isaac(var9);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				randomIn = new Isaac(var9);
				stream.write(field1522.data, field1522.pos, 0);
				var8 = stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}
				method456(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field1282 = stream.read();
				mouseTracked = stream.read() == 1;
				prevMouseClickTime = 0L;
				mouseTrackedDelta = 0;
				mouseTracking.length = 0;
				super.focus = true;
				focusIn = true;
				ingame = true;
				out.data = 0;
				in.data = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				logoutTimer = 0;
				field1616 = 0;
				menuNumEntries = 0;
				field1267 = false;
				super.idleTimer = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					field1366[var12] = null;
				}
				field1227 = 0;
				field1612 = 0;
				sceneState = 0;
				field1345 = 0;
				field1662 = (int) (Math.random() * 100.0D) - 50;
				field1250 = (int) (Math.random() * 110.0D) - 55;
				field1304 = (int) (Math.random() * 80.0D) - 40;
				field1633 = (int) (Math.random() * 120.0D) - 60;
				field1586 = (int) (Math.random() * 30.0D) - 20;
				orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				minimapState = 0;
				field1350 = -1;
				minimapFlagX = 0;
				field1442 = 0;
				field1537 = 0;
				npcCount = 0;
				for (int var13 = 0; var13 < field1534; var13++) {
					field1536[var13] = null;
					field1541[var13] = null;
				}
				for (int var14 = 0; var14 < 16384; var14++) {
					field1675[var14] = null;
				}
				localPlayer = field1536[field1535] = new ClientPlayer();
				field1572.clear();
				field1340.clear();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							field1232[var15][var16][var17] = null;
						}
					}
				}
				field1644 = new LinkList();
				field1532 = 0;
				field1531 = 0;
				tutComId = -1;
				chatComId = -1;
				mainModalId = -1;
				sideModalId = -1;
				mainOverlayId = -1;
				resumedPauseButton = false;
				sideTab = 3;
				dialogInputOpen = false;
				field1267 = false;
				field1681 = false;
				tutComMessage = null;
				inMultizone = 0;
				field1589 = -1;
				field1398 = true;
				method514();
				for (int var18 = 0; var18 < 5; var18++) {
					field1505[var18] = 0;
				}
				for (int var19 = 0; var19 < 5; var19++) {
					field1215[var19] = null;
					field1216[var19] = false;
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
				method500();
			} else if (var8 == 3) {
				field1348 = "";
				field1349 = "Invalid username or password.";
			} else if (var8 == 4) {
				field1348 = "Your account has been disabled.";
				field1349 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field1348 = "Your account is already logged in.";
				field1349 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field1348 = "RuneScape has been updated!";
				field1349 = "Please reload this page.";
			} else if (var8 == 7) {
				field1348 = "This world is full.";
				field1349 = "Please use a different world.";
			} else if (var8 == 8) {
				field1348 = "Unable to connect.";
				field1349 = "Login server offline.";
			} else if (var8 == 9) {
				field1348 = "Login limit exceeded.";
				field1349 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field1348 = "Unable to connect.";
				field1349 = "Bad session id.";
			} else if (var8 == 11) {
				field1349 = "Login server rejected session.";
				field1349 = "Please try again.";
			} else if (var8 == 12) {
				field1348 = "You need a members account to login to this world.";
				field1349 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field1348 = "Could not complete login.";
				field1349 = "Please try using a different world.";
			} else if (var8 == 14) {
				field1348 = "The server is being updated.";
				field1349 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				ingame = true;
				out.data = 0;
				in.data = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				menuNumEntries = 0;
				field1267 = false;
				field1543 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field1348 = "Login attempts exceeded.";
				field1349 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field1348 = "You are standing in a members-only area.";
				field1349 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field1348 = "Invalid loginserver requested";
				field1349 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = stream.read(); var20 >= 0; var20--) {
					field1348 = "You have only just left another world";
					field1349 = "Your profile will be transferred in: " + var20 + " seconds";
					method461(true);
					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}
				method456(arg0, arg1, arg2);
			} else if (var8 == -1) {
				field1348 = "No response from server";
				field1349 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				field1348 = "Unexpected server response";
				field1349 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			field1348 = "";
			field1349 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public void method457(int arg1, String arg2, String arg3) {
		if (arg1 == 0 && tutComId != -1) {
			tutComMessage = arg3;
			super.mouseClickButton = 0;
		}
		if (chatComId == -1) {
			redrawChatback = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			field1364[var5] = field1364[var5 - 1];
			field1365[var5] = field1365[var5 - 1];
			field1366[var5] = field1366[var5 - 1];
		}
		field1364[0] = arg1;
		field1365[0] = arg2;
		field1366[0] = arg3;
	}

	@ObfuscatedName("client.b(IIII)I")
	public int method458(int arg0, int arg1, int arg3) {
		int var5 = arg0 >> 7;
		int var6 = arg1 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg3;
		if (arg3 < 3 && (mapl[1][var5][var6] & 0x2) == 2) {
			var7 = arg3 + 1;
		}
		int var8 = arg0 & 0x7F;
		int var9 = arg1 & 0x7F;
		int var10 = groundh[var7][var5][var6] * (128 - var8) + groundh[var7][var5 + 1][var6] * var8 >> 7;
		int var11 = groundh[var7][var5][var6 + 1] * (128 - var8) + groundh[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return var10 * (128 - var9) + var11 * var9 >> 7;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public boolean interactWithLoc(int arg0, int arg2, int arg3, int arg4) {
		int var6 = arg4 >> 14 & 0x7FFF;
		int var7 = world.typeCode2(field1478, arg2, arg0, arg4);
		if (var7 == -1) {
			return false;
		}
		int var8 = var7 & 0x1F;
		int var9 = var7 >> 6 & 0x3;
		field1548++;
		if (field1548 > 1086) {
			field1548 = 0;
			out.p1Enc(149);
			out.p1(0);
			int var10 = out.data;
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(16791);
			}
			out.p1(254);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(16128);
			out.p2(52610);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(55420);
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(35025);
			}
			out.p2(46628);
			out.p1((int) (Math.random() * 256.0D));
			out.psize1(out.data - var10);
		}
		if (var8 == 10 || var8 == 11 || var8 == 22) {
			LocType var11 = LocType.list(var6);
			int var12;
			int var13;
			if (var9 == 0 || var9 == 2) {
				var12 = var11.width;
				var13 = var11.length;
			} else {
				var12 = var11.length;
				var13 = var11.width;
			}
			int var14 = var11.forceapproach;
			if (var9 != 0) {
				var14 = (var14 << var9 & 0xF) + (var14 >> 4 - var9);
			}
			tryMove(localPlayer.field448[0], arg2, var12, var13, var14, localPlayer.field447[0], 0, false, 0, arg0, 2);
		} else {
			tryMove(localPlayer.field448[0], arg2, 0, 0, 0, localPlayer.field447[0], var8 + 1, false, var9, arg0, 2);
		}
		crossX = super.mouseClickX;
		crossY = super.mouseClickY;
		crossMode = 2;
		crossCycle = 0;
		out.p1Enc(arg3);
		out.p2(arg2 + field1471);
		out.p2(arg0 + field1472);
		out.p2(var6);
		return true;
	}

	@ObfuscatedName("client.d(II)V")
	public void method460(int arg0, int arg1) {
		LinkList var3 = field1232[field1478][arg0][arg1];
		if (var3 == null) {
			world.delObj(field1478, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next()) {
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
		for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next()) {
			if (var11.field494 != var5.field494 && var9 == null) {
				var9 = var11;
			}
			if (var11.field494 != var5.field494 && var11.field494 != var9.field494 && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		world.setObj(arg1, var12, field1478, var9, var5, arg0, method458(arg0 * 128 + 64, arg1 * 128 + 64, field1478), var10);
	}

	@ObfuscatedName("client.b(ZZ)V")
	public void method461(boolean arg0) {
		prepareTitle();
		field1457.setPixels();
		field1679.plotSprite(0, 0);
		short var3 = 360;
		short var4 = 200;
		if (field1421 == 0) {
			int var5 = var4 / 2 + 80;
			p11.centreStringTag(var3 / 2, var5, onDemand.message, 7711145, true);
			int var6 = var4 / 2 - 20;
			b12.centreStringTag(var3 / 2, var6, "Welcome to RuneScape", 16776960, true);
			int var17 = var6 + 30;
			int var7 = var3 / 2 - 80;
			int var8 = var4 / 2 + 20;
			field1680.plotSprite(var7 - 73, var8 - 20);
			b12.centreStringTag(var7, var8 + 5, "New User", 16777215, true);
			int var9 = var3 / 2 + 80;
			field1680.plotSprite(var9 - 73, var8 - 20);
			b12.centreStringTag(var9, var8 + 5, "Existing User", 16777215, true);
		}
		if (field1421 == 2) {
			int var10 = var4 / 2 - 40;
			if (field1348.length() > 0) {
				b12.centreStringTag(var3 / 2, var10 - 15, field1348, 16776960, true);
				b12.centreStringTag(var3 / 2, var10, field1349, 16776960, true);
				var10 += 30;
			} else {
				b12.centreStringTag(var3 / 2, var10 - 7, field1349, 16776960, true);
				var10 += 30;
			}
			b12.drawStringTag("Username: " + field1563 + (field1371 == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, var10, var3 / 2 - 90, 16777215);
			var10 += 15;
			b12.drawStringTag("Password: " + JString.getRepeatedCharacter(field1564) + (field1371 == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, var10, var3 / 2 - 88, 16777215);
			var10 += 15;
			if (!arg0) {
				int var11 = var3 / 2 - 80;
				int var12 = var4 / 2 + 50;
				field1680.plotSprite(var11 - 73, var12 - 20);
				b12.centreStringTag(var11, var12 + 5, "Login", 16777215, true);
				int var13 = var3 / 2 + 80;
				field1680.plotSprite(var13 - 73, var12 - 20);
				b12.centreStringTag(var13, var12 + 5, "Cancel", 16777215, true);
			}
		}
		if (field1421 == 3) {
			b12.centreStringTag(var3 / 2, var4 / 2 - 60, "Create a free account", 16776960, true);
			int var14 = var4 / 2 - 35;
			b12.centreStringTag(var3 / 2, var14, "To create a new account you need to", 16777215, true);
			int var18 = var14 + 15;
			b12.centreStringTag(var3 / 2, var18, "go back to the main RuneScape webpage", 16777215, true);
			int var19 = var18 + 15;
			b12.centreStringTag(var3 / 2, var19, "and choose the red 'create account'", 16777215, true);
			int var20 = var19 + 15;
			b12.centreStringTag(var3 / 2, var20, "button at the top right of that page.", 16777215, true);
			int var21 = var20 + 15;
			int var15 = var3 / 2;
			int var16 = var4 / 2 + 50;
			field1680.plotSprite(var15 - 73, var16 - 20);
			b12.centreStringTag(var15, var16 + 5, "Cancel", 16777215, true);
		}
		field1457.draw(202, super.graphics, 171);
		if (!redrawFrame) {
			return;
		}
		redrawFrame = false;
		imageTitle2.draw(128, super.graphics, 0);
		field1456.draw(202, super.graphics, 371);
		field1460.draw(0, super.graphics, 265);
		field1461.draw(562, super.graphics, 265);
		field1462.draw(128, super.graphics, 171);
		field1463.draw(562, super.graphics, 171);
	}

	@ObfuscatedName("client.e(Z)V")
	public void method463() {
		for (ClientProj var2 = (ClientProj) field1572.head(); var2 != null; var2 = (ClientProj) field1572.next()) {
			if (var2.field499 != field1478 || loopCycle > var2.field505) {
				var2.unlink();
			} else if (loopCycle >= var2.field504) {
				if (var2.field508 > 0) {
					ClientNpc var3 = field1675[var2.field508 - 1];
					if (var3 != null && var3.field397 >= 0 && var3.field397 < 13312 && var3.field398 >= 0 && var3.field398 < 13312) {
						var2.method119(loopCycle, method458(var3.field397, var3.field398, var2.field499) - var2.field503, var3.field397, var3.field398);
					}
				}
				if (var2.field508 < 0) {
					int var4 = -var2.field508 - 1;
					ClientPlayer var5;
					if (var4 == field1363) {
						var5 = localPlayer;
					} else {
						var5 = field1536[var4];
					}
					if (var5 != null && var5.field397 >= 0 && var5.field397 < 13312 && var5.field398 >= 0 && var5.field398 < 13312) {
						var2.method119(loopCycle, method458(var5.field397, var5.field398, var2.field499) - var2.field503, var5.field397, var5.field398);
					}
				}
				var2.method120(worldUpdateNum);
				world.addDynamic((int) var2.field512, var2, (int) var2.field510, -1, (int) var2.field511, 60, var2.field518, field1478, false);
			}
		}
		field1413++;
		if (field1413 <= 1174) {
			return;
		}
		field1413 = 0;
		out.p1Enc(12);
		out.p1(0);
		int var6 = out.data;
		if ((int) (Math.random() * 2.0D) == 0) {
			out.p2(11499);
		}
		out.p2(10548);
		if ((int) (Math.random() * 2.0D) == 0) {
			out.p1(139);
		}
		if ((int) (Math.random() * 2.0D) == 0) {
			out.p1(94);
		}
		out.p2(51693);
		out.p1(16);
		out.p2(15036);
		if ((int) (Math.random() * 2.0D) == 0) {
			out.p1(65);
		}
		out.p1((int) (Math.random() * 256.0D));
		out.p2(22990);
		out.psize1(out.data - var6);
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public void method464(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
		scrollbar0.plotSprite(arg4, arg1);
		scrollbar1.plotSprite(arg4, arg1 + arg5 - 16);
		Pix2D.fillRect(arg5 - 32, field1574, 16, arg4, arg1 + 16);
		int var7 = (arg5 - 32) * arg5 / arg2;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg5 - var7 - 32) * arg0 / (arg2 - arg5);
		Pix2D.fillRect(var7, field1423, 16, arg4, arg1 + var8 + 16);
		Pix2D.vline(field1593, var7, arg4, arg1 + var8 + 16);
		Pix2D.vline(field1593, var7, arg4 + 1, arg1 + 16 + var8);
		Pix2D.hline(16, field1593, arg4, arg1 + var8 + 16);
		Pix2D.hline(16, field1593, arg4, arg1 + var8 + 17);
		Pix2D.vline(field1241, var7, arg4 + 15, arg1 + 16 + var8);
		Pix2D.vline(field1241, var7 - 1, arg4 + 14, arg1 + var8 + 17);
		Pix2D.hline(16, field1241, arg4, arg1 + var8 + var7 + 15);
		Pix2D.hline(15, field1241, arg4 + 1, arg1 + var8 + var7 + 14);
		if (arg3 != 123) {
			out.p1(30);
		}
	}

	@ObfuscatedName("client.e(II)V")
	public void method465(int arg0) {
		if (lowMem) {
			return;
		}
		if (Pix3D.texCycle[17] >= arg0) {
			Pix8 var2 = Pix3D.textures[17];
			int var3 = var2.wi * var2.hi - 1;
			int var4 = var2.wi * worldUpdateNum * 2;
			byte[] var5 = var2.data;
			byte[] var6 = field1504;
			for (int var7 = 0; var7 <= var3; var7++) {
				var6[var7] = var5[var7 - var4 & var3];
			}
			var2.data = var6;
			field1504 = var5;
			Pix3D.pushTexture(17);
		}
		if (Pix3D.texCycle[24] < arg0) {
			return;
		}
		Pix8 var8 = Pix3D.textures[24];
		int var9 = var8.wi * var8.hi - 1;
		int var10 = var8.wi * worldUpdateNum * 2;
		byte[] var11 = var8.data;
		byte[] var12 = field1504;
		for (int var13 = 0; var13 <= var9; var13++) {
			var12[var13] = var11[var13 - var10 & var9];
		}
		var8.data = var12;
		field1504 = var11;
		Pix3D.pushTexture(24);
		return;
	}

	@ObfuscatedName("client.o(I)V")
	public void tabLoop() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && field1370[0] != -1) {
			redrawSidebar = true;
			sideTab = 0;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && field1370[1] != -1) {
			redrawSidebar = true;
			sideTab = 1;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && field1370[2] != -1) {
			redrawSidebar = true;
			sideTab = 2;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && field1370[3] != -1) {
			redrawSidebar = true;
			sideTab = 3;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && field1370[4] != -1) {
			redrawSidebar = true;
			sideTab = 4;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && field1370[5] != -1) {
			redrawSidebar = true;
			sideTab = 5;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && field1370[6] != -1) {
			redrawSidebar = true;
			sideTab = 6;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && field1370[7] != -1) {
			redrawSidebar = true;
			sideTab = 7;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && field1370[8] != -1) {
			redrawSidebar = true;
			sideTab = 8;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && field1370[9] != -1) {
			redrawSidebar = true;
			sideTab = 9;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && field1370[10] != -1) {
			redrawSidebar = true;
			sideTab = 10;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && field1370[11] != -1) {
			redrawSidebar = true;
			sideTab = 11;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && field1370[12] != -1) {
			redrawSidebar = true;
			sideTab = 12;
			redrawSideicons = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && field1370[13] != -1) {
			redrawSidebar = true;
			sideTab = 13;
			redrawSideicons = true;
			return;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void loadTitleBackground() {
		byte[] var2 = title.read("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		field1458.setPixels();
		var3.quickPlotSprite(0, 0);
		field1459.setPixels();
		var3.quickPlotSprite(0, -637);
		imageTitle2.setPixels();
		var3.quickPlotSprite(0, -128);
		field1456.setPixels();
		var3.quickPlotSprite(-371, -202);
		field1457.setPixels();
		var3.quickPlotSprite(-171, -202);
		field1460.setPixels();
		var3.quickPlotSprite(-265, 0);
		field1461.setPixels();
		var3.quickPlotSprite(-265, -562);
		field1462.setPixels();
		var3.quickPlotSprite(-171, -128);
		field1463.setPixels();
		var3.quickPlotSprite(-171, -562);
		int[] var4 = new int[var3.wi];
		for (int var5 = 0; var5 < var3.hi; var5++) {
			for (int var6 = 0; var6 < var3.wi; var6++) {
				var4[var6] = var3.data[var3.wi + var3.wi * var5 - var6 - 1];
			}
			for (int var7 = 0; var7 < var3.wi; var7++) {
				var3.data[var7 + var3.wi * var5] = var4[var7];
			}
		}
		field1458.setPixels();
		var3.quickPlotSprite(0, 382);
		field1459.setPixels();
		var3.quickPlotSprite(0, -255);
		imageTitle2.setPixels();
		var3.quickPlotSprite(0, 254);
		field1456.setPixels();
		var3.quickPlotSprite(-371, 180);
		field1457.setPixels();
		var3.quickPlotSprite(-171, 180);
		field1460.setPixels();
		var3.quickPlotSprite(-265, 382);
		field1461.setPixels();
		var3.quickPlotSprite(-265, -180);
		field1462.setPixels();
		var3.quickPlotSprite(-171, 254);
		field1463.setPixels();
		var3.quickPlotSprite(-171, -180);
		Pix32 var8 = new Pix32(title, "logo", 0);
		imageTitle2.setPixels();
		var8.plotSprite(382 - var8.wi / 2 - 128, 18);
		System.gc();
	}

	@ObfuscatedName("client.b(BI)V")
	public void doAction(int arg1) {
		if (arg1 < 0) {
			return;
		}
		if (dialogInputOpen) {
			dialogInputOpen = false;
			redrawChatback = true;
		}
		int var3 = field1607[arg1];
		int var4 = field1608[arg1];
		int var5 = field1609[arg1];
		int var6 = field1610[arg1];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 829) {
			ClientNpc var7 = field1675[var6];
			if (var7 != null) {
				tryMove(localPlayer.field448[0], var7.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var7.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(150);
				out.p2(var6);
				out.p2(field1230);
				out.p2(field1228);
				out.p2(field1229);
			}
		}
		if (var5 == 524) {
			String var8 = menuOption[arg1];
			int var9 = var8.indexOf("@whi@");
			if (var9 != -1) {
				closeModal();
				field1367 = var8.substring(var9 + 5).trim();
				field1544 = false;
				for (int var10 = 0; var10 < IfType.list.length; var10++) {
					if (IfType.list[var10] != null && IfType.list[var10].clientCode == 600) {
						field1497 = mainModalId = IfType.list[var10].field74;
						break;
					}
				}
			}
		}
		if (var5 == 275) {
			ClientPlayer var11 = field1536[var6];
			if (var11 != null) {
				tryMove(localPlayer.field448[0], var11.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var11.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(36);
				out.p2(var6);
				out.p2(field1230);
				out.p2(field1228);
				out.p2(field1229);
			}
		}
		if (var5 == 743) {
			field1385++;
			if (field1385 >= 124) {
				out.p1Enc(201);
				out.p2(37954);
			}
			interactWithLoc(var4, var3, 187, var6);
		}
		if (var5 == 718) {
			if (field1267) {
				world.updateMousePicking(var3 - 4, var4 - 4);
			} else {
				world.updateMousePicking(super.mouseClickX - 4, super.mouseClickY - 4);
			}
		}
		if (var5 == 721) {
			field1648 += var4;
			if (field1648 >= 139) {
				out.p1Enc(219);
				out.p4(0);
			}
			interactWithLoc(var4, var3, 103, var6);
		}
		if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
			String var12 = menuOption[arg1];
			int var13 = var12.indexOf("@whi@");
			if (var13 != -1) {
				long var14 = JString.toUserhash(var12.substring(var13 + 5).trim());
				if (var5 == 605) {
					addFriend(var14);
				}
				if (var5 == 47) {
					addIgnore(var14);
				}
				if (var5 == 513) {
					delFriend(0, var14);
				}
				if (var5 == 884) {
					delIgnore(var14);
				}
			}
		}
		if (var5 == 563) {
			out.p1Enc(135);
			out.p2(var6);
			out.p2(var3);
			out.p2(var4);
			out.p2(field1613);
			selectedCycle = 0;
			field1264 = var4;
			field1265 = var3;
			selectedArea = 2;
			if (IfType.list[var4].field74 == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var4].field74 == chatComId) {
				selectedArea = 3;
			}
		}
		if (var5 == 435) {
			out.p1Enc(9);
			out.p2(var4);
			IfType var16 = IfType.list[var4];
			if (var16.field83 != null && var16.field83[0][0] == 5) {
				int var17 = var16.field83[0][1];
				field1523[var17] = 1 - field1523[var17];
				clientVar(var17);
				redrawSidebar = true;
			}
		}
		if (var5 == 810 && interactWithLoc(var4, var3, 60, var6)) {
			out.p2(field1230);
			out.p2(field1228);
			out.p2(field1229);
		}
		if (var5 == 102) {
			field1227 = 1;
			field1228 = var3;
			field1229 = var4;
			field1230 = var6;
			field1231 = ObjType.list(var6).name;
			field1612 = 0;
			redrawSidebar = true;
			return;
		}
		if (var5 == 1328) {
			ObjType var18 = ObjType.list(var6);
			IfType var19 = IfType.list[var4];
			String var20;
			if (var19 != null && var19.linkObjNumber[var3] >= 100000) {
				var20 = var19.linkObjNumber[var3] + " x " + var18.name;
			} else if (var18.desc == null) {
				var20 = "It's a " + var18.name + ".";
			} else {
				var20 = new String(var18.desc);
			}
			method457(0, "", var20);
		}
		if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
			ClientPlayer var21 = field1536[var6];
			if (var21 != null) {
				tryMove(localPlayer.field448[0], var21.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var21.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				if (var5 == 387) {
					field1468 += var6;
					if (field1468 >= 66) {
						out.p1Enc(235);
						out.p1(154);
					}
					out.p1Enc(98);
				}
				if (var5 == 185) {
					out.p1Enc(174);
				}
				if (var5 == 639) {
					field1316++;
					if (field1316 >= 52) {
						out.p1Enc(80);
						out.p1(131);
					}
					out.p1Enc(109);
				}
				if (var5 == 27) {
					out.p1Enc(196);
				}
				if (var5 == 499) {
					out.p1Enc(166);
				}
				out.p2(var6);
			}
		}
		if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
			ClientNpc var22 = field1675[var6];
			if (var22 != null) {
				tryMove(localPlayer.field448[0], var22.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var22.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				if (var5 == 309) {
					out.p1Enc(223);
				}
				if (var5 == 242) {
					out.p1Enc(236);
				}
				if (var5 == 852) {
					out.p1Enc(147);
				}
				if (var5 == 793) {
					out.p1Enc(189);
				}
				if (var5 == 209) {
					out.p1Enc(233);
				}
				out.p2(var6);
			}
		}
		if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
			if (var5 == 331) {
				out.p1Enc(179);
			}
			if (var5 == 113) {
				out.p1Enc(82);
			}
			if (var5 == 555) {
				out.p1Enc(239);
			}
			if (var5 == 354) {
				out.p1Enc(46);
			}
			if (var5 == 582) {
				if ((var6 & 0x3) == 0) {
					field1573++;
				}
				if (field1573 >= 133) {
					out.p1Enc(250);
					out.p2(6118);
				}
				out.p1Enc(74);
			}
			out.p2(var6);
			out.p2(var3);
			out.p2(var4);
			selectedCycle = 0;
			field1264 = var4;
			field1265 = var3;
			selectedArea = 2;
			if (IfType.list[var4].field74 == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var4].field74 == chatComId) {
				selectedArea = 3;
			}
		}
		if (var5 == 997 && !resumedPauseButton) {
			out.p1Enc(72);
			out.p2(var4);
			resumedPauseButton = true;
		}
		if (var5 == 1714) {
			ClientNpc var23 = field1675[var6];
			if (var23 != null) {
				String var24;
				if (var23.field453.desc == null) {
					var24 = "It's a " + var23.field453.name + ".";
				} else {
					var24 = new String(var23.field453.desc);
				}
				method457(0, "", var24);
			}
		}
		if (var5 == 240) {
			ClientNpc var25 = field1675[var6];
			if (var25 != null) {
				tryMove(localPlayer.field448[0], var25.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var25.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(181);
				out.p2(var6);
				out.p2(field1613);
			}
		}
		if (var5 == 902) {
			String var26 = menuOption[arg1];
			int var27 = var26.indexOf("@whi@");
			if (var27 != -1) {
				long var28 = JString.toUserhash(var26.substring(var27 + 5).trim());
				int var30 = -1;
				for (int var31 = 0; var31 < field1531; var31++) {
					if (field1575[var31] == var28) {
						var30 = var31;
						break;
					}
				}
				if (var30 != -1 && field1489[var30] > 0) {
					redrawChatback = true;
					dialogInputOpen = false;
					field1681 = true;
					field1400 = "";
					field1467 = 3;
					field1283 = field1575[var30];
					field1435 = "Enter message to send to " + field1249[var30];
				}
			}
		}
		if (var5 == 1381) {
			int var32 = var6 >> 14 & 0x7FFF;
			LocType var33 = LocType.list(var32);
			String var34;
			if (var33.desc == null) {
				var34 = "It's a " + var33.name + ".";
			} else {
				var34 = new String(var33.desc);
			}
			method457(0, "", var34);
		}
		if (var5 == 231) {
			IfType var35 = IfType.list[var4];
			boolean var36 = true;
			if (var35.clientCode > 0) {
				var36 = method521(var35);
			}
			if (var36) {
				out.p1Enc(9);
				out.p2(var4);
			}
		}
		if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
			boolean var37 = tryMove(localPlayer.field448[0], var3, 0, 0, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			if (!var37) {
				tryMove(localPlayer.field448[0], var3, 1, 1, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			if (var5 == 662) {
				field1567 += field1472;
				if (field1567 >= 118) {
					out.p1Enc(41);
					out.p4(0);
				}
				out.p1Enc(117);
			}
			if (var5 == 139) {
				if ((var3 & 0x3) == 0) {
					field1611++;
				}
				if (field1611 >= 123) {
					out.p1Enc(25);
					out.p4(0);
				}
				out.p1Enc(247);
			}
			if (var5 == 224) {
				field1296 += var4;
				if (field1296 >= 75) {
					out.p1Enc(0);
					out.p1(19);
				}
				out.p1Enc(62);
			}
			if (var5 == 617) {
				out.p1Enc(108);
			}
			if (var5 == 778) {
				out.p1Enc(169);
			}
			out.p2(var3 + field1471);
			out.p2(var4 + field1472);
			out.p2(var6);
		}
		if (var5 == 1071) {
			interactWithLoc(var4, var3, 127, var6);
		}
		if (var5 == 507 || var5 == 957) {
			String var39 = menuOption[arg1];
			int var40 = var39.indexOf("@whi@");
			if (var40 != -1) {
				String var41 = var39.substring(var40 + 5).trim();
				String var42 = JString.toScreenName(JString.toRawUsername(JString.toUserhash(var41)));
				boolean var43 = false;
				for (int var44 = 0; var44 < field1537; var44++) {
					ClientPlayer var45 = field1536[field1538[var44]];
					if (var45 != null && var45.field457 != null && var45.field457.equalsIgnoreCase(var42)) {
						tryMove(localPlayer.field448[0], var45.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var45.field448[0], 2);
						if (var5 == 507) {
							field1468 += var6;
							if (field1468 >= 66) {
								out.p1Enc(235);
								out.p1(154);
							}
							out.p1Enc(98);
						}
						if (var5 == 957) {
							field1316++;
							if (field1316 >= 52) {
								out.p1Enc(80);
								out.p1(131);
							}
							out.p1Enc(109);
						}
						out.p2(field1538[var44]);
						var43 = true;
						break;
					}
				}
				if (!var43) {
					method457(0, "", "Unable to find " + var42);
				}
			}
		}
		if (var5 == 131) {
			ClientPlayer var46 = field1536[var6];
			if (var46 != null) {
				tryMove(localPlayer.field448[0], var46.field447[0], 1, 1, 0, localPlayer.field447[0], 0, false, 0, var46.field448[0], 2);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(240);
				out.p2(var6);
				out.p2(field1613);
			}
		}
		if (var5 == 398) {
			out.p1Enc(136);
			out.p2(var6);
			out.p2(var3);
			out.p2(var4);
			out.p2(field1230);
			out.p2(field1228);
			out.p2(field1229);
			selectedCycle = 0;
			field1264 = var4;
			field1265 = var3;
			selectedArea = 2;
			if (IfType.list[var4].field74 == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var4].field74 == chatComId) {
				selectedArea = 3;
			}
		}
		if (var5 == 737) {
			closeModal();
		}
		if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
			if (var5 == 681) {
				field1444++;
				if (field1444 >= 116) {
					out.p1Enc(24);
					out.p3(13018169);
				}
				out.p1Enc(216);
			}
			if (var5 == 100) {
				out.p1Enc(42);
			}
			if (var5 == 694) {
				out.p1Enc(185);
			}
			if (var5 == 962) {
				out.p1Enc(2);
			}
			if (var5 == 795) {
				out.p1Enc(123);
			}
			out.p2(var6);
			out.p2(var3);
			out.p2(var4);
			selectedCycle = 0;
			field1264 = var4;
			field1265 = var3;
			selectedArea = 2;
			if (IfType.list[var4].field74 == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var4].field74 == chatComId) {
				selectedArea = 3;
			}
		}
		if (var5 == 357) {
			interactWithLoc(var4, var3, 157, var6);
		}
		if (var5 == 1152) {
			ObjType var47 = ObjType.list(var6);
			String var48;
			if (var47.desc == null) {
				var48 = "It's a " + var47.name + ".";
			} else {
				var48 = new String(var47.desc);
			}
			method457(0, "", var48);
		}
		if (var5 == 370) {
			boolean var49 = tryMove(localPlayer.field448[0], var3, 0, 0, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			if (!var49) {
				tryMove(localPlayer.field448[0], var3, 1, 1, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			out.p1Enc(91);
			out.p2(var3 + field1471);
			out.p2(var4 + field1472);
			out.p2(var6);
			out.p2(field1613);
		}
		if (var5 == 899 && interactWithLoc(var4, var3, 213, var6)) {
			out.p2(field1613);
		}
		if (var5 == 625) {
			interactWithLoc(var4, var3, 215, var6);
		}
		if (var5 == 111) {
			boolean var51 = tryMove(localPlayer.field448[0], var3, 0, 0, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			if (!var51) {
				tryMove(localPlayer.field448[0], var3, 1, 1, 0, localPlayer.field447[0], 0, false, 0, var4, 2);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			out.p1Enc(39);
			out.p2(var3 + field1471);
			out.p2(var4 + field1472);
			out.p2(var6);
			out.p2(field1230);
			out.p2(field1228);
			out.p2(field1229);
		}
		if (var5 != 274) {
			if (var5 == 225) {
				out.p1Enc(9);
				out.p2(var4);
				IfType var56 = IfType.list[var4];
				if (var56.field83 != null && var56.field83[0][0] == 5) {
					int var57 = var56.field83[0][1];
					if (field1523[var57] != var56.field85[0]) {
						field1523[var57] = var56.field85[0];
						clientVar(var57);
						redrawSidebar = true;
					}
				}
			}
			field1227 = 0;
			field1612 = 0;
			redrawSidebar = true;
			return;
		}
		IfType var53 = IfType.list[var4];
		field1612 = 1;
		field1613 = var4;
		field1614 = var53.field128;
		field1227 = 0;
		redrawSidebar = true;
		String var54 = var53.field126;
		if (var54.indexOf(" ") != -1) {
			var54 = var54.substring(0, var54.indexOf(" "));
		}
		String var55 = var53.field126;
		if (var55.indexOf(" ") != -1) {
			var55 = var55.substring(var55.indexOf(" ") + 1);
		}
		field1615 = var54 + " " + var53.field127 + " " + var55;
		if (field1614 == 16) {
			redrawSidebar = true;
			sideTab = 3;
			redrawSideicons = true;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)Lxb;")
	public JagFile getJagFile(String arg0, int arg1, String arg2, int arg3, int arg5) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (fileStreams[0] != null) {
				var7 = fileStreams[0].readFromFile(arg1);
			}
		} catch (Exception var29) {
		}
		if (var7 != null) {
			field1395.reset();
			field1395.update(var7);
			int var9 = (int) field1395.getValue();
			if (var9 != arg3) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new JagFile(var7);
		}
		int var11 = 0;
		while (var7 == null) {
			String var12 = "Unknown error";
			messageBox("Requesting " + arg0, arg5);
			try {
				int var13 = 0;
				DataInputStream var14 = method492(arg2 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				Packet var16 = new Packet(var15);
				var16.data = 3;
				int var17 = var16.g3() + 6;
				int var18 = 6;
				var7 = new byte[var17];
				for (int var19 = 0; var19 < 6; var19++) {
					var7[var19] = var15[var19];
				}
				while (var18 < var17) {
					int var20 = var17 - var18;
					if (var20 > 1000) {
						var20 = 1000;
					}
					int var21 = var14.read(var7, var18, var20);
					if (var21 < 0) {
						(new StringBuffer("Length error: ")).append(var18).append("/").append(var17).toString();
						throw new IOException("EOF");
					}
					var18 += var21;
					int var22 = var18 * 100 / var17;
					if (var22 != var13) {
						messageBox("Loading " + arg0 + " - " + var22 + "%", arg5);
					}
					var13 = var22;
				}
				var14.close();
				try {
					if (fileStreams[0] != null) {
						fileStreams[0].writeToFile(var7.length, arg1, var7);
					}
				} catch (Exception var28) {
					fileStreams[0] = null;
				}
				if (var7 != null) {
					field1395.reset();
					field1395.update(var7);
					int var23 = (int) field1395.getValue();
					if (var23 != arg3) {
						var7 = null;
						var11++;
						var12 = "Checksum error: " + var23;
					}
				}
			} catch (IOException var30) {
				if (var12.equals("Unknown error")) {
					var12 = "Connection error";
				}
				var7 = null;
			} catch (NullPointerException var31) {
				var12 = "Null error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var32) {
				var12 = "Bounds error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var33) {
				var12 = "Unexpected error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var25 = var8; var25 > 0; var25--) {
					if (var11 >= 3) {
						messageBox("Game updated - please reload page", arg5);
						var25 = 10;
					} else {
						messageBox(var12 + " - Retrying in " + var25, arg5);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var27) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
				field1469 = !field1469;
			}
		}
		return new JagFile(var7);
	}

	@ObfuscatedName("client.a(IJ)V")
	public void delFriend(int arg0, long arg1) {
		if (arg0 != 0 || arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < field1531; var4++) {
			if (field1575[var4] == arg1) {
				field1531--;
				redrawSidebar = true;
				for (int var5 = var4; var5 < field1531; var5++) {
					field1249[var5] = field1249[var5 + 1];
					field1489[var5] = field1489[var5 + 1];
					field1575[var5] = field1575[var5 + 1];
				}
				out.p1Enc(106);
				out.p8(arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void method471() {
		field1281.setPixels();
		Pix3D.scanline = chatbackScanline;
		chatback.plotSprite(0, 0);
		if (field1681) {
			b12.centreString(239, 40, 0, field1435);
			b12.centreString(239, 60, 128, field1400 + "*");
		} else if (dialogInputOpen) {
			b12.centreString(239, 40, 0, "Enter amount:");
			b12.centreString(239, 60, 128, field1598 + "*");
		} else if (tutComMessage != null) {
			b12.centreString(239, 40, 0, tutComMessage);
			b12.centreString(239, 60, 128, "Click to continue");
		} else if (chatComId != -1) {
			drawInterface(0, IfType.list[chatComId], 0, 0);
		} else if (tutComId == -1) {
			PixFont var2 = p12;
			int var3 = 0;
			Pix2D.setClipping(5, 77, 463, 0, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (field1366[var4] != null) {
					int var5 = field1364[var4];
					int var6 = field1498 + 70 - var3 * 14;
					String var7 = field1365[var4];
					byte var8 = 0;
					if (var7 != null && var7.startsWith("@cr1@")) {
						var7 = var7.substring(5);
						var8 = 1;
					}
					if (var7 != null && var7.startsWith("@cr2@")) {
						var7 = var7.substring(5);
						var8 = 2;
					}
					if (var5 == 0) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(4, field1366[var4], 0, var6);
						}
						var3++;
					}
					if ((var5 == 1 || var5 == 2) && (var5 == 1 || field1383 == 0 || field1383 == 1 && method430(var7))) {
						if (var6 > 0 && var6 < 110) {
							int var9 = 4;
							if (var8 == 1) {
								modIcons[0].plotSprite(var9, var6 - 12);
								var9 += 14;
							}
							if (var8 == 2) {
								modIcons[1].plotSprite(var9, var6 - 12);
								var9 += 14;
							}
							var2.drawString(var9, var7 + ":", 0, var6);
							int var10 = var9 + var2.stringWid(var7) + 8;
							var2.drawString(var10, field1366[var4], 255, var6);
						}
						var3++;
					}
					if ((var5 == 3 || var5 == 7) && field1490 == 0 && (var5 == 7 || field1388 == 0 || field1388 == 1 && method430(var7))) {
						if (var6 > 0 && var6 < 110) {
							byte var11 = 4;
							var2.drawString(var11, "From", 0, var6);
							int var12 = var11 + var2.stringWid("From ");
							if (var8 == 1) {
								modIcons[0].plotSprite(var12, var6 - 12);
								var12 += 14;
							}
							if (var8 == 2) {
								modIcons[1].plotSprite(var12, var6 - 12);
								var12 += 14;
							}
							var2.drawString(var12, var7 + ":", 0, var6);
							int var13 = var12 + var2.stringWid(var7) + 8;
							var2.drawString(var13, field1366[var4], 8388608, var6);
						}
						var3++;
					}
					if (var5 == 4 && (field1221 == 0 || field1221 == 1 && method430(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(4, var7 + " " + field1366[var4], 8388736, var6);
						}
						var3++;
					}
					if (var5 == 5 && field1490 == 0 && field1388 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(4, field1366[var4], 8388608, var6);
						}
						var3++;
					}
					if (var5 == 6 && field1490 == 0 && field1388 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(4, "To " + var7 + ":", 0, var6);
							var2.drawString(var2.stringWid("To " + var7) + 12, field1366[var4], 8388608, var6);
						}
						var3++;
					}
					if (var5 == 8 && (field1221 == 0 || field1221 == 1 && method430(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(4, var7 + " " + field1366[var4], 8270336, var6);
						}
						var3++;
					}
				}
			}
			Pix2D.resetClipping();
			field1347 = var3 * 14 + 7;
			if (field1347 < 78) {
				field1347 = 78;
			}
			method464(field1347 - field1498 - 77, 0, field1347, (byte) 123, 463, 77);
			String var14;
			if (localPlayer == null || localPlayer.field457 == null) {
				var14 = JString.toScreenName(field1563);
			} else {
				var14 = localPlayer.field457;
			}
			var2.drawString(4, var14 + ":", 0, 90);
			var2.drawString(var2.stringWid(var14 + ": ") + 6, field1425 + "*", 255, 90);
			Pix2D.hline(479, 0, 0, 77);
		} else {
			drawInterface(0, IfType.list[tutComId], 0, 0);
		}
		if (field1267 && menuArea == 2) {
			drawMinimenu();
		}
		field1281.draw(17, super.graphics, 357);
		field1280.setPixels();
		Pix3D.scanline = viewportScanline;
	}

	@ObfuscatedName("client.a()V")
	@Override
	public void maininit() {
		messageBox("Starting up", 20);
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (alreadyStarted) {
			errorStarted = true;
			return;
		}
		alreadyStarted = true;
		boolean var1 = false;
		String var2 = getHost();
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
			errorHost = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				fileStreams[var3] = new FileStream(signlink.cache_dat, 29615, signlink.cache_idx[var3], var3 + 1, 500000);
			}
		}
		try {
			method555();
			title = getJagFile("title screen", 1, "title", getJagChecksum[1], 25);
			p11 = new PixFont(title, false, "p11_full", (byte) 0);
			p12 = new PixFont(title, false, "p12_full", (byte) 0);
			b12 = new PixFont(title, false, "b12_full", (byte) 0);
			q8 = new PixFont(title, true, "q8_full", (byte) 0);
			loadTitleBackground();
			loadTitleImages();
			JagFile var4 = getJagFile("config", 2, "config", getJagChecksum[2], 30);
			JagFile var5 = getJagFile("interface", 3, "interface", getJagChecksum[3], 35);
			JagFile var6 = getJagFile("2d graphics", 4, "media", getJagChecksum[4], 40);
			JagFile var7 = getJagFile("textures", 6, "textures", getJagChecksum[6], 45);
			JagFile var8 = getJagFile("chat system", 7, "wordenc", getJagChecksum[7], 50);
			JagFile var9 = getJagFile("sound effects", 8, "sounds", getJagChecksum[8], 55);
			mapl = new byte[4][104][104];
			groundh = new int[4][105][105];
			world = new World(4, 104, 104, groundh);
			for (int var10 = 0; var10 < 4; var10++) {
				collision[var10] = new CollisionMap(104, 104);
			}
			minimap = new Pix32(512, 512);
			JagFile var11 = getJagFile("update list", 5, "versionlist", getJagChecksum[5], 60);
			messageBox("Connecting to update server", 60);
			onDemand = new OnDemand();
			onDemand.init(var11, this);
			AnimFrame.init(onDemand.getAnimFrameCount());
			Model.init(onDemand.getFileCount(0), onDemand);
			if (!lowMem) {
				midiSong = 0;
				try {
					midiSong = Integer.parseInt(getParameter("music"));
				} catch (Exception var70) {
				}
				midiFading = true;
				onDemand.request(2, midiSong);
				while (onDemand.remaining() > 0) {
					onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var69) {
					}
					if (onDemand.failCount > 3) {
						showLoadError("ondemand");
						return;
					}
				}
			}
			messageBox("Requesting animations", 65);
			int var12 = onDemand.getFileCount(1);
			for (int var13 = 0; var13 < var12; var13++) {
				onDemand.request(1, var13);
			}
			while (onDemand.remaining() > 0) {
				int var14 = var12 - onDemand.remaining();
				if (var14 > 0) {
					messageBox("Loading animations - " + var14 * 100 / var12 + "%", 65);
				}
				onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var68) {
				}
				if (onDemand.failCount > 3) {
					showLoadError("ondemand");
					return;
				}
			}
			messageBox("Requesting models", 70);
			int var15 = onDemand.getFileCount(0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = onDemand.getModelUse(var16);
				if ((var17 & 0x1) != 0) {
					onDemand.request(0, var16);
				}
			}
			int var18 = onDemand.remaining();
			while (onDemand.remaining() > 0) {
				int var19 = var18 - onDemand.remaining();
				if (var19 > 0) {
					messageBox("Loading models - " + var19 * 100 / var18 + "%", 70);
				}
				onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var67) {
				}
			}
			if (fileStreams[0] != null) {
				messageBox("Requesting maps", 75);
				onDemand.request(3, onDemand.getMapFile(0, 47, 48));
				onDemand.request(3, onDemand.getMapFile(1, 47, 48));
				onDemand.request(3, onDemand.getMapFile(0, 48, 48));
				onDemand.request(3, onDemand.getMapFile(1, 48, 48));
				onDemand.request(3, onDemand.getMapFile(0, 49, 48));
				onDemand.request(3, onDemand.getMapFile(1, 49, 48));
				onDemand.request(3, onDemand.getMapFile(0, 47, 47));
				onDemand.request(3, onDemand.getMapFile(1, 47, 47));
				onDemand.request(3, onDemand.getMapFile(0, 48, 47));
				onDemand.request(3, onDemand.getMapFile(1, 48, 47));
				onDemand.request(3, onDemand.getMapFile(0, 48, 148));
				onDemand.request(3, onDemand.getMapFile(1, 48, 148));
				int var20 = onDemand.remaining();
				while (onDemand.remaining() > 0) {
					int var21 = var20 - onDemand.remaining();
					if (var21 > 0) {
						messageBox("Loading maps - " + var21 * 100 / var20 + "%", 75);
					}
					onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var66) {
					}
				}
			}
			int var22 = onDemand.getFileCount(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = onDemand.getModelUse(var23);
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
					onDemand.prefetchPriority(var23, 0, var25);
				}
			}
			onDemand.prefetchMaps(memServer);
			if (!lowMem) {
				int var26 = onDemand.getFileCount(2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (onDemand.isMidiJingle(var27)) {
						onDemand.prefetchPriority(var27, 2, (byte) 1);
					}
				}
			}
			messageBox("Unpacking media", 80);
			invback = new Pix8(var6, "invback", 0);
			chatback = new Pix8(var6, "chatback", 0);
			mapback = new Pix8(var6, "mapback", 0);
			backbase1 = new Pix8(var6, "backbase1", 0);
			backbase2 = new Pix8(var6, "backbase2", 0);
			backhmid1 = new Pix8(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				sideicons[var28] = new Pix8(var6, "sideicons", var28);
			}
			compass = new Pix32(var6, "compass", 0);
			mapedge = new Pix32(var6, "mapedge", 0);
			mapedge.trim();
			try {
				for (int var29 = 0; var29 < 100; var29++) {
					mapscene[var29] = new Pix8(var6, "mapscene", var29);
				}
			} catch (Exception var74) {
			}
			try {
				for (int var30 = 0; var30 < 100; var30++) {
					mapfunction[var30] = new Pix32(var6, "mapfunction", var30);
				}
			} catch (Exception var73) {
			}
			try {
				for (int var31 = 0; var31 < 20; var31++) {
					hitmarks[var31] = new Pix32(var6, "hitmarks", var31);
				}
			} catch (Exception var72) {
			}
			try {
				for (int var32 = 0; var32 < 20; var32++) {
					headicons[var32] = new Pix32(var6, "headicons", var32);
				}
			} catch (Exception var71) {
			}
			mapmarker0 = new Pix32(var6, "mapmarker", 0);
			mapmarker1 = new Pix32(var6, "mapmarker", 1);
			for (int var33 = 0; var33 < 8; var33++) {
				cross[var33] = new Pix32(var6, "cross", var33);
			}
			mapdots0 = new Pix32(var6, "mapdots", 0);
			mapdots1 = new Pix32(var6, "mapdots", 1);
			mapdots2 = new Pix32(var6, "mapdots", 2);
			mapdots3 = new Pix32(var6, "mapdots", 3);
			scrollbar0 = new Pix8(var6, "scrollbar", 0);
			scrollbar1 = new Pix8(var6, "scrollbar", 1);
			redstone1 = new Pix8(var6, "redstone1", 0);
			redstone2 = new Pix8(var6, "redstone2", 0);
			redstone3 = new Pix8(var6, "redstone3", 0);
			redstone1h = new Pix8(var6, "redstone1", 0);
			redstone1h.hflip();
			redstone2h = new Pix8(var6, "redstone2", 0);
			redstone2h.hflip();
			redstone1v = new Pix8(var6, "redstone1", 0);
			redstone1v.vflip();
			redstone2v = new Pix8(var6, "redstone2", 0);
			redstone2v.vflip();
			redstone3v = new Pix8(var6, "redstone3", 0);
			redstone3v.vflip();
			redstone1hv = new Pix8(var6, "redstone1", 0);
			redstone1hv.hflip();
			redstone1hv.vflip();
			redstone2hv = new Pix8(var6, "redstone2", 0);
			redstone2hv.hflip();
			redstone2hv.vflip();
			for (int var34 = 0; var34 < 2; var34++) {
				modIcons[var34] = new Pix8(var6, "mod_icons", var34);
			}
			Pix32 var35 = new Pix32(var6, "backleft1", 0);
			areaBackleft1 = new PixMap(var35.hi, var35.wi, getBaseComponent());
			var35.quickPlotSprite(0, 0);
			Pix32 var36 = new Pix32(var6, "backleft2", 0);
			areaBackleft2 = new PixMap(var36.hi, var36.wi, getBaseComponent());
			var36.quickPlotSprite(0, 0);
			Pix32 var37 = new Pix32(var6, "backright1", 0);
			areaBackright1 = new PixMap(var37.hi, var37.wi, getBaseComponent());
			var37.quickPlotSprite(0, 0);
			Pix32 var38 = new Pix32(var6, "backright2", 0);
			areaBackright2 = new PixMap(var38.hi, var38.wi, getBaseComponent());
			var38.quickPlotSprite(0, 0);
			Pix32 var39 = new Pix32(var6, "backtop1", 0);
			areaBacktop1 = new PixMap(var39.hi, var39.wi, getBaseComponent());
			var39.quickPlotSprite(0, 0);
			Pix32 var40 = new Pix32(var6, "backvmid1", 0);
			areaBackvmid1 = new PixMap(var40.hi, var40.wi, getBaseComponent());
			var40.quickPlotSprite(0, 0);
			Pix32 var41 = new Pix32(var6, "backvmid2", 0);
			areaBackvmid2 = new PixMap(var41.hi, var41.wi, getBaseComponent());
			var41.quickPlotSprite(0, 0);
			Pix32 var42 = new Pix32(var6, "backvmid3", 0);
			areaBackvmid3 = new PixMap(var42.hi, var42.wi, getBaseComponent());
			var42.quickPlotSprite(0, 0);
			Pix32 var43 = new Pix32(var6, "backhmid2", 0);
			areaBackhmid2 = new PixMap(var43.hi, var43.wi, getBaseComponent());
			var43.quickPlotSprite(0, 0);
			int var44 = (int) (Math.random() * 21.0D) - 10;
			int var45 = (int) (Math.random() * 21.0D) - 10;
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 41.0D) - 20;
			for (int var48 = 0; var48 < 100; var48++) {
				if (mapfunction[var48] != null) {
					mapfunction[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
				}
				if (mapscene[var48] != null) {
					mapscene[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
				}
			}
			messageBox("Unpacking textures", 83);
			Pix3D.unpackTextures(var7);
			Pix3D.initColourTable(0.8D);
			Pix3D.initPool(20);
			messageBox("Unpacking config", 86);
			SeqType.init(var4);
			LocType.init(var4);
			FloType.init(var4);
			ObjType.init(var4);
			NpcType.init(var4);
			IdkType.init(var4);
			SpotType.init(var4);
			VarpType.init(var4);
			VarbitType.init(var4);
			ObjType.memServer = memServer;
			if (!lowMem) {
				messageBox("Unpacking sounds", 90);
				byte[] var49 = var9.read("sounds.dat", null);
				Packet var50 = new Packet(var49);
				JagFX.init(var50);
			}
			messageBox("Unpacking interfaces", 95);
			PixFont[] var51 = new PixFont[] {p11, p12, b12, q8};
			IfType.init(var5, var6, var51);
			messageBox("Preparing game engine", 100);
			for (int var52 = 0; var52 < 33; var52++) {
				int var53 = 999;
				int var54 = 0;
				for (int var55 = 0; var55 < 34; var55++) {
					if (mapback.data[var55 + var52 * mapback.wi] == 0) {
						if (var53 == 999) {
							var53 = var55;
						}
					} else if (var53 != 999) {
						var54 = var55;
						break;
					}
				}
				compassMaskLineOffsets[var52] = var53;
				compassMaskLineLengths[var52] = var54 - var53;
			}
			for (int var56 = 5; var56 < 156; var56++) {
				int var57 = 999;
				int var58 = 0;
				for (int var59 = 25; var59 < 172; var59++) {
					if (mapback.data[var59 + var56 * mapback.wi] == 0 && (var59 > 34 || var56 > 34)) {
						if (var57 == 999) {
							var57 = var59;
						}
					} else if (var57 != 999) {
						var58 = var59;
						break;
					}
				}
				minimapMaskLineOffsets[var56 - 5] = var57 - 25;
				minimapMaskLineLengths[var56 - 5] = var58 - var57;
			}
			Pix3D.setClipping(479, 96);
			chatbackScanline = Pix3D.scanline;
			Pix3D.setClipping(190, 261);
			sidebarScanline = Pix3D.scanline;
			Pix3D.setClipping(512, 334);
			viewportScanline = Pix3D.scanline;
			int[] var60 = new int[9];
			for (int var61 = 0; var61 < 9; var61++) {
				int var62 = var61 * 32 + 128 + 15;
				int var63 = var62 * 3 + 600;
				int var64 = Pix3D.sinTable[var62];
				var60[var61] = var63 * var64 >> 16;
			}
			World.resetVisCalc(334, 800, 512, 500, var60);
			WordFilter.unpack(var8);
			mouseTracking = new MouseTracking(this);
			startThread(mouseTracking, 10);
		} catch (Exception var75) {
			signlink.reporterror("loaderror " + lastProgressMessage + " " + lastProgressPercent);
			errorLoading = true;
		}
	}

	@ObfuscatedName("client.a(IILd;IIIIZI)V")
	public void method472(int arg1, IfType arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		if (field1433) {
			field1502 = 32;
		} else {
			field1502 = 0;
		}
		field1433 = false;
		if (arg6 >= arg5 && arg6 < arg5 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
			arg2.field88 -= scrollCycle * 4;
			if (arg7) {
				redrawSidebar = true;
				return;
			}
		} else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg3 >= arg4 + arg1 - 16 && arg3 < arg4 + arg1) {
			arg2.field88 += scrollCycle * 4;
			if (arg7) {
				redrawSidebar = true;
				return;
			}
		} else if (arg6 >= arg5 - field1502 && arg6 < arg5 + field1502 + 16 && arg3 >= arg4 + 16 && arg3 < arg4 + arg1 - 16 && scrollCycle > 0) {
			int var10 = (arg1 - 32) * arg1 / arg8;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg3 - arg4 - var10 / 2 - 16;
			int var12 = arg1 - var10 - 32;
			arg2.field88 = (arg8 - arg1) * var11 / var12;
			if (arg7) {
				redrawSidebar = true;
			}
			field1433 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = field1609[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 605;
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public void getNpcPosOldVis(int arg0, Packet arg2) {
		arg2.gBitStart();
		int var4 = arg2.gBit(8);
		if (var4 < npcCount) {
			for (int var5 = var4; var5 < npcCount; var5++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var5];
			}
		}
		if (var4 > npcCount) {
			signlink.reporterror(field1563 + " Too many npcs");
			throw new RuntimeException("eek");
		}
		npcCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = npcIds[var6];
			ClientNpc var8 = field1675[var7];
			int var9 = arg2.gBit(1);
			if (var9 == 0) {
				npcIds[npcCount++] = var7;
				var8.field442 = loopCycle;
			} else {
				int var10 = arg2.gBit(2);
				if (var10 == 0) {
					npcIds[npcCount++] = var7;
					var8.field442 = loopCycle;
					field1540[field1539++] = var7;
				} else if (var10 == 1) {
					npcIds[npcCount++] = var7;
					var8.field442 = loopCycle;
					int var11 = arg2.gBit(3);
					var8.method111(true, var11, false);
					int var12 = arg2.gBit(1);
					if (var12 == 1) {
						field1540[field1539++] = var7;
					}
				} else if (var10 == 2) {
					npcIds[npcCount++] = var7;
					var8.field442 = loopCycle;
					int var13 = arg2.gBit(3);
					var8.method111(true, var13, true);
					int var14 = arg2.gBit(3);
					var8.method111(true, var14, true);
					int var15 = arg2.gBit(1);
					if (var15 == 1) {
						field1540[field1539++] = var7;
					}
				} else if (var10 == 3) {
					entityRemovalIds[entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILlb;)V")
	public void zonePacket(int arg0, Packet arg1) {
		if (arg0 == 138 || arg0 == 173) {
			int var3 = arg1.g1();
			int var4 = field1334 + (var3 >> 4 & 0x7);
			int var5 = field1335 + (var3 & 0x7);
			int var6 = arg1.g1();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1389[var7];
			int var10;
			if (arg0 == 173) {
				var10 = -1;
			} else {
				var10 = arg1.g2();
			}
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method490(var5, -1, var10, field1478, var8, var4, var9, var7, 0);
			}
		} else if (arg0 == 48) {
			int var11 = arg1.g1();
			int var12 = field1334 + (var11 >> 4 & 0x7);
			int var13 = field1335 + (var11 & 0x7);
			int var14 = arg1.g1();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1389[var15];
			int var18 = arg1.g2();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = groundh[field1478][var12][var13];
				int var20 = groundh[field1478][var12 + 1][var13];
				int var21 = groundh[field1478][var12 + 1][var13 + 1];
				int var22 = groundh[field1478][var12][var13 + 1];
				if (var17 == 0) {
					Wall var23 = world.wallType(var13, field1478, var12);
					if (var23 != null) {
						int var24 = var23.typecode >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.model1 = new ClientLocAnim(2, var16 + 4, var18, var24, var21, false, var20, var22, var19);
							var23.model2 = new ClientLocAnim(2, var16 + 1 & 0x3, var18, var24, var21, false, var20, var22, var19);
						} else {
							var23.model1 = new ClientLocAnim(var15, var16, var18, var24, var21, false, var20, var22, var19);
						}
					}
				}
				if (var17 == 1) {
					Decor var25 = world.decorType(var12, field1478, var13);
					if (var25 != null) {
						var25.model = new ClientLocAnim(4, 0, var18, var25.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}
				if (var17 == 2) {
					Sprite var26 = world.sceneType(var12, field1478, var13);
					if (var15 == 11) {
						var15 = 10;
					}
					if (var26 != null) {
						var26.model = new ClientLocAnim(var15, var16, var18, var26.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}
				if (var17 == 3) {
					GroundDecor var27 = world.gdType(var12, field1478, var13);
					if (var27 != null) {
						var27.model = new ClientLocAnim(22, var16, var18, var27.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}
			}
		} else if (arg0 == 81) {
			int var28 = arg1.g1();
			int var29 = field1334 + (var28 >> 4 & 0x7);
			int var30 = field1335 + (var28 & 0x7);
			int var31 = arg1.g2();
			int var32 = arg1.g2();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				ClientObj var33 = new ClientObj();
				var33.field494 = var31;
				var33.field495 = var32;
				if (field1232[field1478][var29][var30] == null) {
					field1232[field1478][var29][var30] = new LinkList();
				}
				field1232[field1478][var29][var30].push(var33);
				method460(var29, var30);
			}
		} else if (arg0 == 52) {
			int var34 = arg1.g1();
			int var35 = field1334 + (var34 >> 4 & 0x7);
			int var36 = field1335 + (var34 & 0x7);
			int var37 = arg1.g2();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				LinkList var38 = field1232[field1478][var35][var36];
				if (var38 != null) {
					for (ClientObj var39 = (ClientObj) var38.head(); var39 != null; var39 = (ClientObj) var38.next()) {
						if (var39.field494 == (var37 & 0x7FFF)) {
							var39.unlink();
							break;
						}
					}
					if (var38.head() == null) {
						field1232[field1478][var35][var36] = null;
					}
					method460(var35, var36);
				}
			}
		} else if (arg0 == 107) {
			int var40 = arg1.g1();
			int var41 = field1334 + (var40 >> 4 & 0x7);
			int var42 = field1335 + (var40 & 0x7);
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
				ClientProj var57 = new ClientProj(var53, var52, var48, var50 + loopCycle, var51, var49 + loopCycle, field1478, var46, method458(var53, var54, field1478) - var47, var45, var54);
				var57.method119(var49 + loopCycle, method458(var55, var56, field1478) - var48, var55, var56);
				field1572.push(var57);
			}
		} else if (arg0 == 85) {
			int var58 = arg1.g1();
			int var59 = field1334 + (var58 >> 4 & 0x7);
			int var60 = field1335 + (var58 & 0x7);
			int var61 = arg1.g2();
			int var62 = arg1.g1();
			int var63 = arg1.g2();
			if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
				int var64 = var59 * 128 + 64;
				int var65 = var60 * 128 + 64;
				MapSpotAnim var66 = new MapSpotAnim(var63, var65, var64, field1478, 0, method458(var64, var65, field1478) - var62, var61, loopCycle);
				field1340.push(var66);
			}
		} else if (arg0 == 219) {
			int var67 = arg1.g1();
			int var68 = field1334 + (var67 >> 4 & 0x7);
			int var69 = field1335 + (var67 & 0x7);
			int var70 = arg1.g2();
			int var71 = arg1.g2();
			int var72 = arg1.g2();
			if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var72 != field1363) {
				ClientObj var73 = new ClientObj();
				var73.field494 = var70;
				var73.field495 = var71;
				if (field1232[field1478][var68][var69] == null) {
					field1232[field1478][var68][var69] = new LinkList();
				}
				field1232[field1478][var68][var69].push(var73);
				method460(var68, var69);
			}
		} else {
			if (arg0 == 176) {
				int var74 = arg1.g1();
				int var75 = field1334 + (var74 >> 4 & 0x7);
				int var76 = field1335 + (var74 & 0x7);
				int var77 = arg1.g1();
				int var78 = var77 >> 2;
				int var79 = var77 & 0x3;
				int var80 = field1389[var78];
				int var81 = arg1.g2();
				int var82 = arg1.g2();
				int var83 = arg1.g2();
				int var84 = arg1.g2();
				byte var85 = arg1.g1b();
				byte var86 = arg1.g1b();
				byte var87 = arg1.g1b();
				byte var88 = arg1.g1b();
				ClientPlayer var89;
				if (var84 == field1363) {
					var89 = localPlayer;
				} else {
					var89 = field1536[var84];
				}
				if (var89 != null) {
					LocType var90 = LocType.list(var81);
					int var91 = groundh[field1478][var75][var76];
					int var92 = groundh[field1478][var75 + 1][var76];
					int var93 = groundh[field1478][var75 + 1][var76 + 1];
					int var94 = groundh[field1478][var75][var76 + 1];
					Model var95 = var90.getModel(var78, var79, var91, var92, var93, var94, -1);
					if (var95 != null) {
						method490(var76, var83 + 1, -1, field1478, 0, var75, var80, 0, var82 + 1);
						var89.field467 = var82 + loopCycle;
						var89.field468 = var83 + loopCycle;
						var89.field472 = var95;
						int var96 = var90.width;
						int var97 = var90.length;
						if (var79 == 1 || var79 == 3) {
							var96 = var90.length;
							var97 = var90.width;
						}
						var89.field469 = var75 * 128 + var96 * 64;
						var89.field471 = var76 * 128 + var97 * 64;
						var89.field470 = method458(var89.field469, var89.field471, field1478);
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
			}
			if (arg0 == 95) {
				int var100 = arg1.g1();
				int var101 = field1334 + (var100 >> 4 & 0x7);
				int var102 = field1335 + (var100 & 0x7);
				int var103 = arg1.g2();
				int var104 = arg1.g2();
				int var105 = arg1.g2();
				if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
					LinkList var106 = field1232[field1478][var101][var102];
					if (var106 != null) {
						for (ClientObj var107 = (ClientObj) var106.head(); var107 != null; var107 = (ClientObj) var106.next()) {
							if (var107.field494 == (var103 & 0x7FFF) && var107.field495 == var104) {
								var107.field495 = var105;
								break;
							}
						}
						method460(var101, var102);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public void buildMinimenu() {
		if (objDragArea != 0) {
			return;
		}
		menuOption[0] = "Cancel";
		field1609[0] = 1106;
		menuNumEntries = 1;
		method491();
		field1546 = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (mainModalId == -1) {
				method455();
			} else {
				method477(super.mouseY, super.mouseX, 4, IfType.list[mainModalId], 0, 4);
			}
		}
		if (field1546 != field1664) {
			field1664 = field1546;
		}
		field1546 = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (sideModalId != -1) {
				method477(super.mouseY, super.mouseX, 205, IfType.list[sideModalId], 0, 553);
			} else if (field1370[sideTab] != -1) {
				method477(super.mouseY, super.mouseX, 205, IfType.list[field1370[sideTab]], 0, 553);
			}
		}
		if (field1546 != field1432) {
			redrawSidebar = true;
			field1432 = field1546;
		}
		field1546 = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (chatComId != -1) {
				method477(super.mouseY, super.mouseX, 357, IfType.list[chatComId], 0, 17);
			} else if (super.mouseY < 434 && super.mouseX < 426) {
				method498(super.mouseX - 17, super.mouseY - 357);
			}
		}
		if (chatComId != -1 && field1546 != field1482) {
			redrawChatback = true;
			field1482 = field1546;
		}
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < menuNumEntries - 1; var3++) {
				if (field1609[var3] < 1000 && field1609[var3 + 1] > 1000) {
					String var4 = menuOption[var3];
					menuOption[var3] = menuOption[var3 + 1];
					menuOption[var3 + 1] = var4;
					int var5 = field1609[var3];
					field1609[var3] = field1609[var3 + 1];
					field1609[var3 + 1] = var5;
					int var6 = field1607[var3];
					field1607[var3] = field1607[var3 + 1];
					field1607[var3 + 1] = var6;
					int var7 = field1608[var3];
					field1608[var3] = field1608[var3 + 1];
					field1608[var3 + 1] = var7;
					int var8 = field1610[var3];
					field1610[var3] = field1610[var3 + 1];
					field1610[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void refresh() {
		redrawFrame = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	@Override
	public void messageBox(String arg0, int arg1) {
		lastProgressPercent = arg1;
		lastProgressMessage = arg0;
		prepareTitle();
		if (title == null) {
			super.messageBox(arg0, arg1);
			return;
		}
		field1457.setPixels();
		short var4 = 360;
		short var5 = 200;
		byte var6 = 20;
		b12.centreString(var4 / 2, var5 / 2 - var6 - 26, 16777215, "RuneScape is loading - please wait...");
		int var7 = var5 / 2 - var6 - 18;
		Pix2D.drawRect(304, 9179409, 34, var4 / 2 - 152, var7);
		Pix2D.drawRect(302, 0, 32, var4 / 2 - 151, var7 + 1);
		Pix2D.fillRect(30, 9179409, arg1 * 3, var4 / 2 - 150, var7 + 2);
		Pix2D.fillRect(30, 0, 300 - arg1 * 3, var4 / 2 - 150 + arg1 * 3, var7 + 2);
		b12.centreString(var4 / 2, var5 / 2 + 5 - var6, 16777215, arg0);
		field1457.draw(202, super.graphics, 171);
		if (!redrawFrame) {
			return;
		}
		redrawFrame = false;
		if (!field1322) {
			field1458.draw(0, super.graphics, 0);
			field1459.draw(637, super.graphics, 0);
		}
		imageTitle2.draw(128, super.graphics, 0);
		field1456.draw(202, super.graphics, 371);
		field1460.draw(0, super.graphics, 265);
		field1461.draw(562, super.graphics, 265);
		field1462.draw(128, super.graphics, 171);
		field1463.draw(562, super.graphics, 171);
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public void method477(int arg0, int arg1, int arg2, IfType arg3, int arg5, int arg6) {
		if (arg3.type != 0 || arg3.children == null || arg3.field89 || (arg1 < arg6 || arg0 < arg2 || arg1 > arg6 + arg3.field78 || arg0 > arg2 + arg3.field79)) {
			return;
		}
		int var8 = arg3.children.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg3.field91[var9] + arg6;
			int var11 = arg3.field92[var9] + arg2 - arg5;
			IfType var12 = IfType.list[arg3.children[var9]];
			int var13 = var10 + var12.field81;
			int var14 = var11 + var12.field82;
			if ((var12.field86 >= 0 || var12.field113 != 0) && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
				if (var12.field86 >= 0) {
					field1546 = var12.field86;
				} else {
					field1546 = var12.id;
				}
			}
			if (var12.type == 0) {
				method477(arg0, arg1, var14, var12, var12.field88, var13);
				if (var12.field87 > var12.field79) {
					method472(var12.field79, var12, arg0, var14, var13 + var12.field78, arg1, true, var12.field87);
				}
			} else {
				if (var12.field76 == 1 && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					boolean var15 = false;
					if (var12.clientCode != 0) {
						var15 = method432(var12);
					}
					if (!var15) {
						menuOption[menuNumEntries] = var12.field129;
						field1609[menuNumEntries] = 231;
						field1608[menuNumEntries] = var12.id;
						menuNumEntries++;
					}
				}
				if (var12.field76 == 2 && field1612 == 0 && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					String var16 = var12.field126;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					menuOption[menuNumEntries] = var16 + " @gre@" + var12.field127;
					field1609[menuNumEntries] = 274;
					field1608[menuNumEntries] = var12.id;
					menuNumEntries++;
				}
				if (var12.field76 == 3 && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					menuOption[menuNumEntries] = "Close";
					field1609[menuNumEntries] = 737;
					field1608[menuNumEntries] = var12.id;
					menuNumEntries++;
				}
				if (var12.field76 == 4 && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					menuOption[menuNumEntries] = var12.field129;
					field1609[menuNumEntries] = 435;
					field1608[menuNumEntries] = var12.id;
					menuNumEntries++;
				}
				if (var12.field76 == 5 && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					menuOption[menuNumEntries] = var12.field129;
					field1609[menuNumEntries] = 225;
					field1608[menuNumEntries] = var12.id;
					menuNumEntries++;
				}
				if (var12.field76 == 6 && !resumedPauseButton && arg1 >= var13 && arg0 >= var14 && arg1 < var13 + var12.field78 && arg0 < var14 + var12.field79) {
					menuOption[menuNumEntries] = var12.field129;
					field1609[menuNumEntries] = 997;
					field1608[menuNumEntries] = var12.id;
					menuNumEntries++;
				}
				if (var12.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.field79; var18++) {
						for (int var19 = 0; var19 < var12.field78; var19++) {
							int var20 = var13 + var19 * (var12.field99 + 32);
							int var21 = var14 + var18 * (var12.field100 + 32);
							if (var17 < 20) {
								var20 += var12.field102[var17];
								var21 += var12.field103[var17];
							}
							if (arg1 >= var20 && arg0 >= var21 && arg1 < var20 + 32 && arg0 < var21 + 32) {
								hoveredSlot = var17;
								hoveredSlotComId = var12.id;
								if (var12.linkObjType[var17] > 0) {
									ObjType var22 = ObjType.list(var12.linkObjType[var17] - 1);
									if (field1227 == 1 && var12.field96) {
										if (var12.id != field1229 || var17 != field1228) {
											menuOption[menuNumEntries] = "Use " + field1231 + " with @lre@" + var22.name;
											field1609[menuNumEntries] = 398;
											field1610[menuNumEntries] = var22.id;
											field1607[menuNumEntries] = var17;
											field1608[menuNumEntries] = var12.id;
											menuNumEntries++;
										}
									} else if (field1612 != 1 || !var12.field96) {
										if (var12.field96) {
											for (int var23 = 4; var23 >= 3; var23--) {
												if (var22.iop != null && var22.iop[var23] != null) {
													menuOption[menuNumEntries] = var22.iop[var23] + " @lre@" + var22.name;
													if (var23 == 3) {
														field1609[menuNumEntries] = 681;
													}
													if (var23 == 4) {
														field1609[menuNumEntries] = 100;
													}
													field1610[menuNumEntries] = var22.id;
													field1607[menuNumEntries] = var17;
													field1608[menuNumEntries] = var12.id;
													menuNumEntries++;
												} else if (var23 == 4) {
													menuOption[menuNumEntries] = "Drop @lre@" + var22.name;
													field1609[menuNumEntries] = 100;
													field1610[menuNumEntries] = var22.id;
													field1607[menuNumEntries] = var17;
													field1608[menuNumEntries] = var12.id;
													menuNumEntries++;
												}
											}
										}
										if (var12.field97) {
											menuOption[menuNumEntries] = "Use @lre@" + var22.name;
											field1609[menuNumEntries] = 102;
											field1610[menuNumEntries] = var22.id;
											field1607[menuNumEntries] = var17;
											field1608[menuNumEntries] = var12.id;
											menuNumEntries++;
										}
										if (var12.field96 && var22.iop != null) {
											for (int var24 = 2; var24 >= 0; var24--) {
												if (var22.iop[var24] != null) {
													menuOption[menuNumEntries] = var22.iop[var24] + " @lre@" + var22.name;
													if (var24 == 0) {
														field1609[menuNumEntries] = 694;
													}
													if (var24 == 1) {
														field1609[menuNumEntries] = 962;
													}
													if (var24 == 2) {
														field1609[menuNumEntries] = 795;
													}
													field1610[menuNumEntries] = var22.id;
													field1607[menuNumEntries] = var17;
													field1608[menuNumEntries] = var12.id;
													menuNumEntries++;
												}
											}
										}
										if (var12.field104 != null) {
											for (int var25 = 4; var25 >= 0; var25--) {
												if (var12.field104[var25] != null) {
													menuOption[menuNumEntries] = var12.field104[var25] + " @lre@" + var22.name;
													if (var25 == 0) {
														field1609[menuNumEntries] = 582;
													}
													if (var25 == 1) {
														field1609[menuNumEntries] = 113;
													}
													if (var25 == 2) {
														field1609[menuNumEntries] = 555;
													}
													if (var25 == 3) {
														field1609[menuNumEntries] = 331;
													}
													if (var25 == 4) {
														field1609[menuNumEntries] = 354;
													}
													field1610[menuNumEntries] = var22.id;
													field1607[menuNumEntries] = var17;
													field1608[menuNumEntries] = var12.id;
													menuNumEntries++;
												}
											}
										}
										menuOption[menuNumEntries] = "Examine @lre@" + var22.name;
										field1609[menuNumEntries] = 1328;
										field1610[menuNumEntries] = var22.id;
										field1607[menuNumEntries] = var17;
										field1608[menuNumEntries] = var12.id;
										menuNumEntries++;
									} else if ((field1614 & 0x10) == 16) {
										menuOption[menuNumEntries] = field1615 + " @lre@" + var22.name;
										field1609[menuNumEntries] = 563;
										field1610[menuNumEntries] = var22.id;
										field1607[menuNumEntries] = var17;
										field1608[menuNumEntries] = var12.id;
										menuNumEntries++;
									}
								}
							}
							var17++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void method478() {
		for (MapSpotAnim var2 = (MapSpotAnim) field1340.head(); var2 != null; var2 = (MapSpotAnim) field1340.next()) {
			if (var2.field605 != field1478 || var2.field611) {
				var2.unlink();
			} else if (loopCycle >= var2.field604) {
				var2.method150(0, worldUpdateNum);
				if (var2.field611) {
					var2.unlink();
				} else {
					world.addDynamic(var2.field608, var2, var2.field606, -1, var2.field607, 60, 0, var2.field605, false);
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void lostCon() {
		if (logoutTimer > 0) {
			logout();
			return;
		}
		field1280.setPixels();
		p12.centreString(257, 144, 0, "Connection lost");
		p12.centreString(256, 143, 16777215, "Connection lost");
		p12.centreString(257, 159, 0, "Please wait - attempting to reestablish");
		p12.centreString(256, 158, 16777215, "Please wait - attempting to reestablish");
		field1280.draw(4, super.graphics, 4);
		minimapState = 0;
		minimapFlagX = 0;
		ClientStream var2 = stream;
		ingame = false;
		method456(field1563, field1564, true);
		if (!ingame) {
			logout();
		}
		try {
			var2.close();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.s(I)Ljava/net/Socket;")
	public Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@Override
	public void run() {
		if (field1591) {
			method493();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void method482() {
		if (field1490 == 0) {
			return;
		}
		PixFont var2 = p12;
		int var3 = 0;
		if (rebootTimer != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (field1366[var4] != null) {
				int var5 = field1364[var4];
				String var6 = field1365[var4];
				byte var7 = 0;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					var7 = 1;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					var7 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || field1388 == 0 || field1388 == 1 && method430(var6))) {
					int var8 = 329 - var3 * 13;
					byte var9 = 4;
					var2.drawString(var9, "From", 0, var8);
					var2.drawString(var9, "From", 65535, var8 - 1);
					int var10 = var9 + var2.stringWid("From ");
					if (var7 == 1) {
						modIcons[0].plotSprite(var10, var8 - 12);
						var10 += 14;
					}
					if (var7 == 2) {
						modIcons[1].plotSprite(var10, var8 - 12);
						var10 += 14;
					}
					var2.drawString(var10, var6 + ": " + field1366[var4], 0, var8);
					var2.drawString(var10, var6 + ": " + field1366[var4], 65535, var8 - 1);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && field1388 < 2) {
					int var11 = 329 - var3 * 13;
					var2.drawString(4, field1366[var4], 0, var11);
					var2.drawString(4, field1366[var4], 65535, var11 - 1);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && field1388 < 2) {
					int var12 = 329 - var3 * 13;
					var2.drawString(4, "To " + var6 + ": " + field1366[var4], 0, var12);
					var2.drawString(4, "To " + var6 + ": " + field1366[var4], 65535, var12 - 1);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public void getPlayerPosExtended(Packet arg0, int arg2) {
		for (int var4 = 0; var4 < field1539; var4++) {
			int var5 = field1540[var4];
			ClientPlayer var6 = field1536[var5];
			int var7 = arg0.g1();
			if ((var7 & 0x80) == 128) {
				var7 += arg0.g1() << 8;
			}
			getPlayerPosExtended(var7, var5, (byte) 3, var6, arg0);
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
		int[] var3 = minimap.data;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var7 = (103 - var6) * 512 * 4 + 24628;
			for (int var8 = 1; var8 < 103; var8++) {
				if ((mapl[arg0][var8][var6] & 0x18) == 0) {
					world.render2DGround(var3, var7, 512, arg0, var8, var6);
				}
				if (arg0 < 3 && (mapl[arg0 + 1][var8][var6] & 0x8) != 0) {
					world.render2DGround(var3, var7, 512, arg0 + 1, var8, var6);
				}
				var7 += 4;
			}
		}
		int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		minimap.setPixels();
		for (int var11 = 1; var11 < 103; var11++) {
			for (int var12 = 1; var12 < 103; var12++) {
				if ((mapl[arg0][var12][var11] & 0x18) == 0) {
					method449(var12, var9, var11, var10, arg0);
				}
				if (arg0 < 3 && (mapl[arg0 + 1][var12][var11] & 0x8) != 0) {
					method449(var12, var9, var11, var10, arg0 + 1);
				}
			}
		}
		field1280.setPixels();
		field1403 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = world.getGd(field1478, var13, var14);
				if (var15 != 0) {
					int var16 = var15 >> 14 & 0x7FFF;
					int var17 = LocType.list(var16).mapfunction;
					if (var17 >= 0) {
						int var18 = var13;
						int var19 = var14;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							byte var20 = 104;
							byte var21 = 104;
							int[][] var22 = collision[field1478].flags;
							for (int var23 = 0; var23 < 10; var23++) {
								int var24 = (int) (Math.random() * 4.0D);
								if (var24 == 0 && var18 > 0 && var18 > var13 - 3 && (var22[var18 - 1][var19] & 0x280108) == 0) {
									var18--;
								}
								if (var24 == 1 && var18 < var20 - 1 && var18 < var13 + 3 && (var22[var18 + 1][var19] & 0x280180) == 0) {
									var18++;
								}
								if (var24 == 2 && var19 > 0 && var19 > var14 - 3 && (var22[var18][var19 - 1] & 0x280102) == 0) {
									var19--;
								}
								if (var24 == 3 && var19 < var21 - 1 && var19 < var14 + 3 && (var22[var18][var19 + 1] & 0x280120) == 0) {
									var19++;
								}
							}
						}
						field1620[field1403] = mapfunction[var17];
						field1404[field1403] = var18;
						field1405[field1403] = var19;
						field1403++;
					}
				}
			}
		}
		field1412++;
		if (field1412 > 112) {
			field1412 = 0;
			out.p1Enc(52);
			out.p1(50);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void logout() {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var3) {
		}
		stream = null;
		ingame = false;
		field1421 = 0;
		field1563 = "";
		field1564 = "";
		clearCaches();
		world.resetMap();
		for (int var2 = 0; var2 < 4; var2++) {
			collision[var2].reset();
		}
		System.gc();
		method486();
		nextMidiSong = -1;
		midiSong = -1;
		nextMusicDelay = 0;
	}

	@ObfuscatedName("client.a(ILnb;)V")
	public void method489(LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.field728 == 0) {
			var3 = world.getWall(arg1.field727, arg1.field729, arg1.field730);
		}
		if (arg1.field728 == 1) {
			var3 = world.getDecor(arg1.field730, arg1.field729, arg1.field727);
		}
		if (arg1.field728 == 2) {
			var3 = world.getScene(arg1.field727, arg1.field729, arg1.field730);
		}
		if (arg1.field728 == 3) {
			var3 = world.getGd(arg1.field727, arg1.field729, arg1.field730);
		}
		if (var3 != 0) {
			int var7 = world.typeCode2(arg1.field727, arg1.field729, arg1.field730, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.field731 = var4;
		arg1.field733 = var5;
		arg1.field732 = var6;
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
	public void method490(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) field1644.head(); var12 != null; var12 = (LocChange) field1644.next()) {
			if (var12.field727 == arg4 && var12.field729 == arg6 && var12.field730 == arg0 && var12.field728 == arg7) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.field727 = arg4;
			var11.field728 = arg7;
			var11.field729 = arg6;
			var11.field730 = arg0;
			method489(var11);
			field1644.push(var11);
		}
		var11.field734 = arg3;
		var11.field736 = arg8;
		var11.field735 = arg5;
		var11.field737 = arg9;
		var11.field738 = arg2;
	}

	@ObfuscatedName("client.h(Z)V")
	public void method491() {
		if (field1490 == 0) {
			return;
		}
		int var2 = 0;
		if (rebootTimer != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (field1366[var3] != null) {
				int var4 = field1364[var3];
				String var5 = field1365[var3];
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || field1388 == 0 || field1388 == 1 && method430(var5))) {
					int var6 = 329 - var2 * 13;
					if (super.mouseX > 4 && super.mouseY - 4 > var6 - 10 && super.mouseY - 4 <= var6 + 3) {
						int var7 = p12.stringWid("From:  " + var5 + field1366[var3]) + 25;
						if (var7 > 450) {
							var7 = 450;
						}
						if (super.mouseX < var7 + 4) {
							if (field1282 >= 1) {
								menuOption[menuNumEntries] = "Report abuse @whi@" + var5;
								field1609[menuNumEntries] = 2524;
								menuNumEntries++;
							}
							menuOption[menuNumEntries] = "Add ignore @whi@" + var5;
							field1609[menuNumEntries] = 2047;
							menuNumEntries++;
							menuOption[menuNumEntries] = "Add friend @whi@" + var5;
							field1609[menuNumEntries] = 2605;
							menuNumEntries++;
						}
					}
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if ((var4 == 5 || var4 == 6) && field1388 < 2) {
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream method492(String arg0) throws IOException {
		if (field1469) {
			if (field1420 != null) {
				try {
					field1420.close();
				} catch (Exception var4) {
				}
				field1420 = null;
			}
			field1420 = openSocket(43595);
			field1420.setSoTimeout(10000);
			InputStream var2 = field1420.getInputStream();
			OutputStream var3 = field1420.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void method493() {
		field1392 = true;
		try {
			long var2 = System.currentTimeMillis();
			int var4 = 0;
			int var5 = 20;
			while (field1322) {
				field1382++;
				method494();
				method494();
				method536();
				var4++;
				if (var4 > 10) {
					long var6 = System.currentTimeMillis();
					int var8 = (int) (var6 - var2) / 10 - var5;
					var5 = 40 - var8;
					if (var5 < 5) {
						var5 = 5;
					}
					var4 = 0;
					var2 = var6;
				}
				try {
					Thread.sleep((long) var5);
				} catch (Exception var9) {
				}
			}
		} catch (Exception var10) {
		}
		field1392 = false;
	}

	@ObfuscatedName("client.g(B)V")
	public void method494() {
		short var3 = 256;
		for (int var4 = 10; var4 < 117; var4++) {
			int var5 = (int) (Math.random() * 100.0D);
			if (var5 < 50) {
				field1393[var4 + (var3 - 2 << 7)] = 255;
			}
		}
		for (int var6 = 0; var6 < 100; var6++) {
			int var7 = (int) (Math.random() * 124.0D) + 2;
			int var8 = (int) (Math.random() * 128.0D) + 128;
			int var9 = var7 + (var8 << 7);
			field1393[var9] = 192;
		}
		for (int var10 = 1; var10 < var3 - 1; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = var11 + (var10 << 7);
				field1394[var12] = (field1393[var12 - 1] + field1393[var12 + 1] + field1393[var12 - 128] + field1393[var12 + 128]) / 4;
			}
		}
		field1479 += 128;
		if (field1479 > field1527.length) {
			field1479 -= field1527.length;
			int var13 = (int) (Math.random() * 12.0D);
			method508(field1645[var13]);
		}
		for (int var14 = 1; var14 < var3 - 1; var14++) {
			for (int var15 = 1; var15 < 127; var15++) {
				int var16 = var15 + (var14 << 7);
				int var17 = field1394[var16 + 128] - field1527[var16 + field1479 & field1527.length - 1] / 5;
				if (var17 < 0) {
					var17 = 0;
				}
				field1393[var16] = var17;
			}
		}
		for (int var18 = 0; var18 < var3 - 1; var18++) {
			field1319[var18] = field1319[var18 + 1];
		}
		field1319[var3 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (field1410 > 0) {
			field1410 -= 4;
		}
		if (field1411 > 0) {
			field1411 -= 4;
		}
		if (field1410 != 0 || field1411 != 0) {
			return;
		}
		int var19 = (int) (Math.random() * 2000.0D);
		if (var19 == 0) {
			field1410 = 1024;
		}
		if (var19 == 1) {
			field1411 = 1024;
			return;
		}
	}

	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.x(I)V")
	public void titleScreenLoop() {
		if (field1421 == 0) {
			int var2 = super.sHei / 2 - 80;
			int var3 = super.sWid / 2 + 20;
			int var14 = var3 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				field1421 = 3;
				field1371 = 0;
			}
			int var4 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				field1348 = "";
				field1349 = "Enter your username & password.";
				field1421 = 2;
				field1371 = 0;
			}
		} else if (field1421 == 2) {
			int var5 = super.sWid / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var16 - 15 && super.mouseClickY < var16) {
				field1371 = 0;
			}
			var5 = var16 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
				field1371 = 1;
			}
			var5 += 15;
			int var6 = super.sHei / 2 - 80;
			int var7 = super.sWid / 2 + 50;
			int var17 = var7 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				method456(field1563, field1564, false);
				if (ingame) {
					return;
				}
			}
			int var8 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				field1421 = 0;
				field1563 = "";
				field1564 = "";
			}
			while (true) {
				while (true) {
					int var9 = pollKey();
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < field1223.length(); var11++) {
						if (var9 == field1223.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (field1371 == 0) {
						if (var9 == 8 && field1563.length() > 0) {
							field1563 = field1563.substring(0, field1563.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							field1371 = 1;
						}
						if (var10) {
							field1563 = field1563 + (char) var9;
						}
						if (field1563.length() > 12) {
							field1563 = field1563.substring(0, 12);
						}
					} else if (field1371 == 1) {
						if (var9 == 8 && field1564.length() > 0) {
							field1564 = field1564.substring(0, field1564.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							field1371 = 0;
						}
						if (var10) {
							field1564 = field1564 + (char) var9;
						}
						if (field1564.length() > 20) {
							field1564 = field1564.substring(0, 20);
						}
					}
				}
			}
		} else if (field1421 == 3) {
			int var12 = super.sHei / 2;
			int var13 = super.sWid / 2 + 50;
			int var18 = var13 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
				field1421 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILib;)V")
	public void method496(int arg0, int arg1, Pix32 arg3) {
		int var6 = arg0 * arg0 + arg1 * arg1;
		if (var6 <= 4225 || var6 >= 90000) {
			method441(arg1, arg0, arg3);
			return;
		}
		int var7 = orbitCameraYaw + field1633 & 0x7FF;
		int var8 = Model.sinTable[var7];
		int var9 = Model.cosTable[var7];
		int var10 = var8 * 256 / (field1586 + 256);
		int var11 = var9 * 256 / (field1586 + 256);
		int var12 = arg1 * var10 + arg0 * var11 >> 16;
		int var13 = arg1 * var11 - arg0 * var10 >> 16;
		double var14 = Math.atan2((double) var12, (double) var13);
		int var16 = (int) (Math.sin(var14) * 63.0D);
		int var17 = (int) (Math.cos(var14) * 57.0D);
		mapedge.rotatePlotSprite(15, 20, var16 + 94 + 4 - 10, 83 - var17 - 20, var14, 256, 15, 20);
	}

	@ObfuscatedName("client.h(B)V")
	public void method497() {
		for (LocChange var3 = (LocChange) field1644.head(); var3 != null; var3 = (LocChange) field1644.next()) {
			if (var3.field738 == -1) {
				var3.field737 = 0;
				method489(var3);
			} else {
				var3.unlink();
			}
		}
	}

	@Override
	public String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IZI)V")
	public void method498(int arg0, int arg2) {
		int var4 = 0;
		for (int var5 = 0; var5 < 100; var5++) {
			if (field1366[var5] != null) {
				int var6 = field1364[var5];
				int var7 = field1498 + 70 + 4 - var4 * 14;
				if (var7 < -20) {
					break;
				}
				String var8 = field1365[var5];
				if (var8 != null && var8.startsWith("@cr1@")) {
					var8 = var8.substring(5);
				}
				if (var8 != null && var8.startsWith("@cr2@")) {
					var8 = var8.substring(5);
				}
				if (var6 == 0) {
					var4++;
				}
				if ((var6 == 1 || var6 == 2) && (var6 == 1 || field1383 == 0 || field1383 == 1 && method430(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(localPlayer.field457)) {
						if (field1282 >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var8;
							field1609[menuNumEntries] = 524;
							menuNumEntries++;
						}
						menuOption[menuNumEntries] = "Add ignore @whi@" + var8;
						field1609[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var8;
						field1609[menuNumEntries] = 605;
						menuNumEntries++;
					}
					var4++;
				}
				if ((var6 == 3 || var6 == 7) && field1490 == 0 && (var6 == 7 || field1388 == 0 || field1388 == 1 && method430(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						if (field1282 >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var8;
							field1609[menuNumEntries] = 524;
							menuNumEntries++;
						}
						menuOption[menuNumEntries] = "Add ignore @whi@" + var8;
						field1609[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var8;
						field1609[menuNumEntries] = 605;
						menuNumEntries++;
					}
					var4++;
				}
				if (var6 == 4 && (field1221 == 0 || field1221 == 1 && method430(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						menuOption[menuNumEntries] = "Accept trade @whi@" + var8;
						field1609[menuNumEntries] = 507;
						menuNumEntries++;
					}
					var4++;
				}
				if ((var6 == 5 || var6 == 6) && field1490 == 0 && field1388 < 2) {
					var4++;
				}
				if (var6 == 8 && (field1221 == 0 || field1221 == 1 && method430(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						menuOption[menuNumEntries] = "Accept duel @whi@" + var8;
						field1609[menuNumEntries] = 957;
						menuNumEntries++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void loadTitleImages() {
		field1679 = new Pix8(title, "titlebox", 0);
		field1680 = new Pix8(title, "titlebutton", 0);
		field1645 = new Pix8[12];
		int var2 = 0;
		try {
			var2 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var19) {
		}
		if (var2 == 0) {
			for (int var3 = 0; var3 < 12; var3++) {
				field1645[var3] = new Pix8(title, "runes", var3);
			}
		} else {
			for (int var4 = 0; var4 < 12; var4++) {
				field1645[var4] = new Pix8(title, "runes", (var4 & 0x3) + 12);
			}
		}
		field1307 = new Pix32(128, 265);
		field1308 = new Pix32(128, 265);
		for (int var5 = 0; var5 < 33920; var5++) {
			field1307.data[var5] = field1458.data[var5];
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			field1308.data[var6] = field1459.data[var6];
		}
		field1353 = new int[256];
		for (int var7 = 0; var7 < 64; var7++) {
			field1353[var7] = var7 * 262144;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			field1353[var8 + 64] = var8 * 1024 + 16711680;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			field1353[var9 + 128] = var9 * 4 + 16776960;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			field1353[var10 + 192] = 16777215;
		}
		field1354 = new int[256];
		for (int var11 = 0; var11 < 64; var11++) {
			field1354[var11] = var11 * 1024;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			field1354[var12 + 64] = var12 * 4 + 65280;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			field1354[var13 + 128] = var13 * 262144 + 65535;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			field1354[var14 + 192] = 16777215;
		}
		field1355 = new int[256];
		for (int var15 = 0; var15 < 64; var15++) {
			field1355[var15] = var15 * 4;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			field1355[var16 + 64] = var16 * 262144 + 255;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			field1355[var17 + 128] = var17 * 1024 + 16711935;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			field1355[var18 + 192] = 16777215;
		}
		field1352 = new int[256];
		field1527 = new int[32768];
		field1528 = new int[32768];
		method508(null);
		field1393 = new int[32768];
		field1394 = new int[32768];
		messageBox("Connecting to fileserver", 10);
		if (!field1322) {
			field1591 = true;
			field1322 = true;
			startThread(this, 2);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void method500() {
		if (field1281 != null) {
			return;
		}
		method522();
		super.drawArea = null;
		imageTitle2 = null;
		field1456 = null;
		field1457 = null;
		field1458 = null;
		field1459 = null;
		field1460 = null;
		field1461 = null;
		field1462 = null;
		field1463 = null;
		field1281 = new PixMap(96, 479, getBaseComponent());
		field1279 = new PixMap(156, 172, getBaseComponent());
		Pix2D.cls();
		mapback.plotSprite(0, 0);
		field1278 = new PixMap(261, 190, getBaseComponent());
		field1280 = new PixMap(334, 512, getBaseComponent());
		Pix2D.cls();
		field1406 = new PixMap(50, 496, getBaseComponent());
		field1407 = new PixMap(37, 269, getBaseComponent());
		field1408 = new PixMap(45, 249, getBaseComponent());
		redrawFrame = true;
	}

	@ObfuscatedName("client.A(I)Ljava/lang/String;")
	public String getHost() {
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public void getPlayerPosOldVis(Packet arg0, int arg1) {
		int var3 = arg0.gBit(8);
		if (var3 < field1537) {
			for (int var4 = var3; var4 < field1537; var4++) {
				entityRemovalIds[entityRemovalCount++] = field1538[var4];
			}
		}
		if (var3 > field1537) {
			signlink.reporterror(field1563 + " Too many players");
			throw new RuntimeException("eek");
		}
		field1537 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field1538[var5];
			ClientPlayer var7 = field1536[var6];
			int var8 = arg0.gBit(1);
			if (var8 == 0) {
				field1538[field1537++] = var6;
				var7.field442 = loopCycle;
			} else {
				int var9 = arg0.gBit(2);
				if (var9 == 0) {
					field1538[field1537++] = var6;
					var7.field442 = loopCycle;
					field1540[field1539++] = var6;
				} else if (var9 == 1) {
					field1538[field1537++] = var6;
					var7.field442 = loopCycle;
					int var10 = arg0.gBit(3);
					var7.method111(true, var10, false);
					int var11 = arg0.gBit(1);
					if (var11 == 1) {
						field1540[field1539++] = var6;
					}
				} else if (var9 == 2) {
					field1538[field1537++] = var6;
					var7.field442 = loopCycle;
					int var12 = arg0.gBit(3);
					var7.method111(true, var12, true);
					int var13 = arg0.gBit(3);
					var7.method111(true, var13, true);
					int var14 = arg0.gBit(1);
					if (var14 == 1) {
						field1540[field1539++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public void openMenu() {
		int var2 = b12.stringWid("Choose Option");
		for (int var3 = 0; var3 < menuNumEntries; var3++) {
			int var4 = b12.stringWid(menuOption[var3]);
			if (var4 > var2) {
				var2 = var4;
			}
		}
		var2 += 8;
		int var5 = menuNumEntries * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var6 = super.mouseClickX - var2 / 2 - 4;
			if (var6 + var2 > 512) {
				var6 = 512 - var2;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			int var7 = super.mouseClickY - 4;
			if (var7 + var5 > 334) {
				var7 = 334 - var5;
			}
			if (var7 < 0) {
				var7 = 0;
			}
			field1267 = true;
			menuArea = 0;
			menuX = var6;
			menuY = var7;
			menuWidth = var2;
			menuHeight = menuNumEntries * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var8 = super.mouseClickX - var2 / 2 - 553;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 + var2 > 190) {
				var8 = 190 - var2;
			}
			int var9 = super.mouseClickY - 205;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 + var5 > 261) {
				var9 = 261 - var5;
			}
			field1267 = true;
			menuArea = 1;
			menuX = var8;
			menuY = var9;
			menuWidth = var2;
			menuHeight = menuNumEntries * 15 + 22;
		}
		if (super.mouseClickX <= 17 || super.mouseClickY <= 357 || super.mouseClickX >= 496 || super.mouseClickY >= 453) {
			return;
		}
		int var10 = super.mouseClickX - var2 / 2 - 17;
		if (var10 < 0) {
			var10 = 0;
		} else if (var10 + var2 > 479) {
			var10 = 479 - var2;
		}
		int var11 = super.mouseClickY - 357;
		if (var11 < 0) {
			var11 = 0;
		} else if (var11 + var5 > 96) {
			var11 = 96 - var5;
		}
		field1267 = true;
		menuArea = 2;
		menuX = var10;
		menuY = var11;
		menuWidth = var2;
		menuHeight = menuNumEntries * 15 + 22;
	}

	@ObfuscatedName("client.a(JZ)V")
	public void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (ignoreCount >= 100) {
			method457(0, "", "Your ignore list is full. Max of 100 hit");
			return;
		}
		String var4 = JString.toScreenName(JString.toRawUsername(arg0));
		for (int var5 = 0; var5 < ignoreCount; var5++) {
			if (ignoreUserhash[var5] == arg0) {
				method457(0, "", var4 + " is already on your ignore list");
				return;
			}
		}
		for (int var6 = 0; var6 < field1531; var6++) {
			if (field1575[var6] == arg0) {
				method457(0, "", "Please remove " + var4 + " from your friend list first");
				return;
			}
		}
		ignoreUserhash[ignoreCount++] = arg0;
		redrawSidebar = true;
		out.p1Enc(255);
		out.p8(arg0);
	}

	@Override
	public void init() {
		nodeId = Integer.parseInt(getParameter("nodeid"));
		portOff = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem();
		} else {
			setHighMem();
		}
		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			memServer = false;
		} else {
			memServer = true;
		}
		method2(503, 765);
	}

	@ObfuscatedName("client.i(Z)V")
	public void method506() {
		field1278.setPixels();
		Pix3D.scanline = sidebarScanline;
		invback.plotSprite(0, 0);
		if (sideModalId != -1) {
			drawInterface(0, IfType.list[sideModalId], 0, 0);
		} else if (field1370[sideTab] != -1) {
			drawInterface(0, IfType.list[field1370[sideTab]], 0, 0);
		}
		if (field1267 && menuArea == 1) {
			drawMinimenu();
		}
		field1278.draw(553, super.graphics, 205);
		field1280.setPixels();
		Pix3D.scanline = viewportScanline;
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public void getNpcPosExtended(int arg0, Packet arg2) {
		for (int var4 = 0; var4 < field1539; var4++) {
			int var5 = field1540[var4];
			ClientNpc var6 = field1675[var5];
			int var7 = arg2.g1();
			if ((var7 & 0x1) == 1) {
				int var8 = arg2.g1();
				int var9 = arg2.g1();
				var6.method114(loopCycle, var8, var9);
				var6.field416 = loopCycle + 300;
				var6.field417 = arg2.g1();
				var6.field418 = arg2.g1();
			}
			if ((var7 & 0x2) == 2) {
				int var10 = arg2.g2();
				if (var10 == 65535) {
					var10 = -1;
				}
				if (var10 == var6.field425) {
					var6.field429 = 0;
				}
				int var11 = arg2.g1();
				if (var10 == var6.field425 && var10 != -1) {
					int var12 = SeqType.list[var10].duplicatebehaviour;
					if (var12 == 1) {
						var6.field426 = 0;
						var6.field427 = 0;
						var6.field428 = var11;
						var6.field429 = 0;
					}
					if (var12 == 2) {
						var6.field429 = 0;
					}
				} else if (var10 == -1 || var6.field425 == -1 || SeqType.list[var10].priority >= SeqType.list[var6.field425].priority) {
					var6.field425 = var10;
					var6.field426 = 0;
					var6.field427 = 0;
					var6.field428 = var11;
					var6.field429 = 0;
					var6.field451 = var6.field446;
				}
			}
			if ((var7 & 0x4) == 4) {
				var6.field419 = arg2.g2();
				if (var6.field419 == 65535) {
					var6.field419 = -1;
				}
			}
			if ((var7 & 0x8) == 8) {
				var6.field409 = arg2.gjstr();
				var6.field410 = 100;
			}
			if ((var7 & 0x10) == 16) {
				int var13 = arg2.g1();
				int var14 = arg2.g1();
				var6.method114(loopCycle, var13, var14);
				var6.field416 = loopCycle + 300;
				var6.field417 = arg2.g1();
				var6.field418 = arg2.g1();
			}
			if ((var7 & 0x20) == 32) {
				var6.field453 = NpcType.list(arg2.g2());
				var6.field401 = var6.field453.size;
				var6.field445 = var6.field453.turnspeed;
				var6.field404 = var6.field453.walkanim;
				var6.field405 = var6.field453.walkanim_b;
				var6.field406 = var6.field453.walkanim_r;
				var6.field407 = var6.field453.walkanim_l;
				var6.field402 = var6.field453.readyanim;
			}
			if ((var7 & 0x40) == 64) {
				var6.field430 = arg2.g2();
				int var15 = arg2.g4();
				var6.field434 = var15 >> 16;
				var6.field433 = loopCycle + (var15 & 0xFFFF);
				var6.field431 = 0;
				var6.field432 = 0;
				if (var6.field433 > loopCycle) {
					var6.field431 = -1;
				}
				if (var6.field430 == 65535) {
					var6.field430 = -1;
				}
			}
			if ((var7 & 0x80) == 128) {
				var6.field420 = arg2.g2();
				var6.field421 = arg2.g2();
			}
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
	public void method508(Pix8 arg1) {
		short var3 = 256;
		for (int var4 = 0; var4 < field1527.length; var4++) {
			field1527[var4] = 0;
		}
		for (int var5 = 0; var5 < 5000; var5++) {
			int var6 = (int) (Math.random() * 128.0D * (double) var3);
			field1527[var6] = (int) (Math.random() * 256.0D);
		}
		for (int var7 = 0; var7 < 20; var7++) {
			for (int var8 = 1; var8 < var3 - 1; var8++) {
				for (int var9 = 1; var9 < 127; var9++) {
					int var10 = var9 + (var8 << 7);
					field1528[var10] = (field1527[var10 - 1] + field1527[var10 + 1] + field1527[var10 - 128] + field1527[var10 + 128]) / 4;
				}
			}
			int[] var11 = field1527;
			field1527 = field1528;
			field1528 = var11;
		}
		if (arg1 == null) {
			return;
		}
		int var12 = 0;
		for (int var13 = 0; var13 < arg1.hi; var13++) {
			for (int var14 = 0; var14 < arg1.wi; var14++) {
				if (arg1.data[var12++] != 0) {
					int var15 = var14 + arg1.xof + 16;
					int var16 = var13 + arg1.yof + 16;
					int var17 = var15 + (var16 << 7);
					field1527[var17] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLab;Llb;)V")
	public void getPlayerPosExtended(int arg0, int arg1, byte arg2, ClientPlayer arg3, Packet arg4) {
		if (arg2 != field1252) {
			return;
		}
		if ((arg0 & 0x1) == 1) {
			int var6 = arg4.g1();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet(var7);
			arg4.gdata(var6, var7, 0);
			field1541[arg1] = var8;
			arg3.method116(var8);
		}
		if ((arg0 & 0x2) == 2) {
			int var9 = arg4.g2();
			if (var9 == 65535) {
				var9 = -1;
			}
			if (var9 == arg3.field425) {
				arg3.field429 = 0;
			}
			int var10 = arg4.g1();
			if (var9 == arg3.field425 && var9 != -1) {
				int var11 = SeqType.list[var9].duplicatebehaviour;
				if (var11 == 1) {
					arg3.field426 = 0;
					arg3.field427 = 0;
					arg3.field428 = var10;
					arg3.field429 = 0;
				}
				if (var11 == 2) {
					arg3.field429 = 0;
				}
			} else if (var9 == -1 || arg3.field425 == -1 || SeqType.list[var9].priority >= SeqType.list[arg3.field425].priority) {
				arg3.field425 = var9;
				arg3.field426 = 0;
				arg3.field427 = 0;
				arg3.field428 = var10;
				arg3.field429 = 0;
				arg3.field451 = arg3.field446;
			}
		}
		if ((arg0 & 0x4) == 4) {
			arg3.field419 = arg4.g2();
			if (arg3.field419 == 65535) {
				arg3.field419 = -1;
			}
		}
		if ((arg0 & 0x8) == 8) {
			arg3.field409 = arg4.gjstr();
			arg3.field411 = 0;
			arg3.field412 = 0;
			arg3.field410 = 150;
			method457(2, arg3.field457, arg3.field409);
		}
		if ((arg0 & 0x10) == 16) {
			int var12 = arg4.g1();
			int var13 = arg4.g1();
			arg3.method114(loopCycle, var12, var13);
			arg3.field416 = loopCycle + 300;
			arg3.field417 = arg4.g1();
			arg3.field418 = arg4.g1();
		}
		if ((arg0 & 0x20) == 32) {
			arg3.field420 = arg4.g2();
			arg3.field421 = arg4.g2();
		}
		if ((arg0 & 0x40) == 64) {
			int var14 = arg4.g2();
			int var15 = arg4.g1();
			int var16 = arg4.g1();
			int var17 = arg4.data;
			if (arg3.field457 != null && arg3.field458) {
				long var18 = JString.toUserhash(arg3.field457);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < ignoreCount; var21++) {
						if (ignoreUserhash[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}
				if (!var20 && field1306 == 0) {
					try {
						String var22 = WordPack.unpack(var16, arg4);
						String var23 = WordFilter.filter(var22);
						arg3.field409 = var23;
						arg3.field411 = var14 >> 8;
						arg3.field412 = var14 & 0xFF;
						arg3.field410 = 150;
						if (var15 == 2 || var15 == 3) {
							method457(1, "@cr2@" + arg3.field457, var23);
						} else if (var15 == 1) {
							method457(1, "@cr1@" + arg3.field457, var23);
						} else {
							method457(2, arg3.field457, var23);
						}
					} catch (Exception var28) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg4.data = var17 + var16;
		}
		if ((arg0 & 0x100) == 256) {
			arg3.field430 = arg4.g2();
			int var25 = arg4.g4();
			arg3.field434 = var25 >> 16;
			arg3.field433 = loopCycle + (var25 & 0xFFFF);
			arg3.field431 = 0;
			arg3.field432 = 0;
			if (arg3.field433 > loopCycle) {
				arg3.field431 = -1;
			}
			if (arg3.field430 == 65535) {
				arg3.field430 = -1;
			}
		}
		if ((arg0 & 0x200) == 512) {
			arg3.field435 = arg4.g1();
			arg3.field437 = arg4.g1();
			arg3.field436 = arg4.g1();
			arg3.field438 = arg4.g1();
			arg3.field439 = arg4.g2() + loopCycle;
			arg3.field440 = arg4.g2() + loopCycle;
			arg3.field441 = arg4.g1();
			arg3.method112();
		}
		if ((arg0 & 0x400) != 1024) {
			return;
		}
		int var26 = arg4.g1();
		int var27 = arg4.g1();
		arg3.method114(loopCycle, var26, var27);
		arg3.field416 = loopCycle + 300;
		arg3.field417 = arg4.g1();
		arg3.field418 = arg4.g1();
	}

	@ObfuscatedName("client.b(IJ)V")
	public void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field1531 >= 100 && field1224 != 1) {
			method457(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else if (field1531 >= 200) {
			method457(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else {
			String var3 = JString.toScreenName(JString.toRawUsername(arg0));
			for (int var4 = 0; var4 < field1531; var4++) {
				if (field1575[var4] == arg0) {
					method457(0, "", var3 + " is already on your friend list");
					return;
				}
			}
			for (int var5 = 0; var5 < ignoreCount; var5++) {
				if (ignoreUserhash[var5] == arg0) {
					method457(0, "", "Please remove " + var3 + " from your ignore list first");
					return;
				}
			}
			if (!var3.equals(localPlayer.field457)) {
				field1249[field1531] = var3;
				field1575[field1531] = arg0;
				field1489[field1531] = 0;
				field1531++;
				redrawSidebar = true;
				out.p1Enc(13);
				out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	@Override
	public void maindraw() {
		if (errorStarted || errorLoading || errorHost) {
			method516();
			return;
		}
		field1258++;
		if (ingame) {
			method550();
		} else {
			method461(false);
		}
		scrollCycle = 0;
	}

	@ObfuscatedName("client.i(B)V")
	public void method511(byte arg0) {
		field1279.setPixels();
		if (minimapState == 2) {
			byte[] var2 = mapback.data;
			int[] var3 = Pix2D.pixels;
			int var4 = var2.length;
			for (int var5 = 0; var5 < var4; var5++) {
				if (var2[var5] == 0) {
					var3[var5] = 0;
				}
			}
			compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, compassMaskLineLengths, 25, compassMaskLineOffsets, orbitCameraYaw, 0);
			field1280.setPixels();
			return;
		}
		int var6 = orbitCameraYaw + field1633 & 0x7FF;
		int var7 = localPlayer.field397 / 32 + 48;
		int var8 = 464 - localPlayer.field398 / 32;
		minimap.scanlineRotatePlotSprite(field1586 + 256, var7, 146, 151, 25, minimapMaskLineLengths, var8, minimapMaskLineOffsets, var6, 5);
		if (arg0 != field1214) {
			return;
		}
		compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, compassMaskLineLengths, 25, compassMaskLineOffsets, orbitCameraYaw, 0);
		for (int var9 = 0; var9 < field1403; var9++) {
			int var10 = field1404[var9] * 4 + 2 - localPlayer.field397 / 32;
			int var11 = field1405[var9] * 4 + 2 - localPlayer.field398 / 32;
			method441(var11, var10, field1620[var9]);
		}
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				LinkList var14 = field1232[field1478][var12][var13];
				if (var14 != null) {
					int var15 = var12 * 4 + 2 - localPlayer.field397 / 32;
					int var16 = var13 * 4 + 2 - localPlayer.field398 / 32;
					method441(var16, var15, mapdots0);
				}
			}
		}
		for (int var17 = 0; var17 < npcCount; var17++) {
			ClientNpc var18 = field1675[npcIds[var17]];
			if (var18 != null && var18.method113() && var18.field453.minimap) {
				int var19 = var18.field397 / 32 - localPlayer.field397 / 32;
				int var20 = var18.field398 / 32 - localPlayer.field398 / 32;
				method441(var20, var19, mapdots1);
			}
		}
		for (int var21 = 0; var21 < field1537; var21++) {
			ClientPlayer var22 = field1536[field1538[var21]];
			if (var22 != null && var22.method113()) {
				int var23 = var22.field397 / 32 - localPlayer.field397 / 32;
				int var24 = var22.field398 / 32 - localPlayer.field398 / 32;
				boolean var25 = false;
				long var26 = JString.toUserhash(var22.field457);
				for (int var28 = 0; var28 < field1531; var28++) {
					if (var26 == field1575[var28] && field1489[var28] != 0) {
						var25 = true;
						break;
					}
				}
				if (var25) {
					method441(var24, var23, mapdots3);
				} else {
					method441(var24, var23, mapdots2);
				}
			}
		}
		if (field1616 != 0 && loopCycle % 20 < 10) {
			if (field1616 == 1 && field1336 >= 0 && field1336 < field1675.length) {
				ClientNpc var29 = field1675[field1336];
				if (var29 != null) {
					int var30 = var29.field397 / 32 - localPlayer.field397 / 32;
					int var31 = var29.field398 / 32 - localPlayer.field398 / 32;
					method496(var30, var31, mapmarker1);
				}
			}
			if (field1616 == 2) {
				int var32 = (field1578 - field1471) * 4 + 2 - localPlayer.field397 / 32;
				int var33 = (field1579 - field1472) * 4 + 2 - localPlayer.field398 / 32;
				method496(var32, var33, mapmarker1);
			}
			if (field1616 == 10 && field1597 >= 0 && field1597 < field1536.length) {
				ClientPlayer var34 = field1536[field1597];
				if (var34 != null) {
					int var35 = var34.field397 / 32 - localPlayer.field397 / 32;
					int var36 = var34.field398 / 32 - localPlayer.field398 / 32;
					method496(var35, var36, mapmarker1);
				}
			}
		}
		if (minimapFlagX != 0) {
			int var37 = minimapFlagX * 4 + 2 - localPlayer.field397 / 32;
			int var38 = field1442 * 4 + 2 - localPlayer.field398 / 32;
			method441(var38, var37, mapmarker0);
		}
		Pix2D.fillRect(3, 16777215, 3, 97, 78);
		field1280.setPixels();
	}

	@ObfuscatedName("client.j(Z)V")
	public void movePlayers() {
		for (int var2 = -1; var2 < field1537; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = field1535;
			} else {
				var3 = field1538[var2];
			}
			ClientPlayer var4 = field1536[var3];
			if (var4 != null) {
				method544(var4, 0, 1);
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public void method513(boolean arg1) {
		if (localPlayer.field397 >> 7 == minimapFlagX && localPlayer.field398 >> 7 == field1442) {
			minimapFlagX = 0;
			field1397++;
			if (field1397 > 122) {
				field1397 = 0;
				out.p1Enc(188);
				out.p1(62);
			}
		}
		int var3 = field1537;
		if (arg1) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			ClientPlayer var5;
			int var6;
			if (arg1) {
				var5 = localPlayer;
				var6 = field1535 << 14;
			} else {
				var5 = field1536[field1538[var4]];
				var6 = field1538[var4] << 14;
			}
			if (var5 != null && var5.method113()) {
				var5.field477 = false;
				if ((lowMem && field1537 > 50 || field1537 > 200) && !arg1 && var5.field422 == var5.field402) {
					var5.field477 = true;
				}
				int var7 = var5.field397 >> 7;
				int var8 = var5.field398 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field472 == null || loopCycle < var5.field467 || loopCycle >= var5.field468) {
						if ((var5.field397 & 0x7F) == 64 && (var5.field398 & 0x7F) == 64) {
							if (field1436[var7][var8] == field1284) {
								continue;
							}
							field1436[var7][var8] = field1284;
						}
						var5.field466 = method458(var5.field397, var5.field398, field1478);
						world.addDynamic(var5.field466, var5, var5.field397, var6, var5.field398, 60, var5.field399, field1478, var5.field400);
					} else {
						var5.field477 = false;
						var5.field466 = method458(var5.field397, var5.field398, field1478);
						world.addDynamic2(var5.field476, var5.field399, var5.field475, var5.field466, var5.field473, var5.field397, field1478, var5, var5.field398, var5.field474, var6);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void method514() {
		field1387 = true;
		for (int var2 = 0; var2 < 7; var2++) {
			field1226[var2] = -1;
			for (int var3 = 0; var3 < IdkType.numDefinitions; var3++) {
				if (!IdkType.list[var3].disable && IdkType.list[var3].part == var2 + (field1398 ? 0 : 7)) {
					field1226[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public void getSpecialArea() {
		field1306 = 0;
		int var2 = (localPlayer.field397 >> 7) + field1471;
		int var3 = (localPlayer.field398 >> 7) + field1472;
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			field1306 = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			field1306 = 1;
		}
		if (field1306 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			field1306 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void method516() {
		Graphics var2 = getBaseComponent().getGraphics();
		var2.setColor(Color.black);
		var2.fillRect(0, 0, 765, 503);
		setFramerate(1);
		if (errorLoading) {
			field1322 = false;
			var2.setFont(new Font("Helvetica", 1, 16));
			var2.setColor(Color.yellow);
			byte var3 = 35;
			var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
			int var5 = var3 + 50;
			var2.setColor(Color.white);
			var2.drawString("To fix this try the following (in order):", 30, var5);
			int var6 = var5 + 50;
			var2.setColor(Color.white);
			var2.setFont(new Font("Helvetica", 1, 12));
			var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
			int var7 = var6 + 30;
			var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
			int var8 = var7 + 30;
			var2.drawString("3: Try using a different game-world", 30, var8);
			int var10 = var8 + 30;
			var2.drawString("4: Try rebooting your computer", 30, var10);
			int var12 = var10 + 30;
			var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var12);
		}
		if (errorHost) {
			field1322 = false;
			var2.setFont(new Font("Helvetica", 1, 20));
			var2.setColor(Color.white);
			var2.drawString("Error - unable to load game!", 50, 50);
			var2.drawString("To play RuneScape make sure you play from", 50, 100);
			var2.drawString("http://www.runescape.com", 50, 150);
		}
		if (!errorStarted) {
			return;
		}
		field1322 = false;
		var2.setColor(Color.yellow);
		byte var4 = 35;
		var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var4);
		int var9 = var4 + 50;
		var2.setColor(Color.white);
		var2.drawString("To fix this try the following (in order):", 30, var9);
		int var11 = var9 + 50;
		var2.setColor(Color.white);
		var2.setFont(new Font("Helvetica", 1, 12));
		var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var11);
		int var13 = var11 + 30;
		var2.drawString("2: Try rebooting your computer, and reloading", 30, var13);
		int var14 = var13 + 30;
	}

	@ObfuscatedName("client.b(IZI)V")
	public void method517(boolean arg1, int arg2) {
		signlink.midivol = arg2;
		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.b(IBLlb;)V")
	public void getPlayerPos(int arg0, Packet arg2) {
		entityRemovalCount = 0;
		field1539 = 0;
		getPlayerPosLocal(arg2, arg0);
		getPlayerPosOldVis(arg2, arg0);
		getPlayerPosNewVis(arg2, arg0);
		getPlayerPosExtended(arg2, arg0);
		for (int var4 = 0; var4 < entityRemovalCount; var4++) {
			int var5 = entityRemovalIds[var4];
			if (field1536[var5].field442 != loopCycle) {
				field1536[var5] = null;
			}
		}
		if (arg2.data != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.data + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < field1537; var6++) {
			if (field1536[field1538[var6]] == null) {
				signlink.reporterror(field1563 + " null entry in pl list - pos:" + var6 + " size:" + field1537);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.F(I)Z")
	public boolean tcpIn() {
		if (stream == null) {
			return false;
		} else {
			try {
				int var2 = stream.available();
				if (var2 == 0) {
					return false;
				}
				if (ptype == -1) {
					stream.read(in.pos, 0, 1);
					ptype = in.pos[0] & 0xFF;
					if (randomIn != null) {
						ptype = ptype - randomIn.takeNextValue() & 0xFF;
					}
					psize = Protocol.SERVERPROT_SIZE[ptype];
					var2--;
				}
				if (psize == -1) {
					if (var2 <= 0) {
						return false;
					}
					stream.read(in.pos, 0, 1);
					psize = in.pos[0] & 0xFF;
					var2--;
				}
				if (psize == -2) {
					if (var2 <= 1) {
						return false;
					}
					stream.read(in.pos, 0, 2);
					in.data = 0;
					psize = in.g2();
					var2 -= 2;
				}
				if (var2 < psize) {
					return false;
				}
				in.data = 0;
				stream.read(in.pos, 0, psize);
				timeoutTimer = 0;
				ptype2 = ptype1;
				ptype1 = ptype0;
				ptype0 = ptype;
				if (ptype == 207) {
					inMultizone = in.g1();
					ptype = -1;
					return true;
				}
				if (ptype == 241) {
					sideTab = in.g1();
					redrawSidebar = true;
					redrawSideicons = true;
					ptype = -1;
					return true;
				}
				if (ptype == 203) {
					int var3 = in.g2();
					byte var4 = in.g1b();
					field1588[var3] = var4;
					if (field1523[var3] != var4) {
						field1523[var3] = var4;
						clientVar(var3);
						redrawSidebar = true;
						if (tutComId != -1) {
							redrawChatback = true;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 115) {
					minimapFlagX = 0;
					ptype = -1;
					return true;
				}
				if (ptype == 64) {
					int var5 = in.g1();
					int var6 = in.g1();
					int var7 = in.g1();
					int var8 = in.g1();
					field1577[var5] = true;
					field1414[var5] = var6;
					field1320[var5] = var7;
					field1260[var5] = var8;
					camShakeCycle[var5] = 0;
					ptype = -1;
					return true;
				}
				if (ptype == 95 || ptype == 176 || ptype == 219 || ptype == 85 || ptype == 107 || ptype == 52 || ptype == 81 || ptype == 48 || ptype == 173 || ptype == 138) {
					zonePacket(ptype, in);
					ptype = -1;
					return true;
				}
				if (ptype == 211) {
					int var9 = in.g2();
					ifAnimReset(var9);
					if (sideModalId != -1) {
						sideModalId = -1;
						redrawSidebar = true;
						redrawSideicons = true;
					}
					if (chatComId != -1) {
						chatComId = -1;
						redrawChatback = true;
					}
					if (dialogInputOpen) {
						dialogInputOpen = false;
						redrawChatback = true;
					}
					mainModalId = var9;
					resumedPauseButton = false;
					ptype = -1;
					return true;
				}
				if (ptype == 192) {
					int var10 = in.g2();
					IfType.list[var10].model1Type = 3;
					IfType.list[var10].field118 = (localPlayer.field462[0] << 24) + (localPlayer.field462[4] << 18) + (localPlayer.field461[0] << 12) + (localPlayer.field461[8] << 6) + localPlayer.field461[11];
					ptype = -1;
					return true;
				}
				if (ptype == 210) {
					field1681 = false;
					dialogInputOpen = true;
					field1598 = "";
					redrawChatback = true;
					ptype = -1;
					return true;
				}
				if (ptype == 130) {
					int var11 = in.g2b();
					tutComId = var11;
					redrawChatback = true;
					ptype = -1;
					return true;
				}
				if (ptype == 167) {
					getPlayerPos(psize, in);
					field1665 = false;
					ptype = -1;
					return true;
				}
				if (ptype == 34) {
					int var12 = in.g2();
					int var13 = in.g1();
					int var14 = in.g2();
					if (field1496 && !lowMem && field1345 < 50) {
						field1464[field1345] = var12;
						field1220[field1345] = var13;
						field1499[field1345] = var14 + JagFX.delays[var12];
						field1345++;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 91) {
					field1386 = in.g4();
					field1426 = in.g2();
					field1445 = in.g1();
					field1303 = in.g2();
					field1516 = in.g1();
					if (field1386 != 0 && mainModalId == -1) {
						signlink.dnslookup(JString.formatIPv4(field1386));
						closeModal();
						short var15 = 650;
						if (field1445 != 201 || field1516 == 1) {
							var15 = 655;
						}
						field1367 = "";
						field1544 = false;
						for (int var16 = 0; var16 < IfType.list.length; var16++) {
							if (IfType.list[var16] != null && IfType.list[var16].clientCode == var15) {
								mainModalId = IfType.list[var16].field74;
								break;
							}
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 88) {
					logout();
					ptype = -1;
					return false;
				}
				if (ptype == 134) {
					int var17 = in.g2();
					int var18 = in.g2b();
					IfType var19 = IfType.list[var17];
					var19.modelAnim = var18;
					if (var18 == -1) {
						var19.animFrame = 0;
						var19.animCycle = 0;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 156) {
					field1616 = in.g1();
					if (field1616 == 1) {
						field1336 = in.g2();
					}
					if (field1616 >= 2 && field1616 <= 6) {
						if (field1616 == 2) {
							field1581 = 64;
							field1582 = 64;
						}
						if (field1616 == 3) {
							field1581 = 0;
							field1582 = 64;
						}
						if (field1616 == 4) {
							field1581 = 128;
							field1582 = 64;
						}
						if (field1616 == 5) {
							field1581 = 64;
							field1582 = 0;
						}
						if (field1616 == 6) {
							field1581 = 64;
							field1582 = 128;
						}
						field1616 = 2;
						field1578 = in.g2();
						field1579 = in.g2();
						field1580 = in.g1();
					}
					if (field1616 == 10) {
						field1597 = in.g2();
					}
					ptype = -1;
					return true;
				}
				if (ptype == 67) {
					if (sideTab == 12) {
						redrawSidebar = true;
					}
					runweight = in.g2b();
					ptype = -1;
					return true;
				}
				if (ptype == 3) {
					ignoreCount = psize / 8;
					for (int var20 = 0; var20 < ignoreCount; var20++) {
						ignoreUserhash[var20] = in.g8();
					}
					ptype = -1;
					return true;
				}
				if (ptype == 142) {
					int var21 = in.g2();
					int var22 = in.g2();
					IfType.list[var21].model1Type = 2;
					IfType.list[var21].field118 = var22;
					ptype = -1;
					return true;
				}
				if (ptype == 215) {
					int var23 = in.g2();
					int var24 = in.g1();
					if (var23 == 65535) {
						var23 = -1;
					}
					field1370[var24] = var23;
					redrawSidebar = true;
					redrawSideicons = true;
					ptype = -1;
					return true;
				}
				if (ptype == 153) {
					field1334 = in.g1();
					field1335 = in.g1();
					for (int var25 = field1334; var25 < field1334 + 8; var25++) {
						for (int var26 = field1335; var26 < field1335 + 8; var26++) {
							if (field1232[field1478][var25][var26] != null) {
								field1232[field1478][var25][var26] = null;
								method460(var25, var26);
							}
						}
					}
					for (LocChange var27 = (LocChange) field1644.head(); var27 != null; var27 = (LocChange) field1644.next()) {
						if (var27.field729 >= field1334 && var27.field729 < field1334 + 8 && var27.field730 >= field1335 && var27.field730 < field1335 + 8 && var27.field727 == field1478) {
							var27.field738 = 0;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 114) {
					field1383 = in.g1();
					field1388 = in.g1();
					field1221 = in.g1();
					redrawPrivacySettings = true;
					redrawChatback = true;
					ptype = -1;
					return true;
				}
				if (ptype == 158) {
					int var28 = in.g2();
					int var29 = in.g2();
					if (chatComId != -1) {
						chatComId = -1;
						redrawChatback = true;
					}
					if (dialogInputOpen) {
						dialogInputOpen = false;
						redrawChatback = true;
					}
					mainModalId = var28;
					sideModalId = var29;
					redrawSidebar = true;
					redrawSideicons = true;
					resumedPauseButton = false;
					ptype = -1;
					return true;
				}
				if (ptype == 240) {
					int var30 = in.g2b();
					if (var30 >= 0) {
						ifAnimReset(var30);
					}
					mainOverlayId = var30;
					ptype = -1;
					return true;
				}
				if (ptype == 195) {
					field1334 = in.g1();
					field1335 = in.g1();
					while (in.data < psize) {
						int var31 = in.g1();
						zonePacket(var31, in);
					}
					ptype = -1;
					return true;
				}
				if (ptype == 161) {
					String var32 = in.gjstr();
					if (var32.endsWith(":tradereq:")) {
						String var33 = var32.substring(0, var32.indexOf(":"));
						long var34 = JString.toUserhash(var33);
						boolean var36 = false;
						for (int var37 = 0; var37 < ignoreCount; var37++) {
							if (ignoreUserhash[var37] == var34) {
								var36 = true;
								break;
							}
						}
						if (!var36 && field1306 == 0) {
							method457(4, var33, "wishes to trade with you.");
						}
					} else if (var32.endsWith(":duelreq:")) {
						String var38 = var32.substring(0, var32.indexOf(":"));
						long var39 = JString.toUserhash(var38);
						boolean var41 = false;
						for (int var42 = 0; var42 < ignoreCount; var42++) {
							if (ignoreUserhash[var42] == var39) {
								var41 = true;
								break;
							}
						}
						if (!var41 && field1306 == 0) {
							method457(8, var38, "wishes to duel with you.");
						}
					} else {
						method457(0, "", var32);
					}
					ptype = -1;
					return true;
				}
				if (ptype == 101) {
					cinemaCam = false;
					for (int var43 = 0; var43 < 5; var43++) {
						field1577[var43] = false;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 16) {
					int var44 = in.g2();
					ifAnimReset(var44);
					if (chatComId != -1) {
						chatComId = -1;
						redrawChatback = true;
					}
					if (dialogInputOpen) {
						dialogInputOpen = false;
						redrawChatback = true;
					}
					sideModalId = var44;
					redrawSidebar = true;
					redrawSideicons = true;
					mainModalId = -1;
					resumedPauseButton = false;
					ptype = -1;
					return true;
				}
				if (ptype == 44) {
					int var45 = in.g2();
					String var46 = in.gjstr();
					IfType.list[var45].field109 = var46;
					if (IfType.list[var45].field74 == field1370[sideTab]) {
						redrawSidebar = true;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 245) {
					int var47 = in.g2();
					int var48 = in.g4();
					field1588[var47] = var48;
					if (field1523[var47] != var48) {
						field1523[var47] = var48;
						clientVar(var47);
						redrawSidebar = true;
						if (tutComId != -1) {
							redrawChatback = true;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 166) {
					int var49 = in.g2();
					ifAnimReset(var49);
					if (sideModalId != -1) {
						sideModalId = -1;
						redrawSidebar = true;
						redrawSideicons = true;
					}
					chatComId = var49;
					redrawChatback = true;
					mainModalId = -1;
					resumedPauseButton = false;
					ptype = -1;
					return true;
				}
				if (ptype == 28) {
					int var50 = in.g2();
					int var51 = in.g2();
					int var52 = in.g2();
					ObjType var53 = ObjType.list(var51);
					IfType.list[var50].model1Type = 4;
					IfType.list[var50].field118 = var51;
					IfType.list[var50].field124 = var53.xan2d;
					IfType.list[var50].field125 = var53.yan2d;
					IfType.list[var50].field123 = var53.zoom2d * 100 / var52;
					ptype = -1;
					return true;
				}
				if (ptype == 54) {
					int var54 = in.g2();
					int var55 = in.g2();
					IfType var56 = IfType.list[var54];
					if (var56 != null && var56.type == 0) {
						if (var55 < 0) {
							var55 = 0;
						}
						if (var55 > var56.field87 - var56.field79) {
							var55 = var56.field87 - var56.field79;
						}
						var56.field88 = var55;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 47) {
					for (int var57 = 0; var57 < field1536.length; var57++) {
						if (field1536[var57] != null) {
							field1536[var57].field425 = -1;
						}
					}
					for (int var58 = 0; var58 < field1675.length; var58++) {
						if (field1675[var58] != null) {
							field1675[var58].field425 = -1;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 194) {
					minimapState = in.g1();
					ptype = -1;
					return true;
				}
				if (ptype == 90) {
					field1589 = in.g1();
					if (field1589 == sideTab) {
						if (field1589 == 3) {
							sideTab = 1;
						} else {
							sideTab = 3;
						}
						redrawSidebar = true;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 89) {
					rebootTimer = in.g2() * 30;
					ptype = -1;
					return true;
				}
				if (ptype == 190) {
					for (int var59 = 0; var59 < field1523.length; var59++) {
						if (field1523[var59] != field1588[var59]) {
							field1523[var59] = field1588[var59];
							clientVar(var59);
							redrawSidebar = true;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 83) {
					if (sideTab == 12) {
						redrawSidebar = true;
					}
					runenergy = in.g1();
					ptype = -1;
					return true;
				}
				if (ptype == 231) {
					int var60 = in.g2();
					int var61 = in.g2();
					if (field1338 == var60 && field1339 == var61 && sceneState == 2) {
						ptype = -1;
						return true;
					}
					field1338 = var60;
					field1339 = var61;
					field1471 = (field1338 - 6) * 8;
					field1472 = (field1339 - 6) * 8;
					field1585 = false;
					if ((field1338 / 8 == 48 || field1338 / 8 == 49) && field1339 / 8 == 48) {
						field1585 = true;
					}
					if (field1338 / 8 == 48 && field1339 / 8 == 148) {
						field1585 = true;
					}
					sceneState = 1;
					field1543 = System.currentTimeMillis();
					field1280.setPixels();
					p12.centreString(257, 151, 0, "Loading - please wait.");
					p12.centreString(256, 150, 16777215, "Loading - please wait.");
					field1280.draw(4, super.graphics, 4);
					int var62 = 0;
					for (int var63 = (field1338 - 6) / 8; var63 <= (field1338 + 6) / 8; var63++) {
						for (int var64 = (field1339 - 6) / 8; var64 <= (field1339 + 6) / 8; var64++) {
							var62++;
						}
					}
					field1302 = new byte[var62][];
					field1369 = new byte[var62][];
					field1246 = new int[var62];
					field1247 = new int[var62];
					field1248 = new int[var62];
					int var65 = 0;
					for (int var66 = (field1338 - 6) / 8; var66 <= (field1338 + 6) / 8; var66++) {
						for (int var67 = (field1339 - 6) / 8; var67 <= (field1339 + 6) / 8; var67++) {
							field1246[var65] = (var66 << 8) + var67;
							if (field1585 && (var67 == 49 || var67 == 149 || var67 == 147 || var66 == 50 || var66 == 49 && var67 == 47)) {
								field1247[var65] = -1;
								field1248[var65] = -1;
								var65++;
							} else {
								int var68 = field1247[var65] = onDemand.getMapFile(0, var66, var67);
								if (var68 != -1) {
									onDemand.request(3, var68);
								}
								int var69 = field1248[var65] = onDemand.getMapFile(1, var66, var67);
								if (var69 != -1) {
									onDemand.request(3, var69);
								}
								var65++;
							}
						}
					}
					int var70 = field1471 - field1473;
					int var71 = field1472 - field1474;
					field1473 = field1471;
					field1474 = field1472;
					for (int var72 = 0; var72 < 16384; var72++) {
						ClientNpc var73 = field1675[var72];
						if (var73 != null) {
							for (int var74 = 0; var74 < 10; var74++) {
								var73.field447[var74] -= var70;
								var73.field448[var74] -= var71;
							}
							var73.field397 -= var70 * 128;
							var73.field398 -= var71 * 128;
						}
					}
					for (int var75 = 0; var75 < field1534; var75++) {
						ClientPlayer var76 = field1536[var75];
						if (var76 != null) {
							for (int var77 = 0; var77 < 10; var77++) {
								var76.field447[var77] -= var70;
								var76.field448[var77] -= var71;
							}
							var76.field397 -= var70 * 128;
							var76.field398 -= var71 * 128;
						}
					}
					field1665 = true;
					byte var78 = 0;
					byte var79 = 104;
					byte var80 = 1;
					if (var70 < 0) {
						var78 = 103;
						var79 = -1;
						var80 = -1;
					}
					byte var81 = 0;
					byte var82 = 104;
					byte var83 = 1;
					if (var71 < 0) {
						var81 = 103;
						var82 = -1;
						var83 = -1;
					}
					for (int var84 = var78; var84 != var79; var84 += var80) {
						for (int var85 = var81; var85 != var82; var85 += var83) {
							int var86 = var84 + var70;
							int var87 = var85 + var71;
							for (int var88 = 0; var88 < 4; var88++) {
								if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
									field1232[var88][var84][var85] = field1232[var88][var86][var87];
								} else {
									field1232[var88][var84][var85] = null;
								}
							}
						}
					}
					for (LocChange var89 = (LocChange) field1644.head(); var89 != null; var89 = (LocChange) field1644.next()) {
						var89.field729 -= var70;
						var89.field730 -= var71;
						if (var89.field729 < 0 || var89.field730 < 0 || var89.field729 >= 104 || var89.field730 >= 104) {
							var89.unlink();
						}
					}
					if (minimapFlagX != 0) {
						minimapFlagX -= var70;
						field1442 -= var71;
					}
					cinemaCam = false;
					ptype = -1;
					return true;
				}
				if (ptype == 171) {
					if (sideModalId != -1) {
						sideModalId = -1;
						redrawSidebar = true;
						redrawSideicons = true;
					}
					if (chatComId != -1) {
						chatComId = -1;
						redrawChatback = true;
					}
					if (dialogInputOpen) {
						dialogInputOpen = false;
						redrawChatback = true;
					}
					mainModalId = -1;
					resumedPauseButton = false;
					ptype = -1;
					return true;
				}
				if (ptype == 247) {
					long var90 = in.g8();
					int var92 = in.g1();
					String var93 = JString.toScreenName(JString.toRawUsername(var90));
					for (int var94 = 0; var94 < field1531; var94++) {
						if (var90 == field1575[var94]) {
							if (field1489[var94] != var92) {
								field1489[var94] = var92;
								redrawSidebar = true;
								if (var92 > 0) {
									method457(5, "", var93 + " has logged in.");
								}
								if (var92 == 0) {
									method457(5, "", var93 + " has logged out.");
								}
							}
							var93 = null;
							break;
						}
					}
					if (var93 != null && field1531 < 200) {
						field1575[field1531] = var90;
						field1249[field1531] = var93;
						field1489[field1531] = var92;
						field1531++;
						redrawSidebar = true;
					}
					boolean var95 = false;
					while (!var95) {
						var95 = true;
						for (int var96 = 0; var96 < field1531 - 1; var96++) {
							if (field1489[var96] != nodeId && field1489[var96 + 1] == nodeId || field1489[var96] == 0 && field1489[var96 + 1] != 0) {
								int var97 = field1489[var96];
								field1489[var96] = field1489[var96 + 1];
								field1489[var96 + 1] = var97;
								String var98 = field1249[var96];
								field1249[var96] = field1249[var96 + 1];
								field1249[var96 + 1] = var98;
								long var99 = field1575[var96];
								field1575[var96] = field1575[var96 + 1];
								field1575[var96 + 1] = var99;
								redrawSidebar = true;
								var95 = false;
							}
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 10) {
					int var101 = in.g2();
					boolean var102 = in.g1() == 1;
					IfType.list[var101].field89 = var102;
					ptype = -1;
					return true;
				}
				if (ptype == 105) {
					redrawSidebar = true;
					int var103 = in.g1();
					int var104 = in.g4();
					int var105 = in.g1();
					field1669[var103] = var104;
					field1300[var103] = var105;
					field1569[var103] = 1;
					for (int var106 = 0; var106 < 98; var106++) {
						if (var104 >= levelExperience[var106]) {
							field1569[var103] = var106 + 2;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 23) {
					int var107 = in.g2();
					if (var107 == 65535) {
						var107 = -1;
					}
					if (var107 != nextMidiSong && midiActive && !lowMem && nextMusicDelay == 0) {
						midiSong = var107;
						midiFading = true;
						onDemand.request(2, midiSong);
					}
					nextMidiSong = var107;
					ptype = -1;
					return true;
				}
				if (ptype == 15) {
					int var108 = in.g2();
					int var109 = in.g2();
					if (midiActive && !lowMem) {
						midiSong = var108;
						midiFading = false;
						onDemand.request(2, midiSong);
						nextMusicDelay = var109;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 200) {
					cinemaCam = true;
					field1285 = in.g1();
					field1286 = in.g1();
					field1287 = in.g2();
					field1288 = in.g1();
					field1289 = in.g1();
					if (field1289 >= 100) {
						field1236 = field1285 * 128 + 64;
						field1238 = field1286 * 128 + 64;
						field1237 = method458(field1236, field1238, field1478) - field1287;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 172) {
					redrawSidebar = true;
					int var110 = in.g2();
					IfType var111 = IfType.list[var110];
					while (in.data < psize) {
						int var112 = in.g1();
						int var113 = in.g2();
						int var114 = in.g1();
						if (var114 == 255) {
							var114 = in.g4();
						}
						if (var112 >= 0 && var112 < var111.linkObjType.length) {
							var111.linkObjType[var112] = var113;
							var111.linkObjNumber[var112] = var114;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 17) {
					int var115 = in.g1();
					int var116 = in.g1();
					String var117 = in.gjstr();
					if (var115 >= 1 && var115 <= 5) {
						if (var117.equalsIgnoreCase("null")) {
							var117 = null;
						}
						field1215[var115 - 1] = var117;
						field1216[var115 - 1] = var116 == 0;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 32) {
					field1334 = in.g1();
					field1335 = in.g1();
					ptype = -1;
					return true;
				}
				if (ptype == 106) {
					redrawSidebar = true;
					int var118 = in.g2();
					IfType var119 = IfType.list[var118];
					int var120 = in.g1();
					for (int var121 = 0; var121 < var120; var121++) {
						var119.linkObjType[var121] = in.g2();
						int var122 = in.g1();
						if (var122 == 255) {
							var122 = in.g4();
						}
						var119.linkObjNumber[var121] = var122;
					}
					for (int var123 = var120; var123 < var119.linkObjType.length; var123++) {
						var119.linkObjType[var123] = 0;
						var119.linkObjNumber[var123] = 0;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 133) {
					field1363 = in.g2();
					field1224 = in.g1();
					ptype = -1;
					return true;
				}
				if (ptype == 129) {
					int var124 = in.g2();
					int var125 = in.g2();
					IfType.list[var124].model1Type = 1;
					IfType.list[var124].field118 = var125;
					ptype = -1;
					return true;
				}
				if (ptype == 233) {
					cinemaCam = true;
					field1325 = in.g1();
					field1326 = in.g1();
					field1327 = in.g2();
					field1328 = in.g1();
					field1329 = in.g1();
					if (field1329 >= 100) {
						int var126 = field1325 * 128 + 64;
						int var127 = field1326 * 128 + 64;
						int var128 = method458(var126, var127, field1478) - field1327;
						int var129 = var126 - field1236;
						int var130 = var128 - field1237;
						int var131 = var127 - field1238;
						int var132 = (int) Math.sqrt((double) (var129 * var129 + var131 * var131));
						field1239 = (int) (Math.atan2((double) var130, (double) var132) * 325.949D) & 0x7FF;
						field1240 = (int) (Math.atan2((double) var129, (double) var131) * -325.949D) & 0x7FF;
						if (field1239 < 128) {
							field1239 = 128;
						}
						if (field1239 > 383) {
							field1239 = 383;
						}
					}
					ptype = -1;
					return true;
				}
				if (ptype == 227) {
					int var133 = in.g2();
					IfType var134 = IfType.list[var133];
					for (int var135 = 0; var135 < var134.linkObjType.length; var135++) {
						var134.linkObjType[var135] = -1;
						var134.linkObjType[var135] = 0;
					}
					ptype = -1;
					return true;
				}
				if (ptype == 77) {
					int var136 = in.g2();
					int var137 = in.g2b();
					int var138 = in.g2b();
					IfType var139 = IfType.list[var136];
					var139.field81 = var137;
					var139.field82 = var138;
					ptype = -1;
					return true;
				}
				if (ptype == 185) {
					field1532 = in.g1();
					redrawSidebar = true;
					ptype = -1;
					return true;
				}
				if (ptype == 197) {
					getNpcPos(0, psize, in);
					ptype = -1;
					return true;
				}
				if (ptype == 183) {
					int var140 = in.g2();
					int var141 = in.g2();
					int var142 = var141 >> 10 & 0x1F;
					int var143 = var141 >> 5 & 0x1F;
					int var144 = var141 & 0x1F;
					IfType.list[var140].field111 = (var142 << 19) + (var143 << 11) + (var144 << 3);
					ptype = -1;
					return true;
				}
				if (ptype == 235) {
					long var145 = in.g8();
					int var147 = in.g4();
					int var148 = in.g1();
					boolean var149 = false;
					for (int var150 = 0; var150 < 100; var150++) {
						if (field1484[var150] == var147) {
							var149 = true;
							break;
						}
					}
					if (var148 <= 1) {
						for (int var151 = 0; var151 < ignoreCount; var151++) {
							if (ignoreUserhash[var151] == var145) {
								var149 = true;
								break;
							}
						}
					}
					if (!var149 && field1306 == 0) {
						try {
							field1484[field1602] = var147;
							field1602 = (field1602 + 1) % 100;
							String var152 = WordPack.unpack(psize - 13, in);
							String var153 = WordFilter.filter(var152);
							if (var148 == 2 || var148 == 3) {
								method457(7, "@cr2@" + JString.toScreenName(JString.toRawUsername(var145)), var153);
							} else if (var148 == 1) {
								method457(7, "@cr1@" + JString.toScreenName(JString.toRawUsername(var145)), var153);
							} else {
								method457(3, JString.toScreenName(JString.toRawUsername(var145)), var153);
							}
						} catch (Exception var158) {
							signlink.reporterror("cde1");
						}
					}
					ptype = -1;
					return true;
				}
				signlink.reporterror("T1 - " + ptype + "," + psize + " - " + ptype1 + "," + ptype2);
				logout();
			} catch (IOException var159) {
				lostCon();
			} catch (Exception var160) {
				String var156 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (field1471 + localPlayer.field447[0]) + "," + (field1472 + localPlayer.field448[0]) + " - ";
				for (int var157 = 0; var157 < psize && var157 < 50; var157++) {
					var156 = var156 + in.pos[var157] + ",";
				}
				signlink.reporterror(var156);
				logout();
			}
			return true;
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public boolean method521(IfType arg0) {
		int var3 = arg0.clientCode;
		if (field1532 == 2) {
			if (var3 == 201) {
				redrawChatback = true;
				dialogInputOpen = false;
				field1681 = true;
				field1400 = "";
				field1467 = 1;
				field1435 = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				redrawChatback = true;
				dialogInputOpen = false;
				field1681 = true;
				field1400 = "";
				field1467 = 2;
				field1435 = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			logoutTimer = 250;
			return true;
		}
		if (var3 == 501) {
			redrawChatback = true;
			dialogInputOpen = false;
			field1681 = true;
			field1400 = "";
			field1467 = 4;
			field1435 = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			redrawChatback = true;
			dialogInputOpen = false;
			field1681 = true;
			field1400 = "";
			field1467 = 5;
			field1435 = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = field1226[var4];
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
					if (!IdkType.list[var6].disable && IdkType.list[var6].part == var4 + (field1398 ? 0 : 7)) {
						field1226[var4] = var6;
						field1387 = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = field1505[var7];
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
			field1505[var7] = var9;
			field1387 = true;
		}
		if (var3 == 324 && !field1398) {
			field1398 = true;
			method514();
		}
		if (var3 == 325 && field1398) {
			field1398 = false;
			method514();
		}
		if (var3 == 326) {
			out.p1Enc(125);
			out.p1(field1398 ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				out.p1(field1226[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				out.p1(field1505[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			field1544 = !field1544;
		}
		if (var3 >= 601 && var3 <= 612) {
			closeModal();
			if (field1367.length() > 0) {
				out.p1Enc(137);
				out.p8(JString.toUserhash(field1367));
				out.p1(var3 - 601);
				out.p1(field1544 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.G(I)V")
	public void method522() {
		field1322 = false;
		while (field1392) {
			field1322 = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
		field1679 = null;
		field1680 = null;
		field1645 = null;
		field1352 = null;
		field1353 = null;
		field1354 = null;
		field1355 = null;
		field1527 = null;
		field1528 = null;
		field1393 = null;
		field1394 = null;
		field1307 = null;
		field1308 = null;
	}

	@ObfuscatedName("client.H(I)V")
	public void method523() {
		field1506 = 0;
		for (int var2 = -1; var2 < field1537 + npcCount; var2++) {
			ClientEntity var3;
			if (var2 == -1) {
				var3 = localPlayer;
			} else if (var2 < field1537) {
				var3 = field1536[field1538[var2]];
			} else {
				var3 = field1675[npcIds[var2 - field1537]];
			}
			if (var3 != null && var3.method113()) {
				if (var2 >= field1537) {
					NpcType var7 = ((ClientNpc) var3).field453;
					if (var7.headicon >= 0 && var7.headicon < headicons.length) {
						method437(var3, var3.field443 + 15);
						if (field1415 > -1) {
							headicons[var7.headicon].plotSprite(field1415 - 12, field1416 - 30);
						}
					}
					if (field1616 == 1 && field1336 == npcIds[var2 - field1537] && loopCycle % 20 < 10) {
						method437(var3, var3.field443 + 15);
						if (field1415 > -1) {
							headicons[2].plotSprite(field1415 - 12, field1416 - 28);
						}
					}
				} else {
					int var4 = 30;
					ClientPlayer var5 = (ClientPlayer) var3;
					if (var5.headicons != 0) {
						method437(var3, var3.field443 + 15);
						if (field1415 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.headicons & 0x1 << var6) != 0) {
									headicons[var6].plotSprite(field1415 - 12, field1416 - var4);
									var4 -= 25;
								}
							}
						}
					}
					if (var2 >= 0 && field1616 == 10 && field1597 == field1538[var2]) {
						method437(var3, var3.field443 + 15);
						if (field1415 > -1) {
							headicons[7].plotSprite(field1415 - 12, field1416 - var4);
						}
					}
				}
				if (var3.field409 != null && (var2 >= field1537 || field1383 == 0 || field1383 == 3 || field1383 == 1 && method430(((ClientPlayer) var3).field457))) {
					method437(var3, var3.field443);
					if (field1415 > -1 && field1506 < field1507) {
						field1511[field1506] = b12.stringWid(var3.field409) / 2;
						field1510[field1506] = b12.height;
						field1508[field1506] = field1415;
						field1509[field1506] = field1416;
						field1512[field1506] = var3.field411;
						field1513[field1506] = var3.field412;
						field1514[field1506] = var3.field410;
						field1515[field1506++] = var3.field409;
						if (field1477 == 0 && var3.field412 == 1) {
							field1510[field1506] += 10;
							field1509[field1506] += 5;
						}
						if (field1477 == 0 && var3.field412 == 2) {
							field1511[field1506] = 60;
						}
					}
				}
				if (var3.field416 > loopCycle) {
					method437(var3, var3.field443 + 15);
					if (field1415 > -1) {
						int var8 = var3.field417 * 30 / var3.field418;
						if (var8 > 30) {
							var8 = 30;
						}
						Pix2D.fillRect(5, 65280, var8, field1415 - 15, field1416 - 3);
						Pix2D.fillRect(5, 16711680, 30 - var8, field1415 - 15 + var8, field1416 - 3);
					}
				}
				for (int var9 = 0; var9 < 4; var9++) {
					if (var3.field415[var9] > loopCycle) {
						method437(var3, var3.field443 / 2);
						if (field1415 > -1) {
							if (var9 == 1) {
								field1416 -= 20;
							}
							if (var9 == 2) {
								field1415 -= 15;
								field1416 -= 10;
							}
							if (var9 == 3) {
								field1415 += 15;
								field1416 -= 10;
							}
							hitmarks[var3.field414[var9]].plotSprite(field1415 - 12, field1416 - 12);
							p11.centreString(field1415, field1416 + 4, 0, String.valueOf(var3.field413[var9]));
							p11.centreString(field1415 - 1, field1416 + 3, 16777215, String.valueOf(var3.field413[var9]));
						}
					}
				}
			}
		}
		for (int var10 = 0; var10 < field1506; var10++) {
			int var11 = field1508[var10];
			int var12 = field1509[var10];
			int var13 = field1511[var10];
			int var14 = field1510[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field1509[var16] - field1510[var16] && var12 - var14 < field1509[var16] + 2 && var11 - var13 < field1508[var16] + field1511[var16] && var11 + var13 > field1508[var16] - field1511[var16] && field1509[var16] - field1510[var16] < var12) {
						var12 = field1509[var16] - field1510[var16];
						var15 = true;
					}
				}
			}
			field1415 = field1508[var10];
			field1416 = field1509[var10] = var12;
			String var17 = field1515[var10];
			if (field1477 == 0) {
				int var18 = 16776960;
				if (field1512[var10] < 6) {
					var18 = field1401[field1512[var10]];
				}
				if (field1512[var10] == 6) {
					var18 = field1284 % 20 < 10 ? 16711680 : 16776960;
				}
				if (field1512[var10] == 7) {
					var18 = field1284 % 20 < 10 ? 255 : 65535;
				}
				if (field1512[var10] == 8) {
					var18 = field1284 % 20 < 10 ? 45056 : 8454016;
				}
				if (field1512[var10] == 9) {
					int var19 = 150 - field1514[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 16711680;
					} else if (var19 < 100) {
						var18 = 16776960 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 65280;
					}
				}
				if (field1512[var10] == 10) {
					int var20 = 150 - field1514[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 16711680;
					} else if (var20 < 100) {
						var18 = 16711935 - (var20 - 50) * 327680;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
					}
				}
				if (field1512[var10] == 11) {
					int var21 = 150 - field1514[var10];
					if (var21 < 50) {
						var18 = 16777215 - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 65280;
					} else if (var21 < 150) {
						var18 = 16777215 - (var21 - 100) * 327680;
					}
				}
				if (field1513[var10] == 0) {
					b12.centreString(field1415, field1416 + 1, 0, var17);
					b12.centreString(field1415, field1416, var18, var17);
				}
				if (field1513[var10] == 1) {
					b12.centreStringWave(var17, field1416 + 1, field1415, 0, field1284);
					b12.centreStringWave(var17, field1416, field1415, var18, field1284);
				}
				if (field1513[var10] == 2) {
					int var22 = b12.stringWid(var17);
					int var23 = (150 - field1514[var10]) * (var22 + 100) / 150;
					Pix2D.setClipping(5, 334, field1415 + 50, field1415 - 50, 0);
					b12.drawString(field1415 + 50 - var23, var17, 0, field1416 + 1);
					b12.drawString(field1415 + 50 - var23, var17, var18, field1416);
					Pix2D.resetClipping();
				}
			} else {
				b12.centreString(field1415, field1416 + 1, 0, var17);
				b12.centreString(field1415, field1416, 16776960, var17);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public void cinemaCamera() {
		int var2 = field1285 * 128 + 64;
		int var3 = field1286 * 128 + 64;
		int var4 = method458(var2, var3, field1478) - field1287;
		if (field1236 < var2) {
			field1236 += field1288 + (var2 - field1236) * field1289 / 1000;
			if (field1236 > var2) {
				field1236 = var2;
			}
		}
		if (field1236 > var2) {
			field1236 -= field1288 + (field1236 - var2) * field1289 / 1000;
			if (field1236 < var2) {
				field1236 = var2;
			}
		}
		if (field1237 < var4) {
			field1237 += field1288 + (var4 - field1237) * field1289 / 1000;
			if (field1237 > var4) {
				field1237 = var4;
			}
		}
		if (field1237 > var4) {
			field1237 -= field1288 + (field1237 - var4) * field1289 / 1000;
			if (field1237 < var4) {
				field1237 = var4;
			}
		}
		if (field1238 < var3) {
			field1238 += field1288 + (var3 - field1238) * field1289 / 1000;
			if (field1238 > var3) {
				field1238 = var3;
			}
		}
		if (field1238 > var3) {
			field1238 -= field1288 + (field1238 - var3) * field1289 / 1000;
			if (field1238 < var3) {
				field1238 = var3;
			}
		}
		int var5 = field1325 * 128 + 64;
		int var6 = field1326 * 128 + 64;
		int var7 = method458(var5, var6, field1478) - field1327;
		int var8 = var5 - field1236;
		int var9 = var7 - field1237;
		int var10 = var6 - field1238;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (field1239 < var12) {
			field1239 += field1328 + (var12 - field1239) * field1329 / 1000;
			if (field1239 > var12) {
				field1239 = var12;
			}
		}
		if (field1239 > var12) {
			field1239 -= field1328 + (field1239 - var12) * field1329 / 1000;
			if (field1239 < var12) {
				field1239 = var12;
			}
		}
		int var14 = var13 - field1240;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 > 0) {
			field1240 += field1328 + var14 * field1329 / 1000;
			field1240 &= 0x7FF;
		}
		if (var14 < 0) {
			field1240 -= field1328 + -var14 * field1329 / 1000;
			field1240 &= 0x7FF;
		}
		int var15 = var13 - field1240;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
			field1240 = var13;
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void timeoutChat() {
		for (int var2 = -1; var2 < field1537; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = field1535;
			} else {
				var3 = field1538[var2];
			}
			ClientPlayer var4 = field1536[var3];
			if (var4 != null && var4.field410 > 0) {
				var4.field410--;
				if (var4.field410 == 0) {
					var4.field409 = null;
				}
			}
		}
		for (int var5 = 0; var5 < npcCount; var5++) {
			int var6 = npcIds[var5];
			ClientNpc var7 = field1675[var6];
			if (var7 != null && var7.field410 > 0) {
				var7.field410--;
				if (var7.field410 == 0) {
					var7.field409 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public void method526() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field1382);
		if (onDemand != null) {
			System.out.println("Od-cycle:" + onDemand.cycle);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + field1258);
		System.out.println("ptype:" + ptype);
		System.out.println("psize:" + psize);
		if (stream != null) {
			stream.method43();
		}
		super.debug = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	@Override
	public Component getBaseComponent() {
		if (signlink.mainapp == null) {
			// return super.frame == null ? this : super.frame;
			return this;
		} else {
			return signlink.mainapp;
		}
	}

	@ObfuscatedName("client.a(Llb;IB)V")
	public void getPlayerPosLocal(Packet arg0, int arg1) {
		arg0.gBitStart();
		int var4 = arg0.gBit(1);
		if (var4 == 0) {
			return;
		}
		int var5 = arg0.gBit(2);
		if (var5 == 0) {
			field1540[field1539++] = field1535;
		} else if (var5 == 1) {
			int var6 = arg0.gBit(3);
			localPlayer.method111(true, var6, false);
			int var7 = arg0.gBit(1);
			if (var7 == 1) {
				field1540[field1539++] = field1535;
			}
		} else if (var5 == 2) {
			int var8 = arg0.gBit(3);
			localPlayer.method111(true, var8, true);
			int var9 = arg0.gBit(3);
			localPlayer.method111(true, var9, true);
			int var10 = arg0.gBit(1);
			if (var10 == 1) {
				field1540[field1539++] = field1535;
			}
		} else if (var5 == 3) {
			field1478 = arg0.gBit(2);
			int var11 = arg0.gBit(7);
			int var12 = arg0.gBit(7);
			int var13 = arg0.gBit(1);
			localPlayer.method110(var11, var13 == 1, false, var12);
			int var14 = arg0.gBit(1);
			if (var14 == 1) {
				field1540[field1539++] = field1535;
			}
		}
	}

	@ObfuscatedName("client.K(I)I")
	public int method528() {
		int var2 = 3;
		if (field1239 < 310) {
			int var3 = field1236 >> 7;
			int var4 = field1238 >> 7;
			int var5 = localPlayer.field397 >> 7;
			int var6 = localPlayer.field398 >> 7;
			if ((mapl[field1478][var3][var4] & 0x4) != 0) {
				var2 = field1478;
			}
			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}
			int var8;
			if (var6 > var4) {
				var8 = var6 - var4;
			} else {
				var8 = var4 - var6;
			}
			if (var7 > var8) {
				int var9 = var8 * 65536 / var7;
				int var10 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}
					if ((mapl[field1478][var3][var4] & 0x4) != 0) {
						var2 = field1478;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}
						if ((mapl[field1478][var3][var4] & 0x4) != 0) {
							var2 = field1478;
						}
					}
				}
			} else {
				int var11 = var7 * 65536 / var8;
				int var12 = 32768;
				while (var4 != var6) {
					if (var4 < var6) {
						var4++;
					} else if (var4 > var6) {
						var4--;
					}
					if ((mapl[field1478][var3][var4] & 0x4) != 0) {
						var2 = field1478;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((mapl[field1478][var3][var4] & 0x4) != 0) {
							var2 = field1478;
						}
					}
				}
			}
		}
		if ((mapl[field1478][localPlayer.field397 >> 7][localPlayer.field398 >> 7] & 0x4) != 0) {
			var2 = field1478;
		}
		return var2;
	}

	@ObfuscatedName("client.L(I)I")
	public int method529() {
		int var2 = method458(field1236, field1238, field1478);
		return var2 - field1237 >= 800 || (mapl[field1478][field1236 >> 7][field1238 >> 7] & 0x4) == 0 ? 3 : field1478;
	}

	@ObfuscatedName("client.M(I)V")
	public void gameLoop() {
		if (rebootTimer > 1) {
			rebootTimer--;
		}
		if (logoutTimer > 0) {
			logoutTimer--;
		}
		for (int var2 = 0; var2 < 5 && tcpIn(); var2++) {
		}
		if (!ingame) {
			return;
		}
		Object var3 = mouseTracking.lock;
		synchronized (mouseTracking.lock) {
			if (!mouseTracked) {
				mouseTracking.length = 0;
			} else if (super.mouseClickButton != 0 || mouseTracking.length >= 40) {
				out.p1Enc(222);
				out.p1(0);
				int var4 = out.data;
				int var5 = 0;
				for (int var6 = 0; var6 < mouseTracking.length && var4 - out.data < 240; var6++) {
					var5++;
					int var7 = mouseTracking.y[var6];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 502) {
						var7 = 502;
					}
					int var8 = mouseTracking.x[var6];
					if (var8 < 0) {
						var8 = 0;
					} else if (var8 > 764) {
						var8 = 764;
					}
					int var9 = var7 * 765 + var8;
					if (mouseTracking.y[var6] == -1 && mouseTracking.x[var6] == -1) {
						var8 = -1;
						var7 = -1;
						var9 = 524287;
					}
					if (var8 != mouseTrackedX || var7 != mouseTrackedY) {
						int var10 = var8 - mouseTrackedX;
						mouseTrackedX = var8;
						int var11 = var7 - mouseTrackedY;
						mouseTrackedY = var7;
						if (mouseTrackedDelta < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
							var10 += 32;
							var11 += 32;
							out.p2((mouseTrackedDelta << 12) + (var10 << 6) + var11);
							mouseTrackedDelta = 0;
						} else if (mouseTrackedDelta < 8) {
							out.p3((mouseTrackedDelta << 19) + var9 + 8388608);
							mouseTrackedDelta = 0;
						} else {
							out.p4((mouseTrackedDelta << 19) + var9 - 1073741824);
							mouseTrackedDelta = 0;
						}
					} else if (mouseTrackedDelta < 2047) {
						mouseTrackedDelta++;
					}
				}
				out.psize1(out.data - var4);
				if (var5 >= mouseTracking.length) {
					mouseTracking.length = 0;
				} else {
					mouseTracking.length -= var5;
					for (int var12 = 0; var12 < mouseTracking.length; var12++) {
						mouseTracking.x[var12] = mouseTracking.x[var12 + var5];
						mouseTracking.y[var12] = mouseTracking.y[var12 + var5];
					}
				}
			}
		}
		if (super.mouseClickButton != 0) {
			long var13 = (super.mouseClickTime - prevMouseClickTime) / 50L;
			if (var13 > 4095L) {
				var13 = 4095L;
			}
			prevMouseClickTime = super.mouseClickTime;
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
			out.p1Enc(20);
			out.p4((var19 << 20) + (var18 << 19) + var17);
		}
		if (sendCameraDelay > 0) {
			sendCameraDelay--;
		}
		if (super.keyHeld[1] == 1 || super.keyHeld[2] == 1 || super.keyHeld[3] == 1 || super.keyHeld[4] == 1) {
			sendCamera = true;
		}
		if (sendCamera && sendCameraDelay <= 0) {
			sendCameraDelay = 20;
			sendCamera = false;
			out.p1Enc(53);
			out.p2(orbitCameraPitch);
			out.p2(orbitCameraYaw);
		}
		if (super.focus && !focusIn) {
			focusIn = true;
			out.p1Enc(73);
			out.p1(1);
		}
		if (!super.focus && focusIn) {
			focusIn = false;
			out.p1Enc(73);
			out.p1(0);
		}
		checkMinimap();
		locChangeDoQueue();
		soundsDoQueue();
		timeoutTimer++;
		if (timeoutTimer > 750) {
			lostCon();
		}
		movePlayers();
		moveNpcs();
		timeoutChat();
		worldUpdateNum++;
		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		if (selectedArea != 0) {
			selectedCycle++;
			if (selectedCycle >= 15) {
				if (selectedArea == 2) {
					redrawSidebar = true;
				}
				if (selectedArea == 3) {
					redrawChatback = true;
				}
				selectedArea = 0;
			}
		}
		if (objDragArea != 0) {
			objDragCycles++;
			if (super.mouseX > objGrabX + 5 || super.mouseX < objGrabX - 5 || super.mouseY > objGrabY + 5 || super.mouseY < objGrabY - 5) {
				objGrabThreshold = true;
			}
			if (super.mouseButton == 0) {
				if (objDragArea == 2) {
					redrawSidebar = true;
				}
				if (objDragArea == 3) {
					redrawChatback = true;
				}
				objDragArea = 0;
				if (objGrabThreshold && objDragCycles >= 5) {
					hoveredSlotComId = -1;
					buildMinimenu();
					if (hoveredSlotComId == objDragComId && hoveredSlot != objDragSlot) {
						IfType var20 = IfType.list[objDragComId];
						byte var21 = 0;
						if (bankArrangeMode == 1 && var20.clientCode == 206) {
							var21 = 1;
						}
						if (var20.linkObjType[hoveredSlot] <= 0) {
							var21 = 0;
						}
						if (var20.objReplace) {
							int var22 = objDragSlot;
							int var23 = hoveredSlot;
							var20.linkObjType[var23] = var20.linkObjType[var22];
							var20.linkObjNumber[var23] = var20.linkObjNumber[var22];
							var20.linkObjType[var22] = -1;
							var20.linkObjNumber[var22] = 0;
						} else if (var21 == 1) {
							int var24 = objDragSlot;
							int var25 = hoveredSlot;
							while (var24 != var25) {
								if (var24 > var25) {
									var20.swapSlots(var24, var24 - 1);
									var24--;
								} else if (var24 < var25) {
									var20.swapSlots(var24, var24 + 1);
									var24++;
								}
							}
						} else {
							var20.swapSlots(objDragSlot, hoveredSlot);
						}
						out.p1Enc(93);
						out.p2(objDragComId);
						out.p2(objDragSlot);
						out.p2(hoveredSlot);
						out.p1(var21);
					}
				} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					openMenu();
				} else if (menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}
				selectedCycle = 10;
				super.mouseClickButton = 0;
			}
		}
		cyclelogic7++;
		if (cyclelogic7 > 62) {
			cyclelogic7 = 0;
			out.p1Enc(89);
		}
		if (World.groundX != -1) {
			int var26 = World.groundX;
			int var27 = World.groundZ;
			boolean var28 = tryMove(localPlayer.field448[0], var26, 0, 0, 0, localPlayer.field447[0], 0, true, 0, var27, 0);
			World.groundX = -1;
			if (var28) {
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 1;
				crossCycle = 0;
			}
		}
		if (super.mouseClickButton == 1 && tutComMessage != null) {
			tutComMessage = null;
			redrawChatback = true;
			super.mouseClickButton = 0;
		}
		mouseLoop();
		minimapLoop();
		tabLoop();
		chatModeLoop();
		if (super.mouseButton == 1 || super.mouseClickButton == 1) {
			scrollCycle++;
		}
		if (sceneState == 2) {
			followCamera();
		}
		if (sceneState == 2 && cinemaCam) {
			cinemaCamera();
		}
		for (int var29 = 0; var29 < 5; var29++) {
			int var10002 = camShakeCycle[var29]++;
		}
		handleInputKey();
		super.idleTimer++;
		if (super.idleTimer > 4500) {
			logoutTimer = 250;
			super.idleTimer -= 500;
			out.p1Enc(209);
		}
		macroCameraCycle++;
		if (macroCameraCycle > 500) {
			macroCameraCycle = 0;
			int var30 = (int) (Math.random() * 8.0D);
			if ((var30 & 0x1) == 1) {
				field1662 += field1663;
			}
			if ((var30 & 0x2) == 2) {
				field1250 += field1251;
			}
			if ((var30 & 0x4) == 4) {
				field1304 += field1305;
			}
		}
		if (field1662 < -50) {
			field1663 = 2;
		}
		if (field1662 > 50) {
			field1663 = -2;
		}
		if (field1250 < -55) {
			field1251 = 2;
		}
		if (field1250 > 55) {
			field1251 = -2;
		}
		if (field1304 < -40) {
			field1305 = 1;
		}
		if (field1304 > 40) {
			field1305 = -1;
		}
		macroMinimapCycle++;
		if (macroMinimapCycle > 500) {
			macroMinimapCycle = 0;
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x1) == 1) {
				field1633 += field1634;
			}
			if ((var31 & 0x2) == 2) {
				field1586 += field1587;
			}
		}
		if (field1633 < -60) {
			field1634 = 2;
		}
		if (field1633 > 60) {
			field1634 = -2;
		}
		if (field1586 < -20) {
			field1587 = 1;
		}
		if (field1586 > 10) {
			field1587 = -1;
		}
		noTimeoutTimer++;
		if (noTimeoutTimer > 50) {
			out.p1Enc(120);
		}
		try {
			if (stream != null && out.data > 0) {
				stream.write(out.data, out.pos, 0);
				out.data = 0;
				noTimeoutTimer = 0;
			}
		} catch (IOException var33) {
			lostCon();
		} catch (Exception var34) {
			logout();
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public void delIgnore(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < ignoreCount; var4++) {
			if (ignoreUserhash[var4] == arg1) {
				ignoreCount--;
				redrawSidebar = true;
				for (int var5 = var4; var5 < ignoreCount; var5++) {
					ignoreUserhash[var5] = ignoreUserhash[var5 + 1];
				}
				out.p1Enc(101);
				out.p8(arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public int method532(int arg0, int arg1, int arg3) {
		int var5 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.N(I)V")
	public void clearCaches() {
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
		if (field1616 == 2) {
			method438((field1578 - field1471 << 7) + field1581, (field1579 - field1472 << 7) + field1582, field1580 * 2);
			if (field1415 > -1 && loopCycle % 20 < 10) {
				headicons[2].plotSprite(field1415 - 12, field1416 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILd;IIB)V")
	public void drawInterface(int arg0, IfType arg1, int arg2, int arg3) {
		if (arg1.type != 0 || arg1.children == null || arg1.field89 && field1664 != arg1.id && field1432 != arg1.id && field1482 != arg1.id) {
			return;
		}
		int var6 = Pix2D.clipMinX;
		int var7 = Pix2D.clipMinY;
		int var8 = Pix2D.clipMaxX;
		int var9 = Pix2D.clipMaxY;
		Pix2D.setClipping(5, arg2 + arg1.field79, arg0 + arg1.field78, arg0, arg2);
		int var10 = arg1.children.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg1.field91[var11] + arg0;
			int var13 = arg1.field92[var11] + arg2 - arg3;
			IfType var14 = IfType.list[arg1.children[var11]];
			int var15 = var12 + var14.field81;
			int var16 = var13 + var14.field82;
			if (var14.clientCode > 0) {
				method443(var14);
			}
			if (var14.type == 0) {
				if (var14.field88 > var14.field87 - var14.field79) {
					var14.field88 = var14.field87 - var14.field79;
				}
				if (var14.field88 < 0) {
					var14.field88 = 0;
				}
				drawInterface(var15, var14, var16, var14.field88);
				if (var14.field87 > var14.field79) {
					method464(var14.field88, var16, var14.field87, (byte) 123, var15 + var14.field78, var14.field79);
				}
			} else if (var14.type != 1) {
				if (var14.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.field79; var18++) {
						for (int var19 = 0; var19 < var14.field78; var19++) {
							int var20 = var15 + var19 * (var14.field99 + 32);
							int var21 = var16 + var18 * (var14.field100 + 32);
							if (var17 < 20) {
								var20 += var14.field102[var17];
								var21 += var14.field103[var17];
							}
							if (var14.linkObjType[var17] > 0) {
								int var22 = 0;
								int var23 = 0;
								int var24 = var14.linkObjType[var17] - 1;
								if (var20 > Pix2D.clipMinX - 32 && var20 < Pix2D.clipMaxX && var21 > Pix2D.clipMinY - 32 && var21 < Pix2D.clipMaxY || objDragArea != 0 && objDragSlot == var17) {
									int var25 = 0;
									if (field1227 == 1 && field1228 == var17 && field1229 == var14.id) {
										var25 = 16777215;
									}
									Pix32 var26 = ObjType.getSprite(var24, var25, 45926, var14.linkObjNumber[var17]);
									if (var26 != null) {
										if (objDragArea != 0 && objDragSlot == var17 && objDragComId == var14.id) {
											var22 = super.mouseX - objGrabX;
											var23 = super.mouseY - objGrabY;
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (var23 < 5 && var23 > -5) {
												var23 = 0;
											}
											if (objDragCycles < 5) {
												var22 = 0;
												var23 = 0;
											}
											var26.transPlotSprite(var21 + var23, var20 + var22, 128);
											if (var21 + var23 < Pix2D.clipMinY && arg1.field88 > 0) {
												int var27 = worldUpdateNum * (Pix2D.clipMinY - var21 - var23) / 3;
												if (var27 > worldUpdateNum * 10) {
													var27 = worldUpdateNum * 10;
												}
												if (var27 > arg1.field88) {
													var27 = arg1.field88;
												}
												arg1.field88 -= var27;
												objGrabY += var27;
											}
											if (var21 + var23 + 32 > Pix2D.clipMaxY && arg1.field88 < arg1.field87 - arg1.field79) {
												int var28 = worldUpdateNum * (var21 + var23 + 32 - Pix2D.clipMaxY) / 3;
												if (var28 > worldUpdateNum * 10) {
													var28 = worldUpdateNum * 10;
												}
												if (var28 > arg1.field87 - arg1.field79 - arg1.field88) {
													var28 = arg1.field87 - arg1.field79 - arg1.field88;
												}
												arg1.field88 += var28;
												objGrabY -= var28;
											}
										} else if (selectedArea != 0 && field1265 == var17 && field1264 == var14.id) {
											var26.transPlotSprite(var21, var20, 128);
										} else {
											var26.plotSprite(var20, var21);
										}
										if (var26.owi == 33 || var14.linkObjNumber[var17] != 1) {
											int var29 = var14.linkObjNumber[var17];
											p11.drawString(var20 + var22 + 1, invNumber(var29), 0, var21 + var23 + 10);
											p11.drawString(var20 + var22, invNumber(var29), 16776960, var21 + var23 + 9);
										}
									}
								}
							} else if (var14.field101 != null && var17 < 20) {
								Pix32 var30 = var14.field101[var17];
								if (var30 != null) {
									var30.plotSprite(var20, var21);
								}
							}
							var17++;
						}
					}
				} else if (var14.type == 3) {
					boolean var31 = false;
					if (field1482 == var14.id || field1432 == var14.id || field1664 == var14.id) {
						var31 = true;
					}
					int var32;
					if (getIfActive(var14)) {
						var32 = var14.field112;
						if (var31 && var14.field114 != 0) {
							var32 = var14.field114;
						}
					} else {
						var32 = var14.field111;
						if (var31 && var14.field113 != 0) {
							var32 = var14.field113;
						}
					}
					if (var14.field80 == 0) {
						if (var14.field105) {
							Pix2D.fillRect(var14.field79, var32, var14.field78, var15, var16);
						} else {
							Pix2D.drawRect(var14.field78, var32, var14.field79, var15, var16);
						}
					} else if (var14.field105) {
						Pix2D.fillRectTrans(var14.field78, var14.field79, var16, var32, var15, 256 - (var14.field80 & 0xFF));
					} else {
						Pix2D.drawRectTrans(var14.field78, var16, var15, var32, var14.field79, 256 - (var14.field80 & 0xFF));
					}
				} else if (var14.type == 4) {
					PixFont var33 = var14.field108;
					String var34 = var14.field109;
					boolean var35 = false;
					if (field1482 == var14.id || field1432 == var14.id || field1664 == var14.id) {
						var35 = true;
					}
					int var36;
					if (getIfActive(var14)) {
						var36 = var14.field112;
						if (var35 && var14.field114 != 0) {
							var36 = var14.field114;
						}
						if (var14.field110.length() > 0) {
							var34 = var14.field110;
						}
					} else {
						var36 = var14.field111;
						if (var35 && var14.field113 != 0) {
							var36 = var14.field113;
						}
					}
					if (var14.field76 == 6 && resumedPauseButton) {
						var34 = "Please wait...";
						var36 = var14.field111;
					}
					if (Pix2D.width == 479) {
						if (var36 == 16776960) {
							var36 = 255;
						}
						if (var36 == 49152) {
							var36 = 16777215;
						}
					}
					int var37 = var16 + var33.height;
					while (var34.length() > 0) {
						if (var34.indexOf("%") != -1) {
							label348: while (true) {
								int var38 = var34.indexOf("%1");
								if (var38 == -1) {
									while (true) {
										int var39 = var34.indexOf("%2");
										if (var39 == -1) {
											while (true) {
												int var40 = var34.indexOf("%3");
												if (var40 == -1) {
													while (true) {
														int var41 = var34.indexOf("%4");
														if (var41 == -1) {
															while (true) {
																int var42 = var34.indexOf("%5");
																if (var42 == -1) {
																	break label348;
																}
																var34 = var34.substring(0, var42) + method434(method442(var14, 4)) + var34.substring(var42 + 2);
															}
														}
														var34 = var34.substring(0, var41) + method434(method442(var14, 3)) + var34.substring(var41 + 2);
													}
												}
												var34 = var34.substring(0, var40) + method434(method442(var14, 2)) + var34.substring(var40 + 2);
											}
										}
										var34 = var34.substring(0, var39) + method434(method442(var14, 1)) + var34.substring(var39 + 2);
									}
								}
								var34 = var34.substring(0, var38) + method434(method442(var14, 0)) + var34.substring(var38 + 2);
							}
						}
						int var43 = var34.indexOf("\\n");
						String var44;
						if (var43 == -1) {
							var44 = var34;
							var34 = "";
						} else {
							var44 = var34.substring(0, var43);
							var34 = var34.substring(var43 + 2);
						}
						if (var14.field106) {
							var33.centreStringTag(var15 + var14.field78 / 2, var37, var44, var36, var14.field107);
						} else {
							var33.drawStringTag(var44, var14.field107, var37, var15, var36);
						}
						var37 += var33.height;
					}
				} else if (var14.type == 5) {
					Pix32 var45;
					if (getIfActive(var14)) {
						var45 = var14.field116;
					} else {
						var45 = var14.field115;
					}
					if (var45 != null) {
						var45.plotSprite(var15, var16);
					}
				} else if (var14.type == 6) {
					int var46 = Pix3D.originX;
					int var47 = Pix3D.originY;
					Pix3D.originX = var15 + var14.field78 / 2;
					Pix3D.originY = var16 + var14.field79 / 2;
					int var48 = Pix3D.sinTable[var14.field124] * var14.field123 >> 16;
					int var49 = Pix3D.cosTable[var14.field124] * var14.field123 >> 16;
					boolean var50 = getIfActive(var14);
					int var51;
					if (var50) {
						var51 = var14.modelAnim2;
					} else {
						var51 = var14.modelAnim;
					}
					Model var52;
					if (var51 == -1) {
						var52 = var14.method34(-1, -1, var50);
					} else {
						SeqType var53 = SeqType.list[var51];
						var52 = var14.method34(var53.frames[var14.animFrame], var53.iframes[var14.animFrame], var50);
					}
					if (var52 != null) {
						var52.objRender(0, var14.field125, 0, var14.field124, 0, var48, var49);
					}
					Pix3D.originX = var46;
					Pix3D.originY = var47;
				} else if (var14.type == 7) {
					PixFont var54 = var14.field108;
					int var55 = 0;
					for (int var56 = 0; var56 < var14.field79; var56++) {
						for (int var57 = 0; var57 < var14.field78; var57++) {
							if (var14.linkObjType[var55] > 0) {
								ObjType var58 = ObjType.list(var14.linkObjType[var55] - 1);
								String var59 = var58.name;
								if (var58.stackable || var14.linkObjNumber[var55] != 1) {
									var59 = var59 + " x" + niceNumber(var14.linkObjNumber[var55]);
								}
								int var60 = var15 + var57 * (var14.field99 + 115);
								int var61 = var16 + var56 * (var14.field100 + 12);
								if (var14.field106) {
									var54.centreStringTag(var60 + var14.field78 / 2, var61, var59, var14.field111, var14.field107);
								} else {
									var54.drawStringTag(var59, var14.field107, var61, var60, var14.field111);
								}
							}
							var55++;
						}
					}
				}
			}
		}
		Pix2D.setClipping(5, var9, var8, var6, var7);
	}

	@ObfuscatedName("client.P(I)V")
	public void method536() {
		short var2 = 256;
		if (field1410 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field1410 > 768) {
					field1352[var3] = method532(field1353[var3], 1024 - field1410, field1354[var3]);
				} else if (field1410 > 256) {
					field1352[var3] = field1354[var3];
				} else {
					field1352[var3] = method532(field1354[var3], 256 - field1410, field1353[var3]);
				}
			}
		} else if (field1411 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (field1411 > 768) {
					field1352[var4] = method532(field1353[var4], 1024 - field1411, field1355[var4]);
				} else if (field1411 > 256) {
					field1352[var4] = field1355[var4];
				} else {
					field1352[var4] = method532(field1355[var4], 256 - field1411, field1353[var4]);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				field1352[var5] = field1353[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			field1458.data[var6] = field1307.data[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var10 = field1319[var9] * (var2 - var9) / var2;
			int var11 = var10 + 22;
			if (var11 < 0) {
				var11 = 0;
			}
			var7 += var11;
			for (int var12 = var11; var12 < 128; var12++) {
				int var13 = field1393[var7++];
				if (var13 == 0) {
					var8++;
				} else {
					int var15 = 256 - var13;
					int var16 = field1352[var13];
					int var17 = field1458.data[var8];
					field1458.data[var8++] = ((var16 & 0xFF00FF) * var13 + (var17 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 + (var17 & 0xFF00) * var15 & 0xFF0000) >> 8;
				}
			}
			var8 += var11;
		}
		field1458.draw(0, super.graphics, 0);
		for (int var18 = 0; var18 < 33920; var18++) {
			field1459.data[var18] = field1308.data[var18];
		}
		int var19 = 0;
		int var20 = 1176;
		for (int var21 = 1; var21 < var2 - 1; var21++) {
			int var22 = field1319[var21] * (var2 - var21) / var2;
			int var23 = 103 - var22;
			int var24 = var20 + var22;
			for (int var25 = 0; var25 < var23; var25++) {
				int var26 = field1393[var19++];
				if (var26 == 0) {
					var24++;
				} else {
					int var28 = 256 - var26;
					int var29 = field1352[var26];
					int var30 = field1459.data[var24];
					field1459.data[var24++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var19 += 128 - var23;
			var20 = var24 + 128 - var23 - var22;
		}
		field1459.draw(637, super.graphics, 0);
	}

	@ObfuscatedName("client.l(Z)V")
	public void followCamera() {
		try {
			int var2 = localPlayer.field397 + field1662;
			int var3 = localPlayer.field398 + field1250;
			if (field1437 - var2 < -500 || field1437 - var2 > 500 || field1438 - var3 < -500 || field1438 - var3 > 500) {
				field1437 = var2;
				field1438 = var3;
			}
			if (field1437 != var2) {
				field1437 += (var2 - field1437) / 16;
			}
			if (field1438 != var3) {
				field1438 += (var3 - field1438) / 16;
			}
			if (super.keyHeld[1] == 1) {
				field1623 += (-field1623 - 24) / 2;
			} else if (super.keyHeld[2] == 1) {
				field1623 += (24 - field1623) / 2;
			} else {
				field1623 /= 2;
			}
			if (super.keyHeld[3] == 1) {
				field1624 += (12 - field1624) / 2;
			} else if (super.keyHeld[4] == 1) {
				field1624 += (-field1624 - 12) / 2;
			} else {
				field1624 /= 2;
			}
			orbitCameraYaw = orbitCameraYaw + field1623 / 2 & 0x7FF;
			orbitCameraPitch += field1624 / 2;
			if (orbitCameraPitch < 128) {
				orbitCameraPitch = 128;
			}
			if (orbitCameraPitch > 383) {
				orbitCameraPitch = 383;
			}
			int var4 = field1437 >> 7;
			int var5 = field1438 >> 7;
			int var6 = method458(field1437, field1438, field1478);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = field1478;
						if (var10 < 3 && (mapl[1][var8][var9] & 0x2) == 2) {
							var10++;
						}
						int var11 = var6 - groundh[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}
			int var12 = var7 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}
			if (var12 < 32768) {
				var12 = 32768;
			}
			if (var12 > field1488) {
				field1488 += (var12 - field1488) / 24;
			} else if (var12 < field1488) {
				field1488 += (var12 - field1488) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + localPlayer.field397 + "," + localPlayer.field398 + "," + field1437 + "," + field1438 + "," + field1338 + "," + field1339 + "," + field1471 + "," + field1472);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public void minimapLoop() {
		if (minimapState != 0 || super.mouseClickButton != 1) {
			return;
		}
		int var2 = super.mouseClickX - 25 - 550;
		int var3 = super.mouseClickY - 5 - 4;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = orbitCameraYaw + field1633 & 0x7FF;
		int var5 = Pix3D.sinTable[var4];
		int var6 = Pix3D.cosTable[var4];
		int var7 = var5 * (field1586 + 256) >> 8;
		int var8 = var6 * (field1586 + 256) >> 8;
		int var9 = var3 * var7 + var2 * var8 >> 11;
		int var10 = var3 * var8 - var2 * var7 >> 11;
		int var11 = localPlayer.field397 + var9 >> 7;
		int var12 = localPlayer.field398 - var10 >> 7;
		boolean var13 = tryMove(localPlayer.field448[0], var11, 0, 0, 0, localPlayer.field447[0], 0, true, 0, var12, 1);
		if (!var13) {
			return;
		}
		out.p1(var2);
		out.p1(var3);
		out.p2(orbitCameraYaw);
		out.p1(57);
		out.p1(field1633);
		out.p1(field1586);
		out.p1(89);
		out.p2(localPlayer.field397);
		out.p2(localPlayer.field398);
		out.p1(field1422);
		out.p1(63);
		return;
	}

	@ObfuscatedName("client.j(B)V")
	public void handleInputKey() {
		field1454++;
		if (field1454 > 192) {
			field1454 = 0;
			out.p1Enc(230);
			out.p1(232);
		}
		while (true) {
			int var2;
			do {
				while (true) {
					var2 = pollKey();
					if (var2 == -1) {
						return;
					}
					if (mainModalId != -1 && mainModalId == field1497) {
						if (var2 == 8 && field1367.length() > 0) {
							field1367 = field1367.substring(0, field1367.length() - 1);
						}
						break;
					}
					if (field1681) {
						if (var2 >= 32 && var2 <= 122 && field1400.length() < 80) {
							field1400 = field1400 + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && field1400.length() > 0) {
							field1400 = field1400.substring(0, field1400.length() - 1);
							redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							field1681 = false;
							redrawChatback = true;
							if (field1467 == 1) {
								long var3 = JString.toUserhash(field1400);
								addFriend(var3);
							}
							if (field1467 == 2 && field1531 > 0) {
								long var5 = JString.toUserhash(field1400);
								delFriend(0, var5);
							}
							if (field1467 == 3 && field1400.length() > 0) {
								out.p1Enc(139);
								out.p1(0);
								int var7 = out.data;
								out.p8(field1283);
								WordPack.pack(field1400, out);
								out.psize1(out.data - var7);
								field1400 = JString.toSentenceCase(field1400);
								field1400 = WordFilter.filter(field1400);
								method457(6, JString.toScreenName(JString.toRawUsername(field1283)), field1400);
								if (field1388 == 2) {
									field1388 = 1;
									redrawPrivacySettings = true;
									out.p1Enc(154);
									out.p1(field1383);
									out.p1(field1388);
									out.p1(field1221);
								}
							}
							if (field1467 == 4 && ignoreCount < 100) {
								long var8 = JString.toUserhash(field1400);
								addIgnore(var8);
							}
							if (field1467 == 5 && ignoreCount > 0) {
								long var10 = JString.toUserhash(field1400);
								delIgnore(var10);
							}
						}
					} else if (dialogInputOpen) {
						if (var2 >= 48 && var2 <= 57 && field1598.length() < 10) {
							field1598 = field1598 + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && field1598.length() > 0) {
							field1598 = field1598.substring(0, field1598.length() - 1);
							redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							if (field1598.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(field1598);
								} catch (Exception var17) {
								}
								out.p1Enc(102);
								out.p4(var12);
							}
							dialogInputOpen = false;
							redrawChatback = true;
						}
					} else if (chatComId == -1) {
						if (var2 >= 32 && var2 <= 122 && field1425.length() < 80) {
							field1425 = field1425 + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && field1425.length() > 0) {
							field1425 = field1425.substring(0, field1425.length() - 1);
							redrawChatback = true;
						}
						if ((var2 == 13 || var2 == 10) && field1425.length() > 0) {
							if (field1282 == 2) {
								if (field1425.equals("::clientdrop")) {
									lostCon();
								}
								if (field1425.equals("::lag")) {
									method526();
								}
								if (field1425.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < onDemand.getFileCount(2); var13++) {
										onDemand.prefetchPriority(var13, 2, (byte) 1);
									}
								}
							}
							if (field1425.startsWith("::")) {
								out.p1Enc(224);
								out.p1(field1425.length() - 1);
								out.pjstr(field1425.substring(2));
							} else {
								byte var14 = 0;
								if (field1425.startsWith("yellow:")) {
									var14 = 0;
									field1425 = field1425.substring(7);
								}
								if (field1425.startsWith("red:")) {
									var14 = 1;
									field1425 = field1425.substring(4);
								}
								if (field1425.startsWith("green:")) {
									var14 = 2;
									field1425 = field1425.substring(6);
								}
								if (field1425.startsWith("cyan:")) {
									var14 = 3;
									field1425 = field1425.substring(5);
								}
								if (field1425.startsWith("purple:")) {
									var14 = 4;
									field1425 = field1425.substring(7);
								}
								if (field1425.startsWith("white:")) {
									var14 = 5;
									field1425 = field1425.substring(6);
								}
								if (field1425.startsWith("flash1:")) {
									var14 = 6;
									field1425 = field1425.substring(7);
								}
								if (field1425.startsWith("flash2:")) {
									var14 = 7;
									field1425 = field1425.substring(7);
								}
								if (field1425.startsWith("flash3:")) {
									var14 = 8;
									field1425 = field1425.substring(7);
								}
								if (field1425.startsWith("glow1:")) {
									var14 = 9;
									field1425 = field1425.substring(6);
								}
								if (field1425.startsWith("glow2:")) {
									var14 = 10;
									field1425 = field1425.substring(6);
								}
								if (field1425.startsWith("glow3:")) {
									var14 = 11;
									field1425 = field1425.substring(6);
								}
								byte var15 = 0;
								if (field1425.startsWith("wave:")) {
									var15 = 1;
									field1425 = field1425.substring(5);
								}
								if (field1425.startsWith("scroll:")) {
									var15 = 2;
									field1425 = field1425.substring(7);
								}
								out.p1Enc(253);
								out.p1(0);
								int var16 = out.data;
								out.p1(var14);
								out.p1(var15);
								WordPack.pack(field1425, out);
								out.psize1(out.data - var16);
								field1425 = JString.toSentenceCase(field1425);
								field1425 = WordFilter.filter(field1425);
								localPlayer.field409 = field1425;
								localPlayer.field411 = var14;
								localPlayer.field412 = var15;
								localPlayer.field410 = 150;
								if (field1282 == 2) {
									method457(2, "@cr2@" + localPlayer.field457, localPlayer.field409);
								} else if (field1282 == 1) {
									method457(2, "@cr1@" + localPlayer.field457, localPlayer.field409);
								} else {
									method457(2, localPlayer.field457, localPlayer.field409);
								}
								if (field1383 == 2) {
									field1383 = 3;
									redrawPrivacySettings = true;
									out.p1Enc(154);
									out.p1(field1383);
									out.p1(field1388);
									out.p1(field1221);
								}
							}
							field1425 = "";
							redrawChatback = true;
						}
					}
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
			if (field1367.length() < 12) {
				field1367 = field1367 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public void showLoadError(String arg0) {
		System.out.println(arg0);
		try {
			getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + arg0 + ".html"));
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
	public void method541(int arg1, int arg2, NpcType arg3, int arg4) {
		if (menuNumEntries >= 400) {
			return;
		}
		String var6 = arg3.name;
		if (arg3.vislevel != 0) {
			var6 = var6 + combatColourCode(arg3.vislevel, localPlayer.field463) + " (level-" + arg3.vislevel + ")";
		}
		if (field1227 == 1) {
			menuOption[menuNumEntries] = "Use " + field1231 + " with @yel@" + var6;
			field1609[menuNumEntries] = 829;
			field1610[menuNumEntries] = arg4;
			field1607[menuNumEntries] = arg1;
			field1608[menuNumEntries] = arg2;
			menuNumEntries++;
		} else if (field1612 != 1) {
			if (arg3.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg3.op[var7] != null && !arg3.op[var7].equalsIgnoreCase("attack")) {
						menuOption[menuNumEntries] = arg3.op[var7] + " @yel@" + var6;
						if (var7 == 0) {
							field1609[menuNumEntries] = 242;
						}
						if (var7 == 1) {
							field1609[menuNumEntries] = 209;
						}
						if (var7 == 2) {
							field1609[menuNumEntries] = 309;
						}
						if (var7 == 3) {
							field1609[menuNumEntries] = 852;
						}
						if (var7 == 4) {
							field1609[menuNumEntries] = 793;
						}
						field1610[menuNumEntries] = arg4;
						field1607[menuNumEntries] = arg1;
						field1608[menuNumEntries] = arg2;
						menuNumEntries++;
					}
				}
			}
			if (arg3.op != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg3.op[var8] != null && arg3.op[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg3.vislevel > localPlayer.field463) {
							var9 = 2000;
						}
						menuOption[menuNumEntries] = arg3.op[var8] + " @yel@" + var6;
						if (var8 == 0) {
							field1609[menuNumEntries] = var9 + 242;
						}
						if (var8 == 1) {
							field1609[menuNumEntries] = var9 + 209;
						}
						if (var8 == 2) {
							field1609[menuNumEntries] = var9 + 309;
						}
						if (var8 == 3) {
							field1609[menuNumEntries] = var9 + 852;
						}
						if (var8 == 4) {
							field1609[menuNumEntries] = var9 + 793;
						}
						field1610[menuNumEntries] = arg4;
						field1607[menuNumEntries] = arg1;
						field1608[menuNumEntries] = arg2;
						menuNumEntries++;
					}
				}
			}
			menuOption[menuNumEntries] = "Examine @yel@" + var6;
			field1609[menuNumEntries] = 1714;
			field1610[menuNumEntries] = arg4;
			field1607[menuNumEntries] = arg1;
			field1608[menuNumEntries] = arg2;
			menuNumEntries++;
		} else if ((field1614 & 0x2) == 2) {
			menuOption[menuNumEntries] = field1615 + " @yel@" + var6;
			field1609[menuNumEntries] = 240;
			field1610[menuNumEntries] = arg4;
			field1607[menuNumEntries] = arg1;
			field1608[menuNumEntries] = arg2;
			menuNumEntries++;
			return;
		}
	}

	@ObfuscatedName("client.b(Ld;I)Z")
	public boolean getIfActive(IfType arg0) {
		if (arg0.field84 == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg0.field84.length; var3++) {
			int var4 = method442(arg0, var3);
			int var5 = arg0.field85[var3];
			if (arg0.field84[var3] == 2) {
				if (var4 >= var5) {
					return false;
				}
			} else if (arg0.field84[var3] == 3) {
				if (var4 <= var5) {
					return false;
				}
			} else if (arg0.field84[var3] == 4) {
				if (var4 == var5) {
					return false;
				}
			} else if (var4 != var5) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.k(B)V")
	public void moveNpcs() {
		for (int var2 = 0; var2 < npcCount; var2++) {
			int var3 = npcIds[var2];
			ClientNpc var4 = field1675[var3];
			if (var4 != null) {
				method544(var4, 0, var4.field453.size);
			}
		}
	}

	@ObfuscatedName("client.b(Ly;II)V")
	public void method544(ClientEntity arg0, int arg1, int arg2) {
		if (arg0.field397 < 128 || arg0.field398 < 128 || arg0.field397 >= 13184 || arg0.field398 >= 13184) {
			arg0.field425 = -1;
			arg0.field430 = -1;
			arg0.field439 = 0;
			arg0.field440 = 0;
			arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
			arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
			arg0.method112();
		}
		if (arg0 == localPlayer && (arg0.field397 < 1536 || arg0.field398 < 1536 || arg0.field397 >= 11776 || arg0.field398 >= 11776)) {
			arg0.field425 = -1;
			arg0.field430 = -1;
			arg0.field439 = 0;
			arg0.field440 = 0;
			arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
			arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
			arg0.method112();
		}
		if (arg0.field439 > loopCycle) {
			method545(arg0);
		} else if (arg0.field440 >= loopCycle) {
			method546(arg0);
		} else {
			method547(0, arg0);
		}
		method548(arg0);
		if (arg1 != 0) {
			field1651 = 207;
		}
		method549(arg0);
	}

	@ObfuscatedName("client.a(Ly;I)V")
	public void method545(ClientEntity arg0) {
		int var2 = arg0.field439 - loopCycle;
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
	public void method546(ClientEntity arg0) {
		if (arg0.field440 == loopCycle || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > SeqType.list[arg0.field425].getDelay(arg0.field426)) {
			int var3 = arg0.field440 - arg0.field439;
			int var4 = loopCycle - arg0.field439;
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
	public void method547(int arg0, ClientEntity arg1) {
		arg1.field422 = arg1.field402;
		if (arg1.field446 == 0) {
			arg1.field450 = 0;
			return;
		}
		if (arg1.field425 != -1 && arg1.field428 == 0) {
			SeqType var3 = SeqType.list[arg1.field425];
			if (arg1.field451 > 0 && var3.preanim_move == 0) {
				arg1.field450++;
				return;
			}
			if (arg1.field451 <= 0 && var3.postanim_move == 0) {
				arg1.field450++;
				return;
			}
		}
		int var4 = arg1.field397;
		int var5 = arg1.field398;
		int var6 = arg1.field447[arg1.field446 - 1] * 128 + arg1.field401 * 64;
		int var7 = arg1.field448[arg1.field446 - 1] * 128 + arg1.field401 * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg1.field397 = var6;
			arg1.field398 = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg1.field444 = 1280;
			} else if (var5 > var7) {
				arg1.field444 = 1792;
			} else {
				arg1.field444 = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg1.field444 = 768;
			} else if (var5 > var7) {
				arg1.field444 = 256;
			} else {
				arg1.field444 = 512;
			}
		} else if (var5 < var7) {
			arg1.field444 = 1024;
		} else {
			arg1.field444 = 0;
		}
		int var8 = arg1.field444 - arg1.field399 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg1.field405;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg1.field404;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg1.field407;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg1.field406;
		}
		if (var9 == -1) {
			var9 = arg1.field404;
		}
		arg1.field422 = var9;
		if (arg0 != 0) {
			return;
		}
		int var10 = 4;
		if (arg1.field399 != arg1.field444 && arg1.field419 == -1 && arg1.field445 != 0) {
			var10 = 2;
		}
		if (arg1.field446 > 2) {
			var10 = 6;
		}
		if (arg1.field446 > 3) {
			var10 = 8;
		}
		if (arg1.field450 > 0 && arg1.field446 > 1) {
			var10 = 8;
			arg1.field450--;
		}
		if (arg1.field449[arg1.field446 - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg1.field422 == arg1.field404 && arg1.field408 != -1) {
			arg1.field422 = arg1.field408;
		}
		if (var4 < var6) {
			arg1.field397 += var10;
			if (arg1.field397 > var6) {
				arg1.field397 = var6;
			}
		} else if (var4 > var6) {
			arg1.field397 -= var10;
			if (arg1.field397 < var6) {
				arg1.field397 = var6;
			}
		}
		if (var5 < var7) {
			arg1.field398 += var10;
			if (arg1.field398 > var7) {
				arg1.field398 = var7;
			}
		} else if (var5 > var7) {
			arg1.field398 -= var10;
			if (arg1.field398 < var7) {
				arg1.field398 = var7;
			}
		}
		if (arg1.field397 != var6 || arg1.field398 != var7) {
			return;
		}
		arg1.field446--;
		if (arg1.field451 > 0) {
			arg1.field451--;
			return;
		}
	}

	@ObfuscatedName("client.c(Ly;I)V")
	public void method548(ClientEntity arg0) {
		if (arg0.field445 == 0) {
			return;
		}
		if (arg0.field419 != -1 && arg0.field419 < 32768) {
			ClientNpc var3 = field1675[arg0.field419];
			if (var3 != null) {
				int var4 = arg0.field397 - var3.field397;
				int var5 = arg0.field398 - var3.field398;
				if (var4 != 0 || var5 != 0) {
					arg0.field444 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field419 >= 32768) {
			int var6 = arg0.field419 - 32768;
			if (var6 == field1363) {
				var6 = field1535;
			}
			ClientPlayer var7 = field1536[var6];
			if (var7 != null) {
				int var8 = arg0.field397 - var7.field397;
				int var9 = arg0.field398 - var7.field398;
				if (var8 != 0 || var9 != 0) {
					arg0.field444 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field420 != 0 || arg0.field421 != 0) && (arg0.field446 == 0 || arg0.field450 > 0)) {
			int var10 = arg0.field397 - (arg0.field420 - field1471 - field1471) * 64;
			int var11 = arg0.field398 - (arg0.field421 - field1472 - field1472) * 64;
			if (var10 != 0 || var11 != 0) {
				arg0.field444 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg0.field420 = 0;
			arg0.field421 = 0;
		}
		int var12 = arg0.field444 - arg0.field399 & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < arg0.field445 || var12 > 2048 - arg0.field445) {
			arg0.field399 = arg0.field444;
		} else if (var12 > 1024) {
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
			SeqType var3 = SeqType.list[arg0.field422];
			arg0.field424++;
			if (arg0.field423 < var3.numFrames && arg0.field424 > var3.getDelay(arg0.field423)) {
				arg0.field424 = 0;
				arg0.field423++;
			}
			if (arg0.field423 >= var3.numFrames) {
				arg0.field424 = 0;
				arg0.field423 = 0;
			}
		}
		if (arg0.field430 != -1 && loopCycle >= arg0.field433) {
			if (arg0.field431 < 0) {
				arg0.field431 = 0;
			}
			SeqType var4 = SpotType.list[arg0.field430].seq;
			arg0.field432++;
			while (arg0.field431 < var4.numFrames && arg0.field432 > var4.getDelay(arg0.field431)) {
				arg0.field432 -= var4.getDelay(arg0.field431);
				arg0.field431++;
			}
			if (arg0.field431 >= var4.numFrames && (arg0.field431 < 0 || arg0.field431 >= var4.numFrames)) {
				arg0.field430 = -1;
			}
		}
		if (arg0.field425 != -1 && arg0.field428 <= 1) {
			SeqType var5 = SeqType.list[arg0.field425];
			if (var5.preanim_move == 1 && arg0.field451 > 0 && arg0.field439 <= loopCycle && arg0.field440 < loopCycle) {
				arg0.field428 = 1;
				return;
			}
		}
		if (arg0.field425 != -1 && arg0.field428 == 0) {
			SeqType var6 = SeqType.list[arg0.field425];
			arg0.field427++;
			while (arg0.field426 < var6.numFrames && arg0.field427 > var6.getDelay(arg0.field426)) {
				arg0.field427 -= var6.getDelay(arg0.field426);
				arg0.field426++;
			}
			if (arg0.field426 >= var6.numFrames) {
				arg0.field426 -= var6.loops;
				arg0.field429++;
				if (arg0.field429 >= var6.maxloops) {
					arg0.field425 = -1;
				}
				if (arg0.field426 < 0 || arg0.field426 >= var6.numFrames) {
					arg0.field425 = -1;
				}
			}
			arg0.field400 = var6.reachforward;
		}
		if (arg0.field428 > 0) {
			arg0.field428--;
		}
	}

	@ObfuscatedName("client.R(I)V")
	public void method550() {
		if (redrawFrame) {
			redrawFrame = false;
			areaBackleft1.draw(0, super.graphics, 4);
			areaBackleft2.draw(0, super.graphics, 357);
			areaBackright1.draw(722, super.graphics, 4);
			areaBackright2.draw(743, super.graphics, 205);
			areaBacktop1.draw(0, super.graphics, 0);
			areaBackvmid1.draw(516, super.graphics, 4);
			areaBackvmid2.draw(516, super.graphics, 205);
			areaBackvmid3.draw(496, super.graphics, 357);
			areaBackhmid2.draw(0, super.graphics, 338);
			redrawSidebar = true;
			redrawChatback = true;
			redrawSideicons = true;
			redrawPrivacySettings = true;
			if (sceneState != 2) {
				field1280.draw(4, super.graphics, 4);
				field1279.draw(550, super.graphics, 4);
			}
		}
		if (sceneState == 2) {
			method445();
		}
		if (field1267 && menuArea == 1) {
			redrawSidebar = true;
		}
		if (sideModalId != -1) {
			boolean var2 = animateInterface(worldUpdateNum, sideModalId);
			if (var2) {
				redrawSidebar = true;
			}
		}
		if (selectedArea == 2) {
			redrawSidebar = true;
		}
		if (objDragArea == 2) {
			redrawSidebar = true;
		}
		if (redrawSidebar) {
			method506();
			redrawSidebar = false;
		}
		if (chatComId == -1) {
			field1277.field88 = field1347 - field1498 - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				method472(77, field1277, super.mouseY - 357, 0, 463, super.mouseX - 17, false, field1347);
			}
			int var3 = field1347 - field1277.field88 - 77;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > field1347 - 77) {
				var3 = field1347 - 77;
			}
			if (field1498 != var3) {
				field1498 = var3;
				redrawChatback = true;
			}
		}
		if (chatComId != -1) {
			boolean var4 = animateInterface(worldUpdateNum, chatComId);
			if (var4) {
				redrawChatback = true;
			}
		}
		if (selectedArea == 3) {
			redrawChatback = true;
		}
		if (objDragArea == 3) {
			redrawChatback = true;
		}
		if (tutComMessage != null) {
			redrawChatback = true;
		}
		if (field1267 && menuArea == 2) {
			redrawChatback = true;
		}
		if (redrawChatback) {
			method471();
			redrawChatback = false;
		}
		if (sceneState == 2) {
			method511((byte) 5);
			field1279.draw(550, super.graphics, 4);
		}
		if (field1589 != -1) {
			redrawSideicons = true;
		}
		if (redrawSideicons) {
			if (field1589 != -1 && field1589 == sideTab) {
				field1589 = -1;
				out.p1Enc(94);
				out.p1(sideTab);
			}
			redrawSideicons = false;
			field1408.setPixels();
			backhmid1.plotSprite(0, 0);
			if (sideModalId == -1) {
				if (field1370[sideTab] != -1) {
					if (sideTab == 0) {
						redstone1.plotSprite(22, 10);
					}
					if (sideTab == 1) {
						redstone2.plotSprite(54, 8);
					}
					if (sideTab == 2) {
						redstone2.plotSprite(82, 8);
					}
					if (sideTab == 3) {
						redstone3.plotSprite(110, 8);
					}
					if (sideTab == 4) {
						redstone2h.plotSprite(153, 8);
					}
					if (sideTab == 5) {
						redstone2h.plotSprite(181, 8);
					}
					if (sideTab == 6) {
						redstone1h.plotSprite(209, 9);
					}
				}
				if (field1370[0] != -1 && (field1589 != 0 || loopCycle % 20 < 10)) {
					sideicons[0].plotSprite(29, 13);
				}
				if (field1370[1] != -1 && (field1589 != 1 || loopCycle % 20 < 10)) {
					sideicons[1].plotSprite(53, 11);
				}
				if (field1370[2] != -1 && (field1589 != 2 || loopCycle % 20 < 10)) {
					sideicons[2].plotSprite(82, 11);
				}
				if (field1370[3] != -1 && (field1589 != 3 || loopCycle % 20 < 10)) {
					sideicons[3].plotSprite(115, 12);
				}
				if (field1370[4] != -1 && (field1589 != 4 || loopCycle % 20 < 10)) {
					sideicons[4].plotSprite(153, 13);
				}
				if (field1370[5] != -1 && (field1589 != 5 || loopCycle % 20 < 10)) {
					sideicons[5].plotSprite(180, 11);
				}
				if (field1370[6] != -1 && (field1589 != 6 || loopCycle % 20 < 10)) {
					sideicons[6].plotSprite(208, 13);
				}
			}
			field1408.draw(516, super.graphics, 160);
			field1407.setPixels();
			backbase2.plotSprite(0, 0);
			if (sideModalId == -1) {
				if (field1370[sideTab] != -1) {
					if (sideTab == 7) {
						redstone1v.plotSprite(42, 0);
					}
					if (sideTab == 8) {
						redstone2v.plotSprite(74, 0);
					}
					if (sideTab == 9) {
						redstone2v.plotSprite(102, 0);
					}
					if (sideTab == 10) {
						redstone3v.plotSprite(130, 1);
					}
					if (sideTab == 11) {
						redstone2hv.plotSprite(173, 0);
					}
					if (sideTab == 12) {
						redstone2hv.plotSprite(201, 0);
					}
					if (sideTab == 13) {
						redstone1hv.plotSprite(229, 0);
					}
				}
				if (field1370[8] != -1 && (field1589 != 8 || loopCycle % 20 < 10)) {
					sideicons[7].plotSprite(74, 2);
				}
				if (field1370[9] != -1 && (field1589 != 9 || loopCycle % 20 < 10)) {
					sideicons[8].plotSprite(102, 3);
				}
				if (field1370[10] != -1 && (field1589 != 10 || loopCycle % 20 < 10)) {
					sideicons[9].plotSprite(137, 4);
				}
				if (field1370[11] != -1 && (field1589 != 11 || loopCycle % 20 < 10)) {
					sideicons[10].plotSprite(174, 2);
				}
				if (field1370[12] != -1 && (field1589 != 12 || loopCycle % 20 < 10)) {
					sideicons[11].plotSprite(201, 2);
				}
				if (field1370[13] != -1 && (field1589 != 13 || loopCycle % 20 < 10)) {
					sideicons[12].plotSprite(226, 2);
				}
			}
			field1407.draw(496, super.graphics, 466);
			field1280.setPixels();
		}
		if (redrawPrivacySettings) {
			redrawPrivacySettings = false;
			field1406.setPixels();
			backbase1.plotSprite(0, 0);
			p12.centreStringTag(55, 28, "Public chat", 16777215, true);
			if (field1383 == 0) {
				p12.centreStringTag(55, 41, "On", 65280, true);
			}
			if (field1383 == 1) {
				p12.centreStringTag(55, 41, "Friends", 16776960, true);
			}
			if (field1383 == 2) {
				p12.centreStringTag(55, 41, "Off", 16711680, true);
			}
			if (field1383 == 3) {
				p12.centreStringTag(55, 41, "Hide", 65535, true);
			}
			p12.centreStringTag(184, 28, "Private chat", 16777215, true);
			if (field1388 == 0) {
				p12.centreStringTag(184, 41, "On", 65280, true);
			}
			if (field1388 == 1) {
				p12.centreStringTag(184, 41, "Friends", 16776960, true);
			}
			if (field1388 == 2) {
				p12.centreStringTag(184, 41, "Off", 16711680, true);
			}
			p12.centreStringTag(324, 28, "Trade/duel", 16777215, true);
			if (field1221 == 0) {
				p12.centreStringTag(324, 41, "On", 65280, true);
			}
			if (field1221 == 1) {
				p12.centreStringTag(324, 41, "Friends", 16776960, true);
			}
			if (field1221 == 2) {
				p12.centreStringTag(324, 41, "Off", 16711680, true);
			}
			p12.centreStringTag(458, 33, "Report abuse", 16777215, true);
			field1406.draw(0, super.graphics, 453);
			field1280.setPixels();
		}
		worldUpdateNum = 0;
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public void getNpcPos(int arg0, int arg1, Packet arg2) {
		entityRemovalCount = 0;
		field1539 = 0;
		int var4 = arg1 + arg0;
		getNpcPosOldVis(var4, arg2);
		getNpcPosNewVis(arg2, var4);
		getNpcPosExtended(var4, arg2);
		for (int var5 = 0; var5 < entityRemovalCount; var5++) {
			int var6 = entityRemovalIds[var5];
			if (field1675[var6].field442 != loopCycle) {
				field1675[var6].field453 = null;
				field1675[var6] = null;
			}
		}
		if (arg2.data != var4) {
			signlink.reporterror(field1563 + " size mismatch in getnpcpos - pos:" + arg2.data + " psize:" + var4);
			throw new RuntimeException("eek");
		}
		for (int var7 = 0; var7 < npcCount; var7++) {
			if (field1675[npcIds[var7]] == null) {
				signlink.reporterror(field1563 + " null entry in npc list - pos:" + var7 + " size:" + npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.S(I)V")
	public void locChangeDoQueue() {
		if (sceneState != 2) {
			return;
		}
		for (LocChange var2 = (LocChange) field1644.head(); var2 != null; var2 = (LocChange) field1644.next()) {
			if (var2.field738 > 0) {
				var2.field738--;
			}
			if (var2.field738 != 0) {
				if (var2.field737 > 0) {
					var2.field737--;
				}
				if (var2.field737 == 0 && var2.field729 >= 1 && var2.field730 >= 1 && var2.field729 <= 102 && var2.field730 <= 102 && (var2.field734 < 0 || ClientBuild.changeLocAvailable(var2.field734, var2.field736))) {
					method452(var2.field735, var2.field728, var2.field729, var2.field736, var2.field734, var2.field727, var2.field730);
					var2.field737 = -1;
					if (var2.field734 == var2.field731 && var2.field731 == -1) {
						var2.unlink();
					} else if (var2.field734 == var2.field731 && var2.field735 == var2.field732 && var2.field736 == var2.field733) {
						var2.unlink();
					}
				}
			} else if (var2.field731 < 0 || ClientBuild.changeLocAvailable(var2.field731, var2.field733)) {
				method452(var2.field732, var2.field728, var2.field729, var2.field733, var2.field731, var2.field727, var2.field730);
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public void getPlayerPosNewVis(Packet arg0, int arg1) {
		while (true) {
			if (arg0.field710 + 10 < arg1 * 8) {
				int var4 = arg0.gBit(11);
				if (var4 != 2047) {
					if (field1536[var4] == null) {
						field1536[var4] = new ClientPlayer();
						if (field1541[var4] != null) {
							field1536[var4].method116(field1541[var4]);
						}
					}
					field1538[field1537++] = var4;
					ClientPlayer var5 = field1536[var4];
					var5.field442 = loopCycle;
					int var6 = arg0.gBit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg0.gBit(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					int var8 = arg0.gBit(1);
					var5.method110(localPlayer.field447[0] + var6, var8 == 1, false, localPlayer.field448[0] + var7);
					int var9 = arg0.gBit(1);
					if (var9 == 1) {
						field1540[field1539++] = var4;
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
		int var2 = 5;
		getJagChecksum[8] = 0;
		int var3 = 0;
		while (getJagChecksum[8] == 0) {
			String var4 = "Unknown problem";
			messageBox("Connecting to web server", 20);
			try {
				DataInputStream var5 = method492("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 274);
				Packet var6 = new Packet(new byte[40]);
				var5.readFully(var6.pos, 0, 40);
				var5.close();
				for (int var7 = 0; var7 < 9; var7++) {
					getJagChecksum[var7] = var6.g4();
				}
				int var8 = var6.g4();
				int var9 = 1234;
				for (int var10 = 0; var10 < 9; var10++) {
					var9 = (var9 << 1) + getJagChecksum[var10];
				}
				if (var8 != var9) {
					var4 = "checksum problem";
					getJagChecksum[8] = 0;
				}
			} catch (EOFException var13) {
				var4 = "EOF problem";
				getJagChecksum[8] = 0;
			} catch (IOException var14) {
				var4 = "connection problem";
				getJagChecksum[8] = 0;
			} catch (Exception var15) {
				var4 = "logic problem";
				getJagChecksum[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (getJagChecksum[8] == 0) {
				var3++;
				for (int var11 = var2; var11 > 0; var11--) {
					if (var3 >= 10) {
						messageBox("Game updated - please reload page", 10);
						var11 = 10;
					} else {
						messageBox(var4 + " - Will retry in " + var11 + " secs.", 10);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var12) {
					}
				}
				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}
				field1469 = !field1469;
			}
		}
	}
}
