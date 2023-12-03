package x;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import x.e;
import y.b;
/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class g extends m {
    public e[] g1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public int V0 = 0;
    public int W0 = 0;
    public int X0 = 2;
    public int Y0 = 2;
    public int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    public int f37412a1 = -1;
    public int b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    public final ArrayList<a> f37413c1 = new ArrayList<>();

    /* renamed from: d1  reason: collision with root package name */
    public e[] f37414d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public e[] f37415e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public int[] f37416f1 = null;

    /* renamed from: h1  reason: collision with root package name */
    public int f37417h1 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f37418a;

        /* renamed from: d  reason: collision with root package name */
        public d f37421d;

        /* renamed from: e  reason: collision with root package name */
        public d f37422e;
        public d f;

        /* renamed from: g  reason: collision with root package name */
        public d f37423g;

        /* renamed from: h  reason: collision with root package name */
        public int f37424h;

        /* renamed from: i  reason: collision with root package name */
        public int f37425i;

        /* renamed from: j  reason: collision with root package name */
        public int f37426j;

        /* renamed from: k  reason: collision with root package name */
        public int f37427k;

        /* renamed from: q  reason: collision with root package name */
        public int f37433q;

        /* renamed from: b  reason: collision with root package name */
        public e f37419b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f37420c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f37428l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f37429m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f37430n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f37431o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f37432p = 0;

        public a(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i10) {
            this.f37424h = 0;
            this.f37425i = 0;
            this.f37426j = 0;
            this.f37427k = 0;
            this.f37433q = 0;
            this.f37418a = i6;
            this.f37421d = dVar;
            this.f37422e = dVar2;
            this.f = dVar3;
            this.f37423g = dVar4;
            this.f37424h = g.this.C0;
            this.f37425i = g.this.f37441y0;
            this.f37426j = g.this.D0;
            this.f37427k = g.this.f37442z0;
            this.f37433q = i10;
        }

        public final void a(e eVar) {
            int i6 = this.f37418a;
            e.a aVar = e.a.MATCH_CONSTRAINT;
            int i10 = 0;
            g gVar = g.this;
            if (i6 == 0) {
                int Y = gVar.Y(this.f37433q, eVar);
                if (eVar.V[0] == aVar) {
                    this.f37432p++;
                    Y = 0;
                }
                int i11 = gVar.V0;
                if (eVar.f37376j0 != 8) {
                    i10 = i11;
                }
                this.f37428l = Y + i10 + this.f37428l;
                int X = gVar.X(this.f37433q, eVar);
                if (this.f37419b == null || this.f37420c < X) {
                    this.f37419b = eVar;
                    this.f37420c = X;
                    this.f37429m = X;
                }
            } else {
                int Y2 = gVar.Y(this.f37433q, eVar);
                int X2 = gVar.X(this.f37433q, eVar);
                if (eVar.V[1] == aVar) {
                    this.f37432p++;
                    X2 = 0;
                }
                int i12 = gVar.W0;
                if (eVar.f37376j0 != 8) {
                    i10 = i12;
                }
                this.f37429m = X2 + i10 + this.f37429m;
                if (this.f37419b == null || this.f37420c < Y2) {
                    this.f37419b = eVar;
                    this.f37420c = Y2;
                    this.f37428l = Y2;
                }
            }
            this.f37431o++;
        }

        public final void b(int i6, boolean z10, boolean z11) {
            g gVar;
            boolean z12;
            int i10;
            int i11;
            int i12;
            e eVar;
            int i13;
            int i14;
            int i15;
            float f;
            float f2;
            int i16;
            float f10;
            float f11;
            int i17;
            int i18;
            int i19;
            int i20 = this.f37431o;
            int i21 = 0;
            while (true) {
                gVar = g.this;
                if (i21 >= i20 || (i19 = this.f37430n + i21) >= gVar.f37417h1) {
                    break;
                }
                e eVar2 = gVar.g1[i19];
                if (eVar2 != null) {
                    eVar2.H();
                }
                i21++;
            }
            if (i20 != 0 && this.f37419b != null) {
                if (z11 && i6 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i22 = -1;
                int i23 = -1;
                for (int i24 = 0; i24 < i20; i24++) {
                    if (z10) {
                        i18 = (i20 - 1) - i24;
                    } else {
                        i18 = i24;
                    }
                    int i25 = this.f37430n + i18;
                    if (i25 >= gVar.f37417h1) {
                        break;
                    }
                    e eVar3 = gVar.g1[i25];
                    if (eVar3 != null && eVar3.f37376j0 == 0) {
                        if (i22 == -1) {
                            i22 = i24;
                        }
                        i23 = i24;
                    }
                }
                if (this.f37418a == 0) {
                    e eVar4 = this.f37419b;
                    eVar4.f37386o0 = gVar.K0;
                    int i26 = this.f37425i;
                    if (i6 > 0) {
                        i26 += gVar.W0;
                    }
                    d dVar = this.f37422e;
                    d dVar2 = eVar4.L;
                    dVar2.a(dVar, i26);
                    d dVar3 = eVar4.N;
                    if (z11) {
                        dVar3.a(this.f37423g, this.f37427k);
                    }
                    if (i6 > 0) {
                        this.f37422e.f37349d.N.a(dVar2, 0);
                    }
                    if (gVar.Y0 == 3 && !eVar4.F) {
                        for (int i27 = 0; i27 < i20; i27++) {
                            if (z10) {
                                i17 = (i20 - 1) - i27;
                            } else {
                                i17 = i27;
                            }
                            int i28 = this.f37430n + i17;
                            if (i28 >= gVar.f37417h1) {
                                break;
                            }
                            eVar = gVar.g1[i28];
                            if (eVar.F) {
                                break;
                            }
                        }
                    }
                    eVar = eVar4;
                    e eVar5 = null;
                    int i29 = 0;
                    while (i29 < i20) {
                        if (z10) {
                            i13 = (i20 - 1) - i29;
                        } else {
                            i13 = i29;
                        }
                        int i30 = this.f37430n + i13;
                        if (i30 < gVar.f37417h1) {
                            e eVar6 = gVar.g1[i30];
                            if (eVar6 == null) {
                                i14 = i20;
                            } else {
                                d dVar4 = eVar6.K;
                                if (i29 == 0) {
                                    eVar6.i(dVar4, this.f37421d, this.f37424h);
                                }
                                if (i13 == 0) {
                                    int i31 = gVar.J0;
                                    if (z10) {
                                        i15 = i31;
                                        f = 1.0f - gVar.P0;
                                    } else {
                                        i15 = i31;
                                        f = gVar.P0;
                                    }
                                    if (this.f37430n == 0) {
                                        int i32 = gVar.L0;
                                        f2 = f;
                                        if (i32 != -1) {
                                            if (z10) {
                                                f11 = 1.0f - gVar.R0;
                                            } else {
                                                f11 = gVar.R0;
                                            }
                                            f10 = f11;
                                            i16 = i32;
                                            eVar6.f37384n0 = i16;
                                            eVar6.f37370g0 = f10;
                                        }
                                    } else {
                                        f2 = f;
                                    }
                                    if (z11 && (i16 = gVar.N0) != -1) {
                                        if (z10) {
                                            f10 = 1.0f - gVar.T0;
                                        } else {
                                            f10 = gVar.T0;
                                        }
                                    } else {
                                        i16 = i15;
                                        f10 = f2;
                                    }
                                    eVar6.f37384n0 = i16;
                                    eVar6.f37370g0 = f10;
                                }
                                if (i29 == i20 - 1) {
                                    i14 = i20;
                                    eVar6.i(eVar6.M, this.f, this.f37426j);
                                } else {
                                    i14 = i20;
                                }
                                if (eVar5 != null) {
                                    int i33 = gVar.V0;
                                    d dVar5 = eVar5.M;
                                    dVar4.a(dVar5, i33);
                                    if (i29 == i22) {
                                        int i34 = this.f37424h;
                                        if (dVar4.h()) {
                                            dVar4.f37352h = i34;
                                        }
                                    }
                                    dVar5.a(dVar4, 0);
                                    if (i29 == i23 + 1) {
                                        int i35 = this.f37426j;
                                        if (dVar5.h()) {
                                            dVar5.f37352h = i35;
                                        }
                                    }
                                }
                                if (eVar6 != eVar4) {
                                    int i36 = gVar.Y0;
                                    if (i36 == 3 && eVar.F && eVar6 != eVar && eVar6.F) {
                                        eVar6.O.a(eVar.O, 0);
                                    } else {
                                        d dVar6 = eVar6.L;
                                        if (i36 != 0) {
                                            d dVar7 = eVar6.N;
                                            if (i36 != 1) {
                                                if (z12) {
                                                    dVar6.a(this.f37422e, this.f37425i);
                                                    dVar7.a(this.f37423g, this.f37427k);
                                                } else {
                                                    dVar6.a(dVar2, 0);
                                                    dVar7.a(dVar3, 0);
                                                }
                                            } else {
                                                dVar7.a(dVar3, 0);
                                            }
                                        } else {
                                            dVar6.a(dVar2, 0);
                                        }
                                    }
                                }
                                eVar5 = eVar6;
                            }
                            i29++;
                            i20 = i14;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                e eVar7 = this.f37419b;
                eVar7.f37384n0 = gVar.J0;
                int i37 = this.f37424h;
                if (i6 > 0) {
                    i37 += gVar.V0;
                }
                d dVar8 = eVar7.M;
                d dVar9 = eVar7.K;
                if (z10) {
                    dVar8.a(this.f, i37);
                    if (z11) {
                        dVar9.a(this.f37421d, this.f37426j);
                    }
                    if (i6 > 0) {
                        this.f.f37349d.K.a(dVar8, 0);
                    }
                } else {
                    dVar9.a(this.f37421d, i37);
                    if (z11) {
                        dVar8.a(this.f, this.f37426j);
                    }
                    if (i6 > 0) {
                        this.f37421d.f37349d.M.a(dVar9, 0);
                    }
                }
                int i38 = 0;
                e eVar8 = null;
                while (i38 < i20) {
                    int i39 = this.f37430n + i38;
                    if (i39 < gVar.f37417h1) {
                        e eVar9 = gVar.g1[i39];
                        if (eVar9 == null) {
                            eVar9 = eVar8;
                        } else {
                            d dVar10 = eVar9.L;
                            if (i38 == 0) {
                                eVar9.i(dVar10, this.f37422e, this.f37425i);
                                int i40 = gVar.K0;
                                float f12 = gVar.Q0;
                                if (this.f37430n == 0) {
                                    i12 = gVar.M0;
                                    i10 = i40;
                                    i11 = -1;
                                    if (i12 != -1) {
                                        f12 = gVar.S0;
                                        eVar9.f37386o0 = i12;
                                        eVar9.f37372h0 = f12;
                                    }
                                } else {
                                    i10 = i40;
                                    i11 = -1;
                                }
                                if (z11 && (i12 = gVar.O0) != i11) {
                                    f12 = gVar.U0;
                                } else {
                                    i12 = i10;
                                }
                                eVar9.f37386o0 = i12;
                                eVar9.f37372h0 = f12;
                            }
                            if (i38 == i20 - 1) {
                                eVar9.i(eVar9.N, this.f37423g, this.f37427k);
                            }
                            if (eVar8 != null) {
                                int i41 = gVar.W0;
                                d dVar11 = eVar8.N;
                                dVar10.a(dVar11, i41);
                                if (i38 == i22) {
                                    int i42 = this.f37425i;
                                    if (dVar10.h()) {
                                        dVar10.f37352h = i42;
                                    }
                                }
                                dVar11.a(dVar10, 0);
                                if (i38 == i23 + 1) {
                                    int i43 = this.f37427k;
                                    if (dVar11.h()) {
                                        dVar11.f37352h = i43;
                                    }
                                }
                            }
                            if (eVar9 != eVar7) {
                                d dVar12 = eVar9.M;
                                d dVar13 = eVar9.K;
                                if (z10) {
                                    int i44 = gVar.X0;
                                    if (i44 != 0) {
                                        if (i44 != 1) {
                                            if (i44 == 2) {
                                                dVar13.a(dVar9, 0);
                                                dVar12.a(dVar8, 0);
                                            }
                                        } else {
                                            dVar13.a(dVar9, 0);
                                        }
                                    } else {
                                        dVar12.a(dVar8, 0);
                                    }
                                    i38++;
                                    eVar8 = eVar9;
                                } else {
                                    int i45 = gVar.X0;
                                    if (i45 != 0) {
                                        if (i45 != 1) {
                                            if (i45 == 2) {
                                                if (z12) {
                                                    dVar13.a(this.f37421d, this.f37424h);
                                                    dVar12.a(this.f, this.f37426j);
                                                } else {
                                                    dVar13.a(dVar9, 0);
                                                    dVar12.a(dVar8, 0);
                                                }
                                            }
                                        } else {
                                            dVar12.a(dVar8, 0);
                                        }
                                    } else {
                                        dVar13.a(dVar9, 0);
                                    }
                                    i38++;
                                    eVar8 = eVar9;
                                }
                            }
                        }
                        i38++;
                        eVar8 = eVar9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.f37418a == 1) {
                return this.f37429m - g.this.W0;
            }
            return this.f37429m;
        }

        public final int d() {
            if (this.f37418a == 0) {
                return this.f37428l - g.this.V0;
            }
            return this.f37428l;
        }

        public final void e(int i6) {
            int i10 = this.f37432p;
            if (i10 == 0) {
                return;
            }
            int i11 = this.f37431o;
            int i12 = i6 / i10;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f37430n;
                int i15 = i14 + i13;
                g gVar = g.this;
                if (i15 >= gVar.f37417h1) {
                    break;
                }
                e eVar = gVar.g1[i14 + i13];
                int i16 = this.f37418a;
                e.a aVar = e.a.FIXED;
                e.a aVar2 = e.a.MATCH_CONSTRAINT;
                if (i16 == 0) {
                    if (eVar != null) {
                        e.a[] aVarArr = eVar.V;
                        if (aVarArr[0] == aVar2 && eVar.f37392s == 0) {
                            gVar.W(eVar, aVar, i12, aVarArr[1], eVar.o());
                        }
                    }
                } else if (eVar != null) {
                    e.a[] aVarArr2 = eVar.V;
                    if (aVarArr2[1] == aVar2 && eVar.f37394t == 0) {
                        gVar.W(eVar, aVarArr2[0], eVar.u(), aVar, i12);
                    }
                }
            }
            this.f37428l = 0;
            this.f37429m = 0;
            this.f37419b = null;
            this.f37420c = 0;
            int i17 = this.f37431o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.f37430n + i18;
                g gVar2 = g.this;
                if (i19 < gVar2.f37417h1) {
                    e eVar2 = gVar2.g1[i19];
                    if (this.f37418a == 0) {
                        int u10 = eVar2.u();
                        int i20 = gVar2.V0;
                        if (eVar2.f37376j0 == 8) {
                            i20 = 0;
                        }
                        this.f37428l = u10 + i20 + this.f37428l;
                        int X = gVar2.X(this.f37433q, eVar2);
                        if (this.f37419b == null || this.f37420c < X) {
                            this.f37419b = eVar2;
                            this.f37420c = X;
                            this.f37429m = X;
                        }
                    } else {
                        int Y = gVar2.Y(this.f37433q, eVar2);
                        int X2 = gVar2.X(this.f37433q, eVar2);
                        int i21 = gVar2.W0;
                        if (eVar2.f37376j0 == 8) {
                            i21 = 0;
                        }
                        this.f37429m = X2 + i21 + this.f37429m;
                        if (this.f37419b == null || this.f37420c < Y) {
                            this.f37419b = eVar2;
                            this.f37420c = Y;
                            this.f37428l = Y;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i10, int i11, int i12, int i13, int i14) {
            this.f37418a = i6;
            this.f37421d = dVar;
            this.f37422e = dVar2;
            this.f = dVar3;
            this.f37423g = dVar4;
            this.f37424h = i10;
            this.f37425i = i11;
            this.f37426j = i12;
            this.f37427k = i13;
            this.f37433q = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x085c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x050f -> B:295:0x051c). Please submit an issue!!! */
    @Override // x.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i6, int i10, int i11, int i12) {
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        a aVar;
        char c10;
        char c11;
        int i18;
        int i19;
        int i20;
        int i21;
        g gVar;
        int i22;
        int i23;
        int[] iArr2;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z10;
        g gVar2;
        int i28;
        int i29;
        int i30;
        int i31;
        e.a aVar2;
        int i32;
        boolean z11;
        int i33;
        boolean z12;
        int i34;
        ArrayList<a> arrayList;
        boolean z13;
        int i35;
        e.a aVar3;
        e.a aVar4;
        e eVar;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        g gVar3;
        e[] eVarArr;
        int[] iArr3;
        boolean z14;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        e eVar2;
        e[] eVarArr2;
        e.a aVar5;
        int i54;
        int i55;
        boolean z15;
        e.a aVar6;
        int i56;
        boolean z16;
        int i57;
        int i58;
        ArrayList<a> arrayList2;
        boolean z17;
        int i59;
        e.a aVar7;
        int i60;
        int i61;
        e eVar3;
        int i62;
        int i63;
        b.InterfaceC0647b interfaceC0647b;
        boolean z18;
        boolean z19;
        boolean z20;
        int i64 = this.f37439x0;
        e.a aVar8 = e.a.WRAP_CONTENT;
        e.a aVar9 = e.a.MATCH_CONSTRAINT;
        if (i64 > 0) {
            e eVar4 = this.W;
            if (eVar4 != null) {
                interfaceC0647b = ((f) eVar4).A0;
            } else {
                interfaceC0647b = null;
            }
            if (interfaceC0647b == null) {
                z18 = false;
            } else {
                for (int i65 = 0; i65 < this.f37439x0; i65++) {
                    e eVar5 = this.f37438w0[i65];
                    if (eVar5 != null && !(eVar5 instanceof h)) {
                        e.a n10 = eVar5.n(0);
                        e.a n11 = eVar5.n(1);
                        if (n10 == aVar9 && eVar5.f37392s != 1 && n11 == aVar9 && eVar5.f37394t != 1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            if (n10 == aVar9) {
                                n10 = aVar8;
                            }
                            if (n11 == aVar9) {
                                n11 = aVar8;
                            }
                            b.a aVar10 = this.H0;
                            aVar10.f38135a = n10;
                            aVar10.f38136b = n11;
                            aVar10.f38137c = eVar5.u();
                            aVar10.f38138d = eVar5.o();
                            ((ConstraintLayout.b) interfaceC0647b).b(eVar5, aVar10);
                            eVar5.R(aVar10.f38139e);
                            eVar5.O(aVar10.f);
                            int i66 = aVar10.f38140g;
                            eVar5.f37366d0 = i66;
                            if (i66 > 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            eVar5.F = z20;
                        }
                    }
                }
                z18 = true;
            }
            if (!z18) {
                this.F0 = 0;
                this.G0 = 0;
                this.E0 = false;
                return;
            }
        }
        int i67 = this.C0;
        int i68 = this.D0;
        int i69 = this.f37441y0;
        int i70 = this.f37442z0;
        int[] iArr4 = new int[2];
        int i71 = (i10 - i67) - i68;
        int i72 = this.b1;
        if (i72 == 1) {
            i71 = (i12 - i69) - i70;
        }
        int i73 = i71;
        if (i72 == 0) {
            if (this.J0 == -1) {
                this.J0 = 0;
            }
            if (this.K0 == -1) {
                this.K0 = 0;
            }
        } else {
            if (this.J0 == -1) {
                this.J0 = 0;
            }
            if (this.K0 == -1) {
                this.K0 = 0;
            }
        }
        e[] eVarArr3 = this.f37438w0;
        int i74 = 0;
        int i75 = 0;
        while (true) {
            i13 = this.f37439x0;
            if (i74 >= i13) {
                break;
            }
            if (this.f37438w0[i74].f37376j0 == 8) {
                i75++;
            }
            i74++;
        }
        if (i75 > 0) {
            eVarArr3 = new e[i13 - i75];
            i13 = 0;
            for (int i76 = 0; i76 < this.f37439x0; i76++) {
                e eVar6 = this.f37438w0[i76];
                if (eVar6.f37376j0 != 8) {
                    eVarArr3[i13] = eVar6;
                    i13++;
                }
            }
        }
        int i77 = i13;
        e[] eVarArr4 = eVarArr3;
        this.g1 = eVarArr4;
        this.f37417h1 = i77;
        int i78 = this.Z0;
        ArrayList<a> arrayList3 = this.f37413c1;
        if (i78 != 0) {
            d dVar = this.L;
            d dVar2 = this.K;
            i15 = i67;
            d dVar3 = this.M;
            d dVar4 = this.N;
            if (i78 != 1) {
                if (i78 != 2) {
                    if (i78 == 3) {
                        int i79 = this.b1;
                        if (i77 != 0) {
                            arrayList3.clear();
                            ArrayList<a> arrayList4 = arrayList3;
                            int i80 = i73;
                            iArr = iArr4;
                            i14 = i70;
                            a aVar11 = new a(i79, this.K, this.L, this.M, this.N, i80);
                            arrayList4.add(aVar11);
                            if (i79 == 0) {
                                int i81 = 0;
                                i55 = 0;
                                int i82 = 0;
                                int i83 = 0;
                                while (i83 < i77) {
                                    int i84 = i81 + 1;
                                    e eVar7 = eVarArr4[i83];
                                    int i85 = i80;
                                    int Y = Y(i85, eVar7);
                                    if (eVar7.V[0] == aVar9) {
                                        i55++;
                                    }
                                    int i86 = i55;
                                    if ((i82 == i85 || this.V0 + i82 + Y > i85) && aVar11.f37419b != null) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (!z17 && i83 > 0 && (i63 = this.f37412a1) > 0 && i84 > i63) {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        i60 = i68;
                                        i59 = i85;
                                        i61 = i69;
                                        eVar3 = eVar7;
                                        aVar7 = aVar8;
                                        i62 = i83;
                                        a aVar12 = new a(i79, this.K, this.L, this.M, this.N, i59);
                                        aVar12.f37430n = i62;
                                        arrayList4.add(aVar12);
                                        aVar11 = aVar12;
                                        i82 = Y;
                                        i81 = i84;
                                    } else {
                                        i59 = i85;
                                        aVar7 = aVar8;
                                        i60 = i68;
                                        i61 = i69;
                                        eVar3 = eVar7;
                                        i62 = i83;
                                        if (i62 > 0) {
                                            Y = this.V0 + Y + i82;
                                        }
                                        i82 = Y;
                                        i81 = 0;
                                    }
                                    aVar11.a(eVar3);
                                    i83 = i62 + 1;
                                    i55 = i86;
                                    aVar8 = aVar7;
                                    i68 = i60;
                                    i80 = i59;
                                    i69 = i61;
                                }
                                aVar5 = aVar8;
                                i17 = i69;
                                int i87 = i80;
                                i16 = i68;
                                i54 = i87;
                            } else {
                                aVar5 = aVar8;
                                i17 = i69;
                                int i88 = i80;
                                i16 = i68;
                                int i89 = 0;
                                int i90 = 0;
                                int i91 = 0;
                                while (i91 < i77) {
                                    e eVar8 = eVarArr4[i91];
                                    int i92 = i88;
                                    int X = X(i92, eVar8);
                                    if (eVar8.V[1] == aVar9) {
                                        i89++;
                                    }
                                    int i93 = i89;
                                    if ((i90 == i92 || this.W0 + i90 + X > i92) && aVar11.f37419b != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (!z15 && i91 > 0 && (i56 = this.f37412a1) > 0 && i56 < 0) {
                                        z15 = true;
                                    }
                                    if (z15) {
                                        aVar6 = aVar9;
                                        a aVar13 = new a(i79, this.K, this.L, this.M, this.N, i92);
                                        aVar13.f37430n = i91;
                                        arrayList4.add(aVar13);
                                        aVar11 = aVar13;
                                    } else {
                                        aVar6 = aVar9;
                                        if (i91 > 0) {
                                            i90 = this.W0 + X + i90;
                                            aVar11.a(eVar8);
                                            i91++;
                                            i88 = i92;
                                            i89 = i93;
                                            aVar9 = aVar6;
                                        }
                                    }
                                    i90 = X;
                                    aVar11.a(eVar8);
                                    i91++;
                                    i88 = i92;
                                    i89 = i93;
                                    aVar9 = aVar6;
                                }
                                i54 = i88;
                                i55 = i89;
                            }
                            int size = arrayList4.size();
                            int i94 = this.C0;
                            int i95 = this.f37441y0;
                            int i96 = this.D0;
                            int i97 = this.f37442z0;
                            e.a[] aVarArr = this.V;
                            e.a aVar14 = aVar5;
                            if (aVarArr[0] != aVar14 && aVarArr[1] != aVar14) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (i55 > 0 && z16) {
                                for (int i98 = 0; i98 < size; i98++) {
                                    a aVar15 = arrayList4.get(i98);
                                    if (i79 == 0) {
                                        aVar15.e(i54 - aVar15.d());
                                    } else {
                                        aVar15.e(i54 - aVar15.c());
                                    }
                                }
                            }
                            int i99 = i95;
                            d dVar5 = dVar;
                            d dVar6 = dVar3;
                            d dVar7 = dVar4;
                            int i100 = 0;
                            int i101 = 0;
                            int i102 = 0;
                            int i103 = i94;
                            d dVar8 = dVar2;
                            while (i100 < size) {
                                int i104 = i97;
                                a aVar16 = arrayList4.get(i100);
                                if (i79 == 0) {
                                    if (i100 < size - 1) {
                                        dVar7 = arrayList4.get(i100 + 1).f37419b.L;
                                        arrayList2 = arrayList4;
                                        i58 = 0;
                                    } else {
                                        i58 = this.f37442z0;
                                        arrayList2 = arrayList4;
                                        dVar7 = dVar4;
                                    }
                                    d dVar9 = aVar16.f37419b.N;
                                    aVar16.f(i79, dVar8, dVar5, dVar6, dVar7, i103, i99, i96, i58, i54);
                                    int max = Math.max(i101, aVar16.d());
                                    int c12 = aVar16.c() + i102;
                                    if (i100 > 0) {
                                        c12 += this.W0;
                                    }
                                    i101 = max;
                                    i102 = c12;
                                    dVar5 = dVar9;
                                    i97 = i58;
                                    arrayList4 = arrayList2;
                                    i99 = 0;
                                    i57 = size;
                                } else {
                                    ArrayList<a> arrayList5 = arrayList4;
                                    if (i100 < size - 1) {
                                        arrayList4 = arrayList5;
                                        i57 = size;
                                        dVar6 = arrayList4.get(i100 + 1).f37419b.K;
                                        i96 = 0;
                                    } else {
                                        arrayList4 = arrayList5;
                                        i96 = this.D0;
                                        i57 = size;
                                        dVar6 = dVar3;
                                    }
                                    d dVar10 = aVar16.f37419b.M;
                                    aVar16.f(i79, dVar8, dVar5, dVar6, dVar7, i103, i99, i96, i104, i54);
                                    int d10 = aVar16.d() + i101;
                                    int max2 = Math.max(i102, aVar16.c());
                                    if (i100 > 0) {
                                        d10 += this.V0;
                                    }
                                    i101 = d10;
                                    i102 = max2;
                                    i97 = i104;
                                    i103 = 0;
                                    dVar8 = dVar10;
                                }
                                i100++;
                                size = i57;
                            }
                            iArr[0] = i101;
                            iArr[1] = i102;
                        }
                    }
                    iArr = iArr4;
                    i14 = i70;
                    i16 = i68;
                    i17 = i69;
                } else {
                    e[] eVarArr5 = eVarArr4;
                    iArr = iArr4;
                    i14 = i70;
                    i17 = i69;
                    int i105 = this.b1;
                    if (i105 == 0) {
                        int i106 = this.f37412a1;
                        if (i106 <= 0) {
                            int i107 = 0;
                            int i108 = 0;
                            for (int i109 = 0; i109 < i77; i109++) {
                                if (i109 > 0) {
                                    i107 += this.V0;
                                }
                                e eVar9 = eVarArr5[i109];
                                if (eVar9 != null) {
                                    int Y2 = Y(i73, eVar9) + i107;
                                    if (Y2 > i73) {
                                        break;
                                    }
                                    i108++;
                                    i107 = Y2;
                                }
                            }
                            i106 = i108;
                        }
                        i38 = i106;
                        i37 = 0;
                    } else {
                        i37 = this.f37412a1;
                        if (i37 <= 0) {
                            int i110 = 0;
                            int i111 = 0;
                            for (int i112 = 0; i112 < i77; i112++) {
                                if (i112 > 0) {
                                    i110 += this.W0;
                                }
                                e eVar10 = eVarArr5[i112];
                                if (eVar10 != null) {
                                    int X2 = X(i73, eVar10) + i110;
                                    if (X2 > i73) {
                                        break;
                                    }
                                    i111++;
                                    i110 = X2;
                                }
                            }
                            i37 = i111;
                        }
                        i38 = 0;
                    }
                    if (this.f37416f1 == null) {
                        this.f37416f1 = new int[2];
                    }
                    if ((i37 == 0 && i105 == 1) || (i38 == 0 && i105 == 0)) {
                        i49 = i11;
                        i53 = i12;
                        i52 = i105;
                        i51 = i37;
                        i50 = i38;
                        gVar3 = this;
                        gVar2 = gVar3;
                        i22 = i15;
                        i23 = i68;
                        iArr3 = iArr;
                        i47 = i6;
                        i48 = i10;
                        i42 = i47;
                        i43 = i48;
                        i44 = i49;
                        i28 = i53;
                        i39 = i52;
                        i40 = i51;
                        i41 = i50;
                        eVarArr = eVarArr5;
                        z14 = true;
                        while (!z14) {
                        }
                        int i113 = i43;
                        int[] iArr5 = gVar3.f37416f1;
                        iArr5[0] = i41;
                        iArr5[1] = i40;
                        i18 = i42;
                        i30 = i113;
                        i29 = i44;
                        iArr2 = iArr;
                        i24 = i14;
                        i25 = i17;
                        i21 = i28;
                        gVar = gVar2;
                        c10 = 0;
                        i20 = i29;
                        i19 = i30;
                        c11 = 1;
                        int i114 = iArr2[c10] + i22 + i23;
                        int i115 = iArr2[c11] + i25 + i24;
                        if (i18 != 1073741824) {
                        }
                        if (i20 != 1073741824) {
                        }
                        gVar.F0 = i26;
                        gVar.G0 = i27;
                        gVar.R(i26);
                        gVar.O(i27);
                        if (gVar.f37439x0 <= 0) {
                        }
                        gVar.E0 = z10;
                    }
                    i28 = i12;
                    i39 = i105;
                    i40 = i37;
                    i41 = i38;
                    gVar3 = this;
                    gVar2 = gVar3;
                    i22 = i15;
                    eVarArr = eVarArr5;
                    i23 = i68;
                    iArr3 = iArr;
                    z14 = false;
                    i42 = i6;
                    i43 = i10;
                    i44 = i11;
                    while (!z14) {
                        if (i39 == 0) {
                            i45 = i42;
                            i46 = i43;
                            i40 = (int) Math.ceil(i77 / i41);
                        } else {
                            i45 = i42;
                            i46 = i43;
                            i41 = (int) Math.ceil(i77 / i40);
                        }
                        e[] eVarArr6 = gVar3.f37415e1;
                        if (eVarArr6 != null && eVarArr6.length >= i41) {
                            Arrays.fill(eVarArr6, (Object) null);
                        } else {
                            gVar3.f37415e1 = new e[i41];
                        }
                        e[] eVarArr7 = gVar3.f37414d1;
                        if (eVarArr7 != null && eVarArr7.length >= i40) {
                            Arrays.fill(eVarArr7, (Object) null);
                        } else {
                            gVar3.f37414d1 = new e[i40];
                        }
                        for (int i116 = 0; i116 < i41; i116++) {
                            int i117 = 0;
                            while (i117 < i40) {
                                int i118 = (i117 * i41) + i116;
                                int i119 = i44;
                                if (i39 == 1) {
                                    i118 = (i116 * i40) + i117;
                                }
                                int i120 = i28;
                                int i121 = i118;
                                if (i121 >= eVarArr.length || (eVar2 = eVarArr[i121]) == null) {
                                    eVarArr2 = eVarArr;
                                } else {
                                    int Y3 = gVar3.Y(i73, eVar2);
                                    eVarArr2 = eVarArr;
                                    e eVar11 = gVar3.f37415e1[i116];
                                    if (eVar11 == null || eVar11.u() < Y3) {
                                        gVar3.f37415e1[i116] = eVar2;
                                    }
                                    int X3 = gVar3.X(i73, eVar2);
                                    e eVar12 = gVar3.f37414d1[i117];
                                    if (eVar12 == null || eVar12.o() < X3) {
                                        gVar3.f37414d1[i117] = eVar2;
                                    }
                                }
                                i117++;
                                i44 = i119;
                                i28 = i120;
                                eVarArr = eVarArr2;
                            }
                        }
                        int i122 = i44;
                        int i123 = i28;
                        e[] eVarArr8 = eVarArr;
                        int i124 = 0;
                        for (int i125 = 0; i125 < i41; i125++) {
                            e eVar13 = gVar3.f37415e1[i125];
                            if (eVar13 != null) {
                                if (i125 > 0) {
                                    i124 += gVar3.V0;
                                }
                                i124 = gVar3.Y(i73, eVar13) + i124;
                            }
                        }
                        int i126 = 0;
                        for (int i127 = 0; i127 < i40; i127++) {
                            e eVar14 = gVar3.f37414d1[i127];
                            if (eVar14 != null) {
                                if (i127 > 0) {
                                    i126 += gVar3.W0;
                                }
                                i126 = gVar3.X(i73, eVar14) + i126;
                            }
                        }
                        iArr3[0] = i124;
                        iArr3[1] = i126;
                        if (i39 == 0) {
                            if (i124 > i73 && i41 > 1) {
                                i41--;
                                i42 = i45;
                                i43 = i46;
                                i44 = i122;
                                i28 = i123;
                                eVarArr = eVarArr8;
                            }
                            i47 = i45;
                            i48 = i46;
                            i49 = i122;
                            i50 = i41;
                            eVarArr5 = eVarArr8;
                            i51 = i40;
                            i52 = i39;
                            i53 = i123;
                        } else {
                            if (i126 > i73 && i40 > 1) {
                                i40--;
                                i42 = i45;
                                i43 = i46;
                                i44 = i122;
                                i28 = i123;
                                eVarArr = eVarArr8;
                            }
                            i47 = i45;
                            i48 = i46;
                            i49 = i122;
                            i50 = i41;
                            eVarArr5 = eVarArr8;
                            i51 = i40;
                            i52 = i39;
                            i53 = i123;
                        }
                        i42 = i47;
                        i43 = i48;
                        i44 = i49;
                        i28 = i53;
                        i39 = i52;
                        i40 = i51;
                        i41 = i50;
                        eVarArr = eVarArr5;
                        z14 = true;
                        while (!z14) {
                        }
                    }
                    int i1132 = i43;
                    int[] iArr52 = gVar3.f37416f1;
                    iArr52[0] = i41;
                    iArr52[1] = i40;
                    i18 = i42;
                    i30 = i1132;
                    i29 = i44;
                    iArr2 = iArr;
                    i24 = i14;
                    i25 = i17;
                    i21 = i28;
                    gVar = gVar2;
                    c10 = 0;
                    i20 = i29;
                    i19 = i30;
                    c11 = 1;
                    int i1142 = iArr2[c10] + i22 + i23;
                    int i1152 = iArr2[c11] + i25 + i24;
                    if (i18 != 1073741824) {
                        i26 = i19;
                    } else if (i18 == Integer.MIN_VALUE) {
                        i26 = Math.min(i1142, i19);
                    } else if (i18 == 0) {
                        i26 = i1142;
                    } else {
                        i26 = 0;
                    }
                    if (i20 != 1073741824) {
                        i27 = i21;
                    } else if (i20 == Integer.MIN_VALUE) {
                        i27 = Math.min(i1152, i21);
                    } else if (i20 == 0) {
                        i27 = i1152;
                    } else {
                        i27 = 0;
                    }
                    gVar.F0 = i26;
                    gVar.G0 = i27;
                    gVar.R(i26);
                    gVar.O(i27);
                    if (gVar.f37439x0 <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gVar.E0 = z10;
                }
            } else {
                iArr = iArr4;
                i14 = i70;
                e.a aVar17 = aVar9;
                i16 = i68;
                i17 = i69;
                ArrayList<a> arrayList6 = arrayList3;
                e.a aVar18 = aVar8;
                int i128 = this.b1;
                if (i77 != 0) {
                    arrayList6.clear();
                    a aVar19 = new a(i128, this.K, this.L, this.M, this.N, i73);
                    arrayList6.add(aVar19);
                    if (i128 == 0) {
                        i32 = 0;
                        int i129 = 0;
                        int i130 = 0;
                        while (i130 < i77) {
                            e eVar15 = eVarArr4[i130];
                            int Y4 = Y(i73, eVar15);
                            e.a aVar20 = aVar17;
                            if (eVar15.V[0] == aVar20) {
                                i32++;
                            }
                            int i131 = i32;
                            if ((i129 == i73 || this.V0 + i129 + Y4 > i73) && aVar19.f37419b != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13 && i130 > 0 && (i36 = this.f37412a1) > 0 && i130 % i36 == 0) {
                                z13 = true;
                            }
                            if (z13) {
                                int i132 = i128;
                                aVar3 = aVar18;
                                aVar4 = aVar20;
                                i35 = i128;
                                eVar = eVar15;
                                aVar19 = new a(i132, this.K, this.L, this.M, this.N, i73);
                                aVar19.f37430n = i130;
                                arrayList6.add(aVar19);
                            } else {
                                i35 = i128;
                                aVar3 = aVar18;
                                aVar4 = aVar20;
                                eVar = eVar15;
                                if (i130 > 0) {
                                    i129 = this.V0 + Y4 + i129;
                                    aVar19.a(eVar);
                                    i130++;
                                    aVar17 = aVar4;
                                    i32 = i131;
                                    aVar18 = aVar3;
                                    i128 = i35;
                                }
                            }
                            i129 = Y4;
                            aVar19.a(eVar);
                            i130++;
                            aVar17 = aVar4;
                            i32 = i131;
                            aVar18 = aVar3;
                            i128 = i35;
                        }
                        i31 = i128;
                        aVar2 = aVar18;
                    } else {
                        i31 = i128;
                        aVar2 = aVar18;
                        i32 = 0;
                        int i133 = 0;
                        int i134 = 0;
                        while (i134 < i77) {
                            e eVar16 = eVarArr4[i134];
                            int X4 = X(i73, eVar16);
                            if (eVar16.V[1] == aVar17) {
                                i32++;
                            }
                            int i135 = i32;
                            if ((i133 == i73 || this.W0 + i133 + X4 > i73) && aVar19.f37419b != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11 && i134 > 0 && (i33 = this.f37412a1) > 0 && i134 % i33 == 0) {
                                z11 = true;
                            }
                            if (z11) {
                                aVar19 = new a(i31, this.K, this.L, this.M, this.N, i73);
                                aVar19.f37430n = i134;
                                arrayList6.add(aVar19);
                            } else if (i134 > 0) {
                                i133 = this.W0 + X4 + i133;
                                aVar19.a(eVar16);
                                i134++;
                                i32 = i135;
                            }
                            i133 = X4;
                            aVar19.a(eVar16);
                            i134++;
                            i32 = i135;
                        }
                    }
                    int size2 = arrayList6.size();
                    int i136 = this.C0;
                    int i137 = this.f37441y0;
                    int i138 = this.D0;
                    int i139 = this.f37442z0;
                    e.a[] aVarArr2 = this.V;
                    e.a aVar21 = aVar2;
                    if (aVarArr2[0] != aVar21 && aVarArr2[1] != aVar21) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i32 > 0 && z12) {
                        for (int i140 = 0; i140 < size2; i140++) {
                            a aVar22 = arrayList6.get(i140);
                            if (i31 == 0) {
                                aVar22.e(i73 - aVar22.d());
                            } else {
                                aVar22.e(i73 - aVar22.c());
                            }
                        }
                    }
                    int i141 = i137;
                    d dVar11 = dVar2;
                    d dVar12 = dVar3;
                    d dVar13 = dVar4;
                    int i142 = 0;
                    int i143 = 0;
                    int i144 = 0;
                    int i145 = i136;
                    d dVar14 = dVar;
                    while (i142 < size2) {
                        a aVar23 = arrayList6.get(i142);
                        if (i31 == 0) {
                            if (i142 < size2 - 1) {
                                dVar13 = arrayList6.get(i142 + 1).f37419b.L;
                                arrayList = arrayList6;
                                i139 = 0;
                            } else {
                                i139 = this.f37442z0;
                                arrayList = arrayList6;
                                dVar13 = dVar4;
                            }
                            d dVar15 = aVar23.f37419b.N;
                            aVar23.f(i31, dVar11, dVar14, dVar12, dVar13, i145, i141, i138, i139, i73);
                            int max3 = Math.max(i143, aVar23.d());
                            int c13 = aVar23.c() + i144;
                            if (i142 > 0) {
                                c13 += this.W0;
                            }
                            i34 = size2;
                            i143 = max3;
                            i144 = c13;
                            dVar14 = dVar15;
                            arrayList6 = arrayList;
                            i141 = 0;
                        } else {
                            ArrayList<a> arrayList7 = arrayList6;
                            if (i142 < size2 - 1) {
                                arrayList6 = arrayList7;
                                i34 = size2;
                                dVar12 = arrayList6.get(i142 + 1).f37419b.K;
                                i138 = 0;
                            } else {
                                arrayList6 = arrayList7;
                                i138 = this.D0;
                                i34 = size2;
                                dVar12 = dVar3;
                            }
                            d dVar16 = aVar23.f37419b.M;
                            aVar23.f(i31, dVar11, dVar14, dVar12, dVar13, i145, i141, i138, i139, i73);
                            int d11 = aVar23.d() + i143;
                            int max4 = Math.max(i144, aVar23.c());
                            if (i142 > 0) {
                                d11 += this.V0;
                            }
                            i143 = d11;
                            dVar11 = dVar16;
                            i144 = max4;
                            i145 = 0;
                        }
                        i142++;
                        size2 = i34;
                    }
                    iArr[0] = i143;
                    iArr[1] = i144;
                }
            }
        } else {
            iArr = iArr4;
            i14 = i70;
            i15 = i67;
            i16 = i68;
            i17 = i69;
            int i146 = this.b1;
            if (i77 != 0) {
                if (arrayList3.size() == 0) {
                    aVar = new a(i146, this.K, this.L, this.M, this.N, i73);
                    arrayList3.add(aVar);
                } else {
                    aVar = arrayList3.get(0);
                    aVar.f37420c = 0;
                    aVar.f37419b = null;
                    aVar.f37428l = 0;
                    aVar.f37429m = 0;
                    aVar.f37430n = 0;
                    aVar.f37431o = 0;
                    aVar.f37432p = 0;
                    aVar.f(i146, this.K, this.L, this.M, this.N, this.C0, this.f37441y0, this.D0, this.f37442z0, i73);
                }
                for (int i147 = 0; i147 < i77; i147++) {
                    aVar.a(eVarArr4[i147]);
                }
                c10 = 0;
                iArr[0] = aVar.d();
                c11 = 1;
                iArr[1] = aVar.c();
                i18 = i6;
                i19 = i10;
                i20 = i11;
                i21 = i12;
                gVar = this;
                i22 = i15;
                i23 = i16;
                iArr2 = iArr;
                i24 = i14;
                i25 = i17;
                int i11422 = iArr2[c10] + i22 + i23;
                int i11522 = iArr2[c11] + i25 + i24;
                if (i18 != 1073741824) {
                }
                if (i20 != 1073741824) {
                }
                gVar.F0 = i26;
                gVar.G0 = i27;
                gVar.R(i26);
                gVar.O(i27);
                if (gVar.f37439x0 <= 0) {
                }
                gVar.E0 = z10;
            }
        }
        i18 = i6;
        i30 = i10;
        i29 = i11;
        i28 = i12;
        gVar2 = this;
        i22 = i15;
        i23 = i16;
        iArr2 = iArr;
        i24 = i14;
        i25 = i17;
        i21 = i28;
        gVar = gVar2;
        c10 = 0;
        i20 = i29;
        i19 = i30;
        c11 = 1;
        int i114222 = iArr2[c10] + i22 + i23;
        int i115222 = iArr2[c11] + i25 + i24;
        if (i18 != 1073741824) {
        }
        if (i20 != 1073741824) {
        }
        gVar.F0 = i26;
        gVar.G0 = i27;
        gVar.R(i26);
        gVar.O(i27);
        if (gVar.f37439x0 <= 0) {
        }
        gVar.E0 = z10;
    }

    public final int X(int i6, e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.V[1] == e.a.MATCH_CONSTRAINT) {
            int i10 = eVar.f37394t;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.A * i6);
                if (i11 != eVar.o()) {
                    eVar.f37369g = true;
                    W(eVar, eVar.V[0], eVar.u(), e.a.FIXED, i11);
                }
                return i11;
            } else if (i10 == 1) {
                return eVar.o();
            } else {
                if (i10 == 3) {
                    return (int) ((eVar.u() * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.o();
    }

    public final int Y(int i6, e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.V[0] == e.a.MATCH_CONSTRAINT) {
            int i10 = eVar.f37392s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.f37401x * i6);
                if (i11 != eVar.u()) {
                    eVar.f37369g = true;
                    W(eVar, e.a.FIXED, i11, eVar.V[1], eVar.o());
                }
                return i11;
            } else if (i10 == 1) {
                return eVar.u();
            } else {
                if (i10 == 3) {
                    return (int) ((eVar.o() * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.u();
    }

    @Override // x.e
    public final void e(v.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        float f;
        int i6;
        boolean z13;
        super.e(dVar, z10);
        e eVar2 = this.W;
        if (eVar2 != null && ((f) eVar2).B0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = this.Z0;
        ArrayList<a> arrayList = this.f37413c1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            a aVar = arrayList.get(i11);
                            if (i11 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.b(i11, z11, z13);
                        }
                    }
                } else if (this.f37416f1 != null && this.f37415e1 != null && this.f37414d1 != null) {
                    for (int i12 = 0; i12 < this.f37417h1; i12++) {
                        this.g1[i12].H();
                    }
                    int[] iArr = this.f37416f1;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    float f2 = this.P0;
                    e eVar3 = null;
                    int i15 = 0;
                    while (i15 < i13) {
                        if (z11) {
                            i6 = (i13 - i15) - 1;
                            f = 1.0f - this.P0;
                        } else {
                            f = f2;
                            i6 = i15;
                        }
                        e eVar4 = this.f37415e1[i6];
                        if (eVar4 != null && eVar4.f37376j0 != 8) {
                            d dVar2 = eVar4.K;
                            if (i15 == 0) {
                                eVar4.i(dVar2, this.K, this.C0);
                                eVar4.f37384n0 = this.J0;
                                eVar4.f37370g0 = f;
                            }
                            if (i15 == i13 - 1) {
                                eVar4.i(eVar4.M, this.M, this.D0);
                            }
                            if (i15 > 0 && eVar3 != null) {
                                int i16 = this.V0;
                                d dVar3 = eVar3.M;
                                eVar4.i(dVar2, dVar3, i16);
                                eVar3.i(dVar3, dVar2, 0);
                            }
                            eVar3 = eVar4;
                        }
                        i15++;
                        f2 = f;
                    }
                    for (int i17 = 0; i17 < i14; i17++) {
                        e eVar5 = this.f37414d1[i17];
                        if (eVar5 != null && eVar5.f37376j0 != 8) {
                            d dVar4 = eVar5.L;
                            if (i17 == 0) {
                                eVar5.i(dVar4, this.L, this.f37441y0);
                                eVar5.f37386o0 = this.K0;
                                eVar5.f37372h0 = this.Q0;
                            }
                            if (i17 == i14 - 1) {
                                eVar5.i(eVar5.N, this.N, this.f37442z0);
                            }
                            if (i17 > 0 && eVar3 != null) {
                                int i18 = this.W0;
                                d dVar5 = eVar3.N;
                                eVar5.i(dVar4, dVar5, i18);
                                eVar3.i(dVar5, dVar4, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                    for (int i19 = 0; i19 < i13; i19++) {
                        for (int i20 = 0; i20 < i14; i20++) {
                            int i21 = (i20 * i13) + i19;
                            if (this.b1 == 1) {
                                i21 = (i19 * i14) + i20;
                            }
                            e[] eVarArr = this.g1;
                            if (i21 < eVarArr.length && (eVar = eVarArr[i21]) != null && eVar.f37376j0 != 8) {
                                e eVar6 = this.f37415e1[i19];
                                e eVar7 = this.f37414d1[i20];
                                if (eVar != eVar6) {
                                    eVar.i(eVar.K, eVar6.K, 0);
                                    eVar.i(eVar.M, eVar6.M, 0);
                                }
                                if (eVar != eVar7) {
                                    eVar.i(eVar.L, eVar7.L, 0);
                                    eVar.i(eVar.N, eVar7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    a aVar2 = arrayList.get(i22);
                    if (i22 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar2.b(i22, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.E0 = false;
    }

    @Override // x.j, x.e
    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        g gVar = (g) eVar;
        this.J0 = gVar.J0;
        this.K0 = gVar.K0;
        this.L0 = gVar.L0;
        this.M0 = gVar.M0;
        this.N0 = gVar.N0;
        this.O0 = gVar.O0;
        this.P0 = gVar.P0;
        this.Q0 = gVar.Q0;
        this.R0 = gVar.R0;
        this.S0 = gVar.S0;
        this.T0 = gVar.T0;
        this.U0 = gVar.U0;
        this.V0 = gVar.V0;
        this.W0 = gVar.W0;
        this.X0 = gVar.X0;
        this.Y0 = gVar.Y0;
        this.Z0 = gVar.Z0;
        this.f37412a1 = gVar.f37412a1;
        this.b1 = gVar.b1;
    }
}
