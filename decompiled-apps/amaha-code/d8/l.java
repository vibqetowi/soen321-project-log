package d8;

import android.util.Log;
import com.google.android.exoplayer2.n;
import d8.d0;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: H263Reader.java */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12424l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final e0 f12425a;
    public b f;

    /* renamed from: g  reason: collision with root package name */
    public long f12430g;

    /* renamed from: h  reason: collision with root package name */
    public String f12431h;

    /* renamed from: i  reason: collision with root package name */
    public u7.v f12432i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12433j;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f12427c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final a f12428d = new a();

    /* renamed from: k  reason: collision with root package name */
    public long f12434k = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public final r f12429e = new r(178);

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12426b = new c9.q();

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final byte[] f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f12435a;

        /* renamed from: b  reason: collision with root package name */
        public int f12436b;

        /* renamed from: c  reason: collision with root package name */
        public int f12437c;

        /* renamed from: d  reason: collision with root package name */
        public int f12438d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f12439e = new byte[128];

        public final void a(int i6, byte[] bArr, int i10) {
            if (!this.f12435a) {
                return;
            }
            int i11 = i10 - i6;
            byte[] bArr2 = this.f12439e;
            int length = bArr2.length;
            int i12 = this.f12437c;
            if (length < i12 + i11) {
                this.f12439e = Arrays.copyOf(bArr2, (i12 + i11) * 2);
            }
            System.arraycopy(bArr, i6, this.f12439e, this.f12437c, i11);
            this.f12437c += i11;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final u7.v f12440a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12441b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12442c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12443d;

        /* renamed from: e  reason: collision with root package name */
        public int f12444e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public long f12445g;

        /* renamed from: h  reason: collision with root package name */
        public long f12446h;

        public b(u7.v vVar) {
            this.f12440a = vVar;
        }

        public final void a(int i6, byte[] bArr, int i10) {
            boolean z10;
            if (this.f12442c) {
                int i11 = this.f;
                int i12 = (i6 + 1) - i11;
                if (i12 < i10) {
                    if (((bArr[i12] & 192) >> 6) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f12443d = z10;
                    this.f12442c = false;
                    return;
                }
                this.f = (i10 - i6) + i11;
            }
        }
    }

    public l(e0 e0Var) {
        this.f12425a = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        int i6;
        int i10;
        b bVar;
        boolean z10;
        boolean z11;
        long j10;
        int i11;
        int i12;
        boolean z12;
        float f;
        c9.q qVar2 = qVar;
        sc.b.E(this.f);
        sc.b.E(this.f12432i);
        int i13 = qVar2.f5187b;
        int i14 = qVar2.f5188c;
        byte[] bArr = qVar2.f5186a;
        int i15 = i14 - i13;
        this.f12430g += i15;
        this.f12432i.a(i15, qVar2);
        while (true) {
            int b10 = c9.m.b(bArr, i13, i14, this.f12427c);
            a aVar = this.f12428d;
            r rVar = this.f12429e;
            if (b10 == i14) {
                if (!this.f12433j) {
                    aVar.a(i13, bArr, i14);
                }
                this.f.a(i13, bArr, i14);
                if (rVar != null) {
                    rVar.a(i13, bArr, i14);
                    return;
                }
                return;
            }
            int i16 = b10 + 3;
            int i17 = qVar2.f5186a[i16] & 255;
            int i18 = b10 - i13;
            if (!this.f12433j) {
                if (i18 > 0) {
                    aVar.a(i13, bArr, b10);
                }
                if (i18 < 0) {
                    i12 = -i18;
                } else {
                    i12 = 0;
                }
                int i19 = aVar.f12436b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 != 3) {
                                if (i19 == 4) {
                                    if (i17 == 179 || i17 == 181) {
                                        aVar.f12437c -= i12;
                                        aVar.f12435a = false;
                                        z12 = true;
                                        if (z12) {
                                            u7.v vVar = this.f12432i;
                                            int i20 = aVar.f12438d;
                                            String str = this.f12431h;
                                            str.getClass();
                                            byte[] copyOf = Arrays.copyOf(aVar.f12439e, aVar.f12437c);
                                            i6 = i14;
                                            i10 = i16;
                                            u7.x xVar = new u7.x(copyOf, 1, 0);
                                            xVar.s(i20);
                                            xVar.s(4);
                                            xVar.q();
                                            xVar.r(8);
                                            if (xVar.h()) {
                                                xVar.r(4);
                                                xVar.r(3);
                                            }
                                            int i21 = xVar.i(4);
                                            if (i21 == 15) {
                                                int i22 = xVar.i(8);
                                                int i23 = xVar.i(8);
                                                if (i23 == 0) {
                                                    Log.w("H263Reader", "Invalid aspect ratio");
                                                    f = 1.0f;
                                                    if (xVar.h()) {
                                                        xVar.r(2);
                                                        xVar.r(1);
                                                        if (xVar.h()) {
                                                            xVar.r(15);
                                                            xVar.q();
                                                            xVar.r(15);
                                                            xVar.q();
                                                            xVar.r(15);
                                                            xVar.q();
                                                            xVar.r(3);
                                                            xVar.r(11);
                                                            xVar.q();
                                                            xVar.r(15);
                                                            xVar.q();
                                                        }
                                                    }
                                                    if (xVar.i(2) != 0) {
                                                        Log.w("H263Reader", "Unhandled video object layer shape");
                                                    }
                                                    xVar.q();
                                                    int i24 = xVar.i(16);
                                                    xVar.q();
                                                    if (xVar.h()) {
                                                        if (i24 == 0) {
                                                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                                        } else {
                                                            int i25 = 0;
                                                            for (int i26 = i24 - 1; i26 > 0; i26 >>= 1) {
                                                                i25++;
                                                            }
                                                            xVar.r(i25);
                                                        }
                                                    }
                                                    xVar.q();
                                                    int i27 = xVar.i(13);
                                                    xVar.q();
                                                    int i28 = xVar.i(13);
                                                    xVar.q();
                                                    xVar.q();
                                                    n.a aVar2 = new n.a();
                                                    aVar2.f6656a = str;
                                                    aVar2.f6665k = "video/mp4v-es";
                                                    aVar2.f6670p = i27;
                                                    aVar2.f6671q = i28;
                                                    aVar2.f6673t = f;
                                                    aVar2.f6667m = Collections.singletonList(copyOf);
                                                    vVar.e(new com.google.android.exoplayer2.n(aVar2));
                                                    this.f12433j = true;
                                                } else {
                                                    f = i22 / i23;
                                                    if (xVar.h()) {
                                                    }
                                                    if (xVar.i(2) != 0) {
                                                    }
                                                    xVar.q();
                                                    int i242 = xVar.i(16);
                                                    xVar.q();
                                                    if (xVar.h()) {
                                                    }
                                                    xVar.q();
                                                    int i272 = xVar.i(13);
                                                    xVar.q();
                                                    int i282 = xVar.i(13);
                                                    xVar.q();
                                                    xVar.q();
                                                    n.a aVar22 = new n.a();
                                                    aVar22.f6656a = str;
                                                    aVar22.f6665k = "video/mp4v-es";
                                                    aVar22.f6670p = i272;
                                                    aVar22.f6671q = i282;
                                                    aVar22.f6673t = f;
                                                    aVar22.f6667m = Collections.singletonList(copyOf);
                                                    vVar.e(new com.google.android.exoplayer2.n(aVar22));
                                                    this.f12433j = true;
                                                }
                                            } else if (i21 < 7) {
                                                f = f12424l[i21];
                                                if (xVar.h()) {
                                                }
                                                if (xVar.i(2) != 0) {
                                                }
                                                xVar.q();
                                                int i2422 = xVar.i(16);
                                                xVar.q();
                                                if (xVar.h()) {
                                                }
                                                xVar.q();
                                                int i2722 = xVar.i(13);
                                                xVar.q();
                                                int i2822 = xVar.i(13);
                                                xVar.q();
                                                xVar.q();
                                                n.a aVar222 = new n.a();
                                                aVar222.f6656a = str;
                                                aVar222.f6665k = "video/mp4v-es";
                                                aVar222.f6670p = i2722;
                                                aVar222.f6671q = i2822;
                                                aVar222.f6673t = f;
                                                aVar222.f6667m = Collections.singletonList(copyOf);
                                                vVar.e(new com.google.android.exoplayer2.n(aVar222));
                                                this.f12433j = true;
                                            } else {
                                                Log.w("H263Reader", "Invalid aspect ratio");
                                                f = 1.0f;
                                                if (xVar.h()) {
                                                }
                                                if (xVar.i(2) != 0) {
                                                }
                                                xVar.q();
                                                int i24222 = xVar.i(16);
                                                xVar.q();
                                                if (xVar.h()) {
                                                }
                                                xVar.q();
                                                int i27222 = xVar.i(13);
                                                xVar.q();
                                                int i28222 = xVar.i(13);
                                                xVar.q();
                                                xVar.q();
                                                n.a aVar2222 = new n.a();
                                                aVar2222.f6656a = str;
                                                aVar2222.f6665k = "video/mp4v-es";
                                                aVar2222.f6670p = i27222;
                                                aVar2222.f6671q = i28222;
                                                aVar2222.f6673t = f;
                                                aVar2222.f6667m = Collections.singletonList(copyOf);
                                                vVar.e(new com.google.android.exoplayer2.n(aVar2222));
                                                this.f12433j = true;
                                            }
                                            this.f.a(i13, bArr, b10);
                                            if (rVar != null) {
                                                if (i18 > 0) {
                                                    rVar.a(i13, bArr, b10);
                                                    i11 = 0;
                                                } else {
                                                    i11 = -i18;
                                                }
                                                if (rVar.b(i11)) {
                                                    int e10 = c9.m.e(rVar.f12555d, rVar.f12556e);
                                                    int i29 = c9.w.f5205a;
                                                    byte[] bArr2 = rVar.f12555d;
                                                    c9.q qVar3 = this.f12426b;
                                                    qVar3.y(bArr2, e10);
                                                    this.f12425a.a(this.f12434k, qVar3);
                                                }
                                                if (i17 == 178) {
                                                    qVar2 = qVar;
                                                    if (qVar2.f5186a[b10 + 2] == 1) {
                                                        rVar.d(i17);
                                                    }
                                                    int i30 = i6 - b10;
                                                    long j11 = this.f12430g - i30;
                                                    bVar = this.f;
                                                    boolean z13 = this.f12433j;
                                                    if (bVar.f12444e == 182 && z13 && bVar.f12441b) {
                                                        j10 = bVar.f12446h;
                                                        if (j10 != -9223372036854775807L) {
                                                            bVar.f12440a.d(j10, bVar.f12443d ? 1 : 0, (int) (j11 - bVar.f12445g), i30, null);
                                                        }
                                                    }
                                                    if (bVar.f12444e != 179) {
                                                        bVar.f12445g = j11;
                                                    }
                                                    b bVar2 = this.f;
                                                    long j12 = this.f12434k;
                                                    bVar2.f12444e = i17;
                                                    bVar2.f12443d = false;
                                                    if (i17 == 182 && i17 != 179) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    bVar2.f12441b = z10;
                                                    if (i17 == 182) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    bVar2.f12442c = z11;
                                                    bVar2.f = 0;
                                                    bVar2.f12446h = j12;
                                                    i13 = i10;
                                                    i14 = i6;
                                                }
                                            }
                                            qVar2 = qVar;
                                            int i302 = i6 - b10;
                                            long j112 = this.f12430g - i302;
                                            bVar = this.f;
                                            boolean z132 = this.f12433j;
                                            if (bVar.f12444e == 182) {
                                                j10 = bVar.f12446h;
                                                if (j10 != -9223372036854775807L) {
                                                }
                                            }
                                            if (bVar.f12444e != 179) {
                                            }
                                            b bVar22 = this.f;
                                            long j122 = this.f12434k;
                                            bVar22.f12444e = i17;
                                            bVar22.f12443d = false;
                                            if (i17 == 182) {
                                            }
                                            z10 = true;
                                            bVar22.f12441b = z10;
                                            if (i17 == 182) {
                                            }
                                            bVar22.f12442c = z11;
                                            bVar22.f = 0;
                                            bVar22.f12446h = j122;
                                            i13 = i10;
                                            i14 = i6;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if ((i17 & 240) != 32) {
                                Log.w("H263Reader", "Unexpected start code value");
                                aVar.f12435a = false;
                                aVar.f12437c = 0;
                                aVar.f12436b = 0;
                            } else {
                                aVar.f12438d = aVar.f12437c;
                                aVar.f12436b = 4;
                            }
                        } else if (i17 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            aVar.f12435a = false;
                            aVar.f12437c = 0;
                            aVar.f12436b = 0;
                        } else {
                            aVar.f12436b = 3;
                        }
                    } else if (i17 != 181) {
                        Log.w("H263Reader", "Unexpected start code value");
                        aVar.f12435a = false;
                        aVar.f12437c = 0;
                        aVar.f12436b = 0;
                    } else {
                        aVar.f12436b = 2;
                    }
                } else if (i17 == 176) {
                    aVar.f12436b = 1;
                    aVar.f12435a = true;
                }
                aVar.a(0, a.f, 3);
                z12 = false;
                if (z12) {
                }
            }
            i6 = i14;
            i10 = i16;
            this.f.a(i13, bArr, b10);
            if (rVar != null) {
            }
            qVar2 = qVar;
            int i3022 = i6 - b10;
            long j1122 = this.f12430g - i3022;
            bVar = this.f;
            boolean z1322 = this.f12433j;
            if (bVar.f12444e == 182) {
            }
            if (bVar.f12444e != 179) {
            }
            b bVar222 = this.f;
            long j1222 = this.f12434k;
            bVar222.f12444e = i17;
            bVar222.f12443d = false;
            if (i17 == 182) {
            }
            z10 = true;
            bVar222.f12441b = z10;
            if (i17 == 182) {
            }
            bVar222.f12442c = z11;
            bVar222.f = 0;
            bVar222.f12446h = j1222;
            i13 = i10;
            i14 = i6;
        }
    }

    @Override // d8.j
    public final void c() {
        c9.m.a(this.f12427c);
        a aVar = this.f12428d;
        aVar.f12435a = false;
        aVar.f12437c = 0;
        aVar.f12436b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.f12441b = false;
            bVar.f12442c = false;
            bVar.f12443d = false;
            bVar.f12444e = -1;
        }
        r rVar = this.f12429e;
        if (rVar != null) {
            rVar.c();
        }
        this.f12430g = 0L;
        this.f12434k = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12431h = dVar.f12352e;
        dVar.b();
        u7.v n10 = jVar.n(dVar.f12351d, 2);
        this.f12432i = n10;
        this.f = new b(n10);
        e0 e0Var = this.f12425a;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12434k = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
