package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.Component;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.config.UnkType;
import jagex2.config.VarbitType;
import jagex2.config.VarpType;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ClientEntity;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.ClientNpc;
import jagex2.dash3d.ClientObj;
import jagex2.dash3d.ClientPlayer;
import jagex2.dash3d.ClientProj;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Decor;
import jagex2.dash3d.GroundDecor;
import jagex2.dash3d.LocChange;
import jagex2.dash3d.MapSpotAnim;
import jagex2.dash3d.Model;
import jagex2.dash3d.Sprite;
import jagex2.dash3d.Wall;
import jagex2.dash3d.World;
import jagex2.dash3d.World3D;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.jstring.JString;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
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
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import sign.signlink;

public class Client extends GameShell {

	@ObfuscatedName("client.K")
	public int[] field133 = new int[9];

	@ObfuscatedName("client.M")
	public String field135 = "";

	@ObfuscatedName("client.P")
	public int[] field138 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.Q")
	public int[] field139 = new int[Stats.field1503];

	@ObfuscatedName("client.W")
	public String[] field145 = new String[200];

	@ObfuscatedName("client.Z")
	public int[] field148 = new int[5];

	@ObfuscatedName("client.bb")
	public int field150 = 2;

	@ObfuscatedName("client.ib")
	public String field157 = "";

	@ObfuscatedName("client.kb")
	public String[] field159 = new String[100];

	@ObfuscatedName("client.lb")
	public int[] field160 = new int[100];

	@ObfuscatedName("client.nb")
	public boolean field162 = false;

	@ObfuscatedName("client.Ab")
	public int[][][] field175 = new int[4][13][13];

	@ObfuscatedName("client.Gb")
	public int[][] field181 = new int[104][104];

	@ObfuscatedName("client.Hb")
	public int[][] field182 = new int[104][104];

	@ObfuscatedName("client.Nb")
	public boolean field188 = false;

	@ObfuscatedName("client.Pb")
	public int field190 = -992;

	@ObfuscatedName("client.Rb")
	public Pix32[] field192 = new Pix32[8];

	@ObfuscatedName("client.Sb")
	public int field193 = 559;

	@ObfuscatedName("client.Tb")
	public byte field194 = 6;

	@ObfuscatedName("client.Vb")
	public boolean field196 = false;

	@ObfuscatedName("client.Wb")
	public byte field197 = -123;

	@ObfuscatedName("client.mc")
	public int field213 = 2;

	@ObfuscatedName("client.nc")
	public boolean field214 = true;

	@ObfuscatedName("client.oc")
	public boolean field215 = true;

	@ObfuscatedName("client.pc")
	public int[] field216 = new int[151];

	@ObfuscatedName("client.qc")
	public int field217 = 8;

	@ObfuscatedName("client.wc")
	public boolean[] field223 = new boolean[5];

	@ObfuscatedName("client.xc")
	public int field224 = -188;

	@ObfuscatedName("client.yc")
	public Packet field225 = Packet.alloc((byte) 0, 1);

	@ObfuscatedName("client.Ac")
	public int field227 = 2301979;

	@ObfuscatedName("client.Bc")
	public int field228 = -1;

	@ObfuscatedName("client.Cc")
	public int field229 = -1;

	@ObfuscatedName("client.Dc")
	public boolean field230 = true;

	@ObfuscatedName("client.Ec")
	public int field231 = -1;

	@ObfuscatedName("client.Fc")
	public byte field232 = -113;

	@ObfuscatedName("client.Gc")
	public String field233 = "";

	@ObfuscatedName("client.Hc")
	public int field234 = -214;

	@ObfuscatedName("client.Jc")
	public int field236 = 50;

	@ObfuscatedName("client.Kc")
	public int[] field237 = new int[this.field236];

	@ObfuscatedName("client.Lc")
	public int[] field238 = new int[this.field236];

	@ObfuscatedName("client.Mc")
	public int[] field239 = new int[this.field236];

	@ObfuscatedName("client.Nc")
	public int[] field240 = new int[this.field236];

	@ObfuscatedName("client.Oc")
	public int[] field241 = new int[this.field236];

	@ObfuscatedName("client.Pc")
	public int[] field242 = new int[this.field236];

	@ObfuscatedName("client.Qc")
	public int[] field243 = new int[this.field236];

	@ObfuscatedName("client.Rc")
	public String[] field244 = new String[this.field236];

	@ObfuscatedName("client.Sc")
	public String field245 = "";

	@ObfuscatedName("client.Tc")
	public boolean field246 = false;

	@ObfuscatedName("client.Wc")
	public boolean field249 = false;

	@ObfuscatedName("client.Xc")
	public Pix32[] field250 = new Pix32[32];

	@ObfuscatedName("client.Zc")
	public byte field252 = 1;

	@ObfuscatedName("client.ad")
	public String field253 = "";

	@ObfuscatedName("client.bd")
	public String field254 = "";

	@ObfuscatedName("client.cd")
	public boolean field255 = true;

	@ObfuscatedName("client.dd")
	public int field256 = -1;

	@ObfuscatedName("client.ed")
	public int field257 = -1;

	@ObfuscatedName("client.hd")
	public Packet field260 = Packet.alloc((byte) 0, 1);

	@ObfuscatedName("client.ld")
	public int field264 = 2048;

	@ObfuscatedName("client.md")
	public int field265 = 2047;

	@ObfuscatedName("client.nd")
	public ClientPlayer[] field266 = new ClientPlayer[this.field264];

	@ObfuscatedName("client.pd")
	public int[] field268 = new int[this.field264];

	@ObfuscatedName("client.rd")
	public int[] field270 = new int[this.field264];

	@ObfuscatedName("client.sd")
	public Packet[] field271 = new Packet[this.field264];

	@ObfuscatedName("client.td")
	public Pix8[] field272 = new Pix8[13];

	@ObfuscatedName("client.wd")
	public int[] field275 = new int[500];

	@ObfuscatedName("client.xd")
	public int[] field276 = new int[500];

	@ObfuscatedName("client.yd")
	public int[] field277 = new int[500];

	@ObfuscatedName("client.zd")
	public int[] field278 = new int[500];

	@ObfuscatedName("client.Fd")
	public int field284 = -1;

	@ObfuscatedName("client.Id")
	public int[] field287 = new int[5];

	@ObfuscatedName("client.Wd")
	public int[] field301 = new int[2000];

	@ObfuscatedName("client.be")
	public int field306 = 2;

	@ObfuscatedName("client.fe")
	public boolean field310 = false;

	@ObfuscatedName("client.he")
	public boolean field312 = false;

	@ObfuscatedName("client.ke")
	public int[] field315 = new int[151];

	@ObfuscatedName("client.re")
	public String field322 = "";

	@ObfuscatedName("client.te")
	public boolean field324 = false;

	@ObfuscatedName("client.ue")
	public int[] field325 = new int[Stats.field1503];

	@ObfuscatedName("client.we")
	public Pix32[] field327 = new Pix32[100];

	@ObfuscatedName("client.xe")
	public final int[] field328 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ye")
	public boolean field329 = false;

	@ObfuscatedName("client.De")
	public boolean field334 = true;

	@ObfuscatedName("client.Ee")
	public int[] field335 = new int[2000];

	@ObfuscatedName("client.Le")
	public boolean field342 = false;

	@ObfuscatedName("client.Qe")
	public int field347 = 69;

	@ObfuscatedName("client.Se")
	public int field349 = -1;

	@ObfuscatedName("client.Te")
	public int[] field350 = new int[Stats.field1503];

	@ObfuscatedName("client.Ue")
	public int field351 = 2;

	@ObfuscatedName("client.Ve")
	public int field352 = 3;

	@ObfuscatedName("client.ef")
	public boolean field361 = false;

	@ObfuscatedName("client.ff")
	public byte field362 = 1;

	@ObfuscatedName("client.gf")
	public boolean field363 = false;

	@ObfuscatedName("client.jf")
	public String[] field365 = new String[5];

	@ObfuscatedName("client.kf")
	public boolean[] field366 = new boolean[5];

	@ObfuscatedName("client.mf")
	public int field368 = 20411;

	@ObfuscatedName("client.nf")
	public long[] field369 = new long[100];

	@ObfuscatedName("client.of")
	public boolean field370 = false;

	@ObfuscatedName("client.rf")
	public int[] field373 = new int[1000];

	@ObfuscatedName("client.sf")
	public int[] field374 = new int[1000];

	@ObfuscatedName("client.tf")
	public Pix32[] field375 = new Pix32[32];

	@ObfuscatedName("client.uf")
	public int field376 = 5063219;

	@ObfuscatedName("client.vf")
	public int[] field377 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Cf")
	public CRC32 field384 = new CRC32();

	@ObfuscatedName("client.Df")
	public int field385 = -1;

	@ObfuscatedName("client.Ef")
	public int[] field386 = new int[50];

	@ObfuscatedName("client.Gf")
	public String field388 = "";

	@ObfuscatedName("client.Hf")
	public String field389 = "";

	@ObfuscatedName("client.Lf")
	public boolean field393 = false;

	@ObfuscatedName("client.Mf")
	public boolean field394 = false;

	@ObfuscatedName("client.Nf")
	public int[] field395 = new int[5];

	@ObfuscatedName("client.Sf")
	public String field400 = "";

	@ObfuscatedName("client.Tf")
	public int[] field401 = new int[5];

	@ObfuscatedName("client.Vf")
	public int field403 = 78;

	@ObfuscatedName("client.hg")
	public int field415 = -30658;

	@ObfuscatedName("client.lg")
	public int[] field419 = new int[4000];

	@ObfuscatedName("client.mg")
	public int[] field420 = new int[4000];

	@ObfuscatedName("client.pg")
	public boolean field423 = false;

	@ObfuscatedName("client.sg")
	public long[] field426 = new long[200];

	@ObfuscatedName("client.tg")
	public Packet field427 = new Packet(true, new byte[5000]);

	@ObfuscatedName("client.ug")
	public ClientNpc[] field428 = new ClientNpc[16384];

	@ObfuscatedName("client.wg")
	public int[] field430 = new int[16384];

	@ObfuscatedName("client.xg")
	public int field431 = 7759444;

	@ObfuscatedName("client.yg")
	public boolean field432 = false;

	@ObfuscatedName("client.zg")
	public boolean field433 = false;

	@ObfuscatedName("client.Cg")
	public int field436 = -110;

	@ObfuscatedName("client.Eg")
	public Pix8[] field438 = new Pix8[2];

	@ObfuscatedName("client.Fg")
	public byte field439 = -80;

	@ObfuscatedName("client.Gg")
	public boolean field440 = true;

	@ObfuscatedName("client.Hg")
	public int[] field441 = new int[5];

	@ObfuscatedName("client.Pg")
	public Pix8[] field449 = new Pix8[100];

	@ObfuscatedName("client.Qg")
	public int field450 = -916;

	@ObfuscatedName("client.Rg")
	public boolean field451 = false;

	@ObfuscatedName("client.Xg")
	public byte field457 = 97;

	@ObfuscatedName("client.Zg")
	public boolean field459 = false;

	@ObfuscatedName("client.ch")
	public int[] field462 = new int[256];

	@ObfuscatedName("client.fh")
	public int field465 = -1;

	@ObfuscatedName("client.lh")
	public int field471 = -89;

	@ObfuscatedName("client.oh")
	public int field474 = 300;

	@ObfuscatedName("client.qh")
	public int[] field476 = new int[33];

	@ObfuscatedName("client.rh")
	public boolean field477 = false;

	@ObfuscatedName("client.sh")
	public Pix32[] field478 = new Pix32[20];

	@ObfuscatedName("client.uh")
	public String[] field480 = new String[500];

	@ObfuscatedName("client.yh")
	public Packet field484 = Packet.alloc((byte) 0, 1);

	@ObfuscatedName("client.zh")
	public int[][] field485 = new int[104][104];

	@ObfuscatedName("client.Bh")
	public int field487 = -1;

	@ObfuscatedName("client.Th")
	public boolean field505 = false;

	@ObfuscatedName("client.Uh")
	public LinkList field506 = new LinkList(true);

	@ObfuscatedName("client.Vh")
	public boolean field507 = false;

	@ObfuscatedName("client.Wh")
	public boolean field508 = false;

	@ObfuscatedName("client.Xh")
	public int field509 = -1;

	@ObfuscatedName("client.mi")
	public FileStream[] field524 = new FileStream[5];

	@ObfuscatedName("client.pi")
	public int field527 = -1;

	@ObfuscatedName("client.si")
	public int field530 = 1;

	@ObfuscatedName("client.ui")
	public int field532 = 326;

	@ObfuscatedName("client.xi")
	public boolean field535 = false;

	@ObfuscatedName("client.yi")
	public boolean field536 = false;

	@ObfuscatedName("client.Bi")
	public volatile boolean field539 = false;

	@ObfuscatedName("client.Di")
	public byte[] field541 = new byte[16384];

	@ObfuscatedName("client.Hi")
	public Component field545 = new Component();

	@ObfuscatedName("client.Ji")
	public int field547 = 128;

	@ObfuscatedName("client.Oi")
	public int field552 = 1;

	@ObfuscatedName("client.Pi")
	public final int field553 = 100;

	@ObfuscatedName("client.Qi")
	public int[] field554 = new int[100];

	@ObfuscatedName("client.Ri")
	public int[] field555 = new int[50];

	@ObfuscatedName("client.Si")
	public CollisionMap[] field556 = new CollisionMap[4];

	@ObfuscatedName("client.Ti")
	public LinkList field557 = new LinkList(true);

	@ObfuscatedName("client.Xi")
	public boolean field561 = false;

	@ObfuscatedName("client.Yi")
	public boolean field562 = true;

	@ObfuscatedName("client.Zi")
	public int[] field563 = new int[200];

	@ObfuscatedName("client.dj")
	public boolean field567 = true;

	@ObfuscatedName("client.ej")
	public int field568 = -1;

	@ObfuscatedName("client.gj")
	public boolean field570 = true;

	@ObfuscatedName("client.hj")
	public boolean field571 = true;

	@ObfuscatedName("client.ij")
	public int field572 = -1;

	@ObfuscatedName("client.jj")
	public boolean field573 = false;

	@ObfuscatedName("client.kj")
	public Pix32[] field574 = new Pix32[1000];

	@ObfuscatedName("client.lj")
	public int field575 = -1;

	@ObfuscatedName("client.nj")
	public int field577 = -939;

	@ObfuscatedName("client.oj")
	public LinkList field578 = new LinkList(true);

	@ObfuscatedName("client.pj")
	public boolean field579 = false;

	@ObfuscatedName("client.rj")
	public int field581 = 3;

	@ObfuscatedName("client.sj")
	public int[] field582 = new int[33];

	@ObfuscatedName("client.tj")
	public int field583 = 3353893;

	@ObfuscatedName("client.uj")
	public Pix32[] field584 = new Pix32[32];

	@ObfuscatedName("client.wj")
	public int[] field586 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Bj")
	public int[] field591 = new int[1000];

	@ObfuscatedName("client.Cj")
	public int[] field592 = new int[100];

	@ObfuscatedName("client.Dj")
	public String[] field593 = new String[100];

	@ObfuscatedName("client.Ej")
	public String[] field594 = new String[100];

	@ObfuscatedName("client.Hj")
	public boolean field597 = true;

	@ObfuscatedName("client.Uj")
	public volatile boolean field610 = false;

	@ObfuscatedName("client.Xj")
	public byte field613 = -58;

	@ObfuscatedName("client.Yj")
	public int field614 = 416;

	@ObfuscatedName("client.ak")
	public volatile boolean field616 = false;

	@ObfuscatedName("client.bk")
	public int[] field617 = new int[50];

	@ObfuscatedName("client.dk")
	public LinkList[][][] field619 = new LinkList[4][104][104];

	@ObfuscatedName("client.gk")
	public int[] field622 = new int[7];

	@ObfuscatedName("client.hk")
	public int field623 = -1;

	@ObfuscatedName("client.ik")
	public int field624 = 409;

	@ObfuscatedName("client.N")
	public static BigInteger field136 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sc")
	public static int field219 = 10;

	@ObfuscatedName("client.uc")
	public static boolean field221 = true;

	@ObfuscatedName("client.Vc")
	public static int[] field248 = new int[99];

	@ObfuscatedName("client.gd")
	public static boolean field259;

	@ObfuscatedName("client.Yd")
	public static String field303;

	@ObfuscatedName("client.Zd")
	public static final int[][] field304;

	@ObfuscatedName("client.qe")
	public static int field321;

	@ObfuscatedName("client.Ah")
	public static boolean field486;

	@ObfuscatedName("client.Yh")
	public static int[] field510;

	@ObfuscatedName("client.Ai")
	public static boolean field538;

	@ObfuscatedName("client.aj")
	public static final int[] field564;

	@ObfuscatedName("client.Wj")
	public static BigInteger field612;

	@ObfuscatedName("client.O")
	public static int field137;

	@ObfuscatedName("client.R")
	public int field140;

	@ObfuscatedName("client.S")
	public int field141;

	@ObfuscatedName("client.T")
	public int field142;

	@ObfuscatedName("client.U")
	public int field143;

	@ObfuscatedName("client.V")
	public int field144;

	@ObfuscatedName("client.X")
	public int field146;

	@ObfuscatedName("client.Y")
	public int field147;

	@ObfuscatedName("client.ab")
	public int field149;

	@ObfuscatedName("client.cb")
	public int field151;

	@ObfuscatedName("client.gb")
	public int field155;

	@ObfuscatedName("client.hb")
	public int field156;

	@ObfuscatedName("client.jb")
	public int field158;

	@ObfuscatedName("client.mb")
	public int field161;

	@ObfuscatedName("client.ob")
	public int field163;

	@ObfuscatedName("client.qb")
	public int field165;

	@ObfuscatedName("client.rb")
	public int field166;

	@ObfuscatedName("client.sb")
	public int field167;

	@ObfuscatedName("client.tb")
	public int field168;

	@ObfuscatedName("client.ub")
	public int field169;

	@ObfuscatedName("client.vb")
	public int field170;

	@ObfuscatedName("client.wb")
	public int field171;

	@ObfuscatedName("client.xb")
	public int field172;

	@ObfuscatedName("client.yb")
	public int field173;

	@ObfuscatedName("client.zb")
	public int field174;

	@ObfuscatedName("client.Ib")
	public int field183;

	@ObfuscatedName("client.Kb")
	public int field185;

	@ObfuscatedName("client.Lb")
	public int field186;

	@ObfuscatedName("client.Ob")
	public int field189;

	@ObfuscatedName("client.Qb")
	public static int field191;

	@ObfuscatedName("client.Yb")
	public int field199;

	@ObfuscatedName("client.Zb")
	public int field200;

	@ObfuscatedName("client.ac")
	public int field201;

	@ObfuscatedName("client.kc")
	public int field211;

	@ObfuscatedName("client.lc")
	public int field212;

	@ObfuscatedName("client.rc")
	public int field218;

	@ObfuscatedName("client.tc")
	public static int field220;

	@ObfuscatedName("client.Ic")
	public int field235;

	@ObfuscatedName("client.Uc")
	public int field247;

	@ObfuscatedName("client.Yc")
	public int field251;

	@ObfuscatedName("client.od")
	public int field267;

	@ObfuscatedName("client.qd")
	public int field269;

	@ObfuscatedName("client.ud")
	public int field273;

	@ObfuscatedName("client.vd")
	public static int field274;

	@ObfuscatedName("client.Gd")
	public int field285;

	@ObfuscatedName("client.Hd")
	public int field286;

	@ObfuscatedName("client.Jd")
	public int field288;

	@ObfuscatedName("client.Kd")
	public int field289;

	@ObfuscatedName("client.Ld")
	public int field290;

	@ObfuscatedName("client.Md")
	public int field291;

	@ObfuscatedName("client.Nd")
	public int field292;

	@ObfuscatedName("client.Od")
	public int field293;

	@ObfuscatedName("client.Pd")
	public int field294;

	@ObfuscatedName("client.Vd")
	public int field300;

	@ObfuscatedName("client.Xd")
	public int field302;

	@ObfuscatedName("client.ae")
	public int field305;

	@ObfuscatedName("client.ce")
	public int field307;

	@ObfuscatedName("client.de")
	public int field308;

	@ObfuscatedName("client.ee")
	public static int field309;

	@ObfuscatedName("client.ge")
	public int field311;

	@ObfuscatedName("client.le")
	public int field316;

	@ObfuscatedName("client.me")
	public int field317;

	@ObfuscatedName("client.ne")
	public int field318;

	@ObfuscatedName("client.oe")
	public int field319;

	@ObfuscatedName("client.ve")
	public int field326;

	@ObfuscatedName("client.ze")
	public int field330;

	@ObfuscatedName("client.Ae")
	public int field331;

	@ObfuscatedName("client.Fe")
	public int field336;

	@ObfuscatedName("client.Ge")
	public int field337;

	@ObfuscatedName("client.He")
	public int field338;

	@ObfuscatedName("client.Ie")
	public int field339;

	@ObfuscatedName("client.Je")
	public int field340;

	@ObfuscatedName("client.Ke")
	public int field341;

	@ObfuscatedName("client.Me")
	public int field343;

	@ObfuscatedName("client.Ne")
	public int field344;

	@ObfuscatedName("client.Oe")
	public static int field345;

	@ObfuscatedName("client.Pe")
	public int field346;

	@ObfuscatedName("client.Re")
	public static int field348;

	@ObfuscatedName("client.We")
	public int field353;

	@ObfuscatedName("client.cf")
	public int field359;

	@ObfuscatedName("client.df")
	public int field360;

	@ObfuscatedName("client.hf")
	public int field364;

	@ObfuscatedName("client.lf")
	public int field367;

	@ObfuscatedName("client.pf")
	public int field371;

	@ObfuscatedName("client.qf")
	public int field372;

	@ObfuscatedName("client.wf")
	public static int field378;

	@ObfuscatedName("client.xf")
	public int field379;

	@ObfuscatedName("client.Bf")
	public int field383;

	@ObfuscatedName("client.Ff")
	public int field387;

	@ObfuscatedName("client.If")
	public int field390;

	@ObfuscatedName("client.Of")
	public static int field396;

	@ObfuscatedName("client.Pf")
	public int field397;

	@ObfuscatedName("client.Uf")
	public int field402;

	@ObfuscatedName("client.Zf")
	public int field407;

	@ObfuscatedName("client.ag")
	public int field408;

	@ObfuscatedName("client.bg")
	public int field409;

	@ObfuscatedName("client.cg")
	public int field410;

	@ObfuscatedName("client.dg")
	public int field411;

	@ObfuscatedName("client.gg")
	public int field414;

	@ObfuscatedName("client.ig")
	public int field416;

	@ObfuscatedName("client.jg")
	public int field417;

	@ObfuscatedName("client.og")
	public int field422;

	@ObfuscatedName("client.qg")
	public int field424;

	@ObfuscatedName("client.rg")
	public int field425;

	@ObfuscatedName("client.vg")
	public int field429;

	@ObfuscatedName("client.Ag")
	public int field434;

	@ObfuscatedName("client.Bg")
	public static int field435;

	@ObfuscatedName("client.Ig")
	public int field442;

	@ObfuscatedName("client.Jg")
	public int field443;

	@ObfuscatedName("client.Kg")
	public int field444;

	@ObfuscatedName("client.Lg")
	public int field445;

	@ObfuscatedName("client.Ng")
	public int field447;

	@ObfuscatedName("client.Og")
	public int field448;

	@ObfuscatedName("client.Wg")
	public static int field456;

	@ObfuscatedName("client.Yg")
	public static int field458;

	@ObfuscatedName("client.bh")
	public static int field461;

	@ObfuscatedName("client.eh")
	public static int field464;

	@ObfuscatedName("client.gh")
	public int field466;

	@ObfuscatedName("client.hh")
	public int field467;

	@ObfuscatedName("client.ih")
	public int field468;

	@ObfuscatedName("client.jh")
	public int field469;

	@ObfuscatedName("client.ph")
	public int field475;

	@ObfuscatedName("client.th")
	public int field479;

	@ObfuscatedName("client.Hh")
	public int field493;

	@ObfuscatedName("client.Sh")
	public int field504;

	@ObfuscatedName("client.Zh")
	public int field511;

	@ObfuscatedName("client.ai")
	public int field512;

	@ObfuscatedName("client.bi")
	public int field513;

	@ObfuscatedName("client.ci")
	public int field514;

	@ObfuscatedName("client.di")
	public int field515;

	@ObfuscatedName("client.ei")
	public int field516;

	@ObfuscatedName("client.fi")
	public int field517;

	@ObfuscatedName("client.gi")
	public int field518;

	@ObfuscatedName("client.hi")
	public int field519;

	@ObfuscatedName("client.ji")
	public int field521;

	@ObfuscatedName("client.ki")
	public int field522;

	@ObfuscatedName("client.li")
	public int field523;

	@ObfuscatedName("client.oi")
	public static int field526;

	@ObfuscatedName("client.ri")
	public int field529;

	@ObfuscatedName("client.ti")
	public static int field531;

	@ObfuscatedName("client.vi")
	public static int field533;

	@ObfuscatedName("client.wi")
	public int field534;

	@ObfuscatedName("client.zi")
	public int field537;

	@ObfuscatedName("client.Ci")
	public int field540;

	@ObfuscatedName("client.Ei")
	public int field542;

	@ObfuscatedName("client.Ki")
	public int field548;

	@ObfuscatedName("client.Li")
	public int field549;

	@ObfuscatedName("client.Mi")
	public int field550;

	@ObfuscatedName("client.Ni")
	public int field551;

	@ObfuscatedName("client.Ui")
	public int field558;

	@ObfuscatedName("client.Vi")
	public int field559;

	@ObfuscatedName("client.Wi")
	public int field560;

	@ObfuscatedName("client.bj")
	public int field565;

	@ObfuscatedName("client.cj")
	public int field566;

	@ObfuscatedName("client.fj")
	public int field569;

	@ObfuscatedName("client.mj")
	public int field576;

	@ObfuscatedName("client.qj")
	public int field580;

	@ObfuscatedName("client.vj")
	public int field585;

	@ObfuscatedName("client.Aj")
	public int field590;

	@ObfuscatedName("client.Fj")
	public int field595;

	@ObfuscatedName("client.Gj")
	public int field596;

	@ObfuscatedName("client.Ij")
	public int field598;

	@ObfuscatedName("client.Jj")
	public int field599;

	@ObfuscatedName("client.Kj")
	public int field600;

	@ObfuscatedName("client.Lj")
	public int field601;

	@ObfuscatedName("client.Mj")
	public int field602;

	@ObfuscatedName("client.Nj")
	public int field603;

	@ObfuscatedName("client.Oj")
	public int field604;

	@ObfuscatedName("client.Pj")
	public static int field605;

	@ObfuscatedName("client.Vj")
	public int field611;

	@ObfuscatedName("client.Zj")
	public int field615;

	@ObfuscatedName("client.ck")
	public int field618;

	@ObfuscatedName("client.ek")
	public int field620;

	@ObfuscatedName("client.fk")
	public static int field621;

	@ObfuscatedName("client.jk")
	public int field625;

	@ObfuscatedName("client.kk")
	public int field626;

	@ObfuscatedName("client.lk")
	public int field627;

	@ObfuscatedName("client.mk")
	public int field628;

	@ObfuscatedName("client.nk")
	public static int field629;

	@ObfuscatedName("client.Xb")
	public long field198;

	@ObfuscatedName("client.zc")
	public long field226;

	@ObfuscatedName("client.Dg")
	public long field437;

	@ObfuscatedName("client.ni")
	public long field525;

	@ObfuscatedName("client.Ii")
	public long field546;

	@ObfuscatedName("client.Jb")
	public Jagfile field184;

	@ObfuscatedName("client.Gi")
	public MouseTracking field544;

	@ObfuscatedName("client.ie")
	public Pix32 field313;

	@ObfuscatedName("client.je")
	public Pix32 field314;

	@ObfuscatedName("client.Be")
	public Pix32 field332;

	@ObfuscatedName("client.Ce")
	public Pix32 field333;

	@ObfuscatedName("client.Af")
	public Pix32 field382;

	@ObfuscatedName("client.Qf")
	public Pix32 field398;

	@ObfuscatedName("client.Rf")
	public Pix32 field399;

	@ObfuscatedName("client.eg")
	public Pix32 field412;

	@ObfuscatedName("client.kg")
	public Pix32 field418;

	@ObfuscatedName("client.Ch")
	public Pix32 field488;

	@ObfuscatedName("client.Dh")
	public Pix32 field489;

	@ObfuscatedName("client.Eh")
	public Pix32 field490;

	@ObfuscatedName("client.Fh")
	public Pix32 field491;

	@ObfuscatedName("client.Gh")
	public Pix32 field492;

	@ObfuscatedName("client.Fi")
	public Pix32 field543;

	@ObfuscatedName("client.pe")
	public ClientStream field320;

	@ObfuscatedName("client.bc")
	public PixMap field202;

	@ObfuscatedName("client.cc")
	public PixMap field203;

	@ObfuscatedName("client.dc")
	public PixMap field204;

	@ObfuscatedName("client.ec")
	public PixMap field205;

	@ObfuscatedName("client.fc")
	public PixMap field206;

	@ObfuscatedName("client.gc")
	public PixMap field207;

	@ObfuscatedName("client.hc")
	public PixMap field208;

	@ObfuscatedName("client.ic")
	public PixMap field209;

	@ObfuscatedName("client.jc")
	public PixMap field210;

	@ObfuscatedName("client.Wf")
	public PixMap field404;

	@ObfuscatedName("client.Xf")
	public PixMap field405;

	@ObfuscatedName("client.Yf")
	public PixMap field406;

	@ObfuscatedName("client.Sg")
	public PixMap field452;

	@ObfuscatedName("client.Tg")
	public PixMap field453;

	@ObfuscatedName("client.Ug")
	public PixMap field454;

	@ObfuscatedName("client.Vg")
	public PixMap field455;

	@ObfuscatedName("client.Ih")
	public PixMap field494;

	@ObfuscatedName("client.Jh")
	public PixMap field495;

	@ObfuscatedName("client.Kh")
	public PixMap field496;

	@ObfuscatedName("client.Lh")
	public PixMap field497;

	@ObfuscatedName("client.Mh")
	public PixMap field498;

	@ObfuscatedName("client.Nh")
	public PixMap field499;

	@ObfuscatedName("client.Oh")
	public PixMap field500;

	@ObfuscatedName("client.Ph")
	public PixMap field501;

	@ObfuscatedName("client.Qh")
	public PixMap field502;

	@ObfuscatedName("client.Ye")
	public PixFont field355;

	@ObfuscatedName("client.Ze")
	public PixFont field356;

	@ObfuscatedName("client.af")
	public PixFont field357;

	@ObfuscatedName("client.bf")
	public PixFont field358;

	@ObfuscatedName("client.ah")
	public World3D field460;

	@ObfuscatedName("client.Ub")
	public Isaac field195;

	@ObfuscatedName("client.Bb")
	public Pix8 field176;

	@ObfuscatedName("client.Cb")
	public Pix8 field177;

	@ObfuscatedName("client.Db")
	public Pix8 field178;

	@ObfuscatedName("client.Eb")
	public Pix8 field179;

	@ObfuscatedName("client.Fb")
	public Pix8 field180;

	@ObfuscatedName("client.id")
	public Pix8 field261;

	@ObfuscatedName("client.jd")
	public Pix8 field262;

	@ObfuscatedName("client.kd")
	public Pix8 field263;

	@ObfuscatedName("client.Ad")
	public Pix8 field279;

	@ObfuscatedName("client.Bd")
	public Pix8 field280;

	@ObfuscatedName("client.Cd")
	public Pix8 field281;

	@ObfuscatedName("client.Dd")
	public Pix8 field282;

	@ObfuscatedName("client.Ed")
	public Pix8 field283;

	@ObfuscatedName("client.Jf")
	public Pix8 field391;

	@ObfuscatedName("client.Kf")
	public Pix8 field392;

	@ObfuscatedName("client.vh")
	public Pix8 field481;

	@ObfuscatedName("client.wh")
	public Pix8 field482;

	@ObfuscatedName("client.xh")
	public Pix8 field483;

	@ObfuscatedName("client.yj")
	public Pix8 field588;

	@ObfuscatedName("client.zj")
	public Pix8 field589;

	@ObfuscatedName("client.dh")
	public static ClientPlayer field463;

	@ObfuscatedName("client.xj")
	public OnDemand field587;

	@ObfuscatedName("client.se")
	public String field323;

	@ObfuscatedName("client.Xe")
	public String field354;

	@ObfuscatedName("client.Mg")
	public String field446;

	@ObfuscatedName("client.kh")
	public String field470;

	@ObfuscatedName("client.ii")
	public Socket field520;

	@ObfuscatedName("client.pb")
	public static boolean field164;

	@ObfuscatedName("client.vc")
	public static boolean field222;

	@ObfuscatedName("client.fd")
	public static boolean field258;

	@ObfuscatedName("client.Qd")
	public static boolean field295;

	@ObfuscatedName("client.Rh")
	public static boolean field503;

	@ObfuscatedName("client.db")
	public int[] field152;

	@ObfuscatedName("client.eb")
	public int[] field153;

	@ObfuscatedName("client.fb")
	public int[] field154;

	@ObfuscatedName("client.Rd")
	public int[] field296;

	@ObfuscatedName("client.Sd")
	public int[] field297;

	@ObfuscatedName("client.Td")
	public int[] field298;

	@ObfuscatedName("client.Ud")
	public int[] field299;

	@ObfuscatedName("client.yf")
	public int[] field380;

	@ObfuscatedName("client.zf")
	public int[] field381;

	@ObfuscatedName("client.mh")
	public int[] field472;

	@ObfuscatedName("client.nh")
	public int[] field473;

	@ObfuscatedName("client.Qj")
	public int[] field606;

	@ObfuscatedName("client.Rj")
	public int[] field607;

	@ObfuscatedName("client.Sj")
	public int[] field608;

	@ObfuscatedName("client.Tj")
	public int[] field609;

	@ObfuscatedName("client.fg")
	public Pix8[] field413;

	@ObfuscatedName("client.L")
	public byte[][] field134;

	@ObfuscatedName("client.qi")
	public byte[][] field528;

	@ObfuscatedName("client.ng")
	public byte[][][] field421;

	@ObfuscatedName("client.Mb")
	public int[][][] field187;

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method33(String arg0, int arg1) {
		if (arg0 == null || arg0.length() == 0) {
			this.field158 = 0;
			return;
		}
		String var3 = arg0;
		String[] var4 = new String[100];
		int var5 = 0;
		while (true) {
			int var6 = var3.indexOf(" ");
			if (var6 == -1) {
				String var8 = var3.trim();
				if (var8.length() > 0) {
					var4[var5++] = var8.toLowerCase();
				}
				this.field158 = 0;
				if (arg1 != 2) {
					this.field255 = !this.field255;
				}
				label56: for (int var9 = 0; var9 < ObjType.field817; var9++) {
					ObjType var10 = ObjType.method221(var9);
					if (var10.field825 == -1 && var10.field811 != null) {
						String var11 = var10.field811.toLowerCase();
						for (int var12 = 0; var12 < var5; var12++) {
							if (var11.indexOf(var4[var12]) == -1) {
								continue label56;
							}
						}
						this.field159[this.field158] = var11;
						this.field160[this.field158] = var9;
						this.field158++;
						if (this.field158 >= this.field159.length) {
							return;
						}
					}
				}
				return;
			}
			String var7 = var3.substring(0, var6).trim();
			if (var7.length() > 0) {
				var4[var5++] = var7.toLowerCase();
			}
			var3 = var3.substring(var6 + 1);
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method34(boolean arg0) {
		// CLOSE_MODAL
		this.field260.p1isaac((byte) 4, 110);
		if (arg0) {
			this.field619 = null;
		}
		if (this.field385 != -1) {
			this.method64(field486, this.field385);
			this.field385 = -1;
			this.field477 = true;
			this.field535 = false;
			this.field246 = true;
		}
		if (this.field284 != -1) {
			this.method64(field486, this.field284);
			this.field284 = -1;
			this.field536 = true;
			this.field535 = false;
		}
		if (this.field349 != -1) {
			this.method64(field486, this.field349);
			this.field349 = -1;
			this.field342 = true;
		}
		if (this.field256 != -1) {
			this.method64(field486, this.field256);
			this.field256 = -1;
		}
		if (this.field465 != -1) {
			this.method64(field486, this.field465);
			this.field465 = -1;
		}
	}

	@ObfuscatedName("client.a(IBLMFMVIYHT;)V")
	public final void method35(int arg0, byte arg1, Packet arg2) {
		while (true) {
			if (arg2.field1281 + 10 < arg0 * 8) {
				int var4 = arg2.gBit(402, 11);
				if (var4 != 2047) {
					if (this.field266[var4] == null) {
						this.field266[var4] = new ClientPlayer();
						if (this.field271[var4] != null) {
							this.field266[var4].method574(this.field271[var4], 0);
						}
					}
					this.field268[this.field267++] = var4;
					ClientPlayer var5 = this.field266[var4];
					var5.field1132 = field621;
					int var6 = arg2.gBit(402, 5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg2.gBit(402, 1);
					if (var7 == 1) {
						this.field270[this.field269++] = var4;
					}
					int var8 = arg2.gBit(402, 1);
					int var9 = arg2.gBit(402, 5);
					if (var9 > 15) {
						var9 -= 32;
					}
					var5.method354(field463.field1134[0] + var9, (byte) 5, var8 == 1, field463.field1133[0] + var6);
					continue;
				}
			}
			arg2.accessBytes(-29290);
			if (arg1 == 6) {
				boolean var10 = false;
				return;
			}
			this.field166 = -1;
			return;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 377);
			if (arg0.length == 5) {
				field219 = Integer.parseInt(arg0[0]);
				field220 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method124(true);
				} else if (arg0[2].equals("highmem")) {
					method47(true);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					field221 = false;
				} else if (arg0[3].equals("members")) {
					field221 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.method266(field321, 503, 765);
			} else if (arg0.length == 0) {
				// 10 0 highmem members 32
				field219 = 10;
				field220 = 0;
				method47(true);
				field221 = true;
				signlink.storeid = 32;
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.method266(field321, 503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method36(byte arg0) {
		this.field616 = true;
		if (arg0 == 4) {
			boolean var2 = false;
		} else {
			this.field619 = null;
		}
		try {
			long var3 = System.currentTimeMillis();
			int var5 = 0;
			int var6 = 20;
			while (this.field539) {
				this.field397++;
				this.method103((byte) 1);
				this.method103((byte) 1);
				this.method121(47);
				var5++;
				if (var5 > 10) {
					long var7 = System.currentTimeMillis();
					int var9 = (int) (var7 - var3) / 10 - var6;
					var6 = 40 - var9;
					if (var6 < 5) {
						var6 = 5;
					}
					var5 = 0;
					var3 = var7;
				}
				try {
					Thread.sleep((long) var6);
				} catch (Exception var10) {
				}
			}
		} catch (Exception var11) {
		}
		this.field616 = false;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method37(byte arg0) {
		if (arg0 != 3) {
			return;
		}
		for (LocChange var2 = (LocChange) this.field557.method6(); var2 != null; var2 = (LocChange) this.field557.method8(1)) {
			if (var2.field1322 == -1) {
				var2.field1327 = 0;
				this.method167((byte) -61, var2);
			} else {
				var2.method604();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method38(String arg0) {
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

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method39(int arg0, int arg1) {
		if (arg1 >= 0) {
			throw new NullPointerException();
		} else if (arg0 < 100000) {
			return String.valueOf(arg0);
		} else if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		} else {
			return arg0 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method40(int arg0) {
		this.field266 = null;
		this.field268 = null;
		this.field270 = null;
		this.field271 = null;
		this.field591 = null;
		this.field202 = null;
		this.field203 = null;
		this.field204 = null;
		this.field205 = null;
		this.field176 = null;
		this.field177 = null;
		this.field178 = null;
		this.field179 = null;
		this.field180 = null;
		this.field279 = null;
		this.field280 = null;
		this.field281 = null;
		this.field282 = null;
		this.field283 = null;
		this.field145 = null;
		this.field426 = null;
		this.field563 = null;
		this.field404 = null;
		this.field405 = null;
		this.field406 = null;
		this.field335 = null;
		this.field152 = null;
		this.field134 = null;
		this.field528 = null;
		this.field153 = null;
		this.field154 = null;
		this.field499 = null;
		this.field500 = null;
		this.field501 = null;
		this.field502 = null;
		this.field181 = null;
		this.field485 = null;
		this.field419 = null;
		this.field420 = null;
		this.field488 = null;
		this.field489 = null;
		this.field490 = null;
		this.field491 = null;
		this.field492 = null;
		if (this.field544 != null) {
			this.field544.field94 = false;
		}
		this.field544 = null;
		this.field261 = null;
		this.field262 = null;
		this.field263 = null;
		this.field206 = null;
		this.field207 = null;
		this.field208 = null;
		this.field209 = null;
		this.field210 = null;
		this.field187 = null;
		this.field421 = null;
		this.field460 = null;
		this.field556 = null;
		this.field418 = null;
		this.field497 = null;
		this.field498 = null;
		this.field494 = null;
		this.field495 = null;
		this.field496 = null;
		this.field412 = null;
		this.field478 = null;
		this.field584 = null;
		this.field375 = null;
		this.field250 = null;
		this.field192 = null;
		this.method70(false);
		this.field260 = null;
		this.field225 = null;
		this.field484 = null;
		this.field452 = null;
		this.field453 = null;
		this.field454 = null;
		this.field455 = null;
		this.field481 = null;
		this.field482 = null;
		this.field483 = null;
		try {
			if (this.field320 != null) {
				this.field320.method233();
			}
		} catch (Exception var3) {
		}
		this.field320 = null;
		this.field373 = null;
		this.field374 = null;
		this.field574 = null;
		this.field428 = null;
		this.field430 = null;
		this.field541 = null;
		this.field427 = null;
		this.field449 = null;
		this.field327 = null;
		this.field182 = null;
		this.field272 = null;
		this.field578 = null;
		this.field506 = null;
		this.field382 = null;
		if (this.field587 != null) {
			this.field587.method596();
		}
		this.field587 = null;
		this.field275 = null;
		this.field276 = null;
		this.field277 = null;
		this.field278 = null;
		this.field480 = null;
		this.field619 = null;
		int var2 = 96 / arg0;
		this.field557 = null;
		this.method168(28614);
		LocType.method571(false);
		NpcType.method471(false);
		ObjType.method231(false);
		Component.method211(false);
		FloType.field796 = null;
		IdkType.field1699 = null;
		UnkType.field66 = null;
		SeqType.field775 = null;
		SpotAnimType.field1297 = null;
		SpotAnimType.field1309 = null;
		VarpType.field1507 = null;
		super.field952 = null;
		ClientPlayer.field1683 = null;
		Pix3D.method544(false);
		World3D.method273(false);
		Model.method355(false);
		AnimFrame.method263(false);
		System.gc();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method41(boolean arg0) {
		if (arg0 || super.field965 != 1) {
			return;
		}
		if (super.field966 >= 539 && super.field966 <= 573 && super.field967 >= 169 && super.field967 < 205 && this.field377[0] != -1) {
			this.field477 = true;
			this.field581 = 0;
			this.field246 = true;
		}
		if (super.field966 >= 569 && super.field966 <= 599 && super.field967 >= 168 && super.field967 < 205 && this.field377[1] != -1) {
			this.field477 = true;
			this.field581 = 1;
			this.field246 = true;
		}
		if (super.field966 >= 597 && super.field966 <= 627 && super.field967 >= 168 && super.field967 < 205 && this.field377[2] != -1) {
			this.field477 = true;
			this.field581 = 2;
			this.field246 = true;
		}
		if (super.field966 >= 625 && super.field966 <= 669 && super.field967 >= 168 && super.field967 < 203 && this.field377[3] != -1) {
			this.field477 = true;
			this.field581 = 3;
			this.field246 = true;
		}
		if (super.field966 >= 666 && super.field966 <= 696 && super.field967 >= 168 && super.field967 < 205 && this.field377[4] != -1) {
			this.field477 = true;
			this.field581 = 4;
			this.field246 = true;
		}
		if (super.field966 >= 694 && super.field966 <= 724 && super.field967 >= 168 && super.field967 < 205 && this.field377[5] != -1) {
			this.field477 = true;
			this.field581 = 5;
			this.field246 = true;
		}
		if (super.field966 >= 722 && super.field966 <= 756 && super.field967 >= 169 && super.field967 < 205 && this.field377[6] != -1) {
			this.field477 = true;
			this.field581 = 6;
			this.field246 = true;
		}
		if (super.field966 >= 540 && super.field966 <= 574 && super.field967 >= 466 && super.field967 < 502 && this.field377[7] != -1) {
			this.field477 = true;
			this.field581 = 7;
			this.field246 = true;
		}
		if (super.field966 >= 572 && super.field966 <= 602 && super.field967 >= 466 && super.field967 < 503 && this.field377[8] != -1) {
			this.field477 = true;
			this.field581 = 8;
			this.field246 = true;
		}
		if (super.field966 >= 599 && super.field966 <= 629 && super.field967 >= 466 && super.field967 < 503 && this.field377[9] != -1) {
			this.field477 = true;
			this.field581 = 9;
			this.field246 = true;
		}
		if (super.field966 >= 627 && super.field966 <= 671 && super.field967 >= 467 && super.field967 < 502 && this.field377[10] != -1) {
			this.field477 = true;
			this.field581 = 10;
			this.field246 = true;
		}
		if (super.field966 >= 669 && super.field966 <= 699 && super.field967 >= 466 && super.field967 < 503 && this.field377[11] != -1) {
			this.field477 = true;
			this.field581 = 11;
			this.field246 = true;
		}
		if (super.field966 >= 696 && super.field966 <= 726 && super.field967 >= 466 && super.field967 < 503 && this.field377[12] != -1) {
			this.field477 = true;
			this.field581 = 12;
			this.field246 = true;
		}
		if (super.field966 >= 724 && super.field966 <= 758 && super.field967 >= 466 && super.field967 < 502 && this.field377[13] != -1) {
			this.field477 = true;
			this.field581 = 13;
			this.field246 = true;
			return;
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method42(int arg0) {
		int var2 = 61 / arg0;
		try {
			int var3 = field463.field1157 + this.field149;
			int var4 = field463.field1158 + this.field305;
			if (this.field558 - var3 < -500 || this.field558 - var3 > 500 || this.field559 - var4 < -500 || this.field559 - var4 > 500) {
				this.field558 = var3;
				this.field559 = var4;
			}
			if (this.field558 != var3) {
				this.field558 += (var3 - this.field558) / 16;
			}
			if (this.field559 != var4) {
				this.field559 += (var4 - this.field559) / 16;
			}
			if (super.field969[1] == 1) {
				this.field549 += (-24 - this.field549) / 2;
			} else if (super.field969[2] == 1) {
				this.field549 += (24 - this.field549) / 2;
			} else {
				this.field549 /= 2;
			}
			if (super.field969[3] == 1) {
				this.field550 += (12 - this.field550) / 2;
			} else if (super.field969[4] == 1) {
				this.field550 += (-12 - this.field550) / 2;
			} else {
				this.field550 /= 2;
			}
			this.field548 = this.field549 / 2 + this.field548 & 0x7FF;
			this.field547 += this.field550 / 2;
			if (this.field547 < 128) {
				this.field547 = 128;
			}
			if (this.field547 > 383) {
				this.field547 = 383;
			}
			int var5 = this.field558 >> 7;
			int var6 = this.field559 >> 7;
			int var7 = this.method133(this.field559, this.field558, (byte) 9, this.field387);
			int var8 = 0;
			if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
				for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
					for (int var10 = var6 - 4; var10 <= var6 + 4; var10++) {
						int var11 = this.field387;
						if (var11 < 3 && (this.field421[1][var9][var10] & 0x2) == 2) {
							var11++;
						}
						int var12 = var7 - this.field187[var11][var9][var10];
						if (var12 > var8) {
							var8 = var12;
						}
					}
				}
			}
			int var13 = var8 * 192;
			if (var13 > 98048) {
				var13 = 98048;
			}
			if (var13 < 32768) {
				var13 = 32768;
			}
			if (var13 > this.field585) {
				this.field585 += (var13 - this.field585) / 24;
			} else if (var13 < this.field585) {
				this.field585 += (var13 - this.field585) / 80;
			}
		} catch (Exception var14) {
			signlink.reporterror("glfc_ex " + field463.field1157 + "," + field463.field1158 + "," + this.field558 + "," + this.field559 + "," + this.field185 + "," + this.field186 + "," + this.field336 + "," + this.field337);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LEWIXBTLV;I)Z")
	public final boolean method43(Component arg0, int arg1) {
		int var3 = 98 / arg1;
		int var4 = arg0.field724;
		if (var4 >= 1 && var4 <= 200 || !(var4 < 701 || var4 > 900)) {
			if (var4 >= 801) {
				var4 -= 701;
			} else if (var4 >= 701) {
				var4 -= 601;
			} else if (var4 >= 101) {
				var4 -= 101;
			} else {
				var4--;
			}
			this.field480[this.field479] = "Remove @whi@" + this.field145[var4];
			this.field277[this.field479] = 775;
			this.field479++;
			this.field480[this.field479] = "Message @whi@" + this.field145[var4];
			this.field277[this.field479] = 984;
			this.field479++;
			return true;
		} else if (var4 >= 401 && var4 <= 500) {
			this.field480[this.field479] = "Remove @whi@" + arg0.field712;
			this.field277[this.field479] = 859;
			this.field479++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method44(boolean arg0, byte[] arg1, int arg2) {
		if (this.field562) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
			int var4 = 71 / arg2;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method45(int arg0) {
		if (arg0 != 0) {
			this.field260.p1(186);
		}
		this.field573 = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.field622[var2] = -1;
			for (int var3 = 0; var3 < IdkType.field1698; var3++) {
				if (!IdkType.field1699[var3].field1705 && IdkType.field1699[var3].field1700 == var2 + (this.field440 ? 0 : 7)) {
					this.field622[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method46(int arg0, int arg1) {
		LinkList var3 = this.field619[this.field387][arg0][arg1];
		if (var3 == null) {
			this.field460.method295(this.field387, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.method6(); var6 != null; var6 = (ClientObj) var3.method8(1)) {
			ObjType var11 = ObjType.method221(var6.field873);
			int var12 = var11.field827;
			if (var11.field853) {
				var12 = (var6.field875 + 1) * var12;
			}
			if (var12 > var4) {
				var4 = var12;
				var5 = var6;
			}
		}
		var3.method4((byte) -57, var5);
		ClientObj var7 = null;
		ClientObj var8 = null;
		for (ClientObj var9 = (ClientObj) var3.method6(); var9 != null; var9 = (ClientObj) var3.method8(1)) {
			if (var5.field873 != var9.field873 && var7 == null) {
				var7 = var9;
			}
			if (var5.field873 != var9.field873 && var7.field873 != var9.field873 && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.field460.method281(this.method133(arg1 * 128 + 64, arg0 * 128 + 64, (byte) 9, this.field387), this.field387, var5, var7, var10, var8, 2, arg1, arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public static final void method47(boolean arg0) {
		World3D.field1013 = false;
		Pix3D.field1589 = false;
		field222 = false;
		World.field132 = false;
		if (!arg0) {
			field321 = 143;
		}
		LocType.field1626 = false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method48(byte arg0) {
		if (this.field353 > 1) {
			this.field353--;
		}
		if (this.field169 > 0) {
			this.field169--;
		}
		for (int var2 = 0; var2 < 5 && this.method53(21389); var2++) {
		}
		if (!this.field433) {
			return;
		}
		Object var3 = this.field544.field96;
		synchronized (this.field544.field96) {
			if (!field258) {
				this.field544.field99 = 0;
			} else if (super.field965 != 0 || this.field544.field99 >= 40) {
				// EVENT_MOUSE_MOVE
				this.field260.p1isaac((byte) 4, 171);
				this.field260.p1(0);
				int var4 = this.field260.pos;
				int var5 = 0;
				for (int var6 = 0; var6 < this.field544.field99 && var4 - this.field260.pos < 240; var6++) {
					var5++;
					int var7 = this.field544.field95[var6];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 502) {
						var7 = 502;
					}
					int var8 = this.field544.field100[var6];
					if (var8 < 0) {
						var8 = 0;
					} else if (var8 > 764) {
						var8 = 764;
					}
					int var9 = var7 * 765 + var8;
					if (this.field544.field95[var6] == -1 && this.field544.field100[var6] == -1) {
						var8 = -1;
						var7 = -1;
						var9 = 524287;
					}
					if (this.field307 != var8 || this.field308 != var7) {
						int var10 = var8 - this.field307;
						this.field307 = var8;
						int var11 = var7 - this.field308;
						this.field308 = var7;
						if (this.field595 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
							var10 += 32;
							var11 += 32;
							this.field260.p2((this.field595 << 12) + (var10 << 6) + var11);
							this.field595 = 0;
						} else if (this.field595 < 8) {
							this.field260.p3((this.field595 << 19) + 8388608 + var9);
							this.field595 = 0;
						} else {
							this.field260.p4((this.field595 << 19) + -1073741824 + var9);
							this.field595 = 0;
						}
					} else if (this.field595 < 2047) {
						this.field595++;
					}
				}
				this.field260.psize1(this.field260.pos - var4, 0);
				if (var5 >= this.field544.field99) {
					this.field544.field99 = 0;
				} else {
					this.field544.field99 -= var5;
					for (int var12 = 0; var12 < this.field544.field99; var12++) {
						this.field544.field100[var12] = this.field544.field100[var5 + var12];
						this.field544.field95[var12] = this.field544.field95[var5 + var12];
					}
				}
			}
		}
		if (super.field965 != 0) {
			long var13 = (super.field968 - this.field198) / 50L;
			if (var13 > 4095L) {
				var13 = 4095L;
			}
			this.field198 = super.field968;
			int var15 = super.field967;
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 502) {
				var15 = 502;
			}
			int var16 = super.field966;
			if (var16 < 0) {
				var16 = 0;
			} else if (var16 > 764) {
				var16 = 764;
			}
			int var17 = var15 * 765 + var16;
			byte var18 = 0;
			if (super.field965 == 2) {
				var18 = 1;
			}
			int var19 = (int) var13;
			// EVENT_MOUSE_CLICK
			this.field260.p1isaac((byte) 4, 19);
			this.field260.p4((var18 << 19) + (var19 << 20) + var17);
		}
		if (this.field560 > 0) {
			this.field560--;
		}
		if (super.field969[1] == 1 || super.field969[2] == 1 || super.field969[3] == 1 || super.field969[4] == 1) {
			this.field561 = true;
		}
		if (this.field561 && this.field560 <= 0) {
			this.field560 = 20;
			this.field561 = false;
			this.field260.p1isaac((byte) 4, 140);
			this.field260.p2_alt1(0, this.field547);
			this.field260.p2_alt1(0, this.field548);
		}
		if (super.field956 && !this.field571) {
			this.field571 = true;
			this.field260.p1isaac((byte) 4, 187);
			this.field260.p1(1);
		}
		if (!super.field956 && this.field571) {
			this.field571 = false;
			this.field260.p1isaac((byte) 4, 187);
			this.field260.p1(0);
		}
		this.method170((byte) -40);
		this.method56(16220);
		this.method179(-23763);
		this.field167++;
		if (this.field167 > 750) {
			this.method79(1);
		}
		this.method123(0);
		this.method89(-37214);
		this.method107(0);
		this.field247++;
		if (this.field319 != 0) {
			this.field318 += 20;
			if (this.field318 >= 400) {
				this.field319 = 0;
			}
		}
		if (this.field628 != 0) {
			this.field625++;
			if (this.field625 >= 15) {
				if (this.field628 == 2) {
					this.field477 = true;
				}
				if (this.field628 == 3) {
					this.field536 = true;
				}
				this.field628 = 0;
			}
		}
		if (this.field409 != 0) {
			this.field565++;
			if (super.field959 > this.field410 + 5 || super.field959 < this.field410 - 5 || super.field960 > this.field411 + 5 || super.field960 < this.field411 - 5) {
				this.field451 = true;
			}
			if (super.field958 == 0) {
				if (this.field409 == 2) {
					this.field477 = true;
				}
				if (this.field409 == 3) {
					this.field536 = true;
				}
				this.field409 = 0;
				if (this.field451 && this.field565 >= 5) {
					this.field360 = -1;
					this.method114(-521);
					if (this.field407 == this.field360 && this.field408 != this.field359) {
						Component var20 = Component.method204(this.field407);
						byte var21 = 0;
						if (this.field251 == 1 && var20.field724 == 206) {
							var21 = 1;
						}
						if (var20.field751[this.field359] <= 0) {
							var21 = 0;
						}
						if (var20.field699) {
							int var22 = this.field408;
							int var23 = this.field359;
							var20.field751[var23] = var20.field751[var22];
							var20.field706[var23] = var20.field706[var22];
							var20.field751[var22] = -1;
							var20.field706[var22] = 0;
						} else if (var21 == 1) {
							int var24 = this.field408;
							int var25 = this.field359;
							while (var24 != var25) {
								if (var24 > var25) {
									var20.method205(var24 - 1, -291, var24);
									var24--;
								} else if (var24 < var25) {
									var20.method205(var24 + 1, -291, var24);
									var24++;
								}
							}
						} else {
							var20.method205(this.field359, -291, this.field408);
						}
						// INV_BUTTOND
						this.field260.p1isaac((byte) 4, 123);
						this.field260.p2_alt3(3, this.field359);
						this.field260.p1_alt1(false, var21);
						this.field260.p2_alt2(this.field407, 0);
						this.field260.p2_alt1(0, this.field408);
					}
				} else if ((this.field596 == 1 || this.method150(this.field479 - 1, this.field457)) && this.field479 > 2) {
					this.method131(811);
				} else if (this.field479 > 0) {
					this.method144(this.field479 - 1, 8);
				}
				this.field625 = 10;
				super.field965 = 0;
			}
		}
		if (World3D.field1047 != -1) {
			int var26 = World3D.field1047;
			int var27 = World3D.field1048;
			boolean var28 = this.method55(true, false, var27, field463.field1134[0], 0, 0, 0, 0, var26, 0, 0, field463.field1133[0]);
			World3D.field1047 = -1;
			if (var28) {
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 1;
				this.field318 = 0;
			}
		}
		if (super.field965 == 1 && this.field354 != null) {
			this.field354 = null;
			this.field536 = true;
			super.field965 = 0;
		}
		this.method74(0);
		if (this.field349 == -1) {
			this.method173((byte) 4);
			this.method41(false);
			this.method59(true);
		}
		if (super.field958 == 1 || super.field965 == 1) {
			this.field390++;
		}
		if (this.field580 == 0 && this.field340 == 0 && this.field425 == 0) {
			if (this.field189 > 0) {
				this.field189--;
			}
		} else if (this.field189 < 100) {
			this.field189++;
			if (this.field189 == 100) {
				if (this.field580 != 0) {
					this.field536 = true;
				}
				if (this.field340 != 0) {
					this.field477 = true;
				}
			}
		}
		if (this.field367 == 2) {
			this.method42(409);
		}
		if (this.field367 == 2 && this.field507) {
			this.method49(this.field255);
		}
		for (int var29 = 0; var29 < 5; var29++) {
			int var10002 = this.field441[var29]++;
		}
		this.method50((byte) 2);
		super.field957++;
		if (super.field957 > 4500) {
			this.field169 = 250;
			super.field957 -= 500;
			// IDLE_TIMER
			this.field260.p1isaac((byte) 4, 202);
		}
		this.field414++;
		if (this.field414 > 500) {
			this.field414 = 0;
			int var30 = (int) (Math.random() * 8.0D);
			if ((var30 & 0x1) == 1) {
				this.field149 += this.field150;
			}
			if ((var30 & 0x2) == 2) {
				this.field305 += this.field306;
			}
			if ((var30 & 0x4) == 4) {
				this.field551 += this.field552;
			}
		}
		if (this.field149 < -50) {
			this.field150 = 2;
		}
		if (this.field149 > 50) {
			this.field150 = -2;
		}
		if (this.field305 < -55) {
			this.field306 = 2;
		}
		if (this.field305 > 55) {
			this.field306 = -2;
		}
		if (this.field551 < -40) {
			this.field552 = 1;
		}
		if (this.field551 > 40) {
			this.field552 = -1;
		}
		this.field341++;
		if (this.field341 > 500) {
			this.field341 = 0;
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x1) == 1) {
				this.field212 += this.field213;
			}
			if ((var31 & 0x2) == 2) {
				this.field529 += this.field530;
			}
		}
		if (this.field212 < -60) {
			this.field213 = 2;
		}
		if (this.field212 > 60) {
			this.field213 = -2;
		}
		if (this.field529 < -20) {
			this.field530 = 1;
		}
		if (this.field529 > 10) {
			this.field530 = -1;
		}
		this.field168++;
		if (arg0 != 4) {
			this.field166 = this.field484.g1();
		}
		if (this.field168 > 50) {
			// NO_TIMEOUT
			this.field260.p1isaac((byte) 4, 40);
		}
		try {
			if (this.field320 != null && this.field260.pos > 0) {
				this.field320.method237(0, this.field260.pos, 0, this.field260.data);
				this.field260.pos = 0;
				this.field168 = 0;
			}
		} catch (IOException var33) {
			this.method79(1);
		} catch (Exception var34) {
			this.method148(true);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method49(boolean arg0) {
		int var2 = this.field170 * 128 + 64;
		int var3 = this.field171 * 128 + 64;
		int var4 = this.method133(var3, var2, (byte) 9, this.field387) - this.field172;
		if (this.field512 < var2) {
			this.field512 += (var2 - this.field512) * this.field174 / 1000 + this.field173;
			if (this.field512 > var2) {
				this.field512 = var2;
			}
		}
		if (this.field512 > var2) {
			this.field512 -= (this.field512 - var2) * this.field174 / 1000 + this.field173;
			if (this.field512 < var2) {
				this.field512 = var2;
			}
		}
		if (this.field513 < var4) {
			this.field513 += (var4 - this.field513) * this.field174 / 1000 + this.field173;
			if (this.field513 > var4) {
				this.field513 = var4;
			}
		}
		if (this.field513 > var4) {
			this.field513 -= (this.field513 - var4) * this.field174 / 1000 + this.field173;
			if (this.field513 < var4) {
				this.field513 = var4;
			}
		}
		if (this.field514 < var3) {
			this.field514 += (var3 - this.field514) * this.field174 / 1000 + this.field173;
			if (this.field514 > var3) {
				this.field514 = var3;
			}
		}
		if (this.field514 > var3) {
			this.field514 -= (this.field514 - var3) * this.field174 / 1000 + this.field173;
			if (this.field514 < var3) {
				this.field514 = var3;
			}
		}
		int var5 = this.field289 * 128 + 64;
		int var6 = this.field290 * 128 + 64;
		int var7 = this.method133(var6, var5, (byte) 9, this.field387) - this.field291;
		int var8 = var5 - this.field512;
		int var9 = var7 - this.field513;
		int var10 = var6 - this.field514;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		if (!arg0) {
			for (int var13 = 1; var13 > 0; var13++) {
			}
		}
		int var14 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.field515 < var12) {
			this.field515 += (var12 - this.field515) * this.field293 / 1000 + this.field292;
			if (this.field515 > var12) {
				this.field515 = var12;
			}
		}
		if (this.field515 > var12) {
			this.field515 -= (this.field515 - var12) * this.field293 / 1000 + this.field292;
			if (this.field515 < var12) {
				this.field515 = var12;
			}
		}
		int var15 = var14 - this.field516;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 > 0) {
			this.field516 += this.field293 * var15 / 1000 + this.field292;
			this.field516 &= 0x7FF;
		}
		if (var15 < 0) {
			this.field516 -= -var15 * this.field293 / 1000 + this.field292;
			this.field516 &= 0x7FF;
		}
		int var16 = var14 - this.field516;
		if (var16 > 1024) {
			var16 -= 2048;
		}
		if (var16 < -1024) {
			var16 += 2048;
		}
		if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
			this.field516 = var14;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method50(byte arg0) {
		if (arg0 != 2) {
			return;
		}
		boolean var2 = false;
		while (true) {
			int var3;
			do {
				while (true) {
					var3 = this.method270(-983);
					if (var3 == -1) {
						return;
					}
					if (this.field465 != -1 && this.field527 == this.field465) {
						if (var3 == 8 && this.field135.length() > 0) {
							this.field135 = this.field135.substring(0, this.field135.length() - 1);
						}
						break;
					}
					if (this.field162) {
						if (var3 >= 32 && var3 <= 122 && this.field322.length() < 80) {
							this.field322 = this.field322 + (char) var3;
							this.field536 = true;
						}
						if (var3 == 8 && this.field322.length() > 0) {
							this.field322 = this.field322.substring(0, this.field322.length() - 1);
							this.field536 = true;
						}
						if (var3 == 13 || var3 == 10) {
							this.field162 = false;
							this.field536 = true;
							if (this.field517 == 1) {
								long var4 = JString.method344(this.field322);
								this.method125(var4, -45229);
							}
							if (this.field517 == 2 && this.field155 > 0) {
								long var6 = JString.method344(this.field322);
								this.method73(var6, 0);
							}
							if (this.field517 == 3 && this.field322.length() > 0) {
								// MESSAGE_PRIVATE
								this.field260.p1isaac((byte) 4, 227);
								this.field260.p1(0);
								int var8 = this.field260.pos;
								this.field260.p8(this.field437, true);
								WordPack.method454(this.field322, 569, this.field260);
								this.field260.psize1(this.field260.pos - var8, 0);
								this.field322 = WordPack.method455((byte) 0, this.field322);
								this.field322 = WordFilter.method504((byte) 0, this.field322);
								this.method67(JString.method348(JString.method345(this.field437, 0), (byte) 7), (byte) -123, this.field322, 6);
								if (this.field183 == 2) {
									this.field183 = 1;
									this.field508 = true;
									// CHAT_SETMODE
									this.field260.p1isaac((byte) 4, 176);
									this.field260.p1(this.field302);
									this.field260.p1(this.field183);
									this.field260.p1(this.field523);
								}
							}
							if (this.field517 == 4 && this.field151 < 100) {
								long var9 = JString.method344(this.field322);
								this.method112(this.field450, var9);
							}
							if (this.field517 == 5 && this.field151 > 0) {
								long var11 = JString.method344(this.field322);
								this.method120(325, var11);
							}
						}
					} else if (this.field540 == 1) {
						if (var3 >= 48 && var3 <= 57 && this.field245.length() < 10) {
							this.field245 = this.field245 + (char) var3;
							this.field536 = true;
						}
						if (var3 == 8 && this.field245.length() > 0) {
							this.field245 = this.field245.substring(0, this.field245.length() - 1);
							this.field536 = true;
						}
						if (var3 == 13 || var3 == 10) {
							if (this.field245.length() > 0) {
								int var13 = 0;
								try {
									var13 = Integer.parseInt(this.field245);
								} catch (Exception var23) {
								}
								// RESUME_P_COUNTDIALOG
								this.field260.p1isaac((byte) 4, 75);
								this.field260.p4(var13);
							}
							this.field540 = 0;
							this.field536 = true;
						}
					} else if (this.field540 == 2) {
						if (var3 >= 32 && var3 <= 122 && this.field245.length() < 12) {
							this.field245 = this.field245 + (char) var3;
							this.field536 = true;
						}
						if (var3 == 8 && this.field245.length() > 0) {
							this.field245 = this.field245.substring(0, this.field245.length() - 1);
							this.field536 = true;
						}
						if (var3 == 13 || var3 == 10) {
							if (this.field245.length() > 0) {
								// RESUME_P_NAMEDIALOG
								this.field260.p1isaac((byte) 4, 206);
								this.field260.p8(JString.method344(this.field245), true);
							}
							this.field540 = 0;
							this.field536 = true;
						}
					} else if (this.field540 == 3) {
						if (var3 >= 32 && var3 <= 122 && this.field245.length() < 40) {
							this.field245 = this.field245 + (char) var3;
							this.field536 = true;
						}
						if (var3 == 8 && this.field245.length() > 0) {
							this.field245 = this.field245.substring(0, this.field245.length() - 1);
							this.field536 = true;
						}
					} else if (this.field284 == -1 && this.field349 == -1) {
						if (var3 >= 32 && var3 <= 122 && this.field400.length() < 80) {
							this.field400 = this.field400 + (char) var3;
							this.field536 = true;
						}
						if (var3 == 8 && this.field400.length() > 0) {
							this.field400 = this.field400.substring(0, this.field400.length() - 1);
							this.field536 = true;
						}
						if ((var3 == 13 || var3 == 10) && this.field400.length() > 0) {
							if (this.field163 == 2) {
								if (this.field400.equals("::clientdrop")) {
									this.method79(1);
								}
								if (this.field400.equals("::lag")) {
									this.method163(false);
								}
								if (this.field400.equals("::prefetchmusic")) {
									for (int var14 = 0; var14 < this.field587.method597(2, -31140); var14++) {
										this.field587.method584(-44, 2, (byte) 1, var14);
									}
								}
								if (this.field400.equals("::fpson")) {
									field164 = true;
								}
								if (this.field400.equals("::fpsoff")) {
									field164 = false;
								}
								if (this.field400.equals("::noclip")) {
									for (int var15 = 0; var15 < 4; var15++) {
										for (int var16 = 1; var16 < 103; var16++) {
											for (int var17 = 1; var17 < 103; var17++) {
												this.field556[var15].field1585[var16][var17] = 0;
											}
										}
									}
								}
							}
							if (this.field400.startsWith("::")) {
								// CLIENT_CHEAT
								this.field260.p1isaac((byte) 4, 56);
								this.field260.p1(this.field400.length() - 1);
								this.field260.pjstr(this.field400.substring(2));
							} else {
								String var18 = this.field400.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("yellow:")) {
									var19 = 0;
									this.field400 = this.field400.substring(7);
								} else if (var18.startsWith("red:")) {
									var19 = 1;
									this.field400 = this.field400.substring(4);
								} else if (var18.startsWith("green:")) {
									var19 = 2;
									this.field400 = this.field400.substring(6);
								} else if (var18.startsWith("cyan:")) {
									var19 = 3;
									this.field400 = this.field400.substring(5);
								} else if (var18.startsWith("purple:")) {
									var19 = 4;
									this.field400 = this.field400.substring(7);
								} else if (var18.startsWith("white:")) {
									var19 = 5;
									this.field400 = this.field400.substring(6);
								} else if (var18.startsWith("flash1:")) {
									var19 = 6;
									this.field400 = this.field400.substring(7);
								} else if (var18.startsWith("flash2:")) {
									var19 = 7;
									this.field400 = this.field400.substring(7);
								} else if (var18.startsWith("flash3:")) {
									var19 = 8;
									this.field400 = this.field400.substring(7);
								} else if (var18.startsWith("glow1:")) {
									var19 = 9;
									this.field400 = this.field400.substring(6);
								} else if (var18.startsWith("glow2:")) {
									var19 = 10;
									this.field400 = this.field400.substring(6);
								} else if (var18.startsWith("glow3:")) {
									var19 = 11;
									this.field400 = this.field400.substring(6);
								}
								String var20 = this.field400.toLowerCase();
								byte var21 = 0;
								if (var20.startsWith("wave:")) {
									var21 = 1;
									this.field400 = this.field400.substring(5);
								} else if (var20.startsWith("wave2:")) {
									var21 = 2;
									this.field400 = this.field400.substring(6);
								} else if (var20.startsWith("shake:")) {
									var21 = 3;
									this.field400 = this.field400.substring(6);
								} else if (var20.startsWith("scroll:")) {
									var21 = 4;
									this.field400 = this.field400.substring(7);
								} else if (var20.startsWith("slide:")) {
									var21 = 5;
									this.field400 = this.field400.substring(6);
								}
								// MESSAGE_PUBLIC
								this.field260.p1isaac((byte) 4, 49);
								this.field260.p1(0);
								int var22 = this.field260.pos;
								this.field260.p1_alt2((byte) 0, var19);
								this.field260.p1_alt1(false, var21);
								this.field427.pos = 0;
								WordPack.method454(this.field400, 569, this.field427);
								this.field260.pdata(this.field427.data, 0, this.field427.pos, 0);
								this.field260.psize1(this.field260.pos - var22, 0);
								this.field400 = WordPack.method455((byte) 0, this.field400);
								this.field400 = WordFilter.method504((byte) 0, this.field400);
								field463.field1127 = this.field400;
								field463.field1130 = var19;
								field463.field1140 = var21;
								field463.field1129 = 150;
								if (this.field163 == 2) {
									this.method67("@cr2@" + field463.field1673, (byte) -123, field463.field1127, 2);
								} else if (this.field163 == 1) {
									this.method67("@cr1@" + field463.field1673, (byte) -123, field463.field1127, 2);
								} else {
									this.method67(field463.field1673, (byte) -123, field463.field1127, 2);
								}
								if (this.field302 == 2) {
									this.field302 = 3;
									this.field508 = true;
									// CHAT_SETMODE
									this.field260.p1isaac((byte) 4, 176);
									this.field260.p1(this.field302);
									this.field260.p1(this.field183);
									this.field260.p1(this.field523);
								}
							}
							this.field400 = "";
							this.field536 = true;
						}
					}
				}
			} while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
			if (this.field135.length() < 12) {
				this.field135 = this.field135 + (char) var3;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method51(String arg0) throws IOException {
		if (this.field196) {
			if (this.field520 != null) {
				try {
					this.field520.close();
				} catch (Exception var4) {
				}
				this.field520 = null;
			}
			this.field520 = this.method52(43595);
			this.field520.setSoTimeout(10000);
			InputStream var2 = this.field520.getInputStream();
			OutputStream var3 = this.field520.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.g(I)Ljava/net/Socket;")
	public final Socket method52(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method53(int arg0) {
		if (arg0 != 21389) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		if (this.field320 == null) {
			return false;
		}
		try {
			int var3 = this.field320.method235();
			if (var3 == 0) {
				return false;
			}
			if (this.field166 == -1) {
				this.field320.method236(this.field484.data, 0, 1);
				this.field166 = this.field484.data[0] & 0xFF;
				if (this.field195 != null) {
					this.field166 = this.field166 - this.field195.method329() & 0xFF;
				}
				this.field165 = Protocol.field672[this.field166];
				var3--;
			}
			if (this.field165 == -1) {
				if (var3 <= 0) {
					return false;
				}
				this.field320.method236(this.field484.data, 0, 1);
				this.field165 = this.field484.data[0] & 0xFF;
				var3--;
			}
			if (this.field165 == -2) {
				if (var3 <= 1) {
					return false;
				}
				this.field320.method236(this.field484.data, 0, 2);
				this.field484.pos = 0;
				this.field165 = this.field484.g2();
				var3 -= 2;
			}
			if (var3 < this.field165) {
				return false;
			}
			this.field484.pos = 0;
			this.field320.method236(this.field484.data, 0, this.field165);
			this.field167 = 0;
			this.field201 = this.field200;
			this.field200 = this.field199;
			this.field199 = this.field166;
			if (this.field166 == 166) {
				// IF_SETPOSITION
				int var4 = this.field484.g2b_alt1(-63);
				int var5 = this.field484.g2b_alt1(-63);
				int var6 = this.field484.g2();
				Component var7 = Component.method204(var6);
				var7.field710 = var5;
				var7.field741 = var4;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 186) {
				// todo (setting model xan/yan/zoom)
				int var8 = this.field484.g2_alt2((byte) 9);
				int var9 = this.field484.g2_alt3(-600);
				int var10 = this.field484.g2_alt2((byte) 9);
				int var11 = this.field484.g2_alt1(-125);
				Component.method204(var9).field734 = var8;
				Component.method204(var9).field735 = var11;
				Component.method204(var9).field733 = var10;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 216) {
				// IF_SETMODEL
				int var12 = this.field484.g2_alt3(-600);
				int var13 = this.field484.g2_alt3(-600);
				Component.method204(var13).field765 = 1;
				Component.method204(var13).field766 = var12;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 26) {
				// SYNTH_SOUND
				int var14 = this.field484.g2();
				int var15 = this.field484.g1();
				int var16 = this.field484.g2();
				if (var16 == 65535) {
					if (this.field331 < 50) {
						this.field386[this.field331] = (short) var14;
						this.field617[this.field331] = var15;
						this.field555[this.field331] = 0;
						this.field331++;
					}
				} else if (this.field597 && !field222 && this.field331 < 50) {
					this.field386[this.field331] = var14;
					this.field617[this.field331] = var15;
					this.field555[this.field331] = Wave.field1472[var14] + var16;
					this.field331++;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 182) {
				// VARP_SMALL
				int var17 = this.field484.g2_alt2((byte) 9);
				byte var18 = this.field484.g1b_alt3(43428);
				this.field301[var17] = var18;
				if (this.field335[var17] != var18) {
					this.field335[var17] = var18;
					this.method128(0, var17);
					this.field477 = true;
					if (this.field487 != -1) {
						this.field536 = true;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 13) {
				// RESET_ANIMS
				for (int var19 = 0; var19 < this.field266.length; var19++) {
					if (this.field266[var19] != null) {
						this.field266[var19].field1171 = -1;
					}
				}
				for (int var20 = 0; var20 < this.field428.length; var20++) {
					if (this.field428[var20] != null) {
						this.field428[var20].field1171 = -1;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 156) {
				// MINIMAP_TOGGLE
				this.field346 = this.field484.g1();
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 162) {
				// IF_SETNPCHEAD
				int var21 = this.field484.g2_alt2((byte) 9);
				int var22 = this.field484.g2_alt1(-125);
				Component.method204(var22).field765 = 2;
				Component.method204(var22).field766 = var21;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 109) {
				// IF_OPENCHAT
				int var23 = this.field484.g2();
				this.method135((byte) 36, var23);
				if (this.field385 != -1) {
					this.method64(field486, this.field385);
					this.field385 = -1;
					this.field477 = true;
					this.field246 = true;
				}
				if (this.field349 != -1) {
					this.method64(field486, this.field349);
					this.field349 = -1;
					this.field342 = true;
				}
				if (this.field256 != -1) {
					this.method64(field486, this.field256);
					this.field256 = -1;
				}
				if (this.field465 != -1) {
					this.method64(field486, this.field465);
					this.field465 = -1;
				}
				if (this.field284 != var23) {
					this.method64(field486, this.field284);
					this.field284 = var23;
				}
				this.field535 = false;
				this.field536 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 220) {
				// MIDI_SONG
				int var24 = this.field484.g2_alt3(-600);
				if (var24 == 65535) {
					var24 = -1;
				}
				if (this.field623 != var24 && this.field562 && !field222 && this.field424 == 0) {
					this.field566 = var24;
					this.field567 = true;
					this.field587.method586(2, this.field566);
				}
				this.field623 = var24;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 249) {
				// MIDI_JINGLE
				int var25 = this.field484.g2_alt1(-125);
				int var26 = this.field484.g3_alt3(-737);
				if (this.field562 && !field222) {
					this.field566 = var25;
					this.field567 = false;
					this.field587.method586(2, this.field566);
					this.field424 = var26;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 158) {
				// TUT_OPEN
				int var27 = this.field484.g2b_alt1(-63);
				if (this.field487 != var27) {
					this.method64(field486, this.field487);
					this.field487 = var27;
				}
				this.field536 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 218) {
				// IF_SETCOLOUR
				int var28 = this.field484.g2();
				int var29 = this.field484.g2_alt2((byte) 9);
				int var30 = var29 >> 10 & 0x1F;
				int var31 = var29 >> 5 & 0x1F;
				int var32 = var29 & 0x1F;
				Component.method204(var28).field722 = (var32 << 3) + (var30 << 19) + (var31 << 11);
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 157) {
				// SET_PLAYER_OP
				int var33 = this.field484.g1_alt2(-34545);
				String var34 = this.field484.gjstr();
				int var35 = this.field484.g1();
				if (var33 >= 1 && var33 <= 5) {
					if (var34.equalsIgnoreCase("null")) {
						var34 = null;
					}
					this.field365[var33 - 1] = var34;
					this.field366[var33 - 1] = var35 == 0;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 6) {
				// P_NAMEDIALOG
				this.field162 = false;
				this.field540 = 2;
				this.field245 = "";
				this.field536 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 201) {
				// CHAT_FILTER_SETTINGS
				this.field302 = this.field484.g1();
				this.field183 = this.field484.g1();
				this.field523 = this.field484.g1();
				this.field508 = true;
				this.field536 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 199) {
				// HINT_ARROW
				this.field493 = this.field484.g1();
				if (this.field493 == 1) {
					this.field522 = this.field484.g2();
				}
				if (this.field493 >= 2 && this.field493 <= 6) {
					if (this.field493 == 2) {
						this.field143 = 64;
						this.field144 = 64;
					}
					if (this.field493 == 3) {
						this.field143 = 0;
						this.field144 = 64;
					}
					if (this.field493 == 4) {
						this.field143 = 128;
						this.field144 = 64;
					}
					if (this.field493 == 5) {
						this.field143 = 64;
						this.field144 = 0;
					}
					if (this.field493 == 6) {
						this.field143 = 64;
						this.field144 = 128;
					}
					this.field493 = 2;
					this.field140 = this.field484.g2();
					this.field141 = this.field484.g2();
					this.field142 = this.field484.g1();
				}
				if (this.field493 == 10) {
					this.field447 = this.field484.g2();
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 167) {
				// CAM_LOOKAT
				this.field507 = true;
				this.field289 = this.field484.g1();
				this.field290 = this.field484.g1();
				this.field291 = this.field484.g2();
				this.field292 = this.field484.g1();
				this.field293 = this.field484.g1();
				if (this.field293 >= 100) {
					int var36 = this.field289 * 128 + 64;
					int var37 = this.field290 * 128 + 64;
					int var38 = this.method133(var37, var36, (byte) 9, this.field387) - this.field291;
					int var39 = var36 - this.field512;
					int var40 = var38 - this.field513;
					int var41 = var37 - this.field514;
					int var42 = (int) Math.sqrt((double) (var39 * var39 + var41 * var41));
					this.field515 = (int) (Math.atan2((double) var40, (double) var42) * 325.949D) & 0x7FF;
					this.field516 = (int) (Math.atan2((double) var39, (double) var41) * -325.949D) & 0x7FF;
					if (this.field515 < 128) {
						this.field515 = 128;
					}
					if (this.field515 > 383) {
						this.field515 = 383;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 5) {
				// LOGOUT
				this.method148(true);
				this.field166 = -1;
				return false;
			}
			if (this.field166 == 115) {
				// VARP_LARGE
				int var43 = this.field484.g4_alt3(true);
				int var44 = this.field484.g2_alt1(-125);
				this.field301[var44] = var43;
				if (this.field335[var44] != var43) {
					this.field335[var44] = var43;
					this.method128(0, var44);
					this.field477 = true;
					if (this.field487 != -1) {
						this.field536 = true;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 29) {
				// IF_CLOSE
				if (this.field385 != -1) {
					this.method64(field486, this.field385);
					this.field385 = -1;
					this.field477 = true;
					this.field246 = true;
				}
				if (this.field284 != -1) {
					this.method64(field486, this.field284);
					this.field284 = -1;
					this.field536 = true;
				}
				if (this.field349 != -1) {
					this.method64(field486, this.field349);
					this.field349 = -1;
					this.field342 = true;
				}
				if (this.field256 != -1) {
					this.method64(field486, this.field256);
					this.field256 = -1;
				}
				if (this.field465 != -1) {
					this.method64(field486, this.field465);
					this.field465 = -1;
				}
				if (this.field540 != 0) {
					this.field540 = 0;
					this.field536 = true;
				}
				this.field535 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 76) {
				// LAST_LOGIN_INFO
				this.field379 = this.field484.g2_alt1(-125);
				this.field371 = this.field484.g2_alt3(-600);
				this.field484.g2();
				this.field504 = this.field484.g2();
				this.field466 = this.field484.g2_alt1(-125);
				this.field569 = this.field484.g2_alt2((byte) 9);
				this.field511 = this.field484.g2_alt2((byte) 9);
				this.field288 = this.field484.g2();
				this.field537 = this.field484.g4_alt1(935);
				this.field330 = this.field484.g2_alt3(-600);
				this.field484.g1_alt1(0);
				signlink.dnslookup(JString.method347(this.field537, -826));
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 63) {
				// MESSAGE_GAME
				String var45 = this.field484.gjstr();
				if (var45.endsWith(":tradereq:")) {
					String var46 = var45.substring(0, var45.indexOf(":"));
					long var47 = JString.method344(var46);
					boolean var49 = false;
					for (int var50 = 0; var50 < this.field151; var50++) {
						if (this.field369[var50] == var47) {
							var49 = true;
							break;
						}
					}
					if (!var49 && this.field542 == 0) {
						this.method67(var46, (byte) -123, "wishes to trade with you.", 4);
					}
				} else if (var45.endsWith(":duelreq:")) {
					String var51 = var45.substring(0, var45.indexOf(":"));
					long var52 = JString.method344(var51);
					boolean var54 = false;
					for (int var55 = 0; var55 < this.field151; var55++) {
						if (this.field369[var55] == var52) {
							var54 = true;
							break;
						}
					}
					if (!var54 && this.field542 == 0) {
						this.method67(var51, (byte) -123, "wishes to duel with you.", 8);
					}
				} else if (var45.endsWith(":chalreq:")) {
					String var56 = var45.substring(0, var45.indexOf(":"));
					long var57 = JString.method344(var56);
					boolean var59 = false;
					for (int var60 = 0; var60 < this.field151; var60++) {
						if (this.field369[var60] == var57) {
							var59 = true;
							break;
						}
					}
					if (!var59 && this.field542 == 0) {
						String var61 = var45.substring(var45.indexOf(":") + 1, var45.length() - 9);
						this.method67(var56, (byte) -123, var61, 8);
					}
				} else {
					this.method67("", (byte) -123, var45, 0);
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 50) {
				// IF_OPENOVERLAY
				int var62 = this.field484.g2b();
				if (var62 >= 0) {
					this.method135((byte) 36, var62);
				}
				if (this.field575 != var62) {
					this.method64(field486, this.field575);
					this.field575 = var62;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 82) {
				// IF_SETHIDE
				boolean var63 = this.field484.g1() == 1;
				int var64 = this.field484.g2();
				Component.method204(var64).field701 = var63;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 174) {
				// UPDATE_RUNWEIGHT
				if (this.field581 == 12) {
					this.field477 = true;
				}
				this.field326 = this.field484.g2b();
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 233) {
				// SET_MULTIWAY
				this.field615 = this.field484.g1();
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 61) {
				// UNSET_MAP_FLAG
				this.field416 = 0;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 128) {
				// IF_OPENMAIN_SIDE
				int var65 = this.field484.g2_alt2((byte) 9);
				int var66 = this.field484.g2_alt3(-600);
				if (this.field284 != -1) {
					this.method64(field486, this.field284);
					this.field284 = -1;
					this.field536 = true;
				}
				if (this.field349 != -1) {
					this.method64(field486, this.field349);
					this.field349 = -1;
					this.field342 = true;
				}
				if (this.field256 != -1) {
					this.method64(field486, this.field256);
					this.field256 = -1;
				}
				if (this.field465 != var65) {
					this.method64(field486, this.field465);
					this.field465 = var65;
				}
				if (this.field385 != var66) {
					this.method64(field486, this.field385);
					this.field385 = var66;
				}
				if (this.field540 != 0) {
					this.field540 = 0;
					this.field536 = true;
				}
				this.field477 = true;
				this.field246 = true;
				this.field535 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 67) {
				// CAM_SHAKE
				int var67 = this.field484.g1();
				int var68 = this.field484.g1();
				int var69 = this.field484.g1();
				int var70 = this.field484.g1();
				this.field223[var67] = true;
				this.field401[var67] = var68;
				this.field148[var67] = var69;
				this.field287[var67] = var70;
				this.field441[var67] = 0;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 134) {
				// UPDATE_INV_PARTIAL
				this.field477 = true;
				int var71 = this.field484.g2();
				Component var72 = Component.method204(var71);
				while (this.field484.pos < this.field165) {
					int var73 = this.field484.gsmarts();
					int var74 = this.field484.g2();
					int var75 = this.field484.g1();
					if (var75 == 255) {
						var75 = this.field484.g4();
					}
					if (var73 >= 0 && var73 < var72.field751.length) {
						var72.field751[var73] = var74;
						var72.field706[var73] = var75;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 78) {
				// UPDATE_FRIENDLIST
				long var76 = this.field484.g8(-149);
				int var78 = this.field484.g1();
				String var79 = JString.method348(JString.method345(var76, 0), (byte) 7);
				for (int var80 = 0; var80 < this.field155; var80++) {
					if (this.field426[var80] == var76) {
						if (this.field563[var80] != var78) {
							this.field563[var80] = var78;
							this.field477 = true;
							if (var78 > 0) {
								this.method67("", (byte) -123, var79 + " has logged in.", 5);
							}
							if (var78 == 0) {
								this.method67("", (byte) -123, var79 + " has logged out.", 5);
							}
						}
						var79 = null;
						break;
					}
				}
				if (var79 != null && this.field155 < 200) {
					this.field426[this.field155] = var76;
					this.field145[this.field155] = var79;
					this.field563[this.field155] = var78;
					this.field155++;
					this.field477 = true;
				}
				boolean var81 = false;
				while (!var81) {
					var81 = true;
					for (int var82 = 0; var82 < this.field155 - 1; var82++) {
						if (this.field563[var82] != field219 && this.field563[var82 + 1] == field219 || this.field563[var82] == 0 && this.field563[var82 + 1] != 0) {
							int var83 = this.field563[var82];
							this.field563[var82] = this.field563[var82 + 1];
							this.field563[var82 + 1] = var83;
							String var84 = this.field145[var82];
							this.field145[var82] = this.field145[var82 + 1];
							this.field145[var82 + 1] = var84;
							long var85 = this.field426[var82];
							this.field426[var82] = this.field426[var82 + 1];
							this.field426[var82 + 1] = var85;
							this.field477 = true;
							var81 = false;
						}
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 58) {
				// P_COUNTDIALOG
				this.field162 = false;
				this.field540 = 1;
				this.field245 = "";
				this.field536 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 252) {
				// IF_SETTAB_ACTIVE
				this.field581 = this.field484.g1_alt2(-34545);
				this.field477 = true;
				this.field246 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 40) {
				// UPDATE_ZONE_FULL_FOLLOWS
				this.field286 = this.field484.g1_alt3(this.field532);
				this.field285 = this.field484.g1_alt2(-34545);
				for (int var87 = this.field285; var87 < this.field285 + 8; var87++) {
					for (int var88 = this.field286; var88 < this.field286 + 8; var88++) {
						if (this.field619[this.field387][var87][var88] != null) {
							this.field619[this.field387][var87][var88] = null;
							this.method46(var87, var88);
						}
					}
				}
				for (LocChange var89 = (LocChange) this.field557.method6(); var89 != null; var89 = (LocChange) this.field557.method8(1)) {
					if (var89.field1325 >= this.field285 && var89.field1325 < this.field285 + 8 && var89.field1326 >= this.field286 && var89.field1326 < this.field286 + 8 && this.field387 == var89.field1323) {
						var89.field1322 = 0;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 255) {
				// IF_SETPLAYERHEAD
				int var90 = this.field484.g2_alt3(-600);
				Component.method204(var90).field765 = 3;
				if (field463.field1679 == null) {
					Component.method204(var90).field766 = (field463.field1674[11] << 5) + (field463.field1674[8] << 10) + (field463.field1674[0] << 15) + (field463.field1682[0] << 25) + (field463.field1682[4] << 20) + field463.field1674[1];
				} else {
					Component.method204(var90).field766 = (int) (field463.field1679.field1431 + 305419896L);
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 135) {
				// MESSAGE_PRIVATE
				long var91 = this.field484.g8(-149);
				int var93 = this.field484.g4();
				int var94 = this.field484.g1();
				boolean var95 = false;
				for (int var96 = 0; var96 < 100; var96++) {
					if (this.field554[var96] == var93) {
						var95 = true;
						break;
					}
				}
				if (var94 <= 1) {
					for (int var97 = 0; var97 < this.field151; var97++) {
						if (this.field369[var97] == var91) {
							var95 = true;
							break;
						}
					}
				}
				if (!var95 && this.field542 == 0) {
					try {
						this.field554[this.field448] = var93;
						this.field448 = (this.field448 + 1) % 100;
						String var98 = WordPack.method453(0, this.field484, this.field165 - 13);
						if (var94 != 3) {
							var98 = WordFilter.method504((byte) 0, var98);
						}
						if (var94 == 2 || var94 == 3) {
							this.method67("@cr2@" + JString.method348(JString.method345(var91, 0), (byte) 7), (byte) -123, var98, 7);
						} else if (var94 == 1) {
							this.method67("@cr1@" + JString.method348(JString.method345(var91, 0), (byte) 7), (byte) -123, var98, 7);
						} else {
							this.method67(JString.method348(JString.method345(var91, 0), (byte) 7), (byte) -123, var98, 3);
						}
					} catch (Exception var191) {
						signlink.reporterror("cde1");
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 183) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				this.field285 = this.field484.g1();
				this.field286 = this.field484.g1_alt1(0);
				while (this.field484.pos < this.field165) {
					int var100 = this.field484.g1();
					this.method158(this.field484, 0, var100);
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 159) {
				// IF_OPENMAIN
				int var101 = this.field484.g2_alt3(-600);
				this.method135((byte) 36, var101);
				if (this.field385 != -1) {
					this.method64(field486, this.field385);
					this.field385 = -1;
					this.field477 = true;
					this.field246 = true;
				}
				if (this.field284 != -1) {
					this.method64(field486, this.field284);
					this.field284 = -1;
					this.field536 = true;
				}
				if (this.field349 != -1) {
					this.method64(field486, this.field349);
					this.field349 = -1;
					this.field342 = true;
				}
				if (this.field256 != -1) {
					this.method64(field486, this.field256);
					this.field256 = -1;
				}
				if (this.field465 != var101) {
					this.method64(field486, this.field465);
					this.field465 = var101;
				}
				if (this.field540 != 0) {
					this.field540 = 0;
					this.field536 = true;
				}
				this.field535 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 246) {
				// IF_OPENSIDE
				int var102 = this.field484.g2_alt3(-600);
				this.method135((byte) 36, var102);
				if (this.field284 != -1) {
					this.method64(field486, this.field284);
					this.field284 = -1;
					this.field536 = true;
				}
				if (this.field349 != -1) {
					this.method64(field486, this.field349);
					this.field349 = -1;
					this.field342 = true;
				}
				if (this.field256 != -1) {
					this.method64(field486, this.field256);
					this.field256 = -1;
				}
				if (this.field465 != -1) {
					this.method64(field486, this.field465);
					this.field465 = -1;
				}
				if (this.field385 != var102) {
					this.method64(field486, this.field385);
					this.field385 = var102;
				}
				if (this.field540 != 0) {
					this.field540 = 0;
					this.field536 = true;
				}
				this.field477 = true;
				this.field246 = true;
				this.field535 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 49) {
				// UPDATE_STAT
				this.field477 = true;
				int var103 = this.field484.g1_alt2(-34545);
				int var104 = this.field484.g1();
				int var105 = this.field484.g4();
				this.field139[var103] = var105;
				this.field325[var103] = var104;
				this.field350[var103] = 1;
				for (int var106 = 0; var106 < 98; var106++) {
					if (var105 >= field248[var106]) {
						this.field350[var103] = var106 + 2;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 206) {
				// UPDATE_INV_FULL
				this.field477 = true;
				int var107 = this.field484.g2();
				Component var108 = Component.method204(var107);
				int var109 = this.field484.g2();
				for (int var110 = 0; var110 < var109; var110++) {
					var108.field751[var110] = this.field484.g2_alt3(-600);
					int var111 = this.field484.g1_alt2(-34545);
					if (var111 == 255) {
						var111 = this.field484.g4_alt1(935);
					}
					var108.field706[var110] = var111;
				}
				for (int var112 = var109; var112 < var108.field751.length; var112++) {
					var108.field751[var112] = 0;
					var108.field706[var112] = 0;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 222 || this.field166 == 53) {
				int var113 = this.field185;
				int var114 = this.field186;
				if (this.field166 == 222) {
					// REBUILD_NORMAL
					var114 = this.field484.g2();
					var113 = this.field484.g2_alt3(-600);
					this.field459 = false;
				}
				if (this.field166 == 53) {
					// REBUILD_REGION
					var113 = this.field484.g2_alt2((byte) 9);
					this.field484.accessBits((byte) 6);
					int var115 = 0;
					while (true) {
						if (var115 >= 4) {
							this.field484.accessBytes(-29290);
							var114 = this.field484.g2_alt2((byte) 9);
							this.field459 = true;
							break;
						}
						for (int var116 = 0; var116 < 13; var116++) {
							for (int var117 = 0; var117 < 13; var117++) {
								int var118 = this.field484.gBit(402, 1);
								if (var118 == 1) {
									this.field175[var115][var116][var117] = this.field484.gBit(402, 26);
								} else {
									this.field175[var115][var116][var117] = -1;
								}
							}
						}
						var115++;
					}
				}
				if (this.field185 == var113 && this.field186 == var114 && this.field367 == 2) {
					this.field166 = -1;
					return true;
				}
				this.field185 = var113;
				this.field186 = var114;
				this.field336 = (this.field185 - 6) * 8;
				this.field337 = (this.field186 - 6) * 8;
				this.field363 = false;
				if ((this.field185 / 8 == 48 || this.field185 / 8 == 49) && this.field186 / 8 == 48) {
					this.field363 = true;
				}
				if (this.field185 / 8 == 48 && this.field186 / 8 == 148) {
					this.field363 = true;
				}
				this.field367 = 1;
				this.field525 = System.currentTimeMillis();
				this.method149(-332, null, "Loading - please wait.");
				if (this.field166 == 222) {
					int var119 = 0;
					int var120 = (this.field185 - 6) / 8;
					label1209: while (true) {
						if (var120 > (this.field185 + 6) / 8) {
							this.field134 = new byte[var119][];
							this.field528 = new byte[var119][];
							this.field152 = new int[var119];
							this.field153 = new int[var119];
							this.field154 = new int[var119];
							int var122 = 0;
							int var123 = (this.field185 - 6) / 8;
							while (true) {
								if (var123 > (this.field185 + 6) / 8) {
									break label1209;
								}
								for (int var124 = (this.field186 - 6) / 8; var124 <= (this.field186 + 6) / 8; var124++) {
									this.field152[var122] = (var123 << 8) + var124;
									if (this.field363 && (var124 == 49 || var124 == 149 || var124 == 147 || var123 == 50 || var123 == 49 && var124 == 47)) {
										this.field153[var122] = -1;
										this.field154[var122] = -1;
										var122++;
									} else {
										int var125 = this.field153[var122] = this.field587.method601(0, var123, var124, 0);
										if (var125 != -1) {
											this.field587.method586(3, var125);
										}
										int var126 = this.field154[var122] = this.field587.method601(0, var123, var124, 1);
										if (var126 != -1) {
											this.field587.method586(3, var126);
										}
										var122++;
									}
								}
								var123++;
							}
						}
						for (int var121 = (this.field186 - 6) / 8; var121 <= (this.field186 + 6) / 8; var121++) {
							var119++;
						}
						var120++;
					}
				}
				if (this.field166 == 53) {
					int var127 = 0;
					int[] var128 = new int[676];
					int var129 = 0;
					label1168: while (true) {
						if (var129 >= 4) {
							this.field134 = new byte[var127][];
							this.field528 = new byte[var127][];
							this.field152 = new int[var127];
							this.field153 = new int[var127];
							this.field154 = new int[var127];
							int var137 = 0;
							while (true) {
								if (var137 >= var127) {
									break label1168;
								}
								int var138 = this.field152[var137] = var128[var137];
								int var139 = var138 >> 8 & 0xFF;
								int var140 = var138 & 0xFF;
								int var141 = this.field153[var137] = this.field587.method601(0, var139, var140, 0);
								if (var141 != -1) {
									this.field587.method586(3, var141);
								}
								int var142 = this.field154[var137] = this.field587.method601(0, var139, var140, 1);
								if (var142 != -1) {
									this.field587.method586(3, var142);
								}
								var137++;
							}
						}
						for (int var130 = 0; var130 < 13; var130++) {
							for (int var131 = 0; var131 < 13; var131++) {
								int var132 = this.field175[var129][var130][var131];
								if (var132 != -1) {
									int var133 = var132 >> 14 & 0x3FF;
									int var134 = var132 >> 3 & 0x7FF;
									int var135 = (var133 / 8 << 8) + var134 / 8;
									for (int var136 = 0; var136 < var127; var136++) {
										if (var128[var136] == var135) {
											var135 = -1;
											break;
										}
									}
									if (var135 != -1) {
										var128[var127++] = var135;
									}
								}
							}
						}
						var129++;
					}
				}
				int var143 = this.field336 - this.field338;
				int var144 = this.field337 - this.field339;
				this.field338 = this.field336;
				this.field339 = this.field337;
				for (int var145 = 0; var145 < 16384; var145++) {
					ClientNpc var146 = this.field428[var145];
					if (var146 != null) {
						for (int var147 = 0; var147 < 10; var147++) {
							var146.field1133[var147] -= var143;
							var146.field1134[var147] -= var144;
						}
						var146.field1157 -= var143 * 128;
						var146.field1158 -= var144 * 128;
					}
				}
				for (int var148 = 0; var148 < this.field264; var148++) {
					ClientPlayer var149 = this.field266[var148];
					if (var149 != null) {
						for (int var150 = 0; var150 < 10; var150++) {
							var149.field1133[var150] -= var143;
							var149.field1134[var150] -= var144;
						}
						var149.field1157 -= var143 * 128;
						var149.field1158 -= var144 * 128;
					}
				}
				this.field505 = true;
				byte var151 = 0;
				byte var152 = 104;
				byte var153 = 1;
				if (var143 < 0) {
					var151 = 103;
					var152 = -1;
					var153 = -1;
				}
				byte var154 = 0;
				byte var155 = 104;
				byte var156 = 1;
				if (var144 < 0) {
					var154 = 103;
					var155 = -1;
					var156 = -1;
				}
				for (int var157 = var151; var157 != var152; var157 += var153) {
					for (int var158 = var154; var158 != var155; var158 += var156) {
						int var159 = var143 + var157;
						int var160 = var144 + var158;
						for (int var161 = 0; var161 < 4; var161++) {
							if (var159 >= 0 && var160 >= 0 && var159 < 104 && var160 < 104) {
								this.field619[var161][var157][var158] = this.field619[var161][var159][var160];
							} else {
								this.field619[var161][var157][var158] = null;
							}
						}
					}
				}
				for (LocChange var162 = (LocChange) this.field557.method6(); var162 != null; var162 = (LocChange) this.field557.method8(1)) {
					var162.field1325 -= var143;
					var162.field1326 -= var144;
					if (var162.field1325 < 0 || var162.field1326 < 0 || var162.field1325 >= 104 || var162.field1326 >= 104) {
						var162.method604();
					}
				}
				if (this.field416 != 0) {
					this.field416 -= var143;
					this.field417 -= var144;
				}
				this.field507 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 190) {
				// UPDATE_REBOOT_TIMER
				this.field353 = this.field484.g2_alt1(-125) * 30;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 41 || this.field166 == 121 || this.field166 == 203 || this.field166 == 106 || this.field166 == 59 || this.field166 == 181 || this.field166 == 208 || this.field166 == 107 || this.field166 == 142 || this.field166 == 88 || this.field166 == 152) {
				this.method158(this.field484, 0, this.field166);
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 125) {
				// UPDATE_RUNENERGY
				if (this.field581 == 12) {
					this.field477 = true;
				}
				this.field620 = this.field484.g1();
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 21) {
				// IF_SETOBJECT
				int var163 = this.field484.g2();
				int var164 = this.field484.g2_alt1(-125);
				int var165 = this.field484.g2_alt3(-600);
				if (var164 == 65535) {
					Component.method204(var165).field765 = 0;
					this.field166 = -1;
					return true;
				}
				ObjType var166 = ObjType.method221(var164);
				Component.method204(var165).field765 = 4;
				Component.method204(var165).field766 = var164;
				Component.method204(var165).field734 = var166.field841;
				Component.method204(var165).field735 = var166.field838;
				Component.method204(var165).field733 = var166.field851 * 100 / var163;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 3) {
				// CAM_MOVETO
				this.field507 = true;
				this.field170 = this.field484.g1();
				this.field171 = this.field484.g1();
				this.field172 = this.field484.g2();
				this.field173 = this.field484.g1();
				this.field174 = this.field484.g1();
				if (this.field174 >= 100) {
					this.field512 = this.field170 * 128 + 64;
					this.field514 = this.field171 * 128 + 64;
					this.field513 = this.method133(this.field514, this.field512, (byte) 9, this.field387) - this.field172;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 2) {
				// IF_SETANIM
				int var167 = this.field484.g2_alt3(-600);
				int var168 = this.field484.g2b_alt2((byte) 17);
				Component var169 = Component.method204(var167);
				if (var169.field768 != var168 || var168 == -1) {
					var169.field768 = var168;
					var169.field717 = 0;
					var169.field709 = 0;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 71) {
				// NPC_INFO
				this.method68(this.field484, this.field334, this.field165);
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 226) {
				// UPDATE_IGNORELIST
				this.field151 = this.field165 / 8;
				for (int var170 = 0; var170 < this.field151; var170++) {
					this.field369[var170] = this.field484.g8(-149);
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 10) {
				// IF_SETTAB
				int var171 = this.field484.g1_alt3(this.field532);
				int var172 = this.field484.g2_alt2((byte) 9);
				if (var172 == 65535) {
					var172 = -1;
				}
				if (this.field377[var171] != var172) {
					this.method64(field486, this.field377[var171]);
					this.field377[var171] = var172;
				}
				this.field477 = true;
				this.field246 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 219) {
				// UPDATE_INV_STOP_TRANSMIT
				int var173 = this.field484.g2_alt1(-125);
				Component var174 = Component.method204(var173);
				for (int var175 = 0; var175 < var174.field751.length; var175++) {
					var174.field751[var175] = -1;
					var174.field751[var175] = 0;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 238) {
				// TUT_FLASH
				this.field509 = this.field484.g1();
				if (this.field581 == this.field509) {
					if (this.field509 == 3) {
						this.field581 = 1;
					} else {
						this.field581 = 3;
					}
					this.field477 = true;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 148) {
				// CAM_RESET
				this.field507 = false;
				for (int var176 = 0; var176 < 5; var176++) {
					this.field223[var176] = false;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 126) {
				// UPDATE_PID
				this.field364 = this.field484.g1();
				this.field257 = this.field484.g2_alt1(-125);
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 75) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				this.field285 = this.field484.g1_alt2(-34545);
				this.field286 = this.field484.g1_alt1(0);
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 253) {
				// todo: opens fullscreen interface
				int var177 = this.field484.g2_alt1(-125);
				int var178 = this.field484.g2_alt2((byte) 9);
				this.method135((byte) 36, var178);
				if (var177 != -1) {
					this.method135((byte) 36, var177);
				}
				if (this.field465 != -1) {
					this.method64(field486, this.field465);
					this.field465 = -1;
				}
				if (this.field385 != -1) {
					this.method64(field486, this.field385);
					this.field385 = -1;
				}
				if (this.field284 != -1) {
					this.method64(field486, this.field284);
					this.field284 = -1;
				}
				if (this.field349 != var178) {
					this.method64(field486, this.field349);
					this.field349 = var178;
				}
				if (this.field256 != var178) {
					this.method64(field486, this.field256);
					this.field256 = var177;
				}
				this.field540 = 0;
				this.field535 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 251) {
				// FRIENDLIST_LOADED
				this.field156 = this.field484.g1();
				this.field477 = true;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 18) {
				// todo
				int var179 = this.field484.g2();
				int var180 = this.field484.g2_alt2((byte) 9);
				int var181 = this.field484.g2_alt1(-125);
				Component.method204(var180).field700 = (var179 << 16) + var181;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 90) {
				// PLAYER_INFO
				this.method119(this.field165, 69, this.field484);
				this.field505 = false;
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 113) {
				// RESET_CLIENT_VARCACHE
				for (int var182 = 0; var182 < this.field335.length; var182++) {
					if (this.field335[var182] != this.field301[var182]) {
						this.field335[var182] = this.field301[var182];
						this.method128(0, var182);
						this.field477 = true;
					}
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 232) {
				// IF_SETTEXT
				int var183 = this.field484.g2_alt3(-600);
				String var184 = this.field484.gjstr();
				Component.method204(var183).field712 = var184;
				int var10001 = this.field377[this.field581];
				if (Component.method204(var183).field730 == var10001) {
					this.field477 = true;
				}
				this.field166 = -1;
				return true;
			}
			if (this.field166 == 200) {
				// IF_SETSCROLLPOS
				int var185 = this.field484.g2();
				int var186 = this.field484.g2_alt3(-600);
				Component var187 = Component.method204(var185);
				if (var187 != null && var187.field718 == 0) {
					if (var186 < 0) {
						var186 = 0;
					}
					if (var186 > var187.field767 - var187.field720) {
						var186 = var187.field767 - var187.field720;
					}
					var187.field713 = var186;
				}
				this.field166 = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.field166 + "," + this.field165 + " - " + this.field200 + "," + this.field201);
			this.method148(true);
		} catch (IOException var192) {
			this.method79(1);
		} catch (Exception var193) {
			String var189 = "T2 - " + this.field166 + "," + this.field200 + "," + this.field201 + " - " + this.field165 + "," + (field463.field1133[0] + this.field336) + "," + (field463.field1134[0] + this.field337) + " - ";
			for (int var190 = 0; var190 < this.field165 && var190 < 50; var190++) {
				var189 = var189 + this.field484.data[var190] + ",";
			}
			signlink.reporterror(var189);
			this.method148(true);
		}
		return true;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method54(byte arg0) {
		if (this.field479 < 2 && this.field442 == 0 && this.field467 == 0 || arg0 != -79) {
			return;
		}
		String var2;
		if (this.field442 == 1 && this.field479 < 2) {
			var2 = "Use " + this.field446 + " with...";
		} else if (this.field467 == 1 && this.field479 < 2) {
			var2 = this.field470 + "...";
		} else {
			var2 = this.field480[this.field479 - 1];
		}
		if (this.field479 > 2) {
			var2 = var2 + "@whi@ / " + (this.field479 - 2) + " more options";
		}
		this.field357.method253(true, field621 / 1000, 4, 16777215, 15, var2, 0);
	}

	@ObfuscatedName("client.a(ZZIIIIIIIIII)Z")
	public final boolean method55(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var39 = 0; var39 < var14; var39++) {
				this.field181[var15][var39] = 0;
				this.field485[var15][var39] = 99999999;
			}
		}
		int var16 = arg11;
		int var17 = arg3;
		this.field181[arg11][arg3] = 99;
		this.field485[arg11][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		this.field419[var18] = arg11;
		int var40 = var18 + 1;
		this.field420[var18] = arg3;
		boolean var20 = false;
		int var21 = this.field419.length;
		int[][] var22 = this.field556[this.field387].field1585;
		while (var40 != var19) {
			var16 = this.field419[var19];
			var17 = this.field420[var19];
			var19 = (var19 + 1) % var21;
			if (arg8 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && this.field556[this.field387].method541(arg8, 0, arg2, arg7 - 1, var16, var17, arg10)) {
					var20 = true;
					break;
				}
				if (arg7 < 10 && this.field556[this.field387].method542(-37, var17, arg8, var16, arg10, arg7 - 1, arg2)) {
					var20 = true;
					break;
				}
			}
			if (arg4 != 0 && arg5 != 0 && this.field556[this.field387].method543(arg4, var16, true, arg8, arg9, arg5, arg2, var17)) {
				var20 = true;
				break;
			}
			int var38 = this.field485[var16][var17] + 1;
			if (var16 > 0 && this.field181[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				this.field419[var40] = var16 - 1;
				this.field420[var40] = var17;
				var40 = (var40 + 1) % var21;
				this.field181[var16 - 1][var17] = 2;
				this.field485[var16 - 1][var17] = var38;
			}
			if (var16 < var13 - 1 && this.field181[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				this.field419[var40] = var16 + 1;
				this.field420[var40] = var17;
				var40 = (var40 + 1) % var21;
				this.field181[var16 + 1][var17] = 8;
				this.field485[var16 + 1][var17] = var38;
			}
			if (var17 > 0 && this.field181[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.field419[var40] = var16;
				this.field420[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16][var17 - 1] = 1;
				this.field485[var16][var17 - 1] = var38;
			}
			if (var17 < var14 - 1 && this.field181[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.field419[var40] = var16;
				this.field420[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16][var17 + 1] = 4;
				this.field485[var16][var17 + 1] = var38;
			}
			if (var16 > 0 && var17 > 0 && this.field181[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.field419[var40] = var16 - 1;
				this.field420[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16 - 1][var17 - 1] = 3;
				this.field485[var16 - 1][var17 - 1] = var38;
			}
			if (var16 < var13 - 1 && var17 > 0 && this.field181[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.field419[var40] = var16 + 1;
				this.field420[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16 + 1][var17 - 1] = 9;
				this.field485[var16 + 1][var17 - 1] = var38;
			}
			if (var16 > 0 && var17 < var14 - 1 && this.field181[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.field419[var40] = var16 - 1;
				this.field420[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16 - 1][var17 + 1] = 6;
				this.field485[var16 - 1][var17 + 1] = var38;
			}
			if (var16 < var13 - 1 && var17 < var14 - 1 && this.field181[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.field419[var40] = var16 + 1;
				this.field420[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.field181[var16 + 1][var17 + 1] = 12;
				this.field485[var16 + 1][var17 + 1] = var38;
			}
		}
		this.field422 = 0;
		if (!var20) {
			if (!arg0) {
				return false;
			}
			int var23 = 1000;
			int var24 = 100;
			byte var25 = 10;
			for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
				for (int var27 = arg2 - var25; var27 <= arg2 + var25; var27++) {
					if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field485[var26][var27] < 100) {
						int var28 = 0;
						if (var26 < arg8) {
							var28 = arg8 - var26;
						} else if (var26 > arg4 + arg8 - 1) {
							var28 = var26 - (arg4 + arg8 - 1);
						}
						int var29 = 0;
						if (var27 < arg2) {
							var29 = arg2 - var27;
						} else if (var27 > arg2 + arg5 - 1) {
							var29 = var27 - (arg2 + arg5 - 1);
						}
						int var30 = var28 * var28 + var29 * var29;
						if (var30 < var23 || var23 == var30 && this.field485[var26][var27] < var24) {
							var23 = var30;
							var24 = this.field485[var26][var27];
							var16 = var26;
							var17 = var27;
						}
					}
				}
			}
			if (var23 == 1000) {
				return false;
			}
			if (arg11 == var16 && arg3 == var17) {
				return false;
			}
			this.field422 = 1;
		}
		byte var31 = 0;
		if (arg1) {
			this.method86();
		}
		this.field419[var31] = var16;
		int var41 = var31 + 1;
		this.field420[var31] = var17;
		int var32;
		int var33 = var32 = this.field181[var16][var17];
		while (arg11 != var16 || arg3 != var17) {
			if (var32 != var33) {
				var32 = var33;
				this.field419[var41] = var16;
				this.field420[var41++] = var17;
			}
			if ((var33 & 0x2) != 0) {
				var16++;
			} else if ((var33 & 0x8) != 0) {
				var16--;
			}
			if ((var33 & 0x1) != 0) {
				var17++;
			} else if ((var33 & 0x4) != 0) {
				var17--;
			}
			var33 = this.field181[var16][var17];
		}
		if (var41 > 0) {
			int var34 = var41;
			if (var41 > 25) {
				var34 = 25;
			}
			var41--;
			int var35 = this.field419[var41];
			int var36 = this.field420[var41];
			if (arg6 == 0) {
				// MOVE_GAMECLICK
				this.field260.p1isaac((byte) 4, 28);
				this.field260.p1(var34 + var34 + 3);
			}
			if (arg6 == 1) {
				// MOVE_MINIMAPCLICK
				this.field260.p1isaac((byte) 4, 213);
				this.field260.p1(var34 + var34 + 3 + 14);
			}
			if (arg6 == 2) {
				// MOVE_OPCLICK
				this.field260.p1isaac((byte) 4, 247);
				this.field260.p1(var34 + var34 + 3);
			}
			this.field260.p2_alt3(3, this.field336 + var35);
			this.field260.p1(super.field969[5] == 1 ? 1 : 0);
			this.field260.p2_alt3(3, this.field337 + var36);
			this.field416 = this.field419[0];
			this.field417 = this.field420[0];
			for (int var37 = 1; var37 < var34; var37++) {
				var41--;
				this.field260.p1(this.field419[var41] - var35);
				this.field260.p1_alt3(this.field420[var41] - var36, 1);
			}
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method56(int arg0) {
		if (arg0 != 16220) {
			this.field624 = 458;
		}
		if (this.field367 != 2) {
			return;
		}
		for (LocChange var2 = (LocChange) this.field557.method6(); var2 != null; var2 = (LocChange) this.field557.method8(1)) {
			if (var2.field1322 > 0) {
				var2.field1322--;
			}
			if (var2.field1322 != 0) {
				if (var2.field1327 > 0) {
					var2.field1327--;
				}
				if (var2.field1327 == 0 && var2.field1325 >= 1 && var2.field1326 >= 1 && var2.field1325 <= 102 && var2.field1326 <= 102 && (var2.field1316 < 0 || World.method18(var2.field1318, this.field439, var2.field1316))) {
					this.method65(var2.field1317, var2.field1325, var2.field1316, var2.field1326, var2.field1323, var2.field1318, (byte) 1, var2.field1324);
					var2.field1327 = -1;
					if (var2.field1319 == var2.field1316 && var2.field1319 == -1) {
						var2.method604();
					} else if (var2.field1319 == var2.field1316 && var2.field1320 == var2.field1317 && var2.field1321 == var2.field1318) {
						var2.method604();
					}
				}
			} else if (var2.field1319 < 0 || World.method18(var2.field1321, this.field439, var2.field1319)) {
				this.method65(var2.field1320, var2.field1325, var2.field1319, var2.field1326, var2.field1323, var2.field1321, (byte) 1, var2.field1324);
				var2.method604();
			}
		}
	}

	@ObfuscatedName("client.j(I)Ljava/lang/String;")
	public final String method57(int arg0) {
		if (arg0 != -42588) {
			this.field166 = this.field484.g1();
		}
		if (signlink.mainapp == null) {
			return super.field954 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.a(IIILZGNGQRPJ;I)V")
	public final void method58(int arg0, int arg1, int arg2, ClientPlayer arg3, int arg4) {
		if (field463 == arg3 || this.field479 >= 400) {
			return;
		}
		if (arg4 != 0) {
			field259 = !field259;
		}
		String var6;
		if (arg3.field1681 == 0) {
			var6 = arg3.field1673 + method115(arg3.field1675, field463.field1675, 736) + " (level-" + arg3.field1675 + ")";
		} else {
			var6 = arg3.field1673 + " (skill-" + arg3.field1681 + ")";
		}
		if (this.field442 == 1) {
			this.field480[this.field479] = "Use " + this.field446 + " with @whi@" + var6;
			this.field277[this.field479] = 596;
			this.field278[this.field479] = arg0;
			this.field275[this.field479] = arg2;
			this.field276[this.field479] = arg1;
			this.field479++;
		} else if (this.field467 != 1) {
			for (int var7 = 4; var7 >= 0; var7--) {
				if (this.field365[var7] != null) {
					this.field480[this.field479] = this.field365[var7] + " @whi@" + var6;
					short var9 = 0;
					if (this.field365[var7].equalsIgnoreCase("attack")) {
						if (arg3.field1675 > field463.field1675) {
							var9 = 2000;
						}
						if (field463.field1688 != 0 && arg3.field1688 != 0) {
							if (field463.field1688 == arg3.field1688) {
								var9 = 2000;
							} else {
								var9 = 0;
							}
						}
					} else if (this.field366[var7]) {
						var9 = 2000;
					}
					if (var7 == 0) {
						this.field277[this.field479] = var9 + 200;
					}
					if (var7 == 1) {
						this.field277[this.field479] = var9 + 493;
					}
					if (var7 == 2) {
						this.field277[this.field479] = var9 + 408;
					}
					if (var7 == 3) {
						this.field277[this.field479] = var9 + 677;
					}
					if (var7 == 4) {
						this.field277[this.field479] = var9 + 876;
					}
					this.field278[this.field479] = arg0;
					this.field275[this.field479] = arg2;
					this.field276[this.field479] = arg1;
					this.field479++;
				}
			}
		} else if ((this.field469 & 0x8) == 8) {
			this.field480[this.field479] = this.field470 + " @whi@" + var6;
			this.field277[this.field479] = 918;
			this.field278[this.field479] = arg0;
			this.field275[this.field479] = arg2;
			this.field276[this.field479] = arg1;
			this.field479++;
		}
		for (int var8 = 0; var8 < this.field479; var8++) {
			if (this.field277[var8] == 14) {
				this.field480[var8] = "Walk here @whi@" + var6;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method59(boolean arg0) {
		if (!arg0) {
			this.field619 = null;
		}
		if (super.field965 != 1) {
			return;
		}
		if (super.field966 >= 6 && super.field966 <= 106 && super.field967 >= 467 && super.field967 <= 499) {
			this.field302 = (this.field302 + 1) % 4;
			this.field508 = true;
			this.field536 = true;
			// CHAT_SETMODE
			this.field260.p1isaac((byte) 4, 176);
			this.field260.p1(this.field302);
			this.field260.p1(this.field183);
			this.field260.p1(this.field523);
		}
		if (super.field966 >= 135 && super.field966 <= 235 && super.field967 >= 467 && super.field967 <= 499) {
			this.field183 = (this.field183 + 1) % 3;
			this.field508 = true;
			this.field536 = true;
			// CHAT_SETMODE
			this.field260.p1isaac((byte) 4, 176);
			this.field260.p1(this.field302);
			this.field260.p1(this.field183);
			this.field260.p1(this.field523);
		}
		if (super.field966 >= 273 && super.field966 <= 373 && super.field967 >= 467 && super.field967 <= 499) {
			this.field523 = (this.field523 + 1) % 3;
			this.field508 = true;
			this.field536 = true;
			// CHAT_SETMODE
			this.field260.p1isaac((byte) 4, 176);
			this.field260.p1(this.field302);
			this.field260.p1(this.field183);
			this.field260.p1(this.field523);
		}
		if (super.field966 >= 412 && super.field966 <= 512 && super.field967 >= 467 && super.field967 <= 499) {
			if (this.field465 == -1) {
				this.method34(false);
				this.field135 = "";
				this.field394 = false;
				this.field527 = this.field465 = Component.field728;
			} else {
				this.method67("", (byte) -123, "Please close the interface you have open before using 'report abuse'", 0);
			}
		}
		field456++;
		if (field456 > 161) {
			field456 = 0;
			// ANTICHEAT_CYCLELOGIC6
			this.field260.p1isaac((byte) 4, 22);
			this.field260.p2(38304);
			return;
		}
	}

	@ObfuscatedName("client.a(ILMFMVIYHT;I)V")
	public final void method60(int arg0, Packet arg1, int arg2) {
		for (int var4 = 0; var4 < this.field269; var4++) {
			int var6 = this.field270[var4];
			ClientPlayer var7 = this.field266[var6];
			int var8 = arg1.g1();
			if ((var8 & 0x20) != 0) {
				// BIG
				var8 += arg1.g1() << 8;
			}
			this.method84(2, var6, var7, var8, arg1);
		}
		int var5 = 70 / arg0;
	}

	@ObfuscatedName("client.a(IZLMFMVIYHT;)V")
	public final void method61(int arg0, boolean arg1, Packet arg2) {
		arg2.accessBits((byte) 6);
		int var4 = arg2.gBit(402, 1);
		if (var4 == 0) {
			return;
		}
		int var5 = arg2.gBit(402, 2);
		this.field433 &= arg1;
		if (var5 == 0) {
			this.field270[this.field269++] = this.field265;
		} else if (var5 == 1) {
			int var6 = arg2.gBit(402, 3);
			field463.method352(false, var6, -808);
			int var7 = arg2.gBit(402, 1);
			if (var7 == 1) {
				this.field270[this.field269++] = this.field265;
			}
		} else if (var5 == 2) {
			int var8 = arg2.gBit(402, 3);
			field463.method352(true, var8, -808);
			int var9 = arg2.gBit(402, 3);
			field463.method352(true, var9, -808);
			int var10 = arg2.gBit(402, 1);
			if (var10 == 1) {
				this.field270[this.field269++] = this.field265;
			}
		} else if (var5 == 3) {
			int var11 = arg2.gBit(402, 1);
			this.field387 = arg2.gBit(402, 2);
			int var12 = arg2.gBit(402, 7);
			int var13 = arg2.gBit(402, 7);
			int var14 = arg2.gBit(402, 1);
			if (var14 == 1) {
				this.field270[this.field269++] = this.field265;
			}
			field463.method354(var12, (byte) 5, var11 == 1, var13);
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;BIIIII)V")
	public final void method62(int arg0, int arg1, Component arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field423) {
			this.field599 = 32;
		} else {
			this.field599 = 0;
		}
		this.field423 = false;
		if (arg3 != 102) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		if (arg6 >= arg8 && arg6 < arg8 + 16 && arg4 >= arg1 && arg4 < arg1 + 16) {
			arg2.field713 -= this.field390 * 4;
			if (arg5 == 1) {
				this.field477 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.field536 = true;
			}
		} else if (arg6 >= arg8 && arg6 < arg8 + 16 && arg4 >= arg1 + arg7 - 16 && arg4 < arg1 + arg7) {
			arg2.field713 += this.field390 * 4;
			if (arg5 == 1) {
				this.field477 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.field536 = true;
			}
		} else if (arg6 >= arg8 - this.field599 && arg6 < arg8 + 16 + this.field599 && arg4 >= arg1 + 16 && arg4 < arg1 + arg7 - 16 && this.field390 > 0) {
			int var11 = (arg7 - 32) * arg7 / arg0;
			if (var11 < 8) {
				var11 = 8;
			}
			int var12 = arg4 - arg1 - 16 - var11 / 2;
			int var13 = arg7 - 32 - var11;
			arg2.field713 = (arg0 - arg7) * var12 / var13;
			if (arg5 == 1) {
				this.field477 = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.field536 = true;
			}
			this.field423 = true;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method63(byte arg0) {
		if (this.field442 == 0 && this.field467 == 0) {
			this.field480[this.field479] = "Walk here";
			this.field277[this.field479] = 14;
			this.field275[this.field479] = super.field959;
			this.field276[this.field479] = super.field960;
			this.field479++;
		}
		int var2 = -1;
		if (arg0 != 7) {
			this.field166 = -1;
		}
		for (int var3 = 0; var3 < Model.field1255; var3++) {
			int var4 = Model.field1256[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var2 != var4) {
				var2 = var4;
				if (var7 == 2 && this.field460.method304(this.field387, var5, var6, var4) >= 0) {
					LocType var9 = LocType.method561(var8);
					if (var9.field1659 != null) {
						var9 = var9.method562(0);
					}
					if (var9 == null) {
						continue;
					}
					if (this.field442 == 1) {
						this.field480[this.field479] = "Use " + this.field446 + " with @cya@" + var9.field1630;
						this.field277[this.field479] = 467;
						this.field278[this.field479] = var4;
						this.field275[this.field479] = var5;
						this.field276[this.field479] = var6;
						this.field479++;
					} else if (this.field467 != 1) {
						if (var9.field1644 != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.field1644[var10] != null) {
									this.field480[this.field479] = var9.field1644[var10] + " @cya@" + var9.field1630;
									if (var10 == 0) {
										this.field277[this.field479] = 35;
									}
									if (var10 == 1) {
										this.field277[this.field479] = 389;
									}
									if (var10 == 2) {
										this.field277[this.field479] = 888;
									}
									if (var10 == 3) {
										this.field277[this.field479] = 892;
									}
									if (var10 == 4) {
										this.field277[this.field479] = 1280;
									}
									this.field278[this.field479] = var4;
									this.field275[this.field479] = var5;
									this.field276[this.field479] = var6;
									this.field479++;
								}
							}
						}
						this.field480[this.field479] = "Examine @cya@" + var9.field1630;
						this.field277[this.field479] = 1412;
						this.field278[this.field479] = var9.field1627 << 14;
						this.field275[this.field479] = var5;
						this.field276[this.field479] = var6;
						this.field479++;
					} else if ((this.field469 & 0x4) == 4) {
						this.field480[this.field479] = this.field470 + " @cya@" + var9.field1630;
						this.field277[this.field479] = 376;
						this.field278[this.field479] = var4;
						this.field275[this.field479] = var5;
						this.field276[this.field479] = var6;
						this.field479++;
					}
				}
				if (var7 == 1) {
					ClientNpc var11 = this.field428[var8];
					if (var11.field1370.field1445 == 1 && (var11.field1157 & 0x7F) == 64 && (var11.field1158 & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.field429; var12++) {
							ClientNpc var15 = this.field428[this.field430[var12]];
							if (var15 != null && var11 != var15 && var15.field1370.field1445 == 1 && var11.field1157 == var15.field1157 && var11.field1158 == var15.field1158) {
								this.method104(var15.field1370, var6, var5, this.field430[var12], (byte) -76);
							}
						}
						for (int var13 = 0; var13 < this.field267; var13++) {
							ClientPlayer var14 = this.field266[this.field268[var13]];
							if (var14 != null && var11.field1157 == var14.field1157 && var11.field1158 == var14.field1158) {
								this.method58(this.field268[var13], var6, var5, var14, 0);
							}
						}
					}
					this.method104(var11.field1370, var6, var5, var8, (byte) -76);
				}
				if (var7 == 0) {
					ClientPlayer var16 = this.field266[var8];
					if ((var16.field1157 & 0x7F) == 64 && (var16.field1158 & 0x7F) == 64) {
						for (int var17 = 0; var17 < this.field429; var17++) {
							ClientNpc var20 = this.field428[this.field430[var17]];
							if (var20 != null && var20.field1370.field1445 == 1 && var16.field1157 == var20.field1157 && var16.field1158 == var20.field1158) {
								this.method104(var20.field1370, var6, var5, this.field430[var17], (byte) -76);
							}
						}
						for (int var18 = 0; var18 < this.field267; var18++) {
							ClientPlayer var19 = this.field266[this.field268[var18]];
							if (var19 != null && var16 != var19 && var16.field1157 == var19.field1157 && var16.field1158 == var19.field1158) {
								this.method58(this.field268[var18], var6, var5, var19, 0);
							}
						}
					}
					this.method58(var8, var6, var5, var16, 0);
				}
				if (var7 == 3) {
					LinkList var21 = this.field619[this.field387][var5][var6];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.method7(false); var22 != null; var22 = (ClientObj) var21.method9(173)) {
							ObjType var23 = ObjType.method221(var22.field873);
							if (this.field442 == 1) {
								this.field480[this.field479] = "Use " + this.field446 + " with @lre@" + var23.field811;
								this.field277[this.field479] = 100;
								this.field278[this.field479] = var22.field873;
								this.field275[this.field479] = var5;
								this.field276[this.field479] = var6;
								this.field479++;
							} else if (this.field467 != 1) {
								for (int var24 = 4; var24 >= 0; var24--) {
									if (var23.field820 != null && var23.field820[var24] != null) {
										this.field480[this.field479] = var23.field820[var24] + " @lre@" + var23.field811;
										if (var24 == 0) {
											this.field277[this.field479] = 68;
										}
										if (var24 == 1) {
											this.field277[this.field479] = 26;
										}
										if (var24 == 2) {
											this.field277[this.field479] = 684;
										}
										if (var24 == 3) {
											this.field277[this.field479] = 930;
										}
										if (var24 == 4) {
											this.field277[this.field479] = 270;
										}
										this.field278[this.field479] = var22.field873;
										this.field275[this.field479] = var5;
										this.field276[this.field479] = var6;
										this.field479++;
									} else if (var24 == 2) {
										this.field480[this.field479] = "Take @lre@" + var23.field811;
										this.field277[this.field479] = 684;
										this.field278[this.field479] = var22.field873;
										this.field275[this.field479] = var5;
										this.field276[this.field479] = var6;
										this.field479++;
									}
								}
								this.field480[this.field479] = "Examine @lre@" + var23.field811;
								this.field277[this.field479] = 1564;
								this.field278[this.field479] = var22.field873;
								this.field275[this.field479] = var5;
								this.field276[this.field479] = var6;
								this.field479++;
							} else if ((this.field469 & 0x1) == 1) {
								this.field480[this.field479] = this.field470 + " @lre@" + var23.field811;
								this.field277[this.field479] = 199;
								this.field278[this.field479] = var22.field873;
								this.field275[this.field479] = var5;
								this.field276[this.field479] = var6;
								this.field479++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method64(boolean arg0, int arg1) {
		if (arg0) {
			Component.method209(field486, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIBI)V")
	public final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
		if (this.field362 != arg6) {
			this.field471 = -380;
		}
		if (arg1 < 1 || arg3 < 1 || arg1 > 102 || arg3 > 102) {
			return;
		}
		if (field222 && this.field387 != arg4) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg7 == 0) {
			var9 = this.field460.method300(arg4, arg1, arg3);
		}
		if (arg7 == 1) {
			var9 = this.field460.method301(arg1, (byte) 4, arg4, arg3);
		}
		if (arg7 == 2) {
			var9 = this.field460.method302(arg4, arg1, arg3);
		}
		if (arg7 == 3) {
			var9 = this.field460.method303(arg4, arg1, arg3);
		}
		if (var9 != 0) {
			int var13 = this.field460.method304(arg4, arg1, arg3, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg7 == 0) {
				this.field460.method291(arg3, arg4, arg1, true);
				LocType var17 = LocType.method561(var14);
				if (var17.field1664) {
					this.field556[arg4].method537(var16, arg1, 0, arg3, var15, var17.field1663);
				}
			}
			if (arg7 == 1) {
				this.field460.method292(false, arg1, arg3, arg4);
			}
			if (arg7 == 2) {
				this.field460.method293(arg3, arg4, -779, arg1);
				LocType var18 = LocType.method561(var14);
				if (var18.field1655 + arg1 > 103 || var18.field1655 + arg3 > 103 || var18.field1629 + arg1 > 103 || var18.field1629 + arg3 > 103) {
					return;
				}
				if (var18.field1664) {
					this.field556[arg4].method538(this.field351, arg3, arg1, var16, var18.field1629, var18.field1663, var18.field1655);
				}
			}
			if (arg7 == 3) {
				this.field460.method294(arg1, arg3, true, arg4);
				LocType var19 = LocType.method561(var14);
				if (var19.field1664 && var19.field1613) {
					this.field556[arg4].method540(arg1, (byte) -122, arg3);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		int var20 = arg4;
		if (arg4 < 3 && (this.field421[1][arg1][arg3] & 0x2) == 2) {
			var20 = arg4 + 1;
		}
		World.method13(arg2, var20, arg5, arg3, this.field556[arg4], arg0, arg1, 0, arg4, this.field460, this.field187);
		return;
	}

	@ObfuscatedName("client.b(IBLMFMVIYHT;)V")
	public final void method66(int arg0, byte arg1, Packet arg2) {
		arg2.accessBits((byte) 6);
		int var4 = arg2.gBit(402, 8);
		if (this.field613 != arg1) {
			this.field577 = -460;
		}
		if (var4 < this.field429) {
			for (int var5 = var4; var5 < this.field429; var5++) {
				this.field591[this.field590++] = this.field430[var5];
			}
		}
		if (var4 > this.field429) {
			signlink.reporterror(this.field388 + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.field429 = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.field430[var6];
			ClientNpc var8 = this.field428[var7];
			int var9 = arg2.gBit(402, 1);
			if (var9 == 0) {
				this.field430[this.field429++] = var7;
				var8.field1132 = field621;
			} else {
				int var10 = arg2.gBit(402, 2);
				if (var10 == 0) {
					this.field430[this.field429++] = var7;
					var8.field1132 = field621;
					this.field270[this.field269++] = var7;
				} else if (var10 == 1) {
					this.field430[this.field429++] = var7;
					var8.field1132 = field621;
					int var11 = arg2.gBit(402, 3);
					var8.method352(false, var11, -808);
					int var12 = arg2.gBit(402, 1);
					if (var12 == 1) {
						this.field270[this.field269++] = var7;
					}
				} else if (var10 == 2) {
					this.field430[this.field429++] = var7;
					var8.field1132 = field621;
					int var13 = arg2.gBit(402, 3);
					var8.method352(true, var13, -808);
					int var14 = arg2.gBit(402, 3);
					var8.method352(true, var14, -808);
					int var15 = arg2.gBit(402, 1);
					if (var15 == 1) {
						this.field270[this.field269++] = var7;
					}
				} else if (var10 == 3) {
					this.field591[this.field590++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;I)V")
	public final void method67(String arg0, byte arg1, String arg2, int arg3) {
		if (arg3 == 0 && this.field487 != -1) {
			this.field354 = arg2;
			super.field965 = 0;
		}
		if (this.field284 == -1) {
			this.field536 = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			this.field592[var5] = this.field592[var5 - 1];
			this.field593[var5] = this.field593[var5 - 1];
			this.field594[var5] = this.field594[var5 - 1];
		}
		if (this.field197 != arg1) {
			this.field436 = this.field195.method329();
		}
		this.field592[0] = arg3;
		this.field593[0] = arg0;
		this.field594[0] = arg2;
	}

	@ObfuscatedName("client.a(LMFMVIYHT;ZI)V")
	public final void method68(Packet arg0, boolean arg1, int arg2) {
		this.field433 &= arg1;
		this.field590 = 0;
		this.field269 = 0;
		this.method66(arg2, (byte) -58, arg0);
		this.method157(arg0, arg2, false);
		this.method83(arg0, arg2, 838);
		for (int var4 = 0; var4 < this.field590; var4++) {
			int var6 = this.field591[var4];
			if (field621 != this.field428[var6].field1132) {
				this.field428[var6].field1370 = null;
				this.field428[var6] = null;
			}
		}
		if (arg0.pos != arg2) {
			signlink.reporterror(this.field388 + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg2);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.field429; var5++) {
			if (this.field428[this.field430[var5]] == null) {
				signlink.reporterror(this.field388 + " null entry in npc list - pos:" + var5 + " size:" + this.field429);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method69(int arg0) {
		LocType.field1633.method460();
		LocType.field1616.method460();
		if (arg0 <= 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		NpcType.field1438.method460();
		ObjType.field819.method460();
		ObjType.field828.method460();
		ClientPlayer.field1683.method460();
		SpotAnimType.field1309.method460();
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method70(boolean arg0) {
		signlink.midiplay = false;
		if (arg0) {
			this.field415 = 466;
		}
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method71(boolean arg0) {
		ClientProj var2 = (ClientProj) this.field578.method6();
		if (arg0) {
			this.field624 = 153;
		}
		while (var2 != null) {
			if (this.field387 != var2.field975 || field621 > var2.field987) {
				var2.method604();
			} else if (field621 >= var2.field986) {
				if (var2.field981 > 0) {
					ClientNpc var3 = this.field428[var2.field981 - 1];
					if (var3 != null && var3.field1157 >= 0 && var3.field1157 < 13312 && var3.field1158 >= 0 && var3.field1158 < 13312) {
						var2.method271(var3.field1157, var3.field1158, this.method133(var3.field1158, var3.field1157, (byte) 9, var2.field975) - var2.field1000, field621, 0);
					}
				}
				if (var2.field981 < 0) {
					int var4 = -var2.field981 - 1;
					ClientPlayer var5;
					if (this.field257 == var4) {
						var5 = field463;
					} else {
						var5 = this.field266[var4];
					}
					if (var5 != null && var5.field1157 >= 0 && var5.field1157 < 13312 && var5.field1158 >= 0 && var5.field1158 < 13312) {
						var2.method271(var5.field1157, var5.field1158, this.method133(var5.field1158, var5.field1157, (byte) 9, var2.field975) - var2.field1000, field621, 0);
					}
				}
				var2.method272(this.field247, false);
				this.field460.method285(-1, var2, (int) var2.field976, (int) var2.field978, false, 0, this.field387, 60, (int) var2.field977, var2.field983);
			}
			var2 = (ClientProj) this.field578.method8(1);
		}
		field464++;
		if (field464 > 51) {
			field464 = 0;
			// ANTICHEAT_CYCLELOGIC5
			this.field260.p1isaac((byte) 4, 248);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method72(boolean arg0) {
		this.field588 = new Pix8(this.field184, "titlebox", 0);
		this.field589 = new Pix8(this.field184, "titlebutton", 0);
		this.field413 = new Pix8[12];
		if (arg0) {
			this.method86();
		}
		for (int var2 = 0; var2 < 12; var2++) {
			this.field413[var2] = new Pix8(this.field184, "runes", var2);
		}
		this.field313 = new Pix32(128, 265);
		this.field314 = new Pix32(128, 265);
		for (int var3 = 0; var3 < 33920; var3++) {
			this.field313.field685[var3] = this.field497.field878[var3];
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.field314.field685[var4] = this.field498.field878[var4];
		}
		this.field607 = new int[256];
		for (int var5 = 0; var5 < 64; var5++) {
			this.field607[var5] = var5 * 262144;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			this.field607[var6 + 64] = var6 * 1024 + 16711680;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			this.field607[var7 + 128] = var7 * 4 + 16776960;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			this.field607[var8 + 192] = 16777215;
		}
		this.field608 = new int[256];
		for (int var9 = 0; var9 < 64; var9++) {
			this.field608[var9] = var9 * 1024;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			this.field608[var10 + 64] = var10 * 4 + 65280;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			this.field608[var11 + 128] = var11 * 262144 + 65535;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			this.field608[var12 + 192] = 16777215;
		}
		this.field609 = new int[256];
		for (int var13 = 0; var13 < 64; var13++) {
			this.field609[var13] = var13 * 4;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			this.field609[var14 + 64] = var14 * 262144 + 255;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			this.field609[var15 + 128] = var15 * 1024 + 16711935;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			this.field609[var16 + 192] = 16777215;
		}
		this.field606 = new int[256];
		this.field472 = new int[32768];
		this.field473 = new int[32768];
		this.method105(null, 0);
		this.field380 = new int[32768];
		this.field381 = new int[32768];
		this.method165(10, true, "Connecting to fileserver");
		if (!this.field539) {
			this.field610 = true;
			this.field539 = true;
			this.method142(this, 2);
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method73(long arg0, int arg1) {
		if (arg0 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field155; var4++) {
			if (this.field426[var4] == arg0) {
				this.field155--;
				this.field477 = true;
				for (int var5 = var4; var5 < this.field155; var5++) {
					this.field145[var5] = this.field145[var5 + 1];
					this.field563[var5] = this.field563[var5 + 1];
					this.field426[var5] = this.field426[var5 + 1];
				}
				// FRIENDLIST_DEL
				this.field260.p1isaac((byte) 4, 141);
				this.field260.p8(arg0, true);
				break;
			}
		}
		this.field165 += arg1;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method74(int arg0) {
		if (this.field409 != 0) {
			return;
		}
		int var2 = super.field965;
		if (arg0 != 0) {
			this.field166 = this.field484.g1();
		}
		if (this.field467 == 1 && super.field966 >= 516 && super.field967 >= 160 && super.field966 <= 765 && super.field967 <= 205) {
			var2 = 0;
		}
		if (!this.field361) {
			if (var2 == 1 && this.field479 > 0) {
				int var13 = this.field277[this.field479 - 1];
				if (var13 == 9 || var13 == 225 || var13 == 444 || var13 == 564 || var13 == 894 || var13 == 961 || var13 == 399 || var13 == 324 || var13 == 227 || var13 == 891 || var13 == 52 || var13 == 1094) {
					int var14 = this.field275[this.field479 - 1];
					int var15 = this.field276[this.field479 - 1];
					Component var16 = Component.method204(var15);
					if (var16.field756 || var16.field699) {
						this.field451 = false;
						this.field565 = 0;
						this.field407 = var15;
						this.field408 = var14;
						this.field409 = 2;
						this.field410 = super.field966;
						this.field411 = super.field967;
						if (Component.method204(var15).field730 == this.field465) {
							this.field409 = 1;
						}
						if (Component.method204(var15).field730 == this.field284) {
							this.field409 = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (this.field596 == 1 || this.method150(this.field479 - 1, this.field457)) && this.field479 > 2) {
				var2 = 2;
			}
			if (var2 == 1 && this.field479 > 0) {
				this.method144(this.field479 - 1, 8);
			}
			if (var2 != 2 || this.field479 <= 0) {
				return;
			}
			this.method131(811);
			return;
		}
		if (var2 != 1) {
			int var3 = super.field959;
			int var4 = super.field960;
			if (this.field600 == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (this.field600 == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (this.field600 == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < this.field601 - 10 || var3 > this.field603 + this.field601 + 10 || var4 < this.field602 - 10 || var4 > this.field604 + this.field602 + 10) {
				this.field361 = false;
				if (this.field600 == 1) {
					this.field477 = true;
				}
				if (this.field600 == 2) {
					this.field536 = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = this.field601;
		int var6 = this.field602;
		int var7 = this.field603;
		int var8 = super.field966;
		int var9 = super.field967;
		if (this.field600 == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.field600 == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.field600 == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < this.field479; var11++) {
			int var12 = (this.field479 - 1 - var11) * 15 + var6 + 31;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			this.method144(var10, 8);
		}
		this.field361 = false;
		if (this.field600 == 1) {
			this.field477 = true;
		}
		if (this.field600 == 2) {
			this.field536 = true;
			return;
		}
	}

	@ObfuscatedName("client.a(ILEPQDEJTO;II)V")
	public final void method75(int arg0, Pix32 arg1, int arg2, int arg3) {
		int var5 = arg0 * arg0 + arg3 * arg3;
		while (arg2 >= 0) {
			this.field166 = -1;
		}
		if (var5 <= 4225 || var5 >= 90000) {
			this.method155(arg0, true, arg1, arg3);
			return;
		}
		int var6 = this.field548 + this.field212 & 0x7FF;
		int var7 = Model.field1257[var6];
		int var8 = Model.field1258[var6];
		int var9 = var7 * 256 / (this.field529 + 256);
		int var10 = var8 * 256 / (this.field529 + 256);
		int var11 = arg0 * var9 + arg3 * var10 >> 16;
		int var12 = arg0 * var10 - arg3 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.field543.method200(256, 15, var15 + 94 + 4 - 10, 15, 20, this.field415, 20, var13, 83 - var16 - 20);
	}

	@ObfuscatedName("client.a(ZIIIII)V")
	public final void method76(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field391.method492(arg5, arg2, -488);
		this.field392.method492(arg3 + arg5 - 16, arg2, -488);
		Pix2D.method337(arg3 - 32, arg5 + 16, this.field227, (byte) -24, 16, arg2);
		int var7 = (arg3 - 32) * arg3 / arg4;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg3 - 32 - var7) * arg1 / (arg4 - arg3);
		Pix2D.method337(var7, arg5 + 16 + var8, this.field376, (byte) -24, 16, arg2);
		Pix2D.method342(arg2, this.field431, var7, false, arg5 + 16 + var8);
		Pix2D.method342(arg2 + 1, this.field431, var7, false, arg5 + 16 + var8);
		if (!arg0) {
			this.field217 = -136;
		}
		Pix2D.method340(arg2, this.field431, arg5 + 16 + var8, 16, true);
		Pix2D.method340(arg2, this.field431, arg5 + 17 + var8, 16, true);
		Pix2D.method342(arg2 + 15, this.field583, var7, false, arg5 + 16 + var8);
		Pix2D.method342(arg2 + 14, this.field583, var7 - 1, false, arg5 + 17 + var8);
		Pix2D.method340(arg2, this.field583, arg5 + 15 + var8 + var7, 16, true);
		Pix2D.method340(arg2 + 1, this.field583, arg5 + 14 + var8 + var7, 15, true);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method77(int arg0, boolean arg1) {
		int var3 = 26 / arg0;
		for (int var4 = 0; var4 < this.field429; var4++) {
			ClientNpc var5 = this.field428[this.field430[var4]];
			int var6 = (this.field430[var4] << 14) + 536870912;
			if (var5 != null && var5.method351(0) && var5.field1370.field1447 == arg1 && var5.field1370.method473(-993)) {
				int var7 = var5.field1157 >> 7;
				int var8 = var5.field1158 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field1148 == 1 && (var5.field1157 & 0x7F) == 64 && (var5.field1158 & 0x7F) == 64) {
						if (this.field182[var7][var8] == this.field434) {
							continue;
						}
						this.field182[var7][var8] = this.field434;
					}
					if (!var5.field1370.field1434) {
						var6 += Integer.MIN_VALUE;
					}
					this.field460.method285(var6, var5, var5.field1157, this.method133(var5.field1158, var5.field1157, (byte) 9, this.field387), var5.field1139, 0, this.field387, (var5.field1148 - 1) * 64 + 60, var5.field1158, var5.field1159);
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method78(int arg0, int arg1) {
		signlink.wavevol = arg1;
		if (arg0 <= 0) {
			this.field347 = 57;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method79(int arg0) {
		if (this.field169 > 0) {
			this.method148(true);
			return;
		}
		this.method149(-332, "Please wait - attempting to reestablish", "Connection lost");
		this.field346 = 0;
		if (arg0 != 1) {
			field538 = true;
		}
		this.field416 = 0;
		ClientStream var2 = this.field320;
		this.field433 = false;
		this.field146 = 0;
		this.method101(this.field388, this.field389, true);
		if (!this.field433) {
			this.method148(true);
		}
		try {
			var2.method233();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;)Z")
	public final boolean method80(int arg0, Component arg1) {
		int var3 = arg1.field724;
		if (arg0 <= 0) {
			this.field166 = -1;
		}
		if (this.field156 == 2) {
			if (var3 == 201) {
				this.field536 = true;
				this.field540 = 0;
				this.field162 = true;
				this.field322 = "";
				this.field517 = 1;
				this.field233 = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.field536 = true;
				this.field540 = 0;
				this.field162 = true;
				this.field322 = "";
				this.field517 = 2;
				this.field233 = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			this.field169 = 250;
			return true;
		}
		if (var3 == 501) {
			this.field536 = true;
			this.field540 = 0;
			this.field162 = true;
			this.field322 = "";
			this.field517 = 4;
			this.field233 = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.field536 = true;
			this.field540 = 0;
			this.field162 = true;
			this.field322 = "";
			this.field517 = 5;
			this.field233 = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.field622[var4];
			if (var6 != -1) {
				while (true) {
					if (var5 == 0) {
						var6--;
						if (var6 < 0) {
							var6 = IdkType.field1698 - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.field1698) {
							var6 = 0;
						}
					}
					if (!IdkType.field1699[var6].field1705 && IdkType.field1699[var6].field1700 == var4 + (this.field440 ? 0 : 7)) {
						this.field622[var4] = var6;
						this.field573 = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.field395[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = field304[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= field304[var7].length) {
					var9 = 0;
				}
			}
			this.field395[var7] = var9;
			this.field573 = true;
		}
		if (var3 == 324 && !this.field440) {
			this.field440 = true;
			this.method45(this.field311);
		}
		if (var3 == 325 && this.field440) {
			this.field440 = false;
			this.method45(this.field311);
		}
		if (var3 == 326) {
			// IF_PLAYERDESIGN
			this.field260.p1isaac((byte) 4, 163);
			this.field260.p1(this.field440 ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.field260.p1(this.field622[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.field260.p1(this.field395[var11]);
			}
			return true;
		}
		if (var3 == 620) {
			this.field394 = !this.field394;
		}
		if (var3 >= 601 && var3 <= 613) {
			this.method34(false);
			if (this.field135.length() > 0) {
				// REPORT_ABUSE
				this.field260.p1isaac((byte) 4, 184);
				this.field260.p8(JString.method344(this.field135), true);
				this.field260.p1(var3 - 601);
				this.field260.p1(this.field394 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)LATJMVOZR;")
	public final Jagfile method81(int arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (this.field524[0] != null) {
				var7 = this.field524[0].method325(this.field194, arg4);
			}
		} catch (Exception var30) {
		}
		if (var7 != null) {
			this.field384.reset();
			this.field384.update(var7);
			int var9 = (int) this.field384.getValue();
			if (arg1 != var9) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new Jagfile(var7, 3);
		}
		int var11 = 0;
		if (arg0 != 14076) {
			this.field577 = -343;
		}
		while (var7 == null) {
			String var12 = "Unknown error";
			this.method165(arg3, true, "Requesting " + arg5);
			Object var13 = null;
			try {
				int var14 = 0;
				DataInputStream var15 = this.method51(arg2 + arg1);
				byte[] var16 = new byte[6];
				var15.readFully(var16, 0, 6);
				Packet var17 = new Packet(true, var16);
				var17.pos = 3;
				int var18 = var17.g3() + 6;
				int var19 = 6;
				var7 = new byte[var18];
				for (int var20 = 0; var20 < 6; var20++) {
					var7[var20] = var16[var20];
				}
				while (var19 < var18) {
					int var21 = var18 - var19;
					if (var21 > 1000) {
						var21 = 1000;
					}
					int var22 = var15.read(var7, var19, var21);
					if (var22 < 0) {
						(new StringBuffer("Length error: ")).append(var19).append("/").append(var18).toString();
						throw new IOException("EOF");
					}
					var19 += var22;
					int var23 = var19 * 100 / var18;
					if (var14 != var23) {
						this.method165(arg3, true, "Loading " + arg5 + " - " + var23 + "%");
					}
					var14 = var23;
				}
				var15.close();
				try {
					if (this.field524[0] != null) {
						this.field524[0].method326(var7.length, true, var7, arg4);
					}
				} catch (Exception var29) {
					this.field524[0] = null;
				}
				if (var7 != null) {
					this.field384.reset();
					this.field384.update(var7);
					int var24 = (int) this.field384.getValue();
					if (arg1 != var24) {
						var7 = null;
						var11++;
						var12 = "Checksum error: " + var24;
					}
				}
			} catch (IOException var31) {
				if (var12.equals("Unknown error")) {
					var12 = "Connection error";
				}
				var7 = null;
			} catch (NullPointerException var32) {
				var12 = "Null error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var33) {
				var12 = "Bounds error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var34) {
				var12 = "Unexpected error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var26 = var8; var26 > 0; var26--) {
					if (var11 >= 3) {
						this.method165(arg3, true, "Game updated - please reload page");
						var26 = 10;
					} else {
						this.method165(arg3, true, var12 + " - Retrying in " + var26);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var28) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
				this.field196 = !this.field196;
			}
		}
		return new Jagfile(var7, 3);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method82(byte arg0) {
		this.field342 = true;
		if (arg0 == -99) {
			;
		}
	}

	@ObfuscatedName("client.a(LMFMVIYHT;II)V")
	public final void method83(Packet arg0, int arg1, int arg2) {
		int var4 = 24 / arg2;
		for (int var5 = 0; var5 < this.field269; var5++) {
			int var6 = this.field270[var5];
			ClientNpc var7 = this.field428[var6];
			int var8 = arg0.g1();
			if ((var8 & 0x1) != 0) {
				// CHANGETYPE
				var7.field1370 = NpcType.method477(arg0.g2_alt2((byte) 9));
				var7.field1148 = var7.field1370.field1445;
				var7.field1147 = var7.field1370.field1454;
				var7.field1166 = var7.field1370.field1448;
				var7.field1167 = var7.field1370.field1446;
				var7.field1168 = var7.field1370.field1444;
				var7.field1169 = var7.field1370.field1436;
				var7.field1181 = var7.field1370.field1424;
			}
			if ((var8 & 0x40) != 0) {
				// FACE_ENTITY
				var7.field1156 = arg0.g2_alt1(-125);
				if (var7.field1156 == 65535) {
					var7.field1156 = -1;
				}
			}
			if ((var8 & 0x80) != 0) {
				// DAMAGE
				int var9 = arg0.g1_alt1(0);
				int var10 = arg0.g1_alt1(0);
				var7.method353(field621, false, var9, var10);
				var7.field1142 = field621 + 300;
				var7.field1143 = arg0.g1();
				var7.field1144 = arg0.g1_alt3(this.field532);
			}
			if ((var8 & 0x4) != 0) {
				// SPOTANIM
				var7.field1161 = arg0.g2();
				int var11 = arg0.g4_alt2(3);
				var7.field1165 = var11 >> 16;
				var7.field1164 = (var11 & 0xFFFF) + field621;
				var7.field1162 = 0;
				var7.field1163 = 0;
				if (var7.field1164 > field621) {
					var7.field1162 = -1;
				}
				if (var7.field1161 == 65535) {
					var7.field1161 = -1;
				}
			}
			if ((var8 & 0x20) != 0) {
				// SAY
				var7.field1127 = arg0.gjstr();
				var7.field1129 = 100;
			}
			if ((var8 & 0x8) != 0) {
				// FACE_COORD
				var7.field1145 = arg0.g2_alt3(-600);
				var7.field1146 = arg0.g2_alt1(-125);
			}
			if ((var8 & 0x2) != 0) {
				// ANIM
				int var12 = arg0.g2();
				if (var12 == 65535) {
					var12 = -1;
				}
				int var13 = arg0.g1_alt3(this.field532);
				if (var7.field1171 == var12 && var12 != -1) {
					int var14 = SeqType.field775[var12].field789;
					if (var14 == 1) {
						var7.field1172 = 0;
						var7.field1173 = 0;
						var7.field1174 = var13;
						var7.field1175 = 0;
					}
					if (var14 == 2) {
						var7.field1175 = 0;
					}
				} else if (var12 == -1 || var7.field1171 == -1 || SeqType.field775[var12].field783 >= SeqType.field775[var7.field1171].field783) {
					var7.field1171 = var12;
					var7.field1172 = 0;
					var7.field1173 = 0;
					var7.field1174 = var13;
					var7.field1175 = 0;
					var7.field1160 = var7.field1180;
				}
			}
			if ((var8 & 0x10) != 0) {
				// DAMAGE2
				int var15 = arg0.g1_alt3(this.field532);
				int var16 = arg0.g1_alt3(this.field532);
				var7.method353(field621, false, var15, var16);
				var7.field1142 = field621 + 300;
				var7.field1143 = arg0.g1();
				var7.field1144 = arg0.g1_alt2(-34545);
			}
		}
	}

	@ObfuscatedName("client.a(IILZGNGQRPJ;ILMFMVIYHT;)V")
	public final void method84(int arg0, int arg1, ClientPlayer arg2, int arg3, Packet arg4) {
		if (arg0 != 2) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		if ((arg3 & 0x8) != 0) {
			// ANIM
			int var7 = arg4.g2();
			if (var7 == 65535) {
				var7 = -1;
			}
			int var8 = arg4.g1_alt3(this.field532);
			if (arg2.field1171 == var7 && var7 != -1) {
				int var9 = SeqType.field775[var7].field789;
				if (var9 == 1) {
					arg2.field1172 = 0;
					arg2.field1173 = 0;
					arg2.field1174 = var8;
					arg2.field1175 = 0;
				}
				if (var9 == 2) {
					arg2.field1175 = 0;
				}
			} else if (var7 == -1 || arg2.field1171 == -1 || SeqType.field775[var7].field783 >= SeqType.field775[arg2.field1171].field783) {
				arg2.field1171 = var7;
				arg2.field1172 = 0;
				arg2.field1173 = 0;
				arg2.field1174 = var8;
				arg2.field1175 = 0;
				arg2.field1160 = arg2.field1180;
			}
		}
		if ((arg3 & 0x10) != 0) {
			// SAY
			arg2.field1127 = arg4.gjstr();
			if (arg2.field1127.charAt(0) == '~') {
				arg2.field1127 = arg2.field1127.substring(1);
				this.method67(arg2.field1673, (byte) -123, arg2.field1127, 2);
			} else if (field463 == arg2) {
				this.method67(arg2.field1673, (byte) -123, arg2.field1127, 2);
			}
			arg2.field1130 = 0;
			arg2.field1140 = 0;
			arg2.field1129 = 150;
		}
		if ((arg3 & 0x100) != 0) {
			// EXACTMOVE
			arg2.field1149 = arg4.g1_alt1(0);
			arg2.field1151 = arg4.g1_alt2(-34545);
			arg2.field1150 = arg4.g1_alt3(this.field532);
			arg2.field1152 = arg4.g1();
			arg2.field1153 = arg4.g2() + field621;
			arg2.field1154 = arg4.g2_alt2((byte) 9) + field621;
			arg2.field1155 = arg4.g1();
			arg2.method350(-56);
		}
		if ((arg3 & 0x1) != 0) {
			// FACE_ENTITY
			arg2.field1156 = arg4.g2_alt2((byte) 9);
			if (arg2.field1156 == 65535) {
				arg2.field1156 = -1;
			}
		}
		if ((arg3 & 0x2) != 0) {
			// FACE_COORD
			arg2.field1145 = arg4.g2();
			arg2.field1146 = arg4.g2();
		}
		if ((arg3 & 0x200) != 0) {
			// SPOTANIM
			arg2.field1161 = arg4.g2_alt2((byte) 9);
			int var10 = arg4.g4_alt2(3);
			arg2.field1165 = var10 >> 16;
			arg2.field1164 = (var10 & 0xFFFF) + field621;
			arg2.field1162 = 0;
			arg2.field1163 = 0;
			if (arg2.field1164 > field621) {
				arg2.field1162 = -1;
			}
			if (arg2.field1161 == 65535) {
				arg2.field1161 = -1;
			}
		}
		if ((arg3 & 0x4) != 0) {
			// APPEARANCE
			int var11 = arg4.g1();
			byte[] var12 = new byte[var11];
			Packet var13 = new Packet(true, var12);
			arg4.gdata_alt1((byte) -73, var12, var11, 0);
			this.field271[arg1] = var13;
			arg2.method574(var13, 0);
		}
		if ((arg3 & 0x400) != 0) {
			// DAMAGE
			int var14 = arg4.g1_alt1(0);
			int var15 = arg4.g1_alt3(this.field532);
			arg2.method353(field621, false, var14, var15);
			arg2.field1142 = field621 + 300;
			arg2.field1143 = arg4.g1_alt2(-34545);
			arg2.field1144 = arg4.g1();
		}
		if ((arg3 & 0x40) != 0) {
			// CHAT
			int var16 = arg4.g2();
			int var17 = arg4.g1_alt2(-34545);
			int var18 = arg4.g1_alt1(0);
			int var19 = arg4.pos;
			if (arg2.field1673 != null && arg2.field1680) {
				long var20 = JString.method344(arg2.field1673);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < this.field151; var23++) {
						if (this.field369[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}
				if (!var22 && this.field542 == 0) {
					try {
						this.field427.pos = 0;
						arg4.gdata_alt2(this.field427.data, var18, 0, 0);
						this.field427.pos = 0;
						String var24 = WordPack.method453(0, this.field427, var18);
						String var25 = WordFilter.method504((byte) 0, var24);
						arg2.field1127 = var25;
						arg2.field1130 = var16 >> 8;
						arg2.field1140 = var16 & 0xFF;
						arg2.field1129 = 150;
						if (var17 == 2 || var17 == 3) {
							this.method67("@cr2@" + arg2.field1673, (byte) -123, var25, 1);
						} else if (var17 == 1) {
							this.method67("@cr1@" + arg2.field1673, (byte) -123, var25, 1);
						} else {
							this.method67(arg2.field1673, (byte) -123, var25, 2);
						}
					} catch (Exception var29) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg4.pos = var18 + var19;
		}
		if ((arg3 & 0x80) != 0) {
			// DAMAGE2
			int var27 = arg4.g1_alt3(this.field532);
			int var28 = arg4.g1_alt2(-34545);
			arg2.method353(field621, false, var27, var28);
			arg2.field1142 = field621 + 300;
			arg2.field1143 = arg4.g1_alt3(this.field532);
			arg2.field1144 = arg4.g1();
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method85(int arg0) {
		if (this.field494 != null) {
			return;
		}
		super.field952 = null;
		this.field455 = null;
		this.field453 = null;
		this.field452 = null;
		this.field454 = null;
		this.field404 = null;
		this.field405 = null;
		this.field406 = null;
		if (arg0 >= 0) {
			return;
		}
		this.field497 = new PixMap(265, (byte) -12, this.method164(-756), 128);
		Pix2D.method335(4);
		this.field498 = new PixMap(265, (byte) -12, this.method164(-756), 128);
		Pix2D.method335(4);
		this.field494 = new PixMap(171, (byte) -12, this.method164(-756), 509);
		Pix2D.method335(4);
		this.field495 = new PixMap(132, (byte) -12, this.method164(-756), 360);
		Pix2D.method335(4);
		this.field496 = new PixMap(200, (byte) -12, this.method164(-756), 360);
		Pix2D.method335(4);
		this.field499 = new PixMap(238, (byte) -12, this.method164(-756), 202);
		Pix2D.method335(4);
		this.field500 = new PixMap(238, (byte) -12, this.method164(-756), 203);
		Pix2D.method335(4);
		this.field501 = new PixMap(94, (byte) -12, this.method164(-756), 74);
		Pix2D.method335(4);
		this.field502 = new PixMap(94, (byte) -12, this.method164(-756), 75);
		Pix2D.method335(4);
		if (this.field184 != null) {
			this.method166(field503);
			this.method72(false);
		}
		this.field342 = true;
	}

	@ObfuscatedName("client.a()V")
	public final void method86() {
		this.method165(20, true, "Starting up");
		if (signlink.sunjava) {
			super.field945 = 5;
		}
		if (field295) {
			this.field312 = true;
			return;
		}
		field295 = true;
		boolean var1 = false;
		String var2 = this.method57(-42588);
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.231")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.229")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.228")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.227")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.226")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.224")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.223")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.221")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.field393 = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.field524[var3] = new FileStream(var3 + 1, 600000, signlink.cache_dat, signlink.cache_idx[var3], 4);
			}
		}
		try {
			this.method108(false);
			this.field184 = this.method81(14076, this.field133[1], "title", 25, 1, "title screen");
			this.field355 = new PixFont(false, this.field184, -914, "p11_full");
			this.field356 = new PixFont(false, this.field184, -914, "p12_full");
			this.field357 = new PixFont(false, this.field184, -914, "b12_full");
			this.field358 = new PixFont(true, this.field184, -914, "q8_full");
			this.method166(field503);
			this.method72(false);
			Jagfile var4 = this.method81(14076, this.field133[2], "config", 30, 2, "config");
			Jagfile var5 = this.method81(14076, this.field133[3], "interface", 35, 3, "interface");
			Jagfile var6 = this.method81(14076, this.field133[4], "media", 40, 4, "2d graphics");
			Jagfile var7 = this.method81(14076, this.field133[6], "textures", 45, 6, "textures");
			Jagfile var8 = this.method81(14076, this.field133[7], "wordenc", 50, 7, "chat system");
			Jagfile var9 = this.method81(14076, this.field133[8], "sounds", 55, 8, "sound effects");
			this.field421 = new byte[4][104][104];
			this.field187 = new int[4][105][105];
			this.field460 = new World3D(this.field187, 104, 4, 104, (byte) 5);
			for (int var10 = 0; var10 < 4; var10++) {
				this.field556[var10] = new CollisionMap(104, 0, 104);
			}
			this.field418 = new Pix32(512, 512);
			Jagfile var11 = this.method81(14076, this.field133[5], "versionlist", 60, 5, "update list");
			this.method165(60, true, "Connecting to update server");
			this.field587 = new OnDemand();
			this.field587.method592(var11, this);
			AnimFrame.method261(this.field587.method600(553));
			Model.method356(this.field587.method597(0, -31140), this.field587);
			if (!field222) {
				this.field566 = 0;
				this.field567 = true;
				this.field587.method586(2, this.field566);
				while (this.field587.method590() > 0) {
					this.method99(false);
					try {
						Thread.sleep(100L);
					} catch (Exception var74) {
					}
					if (this.field587.field1756 > 3) {
						this.method38("ondemand");
						return;
					}
				}
			}
			this.method165(65, true, "Requesting animations");
			int var12 = this.field587.method597(1, -31140);
			for (int var13 = 0; var13 < var12; var13++) {
				this.field587.method586(1, var13);
			}
			while (this.field587.method590() > 0) {
				int var14 = var12 - this.field587.method590();
				if (var14 > 0) {
					this.method165(65, true, "Loading animations - " + var14 * 100 / var12 + "%");
				}
				this.method99(false);
				try {
					Thread.sleep(100L);
				} catch (Exception var73) {
				}
				if (this.field587.field1756 > 3) {
					this.method38("ondemand");
					return;
				}
			}
			this.method165(70, true, "Requesting models");
			int var15 = this.field587.method597(0, -31140);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = this.field587.method582(var16, -493);
				if ((var17 & 0x1) != 0) {
					this.field587.method586(0, var16);
				}
			}
			int var18 = this.field587.method590();
			while (this.field587.method590() > 0) {
				int var19 = var18 - this.field587.method590();
				if (var19 > 0) {
					this.method165(70, true, "Loading models - " + var19 * 100 / var18 + "%");
				}
				this.method99(false);
				try {
					Thread.sleep(100L);
				} catch (Exception var72) {
				}
			}
			if (this.field524[0] != null) {
				this.method165(75, true, "Requesting maps");
				this.field587.method586(3, this.field587.method601(0, 47, 48, 0));
				this.field587.method586(3, this.field587.method601(0, 47, 48, 1));
				this.field587.method586(3, this.field587.method601(0, 48, 48, 0));
				this.field587.method586(3, this.field587.method601(0, 48, 48, 1));
				this.field587.method586(3, this.field587.method601(0, 49, 48, 0));
				this.field587.method586(3, this.field587.method601(0, 49, 48, 1));
				this.field587.method586(3, this.field587.method601(0, 47, 47, 0));
				this.field587.method586(3, this.field587.method601(0, 47, 47, 1));
				this.field587.method586(3, this.field587.method601(0, 48, 47, 0));
				this.field587.method586(3, this.field587.method601(0, 48, 47, 1));
				this.field587.method586(3, this.field587.method601(0, 48, 148, 0));
				this.field587.method586(3, this.field587.method601(0, 48, 148, 1));
				int var20 = this.field587.method590();
				while (this.field587.method590() > 0) {
					int var21 = var20 - this.field587.method590();
					if (var21 > 0) {
						this.method165(75, true, "Loading maps - " + var21 * 100 / var20 + "%");
					}
					this.method99(false);
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
				}
			}
			int var22 = this.field587.method597(0, -31140);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.field587.method582(var23, -493);
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
					this.field587.method584(-44, 0, var25, var23);
				}
			}
			this.field587.method589(field221, (byte) 109);
			if (!field222) {
				int var26 = this.field587.method597(2, -31140);
				for (int var27 = 1; var27 < var26; var27++) {
					if (this.field587.method585(var27, field259)) {
						this.field587.method584(-44, 2, (byte) 1, var27);
					}
				}
			}
			int var28 = this.field587.method597(0, -31140);
			for (int var29 = 0; var29 < var28; var29++) {
				int var30 = this.field587.method582(var29, -493);
				if (var30 == 0 && this.field587.field1727 < 200) {
					this.field587.method584(-44, 0, (byte) 1, var29);
				}
			}
			this.method165(80, true, "Unpacking media");
			this.field481 = new Pix8(var6, "invback", 0);
			this.field483 = new Pix8(var6, "chatback", 0);
			this.field482 = new Pix8(var6, "mapback", 0);
			this.field261 = new Pix8(var6, "backbase1", 0);
			this.field262 = new Pix8(var6, "backbase2", 0);
			this.field263 = new Pix8(var6, "backhmid1", 0);
			for (int var31 = 0; var31 < 13; var31++) {
				this.field272[var31] = new Pix8(var6, "sideicons", var31);
			}
			this.field412 = new Pix32(var6, "compass", 0);
			this.field543 = new Pix32(var6, "mapedge", 0);
			this.field543.method192(1790);
			for (int var32 = 0; var32 < 72; var32++) {
				this.field449[var32] = new Pix8(var6, "mapscene", var32);
			}
			for (int var33 = 0; var33 < 70; var33++) {
				this.field327[var33] = new Pix32(var6, "mapfunction", var33);
			}
			for (int var34 = 0; var34 < 5; var34++) {
				this.field478[var34] = new Pix32(var6, "hitmarks", var34);
			}
			for (int var35 = 0; var35 < 6; var35++) {
				this.field584[var35] = new Pix32(var6, "headicons_pk", var35);
			}
			for (int var36 = 0; var36 < 9; var36++) {
				this.field375[var36] = new Pix32(var6, "headicons_prayer", var36);
			}
			for (int var37 = 0; var37 < 6; var37++) {
				this.field250[var37] = new Pix32(var6, "headicons_hint", var37);
			}
			this.field382 = new Pix32(var6, "overlay_multiway", 0);
			this.field332 = new Pix32(var6, "mapmarker", 0);
			this.field333 = new Pix32(var6, "mapmarker", 1);
			for (int var38 = 0; var38 < 8; var38++) {
				this.field192[var38] = new Pix32(var6, "cross", var38);
			}
			this.field488 = new Pix32(var6, "mapdots", 0);
			this.field489 = new Pix32(var6, "mapdots", 1);
			this.field490 = new Pix32(var6, "mapdots", 2);
			this.field491 = new Pix32(var6, "mapdots", 3);
			this.field492 = new Pix32(var6, "mapdots", 4);
			this.field391 = new Pix8(var6, "scrollbar", 0);
			this.field392 = new Pix8(var6, "scrollbar", 1);
			this.field176 = new Pix8(var6, "redstone1", 0);
			this.field177 = new Pix8(var6, "redstone2", 0);
			this.field178 = new Pix8(var6, "redstone3", 0);
			this.field179 = new Pix8(var6, "redstone1", 0);
			this.field179.method489(0);
			this.field180 = new Pix8(var6, "redstone2", 0);
			this.field180.method489(0);
			this.field279 = new Pix8(var6, "redstone1", 0);
			this.field279.method490((byte) 7);
			this.field280 = new Pix8(var6, "redstone2", 0);
			this.field280.method490((byte) 7);
			this.field281 = new Pix8(var6, "redstone3", 0);
			this.field281.method490((byte) 7);
			this.field282 = new Pix8(var6, "redstone1", 0);
			this.field282.method489(0);
			this.field282.method490((byte) 7);
			this.field283 = new Pix8(var6, "redstone2", 0);
			this.field283.method489(0);
			this.field283.method490((byte) 7);
			for (int var39 = 0; var39 < 2; var39++) {
				this.field438[var39] = new Pix8(var6, "mod_icons", var39);
			}
			Pix32 var40 = new Pix32(var6, "backleft1", 0);
			this.field202 = new PixMap(var40.field687, (byte) -12, this.method164(-756), var40.field686);
			var40.method193(0, -192, 0);
			Pix32 var41 = new Pix32(var6, "backleft2", 0);
			this.field203 = new PixMap(var41.field687, (byte) -12, this.method164(-756), var41.field686);
			var41.method193(0, -192, 0);
			Pix32 var42 = new Pix32(var6, "backright1", 0);
			this.field204 = new PixMap(var42.field687, (byte) -12, this.method164(-756), var42.field686);
			var42.method193(0, -192, 0);
			Pix32 var43 = new Pix32(var6, "backright2", 0);
			this.field205 = new PixMap(var43.field687, (byte) -12, this.method164(-756), var43.field686);
			var43.method193(0, -192, 0);
			Pix32 var44 = new Pix32(var6, "backtop1", 0);
			this.field206 = new PixMap(var44.field687, (byte) -12, this.method164(-756), var44.field686);
			var44.method193(0, -192, 0);
			Pix32 var45 = new Pix32(var6, "backvmid1", 0);
			this.field207 = new PixMap(var45.field687, (byte) -12, this.method164(-756), var45.field686);
			var45.method193(0, -192, 0);
			Pix32 var46 = new Pix32(var6, "backvmid2", 0);
			this.field208 = new PixMap(var46.field687, (byte) -12, this.method164(-756), var46.field686);
			var46.method193(0, -192, 0);
			Pix32 var47 = new Pix32(var6, "backvmid3", 0);
			this.field209 = new PixMap(var47.field687, (byte) -12, this.method164(-756), var47.field686);
			var47.method193(0, -192, 0);
			Pix32 var48 = new Pix32(var6, "backhmid2", 0);
			this.field210 = new PixMap(var48.field687, (byte) -12, this.method164(-756), var48.field686);
			var48.method193(0, -192, 0);
			int var49 = (int) (Math.random() * 21.0D) - 10;
			int var50 = (int) (Math.random() * 21.0D) - 10;
			int var51 = (int) (Math.random() * 21.0D) - 10;
			int var52 = (int) (Math.random() * 41.0D) - 20;
			for (int var53 = 0; var53 < 100; var53++) {
				if (this.field327[var53] != null) {
					this.field327[var53].method191(var51 + var52, var50 + var52, var49 + var52, -235);
				}
				if (this.field449[var53] != null) {
					this.field449[var53].method491(var51 + var52, var50 + var52, var49 + var52, -235);
				}
			}
			this.method165(83, true, "Unpacking textures");
			Pix3D.method549(var7, -17551);
			Pix3D.method553(0.8D, (byte) 6);
			Pix3D.method548((byte) 7, 20);
			this.method165(86, true, "Unpacking config");
			SeqType.method213(var4, 36135);
			LocType.method564(var4);
			FloType.method216(var4, 36135);
			ObjType.method223(var4);
			NpcType.method474(var4);
			IdkType.method575(var4, 36135);
			SpotAnimType.method437(var4, 36135);
			VarpType.method484(var4, 36135);
			VarbitType.method602(var4, 36135);
			ObjType.field826 = field221;
			if (!field222) {
				this.method165(90, true, "Unpacking sounds");
				byte[] var54 = var9.method2("sounds.dat", null);
				Packet var55 = new Packet(true, var54);
				Wave.method478(var55, 36135);
			}
			this.method165(95, true, "Unpacking interfaces");
			PixFont[] var56 = new PixFont[] { this.field355, this.field356, this.field357, this.field358 };
			Component.method208(-845, var56, var5, var6);
			this.method165(100, true, "Preparing game engine");
			for (int var57 = 0; var57 < 33; var57++) {
				int var58 = 999;
				int var59 = 0;
				for (int var60 = 0; var60 < 34; var60++) {
					if (this.field482.field1548[this.field482.field1550 * var57 + var60] == 0) {
						if (var58 == 999) {
							var58 = var60;
						}
					} else if (var58 != 999) {
						var59 = var60;
						break;
					}
				}
				this.field476[var57] = var58;
				this.field582[var57] = var59 - var58;
			}
			for (int var61 = 5; var61 < 156; var61++) {
				int var62 = 999;
				int var63 = 0;
				for (int var64 = 25; var64 < 172; var64++) {
					if (this.field482.field1548[this.field482.field1550 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
						if (var62 == 999) {
							var62 = var64;
						}
					} else if (var62 != 999) {
						var63 = var64;
						break;
					}
				}
				this.field315[var61 - 5] = var62 - 25;
				this.field216[var61 - 5] = var63 - var62;
			}
			Pix3D.method546(503, 7, 765);
			this.field299 = Pix3D.field1600;
			Pix3D.method546(96, 7, 479);
			this.field296 = Pix3D.field1600;
			Pix3D.method546(261, 7, 190);
			this.field297 = Pix3D.field1600;
			Pix3D.method546(334, 7, 512);
			this.field298 = Pix3D.field1600;
			int[] var65 = new int[9];
			for (int var66 = 0; var66 < 9; var66++) {
				int var67 = var66 * 32 + 128 + 15;
				int var68 = var67 * 3 + 600;
				int var69 = Pix3D.field1598[var67];
				var65[var66] = var68 * var69 >> 16;
			}
			World3D.method310(334, 22845, var65, 800, 500, 512);
			WordFilter.method494(var8);
			this.field544 = new MouseTracking(this, (byte) -116);
			this.method142(this.field544, 10);
			ClientLocAnim.field1337 = this;
			LocType.field1624 = this;
			NpcType.field1432 = this;
		} catch (Exception var75) {
			signlink.reporterror("loaderror " + this.field323 + " " + this.field618);
			this.field579 = true;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method87(int arg0, int arg1) {
		if (arg1 >= 0 || field222) {
			return;
		}
		for (int var3 = 0; var3 < this.field586.length; var3++) {
			int var4 = this.field586[var3];
			if (Pix3D.field1608[var4] >= arg0) {
				Pix8 var5 = Pix3D.field1602[var4];
				int var6 = var5.field1551 * var5.field1550 - 1;
				int var7 = this.field247 * var5.field1550 * 2;
				byte[] var8 = var5.field1548;
				byte[] var9 = this.field541;
				for (int var10 = 0; var10 <= var6; var10++) {
					var9[var10] = var8[var10 - var7 & var6];
				}
				var5.field1548 = var9;
				this.field541 = var8;
				Pix3D.method551(var4, 9);
			}
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;IIIIII)V")
	public final void method88(int arg0, Component arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg6 != 23658 || (arg1.field718 != 0 || arg1.field740 == null || arg1.field701 || (arg5 < arg4 || arg7 < arg0 || arg5 > arg1.field723 + arg4 || arg7 > arg1.field720 + arg0))) {
			return;
		}
		int var9 = arg1.field740.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg1.field714[var10] + arg4;
			int var12 = arg1.field758[var10] + arg0 - arg3;
			Component var13 = Component.method204(arg1.field740[var10]);
			int var14 = var13.field710 + var11;
			int var15 = var13.field741 + var12;
			if ((var13.field736 >= 0 || var13.field743 != 0) && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
				if (var13.field736 >= 0) {
					this.field211 = var13.field736;
				} else {
					this.field211 = var13.field697;
				}
			}
			if (var13.field718 == 8 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
				this.field611 = var13.field697;
			}
			if (var13.field718 == 0) {
				this.method88(var15, var13, arg2, var13.field713, var14, arg5, 23658, arg7);
				if (var13.field767 > var13.field720) {
					this.method62(var13.field767, var15, var13, (byte) 102, arg7, arg2, arg5, var13.field720, var13.field723 + var14);
				}
			} else {
				if (var13.field771 == 1 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					boolean var16 = false;
					if (var13.field724 != 0) {
						var16 = this.method43(var13, 8);
					}
					if (!var16) {
						this.field480[this.field479] = var13.field750;
						this.field277[this.field479] = 352;
						this.field276[this.field479] = var13.field697;
						this.field479++;
					}
				}
				if (var13.field771 == 2 && this.field467 == 0 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					String var17 = var13.field763;
					if (var17.indexOf(" ") != -1) {
						var17 = var17.substring(0, var17.indexOf(" "));
					}
					this.field480[this.field479] = var17 + " @gre@" + var13.field693;
					this.field277[this.field479] = 70;
					this.field276[this.field479] = var13.field697;
					this.field479++;
				}
				if (var13.field771 == 3 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					this.field480[this.field479] = "Close";
					if (arg2 == 3) {
						this.field277[this.field479] = 55;
					} else {
						this.field277[this.field479] = 639;
					}
					this.field276[this.field479] = var13.field697;
					this.field479++;
				}
				if (var13.field771 == 4 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					this.field480[this.field479] = var13.field750;
					this.field277[this.field479] = 890;
					this.field276[this.field479] = var13.field697;
					this.field479++;
				}
				if (var13.field771 == 5 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					this.field480[this.field479] = var13.field750;
					this.field277[this.field479] = 518;
					this.field276[this.field479] = var13.field697;
					this.field479++;
				}
				if (var13.field771 == 6 && !this.field535 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.field723 + var14 && arg7 < var13.field720 + var15) {
					this.field480[this.field479] = var13.field750;
					this.field277[this.field479] = 575;
					this.field276[this.field479] = var13.field697;
					this.field479++;
				}
				if (var13.field718 == 2) {
					int var18 = 0;
					for (int var19 = 0; var19 < var13.field720; var19++) {
						for (int var20 = 0; var20 < var13.field723; var20++) {
							int var21 = (var13.field745 + 32) * var20 + var14;
							int var22 = (var13.field726 + 32) * var19 + var15;
							if (var18 < 20) {
								var21 += var13.field703[var18];
								var22 += var13.field695[var18];
							}
							if (arg5 >= var21 && arg7 >= var22 && arg5 < var21 + 32 && arg7 < var22 + 32) {
								this.field359 = var18;
								this.field360 = var13.field697;
								if (var13.field751[var18] > 0) {
									ObjType var23 = ObjType.method221(var13.field751[var18] - 1);
									if (this.field442 == 1 && var13.field711) {
										if (this.field444 != var13.field697 || this.field443 != var18) {
											this.field480[this.field479] = "Use " + this.field446 + " with @lre@" + var23.field811;
											this.field277[this.field479] = 903;
											this.field278[this.field479] = var23.field845;
											this.field275[this.field479] = var18;
											this.field276[this.field479] = var13.field697;
											this.field479++;
										}
									} else if (this.field467 != 1 || !var13.field711) {
										if (var13.field711) {
											for (int var24 = 4; var24 >= 3; var24--) {
												if (var23.field830 != null && var23.field830[var24] != null) {
													this.field480[this.field479] = var23.field830[var24] + " @lre@" + var23.field811;
													if (var24 == 3) {
														this.field277[this.field479] = 227;
													}
													if (var24 == 4) {
														this.field277[this.field479] = 891;
													}
													this.field278[this.field479] = var23.field845;
													this.field275[this.field479] = var18;
													this.field276[this.field479] = var13.field697;
													this.field479++;
												} else if (var24 == 4) {
													this.field480[this.field479] = "Drop @lre@" + var23.field811;
													this.field277[this.field479] = 891;
													this.field278[this.field479] = var23.field845;
													this.field275[this.field479] = var18;
													this.field276[this.field479] = var13.field697;
													this.field479++;
												}
											}
										}
										if (var13.field770) {
											this.field480[this.field479] = "Use @lre@" + var23.field811;
											this.field277[this.field479] = 52;
											this.field278[this.field479] = var23.field845;
											this.field275[this.field479] = var18;
											this.field276[this.field479] = var13.field697;
											this.field479++;
										}
										if (var13.field711 && var23.field830 != null) {
											for (int var25 = 2; var25 >= 0; var25--) {
												if (var23.field830[var25] != null) {
													this.field480[this.field479] = var23.field830[var25] + " @lre@" + var23.field811;
													if (var25 == 0) {
														this.field277[this.field479] = 961;
													}
													if (var25 == 1) {
														this.field277[this.field479] = 399;
													}
													if (var25 == 2) {
														this.field277[this.field479] = 324;
													}
													this.field278[this.field479] = var23.field845;
													this.field275[this.field479] = var18;
													this.field276[this.field479] = var13.field697;
													this.field479++;
												}
											}
										}
										if (var13.field744 != null) {
											for (int var26 = 4; var26 >= 0; var26--) {
												if (var13.field744[var26] != null) {
													this.field480[this.field479] = var13.field744[var26] + " @lre@" + var23.field811;
													if (var26 == 0) {
														this.field277[this.field479] = 9;
													}
													if (var26 == 1) {
														this.field277[this.field479] = 225;
													}
													if (var26 == 2) {
														this.field277[this.field479] = 444;
													}
													if (var26 == 3) {
														this.field277[this.field479] = 564;
													}
													if (var26 == 4) {
														this.field277[this.field479] = 894;
													}
													this.field278[this.field479] = var23.field845;
													this.field275[this.field479] = var18;
													this.field276[this.field479] = var13.field697;
													this.field479++;
												}
											}
										}
										this.field480[this.field479] = "Examine @lre@" + var23.field811;
										this.field277[this.field479] = 1094;
										this.field278[this.field479] = var23.field845;
										this.field275[this.field479] = var18;
										this.field276[this.field479] = var13.field697;
										this.field479++;
									} else if ((this.field469 & 0x10) == 16) {
										this.field480[this.field479] = this.field470 + " @lre@" + var23.field811;
										this.field277[this.field479] = 361;
										this.field278[this.field479] = var23.field845;
										this.field275[this.field479] = var18;
										this.field276[this.field479] = var13.field697;
										this.field479++;
									}
								}
							}
							var18++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method89(int arg0) {
		for (int var2 = 0; var2 < this.field429; var2++) {
			int var3 = this.field430[var2];
			ClientNpc var4 = this.field428[var3];
			if (var4 != null) {
				this.method90(var4.field1370.field1445, (byte) -97, var4);
			}
		}
		if (arg0 != -37214) {
			this.field260.p1(41);
		}
	}

	@ObfuscatedName("client.a(IBLLRUWCBNN;)V")
	public final void method90(int arg0, byte arg1, ClientEntity arg2) {
		if (arg2.field1157 < 128 || arg2.field1158 < 128 || arg2.field1157 >= 13184 || arg2.field1158 >= 13184) {
			arg2.field1171 = -1;
			arg2.field1161 = -1;
			arg2.field1153 = 0;
			arg2.field1154 = 0;
			arg2.field1157 = arg2.field1133[0] * 128 + arg2.field1148 * 64;
			arg2.field1158 = arg2.field1134[0] * 128 + arg2.field1148 * 64;
			arg2.method350(-56);
		}
		if (field463 == arg2 && (arg2.field1157 < 1536 || arg2.field1158 < 1536 || arg2.field1157 >= 11776 || arg2.field1158 >= 11776)) {
			arg2.field1171 = -1;
			arg2.field1161 = -1;
			arg2.field1153 = 0;
			arg2.field1154 = 0;
			arg2.field1157 = arg2.field1133[0] * 128 + arg2.field1148 * 64;
			arg2.field1158 = arg2.field1134[0] * 128 + arg2.field1148 * 64;
			arg2.method350(-56);
		}
		if (arg2.field1153 > field621) {
			this.method91(arg2, true);
		} else if (arg2.field1154 >= field621) {
			this.method92(arg2, -31135);
		} else {
			this.method93(arg2, 0);
		}
		this.method94((byte) 8, arg2);
		this.method95(arg2, -136);
		if (arg1 == -97) {
			;
		}
	}

	@ObfuscatedName("client.a(LLRUWCBNN;Z)V")
	public final void method91(ClientEntity arg0, boolean arg1) {
		if (!arg1) {
			field259 = !field259;
		}
		int var3 = arg0.field1153 - field621;
		int var4 = arg0.field1149 * 128 + arg0.field1148 * 64;
		int var5 = arg0.field1151 * 128 + arg0.field1148 * 64;
		arg0.field1157 += (var4 - arg0.field1157) / var3;
		arg0.field1158 += (var5 - arg0.field1158) / var3;
		arg0.field1170 = 0;
		if (arg0.field1155 == 0) {
			arg0.field1131 = 1024;
		}
		if (arg0.field1155 == 1) {
			arg0.field1131 = 1536;
		}
		if (arg0.field1155 == 2) {
			arg0.field1131 = 0;
		}
		if (arg0.field1155 == 3) {
			arg0.field1131 = 512;
		}
	}

	@ObfuscatedName("client.a(LLRUWCBNN;I)V")
	public final void method92(ClientEntity arg0, int arg1) {
		if (field621 == arg0.field1154 || arg0.field1171 == -1 || arg0.field1174 != 0 || arg0.field1173 + 1 > SeqType.field775[arg0.field1171].method214(0, arg0.field1172)) {
			int var3 = arg0.field1154 - arg0.field1153;
			int var4 = field621 - arg0.field1153;
			int var5 = arg0.field1149 * 128 + arg0.field1148 * 64;
			int var6 = arg0.field1151 * 128 + arg0.field1148 * 64;
			int var7 = arg0.field1150 * 128 + arg0.field1148 * 64;
			int var8 = arg0.field1152 * 128 + arg0.field1148 * 64;
			arg0.field1157 = ((var3 - var4) * var5 + var4 * var7) / var3;
			arg0.field1158 = ((var3 - var4) * var6 + var4 * var8) / var3;
		}
		arg0.field1170 = 0;
		if (arg0.field1155 == 0) {
			arg0.field1131 = 1024;
		}
		if (arg0.field1155 == 1) {
			arg0.field1131 = 1536;
		}
		if (arg0.field1155 == 2) {
			arg0.field1131 = 0;
		}
		if (arg0.field1155 == 3) {
			arg0.field1131 = 512;
		}
		arg0.field1159 = arg0.field1131;
		if (arg1 == -31135) {
			;
		}
	}

	@ObfuscatedName("client.b(LLRUWCBNN;I)V")
	public final void method93(ClientEntity arg0, int arg1) {
		arg0.field1135 = arg0.field1181;
		if (arg0.field1180 == 0) {
			arg0.field1170 = 0;
			return;
		}
		if (arg0.field1171 != -1 && arg0.field1174 == 0) {
			SeqType var3 = SeqType.field775[arg0.field1171];
			if (arg0.field1160 > 0 && var3.field787 == 0) {
				arg0.field1170++;
				return;
			}
			if (arg0.field1160 <= 0 && var3.field788 == 0) {
				arg0.field1170++;
				return;
			}
		}
		int var4 = arg0.field1157;
		int var5 = arg0.field1158;
		int var6 = arg0.field1133[arg0.field1180 - 1] * 128 + arg0.field1148 * 64;
		int var7 = arg0.field1134[arg0.field1180 - 1] * 128 + arg0.field1148 * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg0.field1157 = var6;
			arg0.field1158 = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg0.field1131 = 1280;
			} else if (var5 > var7) {
				arg0.field1131 = 1792;
			} else {
				arg0.field1131 = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg0.field1131 = 768;
			} else if (var5 > var7) {
				arg0.field1131 = 256;
			} else {
				arg0.field1131 = 512;
			}
		} else if (var5 < var7) {
			arg0.field1131 = 1024;
		} else {
			arg0.field1131 = 0;
		}
		int var8 = arg0.field1131 - arg0.field1159 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.field1167;
		if (arg1 != 0) {
			this.field260.p1(34);
		}
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.field1166;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.field1169;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.field1168;
		}
		if (var9 == -1) {
			var9 = arg0.field1166;
		}
		arg0.field1135 = var9;
		int var10 = 4;
		if (arg0.field1159 != arg0.field1131 && arg0.field1156 == -1 && arg0.field1147 != 0) {
			var10 = 2;
		}
		if (arg0.field1180 > 2) {
			var10 = 6;
		}
		if (arg0.field1180 > 3) {
			var10 = 8;
		}
		if (arg0.field1170 > 0 && arg0.field1180 > 1) {
			var10 = 8;
			arg0.field1170--;
		}
		if (arg0.field1138[arg0.field1180 - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg0.field1166 == arg0.field1135 && arg0.field1176 != -1) {
			arg0.field1135 = arg0.field1176;
		}
		if (var4 < var6) {
			arg0.field1157 += var10;
			if (arg0.field1157 > var6) {
				arg0.field1157 = var6;
			}
		} else if (var4 > var6) {
			arg0.field1157 -= var10;
			if (arg0.field1157 < var6) {
				arg0.field1157 = var6;
			}
		}
		if (var5 < var7) {
			arg0.field1158 += var10;
			if (arg0.field1158 > var7) {
				arg0.field1158 = var7;
			}
		} else if (var5 > var7) {
			arg0.field1158 -= var10;
			if (arg0.field1158 < var7) {
				arg0.field1158 = var7;
			}
		}
		if (arg0.field1157 != var6 || arg0.field1158 != var7) {
			return;
		}
		arg0.field1180--;
		if (arg0.field1160 > 0) {
			arg0.field1160--;
			return;
		}
	}

	@ObfuscatedName("client.a(BLLRUWCBNN;)V")
	public final void method94(byte arg0, ClientEntity arg1) {
		if (arg0 != 8) {
			this.field224 = this.field195.method329();
		}
		if (arg1.field1147 == 0) {
			return;
		}
		if (arg1.field1156 != -1 && arg1.field1156 < 32768) {
			ClientNpc var3 = this.field428[arg1.field1156];
			if (var3 != null) {
				int var4 = arg1.field1157 - var3.field1157;
				int var5 = arg1.field1158 - var3.field1158;
				if (var4 != 0 || var5 != 0) {
					arg1.field1131 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg1.field1156 >= 32768) {
			int var6 = arg1.field1156 - 32768;
			if (this.field257 == var6) {
				var6 = this.field265;
			}
			ClientPlayer var7 = this.field266[var6];
			if (var7 != null) {
				int var8 = arg1.field1157 - var7.field1157;
				int var9 = arg1.field1158 - var7.field1158;
				if (var8 != 0 || var9 != 0) {
					arg1.field1131 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg1.field1145 != 0 || arg1.field1146 != 0) && (arg1.field1180 == 0 || arg1.field1170 > 0)) {
			int var10 = arg1.field1157 - (arg1.field1145 - this.field336 - this.field336) * 64;
			int var11 = arg1.field1158 - (arg1.field1146 - this.field337 - this.field337) * 64;
			if (var10 != 0 || var11 != 0) {
				arg1.field1131 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg1.field1145 = 0;
			arg1.field1146 = 0;
		}
		int var12 = arg1.field1131 - arg1.field1159 & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < arg1.field1147 || var12 > 2048 - arg1.field1147) {
			arg1.field1159 = arg1.field1131;
		} else if (var12 > 1024) {
			arg1.field1159 -= arg1.field1147;
		} else {
			arg1.field1159 += arg1.field1147;
		}
		arg1.field1159 &= 0x7FF;
		if (arg1.field1181 != arg1.field1135 || arg1.field1159 == arg1.field1131) {
			return;
		}
		if (arg1.field1182 != -1) {
			arg1.field1135 = arg1.field1182;
			return;
		}
		arg1.field1135 = arg1.field1166;
		return;
	}

	@ObfuscatedName("client.c(LLRUWCBNN;I)V")
	public final void method95(ClientEntity arg0, int arg1) {
		while (arg1 >= 0) {
			this.field624 = this.field195.method329();
		}
		arg0.field1139 = false;
		if (arg0.field1135 != -1) {
			SeqType var3 = SeqType.field775[arg0.field1135];
			arg0.field1137++;
			if (arg0.field1136 < var3.field776 && arg0.field1137 > var3.method214(0, arg0.field1136)) {
				arg0.field1137 = 1;
				arg0.field1136++;
			}
			if (arg0.field1136 >= var3.field776) {
				arg0.field1137 = 1;
				arg0.field1136 = 0;
			}
		}
		if (arg0.field1161 != -1 && field621 >= arg0.field1164) {
			if (arg0.field1162 < 0) {
				arg0.field1162 = 0;
			}
			SeqType var4 = SpotAnimType.field1297[arg0.field1161].field1301;
			arg0.field1163++;
			if (arg0.field1162 < var4.field776 && arg0.field1163 > var4.method214(0, arg0.field1162)) {
				arg0.field1163 = 1;
				arg0.field1162++;
			}
			if (arg0.field1162 >= var4.field776 && (arg0.field1162 < 0 || arg0.field1162 >= var4.field776)) {
				arg0.field1161 = -1;
			}
		}
		if (arg0.field1171 != -1 && arg0.field1174 <= 1) {
			SeqType var5 = SeqType.field775[arg0.field1171];
			if (var5.field787 == 1 && arg0.field1160 > 0 && arg0.field1153 <= field621 && arg0.field1154 < field621) {
				arg0.field1174 = 1;
				return;
			}
		}
		if (arg0.field1171 != -1 && arg0.field1174 == 0) {
			SeqType var6 = SeqType.field775[arg0.field1171];
			arg0.field1173++;
			if (arg0.field1172 < var6.field776 && arg0.field1173 > var6.method214(0, arg0.field1172)) {
				arg0.field1173 = 1;
				arg0.field1172++;
			}
			if (arg0.field1172 >= var6.field776) {
				arg0.field1172 -= var6.field780;
				arg0.field1175++;
				if (arg0.field1175 >= var6.field786) {
					arg0.field1171 = -1;
				}
				if (arg0.field1172 < 0 || arg0.field1172 >= var6.field776) {
					arg0.field1171 = -1;
				}
			}
			arg0.field1139 = var6.field782;
		}
		if (arg0.field1174 > 0) {
			arg0.field1174--;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method96(int arg0) {
		if (this.field349 != -1 && (this.field367 == 2 || super.field952 != null)) {
			if (this.field367 == 2) {
				this.method110(this.field247, this.field349, (byte) 5);
				if (this.field256 != -1) {
					this.method110(this.field247, this.field256, (byte) 5);
				}
				this.field247 = 0;
				this.method174(this.field436);
				super.field952.method240(false);
				Pix3D.field1600 = this.field299;
				Pix2D.method335(4);
				this.field342 = true;
				Component var2 = Component.method204(this.field349);
				if (var2.field723 == 512 && var2.field720 == 334 && var2.field718 == 0) {
					var2.field723 = 765;
					var2.field720 = 503;
				}
				this.method169(0, 0, var2, 0, 8);
				if (this.field256 != -1) {
					Component var3 = Component.method204(this.field256);
					if (var3.field723 == 512 && var3.field720 == 334 && var3.field718 == 0) {
						var3.field723 = 765;
						var3.field720 = 503;
					}
					this.method169(0, 0, var3, 0, 8);
				}
				if (this.field361) {
					this.method153(false);
				} else {
					this.method114(-521);
					this.method54((byte) -79);
				}
			}
			super.field952.method241(0, 0, super.field951, this.field370);
			return;
		}
		if (this.field342) {
			this.method146(-906);
			this.field342 = false;
			this.field202.method241(4, 0, super.field951, this.field370);
			this.field203.method241(357, 0, super.field951, this.field370);
			this.field204.method241(4, 722, super.field951, this.field370);
			this.field205.method241(205, 743, super.field951, this.field370);
			this.field206.method241(0, 0, super.field951, this.field370);
			this.field207.method241(4, 516, super.field951, this.field370);
			this.field208.method241(205, 516, super.field951, this.field370);
			this.field209.method241(357, 496, super.field951, this.field370);
			this.field210.method241(338, 0, super.field951, this.field370);
			this.field477 = true;
			this.field536 = true;
			this.field246 = true;
			this.field508 = true;
			if (this.field367 != 2) {
				this.field454.method241(4, 4, super.field951, this.field370);
				this.field453.method241(4, 550, super.field951, this.field370);
			}
			field533++;
			if (field533 > 85) {
				field533 = 0;
				// ANTICHEAT_CYCLELOGIC2
				this.field260.p1isaac((byte) 4, 168);
			}
		}
		if (this.field367 == 2) {
			this.method178(2);
		}
		if (this.field361 && this.field600 == 1) {
			this.field477 = true;
		}
		if (this.field385 != -1) {
			boolean var4 = this.method110(this.field247, this.field385, (byte) 5);
			if (var4) {
				this.field477 = true;
			}
		}
		if (this.field628 == 2) {
			this.field477 = true;
		}
		if (this.field409 == 2) {
			this.field477 = true;
		}
		if (this.field477) {
			this.method159((byte) 7);
			this.field477 = false;
		}
		if (this.field284 == -1 && this.field540 == 0) {
			this.field545.field713 = this.field403 - this.field147 - 77;
			if (super.field959 > 448 && super.field959 < 560 && super.field960 > 332) {
				this.method62(this.field403, 0, this.field545, (byte) 102, super.field960 - 357, -1, super.field959 - 17, 77, 463);
			}
			int var5 = this.field403 - 77 - this.field545.field713;
			if (var5 < 0) {
				var5 = 0;
			}
			if (var5 > this.field403 - 77) {
				var5 = this.field403 - 77;
			}
			if (this.field147 != var5) {
				this.field147 = var5;
				this.field536 = true;
			}
		}
		if (this.field284 == -1 && this.field540 == 3) {
			int var6 = this.field158 * 14 + 7;
			this.field545.field713 = this.field161;
			if (super.field959 > 448 && super.field959 < 560 && super.field960 > 332) {
				this.method62(var6, 0, this.field545, (byte) 102, super.field960 - 357, -1, super.field959 - 17, 77, 463);
			}
			int var7 = this.field545.field713;
			if (var7 < 0) {
				var7 = 0;
			}
			if (var7 > var6 - 77) {
				var7 = var6 - 77;
			}
			if (this.field161 != var7) {
				this.field161 = var7;
				this.field536 = true;
			}
		}
		if (this.field284 != -1) {
			boolean var8 = this.method110(this.field247, this.field284, (byte) 5);
			if (var8) {
				this.field536 = true;
			}
		}
		if (this.field628 == 3) {
			this.field536 = true;
		}
		if (this.field409 == 3) {
			this.field536 = true;
		}
		if (this.field354 != null) {
			this.field536 = true;
		}
		if (this.field361 && this.field600 == 2) {
			this.field536 = true;
		}
		if (this.field536) {
			this.method106(0);
			this.field536 = false;
		}
		if (this.field367 == 2) {
			this.method109(503);
			this.field453.method241(4, 550, super.field951, this.field370);
		}
		if (this.field509 != -1) {
			this.field246 = true;
		}
		if (this.field246) {
			if (this.field509 != -1 && this.field581 == this.field509) {
				this.field509 = -1;
				// TUTORIAL_CLICKSIDE
				this.field260.p1isaac((byte) 4, 119);
				this.field260.p1(this.field581);
			}
			this.field246 = false;
			this.field406.method240(false);
			this.field263.method492(0, 0, -488);
			if (this.field385 == -1) {
				if (this.field377[this.field581] != -1) {
					if (this.field581 == 0) {
						this.field176.method492(10, 22, -488);
					}
					if (this.field581 == 1) {
						this.field177.method492(8, 54, -488);
					}
					if (this.field581 == 2) {
						this.field177.method492(8, 82, -488);
					}
					if (this.field581 == 3) {
						this.field178.method492(8, 110, -488);
					}
					if (this.field581 == 4) {
						this.field180.method492(8, 153, -488);
					}
					if (this.field581 == 5) {
						this.field180.method492(8, 181, -488);
					}
					if (this.field581 == 6) {
						this.field179.method492(9, 209, -488);
					}
				}
				if (this.field377[0] != -1 && (this.field509 != 0 || field621 % 20 < 10)) {
					this.field272[0].method492(13, 29, -488);
				}
				if (this.field377[1] != -1 && (this.field509 != 1 || field621 % 20 < 10)) {
					this.field272[1].method492(11, 53, -488);
				}
				if (this.field377[2] != -1 && (this.field509 != 2 || field621 % 20 < 10)) {
					this.field272[2].method492(11, 82, -488);
				}
				if (this.field377[3] != -1 && (this.field509 != 3 || field621 % 20 < 10)) {
					this.field272[3].method492(12, 115, -488);
				}
				if (this.field377[4] != -1 && (this.field509 != 4 || field621 % 20 < 10)) {
					this.field272[4].method492(13, 153, -488);
				}
				if (this.field377[5] != -1 && (this.field509 != 5 || field621 % 20 < 10)) {
					this.field272[5].method492(11, 180, -488);
				}
				if (this.field377[6] != -1 && (this.field509 != 6 || field621 % 20 < 10)) {
					this.field272[6].method492(13, 208, -488);
				}
			}
			this.field406.method241(160, 516, super.field951, this.field370);
			this.field405.method240(false);
			this.field262.method492(0, 0, -488);
			if (this.field385 == -1) {
				if (this.field377[this.field581] != -1) {
					if (this.field581 == 7) {
						this.field279.method492(0, 42, -488);
					}
					if (this.field581 == 8) {
						this.field280.method492(0, 74, -488);
					}
					if (this.field581 == 9) {
						this.field280.method492(0, 102, -488);
					}
					if (this.field581 == 10) {
						this.field281.method492(1, 130, -488);
					}
					if (this.field581 == 11) {
						this.field283.method492(0, 173, -488);
					}
					if (this.field581 == 12) {
						this.field283.method492(0, 201, -488);
					}
					if (this.field581 == 13) {
						this.field282.method492(0, 229, -488);
					}
				}
				if (this.field377[8] != -1 && (this.field509 != 8 || field621 % 20 < 10)) {
					this.field272[7].method492(2, 74, -488);
				}
				if (this.field377[9] != -1 && (this.field509 != 9 || field621 % 20 < 10)) {
					this.field272[8].method492(3, 102, -488);
				}
				if (this.field377[10] != -1 && (this.field509 != 10 || field621 % 20 < 10)) {
					this.field272[9].method492(4, 137, -488);
				}
				if (this.field377[11] != -1 && (this.field509 != 11 || field621 % 20 < 10)) {
					this.field272[10].method492(2, 174, -488);
				}
				if (this.field377[12] != -1 && (this.field509 != 12 || field621 % 20 < 10)) {
					this.field272[11].method492(2, 201, -488);
				}
				if (this.field377[13] != -1 && (this.field509 != 13 || field621 % 20 < 10)) {
					this.field272[12].method492(2, 226, -488);
				}
			}
			this.field405.method241(466, 496, super.field951, this.field370);
			this.field454.method240(false);
			Pix3D.field1600 = this.field298;
		}
		if (this.field508) {
			this.field508 = false;
			this.field404.method240(false);
			this.field261.method492(0, 0, -488);
			this.field356.method245(true, this.field352, 16777215, 28, 55, "Public chat");
			if (this.field302 == 0) {
				this.field356.method245(true, this.field352, 65280, 41, 55, "On");
			}
			if (this.field302 == 1) {
				this.field356.method245(true, this.field352, 16776960, 41, 55, "Friends");
			}
			if (this.field302 == 2) {
				this.field356.method245(true, this.field352, 16711680, 41, 55, "Off");
			}
			if (this.field302 == 3) {
				this.field356.method245(true, this.field352, 65535, 41, 55, "Hide");
			}
			this.field356.method245(true, this.field352, 16777215, 28, 184, "Private chat");
			if (this.field183 == 0) {
				this.field356.method245(true, this.field352, 65280, 41, 184, "On");
			}
			if (this.field183 == 1) {
				this.field356.method245(true, this.field352, 16776960, 41, 184, "Friends");
			}
			if (this.field183 == 2) {
				this.field356.method245(true, this.field352, 16711680, 41, 184, "Off");
			}
			this.field356.method245(true, this.field352, 16777215, 28, 324, "Trade/compete");
			if (this.field523 == 0) {
				this.field356.method245(true, this.field352, 65280, 41, 324, "On");
			}
			if (this.field523 == 1) {
				this.field356.method245(true, this.field352, 16776960, 41, 324, "Friends");
			}
			if (this.field523 == 2) {
				this.field356.method245(true, this.field352, 16711680, 41, 324, "Off");
			}
			this.field356.method245(true, this.field352, 16777215, 33, 458, "Report abuse");
			this.field404.method241(453, 0, super.field951, this.field370);
			this.field454.method240(false);
			Pix3D.field1600 = this.field298;
		}
		this.field247 = 0;
		if (arg0 != 7) {
			for (int var9 = 1; var9 > 0; var9++) {
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method97(int arg0) {
		this.field165 += arg0;
		if (this.field519 == 0) {
			return;
		}
		PixFont var2 = this.field356;
		int var3 = 0;
		if (this.field353 != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.field594[var4] != null) {
				int var5 = this.field592[var4];
				String var6 = this.field593[var4];
				byte var7 = 0;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					var7 = 1;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					var7 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field183 == 0 || this.field183 == 1 && this.method175(13292, var6))) {
					int var8 = 329 - var3 * 13;
					byte var9 = 4;
					var2.method248(2245, var9, 0, var8, "From");
					var2.method248(2245, var9, 65535, var8 - 1, "From");
					int var10 = var9 + var2.method246((byte) 35, "From ");
					if (var7 == 1) {
						this.field438[0].method492(var8 - 12, var10, -488);
						var10 += 14;
					}
					if (var7 == 2) {
						this.field438[1].method492(var8 - 12, var10, -488);
						var10 += 14;
					}
					var2.method248(2245, var10, 0, var8, var6 + ": " + this.field594[var4]);
					var2.method248(2245, var10, 65535, var8 - 1, var6 + ": " + this.field594[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && this.field183 < 2) {
					int var11 = 329 - var3 * 13;
					var2.method248(2245, 4, 0, var11, this.field594[var4]);
					var2.method248(2245, 4, 65535, var11 - 1, this.field594[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && this.field183 < 2) {
					int var12 = 329 - var3 * 13;
					var2.method248(2245, 4, 0, var12, "To " + var6 + ": " + this.field594[var4]);
					var2.method248(2245, 4, 65535, var12 - 1, "To " + var6 + ": " + this.field594[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	public final void init() {
		field219 = Integer.parseInt(this.getParameter("nodeid"));
		field220 = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method124(true);
		} else {
			method47(true);
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field221 = false;
		} else {
			field221 = true;
		}
		this.method267(765, 503, 2);
	}

	@ObfuscatedName("client.r(I)V")
	public final void method98(int arg0) {
		while (arg0 >= 0) {
			this.field619 = null;
		}
		for (MapSpotAnim var2 = (MapSpotAnim) this.field506.method6(); var2 != null; var2 = (MapSpotAnim) this.field506.method8(1)) {
			if (this.field387 != var2.field1522 || var2.field1527) {
				var2.method604();
			} else if (field621 >= var2.field1531) {
				var2.method486((byte) 1, this.field247);
				if (var2.field1527) {
					var2.method604();
				} else {
					this.field460.method285(-1, var2, var2.field1523, var2.field1525, false, 0, var2.field1522, 60, var2.field1524, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method99(boolean arg0) {
		if (arg0) {
			this.field166 = -1;
		}
		while (true) {
			OnDemandRequest var2 = this.field587.method587();
			if (var2 == null) {
				return;
			}
			if (var2.field1363 == 0) {
				Model.method357(var2.field1366, var2.field1364, (byte) 7);
				if ((this.field587.method582(var2.field1364, -493) & 0x62) != 0) {
					this.field477 = true;
					if (this.field284 != -1 || this.field487 != -1) {
						this.field536 = true;
					}
				}
			}
			if (var2.field1363 == 1 && var2.field1366 != null) {
				AnimFrame.method262(var2.field1366, true);
			}
			if (var2.field1363 == 2 && this.field566 == var2.field1364 && var2.field1366 != null) {
				this.method44(this.field567, var2.field1366, 659);
			}
			if (var2.field1363 == 3 && this.field367 == 1) {
				for (int var3 = 0; var3 < this.field134.length; var3++) {
					if (this.field153[var3] == var2.field1364) {
						this.field134[var3] = var2.field1366;
						if (var2.field1366 == null) {
							this.field153[var3] = -1;
						}
						break;
					}
					if (this.field154[var3] == var2.field1364) {
						this.field528[var3] = var2.field1366;
						if (var2.field1366 == null) {
							this.field154[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.field1363 == 93 && this.field587.method591(var2.field1364, false)) {
				World.method17(this.field587, new Packet(true, var2.field1366), (byte) -3);
			}
		}
	}

	@ObfuscatedName("client.s(I)Z")
	public final boolean method100(int arg0) {
		if (arg0 <= 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method101(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.field253 = "";
				this.field254 = "Connecting to server...";
				this.method156((byte) -50, true);
			}
			this.field320 = new ClientStream((byte) 2, this.method52(field220 + 43594), this);
			long var4 = JString.method344(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.field260.pos = 0;
			this.field260.p1(14);
			this.field260.p1(var6);
			this.field320.method237(0, 2, 0, this.field260.data);
			for (int var7 = 0; var7 < 8; var7++) {
				this.field320.method234();
			}
			int var8 = this.field320.method234();
			int var9 = var8;
			if (var8 == 0) {
				this.field320.method236(this.field484.data, 0, 8);
				this.field484.pos = 0;
				this.field226 = this.field484.g8(-149);
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field226 >> 32), (int) this.field226 };
				this.field260.pos = 0;
				this.field260.p1(10);
				this.field260.p4(var10[0]);
				this.field260.p4(var10[1]);
				this.field260.p4(var10[2]);
				this.field260.p4(var10[3]);
				this.field260.p4(signlink.uid);
				this.field260.pjstr(arg0);
				this.field260.pjstr(arg1);
				this.field260.rsaenc(this.field218, field136, field612);
				this.field225.pos = 0;
				if (arg2) {
					this.field225.p1(18);
				} else {
					this.field225.p1(16);
				}
				this.field225.p1(this.field260.pos + 36 + 1 + 1 + 2);
				this.field225.p1(255);
				this.field225.p2(377);
				this.field225.p1(field222 ? 1 : 0);
				for (int var11 = 0; var11 < 9; var11++) {
					this.field225.p4(this.field133[var11]);
				}
				this.field225.pdata(this.field260.data, 0, this.field260.pos, 0);
				this.field260.field1284 = new Isaac(this.field471, var10);
				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}
				this.field195 = new Isaac(this.field471, var10);
				this.field320.method237(0, this.field225.pos, 0, this.field225.data);
				var8 = this.field320.method234();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}
				this.method101(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.field163 = this.field320.method234();
				field258 = this.field320.method234() == 1;
				this.field198 = 0L;
				this.field595 = 0;
				this.field544.field99 = 0;
				super.field956 = true;
				this.field571 = true;
				this.field433 = true;
				this.field260.pos = 0;
				this.field484.pos = 0;
				this.field166 = -1;
				this.field199 = -1;
				this.field200 = -1;
				this.field201 = -1;
				this.field165 = 0;
				this.field167 = 0;
				this.field353 = 0;
				this.field169 = 0;
				this.field493 = 0;
				this.field479 = 0;
				this.field361 = false;
				super.field957 = 0;
				for (int var13 = 0; var13 < 100; var13++) {
					this.field594[var13] = null;
				}
				this.field442 = 0;
				this.field467 = 0;
				this.field367 = 0;
				this.field331 = 0;
				this.field149 = (int) (Math.random() * 100.0D) - 50;
				this.field305 = (int) (Math.random() * 110.0D) - 55;
				this.field551 = (int) (Math.random() * 80.0D) - 40;
				this.field212 = (int) (Math.random() * 120.0D) - 60;
				this.field529 = (int) (Math.random() * 30.0D) - 20;
				this.field548 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.field346 = 0;
				this.field572 = -1;
				this.field416 = 0;
				this.field417 = 0;
				this.field267 = 0;
				this.field429 = 0;
				for (int var14 = 0; var14 < this.field264; var14++) {
					this.field266[var14] = null;
					this.field271[var14] = null;
				}
				for (int var15 = 0; var15 < 16384; var15++) {
					this.field428[var15] = null;
				}
				field463 = this.field266[this.field265] = new ClientPlayer();
				this.field578.method10();
				this.field506.method10();
				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							this.field619[var16][var17][var18] = null;
						}
					}
				}
				this.field557 = new LinkList(true);
				this.field156 = 0;
				this.field155 = 0;
				this.method64(field486, this.field487);
				this.field487 = -1;
				this.method64(field486, this.field284);
				this.field284 = -1;
				this.method64(field486, this.field465);
				this.field465 = -1;
				this.method64(field486, this.field349);
				this.field349 = -1;
				this.method64(field486, this.field256);
				this.field256 = -1;
				this.method64(field486, this.field385);
				this.field385 = -1;
				this.method64(field486, this.field575);
				this.field575 = -1;
				this.field535 = false;
				this.field581 = 3;
				this.field540 = 0;
				this.field361 = false;
				this.field162 = false;
				this.field354 = null;
				this.field615 = 0;
				this.field509 = -1;
				this.field440 = true;
				this.method45(this.field311);
				for (int var19 = 0; var19 < 5; var19++) {
					this.field395[var19] = 0;
				}
				for (int var20 = 0; var20 < 5; var20++) {
					this.field365[var20] = null;
					this.field366[var20] = false;
				}
				field396 = 0;
				field461 = 0;
				field531 = 0;
				field348 = 0;
				field435 = 0;
				field137 = 0;
				field526 = 0;
				field309 = 0;
				field345 = 0;
				field458 = 0;
				this.method146(-906);
			} else if (var8 == 3) {
				this.field253 = "";
				this.field254 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.field253 = "Your account has been disabled.";
				this.field254 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.field253 = "Your account is already logged in.";
				this.field254 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.field253 = "RuneScape has been updated!";
				this.field254 = "Please reload this page.";
			} else if (var8 == 7) {
				this.field253 = "This world is full.";
				this.field254 = "Please use a different world.";
			} else if (var8 == 8) {
				this.field253 = "Unable to connect.";
				this.field254 = "Login server offline.";
			} else if (var8 == 9) {
				this.field253 = "Login limit exceeded.";
				this.field254 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.field253 = "Unable to connect.";
				this.field254 = "Bad session id.";
			} else if (var8 == 12) {
				this.field253 = "You need a members account to login to this world.";
				this.field254 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.field253 = "Could not complete login.";
				this.field254 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.field253 = "The server is being updated.";
				this.field254 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.field433 = true;
				this.field260.pos = 0;
				this.field484.pos = 0;
				this.field166 = -1;
				this.field199 = -1;
				this.field200 = -1;
				this.field201 = -1;
				this.field165 = 0;
				this.field167 = 0;
				this.field353 = 0;
				this.field479 = 0;
				this.field361 = false;
				this.field525 = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.field253 = "Login attempts exceeded.";
				this.field254 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.field253 = "You are standing in a members-only area.";
				this.field254 = "To play on this world move to a free area first";
			} else if (var8 == 18) {
				this.field253 = "Account locked as we suspect it has been stolen.";
				this.field254 = "Press 'recover a locked account' on front page.";
			} else if (var8 == 20) {
				this.field253 = "Invalid loginserver requested";
				this.field254 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = this.field320.method234();
				for (int var26 = var21 + 3; var26 >= 0; var26--) {
					this.field253 = "You have only just left another world";
					this.field254 = "Your profile will be transferred in: " + var26;
					this.method156((byte) -50, true);
					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}
				this.method101(arg0, arg1, arg2);
			} else if (var8 == 22) {
				this.field253 = "Malformed login packet.";
				this.field254 = "Please try again.";
			} else if (var8 == 23) {
				this.field253 = "No reply from loginserver.";
				this.field254 = "Please try again.";
			} else if (var8 == 24) {
				this.field253 = "Error loading your profile.";
				this.field254 = "Please contact customer support.";
			} else if (var8 == 25) {
				this.field253 = "Unexpected loginserver response.";
				this.field254 = "Please try using a different world.";
			} else if (var8 == 26) {
				this.field253 = "This computers address has been blocked";
				this.field254 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				this.field253 = "Unexpected server response";
				this.field254 = "Please try using a different world.";
			} else if (var9 != 0) {
				this.field253 = "No response from server";
				this.field254 = "Please try using a different world.";
			} else if (this.field146 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}
				this.field146++;
				this.method101(arg0, arg1, arg2);
			} else {
				this.field253 = "No response from loginserver";
				this.field254 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			this.field253 = "";
			this.field254 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method102(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = this.field460.method304(this.field387, arg2, arg0, arg3);
		if (var6 == -1) {
			return false;
		}
		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var9 = LocType.method561(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field1655;
				var11 = var9.field1629;
			} else {
				var10 = var9.field1629;
				var11 = var9.field1655;
			}
			int var12 = var9.field1618;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}
			this.method55(true, false, arg0, field463.field1134[0], var10, var11, 2, 0, arg2, var12, 0, field463.field1133[0]);
		} else {
			this.method55(true, false, arg0, field463.field1134[0], 0, 0, 2, var7 + 1, arg2, 0, var8, field463.field1133[0]);
		}
		this.field316 = super.field966;
		this.field317 = super.field967;
		this.field319 = 2;
		this.field318 = 0;
		this.field165 += arg1;
		return true;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method103(byte arg0) {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var20 = (int) (Math.random() * 100.0D);
			if (var20 < 50) {
				this.field380[(var2 - 2 << 7) + var3] = 255;
			}
		}
		for (int var4 = 0; var4 < 100; var4++) {
			int var17 = (int) (Math.random() * 124.0D) + 2;
			int var18 = (int) (Math.random() * 128.0D) + 128;
			int var19 = (var18 << 7) + var17;
			this.field380[var19] = 192;
		}
		for (int var5 = 1; var5 < var2 - 1; var5++) {
			for (int var15 = 1; var15 < 127; var15++) {
				int var16 = (var5 << 7) + var15;
				this.field381[var16] = (this.field380[var16 - 1] + this.field380[var16 + 1] + this.field380[var16 - 128] + this.field380[var16 + 128]) / 4;
			}
		}
		this.field534 += 128;
		if (this.field534 > this.field472.length) {
			this.field534 -= this.field472.length;
			int var6 = (int) (Math.random() * 12.0D);
			this.method105(this.field413[var6], 0);
		}
		for (int var7 = 1; var7 < var2 - 1; var7++) {
			for (int var12 = 1; var12 < 127; var12++) {
				int var13 = (var7 << 7) + var12;
				int var14 = this.field381[var13 + 128] - this.field472[this.field534 + var13 & this.field472.length - 1] / 5;
				if (var14 < 0) {
					var14 = 0;
				}
				this.field380[var13] = var14;
			}
		}
		if (arg0 == 1) {
			boolean var8 = false;
		} else {
			for (int var9 = 1; var9 > 0; var9++) {
			}
		}
		for (int var10 = 0; var10 < var2 - 1; var10++) {
			this.field462[var10] = this.field462[var10 + 1];
		}
		this.field462[var2 - 1] = (int) (Math.sin((double) field621 / 14.0D) * 16.0D + Math.sin((double) field621 / 15.0D) * 14.0D + Math.sin((double) field621 / 16.0D) * 12.0D);
		if (this.field343 > 0) {
			this.field343 -= 4;
		}
		if (this.field344 > 0) {
			this.field344 -= 4;
		}
		if (this.field343 != 0 || this.field344 != 0) {
			return;
		}
		int var11 = (int) (Math.random() * 2000.0D);
		if (var11 == 0) {
			this.field343 = 1024;
		}
		if (var11 == 1) {
			this.field344 = 1024;
			return;
		}
	}

	@ObfuscatedName("client.a(LSLDUQHOR;IIIB)V")
	public final void method104(NpcType arg0, int arg1, int arg2, int arg3, byte arg4) {
		if (arg4 != -76) {
			this.field619 = null;
		}
		if (this.field479 >= 400) {
			return;
		}
		if (arg0.field1425 != null) {
			arg0 = arg0.method476(false);
		}
		if (arg0 == null || !arg0.field1434) {
			return;
		}
		String var6 = arg0.field1455;
		if (arg0.field1442 != 0) {
			var6 = var6 + method115(arg0.field1442, field463.field1675, 736) + " (level-" + arg0.field1442 + ")";
		}
		if (this.field442 == 1) {
			this.field480[this.field479] = "Use " + this.field446 + " with @yel@" + var6;
			this.field277[this.field479] = 347;
			this.field278[this.field479] = arg3;
			this.field275[this.field479] = arg2;
			this.field276[this.field479] = arg1;
			this.field479++;
		} else if (this.field467 != 1) {
			if (arg0.field1449 != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg0.field1449[var7] != null && !arg0.field1449[var7].equalsIgnoreCase("attack")) {
						this.field480[this.field479] = arg0.field1449[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.field277[this.field479] = 318;
						}
						if (var7 == 1) {
							this.field277[this.field479] = 921;
						}
						if (var7 == 2) {
							this.field277[this.field479] = 118;
						}
						if (var7 == 3) {
							this.field277[this.field479] = 553;
						}
						if (var7 == 4) {
							this.field277[this.field479] = 432;
						}
						this.field278[this.field479] = arg3;
						this.field275[this.field479] = arg2;
						this.field276[this.field479] = arg1;
						this.field479++;
					}
				}
			}
			if (arg0.field1449 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg0.field1449[var8] != null && arg0.field1449[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg0.field1442 > field463.field1675) {
							var9 = 2000;
						}
						this.field480[this.field479] = arg0.field1449[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.field277[this.field479] = var9 + 318;
						}
						if (var8 == 1) {
							this.field277[this.field479] = var9 + 921;
						}
						if (var8 == 2) {
							this.field277[this.field479] = var9 + 118;
						}
						if (var8 == 3) {
							this.field277[this.field479] = var9 + 553;
						}
						if (var8 == 4) {
							this.field277[this.field479] = var9 + 432;
						}
						this.field278[this.field479] = arg3;
						this.field275[this.field479] = arg2;
						this.field276[this.field479] = arg1;
						this.field479++;
					}
				}
			}
			this.field480[this.field479] = "Examine @yel@" + var6;
			this.field277[this.field479] = 1668;
			this.field278[this.field479] = arg3;
			this.field275[this.field479] = arg2;
			this.field276[this.field479] = arg1;
			this.field479++;
		} else if ((this.field469 & 0x2) == 2) {
			this.field480[this.field479] = this.field470 + " @yel@" + var6;
			this.field277[this.field479] = 67;
			this.field278[this.field479] = arg3;
			this.field275[this.field479] = arg2;
			this.field276[this.field479] = arg1;
			this.field479++;
			return;
		}
	}

	@ObfuscatedName("client.a(LWRRBQEHV;I)V")
	public final void method105(Pix8 arg0, int arg1) {
		this.field165 += arg1;
		short var3 = 256;
		for (int var4 = 0; var4 < this.field472.length; var4++) {
			this.field472[var4] = 0;
		}
		for (int var5 = 0; var5 < 5000; var5++) {
			int var17 = (int) (Math.random() * 128.0D * (double) var3);
			this.field472[var17] = (int) (Math.random() * 256.0D);
		}
		for (int var6 = 0; var6 < 20; var6++) {
			for (int var13 = 1; var13 < var3 - 1; var13++) {
				for (int var15 = 1; var15 < 127; var15++) {
					int var16 = (var13 << 7) + var15;
					this.field473[var16] = (this.field472[var16 - 1] + this.field472[var16 + 1] + this.field472[var16 - 128] + this.field472[var16 + 128]) / 4;
				}
			}
			int[] var14 = this.field472;
			this.field472 = this.field473;
			this.field473 = var14;
		}
		if (arg0 == null) {
			return;
		}
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.field1551; var8++) {
			for (int var9 = 0; var9 < arg0.field1550; var9++) {
				if (arg0.field1548[var7++] != 0) {
					int var10 = var9 + 16 + arg0.field1552;
					int var11 = var8 + 16 + arg0.field1553;
					int var12 = (var11 << 7) + var10;
					this.field472[var12] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method106(int arg0) {
		this.field455.method240(false);
		Pix3D.field1600 = this.field296;
		this.field483.method492(0, 0, -488);
		if (this.field162) {
			this.field357.method244(239, 452, 40, 0, this.field233);
			this.field357.method244(239, 452, 60, 128, this.field322 + "*");
		} else if (this.field540 == 1) {
			this.field357.method244(239, 452, 40, 0, "Enter amount:");
			this.field357.method244(239, 452, 60, 128, this.field245 + "*");
		} else if (this.field540 == 2) {
			this.field357.method244(239, 452, 40, 0, "Enter name:");
			this.field357.method244(239, 452, 60, 128, this.field245 + "*");
		} else if (this.field540 == 3) {
			if (this.field245 != this.field157) {
				this.method33(this.field245, 2);
				this.field157 = this.field245;
			}
			PixFont var2 = this.field356;
			Pix2D.method334(0, 0, 77, 463, true);
			for (int var3 = 0; var3 < this.field158; var3++) {
				int var4 = var3 * 14 + 18 - this.field161;
				if (var4 > 0 && var4 < 110) {
					var2.method244(239, 452, var4, 0, this.field159[var3]);
				}
			}
			Pix2D.method333((byte) 82);
			if (this.field158 > 5) {
				this.method76(true, this.field161, 463, 77, this.field158 * 14 + 7, 0);
			}
			if (this.field245.length() == 0) {
				this.field357.method244(239, 452, 40, 255, "Enter object name");
			} else if (this.field158 == 0) {
				this.field357.method244(239, 452, 40, 0, "No matching objects found, please shorten search");
			}
			var2.method244(239, 452, 90, 0, this.field245 + "*");
			Pix2D.method340(0, 0, 77, 479, true);
		} else if (this.field354 != null) {
			this.field357.method244(239, 452, 40, 0, this.field354);
			this.field357.method244(239, 452, 60, 128, "Click to continue");
		} else if (this.field284 != -1) {
			this.method169(0, 0, Component.method204(this.field284), 0, 8);
		} else if (this.field487 == -1) {
			PixFont var5 = this.field356;
			int var6 = 0;
			Pix2D.method334(0, 0, 77, 463, true);
			for (int var7 = 0; var7 < 100; var7++) {
				if (this.field594[var7] != null) {
					int var9 = this.field592[var7];
					int var10 = 70 - var6 * 14 + this.field147;
					String var11 = this.field593[var7];
					byte var12 = 0;
					if (var11 != null && var11.startsWith("@cr1@")) {
						var11 = var11.substring(5);
						var12 = 1;
					}
					if (var11 != null && var11.startsWith("@cr2@")) {
						var11 = var11.substring(5);
						var12 = 2;
					}
					if (var9 == 0) {
						if (var10 > 0 && var10 < 110) {
							var5.method248(2245, 4, 0, var10, this.field594[var7]);
						}
						var6++;
					}
					if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field302 == 0 || this.field302 == 1 && this.method175(13292, var11))) {
						if (var10 > 0 && var10 < 110) {
							int var13 = 4;
							if (var12 == 1) {
								this.field438[0].method492(var10 - 12, var13, -488);
								var13 += 14;
							}
							if (var12 == 2) {
								this.field438[1].method492(var10 - 12, var13, -488);
								var13 += 14;
							}
							var5.method248(2245, var13, 0, var10, var11 + ":");
							int var14 = var13 + var5.method246((byte) 35, var11) + 8;
							var5.method248(2245, var14, 255, var10, this.field594[var7]);
						}
						var6++;
					}
					if ((var9 == 3 || var9 == 7) && this.field519 == 0 && (var9 == 7 || this.field183 == 0 || this.field183 == 1 && this.method175(13292, var11))) {
						if (var10 > 0 && var10 < 110) {
							byte var15 = 4;
							var5.method248(2245, var15, 0, var10, "From");
							int var16 = var15 + var5.method246((byte) 35, "From ");
							if (var12 == 1) {
								this.field438[0].method492(var10 - 12, var16, -488);
								var16 += 14;
							}
							if (var12 == 2) {
								this.field438[1].method492(var10 - 12, var16, -488);
								var16 += 14;
							}
							var5.method248(2245, var16, 0, var10, var11 + ":");
							int var17 = var16 + var5.method246((byte) 35, var11) + 8;
							var5.method248(2245, var17, 8388608, var10, this.field594[var7]);
						}
						var6++;
					}
					if (var9 == 4 && (this.field523 == 0 || this.field523 == 1 && this.method175(13292, var11))) {
						if (var10 > 0 && var10 < 110) {
							var5.method248(2245, 4, 8388736, var10, var11 + " " + this.field594[var7]);
						}
						var6++;
					}
					if (var9 == 5 && this.field519 == 0 && this.field183 < 2) {
						if (var10 > 0 && var10 < 110) {
							var5.method248(2245, 4, 8388608, var10, this.field594[var7]);
						}
						var6++;
					}
					if (var9 == 6 && this.field519 == 0 && this.field183 < 2) {
						if (var10 > 0 && var10 < 110) {
							var5.method248(2245, 4, 0, var10, "To " + var11 + ":");
							var5.method248(2245, var5.method246((byte) 35, "To " + var11) + 12, 8388608, var10, this.field594[var7]);
						}
						var6++;
					}
					if (var9 == 8 && (this.field523 == 0 || this.field523 == 1 && this.method175(13292, var11))) {
						if (var10 > 0 && var10 < 110) {
							var5.method248(2245, 4, 8270336, var10, var11 + " " + this.field594[var7]);
						}
						var6++;
					}
				}
			}
			Pix2D.method333((byte) 82);
			this.field403 = var6 * 14 + 7;
			if (this.field403 < 78) {
				this.field403 = 78;
			}
			this.method76(true, this.field403 - this.field147 - 77, 463, 77, this.field403, 0);
			String var8;
			if (field463 == null || field463.field1673 == null) {
				var8 = JString.method348(this.field388, (byte) 7);
			} else {
				var8 = field463.field1673;
			}
			var5.method248(2245, 4, 0, 90, var8 + ":");
			var5.method248(2245, var5.method246((byte) 35, var8 + ": ") + 6, 255, 90, this.field400 + "*");
			Pix2D.method340(0, 0, 77, 479, true);
		} else {
			this.method169(0, 0, Component.method204(this.field487), 0, 8);
		}
		if (this.field361 && this.field600 == 2) {
			this.method153(false);
		}
		this.field455.method241(357, 17, super.field951, this.field370);
		this.field454.method240(false);
		Pix3D.field1600 = this.field298;
		if (arg0 != 0) {
			this.field619 = null;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method107(int arg0) {
		for (int var2 = -1; var2 < this.field267; var2++) {
			int var6;
			if (var2 == -1) {
				var6 = this.field265;
			} else {
				var6 = this.field268[var2];
			}
			ClientPlayer var7 = this.field266[var6];
			if (var7 != null && var7.field1129 > 0) {
				var7.field1129--;
				if (var7.field1129 == 0) {
					var7.field1127 = null;
				}
			}
		}
		this.field165 += arg0;
		for (int var3 = 0; var3 < this.field429; var3++) {
			int var4 = this.field430[var3];
			ClientNpc var5 = this.field428[var4];
			if (var5 != null && var5.field1129 > 0) {
				var5.field1129--;
				if (var5.field1129 == 0) {
					var5.field1127 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method108(boolean arg0) {
		int var2 = 5;
		this.field133[8] = 0;
		if (arg0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		int var4 = 0;
		while (this.field133[8] == 0) {
			String var5 = "Unknown problem";
			this.method165(20, true, "Connecting to web server");
			try {
				DataInputStream var6 = this.method51("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 377);
				Packet var7 = new Packet(true, new byte[40]);
				var6.readFully(var7.data, 0, 40);
				var6.close();
				for (int var8 = 0; var8 < 9; var8++) {
					this.field133[var8] = var7.g4();
				}
				int var9 = var7.g4();
				int var10 = 1234;
				for (int var11 = 0; var11 < 9; var11++) {
					var10 = (var10 << 1) + this.field133[var11];
				}
				if (var9 != var10) {
					var5 = "checksum problem";
					this.field133[8] = 0;
				}
			} catch (EOFException var14) {
				var5 = "EOF problem";
				this.field133[8] = 0;
			} catch (IOException var15) {
				var5 = "connection problem";
				this.field133[8] = 0;
			} catch (Exception var16) {
				var5 = "logic problem";
				this.field133[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (this.field133[8] == 0) {
				var4++;
				for (int var12 = var2; var12 > 0; var12--) {
					if (var4 >= 10) {
						this.method165(10, true, "Game updated - please reload page");
						var12 = 10;
					} else {
						this.method165(10, true, var5 + " - Will retry in " + var12 + " secs.");
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var13) {
					}
				}
				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}
				this.field196 = !this.field196;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method109(int arg0) {
		this.field453.method240(false);
		if (this.field346 == 2) {
			byte[] var2 = this.field482.field1548;
			int[] var3 = Pix2D.field1094;
			int var4 = var2.length;
			for (int var5 = 0; var5 < var4; var5++) {
				if (var2[var5] == 0) {
					var3[var5] = 0;
				}
			}
			this.field412.method199(0, 567, 33, 25, 33, this.field582, 0, this.field548, 256, this.field476, 25);
			this.field454.method240(false);
			Pix3D.field1600 = this.field298;
			return;
		}
		int var6 = this.field548 + this.field212 & 0x7FF;
		int var7 = field463.field1157 / 32 + 48;
		int var8 = 58 / arg0;
		int var9 = 464 - field463.field1158 / 32;
		this.field418.method199(5, 567, 151, var7, 146, this.field216, 25, var6, this.field529 + 256, this.field315, var9);
		this.field412.method199(0, 567, 33, 25, 33, this.field582, 0, this.field548, 256, this.field476, 25);
		for (int var10 = 0; var10 < this.field372; var10++) {
			int var40 = this.field373[var10] * 4 + 2 - field463.field1157 / 32;
			int var41 = this.field374[var10] * 4 + 2 - field463.field1158 / 32;
			this.method155(var41, true, this.field574[var10], var40);
		}
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var36 = 0; var36 < 104; var36++) {
				LinkList var37 = this.field619[this.field387][var11][var36];
				if (var37 != null) {
					int var38 = var11 * 4 + 2 - field463.field1157 / 32;
					int var39 = var36 * 4 + 2 - field463.field1158 / 32;
					this.method155(var39, true, this.field488, var38);
				}
			}
		}
		for (int var12 = 0; var12 < this.field429; var12++) {
			ClientNpc var32 = this.field428[this.field430[var12]];
			if (var32 != null && var32.method351(0)) {
				NpcType var33 = var32.field1370;
				if (var33.field1425 != null) {
					var33 = var33.method476(false);
				}
				if (var33 != null && var33.field1439 && var33.field1434) {
					int var34 = var32.field1157 / 32 - field463.field1157 / 32;
					int var35 = var32.field1158 / 32 - field463.field1158 / 32;
					this.method155(var35, true, this.field489, var34);
				}
			}
		}
		for (int var13 = 0; var13 < this.field267; var13++) {
			ClientPlayer var24 = this.field266[this.field268[var13]];
			if (var24 != null && var24.method351(0)) {
				int var25 = var24.field1157 / 32 - field463.field1157 / 32;
				int var26 = var24.field1158 / 32 - field463.field1158 / 32;
				boolean var27 = false;
				long var28 = JString.method344(var24.field1673);
				for (int var30 = 0; var30 < this.field155; var30++) {
					if (this.field426[var30] == var28 && this.field563[var30] != 0) {
						var27 = true;
						break;
					}
				}
				boolean var31 = false;
				if (field463.field1688 != 0 && var24.field1688 != 0 && field463.field1688 == var24.field1688) {
					var31 = true;
				}
				if (var27) {
					this.method155(var26, true, this.field491, var25);
				} else if (var31) {
					this.method155(var26, true, this.field492, var25);
				} else {
					this.method155(var26, true, this.field490, var25);
				}
			}
		}
		if (this.field493 != 0 && field621 % 20 < 10) {
			if (this.field493 == 1 && this.field522 >= 0 && this.field522 < this.field428.length) {
				ClientNpc var14 = this.field428[this.field522];
				if (var14 != null) {
					int var15 = var14.field1157 / 32 - field463.field1157 / 32;
					int var16 = var14.field1158 / 32 - field463.field1158 / 32;
					this.method75(var16, this.field333, -687, var15);
				}
			}
			if (this.field493 == 2) {
				int var17 = (this.field140 - this.field336) * 4 + 2 - field463.field1157 / 32;
				int var18 = (this.field141 - this.field337) * 4 + 2 - field463.field1158 / 32;
				this.method75(var18, this.field333, -687, var17);
			}
			if (this.field493 == 10 && this.field447 >= 0 && this.field447 < this.field266.length) {
				ClientPlayer var19 = this.field266[this.field447];
				if (var19 != null) {
					int var20 = var19.field1157 / 32 - field463.field1157 / 32;
					int var21 = var19.field1158 / 32 - field463.field1158 / 32;
					this.method75(var21, this.field333, -687, var20);
				}
			}
		}
		if (this.field416 != 0) {
			int var22 = this.field416 * 4 + 2 - field463.field1157 / 32;
			int var23 = this.field417 * 4 + 2 - field463.field1158 / 32;
			this.method155(var23, true, this.field332, var22);
		}
		Pix2D.method337(3, 78, 16777215, (byte) -24, 3, 97);
		this.field454.method240(false);
		Pix3D.field1600 = this.field298;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.field954 != null) {
				return new URL("http://127.0.0.1:" + (field220 + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIB)Z")
	public final boolean method110(int arg0, int arg1, byte arg2) {
		boolean var4 = false;
		Component var5 = Component.method204(arg1);
		for (int var6 = 0; var6 < var5.field740.length && var5.field740[var6] != -1; var6++) {
			Component var7 = Component.method204(var5.field740[var6]);
			if (var7.field718 == 0) {
				var4 |= this.method110(arg0, var7.field697, (byte) 5);
			}
			if (var7.field718 == 6 && (var7.field768 != -1 || var7.field769 != -1)) {
				boolean var8 = this.method118(var7, -693);
				int var9;
				if (var8) {
					var9 = var7.field769;
				} else {
					var9 = var7.field768;
				}
				if (var9 != -1) {
					SeqType var10 = SeqType.field775[var9];
					var7.field709 += arg0;
					while (var7.field709 > var10.method214(0, var7.field717)) {
						var7.field709 -= var10.method214(0, var7.field717);
						var7.field717++;
						if (var7.field717 >= var10.field776) {
							var7.field717 -= var10.field780;
							if (var7.field717 < 0 || var7.field717 >= var10.field776) {
								var7.field717 = 0;
							}
						}
						var4 = true;
					}
				}
			}
			if (var7.field718 == 6 && var7.field700 != 0) {
				int var11 = var7.field700 >> 16;
				int var12 = var7.field700 << 16 >> 16;
				int var13 = arg0 * var11;
				int var14 = arg0 * var12;
				var7.field734 = var7.field734 + var13 & 0x7FF;
				var7.field735 = var7.field735 + var14 & 0x7FF;
				var4 = true;
			}
		}
		if (arg2 == 5) {
			boolean var15 = false;
		} else {
			this.field532 = -424;
		}
		return var4;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method111(int arg0, int arg1) {
		if (arg1 < 8 || arg1 > 8) {
			throw new NullPointerException();
		}
		return arg0 < 999999999 ? String.valueOf(arg0) : "*";
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method112(int arg0, long arg1) {
		if (arg0 != -916) {
			this.field166 = this.field484.g1();
		}
		if (arg1 == 0L) {
			return;
		}
		if (this.field151 >= 100) {
			this.method67("", (byte) -123, "Your ignore list is full. Max of 100 hit", 0);
			return;
		}
		String var4 = JString.method348(JString.method345(arg1, 0), (byte) 7);
		for (int var5 = 0; var5 < this.field151; var5++) {
			if (this.field369[var5] == arg1) {
				this.method67("", (byte) -123, var4 + " is already on your ignore list", 0);
				return;
			}
		}
		for (int var6 = 0; var6 < this.field155; var6++) {
			if (this.field426[var6] == arg1) {
				this.method67("", (byte) -123, "Please remove " + var4 + " from your friend list first", 0);
				return;
			}
		}
		this.field369[this.field151++] = arg1;
		this.field477 = true;
		// IGNORELIST_ADD
		this.field260.p1isaac((byte) 4, 217);
		this.field260.p8(arg1, true);
	}

	@ObfuscatedName("client.a(B)V")
	public final void method113(byte arg0) {
		if (this.field312 || this.field579 || this.field393) {
			return;
		}
		field621++;
		if (arg0 != -111) {
			return;
		}
		if (this.field433) {
			this.method48((byte) 4);
		} else {
			this.method176(-724);
		}
		this.method99(false);
	}

	@ObfuscatedName("client.w(I)V")
	public final void method114(int arg0) {
		if (this.field409 != 0) {
			return;
		}
		this.field480[0] = "Cancel";
		this.field277[0] = 1016;
		this.field479 = 1;
		if (arg0 >= 0) {
			this.field300 = this.field195.method329();
		}
		if (this.field349 != -1) {
			this.field211 = 0;
			this.field611 = 0;
			this.method88(0, Component.method204(this.field349), 0, 0, 0, super.field959, 23658, super.field960);
			if (this.field598 != this.field211) {
				this.field598 = this.field211;
			}
			if (this.field611 != this.field425) {
				this.field425 = this.field611;
			}
			return;
		}
		this.method134(this.field474);
		this.field211 = 0;
		this.field611 = 0;
		if (super.field959 > 4 && super.field960 > 4 && super.field959 < 516 && super.field960 < 338) {
			if (this.field465 == -1) {
				this.method63((byte) 7);
			} else {
				this.method88(4, Component.method204(this.field465), 0, 0, 4, super.field959, 23658, super.field960);
			}
		}
		if (this.field598 != this.field211) {
			this.field598 = this.field211;
		}
		if (this.field611 != this.field425) {
			this.field425 = this.field611;
		}
		this.field211 = 0;
		this.field611 = 0;
		if (super.field959 > 553 && super.field960 > 205 && super.field959 < 743 && super.field960 < 466) {
			if (this.field385 != -1) {
				this.method88(205, Component.method204(this.field385), 1, 0, 553, super.field959, 23658, super.field960);
			} else if (this.field377[this.field581] != -1) {
				this.method88(205, Component.method204(this.field377[this.field581]), 1, 0, 553, super.field959, 23658, super.field960);
			}
		}
		if (this.field576 != this.field211) {
			this.field477 = true;
			this.field576 = this.field211;
		}
		if (this.field611 != this.field340) {
			this.field477 = true;
			this.field340 = this.field611;
		}
		this.field211 = 0;
		this.field611 = 0;
		if (super.field959 > 17 && super.field960 > 357 && super.field959 < 496 && super.field960 < 453) {
			if (this.field284 != -1) {
				this.method88(357, Component.method204(this.field284), 2, 0, 17, super.field959, 23658, super.field960);
			} else if (this.field487 != -1) {
				this.method88(357, Component.method204(this.field487), 3, 0, 17, super.field959, 23658, super.field960);
			} else if (super.field960 < 434 && super.field959 < 426 && this.field540 == 0) {
				this.method136(466, super.field959 - 17, super.field960 - 357);
			}
		}
		if ((this.field284 != -1 || this.field487 != -1) && this.field402 != this.field211) {
			this.field536 = true;
			this.field402 = this.field211;
		}
		if ((this.field284 != -1 || this.field487 != -1) && this.field611 != this.field580) {
			this.field536 = true;
			this.field580 = this.field611;
		}
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < this.field479 - 1; var3++) {
				if (this.field277[var3] < 1000 && this.field277[var3 + 1] > 1000) {
					String var4 = this.field480[var3];
					this.field480[var3] = this.field480[var3 + 1];
					this.field480[var3 + 1] = var4;
					int var5 = this.field277[var3];
					this.field277[var3] = this.field277[var3 + 1];
					this.field277[var3 + 1] = var5;
					int var6 = this.field275[var3];
					this.field275[var3] = this.field275[var3 + 1];
					this.field275[var3 + 1] = var6;
					int var7 = this.field276[var3];
					this.field276[var3] = this.field276[var3 + 1];
					this.field276[var3 + 1] = var7;
					int var8 = this.field278[var3];
					this.field278[var3] = this.field278[var3 + 1];
					this.field278[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method115(int arg0, int arg1, int arg2) {
		if (arg2 <= 0) {
			throw new NullPointerException();
		}
		int var3 = arg1 - arg0;
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

	@ObfuscatedName("client.x(I)V")
	public final void method116(int arg0) {
		try {
			this.field572 = -1;
			this.field506.method10();
			this.field578.method10();
			Pix3D.method547((byte) 71);
			this.method69(383);
			this.field460.method274((byte) 7);
			System.gc();
			for (int var2 = 0; var2 < 4; var2++) {
				this.field556[var2].method532();
			}
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						this.field421[var3][var4][var5] = 0;
					}
				}
			}
			World var6 = new World(this.field187, 14290, this.field421, 104, 104);
			int var7 = this.field134.length;
			// NO_TIMEOUT
			this.field260.p1isaac((byte) 4, 40);
			if (!this.field459) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (this.field152[var8] >> 8) * 64 - this.field336;
					int var10 = (this.field152[var8] & 0xFF) * 64 - this.field337;
					byte[] var11 = this.field134[var8];
					if (var11 != null) {
						var6.method22(var10, false, (this.field186 - 6) * 8, var9, var11, (this.field185 - 6) * 8, this.field556);
					}
				}
				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (this.field152[var12] >> 8) * 64 - this.field336;
					int var14 = (this.field152[var12] & 0xFF) * 64 - this.field337;
					byte[] var15 = this.field134[var12];
					if (var15 == null && this.field186 < 800) {
						var6.method28(var13, var14, 64, -810, 64);
					}
				}
				// NO_TIMEOUT
				this.field260.p1isaac((byte) 4, 40);
				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = this.field528[var16];
					if (var17 != null) {
						int var18 = (this.field152[var16] >> 8) * 64 - this.field336;
						int var19 = (this.field152[var16] & 0xFF) * 64 - this.field337;
						var6.method27(var19, this.field556, var18, -571, this.field460, var17);
					}
				}
			}
			if (this.field459) {
				int var20 = 0;
				label252: while (true) {
					if (var20 >= 4) {
						for (int var31 = 0; var31 < 13; var31++) {
							for (int var32 = 0; var32 < 13; var32++) {
								int var33 = this.field175[0][var31][var32];
								if (var33 == -1) {
									var6.method28(var31 * 8, var32 * 8, 8, -810, 8);
								}
							}
						}
						// NO_TIMEOUT
						this.field260.p1isaac((byte) 4, 40);
						int var34 = 0;
						while (true) {
							if (var34 >= 4) {
								break label252;
							}
							for (int var35 = 0; var35 < 13; var35++) {
								for (int var36 = 0; var36 < 13; var36++) {
									int var37 = this.field175[var34][var35][var36];
									if (var37 != -1) {
										int var38 = var37 >> 24 & 0x3;
										int var39 = var37 >> 1 & 0x3;
										int var40 = var37 >> 14 & 0x3FF;
										int var41 = var37 >> 3 & 0x7FF;
										int var42 = (var40 / 8 << 8) + var41 / 8;
										for (int var43 = 0; var43 < this.field152.length; var43++) {
											if (this.field152[var43] == var42 && this.field528[var43] != null) {
												var6.method20(var34, this.field556, this.field460, false, this.field528[var43], var36 * 8, var39, (var40 & 0x7) * 8, var35 * 8, (var41 & 0x7) * 8, var38);
												break;
											}
										}
									}
								}
							}
							var34++;
						}
					}
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							boolean var23 = false;
							int var24 = this.field175[var20][var21][var22];
							if (var24 != -1) {
								int var25 = var24 >> 24 & 0x3;
								int var26 = var24 >> 1 & 0x3;
								int var27 = var24 >> 14 & 0x3FF;
								int var28 = var24 >> 3 & 0x7FF;
								int var29 = (var27 / 8 << 8) + var28 / 8;
								for (int var30 = 0; var30 < this.field152.length; var30++) {
									if (this.field152[var30] == var29 && this.field134[var30] != null) {
										var6.method16(var26, (var28 & 0x7) * 8, false, this.field134[var30], var20, var25, var21 * 8, this.field556, var22 * 8, (var27 & 0x7) * 8);
										var23 = true;
										break;
									}
								}
							}
							if (!var23) {
								var6.method14(this.field368, var20, var22 * 8, var21 * 8);
							}
						}
					}
					var20++;
				}
			}
			// NO_TIMEOUT
			this.field260.p1isaac((byte) 4, 40);
			var6.method15(this.field556, this.field614, this.field460);
			if (this.field454 != null) {
				this.field454.method240(false);
				Pix3D.field1600 = this.field298;
			}
			// NO_TIMEOUT
			this.field260.p1isaac((byte) 4, 40);
			int var44 = World.field113;
			if (var44 > this.field387) {
				var44 = this.field387;
			}
			if (var44 < this.field387 - 1) {
				int var45 = this.field387 - 1;
			}
			if (field222) {
				this.field460.method275(World.field113, true);
			} else {
				this.field460.method275(0, true);
			}
			for (int var46 = 0; var46 < 104; var46++) {
				for (int var47 = 0; var47 < 104; var47++) {
					this.method46(var46, var47);
				}
			}
			this.method37((byte) 3);
		} catch (Exception var61) {
		}
		LocType.field1633.method460();
		if (super.field954 != null) {
			// todo: notifying the client is in a frame
			this.field260.p1isaac((byte) 4, 78);
			this.field260.p4(1057001181);
		}
		if (field222 && signlink.cache_dat != null) {
			int var49 = this.field587.method597(0, -31140);
			for (int var50 = 0; var50 < var49; var50++) {
				int var51 = this.field587.method582(var50, -493);
				if ((var51 & 0x79) == 0) {
					Model.method358(var50, 1);
				}
			}
		}
		System.gc();
		Pix3D.method548((byte) 7, 20);
		this.field587.method593((byte) -125);
		int var52 = (this.field185 - 6) / 8 - 1;
		int var53 = (this.field185 + 6) / 8 + 1;
		int var54 = (this.field186 - 6) / 8 - 1;
		int var55 = (this.field186 + 6) / 8 + 1;
		int var56 = 94 / arg0;
		if (this.field363) {
			var52 = 49;
			var53 = 50;
			var54 = 49;
			var55 = 50;
		}
		for (int var57 = var52; var57 <= var53; var57++) {
			for (int var58 = var54; var58 <= var55; var58++) {
				if (var52 == var57 || var53 == var57 || var54 == var58 || var55 == var58) {
					int var59 = this.field587.method601(0, var57, var58, 0);
					if (var59 != -1) {
						this.field587.method594(var59, 3, this.field232);
					}
					int var60 = this.field587.method601(0, var57, var58, 1);
					if (var60 != -1) {
						this.field587.method594(var60, 3, this.field232);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIB)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 2048 - arg4 & 0x7FF;
		if (arg6 != -103) {
			this.field166 = -1;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = arg3;
		if (var8 != 0) {
			int var13 = Model.field1257[var8];
			int var14 = Model.field1258[var8];
			int var15 = var11 * var14 - arg3 * var13 >> 16;
			var12 = var11 * var13 + arg3 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.field1257[var9];
			int var17 = Model.field1258[var9];
			int var18 = var10 * var17 + var12 * var16 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		this.field512 = arg1 - var10;
		this.field513 = arg0 - var11;
		this.field514 = arg5 - var12;
		this.field515 = arg2;
		this.field516 = arg4;
	}

	@ObfuscatedName("client.b(LEWIXBTLV;I)Z")
	public final boolean method118(Component arg0, int arg1) {
		if (arg1 >= 0) {
			this.field471 = 276;
		}
		if (arg0.field755 == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg0.field755.length; var3++) {
			int var4 = this.method154(3, var3, arg0);
			int var5 = arg0.field738[var3];
			if (arg0.field755[var3] == 2) {
				if (var4 >= var5) {
					return false;
				}
			} else if (arg0.field755[var3] == 3) {
				if (var4 <= var5) {
					return false;
				}
			} else if (arg0.field755[var3] == 4) {
				if (var4 == var5) {
					return false;
				}
			} else if (var4 != var5) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.a(IILMFMVIYHT;)V")
	public final void method119(int arg0, int arg1, Packet arg2) {
		this.field590 = 0;
		this.field269 = 0;
		this.method61(arg0, this.field570, arg2);
		this.method137(arg0, -138, arg2);
		int var4 = 40 / arg1;
		this.method35(arg0, (byte) 6, arg2);
		this.method60(808, arg2, arg0);
		for (int var5 = 0; var5 < this.field590; var5++) {
			int var7 = this.field591[var5];
			if (field621 != this.field266[var7].field1132) {
				this.field266[var7] = null;
			}
		}
		if (arg2.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.field267; var6++) {
			if (this.field266[this.field268[var6]] == null) {
				signlink.reporterror(this.field388 + " null entry in pl list - pos:" + var6 + " size:" + this.field267);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method120(int arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field151; var4++) {
			if (this.field369[var4] == arg1) {
				this.field151--;
				this.field477 = true;
				for (int var5 = var4; var5 < this.field151; var5++) {
					this.field369[var5] = this.field369[var5 + 1];
				}
				// IGNORELIST_DEL
				this.field260.p1isaac((byte) 4, 160);
				this.field260.p8(arg1, true);
				break;
			}
		}
		int var6 = 42 / arg0;
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method121(int arg0) {
		short var2 = 256;
		if (this.field343 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.field343 > 768) {
					this.field606[var3] = this.method129(this.field607[var3], this.field608[var3], 1024 - this.field343, 8);
				} else if (this.field343 > 256) {
					this.field606[var3] = this.field608[var3];
				} else {
					this.field606[var3] = this.method129(this.field608[var3], this.field607[var3], 256 - this.field343, 8);
				}
			}
		} else if (this.field344 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.field344 > 768) {
					this.field606[var4] = this.method129(this.field607[var4], this.field609[var4], 1024 - this.field344, 8);
				} else if (this.field344 > 256) {
					this.field606[var4] = this.field609[var4];
				} else {
					this.field606[var4] = this.method129(this.field609[var4], this.field607[var4], 256 - this.field344, 8);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				this.field606[var5] = this.field607[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.field497.field878[var6] = this.field313.field685[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var24 = (var2 - var9) * this.field462[var9] / var2;
			int var25 = var24 + 22;
			if (var25 < 0) {
				var25 = 0;
			}
			var7 += var25;
			for (int var26 = var25; var26 < 128; var26++) {
				int var27 = this.field380[var7++];
				if (var27 == 0) {
					var8++;
				} else {
					int var29 = 256 - var27;
					int var30 = this.field606[var27];
					int var31 = this.field497.field878[var8];
					this.field497.field878[var8++] = ((var30 & 0xFF00FF) * var27 + (var31 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var30 & 0xFF00) * var27 + (var31 & 0xFF00) * var29 & 0xFF0000) >> 8;
				}
			}
			var8 += var25;
		}
		this.field497.method241(0, 0, super.field951, this.field370);
		int var10 = 66 / arg0;
		for (int var11 = 0; var11 < 33920; var11++) {
			this.field498.field878[var11] = this.field314.field685[var11];
		}
		int var12 = 0;
		int var13 = 1176;
		for (int var14 = 1; var14 < var2 - 1; var14++) {
			int var15 = (var2 - var14) * this.field462[var14] / var2;
			int var16 = 103 - var15;
			int var17 = var13 + var15;
			for (int var18 = 0; var18 < var16; var18++) {
				int var19 = this.field380[var12++];
				if (var19 == 0) {
					var17++;
				} else {
					int var21 = 256 - var19;
					int var22 = this.field606[var19];
					int var23 = this.field498.field878[var17];
					this.field498.field878[var17++] = ((var22 & 0xFF00FF) * var19 + (var23 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var22 & 0xFF00) * var19 + (var23 & 0xFF00) * var21 & 0xFF0000) >> 8;
				}
			}
			var12 += 128 - var16;
			var13 = 128 - var16 - var15 + var17;
		}
		this.field498.method241(0, 637, super.field951, this.field370);
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method122(boolean arg0, byte arg1, int arg2) {
		if (arg1 != 8) {
			this.field260.p1(49);
		}
		signlink.midivol = arg2;
		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method123(int arg0) {
		for (int var2 = -1; var2 < this.field267; var2++) {
			int var4;
			if (var2 == -1) {
				var4 = this.field265;
			} else {
				var4 = this.field268[var2];
			}
			ClientPlayer var5 = this.field266[var4];
			if (var5 != null) {
				this.method90(1, (byte) -97, var5);
			}
		}
		if (arg0 < this.field518 || arg0 > this.field518) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public static final void method124(boolean arg0) {
		World3D.field1013 = true;
		if (!arg0) {
			field538 = true;
		}
		Pix3D.field1589 = true;
		field222 = true;
		World.field132 = true;
		LocType.field1626 = true;
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method125(long arg0, int arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (this.field155 >= 100 && this.field364 != 1) {
			this.method67("", (byte) -123, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
		} else if (this.field155 >= 200) {
			this.method67("", (byte) -123, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
		} else {
			String var4 = JString.method348(JString.method345(arg0, 0), (byte) 7);
			for (int var5 = 0; var5 < this.field155; var5++) {
				if (this.field426[var5] == arg0) {
					this.method67("", (byte) -123, var4 + " is already on your friend list", 0);
					return;
				}
			}
			for (int var6 = 0; var6 < this.field151; var6++) {
				if (this.field369[var6] == arg0) {
					this.method67("", (byte) -123, "Please remove " + var4 + " from your ignore list first", 0);
					return;
				}
			}
			if (!var4.equals(field463.field1673)) {
				this.field145[this.field155] = var4;
				if (arg1 != -45229) {
					this.field474 = -30;
				}
				this.field426[this.field155] = arg0;
				this.field563[this.field155] = 0;
				this.field155++;
				this.field477 = true;
				// FRIENDLIST_ADD
				this.field260.p1isaac((byte) 4, 120);
				this.field260.p8(arg0, true);
			}
		}
	}

	@ObfuscatedName("client.a(BLEWIXBTLV;)V")
	public final void method126(byte arg0, Component arg1) {
		if (arg0 == 2) {
			boolean var3 = false;
		} else {
			this.field300 = -82;
		}
		int var4 = arg1.field724;
		if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
			if (var4 >= 101 && var4 <= 200 || !(var4 < 801 || var4 > 900)) {
				int var6 = this.field155;
				if (this.field156 != 2) {
					var6 = 0;
				}
				if (var4 > 800) {
					var4 -= 701;
				} else {
					var4 -= 101;
				}
				if (var4 >= var6) {
					arg1.field712 = "";
					arg1.field771 = 0;
				} else {
					if (this.field563[var4] == 0) {
						arg1.field712 = "@red@Offline";
					} else if (this.field563[var4] < 200) {
						if (this.field563[var4] == field219) {
							arg1.field712 = "@gre@World" + (this.field563[var4] - 9);
						} else {
							arg1.field712 = "@yel@World" + (this.field563[var4] - 9);
						}
					} else if (this.field563[var4] == field219) {
						arg1.field712 = "@gre@Classic" + (this.field563[var4] - 219);
					} else {
						arg1.field712 = "@yel@Classic" + (this.field563[var4] - 219);
					}
					arg1.field771 = 1;
				}
			} else if (var4 == 203) {
				int var7 = this.field155;
				if (this.field156 != 2) {
					var7 = 0;
				}
				arg1.field767 = var7 * 15 + 20;
				if (arg1.field767 <= arg1.field720) {
					arg1.field767 = arg1.field720 + 1;
				}
			} else if (var4 >= 401 && var4 <= 500) {
				var4 -= 401;
				if (var4 == 0 && this.field156 == 0) {
					arg1.field712 = "Loading ignore list";
					arg1.field771 = 0;
				} else if (var4 == 1 && this.field156 == 0) {
					arg1.field712 = "Please wait...";
					arg1.field771 = 0;
				} else {
					int var8 = this.field151;
					if (this.field156 == 0) {
						var8 = 0;
					}
					if (var4 >= var8) {
						arg1.field712 = "";
						arg1.field771 = 0;
					} else {
						arg1.field712 = JString.method348(JString.method345(this.field369[var4], 0), (byte) 7);
						arg1.field771 = 1;
					}
				}
			} else if (var4 == 503) {
				arg1.field767 = this.field151 * 15 + 20;
				if (arg1.field767 <= arg1.field720) {
					arg1.field767 = arg1.field720 + 1;
				}
			} else if (var4 == 327) {
				arg1.field734 = 150;
				arg1.field735 = (int) (Math.sin((double) field621 / 40.0D) * 256.0D) & 0x7FF;
				if (this.field573) {
					for (int var9 = 0; var9 < 7; var9++) {
						int var16 = this.field622[var9];
						if (var16 >= 0 && !IdkType.field1699[var16].method577(256)) {
							return;
						}
					}
					this.field573 = false;
					Model[] var10 = new Model[7];
					int var11 = 0;
					for (int var12 = 0; var12 < 7; var12++) {
						int var15 = this.field622[var12];
						if (var15 >= 0) {
							var10[var11++] = IdkType.field1699[var15].method578((byte) 2);
						}
					}
					Model var13 = new Model(var11, var10, (byte) -89);
					for (int var14 = 0; var14 < 5; var14++) {
						if (this.field395[var14] != 0) {
							var13.method373(field304[var14][0], field304[var14][this.field395[var14]]);
							if (var14 == 1) {
								var13.method373(field564[0], field564[this.field395[var14]]);
							}
						}
					}
					var13.method366(7);
					var13.method367(SeqType.field775[field463.field1181].field777[0], (byte) 6);
					var13.method376(64, 850, -30, -50, -30, true);
					arg1.field765 = 5;
					arg1.field766 = 0;
					Component.method210(5, var13, 0, 6);
				}
			} else if (var4 == 324) {
				if (this.field398 == null) {
					this.field398 = arg1.field694;
					this.field399 = arg1.field727;
				}
				if (this.field440) {
					arg1.field694 = this.field399;
				} else {
					arg1.field694 = this.field398;
				}
			} else if (var4 == 325) {
				if (this.field398 == null) {
					this.field398 = arg1.field694;
					this.field399 = arg1.field727;
				}
				if (this.field440) {
					arg1.field694 = this.field398;
				} else {
					arg1.field694 = this.field399;
				}
			} else if (var4 == 600) {
				arg1.field712 = this.field135;
				if (field621 % 20 < 10) {
					arg1.field712 = arg1.field712 + "|";
				} else {
					arg1.field712 = arg1.field712 + " ";
				}
			} else {
				if (var4 == 620) {
					if (this.field163 < 1) {
						arg1.field712 = "";
					} else if (this.field394) {
						arg1.field722 = 16711680;
						arg1.field712 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.field722 = 16777215;
						arg1.field712 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var4 == 660) {
					int var17 = this.field466 - this.field511;
					String var18;
					if (var17 <= 0) {
						var18 = "earlier today";
					} else if (var17 == 1) {
						var18 = "yesterday";
					} else {
						var18 = var17 + " days ago";
					}
					arg1.field712 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
				}
				if (var4 == 661) {
					if (this.field330 == 0) {
						arg1.field712 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
					} else if (this.field330 <= this.field466) {
						arg1.field712 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method127(this.field330, (byte) 83);
					} else {
						int var19 = this.field466 + 14 - this.field330;
						String var20;
						if (var19 <= 0) {
							var20 = "Earlier today";
						} else if (var19 == 1) {
							var20 = "Yesterday";
						} else {
							var20 = var19 + " days ago";
						}
						arg1.field712 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method127(this.field330, (byte) 83) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
					}
				}
				if (var4 == 662) {
					String var21;
					if (this.field569 == 0) {
						var21 = "@yel@0 unread messages";
					} else if (this.field569 == 1) {
						var21 = "@gre@1 unread message";
					} else {
						var21 = "@gre@" + this.field569 + " unread messages";
					}
					arg1.field712 = "You have " + var21 + "\\nin your message centre.";
				}
				if (var4 == 663) {
					if (this.field379 > 0 && this.field379 <= this.field466 + 10) {
						arg1.field712 = "Last password change:\\n@gre@" + this.method127(this.field379, (byte) 83);
					} else {
						arg1.field712 = "Last password change:\\n@gre@Never changed";
					}
				}
				if (var4 == 665) {
					if (this.field288 > 2 && !field221) {
						arg1.field712 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
					} else if (this.field288 > 2) {
						arg1.field712 = "\\n\\nYou have @gre@" + this.field288 + "@yel@ days of\\nmember credit remaining.";
					} else if (this.field288 > 0) {
						arg1.field712 = "You have @gre@" + this.field288 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
					} else {
						arg1.field712 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
					}
				}
				if (var4 == 667) {
					if (this.field288 > 2 && !field221) {
						arg1.field712 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
					} else if (this.field288 > 0) {
						arg1.field712 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
					} else {
						arg1.field712 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
					}
				}
				if (var4 == 668) {
					if (this.field330 > this.field466) {
						arg1.field712 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
					} else {
						arg1.field712 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
					}
				}
			}
		} else if (var4 == 1 && this.field156 == 0) {
			arg1.field712 = "Loading friend list";
			arg1.field771 = 0;
		} else if (var4 == 1 && this.field156 == 1) {
			arg1.field712 = "Connecting to friendserver";
			arg1.field771 = 0;
		} else if (var4 == 2 && this.field156 != 2) {
			arg1.field712 = "Please wait...";
			arg1.field771 = 0;
		} else {
			int var5 = this.field155;
			if (this.field156 != 2) {
				var5 = 0;
			}
			if (var4 > 700) {
				var4 -= 601;
			} else {
				var4--;
			}
			if (var4 >= var5) {
				arg1.field712 = "";
				arg1.field771 = 0;
			} else {
				arg1.field712 = this.field145[var4];
				arg1.field771 = 1;
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method127(int arg0, byte arg1) {
		if (arg1 != 83) {
			this.field166 = this.field484.g1();
		}
		if (arg0 > this.field466 + 10) {
			return "Unknown";
		}
		long var3 = ((long) arg0 + 11745L) * 86400000L;
		Calendar var5 = Calendar.getInstance();
		var5.setTime(new Date(var3));
		int var6 = var5.get(5);
		int var7 = var5.get(2);
		int var8 = var5.get(1);
		String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		return var6 + "-" + var9[var7] + "-" + var8;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method128(int arg0, int arg1) {
		this.field165 += arg0;
		int var3 = VarpType.field1507[arg1].field1515;
		if (var3 == 0) {
			return;
		}
		int var4 = this.field335[arg1];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.method553(0.9D, (byte) 6);
			}
			if (var4 == 2) {
				Pix3D.method553(0.8D, (byte) 6);
			}
			if (var4 == 3) {
				Pix3D.method553(0.7D, (byte) 6);
			}
			if (var4 == 4) {
				Pix3D.method553(0.6D, (byte) 6);
			}
			ObjType.field828.method460();
			this.field342 = true;
		}
		if (var3 == 3) {
			boolean var5 = this.field562;
			if (var4 == 0) {
				this.method122(this.field562, (byte) 8, 0);
				this.field562 = true;
			}
			if (var4 == 1) {
				this.method122(this.field562, (byte) 8, -400);
				this.field562 = true;
			}
			if (var4 == 2) {
				this.method122(this.field562, (byte) 8, -800);
				this.field562 = true;
			}
			if (var4 == 3) {
				this.method122(this.field562, (byte) 8, -1200);
				this.field562 = true;
			}
			if (var4 == 4) {
				this.field562 = false;
			}
			if (this.field562 != var5 && !field222) {
				if (this.field562) {
					this.field566 = this.field623;
					this.field567 = true;
					this.field587.method586(2, this.field566);
				} else {
					this.method70(false);
				}
				this.field424 = 0;
			}
		}
		if (var3 == 4) {
			if (var4 == 0) {
				this.field597 = true;
				this.method78(822, 0);
			}
			if (var4 == 1) {
				this.field597 = true;
				this.method78(822, -400);
			}
			if (var4 == 2) {
				this.field597 = true;
				this.method78(822, -800);
			}
			if (var4 == 3) {
				this.field597 = true;
				this.method78(822, -1200);
			}
			if (var4 == 4) {
				this.field597 = false;
			}
		}
		if (var3 == 5) {
			this.field596 = var4;
		}
		if (var3 == 6) {
			this.field294 = var4;
		}
		if (var3 == 8) {
			this.field519 = var4;
			this.field536 = true;
		}
		if (var3 == 9) {
			this.field251 = var4;
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method129(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 8 || arg3 > 8) {
			this.field260.p1(235);
		}
		int var5 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var5 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var5 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method130(int arg0) {
		this.field542 = 0;
		int var2 = (field463.field1157 >> 7) + this.field336;
		int var3 = (field463.field1158 >> 7) + this.field337;
		if (arg0 >= 0) {
			return;
		}
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			this.field542 = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			this.field542 = 1;
		}
		if (this.field542 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			this.field542 = 0;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method131(int arg0) {
		int var2 = this.field357.method246((byte) 35, "Choose Option");
		for (int var3 = 0; var3 < this.field479; var3++) {
			int var11 = this.field357.method246((byte) 35, this.field480[var3]);
			if (var11 > var2) {
				var2 = var11;
			}
		}
		var2 += 8;
		if (arg0 <= 0) {
			field486 = !field486;
		}
		int var4 = this.field479 * 15 + 21;
		if (super.field966 > 4 && super.field967 > 4 && super.field966 < 516 && super.field967 < 338) {
			int var5 = super.field966 - 4 - var2 / 2;
			if (var2 + var5 > 512) {
				var5 = 512 - var2;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			int var6 = super.field967 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			this.field361 = true;
			this.field600 = 0;
			this.field601 = var5;
			this.field602 = var6;
			this.field603 = var2;
			this.field604 = this.field479 * 15 + 22;
		}
		if (super.field966 > 553 && super.field967 > 205 && super.field966 < 743 && super.field967 < 466) {
			int var7 = super.field966 - 553 - var2 / 2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var2 + var7 > 190) {
				var7 = 190 - var2;
			}
			int var8 = super.field967 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}
			this.field361 = true;
			this.field600 = 1;
			this.field601 = var7;
			this.field602 = var8;
			this.field603 = var2;
			this.field604 = this.field479 * 15 + 22;
		}
		if (super.field966 <= 17 || super.field967 <= 357 || super.field966 >= 496 || super.field967 >= 453) {
			return;
		}
		int var9 = super.field966 - 17 - var2 / 2;
		if (var9 < 0) {
			var9 = 0;
		} else if (var2 + var9 > 479) {
			var9 = 479 - var2;
		}
		int var10 = super.field967 - 357;
		if (var10 < 0) {
			var10 = 0;
		} else if (var4 + var10 > 96) {
			var10 = 96 - var4;
		}
		this.field361 = true;
		this.field600 = 2;
		this.field601 = var9;
		this.field602 = var10;
		this.field603 = var2;
		this.field604 = this.field479 * 15 + 22;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method132(int arg0) {
		if (arg0 != 30729) {
			this.field352 = this.field195.method329();
		}
		this.method97(0);
		if (this.field319 == 1) {
			this.field192[this.field318 / 100].method195(this.field317 - 8 - 4, this.field316 - 8 - 4, -488);
		}
		if (this.field319 == 2) {
			this.field192[this.field318 / 100 + 4].method195(this.field317 - 8 - 4, this.field316 - 8 - 4, -488);
		}
		if (this.field575 != -1) {
			this.method110(this.field247, this.field575, (byte) 5);
			this.method169(0, 0, Component.method204(this.field575), 0, 8);
		}
		if (this.field465 != -1) {
			this.method110(this.field247, this.field465, (byte) 5);
			this.method169(0, 0, Component.method204(this.field465), 0, 8);
		}
		this.method130(-7);
		if (!this.field361) {
			this.method114(-521);
			this.method54((byte) -79);
		} else if (this.field600 == 0) {
			this.method153(false);
		}
		if (this.field615 == 1) {
			this.field382.method195(296, 472, -488);
		}
		if (field164) {
			short var2 = 507;
			byte var3 = 20;
			int var4 = 16776960;
			if (super.field947 < 30 && field222) {
				var4 = 16711680;
			}
			if (super.field947 < 20 && !field222) {
				var4 = 16711680;
			}
			this.field356.method243(true, "Fps:" + super.field947, var4, var2, var3);
			int var13 = var3 + 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 16776960;
			if (var6 > 33554432 && field222) {
				int var8 = 16711680;
			}
			if (var6 > 67108864 && !field222) {
				int var9 = 16711680;
			}
			this.field356.method243(true, "Mem:" + var6 + "k", 16776960, var2, var13);
			var13 += 15;
		}
		if (this.field353 == 0) {
			return;
		}
		int var10 = this.field353 / 50;
		int var11 = var10 / 60;
		int var12 = var10 % 60;
		if (var12 < 10) {
			this.field356.method248(2245, 4, 16776960, 329, "System update in: " + var11 + ":0" + var12);
		} else {
			this.field356.method248(2245, 4, 16776960, 329, "System update in: " + var11 + ":" + var12);
		}
		field191++;
		if (field191 > 112) {
			field191 = 0;
			// ANTICHEAT_CYCLELOGIC3
			this.field260.p1isaac((byte) 4, 197);
			this.field260.p4(0);
			return;
		}
	}

	public final void run() {
		if (this.field610) {
			this.method36((byte) 4);
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method133(int arg0, int arg1, byte arg2, int arg3) {
		int var5 = arg1 >> 7;
		int var6 = arg0 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg3;
		if (arg3 < 3 && (this.field421[1][var5][var6] & 0x2) == 2) {
			var7 = arg3 + 1;
		}
		int var8 = arg1 & 0x7F;
		int var9 = arg0 & 0x7F;
		if (arg2 != 9) {
			this.field249 = !this.field249;
		}
		int var10 = (128 - var8) * this.field187[var7][var5][var6] + this.field187[var7][var5 + 1][var6] * var8 >> 7;
		int var11 = (128 - var8) * this.field187[var7][var5][var6 + 1] + this.field187[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return (128 - var9) * var10 + var9 * var11 >> 7;
	}

	public final AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method134(int arg0) {
		int var2 = 21 / arg0;
		if (this.field519 == 0) {
			return;
		}
		int var3 = 0;
		if (this.field353 != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.field594[var4] != null) {
				int var5 = this.field592[var4];
				String var6 = this.field593[var4];
				boolean var7 = false;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					boolean var8 = true;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					boolean var9 = true;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field183 == 0 || this.field183 == 1 && this.method175(13292, var6))) {
					int var10 = 329 - var3 * 13;
					if (super.field959 > 4 && super.field960 - 4 > var10 - 10 && super.field960 - 4 <= var10 + 3) {
						int var11 = this.field356.method246((byte) 35, "From:  " + var6 + this.field594[var4]) + 25;
						if (var11 > 450) {
							var11 = 450;
						}
						if (super.field959 < var11 + 4) {
							if (this.field163 >= 1) {
								this.field480[this.field479] = "Report abuse @whi@" + var6;
								this.field277[this.field479] = 2507;
								this.field479++;
							}
							this.field480[this.field479] = "Add ignore @whi@" + var6;
							this.field277[this.field479] = 2574;
							this.field479++;
							this.field480[this.field479] = "Add friend @whi@" + var6;
							this.field277[this.field479] = 2762;
							this.field479++;
						}
					}
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if ((var5 == 5 || var5 == 6) && this.field183 < 2) {
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method135(byte arg0, int arg1) {
		if (arg0 != 36) {
			this.field260.p1(6);
		}
		Component var3 = Component.method204(arg1);
		for (int var4 = 0; var4 < var3.field740.length && var3.field740[var4] != -1; var4++) {
			Component var5 = Component.method204(var3.field740[var4]);
			if (var5.field718 == 1) {
				this.method135((byte) 36, var5.field697);
			}
			var5.field717 = 0;
			var5.field709 = 0;
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method136(int arg0, int arg1, int arg2) {
		int var4 = 0;
		int var5 = 44 / arg0;
		for (int var6 = 0; var6 < 100; var6++) {
			if (this.field594[var6] != null) {
				int var7 = this.field592[var6];
				int var8 = 70 - var4 * 14 + this.field147 + 4;
				if (var8 < -20) {
					break;
				}
				String var9 = this.field593[var6];
				boolean var10 = false;
				if (var9 != null && var9.startsWith("@cr1@")) {
					var9 = var9.substring(5);
					boolean var11 = true;
				}
				if (var9 != null && var9.startsWith("@cr2@")) {
					var9 = var9.substring(5);
					boolean var12 = true;
				}
				if (var7 == 0) {
					var4++;
				}
				if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field302 == 0 || this.field302 == 1 && this.method175(13292, var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8 && !var9.equals(field463.field1673)) {
						if (this.field163 >= 1) {
							this.field480[this.field479] = "Report abuse @whi@" + var9;
							this.field277[this.field479] = 507;
							this.field479++;
						}
						this.field480[this.field479] = "Add ignore @whi@" + var9;
						this.field277[this.field479] = 574;
						this.field479++;
						this.field480[this.field479] = "Add friend @whi@" + var9;
						this.field277[this.field479] = 762;
						this.field479++;
					}
					var4++;
				}
				if ((var7 == 3 || var7 == 7) && this.field519 == 0 && (var7 == 7 || this.field183 == 0 || this.field183 == 1 && this.method175(13292, var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						if (this.field163 >= 1) {
							this.field480[this.field479] = "Report abuse @whi@" + var9;
							this.field277[this.field479] = 507;
							this.field479++;
						}
						this.field480[this.field479] = "Add ignore @whi@" + var9;
						this.field277[this.field479] = 574;
						this.field479++;
						this.field480[this.field479] = "Add friend @whi@" + var9;
						this.field277[this.field479] = 762;
						this.field479++;
					}
					var4++;
				}
				if (var7 == 4 && (this.field523 == 0 || this.field523 == 1 && this.method175(13292, var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						this.field480[this.field479] = "Accept trade @whi@" + var9;
						this.field277[this.field479] = 544;
						this.field479++;
					}
					var4++;
				}
				if ((var7 == 5 || var7 == 6) && this.field519 == 0 && this.field183 < 2) {
					var4++;
				}
				if (var7 == 8 && (this.field523 == 0 || this.field523 == 1 && this.method175(13292, var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						this.field480[this.field479] = "Accept challenge @whi@" + var9;
						this.field277[this.field479] = 695;
						this.field479++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILMFMVIYHT;)V")
	public final void method137(int arg0, int arg1, Packet arg2) {
		int var4 = arg2.gBit(402, 8);
		if (var4 < this.field267) {
			for (int var5 = var4; var5 < this.field267; var5++) {
				this.field591[this.field590++] = this.field268[var5];
			}
		}
		if (var4 > this.field267) {
			signlink.reporterror(this.field388 + " Too many players");
			throw new RuntimeException("eek");
		}
		this.field267 = 0;
		if (arg1 >= 0) {
			this.field166 = -1;
		}
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.field268[var6];
			ClientPlayer var8 = this.field266[var7];
			int var9 = arg2.gBit(402, 1);
			if (var9 == 0) {
				this.field268[this.field267++] = var7;
				var8.field1132 = field621;
			} else {
				int var10 = arg2.gBit(402, 2);
				if (var10 == 0) {
					this.field268[this.field267++] = var7;
					var8.field1132 = field621;
					this.field270[this.field269++] = var7;
				} else if (var10 == 1) {
					this.field268[this.field267++] = var7;
					var8.field1132 = field621;
					int var11 = arg2.gBit(402, 3);
					var8.method352(false, var11, -808);
					int var12 = arg2.gBit(402, 1);
					if (var12 == 1) {
						this.field270[this.field269++] = var7;
					}
				} else if (var10 == 2) {
					this.field268[this.field267++] = var7;
					var8.field1132 = field621;
					int var13 = arg2.gBit(402, 3);
					var8.method352(true, var13, -808);
					int var14 = arg2.gBit(402, 3);
					var8.method352(true, var14, -808);
					int var15 = arg2.gBit(402, 1);
					if (var15 == 1) {
						this.field270[this.field269++] = var7;
					}
				} else if (var10 == 3) {
					this.field591[this.field590++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method138(int arg0, int arg1) {
		int[] var3 = this.field418.field685;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var23 = (103 - var6) * 512 * 4 + 24628;
			for (int var24 = 1; var24 < 103; var24++) {
				if ((this.field421[arg0][var24][var6] & 0x18) == 0) {
					this.field460.method309(var3, var23, 512, arg0, var24, var6);
				}
				if (arg0 < 3 && (this.field421[arg0 + 1][var24][var6] & 0x8) != 0) {
					this.field460.method309(var3, var23, 512, arg0 + 1, var24, var6);
				}
				var23 += 4;
			}
		}
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		if (arg1 != 0) {
			this.field166 = this.field484.g1();
		}
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.field418.method190(false);
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var22 = 1; var22 < 103; var22++) {
				if ((this.field421[arg0][var22][var9] & 0x18) == 0) {
					this.method177(var9, arg0, var22, var8, 563, var7);
				}
				if (arg0 < 3 && (this.field421[arg0 + 1][var22][var9] & 0x8) != 0) {
					this.method177(var9, arg0 + 1, var22, var8, 563, var7);
				}
			}
		}
		if (this.field454 != null) {
			this.field454.method240(false);
			Pix3D.field1600 = this.field298;
		}
		field378++;
		if (field378 > 177) {
			field378 = 0;
			// ANTICHEAT_CYCLELOGIC4
			this.field260.p1isaac((byte) 4, 173);
			this.field260.p3(2657152);
		}
		this.field372 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = this.field460.method303(this.field387, var10, var11);
				if (var12 != 0) {
					int var13 = var12 >> 14 & 0x7FFF;
					int var14 = LocType.method561(var13).field1660;
					if (var14 >= 0) {
						int var15 = var10;
						int var16 = var11;
						if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
							byte var17 = 104;
							byte var18 = 104;
							int[][] var19 = this.field556[this.field387].field1585;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 0x1280108) == 0) {
									var15--;
								}
								if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 0x1280180) == 0) {
									var15++;
								}
								if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 0x1280102) == 0) {
									var16--;
								}
								if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 0x1280120) == 0) {
									var16++;
								}
							}
						}
						this.field574[this.field372] = this.field327[var14];
						this.field373[this.field372] = var15;
						this.field374[this.field372] = var16;
						this.field372++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method139(int arg0, int arg1, byte[] arg2) {
		if (arg0 < 3 || arg0 > 3) {
			throw new NullPointerException();
		}
		return arg2 == null ? true : signlink.wavesave(arg2, arg1);
	}

	@ObfuscatedName("client.j(B)I")
	public final int method140(byte arg0) {
		int var2 = 3;
		if (this.field252 == arg0) {
			boolean var3 = false;
		} else {
			this.method86();
		}
		if (this.field515 < 310) {
			field274++;
			if (field274 > 1457) {
				field274 = 0;
				// ANTICHEAT_CYCLELOGIC1
				this.field260.p1isaac((byte) 4, 244);
				this.field260.p1(0);
				int var4 = this.field260.pos;
				this.field260.p1(219);
				this.field260.p2(37745);
				this.field260.p1(61);
				this.field260.p2(43756);
				this.field260.p2((int) (Math.random() * 65536.0D));
				this.field260.p1((int) (Math.random() * 256.0D));
				this.field260.p2(51171);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field260.p2(15808);
				}
				this.field260.p1(97);
				this.field260.p1((int) (Math.random() * 256.0D));
				this.field260.psize1(this.field260.pos - var4, 0);
			}
			int var5 = this.field512 >> 7;
			int var6 = this.field514 >> 7;
			int var7 = field463.field1157 >> 7;
			int var8 = field463.field1158 >> 7;
			if ((this.field421[this.field387][var5][var6] & 0x4) != 0) {
				var2 = this.field387;
			}
			int var9;
			if (var7 > var5) {
				var9 = var7 - var5;
			} else {
				var9 = var5 - var7;
			}
			int var10;
			if (var8 > var6) {
				var10 = var8 - var6;
			} else {
				var10 = var6 - var8;
			}
			if (var9 > var10) {
				int var11 = var10 * 65536 / var9;
				int var12 = 32768;
				while (var5 != var7) {
					if (var5 < var7) {
						var5++;
					} else if (var5 > var7) {
						var5--;
					}
					if ((this.field421[this.field387][var5][var6] & 0x4) != 0) {
						var2 = this.field387;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var6 < var8) {
							var6++;
						} else if (var6 > var8) {
							var6--;
						}
						if ((this.field421[this.field387][var5][var6] & 0x4) != 0) {
							var2 = this.field387;
						}
					}
				}
			} else {
				int var13 = var9 * 65536 / var10;
				int var14 = 32768;
				while (var6 != var8) {
					if (var6 < var8) {
						var6++;
					} else if (var6 > var8) {
						var6--;
					}
					if ((this.field421[this.field387][var5][var6] & 0x4) != 0) {
						var2 = this.field387;
					}
					var14 += var13;
					if (var14 >= 65536) {
						var14 -= 65536;
						if (var5 < var7) {
							var5++;
						} else if (var5 > var7) {
							var5--;
						}
						if ((this.field421[this.field387][var5][var6] & 0x4) != 0) {
							var2 = this.field387;
						}
					}
				}
			}
		}
		if ((this.field421[this.field387][field463.field1157 >> 7][field463.field1158 >> 7] & 0x4) != 0) {
			var2 = this.field387;
		}
		return var2;
	}

	@ObfuscatedName("client.E(I)I")
	public final int method141(int arg0) {
		int var2 = this.method133(this.field514, this.field512, (byte) 9, this.field387);
		while (arg0 >= 0) {
			this.field166 = this.field484.g1();
		}
		return var2 - this.field513 >= 800 || (this.field421[this.field387][this.field512 >> 7][this.field514 >> 7] & 0x4) == 0 ? 3 : this.field387;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method142(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method142(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method143(int arg0, boolean arg1) {
		if (field463.field1157 >> 7 == this.field416 && field463.field1158 >> 7 == this.field417) {
			this.field416 = 0;
		}
		int var3 = this.field267;
		if (arg1) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			ClientPlayer var5;
			int var6;
			if (arg1) {
				var5 = field463;
				var6 = this.field265 << 14;
			} else {
				var5 = this.field266[this.field268[var4]];
				var6 = this.field268[var4] << 14;
			}
			if (var5 != null && var5.method351(0)) {
				var5.field1685 = false;
				if ((field222 && this.field267 > 50 || this.field267 > 200) && !arg1 && var5.field1181 == var5.field1135) {
					var5.field1685 = true;
				}
				int var7 = var5.field1157 >> 7;
				int var8 = var5.field1158 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field1668 == null || field621 < var5.field1686 || field621 >= var5.field1687) {
						if ((var5.field1157 & 0x7F) == 64 && (var5.field1158 & 0x7F) == 64) {
							if (this.field182[var7][var8] == this.field434) {
								continue;
							}
							this.field182[var7][var8] = this.field434;
						}
						var5.field1672 = this.method133(var5.field1158, var5.field1157, (byte) 9, this.field387);
						this.field460.method285(var6, var5, var5.field1157, var5.field1672, var5.field1139, 0, this.field387, 60, var5.field1158, var5.field1159);
					} else {
						var5.field1685 = false;
						var5.field1672 = this.method133(var5.field1158, var5.field1157, (byte) 9, this.field387);
						this.field460.method286(var5.field1672, var5.field1691, 60, 7, var5, var5.field1690, var5.field1158, var5.field1693, var5.field1157, var5.field1159, var5.field1692, this.field387, var6);
					}
				}
			}
		}
		if (arg0 == 0) {
			;
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method144(int arg0, int arg1) {
		if (arg0 < 0) {
			return;
		}
		int var3 = this.field275[arg0];
		int var4 = this.field276[arg0];
		int var5 = this.field277[arg0];
		int var6 = this.field278[arg0];
		if (arg1 < this.field217 || arg1 > this.field217) {
			this.field166 = this.field484.g1();
		}
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (this.field540 != 0 && var5 != 1016) {
			this.field540 = 0;
			this.field536 = true;
		}
		if (var5 == 200) {
			ClientPlayer var7 = this.field266[var6];
			if (var7 != null) {
				this.method55(false, false, var7.field1134[0], field463.field1134[0], 1, 1, 2, 0, var7.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYER1
				this.field260.p1isaac((byte) 4, 245);
				this.field260.p2_alt3(3, var6);
			}
		}
		if (var5 == 227) {
			field461++;
			if (field461 >= 62) {
				// ANTICHEAT_OPLOGIC2
				this.field260.p1isaac((byte) 4, 165);
				this.field260.p1(206);
				field461 = 0;
			}
			// OPHELD4
			this.field260.p1isaac((byte) 4, 228);
			this.field260.p2_alt1(0, var3);
			this.field260.p2_alt2(var6, 0);
			this.field260.p2(var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 876) {
			ClientPlayer var8 = this.field266[var6];
			if (var8 != null) {
				this.method55(false, false, var8.field1134[0], field463.field1134[0], 1, 1, 2, 0, var8.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYER5
				this.field260.p1isaac((byte) 4, 45);
				this.field260.p2_alt2(var6, 0);
			}
		}
		if (var5 == 921) {
			ClientNpc var9 = this.field428[var6];
			if (var9 != null) {
				this.method55(false, false, var9.field1134[0], field463.field1134[0], 1, 1, 2, 0, var9.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPC2
				this.field260.p1isaac((byte) 4, 67);
				this.field260.p2_alt2(var6, 0);
			}
		}
		if (var5 == 961) {
			field435 += var6;
			if (field435 >= 115) {
				// ANTICHEAT_OPLOGIC5
				this.field260.p1isaac((byte) 4, 126);
				this.field260.p1(125);
				field435 = 0;
			}
			// OPHELD1
			this.field260.p1isaac((byte) 4, 203);
			this.field260.p2_alt2(var4, 0);
			this.field260.p2_alt1(0, var3);
			this.field260.p2_alt1(0, var6);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 467 && this.method102(var4, 0, var3, var6)) {
			// OPLOCU
			this.field260.p1isaac((byte) 4, 152);
			this.field260.p2_alt1(0, var6 >> 14 & 0x7FFF);
			this.field260.p2_alt1(0, this.field444);
			this.field260.p2_alt1(0, this.field445);
			this.field260.p2_alt1(0, this.field337 + var4);
			this.field260.p2(this.field443);
			this.field260.p2_alt3(3, this.field336 + var3);
		}
		if (var5 == 9) {
			// INV_BUTTON1
			this.field260.p1isaac((byte) 4, 3);
			this.field260.p2_alt2(var6, 0);
			this.field260.p2(var4);
			this.field260.p2(var3);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 553) {
			ClientNpc var10 = this.field428[var6];
			if (var10 != null) {
				this.method55(false, false, var10.field1134[0], field463.field1134[0], 1, 1, 2, 0, var10.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPC4
				this.field260.p1isaac((byte) 4, 42);
				this.field260.p2_alt1(0, var6);
			}
		}
		if (var5 == 677) {
			ClientPlayer var11 = this.field266[var6];
			if (var11 != null) {
				this.method55(false, false, var11.field1134[0], field463.field1134[0], 1, 1, 2, 0, var11.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYER4
				this.field260.p1isaac((byte) 4, 116);
				this.field260.p2_alt1(0, var6);
			}
		}
		if (var5 == 762 || var5 == 574 || var5 == 775 || var5 == 859) {
			String var12 = this.field480[arg0];
			int var13 = var12.indexOf("@whi@");
			if (var13 != -1) {
				long var14 = JString.method344(var12.substring(var13 + 5).trim());
				if (var5 == 762) {
					this.method125(var14, -45229);
				}
				if (var5 == 574) {
					this.method112(this.field450, var14);
				}
				if (var5 == 775) {
					this.method73(var14, 0);
				}
				if (var5 == 859) {
					this.method120(325, var14);
				}
			}
		}
		if (var5 == 930) {
			boolean var16 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var16) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			// OPOBJ4
			this.field260.p1isaac((byte) 4, 54);
			this.field260.p2_alt2(var6, 0);
			this.field260.p2_alt1(0, this.field337 + var4);
			this.field260.p2(this.field336 + var3);
		}
		if (var5 == 399) {
			// OPHELD2
			this.field260.p1isaac((byte) 4, 24);
			this.field260.p2_alt1(0, var4);
			this.field260.p2_alt1(0, var6);
			this.field260.p2_alt2(var3, 0);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 347) {
			ClientNpc var18 = this.field428[var6];
			if (var18 != null) {
				this.method55(false, false, var18.field1134[0], field463.field1134[0], 1, 1, 2, 0, var18.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPCU
				this.field260.p1isaac((byte) 4, 57);
				this.field260.p2(var6);
				this.field260.p2_alt1(0, this.field445);
				this.field260.p2_alt3(3, this.field444);
				this.field260.p2(this.field443);
			}
		}
		if (var5 == 890) {
			// IF_BUTTON
			this.field260.p1isaac((byte) 4, 79);
			this.field260.p2(var4);
			Component var19 = Component.method204(var4);
			if (var19.field716 != null && var19.field716[0][0] == 5) {
				int var20 = var19.field716[0][1];
				this.field335[var20] = 1 - this.field335[var20];
				this.method128(0, var20);
				this.field477 = true;
			}
		}
		if (var5 == 493) {
			ClientPlayer var21 = this.field266[var6];
			if (var21 != null) {
				this.method55(false, false, var21.field1134[0], field463.field1134[0], 1, 1, 2, 0, var21.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYER2
				this.field260.p1isaac((byte) 4, 233);
				this.field260.p2_alt2(var6, 0);
			}
		}
		if (var5 == 14) {
			if (this.field361) {
				this.field460.method312(0, var3 - 4, var4 - 4);
			} else {
				this.field460.method312(0, super.field966 - 4, super.field967 - 4);
			}
		}
		if (var5 == 903) {
			// OPHELDU
			this.field260.p1isaac((byte) 4, 1);
			this.field260.p2(var6);
			this.field260.p2_alt1(0, this.field443);
			this.field260.p2_alt1(0, this.field445);
			this.field260.p2_alt3(3, this.field444);
			this.field260.p2_alt2(var3, 0);
			this.field260.p2_alt2(var4, 0);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 361) {
			// OPHELDT
			this.field260.p1isaac((byte) 4, 36);
			this.field260.p2(this.field468);
			this.field260.p2_alt2(var4, 0);
			this.field260.p2_alt2(var3, 0);
			this.field260.p2_alt2(var6, 0);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 118) {
			ClientNpc var22 = this.field428[var6];
			if (var22 != null) {
				this.method55(false, false, var22.field1134[0], field463.field1134[0], 1, 1, 2, 0, var22.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				field531 += var6;
				if (field531 >= 143) {
					// ANTICHEAT_OPLOGIC3
					this.field260.p1isaac((byte) 4, 157);
					this.field260.p4(0);
					field531 = 0;
				}
				// OPNPC3
				this.field260.p1isaac((byte) 4, 13);
				this.field260.p2_alt3(3, var6);
			}
		}
		if (var5 == 376 && this.method102(var4, 0, var3, var6)) {
			// OPLOCT
			this.field260.p1isaac((byte) 4, 210);
			this.field260.p2(this.field468);
			this.field260.p2_alt1(0, var6 >> 14 & 0x7FFF);
			this.field260.p2_alt2(this.field336 + var3, 0);
			this.field260.p2_alt1(0, this.field337 + var4);
		}
		if (var5 == 432) {
			ClientNpc var23 = this.field428[var6];
			if (var23 != null) {
				this.method55(false, false, var23.field1134[0], field463.field1134[0], 1, 1, 2, 0, var23.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPC5
				this.field260.p1isaac((byte) 4, 8);
				this.field260.p2_alt1(0, var6);
			}
		}
		if (var5 == 639) {
			this.method34(false);
		}
		if (var5 == 918) {
			ClientPlayer var24 = this.field266[var6];
			if (var24 != null) {
				this.method55(false, false, var24.field1134[0], field463.field1134[0], 1, 1, 2, 0, var24.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYERT
				this.field260.p1isaac((byte) 4, 31);
				this.field260.p2(var6);
				this.field260.p2_alt1(0, this.field468);
			}
		}
		if (var5 == 67) {
			ClientNpc var25 = this.field428[var6];
			if (var25 != null) {
				this.method55(false, false, var25.field1134[0], field463.field1134[0], 1, 1, 2, 0, var25.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPCT
				this.field260.p1isaac((byte) 4, 104);
				this.field260.p2_alt2(this.field468, 0);
				this.field260.p2_alt1(0, var6);
			}
		}
		if (var5 == 68) {
			boolean var26 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var26) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			// OPOBJ1
			this.field260.p1isaac((byte) 4, 77);
			this.field260.p2_alt2(this.field336 + var3, 0);
			this.field260.p2(this.field337 + var4);
			this.field260.p2_alt3(3, var6);
		}
		if (var5 == 684) {
			boolean var28 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var28) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			if ((var6 & 0x3) == 0) {
				field348++;
			}
			if (field348 >= 84) {
				// ANTICHEAT_OPLOGIC4
				this.field260.p1isaac((byte) 4, 222);
				this.field260.p3(11257922);
				field348 = 0;
			}
			// OPOBJ3
			this.field260.p1isaac((byte) 4, 71);
			this.field260.p2_alt3(3, var6);
			this.field260.p2_alt3(3, this.field336 + var3);
			this.field260.p2_alt2(this.field337 + var4, 0);
		}
		if (var5 == 544 || var5 == 695) {
			String var30 = this.field480[arg0];
			int var31 = var30.indexOf("@whi@");
			if (var31 != -1) {
				String var32 = var30.substring(var31 + 5).trim();
				String var33 = JString.method348(JString.method345(JString.method344(var32), 0), (byte) 7);
				boolean var34 = false;
				for (int var35 = 0; var35 < this.field267; var35++) {
					ClientPlayer var36 = this.field266[this.field268[var35]];
					if (var36 != null && var36.field1673 != null && var36.field1673.equalsIgnoreCase(var33)) {
						this.method55(false, false, var36.field1134[0], field463.field1134[0], 1, 1, 2, 0, var36.field1133[0], 0, 0, field463.field1133[0]);
						if (var5 == 544) {
							// OPPLAYER4
							this.field260.p1isaac((byte) 4, 116);
							this.field260.p2_alt1(0, this.field268[var35]);
						}
						if (var5 == 695) {
							// OPPLAYER1
							this.field260.p1isaac((byte) 4, 245);
							this.field260.p2_alt3(3, this.field268[var35]);
						}
						var34 = true;
						break;
					}
				}
				if (!var34) {
					this.method67("", (byte) -123, "Unable to find " + var33, 0);
				}
			}
		}
		if (var5 == 225) {
			// INV_BUTTON2
			this.field260.p1isaac((byte) 4, 177);
			this.field260.p2_alt2(var3, 0);
			this.field260.p2_alt1(0, var6);
			this.field260.p2_alt1(0, var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 70) {
			Component var37 = Component.method204(var4);
			this.field467 = 1;
			this.field468 = var4;
			this.field469 = var37.field704;
			this.field442 = 0;
			this.field477 = true;
			String var38 = var37.field763;
			if (var38.indexOf(" ") != -1) {
				var38 = var38.substring(0, var38.indexOf(" "));
			}
			String var39 = var37.field763;
			if (var39.indexOf(" ") != -1) {
				var39 = var39.substring(var39.indexOf(" ") + 1);
			}
			this.field470 = var38 + " " + var37.field693 + " " + var39;
			if (this.field469 == 16) {
				this.field477 = true;
				this.field581 = 3;
				this.field246 = true;
			}
			return;
		}
		if (var5 == 891) {
			// OPHELD5
			this.field260.p1isaac((byte) 4, 4);
			this.field260.p2_alt1(0, var3);
			this.field260.p2_alt3(3, var6);
			this.field260.p2_alt3(3, var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 894) {
			// INV_BUTTON5
			this.field260.p1isaac((byte) 4, 158);
			this.field260.p2_alt3(3, var3);
			this.field260.p2_alt3(3, var6);
			this.field260.p2_alt1(0, var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 1280) {
			this.method102(var4, 0, var3, var6);
			// OPLOC5
			this.field260.p1isaac((byte) 4, 55);
			this.field260.p2_alt1(0, var6 >> 14 & 0x7FFF);
			this.field260.p2_alt1(0, this.field337 + var4);
			this.field260.p2(this.field336 + var3);
		}
		if (var5 == 35) {
			this.method102(var4, 0, var3, var6);
			// OPLOC1
			this.field260.p1isaac((byte) 4, 181);
			this.field260.p2_alt2(this.field336 + var3, 0);
			this.field260.p2_alt1(0, this.field337 + var4);
			this.field260.p2_alt1(0, var6 >> 14 & 0x7FFF);
		}
		if (var5 == 888) {
			this.method102(var4, 0, var3, var6);
			// OPLOC3
			this.field260.p1isaac((byte) 4, 50);
			this.field260.p2_alt2(this.field337 + var4, 0);
			this.field260.p2_alt1(0, var6 >> 14 & 0x7FFF);
			this.field260.p2_alt3(3, this.field336 + var3);
		}
		if (var5 == 324) {
			// OPHELD3
			this.field260.p1isaac((byte) 4, 161);
			this.field260.p2_alt3(3, var3);
			this.field260.p2_alt3(3, var6);
			this.field260.p2_alt1(0, var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 1094) {
			ObjType var40 = ObjType.method221(var6);
			Component var41 = Component.method204(var4);
			String var42;
			if (var41 != null && var41.field706[var3] >= 100000) {
				var42 = var41.field706[var3] + " x " + var40.field811;
			} else if (var40.field810 == null) {
				var42 = "It's a " + var40.field811 + ".";
			} else {
				var42 = new String(var40.field810);
			}
			this.method67("", (byte) -123, var42, 0);
		}
		if (var5 == 352) {
			Component var43 = Component.method204(var4);
			boolean var44 = true;
			if (var43.field724 > 0) {
				var44 = this.method80(631, var43);
			}
			if (var44) {
				// IF_BUTTON
				this.field260.p1isaac((byte) 4, 79);
				this.field260.p2(var4);
			}
		}
		if (var5 == 1412) {
			int var45 = var6 >> 14 & 0x7FFF;
			LocType var46 = LocType.method561(var45);
			String var47;
			if (var46.field1637 == null) {
				var47 = "It's a " + var46.field1630 + ".";
			} else {
				var47 = new String(var46.field1637);
			}
			this.method67("", (byte) -123, var47, 0);
		}
		if (var5 == 575 && !this.field535) {
			// RESUME_PAUSEBUTTON
			this.field260.p1isaac((byte) 4, 226);
			this.field260.p2(var4);
			this.field535 = true;
		}
		if (var5 == 892) {
			this.method102(var4, 0, var3, var6);
			// OPLOC4
			this.field260.p1isaac((byte) 4, 136);
			this.field260.p2(this.field336 + var3);
			this.field260.p2_alt1(0, this.field337 + var4);
			this.field260.p2(var6 >> 14 & 0x7FFF);
		}
		if (var5 == 270) {
			boolean var48 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var48) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			// OPOBJ5
			this.field260.p1isaac((byte) 4, 230);
			this.field260.p2_alt1(0, var6);
			this.field260.p2_alt2(this.field336 + var3, 0);
			this.field260.p2(this.field337 + var4);
		}
		if (var5 == 596) {
			ClientPlayer var50 = this.field266[var6];
			if (var50 != null) {
				this.method55(false, false, var50.field1134[0], field463.field1134[0], 1, 1, 2, 0, var50.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYERU
				this.field260.p1isaac((byte) 4, 143);
				this.field260.p2_alt1(0, this.field445);
				this.field260.p2_alt3(3, this.field443);
				this.field260.p2(this.field444);
				this.field260.p2_alt2(var6, 0);
			}
		}
		if (var5 == 100) {
			boolean var51 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var51) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			// OPOBJU
			this.field260.p1isaac((byte) 4, 211);
			this.field260.p2_alt3(3, this.field443);
			this.field260.p2_alt2(this.field445, 0);
			this.field260.p2_alt3(3, this.field337 + var4);
			this.field260.p2_alt3(3, this.field336 + var3);
			this.field260.p2_alt1(0, this.field444);
			this.field260.p2_alt1(0, var6);
		}
		if (var5 == 1668) {
			ClientNpc var53 = this.field428[var6];
			if (var53 != null) {
				NpcType var54 = var53.field1370;
				if (var54.field1425 != null) {
					var54 = var54.method476(false);
				}
				if (var54 != null) {
					String var55;
					if (var54.field1463 == null) {
						var55 = "It's a " + var54.field1455 + ".";
					} else {
						var55 = new String(var54.field1463);
					}
					this.method67("", (byte) -123, var55, 0);
				}
			}
		}
		if (var5 == 26) {
			boolean var56 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var56) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			field396++;
			if (field396 >= 120) {
				// ANTICHEAT_OPLOGIC1
				this.field260.p1isaac((byte) 4, 95);
				this.field260.p4(0);
				field396 = 0;
			}
			// OPOBJ2
			this.field260.p1isaac((byte) 4, 100);
			this.field260.p2(this.field336 + var3);
			this.field260.p2_alt2(this.field337 + var4, 0);
			this.field260.p2_alt3(3, var6);
		}
		if (var5 == 444) {
			// INV_BUTTON3
			this.field260.p1isaac((byte) 4, 91);
			this.field260.p2_alt1(0, var6);
			this.field260.p2_alt3(3, var3);
			this.field260.p2(var4);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 507) {
			String var58 = this.field480[arg0];
			int var59 = var58.indexOf("@whi@");
			if (var59 != -1) {
				if (this.field465 == -1) {
					this.method34(false);
					this.field135 = var58.substring(var59 + 5).trim();
					this.field394 = false;
					this.field527 = this.field465 = Component.field728;
				} else {
					this.method67("", (byte) -123, "Please close the interface you have open before using 'report abuse'", 0);
				}
			}
		}
		if (var5 == 389) {
			this.method102(var4, 0, var3, var6);
			// OPLOC2
			this.field260.p1isaac((byte) 4, 241);
			this.field260.p2(var6 >> 14 & 0x7FFF);
			this.field260.p2(this.field336 + var3);
			this.field260.p2_alt2(this.field337 + var4, 0);
		}
		if (var5 == 564) {
			// INV_BUTTON4
			this.field260.p1isaac((byte) 4, 231);
			this.field260.p2_alt3(3, var4);
			this.field260.p2_alt1(0, var3);
			this.field260.p2(var6);
			this.field625 = 0;
			this.field626 = var4;
			this.field627 = var3;
			this.field628 = 2;
			if (Component.method204(var4).field730 == this.field465) {
				this.field628 = 1;
			}
			if (Component.method204(var4).field730 == this.field284) {
				this.field628 = 3;
			}
		}
		if (var5 == 984) {
			String var60 = this.field480[arg0];
			int var61 = var60.indexOf("@whi@");
			if (var61 != -1) {
				long var62 = JString.method344(var60.substring(var61 + 5).trim());
				int var64 = -1;
				for (int var65 = 0; var65 < this.field155; var65++) {
					if (this.field426[var65] == var62) {
						var64 = var65;
						break;
					}
				}
				if (var64 != -1 && this.field563[var64] > 0) {
					this.field536 = true;
					this.field540 = 0;
					this.field162 = true;
					this.field322 = "";
					this.field517 = 3;
					this.field437 = this.field426[var64];
					this.field233 = "Enter message to send to " + this.field145[var64];
				}
			}
		}
		if (var5 == 518) {
			// IF_BUTTON
			this.field260.p1isaac((byte) 4, 79);
			this.field260.p2(var4);
			Component var66 = Component.method204(var4);
			if (var66.field716 != null && var66.field716[0][0] == 5) {
				int var67 = var66.field716[0][1];
				if (this.field335[var67] != var66.field738[0]) {
					this.field335[var67] = var66.field738[0];
					this.method128(0, var67);
					this.field477 = true;
				}
			}
		}
		if (var5 == 318) {
			ClientNpc var68 = this.field428[var6];
			if (var68 != null) {
				this.method55(false, false, var68.field1134[0], field463.field1134[0], 1, 1, 2, 0, var68.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPNPC1
				this.field260.p1isaac((byte) 4, 112);
				this.field260.p2_alt1(0, var6);
			}
		}
		if (var5 == 199) {
			boolean var69 = this.method55(false, false, var4, field463.field1134[0], 0, 0, 2, 0, var3, 0, 0, field463.field1133[0]);
			if (!var69) {
				this.method55(false, false, var4, field463.field1134[0], 1, 1, 2, 0, var3, 0, 0, field463.field1133[0]);
			}
			this.field316 = super.field966;
			this.field317 = super.field967;
			this.field319 = 2;
			this.field318 = 0;
			// OPOBJT
			this.field260.p1isaac((byte) 4, 83);
			this.field260.p2_alt1(0, var6);
			this.field260.p2(this.field337 + var4);
			this.field260.p2_alt1(0, this.field468);
			this.field260.p2_alt3(3, this.field336 + var3);
		}
		if (var5 == 55) {
			this.method64(field486, this.field487);
			this.field487 = -1;
			this.field536 = true;
		}
		if (var5 == 52) {
			this.field442 = 1;
			this.field443 = var3;
			this.field444 = var4;
			this.field445 = var6;
			this.field446 = String.valueOf(ObjType.method221(var6).field811);
			this.field467 = 0;
			this.field477 = true;
			return;
		}
		if (var5 == 1564) {
			ObjType var71 = ObjType.method221(var6);
			String var72;
			if (var71.field810 == null) {
				var72 = "It's a " + var71.field811 + ".";
			} else {
				var72 = new String(var71.field810);
			}
			this.method67("", (byte) -123, var72, 0);
		}
		if (var5 == 408) {
			ClientPlayer var73 = this.field266[var6];
			if (var73 != null) {
				this.method55(false, false, var73.field1134[0], field463.field1134[0], 1, 1, 2, 0, var73.field1133[0], 0, 0, field463.field1133[0]);
				this.field316 = super.field966;
				this.field317 = super.field967;
				this.field319 = 2;
				this.field318 = 0;
				// OPPLAYER3
				this.field260.p1isaac((byte) 4, 194);
				this.field260.p2_alt1(0, var6);
			}
		}
		this.field442 = 0;
		this.field467 = 0;
		this.field477 = true;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method145(boolean arg0) {
		this.field235 = 0;
		for (int var2 = -1; var2 < this.field429 + this.field267; var2++) {
			ClientEntity var19;
			if (var2 == -1) {
				var19 = field463;
			} else if (var2 < this.field267) {
				var19 = this.field266[this.field268[var2]];
			} else {
				var19 = this.field428[this.field430[var2 - this.field267]];
			}
			if (var19 != null && var19.method351(0)) {
				if (var19 instanceof ClientNpc) {
					NpcType var20 = ((ClientNpc) var19).field1370;
					if (var20.field1425 != null) {
						var20 = var20.method476(false);
					}
					if (var20 == null) {
						continue;
					}
				}
				if (var2 >= this.field267) {
					NpcType var23 = ((ClientNpc) var19).field1370;
					if (var23.field1441 >= 0 && var23.field1441 < this.field375.length) {
						this.method161(var19, false, var19.field1141 + 15);
						if (this.field228 > -1) {
							this.field375[var23.field1441].method195(this.field229 - 30, this.field228 - 12, -488);
						}
					}
					if (this.field493 == 1 && this.field430[var2 - this.field267] == this.field522 && field621 % 20 < 10) {
						this.method161(var19, false, var19.field1141 + 15);
						if (this.field228 > -1) {
							this.field250[0].method195(this.field229 - 28, this.field228 - 12, -488);
						}
					}
				} else {
					int var21 = 30;
					ClientPlayer var22 = (ClientPlayer) var19;
					if (var22.field1678 != -1 || var22.field1670 != -1) {
						this.method161(var19, false, var19.field1141 + 15);
						if (this.field228 > -1) {
							if (var22.field1678 != -1) {
								this.field584[var22.field1678].method195(this.field229 - var21, this.field228 - 12, -488);
								var21 += 25;
							}
							if (var22.field1670 != -1) {
								this.field375[var22.field1670].method195(this.field229 - var21, this.field228 - 12, -488);
								var21 += 25;
							}
						}
					}
					if (var2 >= 0 && this.field493 == 10 && this.field268[var2] == this.field447) {
						this.method161(var19, false, var19.field1141 + 15);
						if (this.field228 > -1) {
							this.field250[1].method195(this.field229 - var21, this.field228 - 12, -488);
						}
					}
				}
				if (var19.field1127 != null && (var2 >= this.field267 || this.field302 == 0 || this.field302 == 3 || this.field302 == 1 && this.method175(13292, ((ClientPlayer) var19).field1673))) {
					this.method161(var19, false, var19.field1141);
					if (this.field228 > -1 && this.field235 < this.field236) {
						this.field240[this.field235] = this.field357.method247(var19.field1127, (byte) -53) / 2;
						this.field239[this.field235] = this.field357.field894;
						this.field237[this.field235] = this.field228;
						this.field238[this.field235] = this.field229;
						this.field241[this.field235] = var19.field1130;
						this.field242[this.field235] = var19.field1140;
						this.field243[this.field235] = var19.field1129;
						this.field244[this.field235++] = var19.field1127;
						if (this.field294 == 0 && var19.field1140 >= 1 && var19.field1140 <= 3) {
							this.field239[this.field235] += 10;
							this.field238[this.field235] += 5;
						}
						if (this.field294 == 0 && var19.field1140 == 4) {
							this.field240[this.field235] = 60;
						}
						if (this.field294 == 0 && var19.field1140 == 5) {
							this.field239[this.field235] += 5;
						}
					}
				}
				if (var19.field1142 > field621) {
					this.method161(var19, false, var19.field1141 + 15);
					if (this.field228 > -1) {
						int var24 = var19.field1143 * 30 / var19.field1144;
						if (var24 > 30) {
							var24 = 30;
						}
						Pix2D.method337(5, this.field229 - 3, 65280, (byte) -24, var24, this.field228 - 15);
						Pix2D.method337(5, this.field229 - 3, 16711680, (byte) -24, 30 - var24, this.field228 - 15 + var24);
					}
				}
				for (int var25 = 0; var25 < 4; var25++) {
					if (var19.field1179[var25] > field621) {
						this.method161(var19, false, var19.field1141 / 2);
						if (this.field228 > -1) {
							if (var25 == 1) {
								this.field229 -= 20;
							}
							if (var25 == 2) {
								this.field228 -= 15;
								this.field229 -= 10;
							}
							if (var25 == 3) {
								this.field228 += 15;
								this.field229 -= 10;
							}
							this.field478[var19.field1178[var25]].method195(this.field229 - 12, this.field228 - 12, -488);
							this.field355.method244(this.field228, 452, this.field229 + 4, 0, String.valueOf(var19.field1177[var25]));
							this.field355.method244(this.field228 - 1, 452, this.field229 + 3, 16777215, String.valueOf(var19.field1177[var25]));
						}
					}
				}
			}
		}
		for (int var3 = 0; var3 < this.field235; var3++) {
			int var4 = this.field237[var3];
			int var5 = this.field238[var3];
			int var6 = this.field240[var3];
			int var7 = this.field239[var3];
			boolean var8 = true;
			while (var8) {
				var8 = false;
				for (int var18 = 0; var18 < var3; var18++) {
					if (var5 + 2 > this.field238[var18] - this.field239[var18] && var5 - var7 < this.field238[var18] + 2 && var4 - var6 < this.field240[var18] + this.field237[var18] && var4 + var6 > this.field237[var18] - this.field240[var18] && this.field238[var18] - this.field239[var18] < var5) {
						var5 = this.field238[var18] - this.field239[var18];
						var8 = true;
					}
				}
			}
			this.field228 = this.field237[var3];
			this.field229 = this.field238[var3] = var5;
			String var9 = this.field244[var3];
			if (this.field294 == 0) {
				int var10 = 16776960;
				if (this.field241[var3] < 6) {
					var10 = this.field138[this.field241[var3]];
				}
				if (this.field241[var3] == 6) {
					var10 = this.field434 % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.field241[var3] == 7) {
					var10 = this.field434 % 20 < 10 ? 255 : 65535;
				}
				if (this.field241[var3] == 8) {
					var10 = this.field434 % 20 < 10 ? 45056 : 8454016;
				}
				if (this.field241[var3] == 9) {
					int var11 = 150 - this.field243[var3];
					if (var11 < 50) {
						var10 = var11 * 1280 + 16711680;
					} else if (var11 < 100) {
						var10 = 16776960 - (var11 - 50) * 327680;
					} else if (var11 < 150) {
						var10 = (var11 - 100) * 5 + 65280;
					}
				}
				if (this.field241[var3] == 10) {
					int var12 = 150 - this.field243[var3];
					if (var12 < 50) {
						var10 = var12 * 5 + 16711680;
					} else if (var12 < 100) {
						var10 = 16711935 - (var12 - 50) * 327680;
					} else if (var12 < 150) {
						var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
					}
				}
				if (this.field241[var3] == 11) {
					int var13 = 150 - this.field243[var3];
					if (var13 < 50) {
						var10 = 16777215 - var13 * 327685;
					} else if (var13 < 100) {
						var10 = (var13 - 50) * 327685 + 65280;
					} else if (var13 < 150) {
						var10 = 16777215 - (var13 - 100) * 327680;
					}
				}
				if (this.field242[var3] == 0) {
					this.field357.method244(this.field228, 452, this.field229 + 1, 0, var9);
					this.field357.method244(this.field228, 452, this.field229, var10, var9);
				}
				if (this.field242[var3] == 1) {
					this.field357.method249(this.field229 + 1, (byte) 4, this.field434, var9, this.field228, 0);
					this.field357.method249(this.field229, (byte) 4, this.field434, var9, this.field228, var10);
				}
				if (this.field242[var3] == 2) {
					this.field357.method250(this.field229 + 1, 0, (byte) 1, var9, this.field228, this.field434);
					this.field357.method250(this.field229, var10, (byte) 1, var9, this.field228, this.field434);
				}
				if (this.field242[var3] == 3) {
					this.field357.method251(-601, var9, 0, this.field228, this.field229 + 1, 150 - this.field243[var3], this.field434);
					this.field357.method251(-601, var9, var10, this.field228, this.field229, 150 - this.field243[var3], this.field434);
				}
				if (this.field242[var3] == 4) {
					int var14 = this.field357.method247(var9, (byte) -53);
					int var15 = (150 - this.field243[var3]) * (var14 + 100) / 150;
					Pix2D.method334(0, this.field228 - 50, 334, this.field228 + 50, true);
					this.field357.method248(2245, this.field228 + 50 - var15, 0, this.field229 + 1, var9);
					this.field357.method248(2245, this.field228 + 50 - var15, var10, this.field229, var9);
					Pix2D.method333((byte) 82);
				}
				if (this.field242[var3] == 5) {
					int var16 = 150 - this.field243[var3];
					int var17 = 0;
					if (var16 < 25) {
						var17 = var16 - 25;
					} else if (var16 > 125) {
						var17 = var16 - 125;
					}
					Pix2D.method334(this.field229 - this.field357.field894 - 1, 0, this.field229 + 5, 512, true);
					this.field357.method244(this.field228, 452, this.field229 + 1 + var17, 0, var9);
					this.field357.method244(this.field228, 452, this.field229 + var17, var10, var9);
					Pix2D.method333((byte) 82);
				}
			} else {
				this.field357.method244(this.field228, 452, this.field229 + 1, 0, var9);
				this.field357.method244(this.field228, 452, this.field229, 16776960, var9);
			}
		}
		if (arg0) {
			this.field166 = -1;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method146(int arg0) {
		while (arg0 >= 0) {
		}
		if (this.field455 != null) {
			return;
		}
		this.method168(28614);
		super.field952 = null;
		this.field494 = null;
		this.field495 = null;
		this.field496 = null;
		this.field497 = null;
		this.field498 = null;
		this.field499 = null;
		this.field500 = null;
		this.field501 = null;
		this.field502 = null;
		this.field455 = new PixMap(96, (byte) -12, this.method164(-756), 479);
		this.field453 = new PixMap(156, (byte) -12, this.method164(-756), 172);
		Pix2D.method335(4);
		this.field482.method492(0, 0, -488);
		this.field452 = new PixMap(261, (byte) -12, this.method164(-756), 190);
		this.field454 = new PixMap(334, (byte) -12, this.method164(-756), 512);
		Pix2D.method335(4);
		this.field404 = new PixMap(50, (byte) -12, this.method164(-756), 496);
		this.field405 = new PixMap(37, (byte) -12, this.method164(-756), 269);
		this.field406 = new PixMap(45, (byte) -12, this.method164(-756), 249);
		this.field342 = true;
		this.field454.method240(false);
		Pix3D.field1600 = this.field298;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method147(int arg0) {
		Graphics var2 = this.method164(-756).getGraphics();
		var2.setColor(Color.black);
		int var3 = 68 / arg0;
		var2.fillRect(0, 0, 765, 503);
		this.method269((byte) 103, 1);
		if (this.field579) {
			this.field539 = false;
			var2.setFont(new Font("Helvetica", 1, 16));
			var2.setColor(Color.yellow);
			byte var4 = 35;
			var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
			int var6 = var4 + 50;
			var2.setColor(Color.white);
			var2.drawString("To fix this try the following (in order):", 30, var6);
			int var7 = var6 + 50;
			var2.setColor(Color.white);
			var2.setFont(new Font("Helvetica", 1, 12));
			var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
			int var8 = var7 + 30;
			var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
			int var9 = var8 + 30;
			var2.drawString("3: Try using a different game-world", 30, var9);
			int var11 = var9 + 30;
			var2.drawString("4: Try rebooting your computer", 30, var11);
			int var13 = var11 + 30;
			var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
		}
		if (this.field393) {
			this.field539 = false;
			var2.setFont(new Font("Helvetica", 1, 20));
			var2.setColor(Color.white);
			var2.drawString("Error - unable to load game!", 50, 50);
			var2.drawString("To play RuneScape make sure you play from", 50, 100);
			var2.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.field312) {
			return;
		}
		this.field539 = false;
		var2.setColor(Color.yellow);
		byte var5 = 35;
		var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
		int var10 = var5 + 50;
		var2.setColor(Color.white);
		var2.drawString("To fix this try the following (in order):", 30, var10);
		int var12 = var10 + 50;
		var2.setColor(Color.white);
		var2.setFont(new Font("Helvetica", 1, 12));
		var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
		int var14 = var12 + 30;
		var2.drawString("2: Try rebooting your computer, and reloading", 30, var14);
		int var15 = var14 + 30;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method148(boolean arg0) {
		try {
			if (this.field320 != null) {
				this.field320.method233();
			}
		} catch (Exception var3) {
		}
		this.field320 = null;
		this.field433 = false;
		this.field521 = 0;
		this.field388 = "";
		this.field389 = "";
		this.method69(383);
		this.field433 &= arg0;
		this.field460.method274((byte) 7);
		for (int var2 = 0; var2 < 4; var2++) {
			this.field556[var2].method532();
		}
		System.gc();
		this.method70(false);
		this.field623 = -1;
		this.field566 = -1;
		this.field424 = 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;)V")
	public final void method149(int arg0, String arg1, String arg2) {
		if (arg0 >= 0) {
			return;
		}
		if (this.field454 != null) {
			this.field454.method240(false);
			Pix3D.field1600 = this.field298;
			int var4 = 151;
			if (arg1 != null) {
				var4 -= 7;
			}
			this.field356.method244(257, 452, var4, 0, arg2);
			this.field356.method244(256, 452, var4 - 1, 16777215, arg2);
			var4 += 15;
			if (arg1 != null) {
				this.field356.method244(257, 452, var4, 0, arg1);
				this.field356.method244(256, 452, var4 - 1, 16777215, arg1);
			}
			this.field454.method241(4, 4, super.field951, this.field370);
		} else if (super.field952 != null) {
			super.field952.method240(false);
			Pix3D.field1600 = this.field299;
			int var5 = 251;
			short var6 = 300;
			byte var7 = 50;
			Pix2D.method337(var7, var5 - 5 - var7 / 2, 0, (byte) -24, var6, 383 - var6 / 2);
			Pix2D.method338(0, var5 - 5 - var7 / 2, var7, 16777215, 383 - var6 / 2, var6);
			if (arg1 != null) {
				var5 -= 7;
			}
			this.field356.method244(383, 452, var5, 0, arg2);
			this.field356.method244(382, 452, var5 - 1, 16777215, arg2);
			var5 += 15;
			if (arg1 != null) {
				this.field356.method244(383, 452, var5, 0, arg1);
				this.field356.method244(382, 452, var5 - 1, 16777215, arg1);
			}
			super.field952.method241(0, 0, super.field951, this.field370);
		}
	}

	@ObfuscatedName("client.b(IB)Z")
	public final boolean method150(int arg0, byte arg1) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = this.field277[arg0];
		if (arg1 != 97) {
			throw new NullPointerException();
		}
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 762;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method151(boolean arg0) {
		if (!arg0) {
			this.field352 = this.field195.method329();
		}
		if (this.field493 == 2) {
			this.method162((this.field140 - this.field336 << 7) + this.field143, this.field142 * 2, (this.field141 - this.field337 << 7) + this.field144, -214);
			if (this.field228 > -1 && field621 % 20 < 10) {
				this.field250[0].method195(this.field229 - 28, this.field228 - 12, -488);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method152(int arg0) {
		if (this.field312 || this.field579 || this.field393) {
			this.method147(281);
			return;
		}
		field605++;
		if (arg0 <= 0) {
			this.field300 = -382;
		}
		if (this.field433) {
			this.method96(7);
		} else {
			this.method156((byte) -50, false);
		}
		this.field390 = 0;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method153(boolean arg0) {
		if (arg0) {
			this.field260.p1(23);
		}
		int var2 = this.field601;
		int var3 = this.field602;
		int var4 = this.field603;
		int var5 = this.field604;
		int var6 = 6116423;
		Pix2D.method337(var5, var3, var6, (byte) -24, var4, var2);
		Pix2D.method337(16, var3 + 1, 0, (byte) -24, var4 - 2, var2 + 1);
		Pix2D.method338(0, var3 + 18, var5 - 19, 0, var2 + 1, var4 - 2);
		this.field357.method248(2245, var2 + 3, var6, var3 + 14, "Choose Option");
		int var7 = super.field959;
		int var8 = super.field960;
		if (this.field600 == 0) {
			var7 -= 4;
			var8 -= 4;
		}
		if (this.field600 == 1) {
			var7 -= 553;
			var8 -= 205;
		}
		if (this.field600 == 2) {
			var7 -= 17;
			var8 -= 357;
		}
		for (int var9 = 0; var9 < this.field479; var9++) {
			int var10 = (this.field479 - 1 - var9) * 15 + var3 + 31;
			int var11 = 16777215;
			if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
				var11 = 16776960;
			}
			this.field357.method252(var11, var2 + 3, var10, true, this.field480[var9], -39629);
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;)I")
	public final int method154(int arg0, int arg1, Component arg2) {
		if (arg0 != 3) {
			return this.field518;
		} else if (arg2.field716 == null || arg1 >= arg2.field716.length) {
			return -2;
		} else {
			try {
				int[] var4 = arg2.field716[arg1];
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
						var9 = this.field325[var4[var6++]];
					}
					if (var8 == 2) {
						var9 = this.field350[var4[var6++]];
					}
					if (var8 == 3) {
						var9 = this.field139[var4[var6++]];
					}
					if (var8 == 4) {
						Component var11 = Component.method204(var4[var6++]);
						int var12 = var4[var6++];
						if (var12 >= 0 && var12 < ObjType.field817 && (!ObjType.method221(var12).field859 || field221)) {
							for (int var13 = 0; var13 < var11.field751.length; var13++) {
								if (var12 + 1 == var11.field751[var13]) {
									var9 += var11.field706[var13];
								}
							}
						}
					}
					if (var8 == 5) {
						var9 = this.field335[var4[var6++]];
					}
					if (var8 == 6) {
						var9 = field248[this.field350[var4[var6++]] - 1];
					}
					if (var8 == 7) {
						var9 = this.field335[var4[var6++]] * 100 / 46875;
					}
					if (var8 == 8) {
						var9 = field463.field1675;
					}
					if (var8 == 9) {
						for (int var14 = 0; var14 < Stats.field1503; var14++) {
							if (Stats.field1505[var14]) {
								var9 += this.field350[var14];
							}
						}
					}
					if (var8 == 10) {
						Component var15 = Component.method204(var4[var6++]);
						int var16 = var4[var6++] + 1;
						if (var16 >= 0 && var16 < ObjType.field817 && (!ObjType.method221(var16).field859 || field221)) {
							for (int var17 = 0; var17 < var15.field751.length; var17++) {
								if (var15.field751[var17] == var16) {
									var9 = 999999999;
									break;
								}
							}
						}
					}
					if (var8 == 11) {
						var9 = this.field620;
					}
					if (var8 == 12) {
						var9 = this.field326;
					}
					if (var8 == 13) {
						int var18 = this.field335[var4[var6++]];
						int var19 = var4[var6++];
						var9 = (var18 & 0x1 << var19) == 0 ? 0 : 1;
					}
					if (var8 == 14) {
						int var20 = var4[var6++];
						VarbitType var21 = VarbitType.field1760[var20];
						int var22 = var21.field1762;
						int var23 = var21.field1763;
						int var24 = var21.field1764;
						int var25 = field510[var24 - var23];
						var9 = this.field335[var22] >> var23 & var25;
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
						var9 = (field463.field1157 >> 7) + this.field336;
					}
					if (var8 == 19) {
						var9 = (field463.field1158 >> 7) + this.field337;
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
	}

	@ObfuscatedName("client.a(IZLEPQDEJTO;I)V")
	public final void method155(int arg0, boolean arg1, Pix32 arg2, int arg3) {
		if (arg2 == null) {
			return;
		}
		int var5 = this.field548 + this.field212 & 0x7FF;
		int var6 = arg0 * arg0 + arg3 * arg3;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.field1257[var5];
		int var8 = Model.field1258[var5];
		int var9 = var7 * 256 / (this.field529 + 256);
		int var10 = var8 * 256 / (this.field529 + 256);
		if (!arg1) {
			this.field166 = this.field484.g1();
		}
		int var11 = arg0 * var9 + arg3 * var10 >> 16;
		int var12 = arg0 * var10 - arg3 * var9 >> 16;
		if (var6 > 2500) {
			arg2.method201(this.field482, 83 - var12 - arg2.field691 / 2 - 4, -49993, var11 + 94 - arg2.field690 / 2 + 4);
		} else {
			arg2.method195(83 - var12 - arg2.field691 / 2 - 4, var11 + 94 - arg2.field690 / 2 + 4, -488);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method156(byte arg0, boolean arg1) {
		this.method85(-188);
		this.field496.method240(false);
		this.field588.method492(0, 0, -488);
		short var3 = 360;
		short var4 = 200;
		if (arg0 != -50) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if (this.field521 == 0) {
			int var6 = var4 / 2 + 80;
			this.field355.method245(true, this.field352, 7711145, var6, var3 / 2, this.field587.field1724);
			int var7 = var4 / 2 - 20;
			this.field357.method245(true, this.field352, 16776960, var7, var3 / 2, "Welcome to RuneScape");
			int var18 = var7 + 30;
			int var8 = var3 / 2 - 80;
			int var9 = var4 / 2 + 20;
			this.field589.method492(var9 - 20, var8 - 73, -488);
			this.field357.method245(true, this.field352, 16777215, var9 + 5, var8, "New User");
			int var10 = var3 / 2 + 80;
			this.field589.method492(var9 - 20, var10 - 73, -488);
			this.field357.method245(true, this.field352, 16777215, var9 + 5, var10, "Existing User");
		}
		if (this.field521 == 2) {
			int var11 = var4 / 2 - 40;
			if (this.field253.length() > 0) {
				this.field357.method245(true, this.field352, 16776960, var11 - 15, var3 / 2, this.field253);
				this.field357.method245(true, this.field352, 16776960, var11, var3 / 2, this.field254);
				var11 += 30;
			} else {
				this.field357.method245(true, this.field352, 16776960, var11 - 7, var3 / 2, this.field254);
				var11 += 30;
			}
			this.field357.method252(16777215, var3 / 2 - 90, var11, true, "Username: " + this.field388 + (this.field273 == 0 & field621 % 40 < 20 ? "@yel@|" : ""), -39629);
			var11 += 15;
			this.field357.method252(16777215, var3 / 2 - 88, var11, true, "Password: " + JString.method349(2934, this.field389) + (this.field273 == 1 & field621 % 40 < 20 ? "@yel@|" : ""), -39629);
			var11 += 15;
			if (!arg1) {
				int var12 = var3 / 2 - 80;
				int var13 = var4 / 2 + 50;
				this.field589.method492(var13 - 20, var12 - 73, -488);
				this.field357.method245(true, this.field352, 16777215, var13 + 5, var12, "Login");
				int var14 = var3 / 2 + 80;
				this.field589.method492(var13 - 20, var14 - 73, -488);
				this.field357.method245(true, this.field352, 16777215, var13 + 5, var14, "Cancel");
			}
		}
		if (this.field521 == 3) {
			this.field357.method245(true, this.field352, 16776960, var4 / 2 - 60, var3 / 2, "Create a free account");
			int var15 = var4 / 2 - 35;
			this.field357.method245(true, this.field352, 16777215, var15, var3 / 2, "To create a new account you need to");
			int var19 = var15 + 15;
			this.field357.method245(true, this.field352, 16777215, var19, var3 / 2, "go back to the main RuneScape webpage");
			int var20 = var19 + 15;
			this.field357.method245(true, this.field352, 16777215, var20, var3 / 2, "and choose the 'create account'");
			int var21 = var20 + 15;
			this.field357.method245(true, this.field352, 16777215, var21, var3 / 2, "button near the top of that page.");
			int var22 = var21 + 15;
			int var16 = var3 / 2;
			int var17 = var4 / 2 + 50;
			this.field589.method492(var17 - 20, var16 - 73, -488);
			this.field357.method245(true, this.field352, 16777215, var17 + 5, var16, "Cancel");
		}
		this.field496.method241(171, 202, super.field951, this.field370);
		if (!this.field342) {
			return;
		}
		this.field342 = false;
		this.field494.method241(0, 128, super.field951, this.field370);
		this.field495.method241(371, 202, super.field951, this.field370);
		this.field499.method241(265, 0, super.field951, this.field370);
		this.field500.method241(265, 562, super.field951, this.field370);
		this.field501.method241(171, 128, super.field951, this.field370);
		this.field502.method241(171, 562, super.field951, this.field370);
	}

	@ObfuscatedName("client.a(LMFMVIYHT;IZ)V")
	public final void method157(Packet arg0, int arg1, boolean arg2) {
		if (arg2) {
			this.field436 = 287;
		}
		while (arg0.field1281 + 21 < arg1 * 8) {
			int var4 = arg0.gBit(402, 14);
			if (var4 == 16383) {
				break;
			}
			if (this.field428[var4] == null) {
				this.field428[var4] = new ClientNpc();
			}
			ClientNpc var5 = this.field428[var4];
			this.field430[this.field429++] = var4;
			var5.field1132 = field621;
			int var6 = arg0.gBit(402, 1);
			if (var6 == 1) {
				this.field270[this.field269++] = var4;
			}
			int var7 = arg0.gBit(402, 5);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg0.gBit(402, 5);
			if (var8 > 15) {
				var8 -= 32;
			}
			int var9 = arg0.gBit(402, 1);
			var5.field1370 = NpcType.method477(arg0.gBit(402, 13));
			var5.field1148 = var5.field1370.field1445;
			var5.field1147 = var5.field1370.field1454;
			var5.field1166 = var5.field1370.field1448;
			var5.field1167 = var5.field1370.field1446;
			var5.field1168 = var5.field1370.field1444;
			var5.field1169 = var5.field1370.field1436;
			var5.field1181 = var5.field1370.field1424;
			var5.method354(field463.field1134[0] + var7, (byte) 5, var9 == 1, field463.field1133[0] + var8);
		}
		arg0.accessBytes(-29290);
	}

	@ObfuscatedName("client.b(LMFMVIYHT;II)V")
	public final void method158(Packet arg0, int arg1, int arg2) {
		if (arg1 != 0) {
			this.field619 = null;
		}
		if (arg2 == 203) {
			// LOC_MERGE
			int var4 = arg0.g2();
			int var5 = arg0.g1();
			int var6 = var5 >> 2;
			int var7 = var5 & 0x3;
			int var8 = this.field328[var6];
			byte var9 = arg0.g1b_alt2(0);
			int var10 = arg0.g1_alt1(0);
			int var11 = (var10 >> 4 & 0x7) + this.field285;
			int var12 = (var10 & 0x7) + this.field286;
			byte var13 = arg0.g1b_alt1(this.field383);
			int var14 = arg0.g2_alt2((byte) 9);
			int var15 = arg0.g2_alt1(-125);
			byte var16 = arg0.g1b();
			byte var17 = arg0.g1b_alt1(this.field383);
			int var18 = arg0.g2();
			ClientPlayer var19;
			if (this.field257 == var15) {
				var19 = field463;
			} else {
				var19 = this.field266[var15];
			}
			if (var19 != null) {
				LocType var20 = LocType.method561(var4);
				int var21 = this.field187[this.field387][var11][var12];
				int var22 = this.field187[this.field387][var11 + 1][var12];
				int var23 = this.field187[this.field387][var11 + 1][var12 + 1];
				int var24 = this.field187[this.field387][var11][var12 + 1];
				Model var25 = var20.method569(var6, var7, var21, var22, var23, var24, -1);
				if (var25 != null) {
					this.method172(true, this.field387, var11, 0, var14 + 1, 0, -1, var18 + 1, var8, var12);
					var19.field1686 = field621 + var18;
					var19.field1687 = field621 + var14;
					var19.field1668 = var25;
					int var26 = var20.field1655;
					int var27 = var20.field1629;
					if (var7 == 1 || var7 == 3) {
						var26 = var20.field1629;
						var27 = var20.field1655;
					}
					var19.field1665 = var11 * 128 + var26 * 64;
					var19.field1667 = var12 * 128 + var27 * 64;
					var19.field1666 = this.method133(var19.field1667, var19.field1665, (byte) 9, this.field387);
					if (var13 > var9) {
						byte var28 = var13;
						var13 = var9;
						var9 = var28;
					}
					if (var17 > var16) {
						byte var29 = var17;
						var17 = var16;
						var16 = var29;
					}
					var19.field1690 = var11 + var13;
					var19.field1692 = var9 + var11;
					var19.field1691 = var12 + var17;
					var19.field1693 = var12 + var16;
				}
			}
		}
		if (arg2 == 106) {
			// OBJ_REVEAL
			int var30 = arg0.g1_alt1(0);
			int var31 = (var30 >> 4 & 0x7) + this.field285;
			int var32 = (var30 & 0x7) + this.field286;
			int var33 = arg0.g2_alt3(-600);
			int var34 = arg0.g2_alt2((byte) 9);
			int var35 = arg0.g2_alt2((byte) 9);
			if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && this.field257 != var35) {
				ClientObj var36 = new ClientObj();
				var36.field873 = var34;
				var36.field875 = var33;
				if (this.field619[this.field387][var31][var32] == null) {
					this.field619[this.field387][var31][var32] = new LinkList(true);
				}
				this.field619[this.field387][var31][var32].method3(var36);
				this.method46(var31, var32);
			}
		} else if (arg2 == 142) {
			// LOC_ANIM
			int var37 = arg0.g2();
			int var38 = arg0.g1_alt1(0);
			int var39 = var38 >> 2;
			int var40 = var38 & 0x3;
			int var41 = this.field328[var39];
			int var42 = arg0.g1();
			int var43 = (var42 >> 4 & 0x7) + this.field285;
			int var44 = (var42 & 0x7) + this.field286;
			if (var43 >= 0 && var44 >= 0 && var43 < 103 && var44 < 103) {
				int var45 = this.field187[this.field387][var43][var44];
				int var46 = this.field187[this.field387][var43 + 1][var44];
				int var47 = this.field187[this.field387][var43 + 1][var44 + 1];
				int var48 = this.field187[this.field387][var43][var44 + 1];
				if (var41 == 0) {
					Wall var49 = this.field460.method296(this.field387, 17734, var43, var44);
					if (var49 != null) {
						int var50 = var49.field1539 >> 14 & 0x7FFF;
						if (var39 == 2) {
							var49.field1537 = new ClientLocAnim(var37, var47, var48, var46, 2, (byte) 3, var50, false, var45, var40 + 4);
							var49.field1538 = new ClientLocAnim(var37, var47, var48, var46, 2, (byte) 3, var50, false, var45, var40 + 1 & 0x3);
						} else {
							var49.field1537 = new ClientLocAnim(var37, var47, var48, var46, var39, (byte) 3, var50, false, var45, var40);
						}
					}
				}
				if (var41 == 1) {
					Decor var51 = this.field460.method297(this.field387, var44, var43, false);
					if (var51 != null) {
						var51.field1411 = new ClientLocAnim(var37, var47, var48, var46, 4, (byte) 3, var51.field1412 >> 14 & 0x7FFF, false, var45, 0);
					}
				}
				if (var41 == 2) {
					Sprite var52 = this.field460.method298(var43, (byte) 32, var44, this.field387);
					if (var39 == 11) {
						var39 = 10;
					}
					if (var52 != null) {
						var52.field80 = new ClientLocAnim(var37, var47, var48, var46, var39, (byte) 3, var52.field88 >> 14 & 0x7FFF, false, var45, var40);
					}
				}
				if (var41 == 3) {
					GroundDecor var53 = this.field460.method299(this.field387, var44, 0, var43);
					if (var53 != null) {
						var53.field1313 = new ClientLocAnim(var37, var47, var48, var46, 22, (byte) 3, var53.field1314 >> 14 & 0x7FFF, false, var45, var40);
					}
				}
			}
		} else if (arg2 == 107) {
			// OBJ_ADD
			int var54 = arg0.g2();
			int var55 = arg0.g1_alt2(-34545);
			int var56 = (var55 >> 4 & 0x7) + this.field285;
			int var57 = (var55 & 0x7) + this.field286;
			int var58 = arg0.g2_alt2((byte) 9);
			if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
				ClientObj var59 = new ClientObj();
				var59.field873 = var54;
				var59.field875 = var58;
				if (this.field619[this.field387][var56][var57] == null) {
					this.field619[this.field387][var56][var57] = new LinkList(true);
				}
				this.field619[this.field387][var56][var57].method3(var59);
				this.method46(var56, var57);
			}
		} else if (arg2 == 121) {
			// OBJ_COUNT
			int var60 = arg0.g1();
			int var61 = (var60 >> 4 & 0x7) + this.field285;
			int var62 = (var60 & 0x7) + this.field286;
			int var63 = arg0.g2();
			int var64 = arg0.g2();
			int var65 = arg0.g2();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
				LinkList var66 = this.field619[this.field387][var61][var62];
				if (var66 != null) {
					for (ClientObj var67 = (ClientObj) var66.method6(); var67 != null; var67 = (ClientObj) var66.method8(1)) {
						if ((var63 & 0x7FFF) == var67.field873 && var67.field875 == var64) {
							var67.field875 = var65;
							break;
						}
					}
					this.method46(var61, var62);
				}
			}
		} else if (arg2 == 181) {
			// MAP_PROJANIM
			int var68 = arg0.g1();
			int var69 = (var68 >> 4 & 0x7) + this.field285;
			int var70 = (var68 & 0x7) + this.field286;
			int var71 = var69 + arg0.g1b();
			int var72 = var70 + arg0.g1b();
			int var73 = arg0.g2b();
			int var74 = arg0.g2();
			int var75 = arg0.g1() * 4;
			int var76 = arg0.g1() * 4;
			int var77 = arg0.g2();
			int var78 = arg0.g2();
			int var79 = arg0.g1();
			int var80 = arg0.g1();
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
				int var81 = var69 * 128 + 64;
				int var82 = var70 * 128 + 64;
				int var83 = var71 * 128 + 64;
				int var84 = var72 * 128 + 64;
				ClientProj var85 = new ClientProj(this.field387, var76, var80, var82, var74, field621 + var78, var79, var73, (byte) -41, this.method133(var82, var81, (byte) 9, this.field387) - var75, var81, field621 + var77);
				var85.method271(var83, var84, this.method133(var84, var83, (byte) 9, this.field387) - var76, field621 + var77, 0);
				this.field578.method3(var85);
			}
		} else {
			if (arg2 == 41) {
				// SOUND_AREA
				int var86 = arg0.g1();
				int var87 = (var86 >> 4 & 0x7) + this.field285;
				int var88 = (var86 & 0x7) + this.field286;
				int var89 = arg0.g2();
				int var90 = arg0.g1();
				int var91 = var90 >> 4 & 0xF;
				int var92 = var90 & 0x7;
				if (field463.field1133[0] >= var87 - var91 && field463.field1133[0] <= var87 + var91 && field463.field1134[0] >= var88 - var91 && field463.field1134[0] <= var88 + var91 && this.field597 && !field222 && this.field331 < 50) {
					this.field386[this.field331] = var89;
					this.field617[this.field331] = var92;
					this.field555[this.field331] = Wave.field1472[var89];
					this.field331++;
				}
			}
			if (arg2 == 59) {
				// MAP_ANIM
				int var93 = arg0.g1();
				int var94 = (var93 >> 4 & 0x7) + this.field285;
				int var95 = (var93 & 0x7) + this.field286;
				int var96 = arg0.g2();
				int var97 = arg0.g1();
				int var98 = arg0.g2();
				if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
					int var99 = var94 * 128 + 64;
					int var100 = var95 * 128 + 64;
					MapSpotAnim var101 = new MapSpotAnim(var99, this.field387, this.method133(var100, var99, (byte) 9, this.field387) - var97, var98, var96, field621, var100, 10709);
					this.field506.method3(var101);
				}
			} else if (arg2 == 152) {
				// LOC_ADD_CHANGE
				int var102 = arg0.g1_alt2(-34545);
				int var103 = var102 >> 2;
				int var104 = var102 & 0x3;
				int var105 = this.field328[var103];
				int var106 = arg0.g2_alt3(-600);
				int var107 = arg0.g1_alt1(0);
				int var108 = (var107 >> 4 & 0x7) + this.field285;
				int var109 = (var107 & 0x7) + this.field286;
				if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
					this.method172(true, this.field387, var108, var104, -1, var103, var106, 0, var105, var109);
				}
			} else if (arg2 == 208) {
				// OBJ_DEL
				int var110 = arg0.g2_alt2((byte) 9);
				int var111 = arg0.g1_alt1(0);
				int var112 = (var111 >> 4 & 0x7) + this.field285;
				int var113 = (var111 & 0x7) + this.field286;
				if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
					LinkList var114 = this.field619[this.field387][var112][var113];
					if (var114 != null) {
						for (ClientObj var115 = (ClientObj) var114.method6(); var115 != null; var115 = (ClientObj) var114.method8(1)) {
							if ((var110 & 0x7FFF) == var115.field873) {
								var115.method604();
								break;
							}
						}
						if (var114.method6() == null) {
							this.field619[this.field387][var112][var113] = null;
						}
						this.method46(var112, var113);
					}
				}
			} else if (arg2 == 88) {
				// LOC_DEL
				int var116 = arg0.g1_alt3(this.field532);
				int var117 = (var116 >> 4 & 0x7) + this.field285;
				int var118 = (var116 & 0x7) + this.field286;
				int var119 = arg0.g1_alt3(this.field532);
				int var120 = var119 >> 2;
				int var121 = var119 & 0x3;
				int var122 = this.field328[var120];
				if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
					this.method172(true, this.field387, var117, var121, -1, var120, -1, 0, var122, var118);
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method159(byte arg0) {
		this.field452.method240(false);
		Pix3D.field1600 = this.field297;
		this.field481.method492(0, 0, -488);
		if (this.field385 != -1) {
			this.method169(0, 0, Component.method204(this.field385), 0, 8);
		} else if (this.field377[this.field581] != -1) {
			this.method169(0, 0, Component.method204(this.field377[this.field581]), 0, 8);
		}
		if (this.field361 && this.field600 == 1) {
			this.method153(false);
		}
		this.field452.method241(205, 553, super.field951, this.field370);
		this.field454.method240(false);
		Pix3D.field1600 = this.field298;
		if (arg0 == 7) {
			;
		}
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
	public static final String method160(int arg0, int arg1) {
		String var2 = String.valueOf(arg1);
		if (arg0 != 0) {
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

	@ObfuscatedName("client.a(LLRUWCBNN;ZI)V")
	public final void method161(ClientEntity arg0, boolean arg1, int arg2) {
		this.method162(arg0.field1157, arg2, arg0.field1158, -214);
		if (!arg1) {
			;
		}
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method162(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			this.field228 = -1;
			this.field229 = -1;
			return;
		}
		int var5 = this.method133(arg2, arg0, (byte) 9, this.field387) - arg1;
		int var6 = arg0 - this.field512;
		int var7 = var5 - this.field513;
		int var8 = arg2 - this.field514;
		int var9 = Model.field1257[this.field515];
		int var10 = Model.field1258[this.field515];
		int var11 = Model.field1257[this.field516];
		int var12 = Model.field1258[this.field516];
		int var13 = var6 * var12 + var8 * var11 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		int var16 = var7 * var10 - var9 * var14 >> 16;
		int var17 = var7 * var9 + var10 * var14 >> 16;
		while (arg3 >= 0) {
			this.field166 = -1;
		}
		if (var17 >= 50) {
			this.field228 = (var13 << 9) / var17 + Pix3D.field1594;
			this.field229 = (var16 << 9) / var17 + Pix3D.field1595;
		} else {
			this.field228 = -1;
			this.field229 = -1;
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public void method163(boolean arg0) {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.field397);
		if (this.field587 != null) {
			System.out.println("Od-cycle:" + this.field587.field1725);
		}
		System.out.println("loop-cycle:" + field621);
		System.out.println("draw-cycle:" + field605);
		System.out.println("ptype:" + this.field166);
		System.out.println("psize:" + this.field165);
		if (arg0) {
			this.field324 = !this.field324;
		}
		if (this.field320 != null) {
			this.field320.method238(false);
		}
		super.field948 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final java.awt.Component method164(int arg0) {
		while (arg0 >= 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		} else if (super.field954 == null) {
			return this;
		} else {
			return super.field954;
		}
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;)V")
	public final void method165(int arg0, boolean arg1, String arg2) {
		this.field618 = arg0;
		if (!arg1) {
			this.field230 = !this.field230;
		}
		this.field323 = arg2;
		this.method85(-188);
		if (this.field184 == null) {
			super.method165(arg0, true, arg2);
			return;
		}
		this.field496.method240(false);
		short var4 = 360;
		short var5 = 200;
		byte var6 = 20;
		this.field357.method244(var4 / 2, 452, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...");
		int var7 = var5 / 2 - 18 - var6;
		Pix2D.method338(0, var7, 34, 9179409, var4 / 2 - 152, 304);
		Pix2D.method338(0, var7 + 1, 32, 0, var4 / 2 - 151, 302);
		Pix2D.method337(30, var7 + 2, 9179409, (byte) -24, arg0 * 3, var4 / 2 - 150);
		Pix2D.method337(30, var7 + 2, 0, (byte) -24, 300 - arg0 * 3, arg0 * 3 + (var4 / 2 - 150));
		this.field357.method244(var4 / 2, 452, var5 / 2 + 5 - var6, 16777215, arg2);
		this.field496.method241(171, 202, super.field951, this.field370);
		if (!this.field342) {
			return;
		}
		this.field342 = false;
		if (!this.field539) {
			this.field497.method241(0, 0, super.field951, this.field370);
			this.field498.method241(0, 637, super.field951, this.field370);
		}
		this.field494.method241(0, 128, super.field951, this.field370);
		this.field495.method241(371, 202, super.field951, this.field370);
		this.field499.method241(265, 0, super.field951, this.field370);
		this.field500.method241(265, 562, super.field951, this.field370);
		this.field501.method241(171, 128, super.field951, this.field370);
		this.field502.method241(171, 562, super.field951, this.field370);
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method166(boolean arg0) {
		byte[] var2 = this.field184.method2("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.field497.method240(false);
		var3.method193(0, -192, 0);
		this.field498.method240(false);
		var3.method193(0, -192, -637);
		this.field494.method240(false);
		var3.method193(0, -192, -128);
		this.field495.method240(false);
		var3.method193(-371, -192, -202);
		this.field496.method240(false);
		var3.method193(-171, -192, -202);
		this.field499.method240(false);
		var3.method193(-265, -192, 0);
		this.field500.method240(false);
		var3.method193(-265, -192, -562);
		this.field501.method240(false);
		var3.method193(-171, -192, -128);
		this.field502.method240(false);
		var3.method193(-171, -192, -562);
		int[] var4 = new int[var3.field686];
		for (int var5 = 0; var5 < var3.field687; var5++) {
			for (int var11 = 0; var11 < var3.field686; var11++) {
				var4[var11] = var3.field685[var3.field686 * var5 + (var3.field686 - var11 - 1)];
			}
			for (int var12 = 0; var12 < var3.field686; var12++) {
				var3.field685[var3.field686 * var5 + var12] = var4[var12];
			}
		}
		this.field497.method240(false);
		var3.method193(0, -192, 382);
		this.field498.method240(false);
		var3.method193(0, -192, -255);
		this.field494.method240(false);
		var3.method193(0, -192, 254);
		this.field495.method240(false);
		var3.method193(-371, -192, 180);
		this.field496.method240(false);
		var3.method193(-171, -192, 180);
		this.field499.method240(false);
		if (arg0) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		var3.method193(-265, -192, 382);
		this.field500.method240(false);
		var3.method193(-265, -192, -180);
		this.field501.method240(false);
		var3.method193(-171, -192, 254);
		this.field502.method240(false);
		var3.method193(-171, -192, -180);
		Pix32 var7 = new Pix32(this.field184, "logo", 0);
		this.field494.method240(false);
		var7.method195(18, 382 - var7.field686 / 2 - 128, -488);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
		if (Linkable.field1772) {
		}
	}

	@ObfuscatedName("client.a(BLNLLHDXXJ;)V")
	public final void method167(byte arg0, LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg0 != -61) {
			this.field260.p1(175);
		}
		if (arg1.field1324 == 0) {
			var3 = this.field460.method300(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (arg1.field1324 == 1) {
			var3 = this.field460.method301(arg1.field1325, (byte) 4, arg1.field1323, arg1.field1326);
		}
		if (arg1.field1324 == 2) {
			var3 = this.field460.method302(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (arg1.field1324 == 3) {
			var3 = this.field460.method303(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (var3 != 0) {
			int var7 = this.field460.method304(arg1.field1323, arg1.field1325, arg1.field1326, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.field1319 = var4;
		arg1.field1321 = var5;
		arg1.field1320 = var6;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method168(int arg0) {
		this.field539 = false;
		while (this.field616) {
			this.field539 = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
		this.field588 = null;
		this.field589 = null;
		this.field413 = null;
		this.field606 = null;
		this.field607 = null;
		if (arg0 != 28614) {
			this.field370 = !this.field370;
		}
		this.field608 = null;
		this.field609 = null;
		this.field472 = null;
		this.field473 = null;
		this.field380 = null;
		this.field381 = null;
		this.field313 = null;
		this.field314 = null;
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;II)V")
	public final void method169(int arg0, int arg1, Component arg2, int arg3, int arg4) {
		if (arg2.field718 != 0 || arg2.field740 == null || arg2.field701 && this.field598 != arg2.field697 && this.field576 != arg2.field697 && this.field402 != arg2.field697) {
			return;
		}
		int var6 = Pix2D.field1099;
		int var7 = Pix2D.field1097;
		int var8 = Pix2D.field1100;
		int var9 = Pix2D.field1098;
		Pix2D.method334(arg0, arg1, arg2.field720 + arg0, arg2.field723 + arg1, true);
		int var10 = arg2.field740.length;
		if (arg4 != 8) {
			this.field166 = -1;
		}
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg2.field714[var11] + arg1;
			int var13 = arg2.field758[var11] + arg0 - arg3;
			Component var14 = Component.method204(arg2.field740[var11]);
			int var15 = var14.field710 + var12;
			int var16 = var14.field741 + var13;
			if (var14.field724 > 0) {
				this.method126((byte) 2, var14);
			}
			if (var14.field718 == 0) {
				if (var14.field713 > var14.field767 - var14.field720) {
					var14.field713 = var14.field767 - var14.field720;
				}
				if (var14.field713 < 0) {
					var14.field713 = 0;
				}
				this.method169(var16, var15, var14, var14.field713, 8);
				if (var14.field767 > var14.field720) {
					this.method76(true, var14.field713, var14.field723 + var15, var14.field720, var14.field767, var16);
				}
			} else if (var14.field718 != 1) {
				if (var14.field718 == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.field720; var18++) {
						for (int var19 = 0; var19 < var14.field723; var19++) {
							int var20 = (var14.field745 + 32) * var19 + var15;
							int var21 = (var14.field726 + 32) * var18 + var16;
							if (var17 < 20) {
								var20 += var14.field703[var17];
								var21 += var14.field695[var17];
							}
							if (var14.field751[var17] > 0) {
								int var22 = 0;
								int var23 = 0;
								int var24 = var14.field751[var17] - 1;
								if (var20 > Pix2D.field1099 - 32 && var20 < Pix2D.field1100 && var21 > Pix2D.field1097 - 32 && var21 < Pix2D.field1098 || this.field409 != 0 && this.field408 == var17) {
									int var25 = 0;
									if (this.field442 == 1 && this.field443 == var17 && this.field444 == var14.field697) {
										var25 = 16777215;
									}
									Pix32 var26 = ObjType.method230((byte) -33, var25, var14.field706[var17], var24);
									if (var26 != null) {
										if (this.field409 != 0 && this.field408 == var17 && this.field407 == var14.field697) {
											var22 = super.field959 - this.field410;
											var23 = super.field960 - this.field411;
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (var23 < 5 && var23 > -5) {
												var23 = 0;
											}
											if (this.field565 < 5) {
												var22 = 0;
												var23 = 0;
											}
											var26.method197(0, var20 + var22, var21 + var23, 128);
											if (var21 + var23 < Pix2D.field1097 && arg2.field713 > 0) {
												int var27 = (Pix2D.field1097 - var21 - var23) * this.field247 / 3;
												if (var27 > this.field247 * 10) {
													var27 = this.field247 * 10;
												}
												if (var27 > arg2.field713) {
													var27 = arg2.field713;
												}
												arg2.field713 -= var27;
												this.field411 += var27;
											}
											if (var21 + var23 + 32 > Pix2D.field1098 && arg2.field713 < arg2.field767 - arg2.field720) {
												int var28 = (var21 + var23 + 32 - Pix2D.field1098) * this.field247 / 3;
												if (var28 > this.field247 * 10) {
													var28 = this.field247 * 10;
												}
												if (var28 > arg2.field767 - arg2.field720 - arg2.field713) {
													var28 = arg2.field767 - arg2.field720 - arg2.field713;
												}
												arg2.field713 += var28;
												this.field411 -= var28;
											}
										} else if (this.field628 != 0 && this.field627 == var17 && this.field626 == var14.field697) {
											var26.method197(0, var20, var21, 128);
										} else {
											var26.method195(var21, var20, -488);
										}
										if (var26.field690 == 33 || var14.field706[var17] != 1) {
											int var29 = var14.field706[var17];
											this.field355.method248(2245, var20 + 1 + var22, 0, var21 + 10 + var23, method39(var29, -243));
											this.field355.method248(2245, var20 + var22, 16776960, var21 + 9 + var23, method39(var29, -243));
										}
									}
								}
							} else if (var14.field747 != null && var17 < 20) {
								Pix32 var30 = var14.field747[var17];
								if (var30 != null) {
									var30.method195(var21, var20, -488);
								}
							}
							var17++;
						}
					}
				} else if (var14.field718 == 3) {
					boolean var31 = false;
					if (this.field402 == var14.field697 || this.field576 == var14.field697 || this.field598 == var14.field697) {
						var31 = true;
					}
					int var32;
					if (this.method118(var14, -693)) {
						var32 = var14.field742;
						if (var31 && var14.field708 != 0) {
							var32 = var14.field708;
						}
					} else {
						var32 = var14.field722;
						if (var31 && var14.field743 != 0) {
							var32 = var14.field743;
						}
					}
					if (var14.field702 == 0) {
						if (var14.field721) {
							Pix2D.method337(var14.field720, var16, var32, (byte) -24, var14.field723, var15);
						} else {
							Pix2D.method338(0, var16, var14.field720, var32, var15, var14.field723);
						}
					} else if (var14.field721) {
						Pix2D.method336(false, var32, var16, var14.field723, var14.field720, 256 - (var14.field702 & 0xFF), var15);
					} else {
						Pix2D.method339(var15, var14.field723, var32, var14.field720, var16, 256 - (var14.field702 & 0xFF), (byte) -113);
					}
				} else if (var14.field718 == 4) {
					PixFont var33 = var14.field719;
					String var34 = var14.field712;
					boolean var35 = false;
					if (this.field402 == var14.field697 || this.field576 == var14.field697 || this.field598 == var14.field697) {
						var35 = true;
					}
					int var36;
					if (this.method118(var14, -693)) {
						var36 = var14.field742;
						if (var35 && var14.field708 != 0) {
							var36 = var14.field708;
						}
						if (var14.field731.length() > 0) {
							var34 = var14.field731;
						}
					} else {
						var36 = var14.field722;
						if (var35 && var14.field743 != 0) {
							var36 = var14.field743;
						}
					}
					if (var14.field771 == 6 && this.field535) {
						var34 = "Please wait...";
						var36 = var14.field722;
					}
					if (Pix2D.field1095 == 479) {
						if (var36 == 16776960) {
							var36 = 255;
						}
						if (var36 == 49152) {
							var36 = 16777215;
						}
					}
					int var37 = var33.field894 + var16;
					while (var34.length() > 0) {
						if (var34.indexOf("%") != -1) {
							label393: while (true) {
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
																	break label393;
																}
																var34 = var34.substring(0, var42) + this.method111(this.method154(3, 4, var14), 8) + var34.substring(var42 + 2);
															}
														}
														var34 = var34.substring(0, var41) + this.method111(this.method154(3, 3, var14), 8) + var34.substring(var41 + 2);
													}
												}
												var34 = var34.substring(0, var40) + this.method111(this.method154(3, 2, var14), 8) + var34.substring(var40 + 2);
											}
										}
										var34 = var34.substring(0, var39) + this.method111(this.method154(3, 1, var14), 8) + var34.substring(var39 + 2);
									}
								}
								var34 = var34.substring(0, var38) + this.method111(this.method154(3, 0, var14), 8) + var34.substring(var38 + 2);
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
						if (var14.field754) {
							var33.method245(var14.field729, this.field352, var36, var37, var14.field723 / 2 + var15, var44);
						} else {
							var33.method252(var36, var15, var37, var14.field729, var44, -39629);
						}
						var37 += var33.field894;
					}
				} else if (var14.field718 == 5) {
					Pix32 var45;
					if (this.method118(var14, -693)) {
						var45 = var14.field727;
					} else {
						var45 = var14.field694;
					}
					if (var45 != null) {
						var45.method195(var16, var15, -488);
					}
				} else if (var14.field718 == 6) {
					int var46 = Pix3D.field1594;
					int var47 = Pix3D.field1595;
					Pix3D.field1594 = var14.field723 / 2 + var15;
					Pix3D.field1595 = var14.field720 / 2 + var16;
					int var48 = Pix3D.field1598[var14.field734] * var14.field733 >> 16;
					int var49 = Pix3D.field1599[var14.field734] * var14.field733 >> 16;
					boolean var50 = this.method118(var14, -693);
					int var51;
					if (var50) {
						var51 = var14.field769;
					} else {
						var51 = var14.field768;
					}
					Model var52;
					if (var51 == -1) {
						var52 = var14.method212(-1, -1, 0, var50);
					} else {
						SeqType var53 = SeqType.field775[var51];
						var52 = var14.method212(var53.field777[var14.field717], var53.field778[var14.field717], 0, var50);
					}
					if (var52 != null) {
						var52.method380(0, var14.field735, 0, var14.field734, 0, var48, var49);
					}
					Pix3D.field1594 = var46;
					Pix3D.field1595 = var47;
				} else {
					if (var14.field718 == 7) {
						PixFont var54 = var14.field719;
						int var55 = 0;
						for (int var56 = 0; var56 < var14.field720; var56++) {
							for (int var57 = 0; var57 < var14.field723; var57++) {
								if (var14.field751[var55] > 0) {
									ObjType var58 = ObjType.method221(var14.field751[var55] - 1);
									String var59 = String.valueOf(var58.field811);
									if (var58.field853 || var14.field706[var55] != 1) {
										var59 = var59 + " x" + method160(0, var14.field706[var55]);
									}
									int var60 = (var14.field745 + 115) * var57 + var15;
									int var61 = (var14.field726 + 12) * var56 + var16;
									if (var14.field754) {
										var54.method245(var14.field729, this.field352, var14.field722, var61, var14.field723 / 2 + var60, var59);
									} else {
										var54.method252(var14.field722, var60, var61, var14.field729, var59, -39629);
									}
								}
								var55++;
							}
						}
					}
					if (var14.field718 == 8 && (this.field580 == var14.field697 || this.field340 == var14.field697 || this.field425 == var14.field697) && this.field189 == 100) {
						int var62 = 0;
						int var63 = 0;
						PixFont var64 = this.field356;
						String var65 = var14.field712;
						while (var65.length() > 0) {
							int var72 = var65.indexOf("\\n");
							String var73;
							if (var72 == -1) {
								var73 = var65;
								var65 = "";
							} else {
								var73 = var65.substring(0, var72);
								var65 = var65.substring(var72 + 2);
							}
							int var74 = var64.method246((byte) 35, var73);
							if (var74 > var62) {
								var62 = var74;
							}
							var63 += var64.field894 + 1;
						}
						var62 += 6;
						var63 += 7;
						int var66 = var14.field723 + var15 - 5 - var62;
						int var67 = var14.field720 + var16 + 5;
						if (var66 < var15 + 5) {
							var66 = var15 + 5;
						}
						if (var62 + var66 > arg2.field723 + arg1) {
							var66 = arg2.field723 + arg1 - var62;
						}
						if (var63 + var67 > arg2.field720 + arg0) {
							var67 = arg2.field720 + arg0 - var63;
						}
						Pix2D.method337(var63, var67, 16777120, (byte) -24, var62, var66);
						Pix2D.method338(0, var67, var63, 0, var66, var62);
						String var68 = var14.field712;
						int var69 = var64.field894 + var67 + 2;
						while (var68.length() > 0) {
							int var70 = var68.indexOf("\\n");
							String var71;
							if (var70 == -1) {
								var71 = var68;
								var68 = "";
							} else {
								var71 = var68.substring(0, var70);
								var68 = var68.substring(var70 + 2);
							}
							var64.method252(0, var66 + 3, var69, false, var71, -39629);
							var69 += var64.field894 + 1;
						}
					}
				}
			}
		}
		Pix2D.method334(var7, var6, var9, var8, true);
	}

	@ObfuscatedName("client.l(B)V")
	public final void method170(byte arg0) {
		if (arg0 != -40) {
			field503 = !field503;
		}
		if (field222 && this.field367 == 2 && World.field125 != this.field387) {
			this.method149(-332, null, "Loading - please wait.");
			this.field367 = 1;
			this.field525 = System.currentTimeMillis();
		}
		if (this.field367 == 1) {
			int var2 = this.method171(5);
			if (var2 != 0 && System.currentTimeMillis() - this.field525 > 360000L) {
				signlink.reporterror(this.field388 + " glcfb " + this.field226 + "," + var2 + "," + field222 + "," + this.field524[0] + "," + this.field587.method590() + "," + this.field387 + "," + this.field185 + "," + this.field186);
				this.field525 = System.currentTimeMillis();
			}
		}
		if (this.field367 == 2 && this.field572 != this.field387) {
			this.field572 = this.field387;
			this.method138(this.field387, 0);
		}
	}

	@ObfuscatedName("client.I(I)I")
	public final int method171(int arg0) {
		for (int var2 = 0; var2 < this.field134.length; var2++) {
			if (this.field134[var2] == null && this.field153[var2] != -1) {
				return -1;
			}
			if (this.field528[var2] == null && this.field154[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		if (arg0 < 5 || arg0 > 5) {
			this.field249 = !this.field249;
		}
		for (int var4 = 0; var4 < this.field134.length; var4++) {
			byte[] var5 = this.field528[var4];
			if (var5 != null) {
				int var6 = (this.field152[var4] >> 8) * 64 - this.field336;
				int var7 = (this.field152[var4] & 0xFF) * 64 - this.field337;
				if (this.field459) {
					var6 = 10;
					var7 = 10;
				}
				var3 &= World.method29(var6, var7, var5, 24515);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.field505) {
			return -4;
		} else {
			this.field367 = 2;
			World.field125 = this.field387;
			this.method116(175);
			// MAP_BUILD_COMPLETE
			this.field260.p1isaac((byte) 4, 6);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIII)V")
	public final void method172(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) this.field557.method6(); var12 != null; var12 = (LocChange) this.field557.method8(1)) {
			if (var12.field1323 == arg1 && var12.field1325 == arg2 && var12.field1326 == arg9 && var12.field1324 == arg8) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.field1323 = arg1;
			var11.field1324 = arg8;
			var11.field1325 = arg2;
			var11.field1326 = arg9;
			this.method167((byte) -61, var11);
			this.field557.method3(var11);
		}
		var11.field1316 = arg6;
		var11.field1318 = arg5;
		var11.field1317 = arg3;
		var11.field1327 = arg7;
		var11.field1322 = arg4;
		this.field433 &= arg0;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method173(byte arg0) {
		if (arg0 != 4 || (this.field346 != 0 || super.field965 != 1)) {
			return;
		}
		int var2 = super.field966 - 25 - 550;
		int var3 = super.field967 - 5 - 4;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = this.field548 + this.field212 & 0x7FF;
		int var5 = Pix3D.field1598[var4];
		int var6 = Pix3D.field1599[var4];
		int var7 = (this.field529 + 256) * var5 >> 8;
		int var8 = (this.field529 + 256) * var6 >> 8;
		int var9 = var2 * var8 + var3 * var7 >> 11;
		int var10 = var3 * var8 - var2 * var7 >> 11;
		int var11 = field463.field1157 + var9 >> 7;
		int var12 = field463.field1158 - var10 >> 7;
		boolean var13 = this.method55(true, false, var12, field463.field1134[0], 0, 0, 1, 0, var11, 0, 0, field463.field1133[0]);
		if (!var13) {
			return;
		}
		this.field260.p1(var2);
		this.field260.p1(var3);
		this.field260.p2(this.field548);
		this.field260.p1(57);
		this.field260.p1(this.field212);
		this.field260.p1(this.field529);
		this.field260.p1(89);
		this.field260.p2(field463.field1157);
		this.field260.p2(field463.field1158);
		this.field260.p1(this.field422);
		this.field260.p1(63);
		return;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method174(int arg0) {
		if (super.field952 != null) {
			return;
		}
		this.method168(28614);
		this.field494 = null;
		this.field495 = null;
		this.field496 = null;
		if (arg0 >= 0) {
			this.field300 = -4;
		}
		this.field497 = null;
		this.field498 = null;
		this.field499 = null;
		this.field500 = null;
		this.field501 = null;
		this.field502 = null;
		this.field455 = null;
		this.field453 = null;
		this.field452 = null;
		this.field454 = null;
		this.field404 = null;
		this.field405 = null;
		this.field406 = null;
		super.field952 = new PixMap(503, (byte) -12, this.method164(-756), 765);
		this.field342 = true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method175(int arg0, String arg1) {
		if (arg1 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.field155; var3++) {
			if (arg1.equalsIgnoreCase(this.field145[var3])) {
				return true;
			}
		}
		if (arg0 != 13292) {
			this.field310 = !this.field310;
		}
		return arg1.equalsIgnoreCase(field463.field1673);
	}

	@ObfuscatedName("client.K(I)V")
	public final void method176(int arg0) {
		while (arg0 >= 0) {
			this.field166 = this.field484.g1();
		}
		if (this.field521 == 0) {
			int var2 = super.field949 / 2 - 80;
			int var3 = super.field950 / 2 + 20;
			int var14 = var3 + 20;
			if (super.field965 == 1 && super.field966 >= var2 - 75 && super.field966 <= var2 + 75 && super.field967 >= var14 - 20 && super.field967 <= var14 + 20) {
				this.field521 = 3;
				this.field273 = 0;
			}
			int var4 = super.field949 / 2 + 80;
			if (super.field965 == 1 && super.field966 >= var4 - 75 && super.field966 <= var4 + 75 && super.field967 >= var14 - 20 && super.field967 <= var14 + 20) {
				this.field253 = "";
				this.field254 = "Enter your username & password.";
				this.field521 = 2;
				this.field273 = 0;
			}
		} else if (this.field521 == 2) {
			int var5 = super.field950 / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.field965 == 1 && super.field967 >= var16 - 15 && super.field967 < var16) {
				this.field273 = 0;
			}
			var5 = var16 + 15;
			if (super.field965 == 1 && super.field967 >= var5 - 15 && super.field967 < var5) {
				this.field273 = 1;
			}
			var5 += 15;
			int var6 = super.field949 / 2 - 80;
			int var7 = super.field950 / 2 + 50;
			int var17 = var7 + 20;
			if (super.field965 == 1 && super.field966 >= var6 - 75 && super.field966 <= var6 + 75 && super.field967 >= var17 - 20 && super.field967 <= var17 + 20) {
				this.field146 = 0;
				this.method101(this.field388, this.field389, false);
				if (this.field433) {
					return;
				}
			}
			int var8 = super.field949 / 2 + 80;
			if (super.field965 == 1 && super.field966 >= var8 - 75 && super.field966 <= var8 + 75 && super.field967 >= var17 - 20 && super.field967 <= var17 + 20) {
				this.field521 = 0;
				this.field388 = "";
				this.field389 = "";
			}
			while (true) {
				while (true) {
					int var9 = this.method270(-983);
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < field303.length(); var11++) {
						if (var9 == field303.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (this.field273 == 0) {
						if (var9 == 8 && this.field388.length() > 0) {
							this.field388 = this.field388.substring(0, this.field388.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field273 = 1;
						}
						if (var10) {
							this.field388 = this.field388 + (char) var9;
						}
						if (this.field388.length() > 12) {
							this.field388 = this.field388.substring(0, 12);
						}
					} else if (this.field273 == 1) {
						if (var9 == 8 && this.field389.length() > 0) {
							this.field389 = this.field389.substring(0, this.field389.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field273 = 0;
						}
						if (var10) {
							this.field389 = this.field389 + (char) var9;
						}
						if (this.field389.length() > 20) {
							this.field389 = this.field389.substring(0, 20);
						}
					}
				}
			}
		} else if (this.field521 == 3) {
			int var12 = super.field949 / 2;
			int var13 = super.field950 / 2 + 50;
			int var18 = var13 + 20;
			if (super.field965 == 1 && super.field966 >= var12 - 75 && super.field966 <= var12 + 75 && super.field967 >= var18 - 20 && super.field967 <= var18 + 20) {
				this.field521 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = this.field460.method300(arg1, arg2, arg0);
		int var8 = 62 / arg4;
		if (var7 != 0) {
			int var9 = this.field460.method304(arg1, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			int var12 = arg5;
			if (var7 > 0) {
				var12 = arg3;
			}
			int[] var13 = this.field418.field685;
			int var14 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var15 = var7 >> 14 & 0x7FFF;
			LocType var16 = LocType.method561(var15);
			if (var16.field1649 == -1) {
				if (var11 == 0 || var11 == 2) {
					if (var10 == 0) {
						var13[var14] = var12;
						var13[var14 + 512] = var12;
						var13[var14 + 1024] = var12;
						var13[var14 + 1536] = var12;
					} else if (var10 == 1) {
						var13[var14] = var12;
						var13[var14 + 1] = var12;
						var13[var14 + 2] = var12;
						var13[var14 + 3] = var12;
					} else if (var10 == 2) {
						var13[var14 + 3] = var12;
						var13[var14 + 3 + 512] = var12;
						var13[var14 + 3 + 1024] = var12;
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var13[var14 + 1536] = var12;
						var13[var14 + 1536 + 1] = var12;
						var13[var14 + 1536 + 2] = var12;
						var13[var14 + 1536 + 3] = var12;
					}
				}
				if (var11 == 3) {
					if (var10 == 0) {
						var13[var14] = var12;
					} else if (var10 == 1) {
						var13[var14 + 3] = var12;
					} else if (var10 == 2) {
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var13[var14 + 1536] = var12;
					}
				}
				if (var11 == 2) {
					if (var10 == 3) {
						var13[var14] = var12;
						var13[var14 + 512] = var12;
						var13[var14 + 1024] = var12;
						var13[var14 + 1536] = var12;
					} else if (var10 == 0) {
						var13[var14] = var12;
						var13[var14 + 1] = var12;
						var13[var14 + 2] = var12;
						var13[var14 + 3] = var12;
					} else if (var10 == 1) {
						var13[var14 + 3] = var12;
						var13[var14 + 3 + 512] = var12;
						var13[var14 + 3 + 1024] = var12;
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 2) {
						var13[var14 + 1536] = var12;
						var13[var14 + 1536 + 1] = var12;
						var13[var14 + 1536 + 2] = var12;
						var13[var14 + 1536 + 3] = var12;
					}
				}
			} else {
				Pix8 var17 = this.field449[var16.field1649];
				if (var17 != null) {
					int var18 = (var16.field1655 * 4 - var17.field1550) / 2;
					int var19 = (var16.field1629 * 4 - var17.field1551) / 2;
					var17.method492((104 - arg0 - var16.field1629) * 4 + 48 + var19, arg2 * 4 + 48 + var18, -488);
				}
			}
		}
		int var20 = this.field460.method302(arg1, arg2, arg0);
		if (var20 != 0) {
			int var21 = this.field460.method304(arg1, arg2, arg0, var20);
			int var22 = var21 >> 6 & 0x3;
			int var23 = var21 & 0x1F;
			int var24 = var20 >> 14 & 0x7FFF;
			LocType var25 = LocType.method561(var24);
			if (var25.field1649 != -1) {
				Pix8 var26 = this.field449[var25.field1649];
				if (var26 != null) {
					int var27 = (var25.field1655 * 4 - var26.field1550) / 2;
					int var28 = (var25.field1629 * 4 - var26.field1551) / 2;
					var26.method492((104 - arg0 - var25.field1629) * 4 + 48 + var28, arg2 * 4 + 48 + var27, -488);
				}
			} else if (var23 == 9) {
				int var29 = 15658734;
				if (var20 > 0) {
					var29 = 15597568;
				}
				int[] var30 = this.field418.field685;
				int var31 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
				if (var22 == 0 || var22 == 2) {
					var30[var31 + 1536] = var29;
					var30[var31 + 1024 + 1] = var29;
					var30[var31 + 512 + 2] = var29;
					var30[var31 + 3] = var29;
				} else {
					var30[var31] = var29;
					var30[var31 + 512 + 1] = var29;
					var30[var31 + 1024 + 2] = var29;
					var30[var31 + 1536 + 3] = var29;
				}
			}
		}
		int var32 = this.field460.method303(arg1, arg2, arg0);
		if (var32 == 0) {
			return;
		}
		int var33 = var32 >> 14 & 0x7FFF;
		LocType var34 = LocType.method561(var33);
		if (var34.field1649 == -1) {
			return;
		}
		Pix8 var35 = this.field449[var34.field1649];
		if (var35 != null) {
			int var36 = (var34.field1655 * 4 - var35.field1550) / 2;
			int var37 = (var34.field1629 * 4 - var35.field1551) / 2;
			var35.method492((104 - arg0 - var34.field1629) * 4 + 48 + var37, arg2 * 4 + 48 + var36, -488);
			return;
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method178(int arg0) {
		this.field434++;
		this.method143(0, true);
		this.method77(751, true);
		this.method143(0, false);
		this.method77(751, false);
		this.method71(false);
		this.method98(-992);
		if (!this.field507) {
			int var2 = this.field547;
			if (this.field585 / 256 > var2) {
				var2 = this.field585 / 256;
			}
			if (this.field223[4] && this.field148[4] + 128 > var2) {
				var2 = this.field148[4] + 128;
			}
			int var3 = this.field551 + this.field548 & 0x7FF;
			this.method117(this.method133(field463.field1158, field463.field1157, (byte) 9, this.field387) - 50, this.field558, var2, var2 * 3 + 600, var3, this.field559, (byte) -103);
		}
		int var4;
		if (this.field507) {
			var4 = this.method141(-276);
		} else {
			var4 = this.method140((byte) 1);
		}
		int var5 = this.field512;
		int var6 = this.field513;
		int var7 = this.field514;
		int var8 = this.field515;
		int var9 = this.field516;
		if (arg0 != 2) {
			this.field300 = this.field195.method329();
		}
		for (int var10 = 0; var10 < 5; var10++) {
			if (this.field223[var10]) {
				int var12 = (int) (Math.random() * (double) (this.field401[var10] * 2 + 1) - (double) this.field401[var10] + Math.sin((double) this.field287[var10] / 100.0D * (double) this.field441[var10]) * (double) this.field148[var10]);
				if (var10 == 0) {
					this.field512 += var12;
				}
				if (var10 == 1) {
					this.field513 += var12;
				}
				if (var10 == 2) {
					this.field514 += var12;
				}
				if (var10 == 3) {
					this.field516 = this.field516 + var12 & 0x7FF;
				}
				if (var10 == 4) {
					this.field515 += var12;
					if (this.field515 < 128) {
						this.field515 = 128;
					}
					if (this.field515 > 383) {
						this.field515 = 383;
					}
				}
			}
		}
		int var11 = Pix3D.field1609;
		Model.field1252 = true;
		Model.field1255 = 0;
		Model.field1253 = super.field959 - 4;
		Model.field1254 = super.field960 - 4;
		Pix2D.method335(4);
		this.field460.method313(this.field512, var4, 0, this.field513, this.field514, this.field516, this.field515);
		this.field460.method288(this.field193);
		this.method145(false);
		this.method151(true);
		this.method87(var11, -927);
		this.method132(30729);
		this.field454.method241(4, 4, super.field951, this.field370);
		this.field512 = var5;
		this.field513 = var6;
		this.field514 = var7;
		this.field515 = var8;
		this.field516 = var9;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method179(int arg0) {
		if (arg0 != -23763) {
			this.method86();
		}
		for (int var2 = 0; var2 < this.field331; var2++) {
			if (this.field555[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.field386[var2] != this.field568 || this.field617[var2] != this.field231) {
						Packet var4 = Wave.method479(this.field617[var2], (byte) 6, this.field386[var2]);
						if (System.currentTimeMillis() + (long) (var4.pos / 22) > (long) (this.field475 / 22) + this.field546) {
							this.field475 = var4.pos;
							this.field546 = System.currentTimeMillis();
							if (this.method139(3, var4.pos, var4.data)) {
								this.field568 = this.field386[var2];
								this.field231 = this.field617[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!this.method100(295)) {
						var3 = true;
					}
				} catch (Exception var7) {
					if (signlink.reporterror) {
						// todo: reporting synth error
						this.field260.p1isaac((byte) 4, 80);
						this.field260.p2(this.field386[var2] & 0x7FFF);
					} else {
						// todo: reporting synth error
						this.field260.p1isaac((byte) 4, 80);
						this.field260.p2(-1);
					}
				}
				if (var3 && this.field555[var2] != -5) {
					this.field555[var2] = -5;
				} else {
					this.field331--;
					for (int var6 = var2; var6 < this.field331; var6++) {
						this.field386[var6] = this.field386[var6 + 1];
						this.field617[var6] = this.field617[var6 + 1];
						this.field555[var6] = this.field555[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = this.field555[var2]--;
			}
		}
		if (this.field424 <= 0) {
			return;
		}
		this.field424 -= 20;
		if (this.field424 < 0) {
			this.field424 = 0;
		}
		if (this.field424 == 0 && this.field562 && !field222) {
			this.field566 = this.field623;
			this.field567 = true;
			this.field587.method586(2, this.field566);
			return;
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var4 = var1 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var0 += var5;
			field248[var1] = var0 / 4;
		}
		field259 = true;
		field303 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field304 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		field321 = -352;
		field486 = true;
		field510 = new int[32];
		int var2 = 2;
		for (int var3 = 0; var3 < 32; var3++) {
			field510[var3] = var2 - 1;
			var2 += var2;
		}
		field538 = true;
		field564 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		field612 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}
}
