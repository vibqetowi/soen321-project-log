package z7;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.k;
import c9.l;
import c9.m;
import c9.q;
import c9.w;
import com.appsflyer.R;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.n;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import d9.f;
import i5.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import q7.a;
import u7.h;
import u7.i;
import u7.j;
import u7.t;
import u7.v;
import z7.a;
/* compiled from: MatroskaExtractor.java */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f39209b0 = {49, 10, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.COMMA, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.COMMA, 48, 48, 48, 10};
    public static final byte[] c0 = w.u("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f39210d0 = {68, 105, 97, 108, 111, 103, 117, 101, JsonWriter.SEMI, 32, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.COMMA, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.SEMI, 48, 48, JsonWriter.COMMA};
    public static final UUID e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0  reason: collision with root package name */
    public static final Map<String, Integer> f39211f0;
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final c f39212a;

    /* renamed from: a0  reason: collision with root package name */
    public j f39213a0;

    /* renamed from: b  reason: collision with root package name */
    public final e f39214b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<b> f39215c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39216d;

    /* renamed from: e  reason: collision with root package name */
    public final q f39217e;
    public final q f;

    /* renamed from: g  reason: collision with root package name */
    public final q f39218g;

    /* renamed from: h  reason: collision with root package name */
    public final q f39219h;

    /* renamed from: i  reason: collision with root package name */
    public final q f39220i;

    /* renamed from: j  reason: collision with root package name */
    public final q f39221j;

    /* renamed from: k  reason: collision with root package name */
    public final q f39222k;

    /* renamed from: l  reason: collision with root package name */
    public final q f39223l;

    /* renamed from: m  reason: collision with root package name */
    public final q f39224m;

    /* renamed from: n  reason: collision with root package name */
    public final q f39225n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f39226o;

    /* renamed from: p  reason: collision with root package name */
    public long f39227p;

    /* renamed from: q  reason: collision with root package name */
    public long f39228q;
    public long r;

    /* renamed from: s  reason: collision with root package name */
    public long f39229s;

    /* renamed from: t  reason: collision with root package name */
    public long f39230t;

    /* renamed from: u  reason: collision with root package name */
    public b f39231u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f39232v;

    /* renamed from: w  reason: collision with root package name */
    public int f39233w;

    /* renamed from: x  reason: collision with root package name */
    public long f39234x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39235y;

    /* renamed from: z  reason: collision with root package name */
    public long f39236z;

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public final class a implements z7.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:473:0x0818, code lost:
            if (r1.j() == r12.getLeastSignificantBits()) goto L338;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:477:0x081f  */
        /* JADX WARN: Removed duplicated region for block: B:482:0x084a  */
        /* JADX WARN: Removed duplicated region for block: B:495:0x0873  */
        /* JADX WARN: Removed duplicated region for block: B:500:0x088a  */
        /* JADX WARN: Removed duplicated region for block: B:501:0x088c  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x0899  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x08a5  */
        /* JADX WARN: Removed duplicated region for block: B:593:0x0a64  */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z7.d$b] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i6) {
            char c10;
            boolean z10;
            b bVar;
            d dVar;
            char c11;
            int i10;
            List<byte[]> singletonList;
            int i11;
            String str;
            boolean z11;
            int i12;
            String str2;
            List<byte[]> list;
            String str3;
            ArrayList arrayList;
            String str4;
            String str5;
            int i13;
            ArrayList arrayList2;
            boolean z12;
            Pair pair;
            Pair pair2;
            String str6;
            String str7;
            List<byte[]> list2;
            String str8;
            List<byte[]> list3;
            l0 l0Var;
            List<byte[]> list4;
            byte[] bArr;
            int i14;
            n.a aVar;
            int i15;
            int i16;
            float f;
            d9.b bVar2;
            byte[] bArr2;
            int i17;
            String str9;
            d9.c a10;
            ArrayList arrayList3;
            ArrayList arrayList4;
            t bVar3;
            int i18;
            int i19;
            d dVar2 = d.this;
            sc.b.E(dVar2.f39213a0);
            SparseArray sparseArray = dVar2.f39215c;
            int i20 = 0;
            if (i6 != 160) {
                if (i6 != 174) {
                    if (i6 != 19899) {
                        if (i6 != 25152) {
                            if (i6 != 28032) {
                                if (i6 != 357149030) {
                                    if (i6 != 374648427) {
                                        if (i6 == 475249515) {
                                            if (!dVar2.f39232v) {
                                                j jVar = dVar2.f39213a0;
                                                i5.n nVar = dVar2.C;
                                                i5.n nVar2 = dVar2.D;
                                                if (dVar2.f39228q != -1 && dVar2.f39230t != -9223372036854775807L && nVar != null && (i18 = nVar.f19876u) != 0 && nVar2 != null && nVar2.f19876u == i18) {
                                                    int[] iArr = new int[i18];
                                                    long[] jArr = new long[i18];
                                                    long[] jArr2 = new long[i18];
                                                    long[] jArr3 = new long[i18];
                                                    for (int i21 = 0; i21 < i18; i21++) {
                                                        jArr3[i21] = nVar.b(i21);
                                                        jArr[i21] = nVar2.b(i21) + dVar2.f39228q;
                                                    }
                                                    while (true) {
                                                        i19 = i18 - 1;
                                                        if (i20 >= i19) {
                                                            break;
                                                        }
                                                        int i22 = i20 + 1;
                                                        iArr[i20] = (int) (jArr[i22] - jArr[i20]);
                                                        jArr2[i20] = jArr3[i22] - jArr3[i20];
                                                        i20 = i22;
                                                    }
                                                    iArr[i19] = (int) ((dVar2.f39228q + dVar2.f39227p) - jArr[i19]);
                                                    long j10 = dVar2.f39230t - jArr3[i19];
                                                    jArr2[i19] = j10;
                                                    if (j10 <= 0) {
                                                        StringBuilder sb2 = new StringBuilder(72);
                                                        sb2.append("Discarding last cue point with unexpected duration: ");
                                                        sb2.append(j10);
                                                        Log.w("MatroskaExtractor", sb2.toString());
                                                        iArr = Arrays.copyOf(iArr, i19);
                                                        jArr = Arrays.copyOf(jArr, i19);
                                                        jArr2 = Arrays.copyOf(jArr2, i19);
                                                        jArr3 = Arrays.copyOf(jArr3, i19);
                                                    }
                                                    bVar3 = new u7.c(iArr, jArr, jArr2, jArr3);
                                                } else {
                                                    bVar3 = new t.b(dVar2.f39230t);
                                                }
                                                jVar.i(bVar3);
                                                dVar2.f39232v = true;
                                            }
                                            dVar2.C = null;
                                            dVar2.D = null;
                                            return;
                                        }
                                        return;
                                    } else if (sparseArray.size() != 0) {
                                        dVar2.f39213a0.e();
                                        return;
                                    } else {
                                        throw ParserException.a("No valid tracks were found", null);
                                    }
                                }
                                if (dVar2.r == -9223372036854775807L) {
                                    dVar2.r = 1000000L;
                                }
                                long j11 = dVar2.f39229s;
                                if (j11 != -9223372036854775807L) {
                                    dVar2.f39230t = dVar2.l(j11);
                                    return;
                                }
                                return;
                            }
                            dVar2.d(i6);
                            b bVar4 = dVar2.f39231u;
                            if (bVar4.f39244h && bVar4.f39245i != null) {
                                throw ParserException.a("Combining encryption and compression is not supported", null);
                            }
                            return;
                        }
                        dVar2.d(i6);
                        b bVar5 = dVar2.f39231u;
                        if (bVar5.f39244h) {
                            v.a aVar2 = bVar5.f39246j;
                            if (aVar2 != null) {
                                bVar5.f39248l = new com.google.android.exoplayer2.drm.b(null, true, new b.C0134b(o7.b.f27180a, null, "video/webm", aVar2.f33914b));
                                return;
                            }
                            throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                        }
                        return;
                    }
                    int i23 = dVar2.f39233w;
                    if (i23 != -1) {
                        long j12 = dVar2.f39234x;
                        if (j12 != -1) {
                            if (i23 == 475249515) {
                                dVar2.f39236z = j12;
                                return;
                            }
                            return;
                        }
                    }
                    throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
                }
                ?? r02 = dVar2.f39231u;
                sc.b.E(r02);
                String str10 = r02.f39239b;
                if (str10 != null) {
                    switch (str10.hashCode()) {
                        case -2095576542:
                            if (str10.equals("V_MPEG4/ISO/AP")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2095575984:
                            if (str10.equals("V_MPEG4/ISO/SP")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1985379776:
                            if (str10.equals("A_MS/ACM")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1784763192:
                            if (str10.equals("A_TRUEHD")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1730367663:
                            if (str10.equals("A_VORBIS")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1482641358:
                            if (str10.equals("A_MPEG/L2")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1482641357:
                            if (str10.equals("A_MPEG/L3")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1373388978:
                            if (str10.equals("V_MS/VFW/FOURCC")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -933872740:
                            if (str10.equals("S_DVBSUB")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -538363189:
                            if (str10.equals("V_MPEG4/ISO/ASP")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -538363109:
                            if (str10.equals("V_MPEG4/ISO/AVC")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -425012669:
                            if (str10.equals("S_VOBSUB")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -356037306:
                            if (str10.equals("A_DTS/LOSSLESS")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62923557:
                            if (str10.equals("A_AAC")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62923603:
                            if (str10.equals("A_AC3")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62927045:
                            if (str10.equals("A_DTS")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 82318131:
                            if (str10.equals("V_AV1")) {
                                c10 = 16;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 82338133:
                            if (str10.equals("V_VP8")) {
                                c10 = 17;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 82338134:
                            if (str10.equals("V_VP9")) {
                                c10 = 18;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 99146302:
                            if (str10.equals("S_HDMV/PGS")) {
                                c10 = 19;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 444813526:
                            if (str10.equals("V_THEORA")) {
                                c10 = 20;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 542569478:
                            if (str10.equals("A_DTS/EXPRESS")) {
                                c10 = 21;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 635596514:
                            if (str10.equals("A_PCM/FLOAT/IEEE")) {
                                c10 = 22;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 725948237:
                            if (str10.equals("A_PCM/INT/BIG")) {
                                c10 = 23;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 725957860:
                            if (str10.equals("A_PCM/INT/LIT")) {
                                c10 = 24;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 738597099:
                            if (str10.equals("S_TEXT/ASS")) {
                                c10 = 25;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 855502857:
                            if (str10.equals("V_MPEGH/ISO/HEVC")) {
                                c10 = 26;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1422270023:
                            if (str10.equals("S_TEXT/UTF8")) {
                                c10 = 27;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1809237540:
                            if (str10.equals("V_MPEG2")) {
                                c10 = 28;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1950749482:
                            if (str10.equals("A_EAC3")) {
                                c10 = 29;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1950789798:
                            if (str10.equals("A_FLAC")) {
                                c10 = 30;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1951062397:
                            if (str10.equals("A_OPUS")) {
                                c10 = 31;
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
                            z10 = true;
                            break;
                        default:
                            z10 = false;
                            break;
                    }
                    if (z10) {
                        j jVar2 = dVar2.f39213a0;
                        int i24 = r02.f39240c;
                        String str11 = r02.f39239b;
                        str11.getClass();
                        switch (str11.hashCode()) {
                            case -2095576542:
                                if (str11.equals("V_MPEG4/ISO/AP")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -2095575984:
                                if (str11.equals("V_MPEG4/ISO/SP")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1985379776:
                                if (str11.equals("A_MS/ACM")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1784763192:
                                if (str11.equals("A_TRUEHD")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1730367663:
                                if (str11.equals("A_VORBIS")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1482641358:
                                if (str11.equals("A_MPEG/L2")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1482641357:
                                if (str11.equals("A_MPEG/L3")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1373388978:
                                if (str11.equals("V_MS/VFW/FOURCC")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -933872740:
                                if (str11.equals("S_DVBSUB")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -538363189:
                                if (str11.equals("V_MPEG4/ISO/ASP")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -538363109:
                                if (str11.equals("V_MPEG4/ISO/AVC")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -425012669:
                                if (str11.equals("S_VOBSUB")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -356037306:
                                if (str11.equals("A_DTS/LOSSLESS")) {
                                    c11 = '\f';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 62923557:
                                if (str11.equals("A_AAC")) {
                                    c11 = '\r';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 62923603:
                                if (str11.equals("A_AC3")) {
                                    c11 = 14;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 62927045:
                                if (str11.equals("A_DTS")) {
                                    c11 = 15;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 82318131:
                                if (str11.equals("V_AV1")) {
                                    c11 = 16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 82338133:
                                if (str11.equals("V_VP8")) {
                                    c11 = 17;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 82338134:
                                if (str11.equals("V_VP9")) {
                                    c11 = 18;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 99146302:
                                if (str11.equals("S_HDMV/PGS")) {
                                    c11 = 19;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 444813526:
                                if (str11.equals("V_THEORA")) {
                                    c11 = 20;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 542569478:
                                if (str11.equals("A_DTS/EXPRESS")) {
                                    c11 = 21;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 635596514:
                                if (str11.equals("A_PCM/FLOAT/IEEE")) {
                                    c11 = 22;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 725948237:
                                if (str11.equals("A_PCM/INT/BIG")) {
                                    c11 = 23;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 725957860:
                                if (str11.equals("A_PCM/INT/LIT")) {
                                    c11 = 24;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 738597099:
                                if (str11.equals("S_TEXT/ASS")) {
                                    c11 = 25;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 855502857:
                                if (str11.equals("V_MPEGH/ISO/HEVC")) {
                                    c11 = 26;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1422270023:
                                if (str11.equals("S_TEXT/UTF8")) {
                                    c11 = 27;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1809237540:
                                if (str11.equals("V_MPEG2")) {
                                    c11 = 28;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1950749482:
                                if (str11.equals("A_EAC3")) {
                                    c11 = 29;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1950789798:
                                if (str11.equals("A_FLAC")) {
                                    c11 = 30;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1951062397:
                                if (str11.equals("A_OPUS")) {
                                    c11 = 31;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        String str12 = "video/x-unknown";
                        String str13 = "audio/raw";
                        String str14 = "audio/x-unknown";
                        switch (c11) {
                            case 0:
                            case 1:
                            case '\t':
                                i10 = 1;
                                byte[] bArr3 = r02.f39247k;
                                if (bArr3 == null) {
                                    singletonList = null;
                                } else {
                                    singletonList = Collections.singletonList(bArr3);
                                }
                                str14 = "video/mp4v-es";
                                str13 = str14;
                                i11 = -1;
                                str = null;
                                list3 = singletonList;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null && (a10 = d9.c.a(new q(bArr))) != null) {
                                    str = a10.f12615b;
                                    str13 = "video/dolby-vision";
                                }
                                int i25 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                    i14 = 2;
                                } else {
                                    i14 = 0;
                                }
                                int i26 = i25 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                    aVar.f6677x = r02.O;
                                    aVar.f6678y = r02.Q;
                                    aVar.f6679z = i12;
                                } else if (l.j(str13)) {
                                    if (r02.f39253q == 0) {
                                        int i27 = r02.f39251o;
                                        i15 = -1;
                                        if (i27 == -1) {
                                            i27 = r02.f39249m;
                                        }
                                        r02.f39251o = i27;
                                        int i28 = r02.f39252p;
                                        if (i28 == -1) {
                                            i28 = r02.f39250n;
                                        }
                                        r02.f39252p = i28;
                                    } else {
                                        i15 = -1;
                                    }
                                    if (r02.f39251o != i15 && (i17 = r02.f39252p) != i15) {
                                        f = (r02.f39250n * i16) / (r02.f39249m * i17);
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (r02.f39259x) {
                                        if (r02.D != -1.0f && r02.E != -1.0f && r02.F != -1.0f && r02.G != -1.0f && r02.H != -1.0f && r02.I != -1.0f && r02.J != -1.0f && r02.K != -1.0f && r02.L != -1.0f && r02.M != -1.0f) {
                                            bArr2 = new byte[25];
                                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                            order.put((byte) 0);
                                            order.putShort((short) ((r02.D * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.E * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.F * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.G * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.H * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.I * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.J * 50000.0f) + 0.5f));
                                            order.putShort((short) ((r02.K * 50000.0f) + 0.5f));
                                            order.putShort((short) (r02.L + 0.5f));
                                            order.putShort((short) (r02.M + 0.5f));
                                            order.putShort((short) r02.B);
                                            order.putShort((short) r02.C);
                                        } else {
                                            bArr2 = null;
                                        }
                                        bVar2 = new d9.b(r02.f39260y, r02.A, r02.f39261z, bArr2);
                                    } else {
                                        bVar2 = null;
                                    }
                                    String str15 = r02.f39238a;
                                    if (str15 != null) {
                                        Map<String, Integer> map = d.f39211f0;
                                        if (map.containsKey(str15)) {
                                            i15 = map.get(r02.f39238a).intValue();
                                        }
                                    }
                                    if (r02.r == 0 && Float.compare(r02.f39254s, 0.0f) == 0 && Float.compare(r02.f39255t, 0.0f) == 0) {
                                        if (Float.compare(r02.f39256u, 0.0f) == 0) {
                                            i15 = 0;
                                        } else if (Float.compare(r02.f39255t, 90.0f) == 0) {
                                            i15 = 90;
                                        } else if (Float.compare(r02.f39255t, -180.0f) != 0 && Float.compare(r02.f39255t, 180.0f) != 0) {
                                            if (Float.compare(r02.f39255t, -90.0f) == 0) {
                                                i15 = SubsamplingScaleImageView.ORIENTATION_270;
                                            }
                                        } else {
                                            i15 = SubsamplingScaleImageView.ORIENTATION_180;
                                        }
                                    }
                                    aVar.f6670p = r02.f39249m;
                                    aVar.f6671q = r02.f39250n;
                                    aVar.f6673t = f;
                                    aVar.f6672s = i15;
                                    aVar.f6674u = r02.f39257v;
                                    aVar.f6675v = r02.f39258w;
                                    aVar.f6676w = bVar2;
                                    i10 = 2;
                                } else if (!"application/x-subrip".equals(str13) && !"text/x-ssa".equals(str13) && !"application/vobsub".equals(str13) && !"application/pgs".equals(str13) && !"application/dvbsubs".equals(str13)) {
                                    throw ParserException.a("Unexpected MIME type.", null);
                                } else {
                                    i10 = 3;
                                }
                                str9 = r02.f39238a;
                                if (str9 != null && !d.f39211f0.containsKey(str9)) {
                                    aVar.f6657b = r02.f39238a;
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11 = aVar.a();
                                v n10 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10;
                                n10.e(a11);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 2:
                                q qVar = new q(r02.a(r02.f39239b));
                                try {
                                    int i29 = qVar.i();
                                    i10 = 1;
                                    if (i29 != 1) {
                                        if (i29 == 65534) {
                                            qVar.A(24);
                                            long j13 = qVar.j();
                                            UUID uuid = d.e0;
                                            if (j13 == uuid.getMostSignificantBits()) {
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                            int p10 = w.p(r02.P);
                                            if (p10 == 0) {
                                                int i30 = r02.P;
                                                StringBuilder sb3 = new StringBuilder(75);
                                                sb3.append("Unsupported PCM bit depth: ");
                                                sb3.append(i30);
                                                sb3.append(". Setting mimeType to audio/x-unknown");
                                                Log.w("MatroskaExtractor", sb3.toString());
                                            } else {
                                                i12 = p10;
                                                str2 = null;
                                                list = null;
                                                str = str2;
                                                list3 = list;
                                                i11 = -1;
                                                bArr = r02.N;
                                                if (bArr != null) {
                                                    str = a10.f12615b;
                                                    str13 = "video/dolby-vision";
                                                    break;
                                                }
                                                int i252 = (r02.V ? 1 : 0) | 0;
                                                if (!r02.U) {
                                                }
                                                int i262 = i252 | i14;
                                                aVar = new n.a();
                                                if (!l.h(str13)) {
                                                }
                                                str9 = r02.f39238a;
                                                if (str9 != null) {
                                                    aVar.f6657b = r02.f39238a;
                                                    break;
                                                }
                                                aVar.b(i24);
                                                aVar.f6665k = str13;
                                                aVar.f6666l = i11;
                                                aVar.f6658c = r02.W;
                                                aVar.f6659d = i262;
                                                aVar.f6667m = list3;
                                                aVar.f6662h = str;
                                                aVar.f6668n = r02.f39248l;
                                                com.google.android.exoplayer2.n a112 = aVar.a();
                                                v n102 = jVar2.n(r02.f39240c, i10);
                                                r02.X = n102;
                                                n102.e(a112);
                                                sparseArray.put(r02.f39240c, r02);
                                                dVar = dVar2;
                                                bVar = null;
                                                break;
                                            }
                                        } else {
                                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown"));
                                        }
                                        singletonList = null;
                                        str13 = str14;
                                        i11 = -1;
                                        str = null;
                                        list3 = singletonList;
                                        i12 = -1;
                                        bArr = r02.N;
                                        if (bArr != null) {
                                        }
                                        int i2522 = (r02.V ? 1 : 0) | 0;
                                        if (!r02.U) {
                                        }
                                        int i2622 = i2522 | i14;
                                        aVar = new n.a();
                                        if (!l.h(str13)) {
                                        }
                                        str9 = r02.f39238a;
                                        if (str9 != null) {
                                        }
                                        aVar.b(i24);
                                        aVar.f6665k = str13;
                                        aVar.f6666l = i11;
                                        aVar.f6658c = r02.W;
                                        aVar.f6659d = i2622;
                                        aVar.f6667m = list3;
                                        aVar.f6662h = str;
                                        aVar.f6668n = r02.f39248l;
                                        com.google.android.exoplayer2.n a1122 = aVar.a();
                                        v n1022 = jVar2.n(r02.f39240c, i10);
                                        r02.X = n1022;
                                        n1022.e(a1122);
                                        sparseArray.put(r02.f39240c, r02);
                                        dVar = dVar2;
                                        bVar = null;
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    singletonList = null;
                                    str13 = str14;
                                    i11 = -1;
                                    str = null;
                                    list3 = singletonList;
                                    i12 = -1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i25222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i26222 = i25222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i26222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a11222 = aVar.a();
                                    v n10222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n10222;
                                    n10222.e(a11222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw ParserException.a("Error parsing MS/ACM codec private", null);
                                }
                                break;
                            case 3:
                                r02.T = new u7.w();
                                str3 = "audio/true-hd";
                                arrayList = null;
                                i11 = -1;
                                str = null;
                                arrayList3 = arrayList;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222 = i252222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222 = aVar.a();
                                v n102222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222;
                                n102222.e(a112222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 4:
                                byte[] a12 = r02.a(r02.f39239b);
                                try {
                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                    r02 = 0;
                                }
                                try {
                                    if (a12[0] == 2) {
                                        int i31 = 0;
                                        int i32 = 1;
                                        while (true) {
                                            int i33 = a12[i32] & 255;
                                            if (i33 == 255) {
                                                i31 += 255;
                                                i32++;
                                            } else {
                                                int i34 = i32 + 1;
                                                int i35 = i31 + i33;
                                                int i36 = 0;
                                                while (true) {
                                                    int i37 = a12[i34] & 255;
                                                    if (i37 == 255) {
                                                        i36 += 255;
                                                        i34++;
                                                    } else {
                                                        int i38 = i34 + 1;
                                                        int i39 = i36 + i37;
                                                        if (a12[i38] == 1) {
                                                            byte[] bArr4 = new byte[i35];
                                                            System.arraycopy(a12, i38, bArr4, 0, i35);
                                                            int i40 = i38 + i35;
                                                            if (a12[i40] == 3) {
                                                                int i41 = i40 + i39;
                                                                if (a12[i41] == 5) {
                                                                    byte[] bArr5 = new byte[a12.length - i41];
                                                                    System.arraycopy(a12, i41, bArr5, 0, a12.length - i41);
                                                                    ArrayList arrayList5 = new ArrayList(2);
                                                                    arrayList5.add(bArr4);
                                                                    arrayList5.add(bArr5);
                                                                    str3 = "audio/vorbis";
                                                                    i11 = 8192;
                                                                    arrayList = arrayList5;
                                                                    str = null;
                                                                    arrayList3 = arrayList;
                                                                    str13 = str3;
                                                                    i10 = 1;
                                                                    list3 = arrayList3;
                                                                    i12 = -1;
                                                                    bArr = r02.N;
                                                                    if (bArr != null) {
                                                                    }
                                                                    int i2522222 = (r02.V ? 1 : 0) | 0;
                                                                    if (!r02.U) {
                                                                    }
                                                                    int i2622222 = i2522222 | i14;
                                                                    aVar = new n.a();
                                                                    if (!l.h(str13)) {
                                                                    }
                                                                    str9 = r02.f39238a;
                                                                    if (str9 != null) {
                                                                    }
                                                                    aVar.b(i24);
                                                                    aVar.f6665k = str13;
                                                                    aVar.f6666l = i11;
                                                                    aVar.f6658c = r02.W;
                                                                    aVar.f6659d = i2622222;
                                                                    aVar.f6667m = list3;
                                                                    aVar.f6662h = str;
                                                                    aVar.f6668n = r02.f39248l;
                                                                    com.google.android.exoplayer2.n a1122222 = aVar.a();
                                                                    v n1022222 = jVar2.n(r02.f39240c, i10);
                                                                    r02.X = n1022222;
                                                                    n1022222.e(a1122222);
                                                                    sparseArray.put(r02.f39240c, r02);
                                                                    dVar = dVar2;
                                                                    bVar = null;
                                                                    break;
                                                                } else {
                                                                    throw ParserException.a("Error parsing vorbis codec private", null);
                                                                }
                                                            } else {
                                                                throw ParserException.a("Error parsing vorbis codec private", null);
                                                            }
                                                        } else {
                                                            throw ParserException.a("Error parsing vorbis codec private", null);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw ParserException.a("Error parsing vorbis codec private", null);
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                    throw ParserException.a("Error parsing vorbis codec private", r02);
                                }
                                break;
                            case 5:
                                str4 = "audio/mpeg-L2";
                                str5 = str4;
                                i13 = 4096;
                                arrayList2 = null;
                                str = null;
                                String str16 = str5;
                                i11 = i13;
                                arrayList4 = arrayList2;
                                str3 = str16;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222 = i25222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222 = aVar.a();
                                v n10222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222;
                                n10222222.e(a11222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 6:
                                str4 = "audio/mpeg";
                                str5 = str4;
                                i13 = 4096;
                                arrayList2 = null;
                                str = null;
                                String str162 = str5;
                                i11 = i13;
                                arrayList4 = arrayList2;
                                str3 = str162;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222 = i252222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222 = aVar.a();
                                v n102222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222;
                                n102222222.e(a112222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 7:
                                byte[] a13 = r02.a(r02.f39239b);
                                if (16 <= a13.length) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                try {
                                    sc.b.q(z12);
                                    long j14 = (a13[16] & 255) | ((a13[17] & 255) << 8) | ((a13[18] & 255) << 16) | ((255 & a13[19]) << 24);
                                    if (j14 == 1482049860) {
                                        pair2 = new Pair("video/divx", null);
                                    } else if (j14 == 859189832) {
                                        pair2 = new Pair("video/3gpp", null);
                                    } else {
                                        if (j14 == 826496599) {
                                            for (int i42 = 40; i42 < a13.length - 4; i42++) {
                                                if (a13[i42] == 0 && a13[i42 + 1] == 0 && a13[i42 + 2] == 1) {
                                                    if (a13[i42 + 3] == 15) {
                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(a13, i42, a13.length)));
                                                    }
                                                }
                                            }
                                            throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
                                        }
                                        Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        pair = new Pair("video/x-unknown", null);
                                        pair2 = pair;
                                    }
                                    str6 = (String) pair2.first;
                                    l0Var = (List) pair2.second;
                                    str8 = null;
                                    list4 = l0Var;
                                    str = str8;
                                    str3 = str6;
                                    i11 = -1;
                                    arrayList4 = list4;
                                    arrayList3 = arrayList4;
                                    str13 = str3;
                                    i10 = 1;
                                    list3 = arrayList3;
                                    i12 = -1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i2522222222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i2622222222 = i2522222222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i2622222222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a1122222222 = aVar.a();
                                    v n1022222222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n1022222222;
                                    n1022222222.e(a1122222222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                    break;
                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                    throw ParserException.a("Error parsing FourCC private data", null);
                                }
                                break;
                            case '\b':
                                byte[] bArr6 = new byte[4];
                                System.arraycopy(r02.a(r02.f39239b), 0, bArr6, 0, 4);
                                l0 K = s.K(bArr6);
                                str6 = "application/dvbsubs";
                                l0Var = K;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222 = i25222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222 = aVar.a();
                                v n10222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222;
                                n10222222222.e(a11222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case '\n':
                                d9.a a14 = d9.a.a(new q(r02.a(r02.f39239b)));
                                r02.Y = a14.f12604b;
                                str7 = "video/avc";
                                list2 = a14.f12603a;
                                str2 = a14.f;
                                i10 = 1;
                                i12 = -1;
                                List<byte[]> list5 = list2;
                                str13 = str7;
                                list = list5;
                                str = str2;
                                list3 = list;
                                i11 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222 = i252222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222 = aVar.a();
                                v n102222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222;
                                n102222222222.e(a112222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 11:
                                str6 = "application/vobsub";
                                l0Var = s.K(r02.a(r02.f39239b));
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222 = i2522222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222 = aVar.a();
                                v n1022222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222;
                                n1022222222222.e(a1122222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case '\f':
                                str12 = "audio/vnd.dts.hd";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222 = i25222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222 = aVar.a();
                                v n10222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222;
                                n10222222222222.e(a11222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case '\r':
                                List<byte[]> singletonList2 = Collections.singletonList(r02.a(r02.f39239b));
                                a.C0493a c12 = q7.a.c(r02.f39247k);
                                r02.Q = c12.f29230a;
                                r02.O = c12.f29231b;
                                str8 = c12.f29232c;
                                str6 = "audio/mp4a-latm";
                                list4 = singletonList2;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222222 = i252222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222222 = aVar.a();
                                v n102222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222222;
                                n102222222222222.e(a112222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 14:
                                str12 = "audio/ac3";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222 = i2522222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222 = aVar.a();
                                v n1022222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222;
                                n1022222222222222.e(a1122222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 15:
                            case 21:
                                str12 = "audio/vnd.dts";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222 = i25222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222 = aVar.a();
                                v n10222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222;
                                n10222222222222222.e(a11222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 16:
                                str12 = "video/av01";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222222222 = i252222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222222222 = aVar.a();
                                v n102222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222222222;
                                n102222222222222222.e(a112222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 17:
                                str12 = "video/x-vnd.on2.vp8";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222222 = i2522222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222222 = aVar.a();
                                v n1022222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222222;
                                n1022222222222222222.e(a1122222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 18:
                                str12 = "video/x-vnd.on2.vp9";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222222 = i25222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222222 = aVar.a();
                                v n10222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222222;
                                n10222222222222222222.e(a11222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 19:
                                str12 = "application/pgs";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222222222222 = i252222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222222222222 = aVar.a();
                                v n102222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222222222222;
                                n102222222222222222222.e(a112222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 20:
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222222222 = i2522222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222222222 = aVar.a();
                                v n1022222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222222222;
                                n1022222222222222222222.e(a1122222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 22:
                                int i43 = r02.P;
                                if (i43 == 32) {
                                    i12 = 4;
                                    list3 = null;
                                    i11 = -1;
                                    str = null;
                                    i10 = 1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i25222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i26222222222222222222222 = i25222222222222222222222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i26222222222222222222222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a11222222222222222222222 = aVar.a();
                                    v n10222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n10222222222222222222222;
                                    n10222222222222222222222.e(a11222222222222222222222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder(90);
                                    sb4.append("Unsupported floating point PCM bit depth: ");
                                    sb4.append(i43);
                                    sb4.append(". Setting mimeType to audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb4.toString());
                                    str6 = str14;
                                    l0Var = null;
                                    str8 = null;
                                    list4 = l0Var;
                                    str = str8;
                                    str3 = str6;
                                    i11 = -1;
                                    arrayList4 = list4;
                                    arrayList3 = arrayList4;
                                    str13 = str3;
                                    i10 = 1;
                                    list3 = arrayList3;
                                    i12 = -1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i252222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i262222222222222222222222 = i252222222222222222222222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i262222222222222222222222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a112222222222222222222222 = aVar.a();
                                    v n102222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n102222222222222222222222;
                                    n102222222222222222222222.e(a112222222222222222222222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                }
                                break;
                            case 23:
                                int i44 = r02.P;
                                if (i44 == 8) {
                                    i12 = 3;
                                } else if (i44 == 16) {
                                    i12 = 268435456;
                                } else {
                                    StringBuilder sb5 = new StringBuilder(86);
                                    sb5.append("Unsupported big endian PCM bit depth: ");
                                    sb5.append(i44);
                                    sb5.append(". Setting mimeType to audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb5.toString());
                                    str6 = str14;
                                    l0Var = null;
                                    str8 = null;
                                    list4 = l0Var;
                                    str = str8;
                                    str3 = str6;
                                    i11 = -1;
                                    arrayList4 = list4;
                                    arrayList3 = arrayList4;
                                    str13 = str3;
                                    i10 = 1;
                                    list3 = arrayList3;
                                    i12 = -1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i2522222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i2622222222222222222222222 = i2522222222222222222222222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i2622222222222222222222222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a1122222222222222222222222 = aVar.a();
                                    v n1022222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n1022222222222222222222222;
                                    n1022222222222222222222222.e(a1122222222222222222222222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                    break;
                                }
                                list3 = null;
                                i11 = -1;
                                str = null;
                                i10 = 1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222222222222 = i25222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222222222222 = aVar.a();
                                v n10222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222222222222;
                                n10222222222222222222222222.e(a11222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 24:
                                i12 = w.p(r02.P);
                                if (i12 == 0) {
                                    int i45 = r02.P;
                                    StringBuilder sb6 = new StringBuilder(89);
                                    sb6.append("Unsupported little endian PCM bit depth: ");
                                    sb6.append(i45);
                                    sb6.append(". Setting mimeType to audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb6.toString());
                                    str6 = str14;
                                    l0Var = null;
                                    str8 = null;
                                    list4 = l0Var;
                                    str = str8;
                                    str3 = str6;
                                    i11 = -1;
                                    arrayList4 = list4;
                                    arrayList3 = arrayList4;
                                    str13 = str3;
                                    i10 = 1;
                                    list3 = arrayList3;
                                    i12 = -1;
                                    bArr = r02.N;
                                    if (bArr != null) {
                                    }
                                    int i252222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                    if (!r02.U) {
                                    }
                                    int i262222222222222222222222222 = i252222222222222222222222222 | i14;
                                    aVar = new n.a();
                                    if (!l.h(str13)) {
                                    }
                                    str9 = r02.f39238a;
                                    if (str9 != null) {
                                    }
                                    aVar.b(i24);
                                    aVar.f6665k = str13;
                                    aVar.f6666l = i11;
                                    aVar.f6658c = r02.W;
                                    aVar.f6659d = i262222222222222222222222222;
                                    aVar.f6667m = list3;
                                    aVar.f6662h = str;
                                    aVar.f6668n = r02.f39248l;
                                    com.google.android.exoplayer2.n a112222222222222222222222222 = aVar.a();
                                    v n102222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                    r02.X = n102222222222222222222222222;
                                    n102222222222222222222222222.e(a112222222222222222222222222);
                                    sparseArray.put(r02.f39240c, r02);
                                    dVar = dVar2;
                                    bVar = null;
                                    break;
                                }
                                list3 = null;
                                i11 = -1;
                                str = null;
                                i10 = 1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222222222222222 = i2522222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222222222222222 = aVar.a();
                                v n1022222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222222222222222;
                                n1022222222222222222222222222.e(a1122222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 25:
                                str6 = "text/x-ssa";
                                l0Var = s.v(d.c0, r02.a(r02.f39239b));
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222222222222222 = i25222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222222222222222 = aVar.a();
                                v n10222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222222222222222;
                                n10222222222222222222222222222.e(a11222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 26:
                                f a15 = f.a(new q(r02.a(r02.f39239b)));
                                r02.Y = a15.f12641b;
                                str7 = "video/hevc";
                                list2 = a15.f12640a;
                                str2 = a15.f12643d;
                                i10 = 1;
                                i12 = -1;
                                List<byte[]> list52 = list2;
                                str13 = str7;
                                list = list52;
                                str = str2;
                                list3 = list;
                                i11 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222222222222222222222 = i252222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222222222222222222222 = aVar.a();
                                v n102222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222222222222222222222;
                                n102222222222222222222222222222.e(a112222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 27:
                                str12 = "application/x-subrip";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222222222222222222 = i2522222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222222222222222222 = aVar.a();
                                v n1022222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222222222222222222;
                                n1022222222222222222222222222222.e(a1122222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 28:
                                str12 = "video/mpeg2";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222222222222222222 = i25222222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222222222222222222 = aVar.a();
                                v n10222222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222222222222222222;
                                n10222222222222222222222222222222.e(a11222222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case 29:
                                str12 = "audio/eac3";
                                str14 = str12;
                                str6 = str14;
                                l0Var = null;
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i252222222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i262222222222222222222222222222222 = i252222222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i262222222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a112222222222222222222222222222222 = aVar.a();
                                v n102222222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n102222222222222222222222222222222;
                                n102222222222222222222222222222222.e(a112222222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                str6 = "audio/flac";
                                l0Var = Collections.singletonList(r02.a(r02.f39239b));
                                str8 = null;
                                list4 = l0Var;
                                str = str8;
                                str3 = str6;
                                i11 = -1;
                                arrayList4 = list4;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i2522222222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i2622222222222222222222222222222222 = i2522222222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i2622222222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a1122222222222222222222222222222222 = aVar.a();
                                v n1022222222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n1022222222222222222222222222222222;
                                n1022222222222222222222222222222222.e(a1122222222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                ArrayList arrayList6 = new ArrayList(3);
                                arrayList6.add(r02.a(r02.f39239b));
                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                arrayList6.add(allocate.order(byteOrder).putLong(r02.R).array());
                                arrayList6.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r02.S).array());
                                str5 = "audio/opus";
                                arrayList2 = arrayList6;
                                i13 = 5760;
                                str = null;
                                String str1622 = str5;
                                i11 = i13;
                                arrayList4 = arrayList2;
                                str3 = str1622;
                                arrayList3 = arrayList4;
                                str13 = str3;
                                i10 = 1;
                                list3 = arrayList3;
                                i12 = -1;
                                bArr = r02.N;
                                if (bArr != null) {
                                }
                                int i25222222222222222222222222222222222 = (r02.V ? 1 : 0) | 0;
                                if (!r02.U) {
                                }
                                int i26222222222222222222222222222222222 = i25222222222222222222222222222222222 | i14;
                                aVar = new n.a();
                                if (!l.h(str13)) {
                                }
                                str9 = r02.f39238a;
                                if (str9 != null) {
                                }
                                aVar.b(i24);
                                aVar.f6665k = str13;
                                aVar.f6666l = i11;
                                aVar.f6658c = r02.W;
                                aVar.f6659d = i26222222222222222222222222222222222;
                                aVar.f6667m = list3;
                                aVar.f6662h = str;
                                aVar.f6668n = r02.f39248l;
                                com.google.android.exoplayer2.n a11222222222222222222222222222222222 = aVar.a();
                                v n10222222222222222222222222222222222 = jVar2.n(r02.f39240c, i10);
                                r02.X = n10222222222222222222222222222222222;
                                n10222222222222222222222222222222222.e(a11222222222222222222222222222222222);
                                sparseArray.put(r02.f39240c, r02);
                                dVar = dVar2;
                                bVar = null;
                                break;
                            default:
                                throw ParserException.a("Unrecognized codec identifier.", null);
                        }
                    } else {
                        bVar = null;
                        dVar = dVar2;
                    }
                    dVar.f39231u = bVar;
                    return;
                }
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            } else if (dVar2.G == 2) {
                int i46 = 0;
                for (int i47 = 0; i47 < dVar2.K; i47++) {
                    i46 += dVar2.L[i47];
                }
                b bVar6 = (b) sparseArray.get(dVar2.M);
                bVar6.X.getClass();
                for (int i48 = 0; i48 < dVar2.K; i48++) {
                    long j15 = ((bVar6.f39242e * i48) / 1000) + dVar2.H;
                    int i49 = dVar2.O;
                    if (i48 == 0 && !dVar2.Q) {
                        i49 |= 1;
                    }
                    int i50 = dVar2.L[i48];
                    i46 -= i50;
                    dVar2.e(bVar6, j15, i49, i50, i46);
                }
                dVar2.G = 0;
            }
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public static final class b {
        public byte[] N;
        public u7.w T;
        public boolean U;
        public v X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f39238a;

        /* renamed from: b  reason: collision with root package name */
        public String f39239b;

        /* renamed from: c  reason: collision with root package name */
        public int f39240c;

        /* renamed from: d  reason: collision with root package name */
        public int f39241d;

        /* renamed from: e  reason: collision with root package name */
        public int f39242e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f39243g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f39244h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f39245i;

        /* renamed from: j  reason: collision with root package name */
        public v.a f39246j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f39247k;

        /* renamed from: l  reason: collision with root package name */
        public com.google.android.exoplayer2.drm.b f39248l;

        /* renamed from: m  reason: collision with root package name */
        public int f39249m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f39250n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f39251o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f39252p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f39253q = 0;
        public int r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f39254s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f39255t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f39256u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f39257v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f39258w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f39259x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f39260y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f39261z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public final byte[] a(String str) {
            String str2;
            byte[] bArr = this.f39247k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing CodecPrivate for codec ".concat(valueOf);
                } else {
                    str2 = new String("Missing CodecPrivate for codec ");
                }
                throw ParserException.a(str2, null);
            }
            return bArr;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        pl.a.h(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", SubsamplingScaleImageView.ORIENTATION_180, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        f39211f0 = Collections.unmodifiableMap(hashMap);
    }

    public d() {
        z7.a aVar = new z7.a();
        this.f39228q = -1L;
        this.r = -9223372036854775807L;
        this.f39229s = -9223372036854775807L;
        this.f39230t = -9223372036854775807L;
        this.f39236z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f39212a = aVar;
        aVar.f39204d = new a();
        this.f39216d = true;
        this.f39214b = new e();
        this.f39215c = new SparseArray<>();
        this.f39218g = new q(4);
        this.f39219h = new q(ByteBuffer.allocate(4).putInt(-1).array());
        this.f39220i = new q(4);
        this.f39217e = new q(m.f5155a);
        this.f = new q(4);
        this.f39221j = new q();
        this.f39222k = new q();
        this.f39223l = new q(8);
        this.f39224m = new q();
        this.f39225n = new q();
        this.L = new int[1];
    }

    public static byte[] i(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        int i6 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i6 * 3600) * 1000000);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - ((i10 * 60) * 1000000);
        int i11 = (int) (j13 / 1000000);
        return w.u(String.format(Locale.US, str, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11))));
    }

    @Override // u7.h
    public final boolean b(i iVar) {
        long c10;
        int i6;
        i5.n nVar = new i5.n(2);
        u7.e eVar = (u7.e) iVar;
        long j10 = eVar.f33871c;
        long j11 = 1024;
        int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i10 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i11 = (int) j11;
        eVar.d(((q) nVar.f19877v).f5186a, 0, 4, false);
        nVar.f19876u = 4;
        for (long r = ((q) nVar.f19877v).r(); r != 440786851; r = ((r << 8) & (-256)) | (((q) nVar.f19877v).f5186a[0] & 255)) {
            int i12 = nVar.f19876u + 1;
            nVar.f19876u = i12;
            if (i12 == i11) {
                return false;
            }
            eVar.d(((q) nVar.f19877v).f5186a, 0, 1, false);
        }
        long c11 = nVar.c(eVar);
        long j12 = nVar.f19876u;
        if (c11 == Long.MIN_VALUE) {
            return false;
        }
        if (i10 != 0 && j12 + c11 >= j10) {
            return false;
        }
        while (true) {
            int i13 = (nVar.f19876u > (j12 + c11) ? 1 : (nVar.f19876u == (j12 + c11) ? 0 : -1));
            if (i13 < 0) {
                if (nVar.c(eVar) == Long.MIN_VALUE || (nVar.c(eVar)) < 0 || c10 > 2147483647L) {
                    return false;
                }
                if (i6 != 0) {
                    int i14 = (int) c10;
                    eVar.m(i14, false);
                    nVar.f19876u += i14;
                }
            } else if (i13 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final void c(int i6) {
        if (this.C != null && this.D != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Element ");
        sb2.append(i6);
        sb2.append(" must be in a Cues");
        throw ParserException.a(sb2.toString(), null);
    }

    public final void d(int i6) {
        if (this.f39231u != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i6);
        sb2.append(" must be in a TrackEntry");
        throw ParserException.a(sb2.toString(), null);
    }

    public final void e(b bVar, long j10, int i6, int i10, int i11) {
        byte[] i12;
        int i13;
        u7.w wVar = bVar.T;
        if (wVar != null) {
            wVar.b(bVar.X, j10, i6, i10, i11, bVar.f39246j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f39239b) || "S_TEXT/ASS".equals(bVar.f39239b)) {
                if (this.K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bVar.f39239b;
                        q qVar = this.f39222k;
                        byte[] bArr = qVar.f5186a;
                        str.getClass();
                        if (!str.equals("S_TEXT/ASS")) {
                            if (str.equals("S_TEXT/UTF8")) {
                                i12 = i(j11, "%02d:%02d:%02d,%03d", 1000L);
                                i13 = 19;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            i12 = i(j11, "%01d:%02d:%02d:%02d", 10000L);
                            i13 = 21;
                        }
                        System.arraycopy(i12, 0, bArr, i13, i12.length);
                        int i14 = qVar.f5187b;
                        while (true) {
                            if (i14 >= qVar.f5188c) {
                                break;
                            } else if (qVar.f5186a[i14] == 0) {
                                qVar.z(i14);
                                break;
                            } else {
                                i14++;
                            }
                        }
                        bVar.X.a(qVar.f5188c, qVar);
                        i10 += qVar.f5188c;
                    }
                }
            }
            if ((268435456 & i6) != 0) {
                if (this.K > 1) {
                    i6 &= -268435457;
                } else {
                    q qVar2 = this.f39225n;
                    int i15 = qVar2.f5188c;
                    bVar.X.b(qVar2, i15);
                    i10 += i15;
                }
            }
            bVar.X.d(j10, i6, i10, i11, bVar.f39246j);
        }
        this.F = true;
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f39213a0 = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        z7.a aVar = (z7.a) this.f39212a;
        aVar.f39205e = 0;
        aVar.f39202b.clear();
        e eVar = aVar.f39203c;
        eVar.f39264b = 0;
        eVar.f39265c = 0;
        e eVar2 = this.f39214b;
        eVar2.f39264b = 0;
        eVar2.f39265c = 0;
        k();
        int i6 = 0;
        while (true) {
            SparseArray<b> sparseArray = this.f39215c;
            if (i6 < sparseArray.size()) {
                u7.w wVar = sparseArray.valueAt(i6).T;
                if (wVar != null) {
                    wVar.f33918b = false;
                    wVar.f33919c = 0;
                }
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0487, code lost:
        throw com.google.android.exoplayer2.ParserException.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0753, code lost:
        r1 = new java.lang.StringBuilder(53);
        r1.append("DocTypeReadVersion ");
        r1.append(r11);
        r1.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x076e, code lost:
        throw com.google.android.exoplayer2.ParserException.a(r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x09a7, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x09a8, code lost:
        if (r5 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x09aa, code lost:
        r3 = r38.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x09b0, code lost:
        if (r37.f39235y == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x09b2, code lost:
        r37.A = r3;
        r6 = r39;
        r6.f33905a = r37.f39236z;
        r37.f39235y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x09bd, code lost:
        r6 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x09c1, code lost:
        if (r37.f39232v == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x09c3, code lost:
        r2 = r37.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x09c9, code lost:
        if (r2 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x09cb, code lost:
        r6.f33905a = r2;
        r37.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x09cf, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x09d1, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x09d3, code lost:
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x09d5, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x09d6, code lost:
        r6 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x09ee, code lost:
        if (r5 != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x09f0, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x09f1, code lost:
        r1 = r37.f39215c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x09f7, code lost:
        if (r3 >= r1.size()) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x09f9, code lost:
        r1 = r1.valueAt(r3);
        r1.X.getClass();
        r2 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a06, code lost:
        if (r2 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a08, code lost:
        r2.a(r1.X, r1.f39246j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a0f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0a12, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a14, code lost:
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a4  */
    /* JADX WARN: Type inference failed for: r14v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v77 */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(i iVar, u7.s sVar) {
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        String str;
        q qVar;
        int i11;
        int[] iArr;
        q qVar2;
        q qVar3;
        long j10;
        q qVar4;
        int i12;
        byte[] bArr;
        int i13;
        double longBitsToDouble;
        long j11;
        boolean z13;
        u7.s sVar2;
        u7.s sVar3 = sVar;
        boolean z14 = false;
        this.F = false;
        boolean z15 = true;
        boolean z16 = true;
        while (true) {
            int i14 = -1;
            if (z16 && !this.F) {
                z7.a aVar = (z7.a) this.f39212a;
                sc.b.E(aVar.f39204d);
                boolean z17 = z14;
                while (true) {
                    ArrayDeque<a.C0670a> arrayDeque = aVar.f39202b;
                    a.C0670a peek = arrayDeque.peek();
                    if (peek != null && iVar.getPosition() >= peek.f39208b) {
                        ((a) aVar.f39204d).a(arrayDeque.pop().f39207a);
                    } else {
                        int i15 = aVar.f39205e;
                        int i16 = 8;
                        int i17 = 4;
                        byte[] bArr2 = aVar.f39201a;
                        e eVar = aVar.f39203c;
                        if (i15 == 0) {
                            long b10 = eVar.b(iVar, z15, z17, 4);
                            if (b10 == -2) {
                                iVar.k();
                                while (true) {
                                    iVar.b(z17 ? 1 : 0, bArr2, i17);
                                    byte b11 = bArr2[z17 ? 1 : 0];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i16) {
                                            int i19 = ((e.f39262d[i18] & b11) > 0L ? 1 : ((e.f39262d[i18] & b11) == 0L ? 0 : -1));
                                            i18++;
                                            if (i19 == 0) {
                                                i16 = 8;
                                            }
                                        } else {
                                            i18 = -1;
                                        }
                                    }
                                    if (i18 != i14 && i18 <= 4) {
                                        int a10 = (int) e.a(bArr2, i18, z17);
                                        d.this.getClass();
                                        if (a10 != 357149030 && a10 != 524531317 && a10 != 475249515 && a10 != 374648427) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        if (z13) {
                                            iVar.l(i18);
                                            j11 = a10;
                                            z15 = true;
                                        }
                                    }
                                    iVar.l(1);
                                    i16 = 8;
                                    i17 = 4;
                                }
                            } else {
                                j11 = b10;
                            }
                            if (j11 == -1) {
                                z10 = false;
                                z16 = false;
                            } else {
                                aVar.f = (int) j11;
                                aVar.f39205e = z15 ? 1 : 0;
                            }
                        }
                        if (aVar.f39205e == z15) {
                            aVar.f39206g = eVar.b(iVar, z17, z15, 8);
                            aVar.f39205e = 2;
                        }
                        z7.b bVar = aVar.f39204d;
                        int i20 = aVar.f;
                        d.this.getClass();
                        int i21 = 3;
                        switch (i20) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i6 = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i6 = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i6 = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i6 = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i6 = 5;
                                break;
                            default:
                                i6 = 0;
                                break;
                        }
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            if (i6 == 5) {
                                                long j12 = aVar.f39206g;
                                                if (j12 != 4 && j12 != 8) {
                                                    StringBuilder sb2 = new StringBuilder(40);
                                                    sb2.append("Invalid float size: ");
                                                    sb2.append(j12);
                                                    throw ParserException.a(sb2.toString(), null);
                                                }
                                                z7.b bVar2 = aVar.f39204d;
                                                int i22 = aVar.f;
                                                int i23 = (int) j12;
                                                iVar.readFully(bArr2, z17 ? 1 : 0, i23);
                                                long j13 = 0;
                                                for (int i24 = 0; i24 < i23; i24++) {
                                                    j13 = (j13 << 8) | (bArr2[i24] & 255);
                                                }
                                                if (i23 == 4) {
                                                    longBitsToDouble = Float.intBitsToFloat((int) j13);
                                                } else {
                                                    longBitsToDouble = Double.longBitsToDouble(j13);
                                                }
                                                d dVar = d.this;
                                                if (i22 != 181) {
                                                    if (i22 != 17545) {
                                                        switch (i22) {
                                                            case 21969:
                                                                dVar.d(i22);
                                                                dVar.f39231u.D = (float) longBitsToDouble;
                                                                break;
                                                            case 21970:
                                                                dVar.d(i22);
                                                                dVar.f39231u.E = (float) longBitsToDouble;
                                                                break;
                                                            case 21971:
                                                                dVar.d(i22);
                                                                dVar.f39231u.F = (float) longBitsToDouble;
                                                                break;
                                                            case 21972:
                                                                dVar.d(i22);
                                                                dVar.f39231u.G = (float) longBitsToDouble;
                                                                break;
                                                            case 21973:
                                                                dVar.d(i22);
                                                                dVar.f39231u.H = (float) longBitsToDouble;
                                                                break;
                                                            case 21974:
                                                                dVar.d(i22);
                                                                dVar.f39231u.I = (float) longBitsToDouble;
                                                                break;
                                                            case 21975:
                                                                dVar.d(i22);
                                                                dVar.f39231u.J = (float) longBitsToDouble;
                                                                break;
                                                            case 21976:
                                                                dVar.d(i22);
                                                                dVar.f39231u.K = (float) longBitsToDouble;
                                                                break;
                                                            case 21977:
                                                                dVar.d(i22);
                                                                dVar.f39231u.L = (float) longBitsToDouble;
                                                                break;
                                                            case 21978:
                                                                dVar.d(i22);
                                                                dVar.f39231u.M = (float) longBitsToDouble;
                                                                break;
                                                            default:
                                                                switch (i22) {
                                                                    case 30323:
                                                                        dVar.d(i22);
                                                                        dVar.f39231u.f39254s = (float) longBitsToDouble;
                                                                        break;
                                                                    case 30324:
                                                                        dVar.d(i22);
                                                                        dVar.f39231u.f39255t = (float) longBitsToDouble;
                                                                        break;
                                                                    case 30325:
                                                                        dVar.d(i22);
                                                                        dVar.f39231u.f39256u = (float) longBitsToDouble;
                                                                        break;
                                                                    default:
                                                                        dVar.getClass();
                                                                        break;
                                                                }
                                                        }
                                                    } else {
                                                        dVar.f39229s = (long) longBitsToDouble;
                                                    }
                                                } else {
                                                    dVar.d(i22);
                                                    dVar.f39231u.Q = (int) longBitsToDouble;
                                                }
                                                aVar.f39205e = z17 ? 1 : 0;
                                            } else {
                                                StringBuilder sb3 = new StringBuilder(32);
                                                sb3.append("Invalid element type ");
                                                sb3.append(i6);
                                                throw ParserException.a(sb3.toString(), null);
                                            }
                                        } else {
                                            z7.b bVar3 = aVar.f39204d;
                                            int i25 = aVar.f;
                                            int i26 = (int) aVar.f39206g;
                                            d dVar2 = d.this;
                                            SparseArray<b> sparseArray = dVar2.f39215c;
                                            if (i25 != 161 && i25 != 163) {
                                                if (i25 != 165) {
                                                    if (i25 != 16877) {
                                                        if (i25 != 16981) {
                                                            if (i25 != 18402) {
                                                                if (i25 != 21419) {
                                                                    if (i25 != 25506) {
                                                                        if (i25 == 30322) {
                                                                            dVar2.d(i25);
                                                                            byte[] bArr3 = new byte[i26];
                                                                            dVar2.f39231u.f39257v = bArr3;
                                                                            iVar.readFully(bArr3, z17 ? 1 : 0, i26);
                                                                        } else {
                                                                            StringBuilder sb4 = new StringBuilder(26);
                                                                            sb4.append("Unexpected id: ");
                                                                            sb4.append(i25);
                                                                            throw ParserException.a(sb4.toString(), null);
                                                                        }
                                                                    } else {
                                                                        dVar2.d(i25);
                                                                        byte[] bArr4 = new byte[i26];
                                                                        dVar2.f39231u.f39247k = bArr4;
                                                                        iVar.readFully(bArr4, z17 ? 1 : 0, i26);
                                                                    }
                                                                } else {
                                                                    q qVar5 = dVar2.f39220i;
                                                                    Arrays.fill(qVar5.f5186a, z17 ? (byte) 1 : (byte) 0);
                                                                    iVar.readFully(qVar5.f5186a, 4 - i26, i26);
                                                                    qVar5.A(z17 ? 1 : 0);
                                                                    dVar2.f39233w = (int) qVar5.r();
                                                                }
                                                            } else {
                                                                byte[] bArr5 = new byte[i26];
                                                                iVar.readFully(bArr5, z17 ? 1 : 0, i26);
                                                                dVar2.d(i25);
                                                                dVar2.f39231u.f39246j = new v.a(1, z17 ? 1 : 0, z17 ? 1 : 0, bArr5);
                                                            }
                                                        } else {
                                                            dVar2.d(i25);
                                                            byte[] bArr6 = new byte[i26];
                                                            dVar2.f39231u.f39245i = bArr6;
                                                            iVar.readFully(bArr6, z17 ? 1 : 0, i26);
                                                        }
                                                    } else {
                                                        dVar2.d(i25);
                                                        b bVar4 = dVar2.f39231u;
                                                        int i27 = bVar4.f39243g;
                                                        if (i27 != 1685485123 && i27 != 1685480259) {
                                                            iVar.l(i26);
                                                        } else {
                                                            byte[] bArr7 = new byte[i26];
                                                            bVar4.N = bArr7;
                                                            iVar.readFully(bArr7, z17 ? 1 : 0, i26);
                                                        }
                                                    }
                                                } else if (dVar2.G == 2) {
                                                    b bVar5 = sparseArray.get(dVar2.M);
                                                    if (dVar2.P == 4 && "V_VP9".equals(bVar5.f39239b)) {
                                                        q qVar6 = dVar2.f39225n;
                                                        qVar6.x(i26);
                                                        iVar.readFully(qVar6.f5186a, z17 ? 1 : 0, i26);
                                                    } else {
                                                        iVar.l(i26);
                                                    }
                                                }
                                            } else {
                                                int i28 = dVar2.G;
                                                q qVar7 = dVar2.f39218g;
                                                if (i28 == 0) {
                                                    e eVar2 = dVar2.f39214b;
                                                    dVar2.M = (int) eVar2.b(iVar, z17, true, 8);
                                                    dVar2.N = eVar2.f39265c;
                                                    dVar2.I = -9223372036854775807L;
                                                    dVar2.G = 1;
                                                    qVar = qVar7;
                                                    qVar.x(z17 ? 1 : 0);
                                                } else {
                                                    qVar = qVar7;
                                                }
                                                b bVar6 = sparseArray.get(dVar2.M);
                                                if (bVar6 == null) {
                                                    iVar.l(i26 - dVar2.N);
                                                    dVar2.G = z17 ? 1 : 0;
                                                } else {
                                                    bVar6.X.getClass();
                                                    if (dVar2.G == 1) {
                                                        dVar2.j(iVar, 3);
                                                        int i29 = (qVar.f5186a[2] & 6) >> 1;
                                                        if (i29 == 0) {
                                                            dVar2.K = 1;
                                                            int[] iArr2 = dVar2.L;
                                                            if (iArr2 == null) {
                                                                iArr2 = new int[1];
                                                            } else if (iArr2.length < 1) {
                                                                iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                                                            }
                                                            dVar2.L = iArr2;
                                                            iArr2[z17 ? 1 : 0] = (i26 - dVar2.N) - 3;
                                                        } else {
                                                            dVar2.j(iVar, 4);
                                                            int i30 = (qVar.f5186a[3] & 255) + 1;
                                                            dVar2.K = i30;
                                                            int[] iArr3 = dVar2.L;
                                                            if (iArr3 == null) {
                                                                iArr3 = new int[i30];
                                                            } else if (iArr3.length < i30) {
                                                                int length = iArr3.length;
                                                                i11 = 2;
                                                                iArr = new int[Math.max(length * 2, i30)];
                                                                dVar2.L = iArr;
                                                                if (i29 != i11) {
                                                                    int i31 = dVar2.K;
                                                                    Arrays.fill(iArr, z17 ? 1 : 0, i31, ((i26 - dVar2.N) - 4) / i31);
                                                                } else {
                                                                    int i32 = 1;
                                                                    if (i29 == 1) {
                                                                        int i33 = 0;
                                                                        int i34 = 0;
                                                                        int i35 = 4;
                                                                        while (true) {
                                                                            int i36 = dVar2.K - 1;
                                                                            if (i33 < i36) {
                                                                                dVar2.L[i33] = z17 ? 1 : 0;
                                                                                while (true) {
                                                                                    i35 += i32;
                                                                                    dVar2.j(iVar, i35);
                                                                                    int i37 = qVar.f5186a[i35 - 1] & 255;
                                                                                    int[] iArr4 = dVar2.L;
                                                                                    i12 = iArr4[i33] + i37;
                                                                                    iArr4[i33] = i12;
                                                                                    if (i37 != 255) {
                                                                                        break;
                                                                                    }
                                                                                    i32 = 1;
                                                                                }
                                                                                i34 += i12;
                                                                                i33++;
                                                                                i32 = 1;
                                                                            } else {
                                                                                dVar2.L[i36] = ((i26 - dVar2.N) - i35) - i34;
                                                                            }
                                                                        }
                                                                    } else if (i29 == 3) {
                                                                        int i38 = 0;
                                                                        int i39 = 0;
                                                                        int i40 = 4;
                                                                        ?? r32 = z17;
                                                                        while (true) {
                                                                            int i41 = dVar2.K - 1;
                                                                            if (i38 < i41) {
                                                                                dVar2.L[i38] = r32;
                                                                                i40++;
                                                                                dVar2.j(iVar, i40);
                                                                                int i42 = i40 - 1;
                                                                                if (qVar.f5186a[i42] != 0) {
                                                                                    int i43 = 8;
                                                                                    int i44 = 0;
                                                                                    while (true) {
                                                                                        if (i44 < i43) {
                                                                                            int i45 = 1 << (7 - i44);
                                                                                            if ((qVar.f5186a[i42] & i45) != 0) {
                                                                                                int i46 = i40 + i44;
                                                                                                dVar2.j(iVar, i46);
                                                                                                q qVar8 = qVar;
                                                                                                j10 = qVar.f5186a[i42] & 255 & (~i45);
                                                                                                int i47 = i42 + 1;
                                                                                                while (i47 < i46) {
                                                                                                    j10 = (j10 << 8) | (qVar4.f5186a[i47] & 255);
                                                                                                    i47++;
                                                                                                    i46 = i46;
                                                                                                    qVar8 = qVar8;
                                                                                                }
                                                                                                qVar3 = qVar8;
                                                                                                int i48 = i46;
                                                                                                if (i38 > 0) {
                                                                                                    j10 -= (1 << ((i44 * 7) + 6)) - 1;
                                                                                                }
                                                                                                i40 = i48;
                                                                                            } else {
                                                                                                i44++;
                                                                                                i43 = 8;
                                                                                            }
                                                                                        } else {
                                                                                            qVar3 = qVar;
                                                                                            j10 = 0;
                                                                                        }
                                                                                    }
                                                                                    if (j10 >= -2147483648L && j10 <= 2147483647L) {
                                                                                        int i49 = (int) j10;
                                                                                        int[] iArr5 = dVar2.L;
                                                                                        if (i38 != 0) {
                                                                                            i49 += iArr5[i38 - 1];
                                                                                        }
                                                                                        iArr5[i38] = i49;
                                                                                        i39 += i49;
                                                                                        i38++;
                                                                                        qVar = qVar3;
                                                                                        r32 = 0;
                                                                                    }
                                                                                } else {
                                                                                    throw ParserException.a("No valid varint length mask found", null);
                                                                                }
                                                                            } else {
                                                                                qVar2 = qVar;
                                                                                dVar2.L[i41] = ((i26 - dVar2.N) - i40) - i39;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb5 = new StringBuilder(36);
                                                                        sb5.append("Unexpected lacing value: ");
                                                                        sb5.append(i29);
                                                                        throw ParserException.a(sb5.toString(), null);
                                                                    }
                                                                }
                                                            }
                                                            iArr = iArr3;
                                                            i11 = 2;
                                                            dVar2.L = iArr;
                                                            if (i29 != i11) {
                                                            }
                                                        }
                                                        qVar2 = qVar;
                                                        int i50 = qVar2.f5186a[1] & 255;
                                                        dVar2.H = dVar2.l(i50 | (bArr[0] << 8)) + dVar2.B;
                                                        if (bVar6.f39241d != 2 && (i25 != 163 || (qVar2.f5186a[2] & 128) != 128)) {
                                                            i13 = 0;
                                                        } else {
                                                            i13 = 1;
                                                        }
                                                        dVar2.O = i13;
                                                        dVar2.G = 2;
                                                        dVar2.J = 0;
                                                    }
                                                    if (i25 == 163) {
                                                        while (true) {
                                                            int i51 = dVar2.J;
                                                            if (i51 < dVar2.K) {
                                                                dVar2.e(bVar6, ((dVar2.J * bVar6.f39242e) / 1000) + dVar2.H, dVar2.O, dVar2.m(dVar2.L[i51], iVar, bVar6), 0);
                                                                dVar2.J++;
                                                            } else {
                                                                dVar2.G = 0;
                                                            }
                                                        }
                                                    } else {
                                                        while (true) {
                                                            int i52 = dVar2.J;
                                                            if (i52 < dVar2.K) {
                                                                int[] iArr6 = dVar2.L;
                                                                iArr6[i52] = dVar2.m(iArr6[i52], iVar, bVar6);
                                                                dVar2.J++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            aVar.f39205e = 0;
                                        }
                                    } else {
                                        long j14 = aVar.f39206g;
                                        if (j14 <= 2147483647L) {
                                            z7.b bVar7 = aVar.f39204d;
                                            int i53 = aVar.f;
                                            int i54 = (int) j14;
                                            if (i54 == 0) {
                                                str = "";
                                            } else {
                                                byte[] bArr8 = new byte[i54];
                                                iVar.readFully(bArr8, 0, i54);
                                                while (i54 > 0) {
                                                    int i55 = i54 - 1;
                                                    if (bArr8[i55] == 0) {
                                                        i54 = i55;
                                                    } else {
                                                        str = new String(bArr8, 0, i54);
                                                    }
                                                }
                                                str = new String(bArr8, 0, i54);
                                            }
                                            d dVar3 = d.this;
                                            dVar3.getClass();
                                            if (i53 != 134) {
                                                if (i53 != 17026) {
                                                    if (i53 != 21358) {
                                                        if (i53 == 2274716) {
                                                            dVar3.d(i53);
                                                            dVar3.f39231u.W = str;
                                                        }
                                                    } else {
                                                        dVar3.d(i53);
                                                        dVar3.f39231u.f39238a = str;
                                                    }
                                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                                    StringBuilder sb6 = new StringBuilder(str.length() + 22);
                                                    sb6.append("DocType ");
                                                    sb6.append(str);
                                                    sb6.append(" not supported");
                                                    throw ParserException.a(sb6.toString(), null);
                                                }
                                            } else {
                                                dVar3.d(i53);
                                                dVar3.f39231u.f39239b = str;
                                            }
                                            z10 = false;
                                            aVar.f39205e = 0;
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(41);
                                            sb7.append("String element size: ");
                                            sb7.append(j14);
                                            throw ParserException.a(sb7.toString(), null);
                                        }
                                    }
                                } else {
                                    long j15 = aVar.f39206g;
                                    if (j15 <= 8) {
                                        z7.b bVar8 = aVar.f39204d;
                                        int i56 = aVar.f;
                                        int i57 = (int) j15;
                                        iVar.readFully(bArr2, 0, i57);
                                        int i58 = 0;
                                        long j16 = 0;
                                        while (i58 < i57) {
                                            j16 = (j16 << 8) | (bArr2[i58] & 255);
                                            i58++;
                                            bArr2 = bArr2;
                                        }
                                        d dVar4 = d.this;
                                        dVar4.getClass();
                                        if (i56 != 20529) {
                                            if (i56 != 20530) {
                                                switch (i56) {
                                                    case 131:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39241d = (int) j16;
                                                        break;
                                                    case 136:
                                                        dVar4.d(i56);
                                                        b bVar9 = dVar4.f39231u;
                                                        if (j16 == 1) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        bVar9.V = z11;
                                                        break;
                                                    case 155:
                                                        dVar4.I = dVar4.l(j16);
                                                        break;
                                                    case 159:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.O = (int) j16;
                                                        break;
                                                    case 176:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39249m = (int) j16;
                                                        break;
                                                    case 179:
                                                        dVar4.c(i56);
                                                        dVar4.C.a(dVar4.l(j16));
                                                        break;
                                                    case 186:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39250n = (int) j16;
                                                        break;
                                                    case 215:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39240c = (int) j16;
                                                        break;
                                                    case 231:
                                                        dVar4.B = dVar4.l(j16);
                                                        break;
                                                    case 238:
                                                        dVar4.P = (int) j16;
                                                        break;
                                                    case 241:
                                                        if (!dVar4.E) {
                                                            dVar4.c(i56);
                                                            dVar4.D.a(j16);
                                                            dVar4.E = true;
                                                            break;
                                                        }
                                                        break;
                                                    case 251:
                                                        dVar4.Q = true;
                                                        break;
                                                    case 16871:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39243g = (int) j16;
                                                        break;
                                                    case 16980:
                                                        if (j16 != 3) {
                                                            StringBuilder sb8 = new StringBuilder(50);
                                                            sb8.append("ContentCompAlgo ");
                                                            sb8.append(j16);
                                                            sb8.append(" not supported");
                                                            throw ParserException.a(sb8.toString(), null);
                                                        }
                                                        break;
                                                    case 17029:
                                                        if (j16 < 1 || j16 > 2) {
                                                        }
                                                        break;
                                                    case 17143:
                                                        if (j16 != 1) {
                                                            StringBuilder sb9 = new StringBuilder(50);
                                                            sb9.append("EBMLReadVersion ");
                                                            sb9.append(j16);
                                                            sb9.append(" not supported");
                                                            throw ParserException.a(sb9.toString(), null);
                                                        }
                                                        break;
                                                    case 18401:
                                                        if (j16 != 5) {
                                                            StringBuilder sb10 = new StringBuilder(49);
                                                            sb10.append("ContentEncAlgo ");
                                                            sb10.append(j16);
                                                            sb10.append(" not supported");
                                                            throw ParserException.a(sb10.toString(), null);
                                                        }
                                                        break;
                                                    case 18408:
                                                        if (j16 != 1) {
                                                            StringBuilder sb11 = new StringBuilder(56);
                                                            sb11.append("AESSettingsCipherMode ");
                                                            sb11.append(j16);
                                                            sb11.append(" not supported");
                                                            throw ParserException.a(sb11.toString(), null);
                                                        }
                                                        break;
                                                    case 21420:
                                                        dVar4.f39234x = j16 + dVar4.f39228q;
                                                        break;
                                                    case 21432:
                                                        int i59 = (int) j16;
                                                        dVar4.d(i56);
                                                        if (i59 != 0) {
                                                            if (i59 != 1) {
                                                                if (i59 != 3) {
                                                                    if (i59 == 15) {
                                                                        dVar4.f39231u.f39258w = 3;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    dVar4.f39231u.f39258w = 1;
                                                                    break;
                                                                }
                                                            } else {
                                                                dVar4.f39231u.f39258w = 2;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar4.f39231u.f39258w = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 21680:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39251o = (int) j16;
                                                        break;
                                                    case 21682:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39253q = (int) j16;
                                                        break;
                                                    case 21690:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39252p = (int) j16;
                                                        break;
                                                    case 21930:
                                                        dVar4.d(i56);
                                                        b bVar10 = dVar4.f39231u;
                                                        if (j16 == 1) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        bVar10.U = z12;
                                                        break;
                                                    case 21998:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f = (int) j16;
                                                        break;
                                                    case 22186:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.R = j16;
                                                        break;
                                                    case 22203:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.S = j16;
                                                        break;
                                                    case 25188:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.P = (int) j16;
                                                        break;
                                                    case 30321:
                                                        dVar4.d(i56);
                                                        int i60 = (int) j16;
                                                        if (i60 != 0) {
                                                            if (i60 != 1) {
                                                                if (i60 != 2) {
                                                                    if (i60 == 3) {
                                                                        dVar4.f39231u.r = 3;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    dVar4.f39231u.r = 2;
                                                                    break;
                                                                }
                                                            } else {
                                                                dVar4.f39231u.r = 1;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar4.f39231u.r = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 2352003:
                                                        dVar4.d(i56);
                                                        dVar4.f39231u.f39242e = (int) j16;
                                                        break;
                                                    case 2807729:
                                                        dVar4.r = j16;
                                                        break;
                                                    default:
                                                        switch (i56) {
                                                            case 21945:
                                                                dVar4.d(i56);
                                                                int i61 = (int) j16;
                                                                if (i61 != 1) {
                                                                    if (i61 == 2) {
                                                                        dVar4.f39231u.A = 1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    dVar4.f39231u.A = 2;
                                                                    break;
                                                                }
                                                                break;
                                                            case 21946:
                                                                dVar4.d(i56);
                                                                int i62 = (int) j16;
                                                                if (i62 != 1) {
                                                                    if (i62 != 16) {
                                                                        if (i62 != 18) {
                                                                            if (i62 != 6 && i62 != 7) {
                                                                                i21 = -1;
                                                                            }
                                                                        } else {
                                                                            i21 = 7;
                                                                        }
                                                                    } else {
                                                                        i21 = 6;
                                                                    }
                                                                }
                                                                if (i21 != -1) {
                                                                    dVar4.f39231u.f39261z = i21;
                                                                    break;
                                                                }
                                                                break;
                                                            case 21947:
                                                                dVar4.d(i56);
                                                                b bVar11 = dVar4.f39231u;
                                                                bVar11.f39259x = true;
                                                                int i63 = (int) j16;
                                                                if (i63 != 1) {
                                                                    if (i63 != 9) {
                                                                        if (i63 != 4 && i63 != 5 && i63 != 6 && i63 != 7) {
                                                                            i10 = -1;
                                                                        } else {
                                                                            i10 = 2;
                                                                        }
                                                                    } else {
                                                                        i10 = 6;
                                                                    }
                                                                } else {
                                                                    i10 = 1;
                                                                }
                                                                if (i10 != -1) {
                                                                    bVar11.f39260y = i10;
                                                                    break;
                                                                }
                                                                break;
                                                            case 21948:
                                                                dVar4.d(i56);
                                                                dVar4.f39231u.B = (int) j16;
                                                                break;
                                                            case 21949:
                                                                dVar4.d(i56);
                                                                dVar4.f39231u.C = (int) j16;
                                                                break;
                                                        }
                                                }
                                            } else if (j16 != 1) {
                                                StringBuilder sb12 = new StringBuilder(55);
                                                sb12.append("ContentEncodingScope ");
                                                sb12.append(j16);
                                                sb12.append(" not supported");
                                                throw ParserException.a(sb12.toString(), null);
                                            }
                                        } else if (j16 != 0) {
                                            StringBuilder sb13 = new StringBuilder(55);
                                            sb13.append("ContentEncodingOrder ");
                                            sb13.append(j16);
                                            sb13.append(" not supported");
                                            throw ParserException.a(sb13.toString(), null);
                                        }
                                        z10 = false;
                                        aVar.f39205e = 0;
                                    } else {
                                        StringBuilder sb14 = new StringBuilder(42);
                                        sb14.append("Invalid integer size: ");
                                        sb14.append(j15);
                                        throw ParserException.a(sb14.toString(), null);
                                    }
                                }
                            } else {
                                long position = iVar.getPosition();
                                arrayDeque.push(new a.C0670a(aVar.f, aVar.f39206g + position));
                                z7.b bVar12 = aVar.f39204d;
                                int i64 = aVar.f;
                                long j17 = aVar.f39206g;
                                d dVar5 = d.this;
                                sc.b.E(dVar5.f39213a0);
                                if (i64 != 160) {
                                    if (i64 != 174) {
                                        if (i64 != 187) {
                                            if (i64 != 19899) {
                                                if (i64 != 20533) {
                                                    if (i64 != 21968) {
                                                        if (i64 != 408125543) {
                                                            if (i64 != 475249515) {
                                                                if (i64 == 524531317 && !dVar5.f39232v) {
                                                                    if (dVar5.f39216d && dVar5.f39236z != -1) {
                                                                        dVar5.f39235y = true;
                                                                    } else {
                                                                        dVar5.f39213a0.i(new t.b(dVar5.f39230t));
                                                                        dVar5.f39232v = true;
                                                                    }
                                                                }
                                                            } else {
                                                                dVar5.C = new i5.n(3);
                                                                dVar5.D = new i5.n(3);
                                                            }
                                                        } else {
                                                            long j18 = dVar5.f39228q;
                                                            if (j18 != -1 && j18 != position) {
                                                                throw ParserException.a("Multiple Segment elements not supported", null);
                                                            }
                                                            dVar5.f39228q = position;
                                                            dVar5.f39227p = j17;
                                                        }
                                                    } else {
                                                        dVar5.d(i64);
                                                        dVar5.f39231u.f39259x = true;
                                                    }
                                                } else {
                                                    dVar5.d(i64);
                                                    dVar5.f39231u.f39244h = true;
                                                }
                                            } else {
                                                dVar5.f39233w = -1;
                                                dVar5.f39234x = -1L;
                                            }
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                            dVar5.E = false;
                                        }
                                    } else {
                                        z10 = false;
                                        dVar5.f39231u = new b();
                                    }
                                } else {
                                    z10 = false;
                                    dVar5.Q = false;
                                }
                                aVar.f39205e = z10 ? 1 : 0;
                            }
                        } else {
                            iVar.l((int) aVar.f39206g);
                            z17 = false;
                            aVar.f39205e = 0;
                            sVar3 = sVar3;
                            z15 = true;
                            i14 = -1;
                        }
                    }
                }
            }
            sVar3 = sVar2;
            z14 = false;
            z15 = true;
        }
    }

    public final void j(i iVar, int i6) {
        q qVar = this.f39218g;
        if (qVar.f5188c >= i6) {
            return;
        }
        byte[] bArr = qVar.f5186a;
        if (bArr.length < i6) {
            qVar.a(Math.max(bArr.length * 2, i6));
        }
        byte[] bArr2 = qVar.f5186a;
        int i10 = qVar.f5188c;
        iVar.readFully(bArr2, i10, i6 - i10);
        qVar.z(i6);
    }

    public final void k() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f39221j.x(0);
    }

    public final long l(long j10) {
        long j11 = this.r;
        if (j11 != -9223372036854775807L) {
            return w.C(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(int i6, i iVar, b bVar) {
        int c10;
        int c11;
        boolean z10;
        boolean z11;
        int i10;
        if ("S_TEXT/UTF8".equals(bVar.f39239b)) {
            n(iVar, f39209b0, i6);
            int i11 = this.S;
            k();
            return i11;
        } else if ("S_TEXT/ASS".equals(bVar.f39239b)) {
            n(iVar, f39210d0, i6);
            int i12 = this.S;
            k();
            return i12;
        } else {
            v vVar = bVar.X;
            boolean z12 = this.U;
            q qVar = this.f39221j;
            boolean z13 = true;
            if (!z12) {
                boolean z14 = bVar.f39244h;
                q qVar2 = this.f39218g;
                if (z14) {
                    this.O &= -1073741825;
                    int i13 = 128;
                    if (!this.V) {
                        iVar.readFully(qVar2.f5186a, 0, 1);
                        this.R++;
                        byte b10 = qVar2.f5186a[0];
                        if ((b10 & 128) != 128) {
                            this.Y = b10;
                            this.V = true;
                        } else {
                            throw ParserException.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b11 = this.Y;
                    if ((b11 & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if ((b11 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.O |= 1073741824;
                        if (!this.Z) {
                            q qVar3 = this.f39223l;
                            iVar.readFully(qVar3.f5186a, 0, 8);
                            this.R += 8;
                            this.Z = true;
                            byte[] bArr = qVar2.f5186a;
                            if (!z11) {
                                i13 = 0;
                            }
                            bArr[0] = (byte) (i13 | 8);
                            qVar2.A(0);
                            vVar.b(qVar2, 1);
                            this.S++;
                            qVar3.A(0);
                            vVar.b(qVar3, 8);
                            this.S += 8;
                        }
                        if (z11) {
                            if (!this.W) {
                                iVar.readFully(qVar2.f5186a, 0, 1);
                                this.R++;
                                qVar2.A(0);
                                this.X = qVar2.q();
                                this.W = true;
                            }
                            int i14 = this.X * 4;
                            qVar2.x(i14);
                            iVar.readFully(qVar2.f5186a, 0, i14);
                            this.R += i14;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i15 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f39226o;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f39226o = ByteBuffer.allocate(i15);
                            }
                            this.f39226o.position(0);
                            this.f39226o.putShort(s10);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i10 = this.X;
                                if (i16 >= i10) {
                                    break;
                                }
                                int t3 = qVar2.t();
                                if (i16 % 2 == 0) {
                                    this.f39226o.putShort((short) (t3 - i17));
                                } else {
                                    this.f39226o.putInt(t3 - i17);
                                }
                                i16++;
                                i17 = t3;
                            }
                            int i18 = (i6 - this.R) - i17;
                            if (i10 % 2 == 1) {
                                this.f39226o.putInt(i18);
                            } else {
                                this.f39226o.putShort((short) i18);
                                this.f39226o.putInt(0);
                            }
                            byte[] array = this.f39226o.array();
                            q qVar4 = this.f39224m;
                            qVar4.y(array, i15);
                            vVar.b(qVar4, i15);
                            this.S += i15;
                        }
                    }
                } else {
                    byte[] bArr2 = bVar.f39245i;
                    if (bArr2 != null) {
                        qVar.y(bArr2, bArr2.length);
                    }
                }
                if (bVar.f > 0) {
                    this.O |= 268435456;
                    this.f39225n.x(0);
                    qVar2.x(4);
                    byte[] bArr3 = qVar2.f5186a;
                    bArr3[0] = (byte) ((i6 >> 24) & 255);
                    bArr3[1] = (byte) ((i6 >> 16) & 255);
                    bArr3[2] = (byte) ((i6 >> 8) & 255);
                    bArr3[3] = (byte) (i6 & 255);
                    vVar.b(qVar2, 4);
                    this.S += 4;
                }
                this.U = true;
            }
            int i19 = i6 + qVar.f5188c;
            if (!"V_MPEG4/ISO/AVC".equals(bVar.f39239b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f39239b)) {
                if (bVar.T != null) {
                    if (qVar.f5188c != 0) {
                        z13 = false;
                    }
                    sc.b.C(z13);
                    bVar.T.c(iVar);
                }
                while (true) {
                    int i20 = this.R;
                    if (i20 >= i19) {
                        break;
                    }
                    int i21 = i19 - i20;
                    int i22 = qVar.f5188c - qVar.f5187b;
                    if (i22 > 0) {
                        c11 = Math.min(i21, i22);
                        vVar.a(c11, qVar);
                    } else {
                        c11 = vVar.c(iVar, i21, false);
                    }
                    this.R += c11;
                    this.S += c11;
                }
            } else {
                q qVar5 = this.f;
                byte[] bArr4 = qVar5.f5186a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i23 = bVar.Y;
                int i24 = 4 - i23;
                while (this.R < i19) {
                    int i25 = this.T;
                    if (i25 == 0) {
                        int min = Math.min(i23, qVar.f5188c - qVar.f5187b);
                        iVar.readFully(bArr4, i24 + min, i23 - min);
                        if (min > 0) {
                            qVar.b(i24, bArr4, min);
                        }
                        this.R += i23;
                        qVar5.A(0);
                        this.T = qVar5.t();
                        q qVar6 = this.f39217e;
                        qVar6.A(0);
                        vVar.a(4, qVar6);
                        this.S += 4;
                    } else {
                        int i26 = qVar.f5188c - qVar.f5187b;
                        if (i26 > 0) {
                            c10 = Math.min(i25, i26);
                            vVar.a(c10, qVar);
                        } else {
                            c10 = vVar.c(iVar, i25, false);
                        }
                        this.R += c10;
                        this.S += c10;
                        this.T -= c10;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.f39239b)) {
                q qVar7 = this.f39219h;
                qVar7.A(0);
                vVar.a(4, qVar7);
                this.S += 4;
            }
            int i27 = this.S;
            k();
            return i27;
        }
    }

    public final void n(i iVar, byte[] bArr, int i6) {
        int length = bArr.length + i6;
        q qVar = this.f39222k;
        byte[] bArr2 = qVar.f5186a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i6);
            qVar.y(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iVar.readFully(qVar.f5186a, bArr.length, i6);
        qVar.A(0);
        qVar.z(length);
    }

    @Override // u7.h
    public final void a() {
    }
}
