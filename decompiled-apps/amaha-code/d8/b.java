package d8;

import com.google.android.exoplayer2.n;
import d8.d0;
/* compiled from: Ac3Reader.java */
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final u7.x f12285a;

    /* renamed from: b  reason: collision with root package name */
    public final c9.q f12286b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12287c;

    /* renamed from: d  reason: collision with root package name */
    public String f12288d;

    /* renamed from: e  reason: collision with root package name */
    public u7.v f12289e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12290g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12291h;

    /* renamed from: i  reason: collision with root package name */
    public long f12292i;

    /* renamed from: j  reason: collision with root package name */
    public com.google.android.exoplayer2.n f12293j;

    /* renamed from: k  reason: collision with root package name */
    public int f12294k;

    /* renamed from: l  reason: collision with root package name */
    public long f12295l;

    public b(String str) {
        u7.x xVar = new u7.x(new byte[128], 1, 0);
        this.f12285a = xVar;
        this.f12286b = new c9.q(xVar.f33924b);
        this.f = 0;
        this.f12295l = -9223372036854775807L;
        this.f12287c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0271  */
    @Override // d8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c9.q qVar) {
        boolean z10;
        boolean z11;
        String str;
        int a10;
        int i6;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        char c10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        char c11;
        boolean z12;
        boolean z13;
        boolean z14;
        sc.b.E(this.f12289e);
        while (true) {
            int i24 = qVar.f5188c - qVar.f5187b;
            if (i24 > 0) {
                int i25 = this.f;
                c9.q qVar2 = this.f12286b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            int min = Math.min(i24, this.f12294k - this.f12290g);
                            this.f12289e.a(min, qVar);
                            int i26 = this.f12290g + min;
                            this.f12290g = i26;
                            int i27 = this.f12294k;
                            if (i26 == i27) {
                                long j10 = this.f12295l;
                                if (j10 != -9223372036854775807L) {
                                    this.f12289e.d(j10, 1, i27, 0, null);
                                    this.f12295l += this.f12292i;
                                }
                                this.f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = qVar2.f5186a;
                        int min2 = Math.min(i24, 128 - this.f12290g);
                        qVar.b(this.f12290g, bArr, min2);
                        int i28 = this.f12290g + min2;
                        this.f12290g = i28;
                        if (i28 == 128) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            u7.x xVar = this.f12285a;
                            xVar.o(0);
                            int g5 = xVar.g();
                            xVar.r(40);
                            if (xVar.i(5) > 10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            xVar.o(g5);
                            int[] iArr = q7.b.f29236d;
                            int[] iArr2 = q7.b.f29234b;
                            if (z11) {
                                xVar.r(16);
                                int i29 = xVar.i(2);
                                if (i29 != 0) {
                                    if (i29 != 1) {
                                        if (i29 != 2) {
                                            c10 = 65535;
                                        } else {
                                            c10 = 2;
                                        }
                                    } else {
                                        c10 = 1;
                                    }
                                } else {
                                    c10 = 0;
                                }
                                xVar.r(3);
                                a10 = (xVar.i(11) + 1) * 2;
                                int i30 = xVar.i(2);
                                if (i30 == 3) {
                                    i13 = q7.b.f29235c[xVar.i(2)];
                                    i15 = 6;
                                    i14 = 3;
                                } else {
                                    int i31 = xVar.i(2);
                                    int i32 = q7.b.f29233a[i31];
                                    i13 = iArr2[i30];
                                    i14 = i31;
                                    i15 = i32;
                                }
                                i12 = i15 * 256;
                                int i33 = xVar.i(3);
                                boolean h10 = xVar.h();
                                i11 = iArr[i33] + (h10 ? 1 : 0);
                                xVar.r(10);
                                if (xVar.h()) {
                                    xVar.r(8);
                                }
                                if (i33 == 0) {
                                    xVar.r(5);
                                    if (xVar.h()) {
                                        xVar.r(8);
                                    }
                                }
                                if (c10 == 1 && xVar.h()) {
                                    xVar.r(16);
                                }
                                if (xVar.h()) {
                                    if (i33 > 2) {
                                        xVar.r(2);
                                    }
                                    if ((i33 & 1) != 0 && i33 > 2) {
                                        i20 = 6;
                                        xVar.r(6);
                                    } else {
                                        i20 = 6;
                                    }
                                    if ((i33 & 4) != 0) {
                                        xVar.r(i20);
                                    }
                                    if (h10 && xVar.h()) {
                                        xVar.r(5);
                                    }
                                    if (c10 == 0) {
                                        if (xVar.h()) {
                                            i21 = 6;
                                            xVar.r(6);
                                        } else {
                                            i21 = 6;
                                        }
                                        if (i33 == 0 && xVar.h()) {
                                            xVar.r(i21);
                                        }
                                        if (xVar.h()) {
                                            xVar.r(i21);
                                        }
                                        int i34 = xVar.i(2);
                                        if (i34 == 1) {
                                            xVar.r(5);
                                        } else if (i34 == 2) {
                                            xVar.r(12);
                                        } else if (i34 == 3) {
                                            int i35 = xVar.i(5);
                                            if (xVar.h()) {
                                                xVar.r(5);
                                                if (xVar.h()) {
                                                    i23 = 4;
                                                    xVar.r(4);
                                                } else {
                                                    i23 = 4;
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(i23);
                                                }
                                                if (xVar.h()) {
                                                    if (xVar.h()) {
                                                        xVar.r(i23);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i23);
                                                    }
                                                }
                                            }
                                            if (xVar.h()) {
                                                xVar.r(5);
                                                if (xVar.h()) {
                                                    xVar.r(7);
                                                    if (xVar.h()) {
                                                        xVar.r(8);
                                                        i22 = 2;
                                                        xVar.r((i35 + 2) * 8);
                                                        xVar.c();
                                                        if (i33 < i22) {
                                                            if (xVar.h()) {
                                                                xVar.r(14);
                                                            }
                                                            if (i33 == 0 && xVar.h()) {
                                                                xVar.r(14);
                                                            }
                                                        }
                                                        if (xVar.h()) {
                                                            i16 = i14;
                                                            if (i16 == 0) {
                                                                xVar.r(5);
                                                            } else {
                                                                for (int i36 = 0; i36 < i15; i36++) {
                                                                    if (xVar.h()) {
                                                                        xVar.r(5);
                                                                    }
                                                                }
                                                            }
                                                            if (!xVar.h()) {
                                                                xVar.r(5);
                                                                if (i33 == 2) {
                                                                    xVar.r(4);
                                                                }
                                                                if (i33 >= 6) {
                                                                    xVar.r(2);
                                                                }
                                                                if (xVar.h()) {
                                                                    i19 = 8;
                                                                    xVar.r(8);
                                                                } else {
                                                                    i19 = 8;
                                                                }
                                                                if (i33 == 0 && xVar.h()) {
                                                                    xVar.r(i19);
                                                                }
                                                                i17 = 3;
                                                                if (i30 < 3) {
                                                                    xVar.q();
                                                                }
                                                            } else {
                                                                i17 = 3;
                                                            }
                                                            if (c10 == 0 && i16 != i17) {
                                                                xVar.q();
                                                            }
                                                            if (c10 != 2 && (i16 == i17 || xVar.h())) {
                                                                i18 = 6;
                                                                xVar.r(6);
                                                            } else {
                                                                i18 = 6;
                                                            }
                                                            if (!xVar.h() && xVar.i(i18) == 1 && xVar.i(8) == 1) {
                                                                str2 = "audio/eac3-joc";
                                                            } else {
                                                                str2 = "audio/eac3";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i22 = 2;
                                            xVar.r((i35 + 2) * 8);
                                            xVar.c();
                                            if (i33 < i22) {
                                            }
                                            if (xVar.h()) {
                                            }
                                        }
                                        i22 = 2;
                                        if (i33 < i22) {
                                        }
                                        if (xVar.h()) {
                                        }
                                    }
                                }
                                i16 = i14;
                                if (!xVar.h()) {
                                }
                                if (c10 == 0) {
                                    xVar.q();
                                }
                                if (c10 != 2) {
                                }
                                i18 = 6;
                                if (!xVar.h()) {
                                }
                                str2 = "audio/eac3";
                            } else {
                                xVar.r(32);
                                int i37 = xVar.i(2);
                                if (i37 == 3) {
                                    str = null;
                                } else {
                                    str = "audio/ac3";
                                }
                                a10 = q7.b.a(i37, xVar.i(6));
                                xVar.r(8);
                                int i38 = xVar.i(3);
                                if ((i38 & 1) != 0 && i38 != 1) {
                                    i6 = 2;
                                    xVar.r(2);
                                } else {
                                    i6 = 2;
                                }
                                if ((i38 & 4) != 0) {
                                    xVar.r(i6);
                                }
                                if (i38 == i6) {
                                    xVar.r(i6);
                                }
                                if (i37 < 3) {
                                    i10 = iArr2[i37];
                                } else {
                                    i10 = -1;
                                }
                                i11 = iArr[i38] + (xVar.h() ? 1 : 0);
                                i12 = 1536;
                                str2 = str;
                                i13 = i10;
                            }
                            com.google.android.exoplayer2.n nVar = this.f12293j;
                            if (nVar == null || i11 != nVar.S || i13 != nVar.T || !c9.w.a(str2, nVar.F)) {
                                n.a aVar = new n.a();
                                aVar.f6656a = this.f12288d;
                                aVar.f6665k = str2;
                                aVar.f6677x = i11;
                                aVar.f6678y = i13;
                                aVar.f6658c = this.f12287c;
                                com.google.android.exoplayer2.n nVar2 = new com.google.android.exoplayer2.n(aVar);
                                this.f12293j = nVar2;
                                this.f12289e.e(nVar2);
                            }
                            this.f12294k = a10;
                            this.f12292i = (i12 * 1000000) / this.f12293j.T;
                            qVar2.A(0);
                            this.f12289e.a(128, qVar2);
                            this.f = 2;
                        }
                    }
                } else {
                    while (true) {
                        if (qVar.f5188c - qVar.f5187b > 0) {
                            if (!this.f12291h) {
                                if (qVar.q() == 11) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                this.f12291h = z13;
                            } else {
                                int q10 = qVar.q();
                                if (q10 == 119) {
                                    c11 = 0;
                                    this.f12291h = false;
                                    z12 = true;
                                    break;
                                }
                                if (q10 == 11) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                this.f12291h = z14;
                            }
                        } else {
                            c11 = 0;
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        this.f = 1;
                        byte[] bArr2 = qVar2.f5186a;
                        bArr2[c11] = 11;
                        bArr2[1] = 119;
                        this.f12290g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // d8.j
    public final void c() {
        this.f = 0;
        this.f12290g = 0;
        this.f12291h = false;
        this.f12295l = -9223372036854775807L;
    }

    @Override // d8.j
    public final void d(u7.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f12288d = dVar.f12352e;
        dVar.b();
        this.f12289e = jVar.n(dVar.f12351d, 1);
    }

    @Override // d8.j
    public final void f(int i6, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f12295l = j10;
        }
    }

    @Override // d8.j
    public final void e() {
    }
}
