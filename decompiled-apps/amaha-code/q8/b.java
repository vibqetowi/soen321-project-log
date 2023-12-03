package q8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import c9.q;
import com.appsflyer.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.a;
import q8.c;
import u7.x;
/* compiled from: Cea708Decoder.java */
/* loaded from: classes.dex */
public final class b extends q8.c {

    /* renamed from: g  reason: collision with root package name */
    public final q f29354g = new q();

    /* renamed from: h  reason: collision with root package name */
    public final x f29355h = new x();

    /* renamed from: i  reason: collision with root package name */
    public int f29356i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f29357j;

    /* renamed from: k  reason: collision with root package name */
    public final C0496b[] f29358k;

    /* renamed from: l  reason: collision with root package name */
    public C0496b f29359l;

    /* renamed from: m  reason: collision with root package name */
    public List<p8.a> f29360m;

    /* renamed from: n  reason: collision with root package name */
    public List<p8.a> f29361n;

    /* renamed from: o  reason: collision with root package name */
    public c f29362o;

    /* renamed from: p  reason: collision with root package name */
    public int f29363p;

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final p0.d f29364c = new p0.d(6);

        /* renamed from: a  reason: collision with root package name */
        public final p8.a f29365a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29366b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i6, float f2, int i10, boolean z10, int i11, int i12) {
            a.C0467a c0467a = new a.C0467a();
            c0467a.f27989a = spannableStringBuilder;
            c0467a.f27991c = alignment;
            c0467a.f27993e = f;
            c0467a.f = 0;
            c0467a.f27994g = i6;
            c0467a.f27995h = f2;
            c0467a.f27996i = i10;
            c0467a.f27999l = -3.4028235E38f;
            if (z10) {
                c0467a.f28002o = i11;
                c0467a.f28001n = true;
            }
            this.f29365a = c0467a.a();
            this.f29366b = i12;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: q8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0496b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;

        /* renamed from: w  reason: collision with root package name */
        public static final int f29367w = c(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f29368x;

        /* renamed from: y  reason: collision with root package name */
        public static final int[] f29369y;

        /* renamed from: z  reason: collision with root package name */
        public static final int[] f29370z;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f29371a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final SpannableStringBuilder f29372b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public boolean f29373c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f29374d;

        /* renamed from: e  reason: collision with root package name */
        public int f29375e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public int f29376g;

        /* renamed from: h  reason: collision with root package name */
        public int f29377h;

        /* renamed from: i  reason: collision with root package name */
        public int f29378i;

        /* renamed from: j  reason: collision with root package name */
        public int f29379j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f29380k;

        /* renamed from: l  reason: collision with root package name */
        public int f29381l;

        /* renamed from: m  reason: collision with root package name */
        public int f29382m;

        /* renamed from: n  reason: collision with root package name */
        public int f29383n;

        /* renamed from: o  reason: collision with root package name */
        public int f29384o;

        /* renamed from: p  reason: collision with root package name */
        public int f29385p;

        /* renamed from: q  reason: collision with root package name */
        public int f29386q;
        public int r;

        /* renamed from: s  reason: collision with root package name */
        public int f29387s;

        /* renamed from: t  reason: collision with root package name */
        public int f29388t;

        /* renamed from: u  reason: collision with root package name */
        public int f29389u;

        /* renamed from: v  reason: collision with root package name */
        public int f29390v;

        static {
            int c10 = c(0, 0, 0, 0);
            f29368x = c10;
            int c11 = c(0, 0, 0, 3);
            f29369y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f29370z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{c10, c11, c10, c10, c11, c10, c10};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{c10, c10, c10, c10, c10, c11, c11};
        }

        public C0496b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int c(int i6, int i10, int i11, int i12) {
            int i13;
            int i14;
            int i15;
            sc.b.v(i6, 4);
            sc.b.v(i10, 4);
            sc.b.v(i11, 4);
            sc.b.v(i12, 4);
            int i16 = 255;
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i13 = 0;
                    }
                } else {
                    i13 = 127;
                }
                if (i6 <= 1) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                if (i10 <= 1) {
                    i15 = 255;
                } else {
                    i15 = 0;
                }
                if (i11 <= 1) {
                    i16 = 0;
                }
                return Color.argb(i13, i14, i15, i16);
            }
            i13 = 255;
            if (i6 <= 1) {
            }
            if (i10 <= 1) {
            }
            if (i11 <= 1) {
            }
            return Color.argb(i13, i14, i15, i16);
        }

        public final void a(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f29372b;
            if (c10 == '\n') {
                ArrayList arrayList = this.f29371a;
                arrayList.add(b());
                spannableStringBuilder.clear();
                if (this.f29385p != -1) {
                    this.f29385p = 0;
                }
                if (this.f29386q != -1) {
                    this.f29386q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.f29388t != -1) {
                    this.f29388t = 0;
                }
                while (true) {
                    if ((this.f29380k && arrayList.size() >= this.f29379j) || arrayList.size() >= 15) {
                        arrayList.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                spannableStringBuilder.append(c10);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29372b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f29385p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f29385p, length, 33);
                }
                if (this.f29386q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29386q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29387s), this.r, length, 33);
                }
                if (this.f29388t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29389u), this.f29388t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f29371a.clear();
            this.f29372b.clear();
            this.f29385p = -1;
            this.f29386q = -1;
            this.r = -1;
            this.f29388t = -1;
            this.f29390v = 0;
            this.f29373c = false;
            this.f29374d = false;
            this.f29375e = 4;
            this.f = false;
            this.f29376g = 0;
            this.f29377h = 0;
            this.f29378i = 0;
            this.f29379j = 15;
            this.f29380k = true;
            this.f29381l = 0;
            this.f29382m = 0;
            this.f29383n = 0;
            int i6 = f29368x;
            this.f29384o = i6;
            this.f29387s = f29367w;
            this.f29389u = i6;
        }

        public final void e(boolean z10, boolean z11) {
            int i6 = this.f29385p;
            SpannableStringBuilder spannableStringBuilder = this.f29372b;
            if (i6 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f29385p, spannableStringBuilder.length(), 33);
                    this.f29385p = -1;
                }
            } else if (z10) {
                this.f29385p = spannableStringBuilder.length();
            }
            if (this.f29386q != -1) {
                if (!z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29386q, spannableStringBuilder.length(), 33);
                    this.f29386q = -1;
                }
            } else if (z11) {
                this.f29386q = spannableStringBuilder.length();
            }
        }

        public final void f(int i6, int i10) {
            int i11 = this.r;
            SpannableStringBuilder spannableStringBuilder = this.f29372b;
            if (i11 != -1 && this.f29387s != i6) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29387s), this.r, spannableStringBuilder.length(), 33);
            }
            if (i6 != f29367w) {
                this.r = spannableStringBuilder.length();
                this.f29387s = i6;
            }
            if (this.f29388t != -1 && this.f29389u != i10) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29389u), this.f29388t, spannableStringBuilder.length(), 33);
            }
            if (i10 != f29368x) {
                this.f29388t = spannableStringBuilder.length();
                this.f29389u = i10;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f29391a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29392b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f29393c;

        /* renamed from: d  reason: collision with root package name */
        public int f29394d = 0;

        public c(int i6, int i10) {
            this.f29391a = i6;
            this.f29392b = i10;
            this.f29393c = new byte[(i10 * 2) - 1];
        }
    }

    public b(int i6, List<byte[]> list) {
        this.f29357j = i6 == -1 ? 1 : i6;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f29358k = new C0496b[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f29358k[i10] = new C0496b();
        }
        this.f29359l = this.f29358k[0];
    }

    @Override // q8.c
    public final d f() {
        List<p8.a> list = this.f29360m;
        this.f29361n = list;
        list.getClass();
        return new d(0, list);
    }

    @Override // q8.c, r7.d
    public final void flush() {
        super.flush();
        this.f29360m = null;
        this.f29361n = null;
        this.f29363p = 0;
        this.f29359l = this.f29358k[0];
        l();
        this.f29362o = null;
    }

    @Override // q8.c
    public final void g(c.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f6360w;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        q qVar = this.f29354g;
        qVar.y(array, limit);
        while (qVar.f5188c - qVar.f5187b >= 3) {
            int q10 = qVar.q() & 7;
            int i6 = q10 & 3;
            boolean z11 = false;
            if ((q10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte q11 = (byte) qVar.q();
            byte q12 = (byte) qVar.q();
            if (i6 == 2 || i6 == 3) {
                if (z10) {
                    if (i6 == 3) {
                        j();
                        int i10 = (q11 & 192) >> 6;
                        int i11 = this.f29356i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            int i12 = this.f29356i;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i12);
                            sb2.append(" current=");
                            sb2.append(i10);
                            Log.w("Cea708Decoder", sb2.toString());
                        }
                        this.f29356i = i10;
                        int i13 = q11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i10, i13);
                        this.f29362o = cVar;
                        int i14 = cVar.f29394d;
                        cVar.f29394d = i14 + 1;
                        cVar.f29393c[i14] = q12;
                    } else {
                        if (i6 == 2) {
                            z11 = true;
                        }
                        sc.b.q(z11);
                        c cVar2 = this.f29362o;
                        if (cVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i15 = cVar2.f29394d;
                            int i16 = i15 + 1;
                            byte[] bArr = cVar2.f29393c;
                            bArr[i15] = q11;
                            cVar2.f29394d = i16 + 1;
                            bArr[i16] = q12;
                        }
                    }
                    c cVar3 = this.f29362o;
                    if (cVar3.f29394d == (cVar3.f29392b * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // q8.c
    public final boolean i() {
        if (this.f29360m != this.f29361n) {
            return true;
        }
        return false;
    }

    public final void j() {
        String str;
        String str2;
        C0496b c0496b;
        c cVar = this.f29362o;
        if (cVar == null) {
            return;
        }
        int i6 = cVar.f29394d;
        int i10 = 2;
        int i11 = (cVar.f29392b * 2) - 1;
        String str3 = "Cea708Decoder";
        if (i6 != i11) {
            StringBuilder sb2 = new StringBuilder((int) R.styleable.AppCompatTheme_tooltipFrameBackground);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append(i11);
            sb2.append(", but current index is ");
            sb2.append(i6);
            sb2.append(" (sequence number ");
            sb2.append(cVar.f29391a);
            sb2.append(");");
            Log.d("Cea708Decoder", sb2.toString());
        }
        c cVar2 = this.f29362o;
        byte[] bArr = cVar2.f29393c;
        int i12 = cVar2.f29394d;
        x xVar = this.f29355h;
        xVar.n(bArr, i12);
        int i13 = 3;
        int i14 = xVar.i(3);
        int i15 = xVar.i(5);
        int i16 = 7;
        if (i14 == 7) {
            xVar.r(2);
            i14 = xVar.i(6);
            if (i14 < 7) {
                defpackage.d.k(44, "Invalid extended service number: ", i14, "Cea708Decoder");
            }
        }
        if (i15 == 0) {
            if (i14 != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(i14);
                sb3.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb3.toString());
            }
        } else if (i14 == this.f29357j) {
            boolean z10 = false;
            while (xVar.b() > 0) {
                int i17 = xVar.i(8);
                if (i17 != 16) {
                    if (i17 <= 31) {
                        if (i17 != 0) {
                            if (i17 != i13) {
                                if (i17 != 8) {
                                    switch (i17) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.f29359l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i17 >= 17 && i17 <= 23) {
                                                StringBuilder sb4 = new StringBuilder(55);
                                                sb4.append("Currently unsupported COMMAND_EXT1 Command: ");
                                                sb4.append(i17);
                                                Log.w(str3, sb4.toString());
                                                xVar.r(8);
                                                break;
                                            } else if (i17 >= 24 && i17 <= 31) {
                                                StringBuilder sb5 = new StringBuilder(54);
                                                sb5.append("Currently unsupported COMMAND_P16 Command: ");
                                                sb5.append(i17);
                                                Log.w(str3, sb5.toString());
                                                xVar.r(16);
                                                break;
                                            } else {
                                                defpackage.d.k(31, "Invalid C0 command: ", i17, str3);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f29359l.f29372b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            } else {
                                this.f29360m = k();
                            }
                        }
                    } else if (i17 <= 127) {
                        if (i17 == 127) {
                            this.f29359l.a((char) 9835);
                        } else {
                            this.f29359l.a((char) (i17 & 255));
                        }
                        z10 = true;
                    } else {
                        if (i17 <= 159) {
                            C0496b[] c0496bArr = this.f29358k;
                            switch (i17) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    str2 = str3;
                                    int i18 = i17 - 128;
                                    if (this.f29363p != i18) {
                                        this.f29363p = i18;
                                        this.f29359l = c0496bArr[i18];
                                    }
                                    str = str2;
                                    break;
                                case 136:
                                    str2 = str3;
                                    for (int i19 = 1; i19 <= 8; i19++) {
                                        if (xVar.h()) {
                                            C0496b c0496b2 = c0496bArr[8 - i19];
                                            c0496b2.f29371a.clear();
                                            c0496b2.f29372b.clear();
                                            c0496b2.f29385p = -1;
                                            c0496b2.f29386q = -1;
                                            c0496b2.r = -1;
                                            c0496b2.f29388t = -1;
                                            c0496b2.f29390v = 0;
                                        }
                                    }
                                    str = str2;
                                    break;
                                case 137:
                                    str2 = str3;
                                    for (int i20 = 1; i20 <= 8; i20++) {
                                        if (xVar.h()) {
                                            c0496bArr[8 - i20].f29374d = true;
                                        }
                                    }
                                    str = str2;
                                    break;
                                case 138:
                                    str2 = str3;
                                    for (int i21 = 1; i21 <= 8; i21++) {
                                        if (xVar.h()) {
                                            c0496bArr[8 - i21].f29374d = false;
                                        }
                                    }
                                    str = str2;
                                    break;
                                case 139:
                                    str2 = str3;
                                    for (int i22 = 1; i22 <= 8; i22++) {
                                        if (xVar.h()) {
                                            c0496bArr[8 - i22].f29374d = !c0496b.f29374d;
                                        }
                                    }
                                    str = str2;
                                    break;
                                case 140:
                                    str2 = str3;
                                    for (int i23 = 1; i23 <= 8; i23++) {
                                        if (xVar.h()) {
                                            c0496bArr[8 - i23].d();
                                        }
                                    }
                                    str = str2;
                                    break;
                                case 141:
                                    str2 = str3;
                                    xVar.r(8);
                                    str = str2;
                                    break;
                                case 142:
                                    str2 = str3;
                                    str = str2;
                                    break;
                                case 143:
                                    str2 = str3;
                                    l();
                                    str = str2;
                                    break;
                                case 144:
                                    str2 = str3;
                                    if (!this.f29359l.f29373c) {
                                        xVar.r(16);
                                    } else {
                                        xVar.i(4);
                                        xVar.i(2);
                                        xVar.i(2);
                                        boolean h10 = xVar.h();
                                        boolean h11 = xVar.h();
                                        xVar.i(3);
                                        xVar.i(3);
                                        this.f29359l.e(h10, h11);
                                    }
                                    str = str2;
                                    break;
                                case 145:
                                    str2 = str3;
                                    if (!this.f29359l.f29373c) {
                                        xVar.r(24);
                                    } else {
                                        int c10 = C0496b.c(xVar.i(2), xVar.i(2), xVar.i(2), xVar.i(2));
                                        int c11 = C0496b.c(xVar.i(2), xVar.i(2), xVar.i(2), xVar.i(2));
                                        xVar.r(2);
                                        C0496b.c(xVar.i(2), xVar.i(2), xVar.i(2), 0);
                                        this.f29359l.f(c10, c11);
                                    }
                                    str = str2;
                                    break;
                                case 146:
                                    str2 = str3;
                                    if (!this.f29359l.f29373c) {
                                        xVar.r(16);
                                    } else {
                                        xVar.r(4);
                                        int i24 = xVar.i(4);
                                        xVar.r(2);
                                        xVar.i(6);
                                        C0496b c0496b3 = this.f29359l;
                                        if (c0496b3.f29390v != i24) {
                                            c0496b3.a('\n');
                                        }
                                        c0496b3.f29390v = i24;
                                    }
                                    str = str2;
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    str = str3;
                                    defpackage.d.k(31, "Invalid C1 command: ", i17, str);
                                    break;
                                case 151:
                                    str2 = str3;
                                    if (!this.f29359l.f29373c) {
                                        xVar.r(32);
                                    } else {
                                        int c12 = C0496b.c(xVar.i(2), xVar.i(2), xVar.i(2), xVar.i(2));
                                        xVar.i(2);
                                        C0496b.c(xVar.i(2), xVar.i(2), xVar.i(2), 0);
                                        xVar.h();
                                        xVar.h();
                                        xVar.i(2);
                                        xVar.i(2);
                                        int i25 = xVar.i(2);
                                        xVar.r(8);
                                        C0496b c0496b4 = this.f29359l;
                                        c0496b4.f29384o = c12;
                                        c0496b4.f29381l = i25;
                                    }
                                    str = str2;
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i26 = i17 - 152;
                                    C0496b c0496b5 = c0496bArr[i26];
                                    xVar.r(i10);
                                    boolean h12 = xVar.h();
                                    boolean h13 = xVar.h();
                                    xVar.h();
                                    int i27 = xVar.i(i13);
                                    boolean h14 = xVar.h();
                                    int i28 = xVar.i(i16);
                                    int i29 = xVar.i(8);
                                    int i30 = xVar.i(4);
                                    int i31 = xVar.i(4);
                                    xVar.r(i10);
                                    xVar.i(6);
                                    xVar.r(i10);
                                    int i32 = xVar.i(3);
                                    int i33 = xVar.i(3);
                                    str2 = str3;
                                    c0496b5.f29373c = true;
                                    c0496b5.f29374d = h12;
                                    c0496b5.f29380k = h13;
                                    c0496b5.f29375e = i27;
                                    c0496b5.f = h14;
                                    c0496b5.f29376g = i28;
                                    c0496b5.f29377h = i29;
                                    c0496b5.f29378i = i30;
                                    int i34 = i31 + 1;
                                    if (c0496b5.f29379j != i34) {
                                        c0496b5.f29379j = i34;
                                        while (true) {
                                            ArrayList arrayList = c0496b5.f29371a;
                                            if ((h13 && arrayList.size() >= c0496b5.f29379j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i32 != 0 && c0496b5.f29382m != i32) {
                                        c0496b5.f29382m = i32;
                                        int i35 = i32 - 1;
                                        int i36 = C0496b.C[i35];
                                        boolean z11 = C0496b.B[i35];
                                        int i37 = C0496b.f29370z[i35];
                                        int i38 = C0496b.A[i35];
                                        int i39 = C0496b.f29369y[i35];
                                        c0496b5.f29384o = i36;
                                        c0496b5.f29381l = i39;
                                    }
                                    if (i33 != 0 && c0496b5.f29383n != i33) {
                                        c0496b5.f29383n = i33;
                                        int i40 = i33 - 1;
                                        int i41 = C0496b.E[i40];
                                        int i42 = C0496b.D[i40];
                                        c0496b5.e(false, false);
                                        c0496b5.f(C0496b.f29367w, C0496b.F[i40]);
                                    }
                                    if (this.f29363p != i26) {
                                        this.f29363p = i26;
                                        this.f29359l = c0496bArr[i26];
                                    }
                                    str = str2;
                                    break;
                            }
                        } else {
                            str = str3;
                            if (i17 <= 255) {
                                this.f29359l.a((char) (i17 & 255));
                            } else {
                                defpackage.d.k(33, "Invalid base command: ", i17, str);
                            }
                        }
                        z10 = true;
                    }
                    str = str3;
                } else {
                    str = str3;
                    int i43 = xVar.i(8);
                    if (i43 <= 31) {
                        if (i43 > 7) {
                            if (i43 <= 15) {
                                xVar.r(8);
                            } else if (i43 <= 23) {
                                xVar.r(16);
                            } else if (i43 <= 31) {
                                xVar.r(24);
                            }
                        }
                    } else {
                        if (i43 <= 127) {
                            if (i43 != 32) {
                                if (i43 != 33) {
                                    if (i43 != 37) {
                                        if (i43 != 42) {
                                            if (i43 != 44) {
                                                if (i43 != 63) {
                                                    if (i43 != 57) {
                                                        if (i43 != 58) {
                                                            if (i43 != 60) {
                                                                if (i43 != 61) {
                                                                    switch (i43) {
                                                                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                                                            this.f29359l.a((char) 9608);
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                                            this.f29359l.a((char) 8216);
                                                                            break;
                                                                        case 50:
                                                                            this.f29359l.a((char) 8217);
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                                            this.f29359l.a((char) 8220);
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                                            this.f29359l.a((char) 8221);
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                                            this.f29359l.a((char) 8226);
                                                                            break;
                                                                        default:
                                                                            switch (i43) {
                                                                                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                                                    this.f29359l.a((char) 8539);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                                                    this.f29359l.a((char) 8540);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                                                    this.f29359l.a((char) 8541);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                                                    this.f29359l.a((char) 8542);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                                                    this.f29359l.a((char) 9474);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                                                    this.f29359l.a((char) 9488);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                                                    this.f29359l.a((char) 9492);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                                                    this.f29359l.a((char) 9472);
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                                                    this.f29359l.a((char) 9496);
                                                                                    break;
                                                                                case 127:
                                                                                    this.f29359l.a((char) 9484);
                                                                                    break;
                                                                                default:
                                                                                    defpackage.d.k(33, "Invalid G2 character: ", i43, str);
                                                                                    break;
                                                                            }
                                                                    }
                                                                } else {
                                                                    this.f29359l.a((char) 8480);
                                                                }
                                                            } else {
                                                                this.f29359l.a((char) 339);
                                                            }
                                                        } else {
                                                            this.f29359l.a((char) 353);
                                                        }
                                                    } else {
                                                        this.f29359l.a((char) 8482);
                                                    }
                                                } else {
                                                    this.f29359l.a((char) 376);
                                                }
                                            } else {
                                                this.f29359l.a((char) 338);
                                            }
                                        } else {
                                            this.f29359l.a((char) 352);
                                        }
                                    } else {
                                        this.f29359l.a((char) 8230);
                                    }
                                } else {
                                    this.f29359l.a((char) 160);
                                }
                            } else {
                                this.f29359l.a(' ');
                            }
                        } else if (i43 <= 159) {
                            if (i43 <= 135) {
                                xVar.r(32);
                            } else if (i43 <= 143) {
                                xVar.r(40);
                            } else if (i43 <= 159) {
                                xVar.r(2);
                                xVar.r(xVar.i(6) * 8);
                            }
                        } else if (i43 <= 255) {
                            if (i43 == 160) {
                                this.f29359l.a((char) 13252);
                            } else {
                                defpackage.d.k(33, "Invalid G3 character: ", i43, str);
                                this.f29359l.a('_');
                            }
                        } else {
                            defpackage.d.k(37, "Invalid extended command: ", i43, str);
                        }
                        z10 = true;
                    }
                }
                i13 = 3;
                i16 = 7;
                str3 = str;
                i10 = 2;
            }
            if (z10) {
                this.f29360m = k();
            }
        }
        this.f29362o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<p8.a> k() {
        boolean z10;
        boolean z11;
        Layout.Alignment alignment;
        float f;
        float f2;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 8; i14++) {
            C0496b[] c0496bArr = this.f29358k;
            C0496b c0496b = c0496bArr[i14];
            if (c0496b.f29373c && (!c0496b.f29371a.isEmpty() || c0496b.f29372b.length() != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                C0496b c0496b2 = c0496bArr[i14];
                if (c0496b2.f29374d) {
                    boolean z13 = c0496b2.f29373c;
                    ArrayList arrayList2 = c0496b2.f29371a;
                    if (z13 && (!arrayList2.isEmpty() || c0496b2.f29372b.length() != 0)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i15));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c0496b2.b());
                        int i16 = c0496b2.f29381l;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        throw new IllegalArgumentException(defpackage.b.h(43, "Unexpected justification value: ", c0496b2.f29381l));
                                    }
                                } else {
                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                }
                            } else {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (!c0496b2.f) {
                                f = c0496b2.f29377h / 99.0f;
                                f2 = c0496b2.f29376g / 99.0f;
                            } else {
                                f = c0496b2.f29377h / 209.0f;
                                f2 = c0496b2.f29376g / 74.0f;
                            }
                            float f10 = (f * 0.9f) + 0.05f;
                            float f11 = (f2 * 0.9f) + 0.05f;
                            int i17 = c0496b2.f29378i;
                            i6 = i17 / 3;
                            if (i6 != 0) {
                                i10 = 0;
                            } else if (i6 == 1) {
                                i10 = 1;
                            } else {
                                i10 = 2;
                            }
                            i11 = i17 % 3;
                            if (i11 != 0) {
                                i12 = 0;
                            } else if (i11 == 1) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            i13 = c0496b2.f29384o;
                            if (i13 == C0496b.f29368x) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            aVar = new a(spannableStringBuilder, alignment2, f11, i10, f10, i12, z12, i13, c0496b2.f29375e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (!c0496b2.f) {
                        }
                        float f102 = (f * 0.9f) + 0.05f;
                        float f112 = (f2 * 0.9f) + 0.05f;
                        int i172 = c0496b2.f29378i;
                        i6 = i172 / 3;
                        if (i6 != 0) {
                        }
                        i11 = i172 % 3;
                        if (i11 != 0) {
                        }
                        i13 = c0496b2.f29384o;
                        if (i13 == C0496b.f29368x) {
                        }
                        aVar = new a(spannableStringBuilder, alignment22, f112, i10, f102, i12, z12, i13, c0496b2.f29375e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.f29364c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            arrayList3.add(((a) arrayList.get(i18)).f29365a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i6 = 0; i6 < 8; i6++) {
            this.f29358k[i6].d();
        }
    }
}
