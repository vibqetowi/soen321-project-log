package d9;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import c9.w;
import com.appsflyer.R;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import com.theinnerhour.b2b.utils.Constants;
import d9.e;
import d9.l;
import d9.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o7.v;
/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes.dex */
public final class g extends MediaCodecRenderer {
    public static final int[] H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean I1;
    public static boolean J1;
    public int A1;
    public float B1;
    public q C1;
    public boolean D1;
    public int E1;
    public b F1;
    public j G1;
    public final Context Y0;
    public final l Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final o.a f12644a1;
    public final long b1;

    /* renamed from: c1  reason: collision with root package name */
    public final int f12645c1;

    /* renamed from: d1  reason: collision with root package name */
    public final boolean f12646d1;

    /* renamed from: e1  reason: collision with root package name */
    public a f12647e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f12648f1;
    public boolean g1;

    /* renamed from: h1  reason: collision with root package name */
    public Surface f12649h1;

    /* renamed from: i1  reason: collision with root package name */
    public d f12650i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f12651j1;

    /* renamed from: k1  reason: collision with root package name */
    public int f12652k1;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f12653l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f12654m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f12655n1;

    /* renamed from: o1  reason: collision with root package name */
    public long f12656o1;

    /* renamed from: p1  reason: collision with root package name */
    public long f12657p1;
    public long q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f12658r1;

    /* renamed from: s1  reason: collision with root package name */
    public int f12659s1;
    public int t1;

    /* renamed from: u1  reason: collision with root package name */
    public long f12660u1;

    /* renamed from: v1  reason: collision with root package name */
    public long f12661v1;
    public long w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f12662x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f12663y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f12664z1;

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12665a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12666b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12667c;

        public a(int i6, int i10, int i11) {
            this.f12665a = i6;
            this.f12666b = i10;
            this.f12667c = i11;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes.dex */
    public final class b implements c.InterfaceC0137c, Handler.Callback {

        /* renamed from: u  reason: collision with root package name */
        public final Handler f12668u;

        public b(com.google.android.exoplayer2.mediacodec.c cVar) {
            Handler j10 = w.j(this);
            this.f12668u = j10;
            cVar.i(this, j10);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i6 = message.arg1;
            int i10 = message.arg2;
            int i11 = w.f5205a;
            long j10 = ((i6 & 4294967295L) << 32) | (4294967295L & i10);
            g gVar = g.this;
            if (this == gVar.F1) {
                if (j10 == Long.MAX_VALUE) {
                    gVar.R0 = true;
                } else {
                    try {
                        gVar.u0(j10);
                        gVar.D0();
                        gVar.T0.getClass();
                        gVar.C0();
                        gVar.e0(j10);
                    } catch (ExoPlaybackException e10) {
                        gVar.S0 = e10;
                    }
                }
            }
            return true;
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.b bVar, Handler handler, a0.a aVar) {
        super(2, bVar, 30.0f);
        this.b1 = 5000L;
        this.f12645c1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.Y0 = applicationContext;
        this.Z0 = new l(applicationContext);
        this.f12644a1 = new o.a(handler, aVar);
        this.f12646d1 = "NVIDIA".equals(w.f5207c);
        this.f12657p1 = -9223372036854775807L;
        this.f12663y1 = -1;
        this.f12664z1 = -1;
        this.B1 = -1.0f;
        this.f12652k1 = 1;
        this.E1 = 0;
        this.C1 = null;
    }

    public static int A0(com.google.android.exoplayer2.n nVar, com.google.android.exoplayer2.mediacodec.d dVar) {
        if (nVar.G != -1) {
            List<byte[]> list = nVar.H;
            int size = list.size();
            int i6 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i6 += list.get(i10).length;
            }
            return nVar.G + i6;
        }
        return y0(nVar, dVar);
    }

    public static boolean w0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!I1) {
                J1 = x0();
                I1 = true;
            }
        }
        return J1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07cf, code lost:
        if (r0.equals("NX573J") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0831, code lost:
        if (r0.equals("AFTN") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x0() {
        char c10;
        int i6 = w.f5205a;
        char c11 = 6;
        char c12 = 2;
        if (i6 <= 28) {
            String str = w.f5206b;
            str.getClass();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return true;
            }
        }
        if (i6 <= 27 && "HWEML".equals(w.f5206b)) {
            return true;
        }
        if (i6 <= 26) {
            String str2 = w.f5206b;
            str2.getClass();
            switch (str2.hashCode()) {
                case -2144781245:
                    if (str2.equals("GIONEE_SWW1609")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2144781185:
                    if (str2.equals("GIONEE_SWW1627")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2144781160:
                    if (str2.equals("GIONEE_SWW1631")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2097309513:
                    if (str2.equals("K50a40")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2022874474:
                    if (str2.equals("CP8676_I02")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1978993182:
                    if (str2.equals("NX541J")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1978990237:
                    break;
                case -1936688988:
                    if (str2.equals("PGN528")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1936688066:
                    if (str2.equals("PGN610")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1936688065:
                    if (str2.equals("PGN611")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1931988508:
                    if (str2.equals("AquaPowerM")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1885099851:
                    if (str2.equals("RAIJIN")) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1696512866:
                    if (str2.equals("XT1663")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1680025915:
                    if (str2.equals("ComioS1")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1615810839:
                    if (str2.equals("Phantom6")) {
                        c11 = 14;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1600724499:
                    if (str2.equals("pacificrim")) {
                        c11 = 15;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1554255044:
                    if (str2.equals("vernee_M5")) {
                        c11 = 16;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1481772737:
                    if (str2.equals("panell_dl")) {
                        c11 = 17;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1481772730:
                    if (str2.equals("panell_ds")) {
                        c11 = 18;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1481772729:
                    if (str2.equals("panell_dt")) {
                        c11 = 19;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1320080169:
                    if (str2.equals("GiONEE_GBL7319")) {
                        c11 = 20;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1217592143:
                    if (str2.equals("BRAVIA_ATV2")) {
                        c11 = 21;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1180384755:
                    if (str2.equals("iris60")) {
                        c11 = 22;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1139198265:
                    if (str2.equals("Slate_Pro")) {
                        c11 = 23;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1052835013:
                    if (str2.equals("namath")) {
                        c11 = 24;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -993250464:
                    if (str2.equals("A10-70F")) {
                        c11 = 25;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -993250458:
                    if (str2.equals("A10-70L")) {
                        c11 = 26;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -965403638:
                    if (str2.equals("s905x018")) {
                        c11 = 27;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -958336948:
                    if (str2.equals("ELUGA_Ray_X")) {
                        c11 = 28;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -879245230:
                    if (str2.equals("tcl_eu")) {
                        c11 = 29;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -842500323:
                    if (str2.equals("nicklaus_f")) {
                        c11 = 30;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -821392978:
                    if (str2.equals("A7000-a")) {
                        c11 = 31;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -797483286:
                    if (str2.equals("SVP-DTV15")) {
                        c11 = ' ';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -794946968:
                    if (str2.equals("watson")) {
                        c11 = '!';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -788334647:
                    if (str2.equals("whyred")) {
                        c11 = '\"';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -782144577:
                    if (str2.equals("OnePlus5T")) {
                        c11 = '#';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -575125681:
                    if (str2.equals("GiONEE_CBL7513")) {
                        c11 = '$';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -521118391:
                    if (str2.equals("GIONEE_GBL7360")) {
                        c11 = '%';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -430914369:
                    if (str2.equals("Pixi4-7_3G")) {
                        c11 = '&';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -290434366:
                    if (str2.equals("taido_row")) {
                        c11 = '\'';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -282781963:
                    if (str2.equals("BLACK-1X")) {
                        c11 = '(';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -277133239:
                    if (str2.equals("Z12_PRO")) {
                        c11 = ')';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -173639913:
                    if (str2.equals("ELUGA_A3_Pro")) {
                        c11 = '*';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -56598463:
                    if (str2.equals("woods_fn")) {
                        c11 = '+';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2126:
                    if (str2.equals("C1")) {
                        c11 = ',';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2564:
                    if (str2.equals("Q5")) {
                        c11 = '-';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2715:
                    if (str2.equals("V1")) {
                        c11 = '.';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2719:
                    if (str2.equals("V5")) {
                        c11 = '/';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3091:
                    if (str2.equals("b5")) {
                        c11 = '0';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3483:
                    if (str2.equals("mh")) {
                        c11 = '1';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 73405:
                    if (str2.equals("JGZ")) {
                        c11 = '2';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 75537:
                    if (str2.equals("M04")) {
                        c11 = '3';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 75739:
                    if (str2.equals("M5c")) {
                        c11 = '4';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 76779:
                    if (str2.equals("MX6")) {
                        c11 = '5';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 78669:
                    if (str2.equals("P85")) {
                        c11 = '6';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 79305:
                    if (str2.equals("PLE")) {
                        c11 = '7';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 80618:
                    if (str2.equals("QX1")) {
                        c11 = '8';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 88274:
                    if (str2.equals("Z80")) {
                        c11 = '9';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 98846:
                    if (str2.equals("cv1")) {
                        c11 = ':';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 98848:
                    if (str2.equals("cv3")) {
                        c11 = ';';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 99329:
                    if (str2.equals("deb")) {
                        c11 = '<';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 101481:
                    if (str2.equals("flo")) {
                        c11 = '=';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1513190:
                    if (str2.equals("1601")) {
                        c11 = '>';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1514184:
                    if (str2.equals("1713")) {
                        c11 = '?';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1514185:
                    if (str2.equals("1714")) {
                        c11 = '@';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133089:
                    if (str2.equals("F01H")) {
                        c11 = 'A';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133091:
                    if (str2.equals("F01J")) {
                        c11 = 'B';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133120:
                    if (str2.equals("F02H")) {
                        c11 = 'C';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133151:
                    if (str2.equals("F03H")) {
                        c11 = 'D';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133182:
                    if (str2.equals("F04H")) {
                        c11 = 'E';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2133184:
                    if (str2.equals("F04J")) {
                        c11 = 'F';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2436959:
                    if (str2.equals("P681")) {
                        c11 = 'G';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2463773:
                    if (str2.equals("Q350")) {
                        c11 = 'H';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2464648:
                    if (str2.equals("Q427")) {
                        c11 = 'I';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2689555:
                    if (str2.equals("XE2X")) {
                        c11 = 'J';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3154429:
                    if (str2.equals("fugu")) {
                        c11 = 'K';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3284551:
                    if (str2.equals("kate")) {
                        c11 = 'L';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3351335:
                    if (str2.equals("mido")) {
                        c11 = 'M';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3386211:
                    if (str2.equals("p212")) {
                        c11 = 'N';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 41325051:
                    if (str2.equals("MEIZU_M5")) {
                        c11 = 'O';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 51349633:
                    if (str2.equals("601LV")) {
                        c11 = 'P';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 51350594:
                    if (str2.equals("602LV")) {
                        c11 = 'Q';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 55178625:
                    if (str2.equals("Aura_Note_2")) {
                        c11 = 'R';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 61542055:
                    if (str2.equals("A1601")) {
                        c11 = 'S';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 65355429:
                    if (str2.equals("E5643")) {
                        c11 = 'T';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66214468:
                    if (str2.equals("F3111")) {
                        c11 = 'U';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66214470:
                    if (str2.equals("F3113")) {
                        c11 = 'V';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66214473:
                    if (str2.equals("F3116")) {
                        c11 = 'W';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66215429:
                    if (str2.equals("F3211")) {
                        c11 = 'X';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66215431:
                    if (str2.equals("F3213")) {
                        c11 = 'Y';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66215433:
                    if (str2.equals("F3215")) {
                        c11 = 'Z';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 66216390:
                    if (str2.equals("F3311")) {
                        c11 = '[';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 76402249:
                    if (str2.equals("PRO7S")) {
                        c11 = '\\';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 76404105:
                    if (str2.equals("Q4260")) {
                        c11 = ']';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 76404911:
                    if (str2.equals("Q4310")) {
                        c11 = '^';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 80963634:
                    if (str2.equals("V23GB")) {
                        c11 = '_';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 82882791:
                    if (str2.equals("X3_HK")) {
                        c11 = '`';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 98715550:
                    if (str2.equals("i9031")) {
                        c11 = 'a';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 101370885:
                    if (str2.equals("l5460")) {
                        c11 = 'b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 102844228:
                    if (str2.equals("le_x6")) {
                        c11 = 'c';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 165221241:
                    if (str2.equals("A2016a40")) {
                        c11 = 'd';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 182191441:
                    if (str2.equals("CPY83_I00")) {
                        c11 = 'e';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 245388979:
                    if (str2.equals("marino_f")) {
                        c11 = 'f';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 287431619:
                    if (str2.equals("griffin")) {
                        c11 = 'g';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 307593612:
                    if (str2.equals("A7010a48")) {
                        c11 = 'h';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 308517133:
                    if (str2.equals("A7020a48")) {
                        c11 = 'i';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 316215098:
                    if (str2.equals("TB3-730F")) {
                        c11 = 'j';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 316215116:
                    if (str2.equals("TB3-730X")) {
                        c11 = 'k';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 316246811:
                    if (str2.equals("TB3-850F")) {
                        c11 = 'l';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 316246818:
                    if (str2.equals("TB3-850M")) {
                        c11 = 'm';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 407160593:
                    if (str2.equals("Pixi5-10_4G")) {
                        c11 = 'n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 507412548:
                    if (str2.equals("QM16XE_U")) {
                        c11 = 'o';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 793982701:
                    if (str2.equals("GIONEE_WBL5708")) {
                        c11 = 'p';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 794038622:
                    if (str2.equals("GIONEE_WBL7365")) {
                        c11 = 'q';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 794040393:
                    if (str2.equals("GIONEE_WBL7519")) {
                        c11 = 'r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 835649806:
                    if (str2.equals("manning")) {
                        c11 = 's';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 917340916:
                    if (str2.equals("A7000plus")) {
                        c11 = 't';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 958008161:
                    if (str2.equals("j2xlteins")) {
                        c11 = 'u';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1060579533:
                    if (str2.equals("panell_d")) {
                        c11 = 'v';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1150207623:
                    if (str2.equals("LS-5017")) {
                        c11 = 'w';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1176899427:
                    if (str2.equals("itel_S41")) {
                        c11 = 'x';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1280332038:
                    if (str2.equals("hwALE-H")) {
                        c11 = 'y';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1306947716:
                    if (str2.equals("EverStar_S")) {
                        c11 = 'z';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1349174697:
                    if (str2.equals("htc_e56ml_dtul")) {
                        c11 = '{';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1522194893:
                    if (str2.equals("woods_f")) {
                        c11 = '|';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1691543273:
                    if (str2.equals("CPH1609")) {
                        c11 = '}';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1691544261:
                    if (str2.equals("CPH1715")) {
                        c11 = '~';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1709443163:
                    if (str2.equals("iball8735_9806")) {
                        c11 = 127;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1865889110:
                    if (str2.equals("santoni")) {
                        c11 = 128;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1906253259:
                    if (str2.equals("PB2-670M")) {
                        c11 = 129;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1977196784:
                    if (str2.equals("Infinix-X572")) {
                        c11 = 130;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2006372676:
                    if (str2.equals("BRAVIA_ATV3_4K")) {
                        c11 = 131;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2019281702:
                    if (str2.equals("DM-01K")) {
                        c11 = 132;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2029784656:
                    if (str2.equals("HWBLN-H")) {
                        c11 = 133;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2030379515:
                    if (str2.equals("HWCAM-H")) {
                        c11 = 134;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2033393791:
                    if (str2.equals("ASUS_X00AD_2")) {
                        c11 = 135;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2047190025:
                    if (str2.equals("ELUGA_Note")) {
                        c11 = 136;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2047252157:
                    if (str2.equals("ELUGA_Prim")) {
                        c11 = 137;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2048319463:
                    if (str2.equals("HWVNS-H")) {
                        c11 = 138;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2048855701:
                    if (str2.equals("HWWAS-H")) {
                        c11 = 139;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case ' ':
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case '$':
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case '2':
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                case 'V':
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                case 'Z':
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                case 'c':
                case 'd':
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                    break;
                default:
                    String str3 = w.f5208d;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -594534941:
                            if (str3.equals("JSN-L21")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 2006367:
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                    }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r4.equals("video/hevc") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y0(com.google.android.exoplayer2.n nVar, com.google.android.exoplayer2.mediacodec.d dVar) {
        int i6;
        int i10;
        int intValue;
        int i11 = nVar.K;
        if (i11 == -1 || (i6 = nVar.L) == -1) {
            return -1;
        }
        String str = nVar.F;
        char c10 = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> c11 = MediaCodecUtil.c(nVar);
            if (c11 != null && ((intValue = ((Integer) c11.first).intValue()) == 512 || intValue == 1 || intValue == 2)) {
                str = "video/avc";
            } else {
                str = "video/hevc";
            }
        }
        str.getClass();
        int i12 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 2:
            case 4:
                i10 = i11 * i6;
                i12 = 2;
                break;
            case 1:
            case 5:
                i10 = i11 * i6;
                break;
            case 3:
                String str2 = w.f5208d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(w.f5207c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && dVar.f)))) {
                    return -1;
                }
                i10 = (((i6 + 16) - 1) / 16) * (((i11 + 16) - 1) / 16) * 16 * 16;
                i12 = 2;
                break;
            default:
                return -1;
        }
        return (i10 * 3) / (i12 * 2);
    }

    public static List<com.google.android.exoplayer2.mediacodec.d> z0(com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.n nVar, boolean z10, boolean z11) {
        Pair<Integer, Integer> c10;
        String str = nVar.F;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.d> a10 = eVar.a(str, z10, z11);
        Pattern pattern = MediaCodecUtil.f6618a;
        ArrayList arrayList = new ArrayList(a10);
        Collections.sort(arrayList, new f8.j(0, new f8.i(nVar)));
        if ("video/dolby-vision".equals(str) && (c10 = MediaCodecUtil.c(nVar)) != null) {
            int intValue = ((Integer) c10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    arrayList.addAll(eVar.a("video/avc", z10, z11));
                }
            } else {
                arrayList.addAll(eVar.a("video/hevc", z10, z11));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public final void A(boolean z10, long j10) {
        super.A(z10, j10);
        v0();
        l lVar = this.Z0;
        lVar.f12689m = 0L;
        lVar.f12692p = -1L;
        lVar.f12690n = -1L;
        long j11 = -9223372036854775807L;
        this.f12660u1 = -9223372036854775807L;
        this.f12656o1 = -9223372036854775807L;
        this.f12659s1 = 0;
        if (z10) {
            long j12 = this.b1;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f12657p1 = j11;
            return;
        }
        this.f12657p1 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public final void B() {
        try {
            J();
            k0();
            DrmSession drmSession = this.W;
            if (drmSession != null) {
                drmSession.b(null);
            }
            this.W = null;
        } finally {
            d dVar = this.f12650i1;
            if (dVar != null) {
                if (this.f12649h1 == dVar) {
                    this.f12649h1 = null;
                }
                dVar.release();
                this.f12650i1 = null;
            }
        }
    }

    public final void B0() {
        if (this.f12658r1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.q1;
            int i6 = this.f12658r1;
            o.a aVar = this.f12644a1;
            Handler handler = aVar.f12709a;
            if (handler != null) {
                handler.post(new n(aVar, i6, j10));
            }
            this.f12658r1 = 0;
            this.q1 = elapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void C() {
        this.f12658r1 = 0;
        this.q1 = SystemClock.elapsedRealtime();
        this.f12661v1 = SystemClock.elapsedRealtime() * 1000;
        this.w1 = 0L;
        this.f12662x1 = 0;
        l lVar = this.Z0;
        lVar.f12681d = true;
        lVar.f12689m = 0L;
        lVar.f12692p = -1L;
        lVar.f12690n = -1L;
        lVar.c(false);
    }

    public final void C0() {
        this.f12655n1 = true;
        if (!this.f12653l1) {
            this.f12653l1 = true;
            Surface surface = this.f12649h1;
            o.a aVar = this.f12644a1;
            Handler handler = aVar.f12709a;
            if (handler != null) {
                handler.post(new q5.b(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f12651j1 = true;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void D() {
        this.f12657p1 = -9223372036854775807L;
        B0();
        int i6 = this.f12662x1;
        if (i6 != 0) {
            long j10 = this.w1;
            o.a aVar = this.f12644a1;
            Handler handler = aVar.f12709a;
            if (handler != null) {
                handler.post(new n(aVar, j10, i6));
            }
            this.w1 = 0L;
            this.f12662x1 = 0;
        }
        l lVar = this.Z0;
        lVar.f12681d = false;
        lVar.a();
    }

    public final void D0() {
        int i6 = this.f12663y1;
        if (i6 != -1 || this.f12664z1 != -1) {
            q qVar = this.C1;
            if (qVar == null || qVar.f12713u != i6 || qVar.f12714v != this.f12664z1 || qVar.f12715w != this.A1 || qVar.f12716x != this.B1) {
                q qVar2 = new q(this.B1, i6, this.f12664z1, this.A1);
                this.C1 = qVar2;
                o.a aVar = this.f12644a1;
                Handler handler = aVar.f12709a;
                if (handler != null) {
                    handler.post(new q7.f(aVar, 7, qVar2));
                }
            }
        }
    }

    public final void E0(com.google.android.exoplayer2.mediacodec.c cVar, int i6) {
        D0();
        kc.f.j("releaseOutputBuffer");
        cVar.j(i6, true);
        kc.f.B();
        this.f12661v1 = SystemClock.elapsedRealtime() * 1000;
        this.T0.getClass();
        this.f12659s1 = 0;
        C0();
    }

    public final void F0(com.google.android.exoplayer2.mediacodec.c cVar, int i6, long j10) {
        D0();
        kc.f.j("releaseOutputBuffer");
        cVar.e(i6, j10);
        kc.f.B();
        this.f12661v1 = SystemClock.elapsedRealtime() * 1000;
        this.T0.getClass();
        this.f12659s1 = 0;
        C0();
    }

    public final boolean G0(com.google.android.exoplayer2.mediacodec.d dVar) {
        if (w.f5205a >= 23 && !this.D1 && !w0(dVar.f6638a) && (!dVar.f || d.b(this.Y0))) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final r7.f H(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.n nVar, com.google.android.exoplayer2.n nVar2) {
        int i6;
        r7.f b10 = dVar.b(nVar, nVar2);
        a aVar = this.f12647e1;
        int i10 = aVar.f12665a;
        int i11 = nVar2.K;
        int i12 = b10.f30545e;
        if (i11 > i10 || nVar2.L > aVar.f12666b) {
            i12 |= 256;
        }
        if (A0(nVar2, dVar) > this.f12647e1.f12667c) {
            i12 |= 64;
        }
        int i13 = i12;
        String str = dVar.f6638a;
        if (i13 != 0) {
            i6 = 0;
        } else {
            i6 = b10.f30544d;
        }
        return new r7.f(str, nVar, nVar2, i6, i13);
    }

    public final void H0(com.google.android.exoplayer2.mediacodec.c cVar, int i6) {
        kc.f.j("skipVideoBuffer");
        cVar.j(i6, false);
        kc.f.B();
        this.T0.getClass();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException I(IllegalStateException illegalStateException, com.google.android.exoplayer2.mediacodec.d dVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, dVar, this.f12649h1);
    }

    public final void I0(int i6) {
        le leVar = this.T0;
        leVar.getClass();
        this.f12658r1 += i6;
        int i10 = this.f12659s1 + i6;
        this.f12659s1 = i10;
        leVar.f7969a = Math.max(i10, leVar.f7969a);
        int i11 = this.f12645c1;
        if (i11 > 0 && this.f12658r1 >= i11) {
            B0();
        }
    }

    public final void J0(long j10) {
        this.T0.getClass();
        this.w1 += j10;
        this.f12662x1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean Q() {
        if (this.D1 && w.f5205a < 23) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float R(float f, com.google.android.exoplayer2.n[] nVarArr) {
        float f2 = -1.0f;
        for (com.google.android.exoplayer2.n nVar : nVarArr) {
            float f10 = nVar.M;
            if (f10 != -1.0f) {
                f2 = Math.max(f2, f10);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final List<com.google.android.exoplayer2.mediacodec.d> S(com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.n nVar, boolean z10) {
        return z0(eVar, nVar, z10, this.D1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final c.a U(com.google.android.exoplayer2.mediacodec.d dVar, com.google.android.exoplayer2.n nVar, MediaCrypto mediaCrypto, float f) {
        String str;
        int i6;
        int i10;
        d9.b bVar;
        a aVar;
        boolean z10;
        int i11;
        int i12;
        Point point;
        float f2;
        int i13;
        int i14;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        Pair<Integer, Integer> c10;
        int y02;
        d dVar2 = this.f12650i1;
        if (dVar2 != null && dVar2.f12620u != dVar.f) {
            if (this.f12649h1 == dVar2) {
                this.f12649h1 = null;
            }
            dVar2.release();
            this.f12650i1 = null;
        }
        String str2 = dVar.f6640c;
        com.google.android.exoplayer2.n[] nVarArr = this.A;
        nVarArr.getClass();
        int i17 = nVar.K;
        int A0 = A0(nVar, dVar);
        int length = nVarArr.length;
        float f10 = nVar.M;
        int i18 = nVar.K;
        d9.b bVar2 = nVar.R;
        int i19 = nVar.L;
        if (length == 1) {
            if (A0 != -1 && (y02 = y0(nVar, dVar)) != -1) {
                A0 = Math.min((int) (A0 * 1.5f), y02);
            }
            aVar = new a(i17, i19, A0);
            str = str2;
            i6 = i19;
            i10 = i18;
            bVar = bVar2;
        } else {
            int length2 = nVarArr.length;
            int i20 = i19;
            int i21 = 0;
            boolean z13 = false;
            while (i21 < length2) {
                com.google.android.exoplayer2.n nVar2 = nVarArr[i21];
                com.google.android.exoplayer2.n[] nVarArr2 = nVarArr;
                if (bVar2 != null && nVar2.R == null) {
                    n.a aVar2 = new n.a(nVar2);
                    aVar2.f6676w = bVar2;
                    nVar2 = new com.google.android.exoplayer2.n(aVar2);
                }
                if (dVar.b(nVar, nVar2).f30544d != 0) {
                    int i22 = nVar2.L;
                    i15 = length2;
                    int i23 = nVar2.K;
                    if (i23 != -1 && i22 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    int max = Math.max(i17, i23);
                    i20 = Math.max(i20, i22);
                    i17 = max;
                    A0 = Math.max(A0, A0(nVar2, dVar));
                } else {
                    i15 = length2;
                }
                i21++;
                nVarArr = nVarArr2;
                length2 = i15;
            }
            if (z13) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(i17);
                sb2.append("x");
                sb2.append(i20);
                Log.w("MediaCodecVideoRenderer", sb2.toString());
                if (i19 > i18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = i19;
                } else {
                    i11 = i18;
                }
                if (z10) {
                    i12 = i18;
                } else {
                    i12 = i19;
                }
                bVar = bVar2;
                i6 = i19;
                float f11 = i12 / i11;
                int[] iArr = H1;
                str = str2;
                i10 = i18;
                int i24 = 0;
                while (i24 < 9) {
                    int i25 = iArr[i24];
                    int[] iArr2 = iArr;
                    int i26 = (int) (i25 * f11);
                    if (i25 <= i11 || i26 <= i12) {
                        break;
                    }
                    int i27 = i11;
                    int i28 = i12;
                    if (w.f5205a >= 21) {
                        if (z10) {
                            i14 = i26;
                        } else {
                            i14 = i25;
                        }
                        if (!z10) {
                            i25 = i26;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f6641d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f2 = f11;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f2 = f11;
                            point2 = new Point((((i14 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i25 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (dVar.e(point2.x, f10, point2.y)) {
                            point = point2;
                            break;
                        }
                        i24++;
                        iArr = iArr2;
                        i11 = i27;
                        i12 = i28;
                        f11 = f2;
                    } else {
                        f2 = f11;
                        try {
                            int i29 = (((i25 + 16) - 1) / 16) * 16;
                            int i30 = (((i26 + 16) - 1) / 16) * 16;
                            if (i29 * i30 <= MediaCodecUtil.h()) {
                                if (z10) {
                                    i13 = i30;
                                } else {
                                    i13 = i29;
                                }
                                if (!z10) {
                                    i29 = i30;
                                }
                                point = new Point(i13, i29);
                            } else {
                                i24++;
                                iArr = iArr2;
                                i11 = i27;
                                i12 = i28;
                                f11 = f2;
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i17 = Math.max(i17, point.x);
                    i20 = Math.max(i20, point.y);
                    n.a aVar3 = new n.a(nVar);
                    aVar3.f6670p = i17;
                    aVar3.f6671q = i20;
                    A0 = Math.max(A0, y0(new com.google.android.exoplayer2.n(aVar3), dVar));
                    StringBuilder sb3 = new StringBuilder(57);
                    sb3.append("Codec max resolution adjusted to: ");
                    sb3.append(i17);
                    sb3.append("x");
                    sb3.append(i20);
                    Log.w("MediaCodecVideoRenderer", sb3.toString());
                }
            } else {
                str = str2;
                i6 = i19;
                i10 = i18;
                bVar = bVar2;
            }
            aVar = new a(i17, i20, A0);
        }
        this.f12647e1 = aVar;
        if (this.D1) {
            i16 = this.E1;
        } else {
            i16 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i6);
        sc.b.e0(mediaFormat, nVar.H);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        sc.b.T(mediaFormat, "rotation-degrees", nVar.N);
        if (bVar != null) {
            d9.b bVar3 = bVar;
            sc.b.T(mediaFormat, "color-transfer", bVar3.f12611w);
            sc.b.T(mediaFormat, "color-standard", bVar3.f12609u);
            sc.b.T(mediaFormat, "color-range", bVar3.f12610v);
            byte[] bArr = bVar3.f12612x;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(nVar.F) && (c10 = MediaCodecUtil.c(nVar)) != null) {
            sc.b.T(mediaFormat, Constants.SCREEN_PROFILE, ((Integer) c10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f12665a);
        mediaFormat.setInteger("max-height", aVar.f12666b);
        sc.b.T(mediaFormat, "max-input-size", aVar.f12667c);
        if (w.f5205a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f12646d1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f12649h1 == null) {
            if (G0(dVar)) {
                if (this.f12650i1 == null) {
                    this.f12650i1 = d.c(dVar.f, this.Y0);
                }
                this.f12649h1 = this.f12650i1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new c.a(dVar, mediaFormat, nVar, this.f12649h1, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void V(DecoderInputBuffer decoderInputBuffer) {
        if (!this.g1) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f6363z;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s10 = byteBuffer.getShort();
            short s11 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                com.google.android.exoplayer2.mediacodec.c cVar = this.c0;
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                cVar.d(bundle);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Z(Exception exc) {
        ca.a.Q("MediaCodecVideoRenderer", "Video codec error", exc);
        o.a aVar = this.f12644a1;
        Handler handler = aVar.f12709a;
        if (handler != null) {
            handler.post(new q7.f(aVar, 8, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void a0(long j10, String str, long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        o.a aVar = this.f12644a1;
        Handler handler = aVar.f12709a;
        if (handler != null) {
            handler.post(new q7.j(aVar, str, j10, j11, 1));
        }
        this.f12648f1 = w0(str);
        com.google.android.exoplayer2.mediacodec.d dVar = this.f6597j0;
        dVar.getClass();
        boolean z10 = false;
        if (w.f5205a >= 29 && "video/x-vnd.on2.vp9".equals(dVar.f6639b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f6641d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                } else if (codecProfileLevelArr[i6].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.g1 = z10;
        if (w.f5205a >= 23 && this.D1) {
            com.google.android.exoplayer2.mediacodec.c cVar = this.c0;
            cVar.getClass();
            this.F1 = new b(cVar);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void b0(String str) {
        o.a aVar = this.f12644a1;
        Handler handler = aVar.f12709a;
        if (handler != null) {
            handler.post(new q7.f(aVar, 6, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final r7.f c0(androidx.appcompat.widget.l lVar) {
        r7.f c0 = super.c0(lVar);
        com.google.android.exoplayer2.n nVar = (com.google.android.exoplayer2.n) lVar.f1472w;
        o.a aVar = this.f12644a1;
        Handler handler = aVar.f12709a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.g(10, aVar, nVar, c0));
        }
        return c0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void d0(com.google.android.exoplayer2.n nVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        com.google.android.exoplayer2.mediacodec.c cVar = this.c0;
        if (cVar != null) {
            cVar.k(this.f12652k1);
        }
        if (this.D1) {
            this.f12663y1 = nVar.K;
            this.f12664z1 = nVar.L;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f12663y1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f12664z1 = integer2;
        }
        float f = nVar.O;
        this.B1 = f;
        int i6 = w.f5205a;
        int i10 = nVar.N;
        if (i6 >= 21) {
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f12663y1;
                this.f12663y1 = this.f12664z1;
                this.f12664z1 = i11;
                this.B1 = 1.0f / f;
            }
        } else {
            this.A1 = i10;
        }
        l lVar = this.Z0;
        lVar.f = nVar.M;
        e eVar = lVar.f12678a;
        eVar.f12628a.c();
        eVar.f12629b.c();
        eVar.f12630c = false;
        eVar.f12631d = -9223372036854775807L;
        eVar.f12632e = 0;
        lVar.b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void e0(long j10) {
        super.e0(j10);
        if (!this.D1) {
            this.t1--;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void f0() {
        v0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void g0(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.D1;
        if (!z10) {
            this.t1++;
        }
        if (w.f5205a < 23 && z10) {
            long j10 = decoderInputBuffer.f6362y;
            u0(j10);
            D0();
            this.T0.getClass();
            C0();
            e0(j10);
        }
    }

    @Override // com.google.android.exoplayer2.z, o7.u
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if ((r11 == 0 ? false : r13.f12638g[(int) ((r11 - 1) % 15)]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r12 > 100000) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(long j10, long j11, com.google.android.exoplayer2.mediacodec.c cVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j12, boolean z10, boolean z11, com.google.android.exoplayer2.n nVar) {
        boolean z12;
        long j13;
        long j14;
        long j15;
        boolean z13;
        boolean z14;
        long j16;
        long j17;
        cVar.getClass();
        if (this.f12656o1 == -9223372036854775807L) {
            this.f12656o1 = j10;
        }
        if (j12 != this.f12660u1) {
            l lVar = this.Z0;
            long j18 = lVar.f12690n;
            if (j18 != -1) {
                lVar.f12692p = j18;
                lVar.f12693q = lVar.f12691o;
            }
            lVar.f12689m++;
            long j19 = j12 * 1000;
            e eVar = lVar.f12678a;
            eVar.f12628a.b(j19);
            if (eVar.f12628a.a()) {
                eVar.f12630c = false;
            } else if (eVar.f12631d != -9223372036854775807L) {
                if (eVar.f12630c) {
                    e.a aVar = eVar.f12629b;
                    long j20 = aVar.f12636d;
                }
                eVar.f12629b.c();
                eVar.f12629b.b(eVar.f12631d);
                eVar.f12630c = true;
                eVar.f12629b.b(j19);
            }
            if (eVar.f12630c && eVar.f12629b.a()) {
                e.a aVar2 = eVar.f12628a;
                eVar.f12628a = eVar.f12629b;
                eVar.f12629b = aVar2;
                eVar.f12630c = false;
            }
            eVar.f12631d = j19;
            eVar.f12632e = eVar.f12628a.a() ? 0 : eVar.f12632e + 1;
            lVar.b();
            this.f12660u1 = j12;
        }
        long j21 = this.V0;
        long j22 = j12 - j21;
        if (z10 && !z11) {
            H0(cVar, i6);
            return true;
        }
        double d10 = this.f6590a0;
        boolean z15 = this.f6462y == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j23 = (long) ((j12 - j10) / d10);
        if (z15) {
            j23 -= elapsedRealtime - j11;
        }
        if (this.f12649h1 == this.f12650i1) {
            if (j23 < -30000) {
                H0(cVar, i6);
                J0(j23);
                return true;
            }
            return false;
        }
        long j24 = elapsedRealtime - this.f12661v1;
        boolean z16 = this.f12655n1 ? !this.f12653l1 : z15 || this.f12654m1;
        if (this.f12657p1 == -9223372036854775807L && j10 >= j21) {
            if (!z16) {
                if (z15) {
                }
            }
            z12 = true;
            if (!z12) {
                long nanoTime = System.nanoTime();
                j jVar = this.G1;
                if (jVar != null) {
                    jVar.d(j22, nanoTime, nVar, this.e0);
                }
                if (w.f5205a >= 21) {
                    F0(cVar, i6, nanoTime);
                } else {
                    E0(cVar, i6);
                }
                J0(j23);
                return true;
            } else if (!z15 || j10 == this.f12656o1) {
                return false;
            } else {
                long nanoTime2 = System.nanoTime();
                long j25 = (j23 * 1000) + nanoTime2;
                l lVar2 = this.Z0;
                if (lVar2.f12692p == -1 || !lVar2.f12678a.a()) {
                    j13 = nanoTime2;
                } else {
                    e eVar2 = lVar2.f12678a;
                    if (eVar2.a()) {
                        e.a aVar3 = eVar2.f12628a;
                        long j26 = aVar3.f12637e;
                        j17 = j26 == 0 ? 0L : aVar3.f / j26;
                    } else {
                        j17 = -9223372036854775807L;
                    }
                    j13 = nanoTime2;
                    long j27 = lVar2.f12693q + (((float) ((lVar2.f12689m - lVar2.f12692p) * j17)) / lVar2.f12685i);
                    if (Math.abs(j25 - j27) <= 20000000) {
                        j25 = j27;
                    } else {
                        lVar2.f12689m = 0L;
                        lVar2.f12692p = -1L;
                        lVar2.f12690n = -1L;
                    }
                }
                lVar2.f12690n = lVar2.f12689m;
                lVar2.f12691o = j25;
                l.e eVar3 = lVar2.f12680c;
                if (eVar3 != null && lVar2.f12687k != -9223372036854775807L) {
                    long j28 = eVar3.f12698u;
                    if (j28 != -9223372036854775807L) {
                        long j29 = lVar2.f12687k;
                        long j30 = (((j25 - j28) / j29) * j29) + j28;
                        if (j25 <= j30) {
                            j16 = j30 - j29;
                        } else {
                            j16 = j30;
                            j30 = j29 + j30;
                        }
                        if (j30 - j25 >= j25 - j16) {
                            j30 = j16;
                        }
                        j14 = j13;
                        j25 = j30 - lVar2.f12688l;
                        j15 = (j25 - j14) / 1000;
                        boolean z17 = this.f12657p1 == -9223372036854775807L;
                        if ((((j15 > (-500000L) ? 1 : (j15 == (-500000L) ? 0 : -1)) >= 0) || z11) ? false : true) {
                            o8.k kVar = this.f6463z;
                            kVar.getClass();
                            int c10 = kVar.c(j10 - this.B);
                            if (c10 == 0) {
                                z14 = false;
                            } else {
                                this.T0.getClass();
                                int i12 = this.t1 + c10;
                                if (!z17) {
                                    I0(i12);
                                }
                                if (O()) {
                                    X();
                                }
                                z14 = true;
                            }
                            if (z14) {
                                return false;
                            }
                        }
                        if (!((((j15 > (-30000L) ? 1 : (j15 == (-30000L) ? 0 : -1)) >= 0) || z11) ? false : true)) {
                            if (z17) {
                                H0(cVar, i6);
                                z13 = true;
                            } else {
                                kc.f.j("dropVideoBuffer");
                                cVar.j(i6, false);
                                kc.f.B();
                                z13 = true;
                                I0(1);
                            }
                            J0(j15);
                            return z13;
                        } else if (w.f5205a >= 21) {
                            if (j15 < 50000) {
                                j jVar2 = this.G1;
                                if (jVar2 != null) {
                                    jVar2.d(j22, j25, nVar, this.e0);
                                }
                                F0(cVar, i6, j25);
                                J0(j15);
                                return true;
                            }
                            return false;
                        } else if (j15 < 30000) {
                            if (j15 > 11000) {
                                try {
                                    Thread.sleep((j15 - 10000) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    return false;
                                }
                            }
                            j jVar3 = this.G1;
                            if (jVar3 != null) {
                                jVar3.d(j22, j25, nVar, this.e0);
                            }
                            E0(cVar, i6);
                            J0(j15);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                j14 = j13;
                j15 = (j25 - j14) / 1000;
                if (this.f12657p1 == -9223372036854775807L) {
                }
                if ((((j15 > (-500000L) ? 1 : (j15 == (-500000L) ? 0 : -1)) >= 0) || z11) ? false : true) {
                }
                if (!((((j15 > (-30000L) ? 1 : (j15 == (-30000L) ? 0 : -1)) >= 0) || z11) ? false : true)) {
                }
            }
        }
        z12 = false;
        if (!z12) {
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z
    public final boolean isReady() {
        d dVar;
        if (super.isReady() && (this.f12653l1 || (((dVar = this.f12650i1) != null && this.f12649h1 == dVar) || this.c0 == null || this.D1))) {
            this.f12657p1 = -9223372036854775807L;
            return true;
        } else if (this.f12657p1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f12657p1) {
                return true;
            }
            this.f12657p1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e, com.google.android.exoplayer2.z
    public final void k(float f, float f2) {
        super.k(f, f2);
        l lVar = this.Z0;
        lVar.f12685i = f;
        lVar.f12689m = 0L;
        lVar.f12692p = -1L;
        lVar.f12690n = -1L;
        lVar.c(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void m0() {
        super.m0();
        this.t1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.x.b
    public final void o(int i6, Object obj) {
        d dVar;
        Handler handler;
        d dVar2;
        long j10;
        Handler handler2;
        int intValue;
        l lVar = this.Z0;
        if (i6 != 1) {
            if (i6 != 7) {
                if (i6 != 10) {
                    if (i6 != 4) {
                        if (i6 == 5 && lVar.f12686j != (intValue = ((Integer) obj).intValue())) {
                            lVar.f12686j = intValue;
                            lVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f12652k1 = intValue2;
                    com.google.android.exoplayer2.mediacodec.c cVar = this.c0;
                    if (cVar != null) {
                        cVar.k(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.E1 != intValue3) {
                    this.E1 = intValue3;
                    if (this.D1) {
                        k0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.G1 = (j) obj;
            return;
        }
        if (obj instanceof Surface) {
            dVar = (Surface) obj;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            d dVar3 = this.f12650i1;
            if (dVar3 != null) {
                dVar = dVar3;
            } else {
                com.google.android.exoplayer2.mediacodec.d dVar4 = this.f6597j0;
                if (dVar4 != null && G0(dVar4)) {
                    dVar = d.c(dVar4.f, this.Y0);
                    this.f12650i1 = dVar;
                }
            }
        }
        Surface surface = this.f12649h1;
        o.a aVar = this.f12644a1;
        if (surface != dVar) {
            this.f12649h1 = dVar;
            lVar.getClass();
            if (dVar instanceof d) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if (lVar.f12682e != dVar2) {
                lVar.a();
                lVar.f12682e = dVar2;
                lVar.c(true);
            }
            this.f12651j1 = false;
            int i10 = this.f6462y;
            com.google.android.exoplayer2.mediacodec.c cVar2 = this.c0;
            if (cVar2 != null) {
                if (w.f5205a >= 23 && dVar != null && !this.f12648f1) {
                    cVar2.m(dVar);
                } else {
                    k0();
                    X();
                }
            }
            if (dVar != null && dVar != this.f12650i1) {
                q qVar = this.C1;
                if (qVar != null && (handler2 = aVar.f12709a) != null) {
                    handler2.post(new q7.f(aVar, 7, qVar));
                }
                v0();
                if (i10 == 2) {
                    long j11 = this.b1;
                    if (j11 > 0) {
                        j10 = SystemClock.elapsedRealtime() + j11;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    this.f12657p1 = j10;
                    return;
                }
                return;
            }
            this.C1 = null;
            v0();
        } else if (dVar != null && dVar != this.f12650i1) {
            q qVar2 = this.C1;
            if (qVar2 != null && (handler = aVar.f12709a) != null) {
                handler.post(new q7.f(aVar, 7, qVar2));
            }
            if (this.f12651j1) {
                Surface surface2 = this.f12649h1;
                Handler handler3 = aVar.f12709a;
                if (handler3 != null) {
                    handler3.post(new q5.b(aVar, surface2, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean p0(com.google.android.exoplayer2.mediacodec.d dVar) {
        if (this.f12649h1 == null && !G0(dVar)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int r0(com.google.android.exoplayer2.mediacodec.e eVar, com.google.android.exoplayer2.n nVar) {
        boolean z10;
        boolean z11;
        int i6;
        int i10;
        int i11 = 0;
        if (!c9.l.j(nVar.F)) {
            return 0;
        }
        if (nVar.I != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        List<com.google.android.exoplayer2.mediacodec.d> z02 = z0(eVar, nVar, z10, false);
        if (z10 && z02.isEmpty()) {
            z02 = z0(eVar, nVar, false, false);
        }
        if (z02.isEmpty()) {
            return 1;
        }
        int i12 = nVar.Y;
        if (i12 != 0 && i12 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return 2;
        }
        com.google.android.exoplayer2.mediacodec.d dVar = z02.get(0);
        boolean c10 = dVar.c(nVar);
        if (dVar.d(nVar)) {
            i6 = 16;
        } else {
            i6 = 8;
        }
        if (c10) {
            List<com.google.android.exoplayer2.mediacodec.d> z03 = z0(eVar, nVar, z10, true);
            if (!z03.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.d dVar2 = z03.get(0);
                if (dVar2.c(nVar) && dVar2.d(nVar)) {
                    i11 = 32;
                }
            }
        }
        if (c10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        return i10 | i6 | i11;
    }

    public final void v0() {
        com.google.android.exoplayer2.mediacodec.c cVar;
        this.f12653l1 = false;
        if (w.f5205a >= 23 && this.D1 && (cVar = this.c0) != null) {
            this.F1 = new b(cVar);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public final void y() {
        o.a aVar = this.f12644a1;
        this.C1 = null;
        v0();
        this.f12651j1 = false;
        l lVar = this.Z0;
        l.b bVar = lVar.f12679b;
        if (bVar != null) {
            bVar.b();
            l.e eVar = lVar.f12680c;
            eVar.getClass();
            eVar.f12699v.sendEmptyMessage(2);
        }
        this.F1 = null;
        try {
            super.y();
            le leVar = this.T0;
            aVar.getClass();
            synchronized (leVar) {
            }
            Handler handler = aVar.f12709a;
            if (handler != null) {
                handler.post(new m(aVar, leVar, 0));
            }
        } catch (Throwable th2) {
            aVar.a(this.T0);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void z(boolean z10, boolean z11) {
        boolean z12;
        this.T0 = new le();
        v vVar = this.f6460w;
        vVar.getClass();
        boolean z13 = vVar.f27254a;
        if (z13 && this.E1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        sc.b.C(z12);
        if (this.D1 != z13) {
            this.D1 = z13;
            k0();
        }
        le leVar = this.T0;
        o.a aVar = this.f12644a1;
        Handler handler = aVar.f12709a;
        if (handler != null) {
            handler.post(new m(aVar, leVar, 1));
        }
        l lVar = this.Z0;
        l.b bVar = lVar.f12679b;
        if (bVar != null) {
            l.e eVar = lVar.f12680c;
            eVar.getClass();
            eVar.f12699v.sendEmptyMessage(1);
            bVar.a(new f0.b(22, lVar));
        }
        this.f12654m1 = z11;
        this.f12655n1 = false;
    }
}
