package v;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f34635p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f34636q = 1000;

    /* renamed from: c  reason: collision with root package name */
    public final f f34639c;
    public b[] f;

    /* renamed from: l  reason: collision with root package name */
    public final c f34647l;

    /* renamed from: o  reason: collision with root package name */
    public b f34650o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f34637a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f34638b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f34640d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f34641e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f34642g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f34643h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f34644i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f34645j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f34646k = 32;

    /* renamed from: m  reason: collision with root package name */
    public i[] f34648m = new i[f34636q];

    /* renamed from: n  reason: collision with root package name */
    public int f34649n = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        i a(boolean[] zArr);
    }

    public d() {
        this.f = null;
        this.f = new b[32];
        s();
        c cVar = new c(0);
        this.f34647l = cVar;
        this.f34639c = new f(cVar);
        this.f34650o = new b(cVar);
    }

    public static int n(x.d dVar) {
        i iVar = dVar.f37353i;
        if (iVar != null) {
            return (int) (iVar.f34664y + 0.5f);
        }
        return 0;
    }

    public final i a(int i6) {
        i iVar = (i) ((e) this.f34647l.f34633x).b();
        if (iVar == null) {
            iVar = new i(i6);
            iVar.C = i6;
        } else {
            iVar.h();
            iVar.C = i6;
        }
        int i10 = this.f34649n;
        int i11 = f34636q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f34636q = i12;
            this.f34648m = (i[]) Arrays.copyOf(this.f34648m, i12);
        }
        i[] iVarArr = this.f34648m;
        int i13 = this.f34649n;
        this.f34649n = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i6, float f, i iVar3, i iVar4, int i10, int i11) {
        b l2 = l();
        if (iVar2 == iVar3) {
            l2.f34628d.b(iVar, 1.0f);
            l2.f34628d.b(iVar4, 1.0f);
            l2.f34628d.b(iVar2, -2.0f);
        } else if (f == 0.5f) {
            l2.f34628d.b(iVar, 1.0f);
            l2.f34628d.b(iVar2, -1.0f);
            l2.f34628d.b(iVar3, -1.0f);
            l2.f34628d.b(iVar4, 1.0f);
            if (i6 > 0 || i10 > 0) {
                l2.f34626b = (-i6) + i10;
            }
        } else if (f <= 0.0f) {
            l2.f34628d.b(iVar, -1.0f);
            l2.f34628d.b(iVar2, 1.0f);
            l2.f34626b = i6;
        } else if (f >= 1.0f) {
            l2.f34628d.b(iVar4, -1.0f);
            l2.f34628d.b(iVar3, 1.0f);
            l2.f34626b = -i10;
        } else {
            float f2 = 1.0f - f;
            l2.f34628d.b(iVar, f2 * 1.0f);
            l2.f34628d.b(iVar2, f2 * (-1.0f));
            l2.f34628d.b(iVar3, (-1.0f) * f);
            l2.f34628d.b(iVar4, 1.0f * f);
            if (i6 > 0 || i10 > 0) {
                l2.f34626b = (i10 * f) + ((-i6) * f2);
            }
        }
        if (i11 != 8) {
            l2.b(this, i11);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        if (r4.F <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if (r4.F <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e4, code lost:
        if (r4.F <= 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ed, code lost:
        if (r4.F <= 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f1, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        i iVar;
        i f;
        boolean z13;
        boolean z14;
        ArrayList<i> arrayList;
        boolean z15 = true;
        if (this.f34645j + 1 >= this.f34646k || this.f34644i + 1 >= this.f34641e) {
            o();
        }
        if (!bVar.f34629e) {
            if (this.f.length != 0) {
                boolean z16 = false;
                while (!z16) {
                    int c10 = bVar.f34628d.c();
                    int i6 = 0;
                    while (true) {
                        arrayList = bVar.f34627c;
                        if (i6 >= c10) {
                            break;
                        }
                        i d10 = bVar.f34628d.d(i6);
                        if (d10.f34662w != -1 || d10.f34665z) {
                            arrayList.add(d10);
                        }
                        i6++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            i iVar2 = arrayList.get(i10);
                            if (iVar2.f34665z) {
                                bVar.h(this, iVar2, true);
                            } else {
                                bVar.i(this, this.f[iVar2.f34662w], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z16 = true;
                    }
                }
                if (bVar.f34625a != null && bVar.f34628d.c() == 0) {
                    bVar.f34629e = true;
                    this.f34637a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f2 = bVar.f34626b;
            if (f2 < 0.0f) {
                bVar.f34626b = f2 * (-1.0f);
                bVar.f34628d.f();
            }
            int c11 = bVar.f34628d.c();
            i iVar3 = null;
            i iVar4 = null;
            float f10 = 0.0f;
            boolean z17 = false;
            float f11 = 0.0f;
            boolean z18 = false;
            for (int i11 = 0; i11 < c11; i11++) {
                float g5 = bVar.f34628d.g(i11);
                i d11 = bVar.f34628d.d(i11);
                if (d11.C == 1) {
                    if (iVar3 != null) {
                        if (f10 <= g5) {
                            if (!z17) {
                                if (d11.F <= 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    iVar3 = d11;
                                    f10 = g5;
                                    z17 = true;
                                }
                            }
                        }
                    }
                    iVar3 = d11;
                    f10 = g5;
                } else if (iVar3 == null && g5 < 0.0f) {
                    if (iVar4 != null) {
                        if (f11 <= g5) {
                            if (!z18) {
                                if (d11.F <= 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    iVar4 = d11;
                                    f11 = g5;
                                    z18 = true;
                                }
                            }
                        }
                    }
                    iVar4 = d11;
                    f11 = g5;
                }
            }
            if (iVar3 == null) {
                iVar3 = iVar4;
            }
            if (iVar3 == null) {
                z11 = true;
            } else {
                bVar.g(iVar3);
                z11 = false;
            }
            if (bVar.f34628d.c() == 0) {
                bVar.f34629e = true;
            }
            if (z11) {
                if (this.f34644i + 1 >= this.f34641e) {
                    o();
                }
                i a10 = a(3);
                int i12 = this.f34638b + 1;
                this.f34638b = i12;
                this.f34644i++;
                a10.f34661v = i12;
                c cVar = this.f34647l;
                ((i[]) cVar.f34634y)[i12] = a10;
                bVar.f34625a = a10;
                int i13 = this.f34645j;
                h(bVar);
                if (this.f34645j == i13 + 1) {
                    b bVar2 = this.f34650o;
                    bVar2.getClass();
                    bVar2.f34625a = null;
                    bVar2.f34628d.clear();
                    for (int i14 = 0; i14 < bVar.f34628d.c(); i14++) {
                        bVar2.f34628d.i(bVar.f34628d.d(i14), bVar.f34628d.g(i14), true);
                    }
                    r(this.f34650o);
                    if (a10.f34662w == -1) {
                        if (bVar.f34625a == a10 && (f = bVar.f(null, a10)) != null) {
                            bVar.g(f);
                        }
                        if (!bVar.f34629e) {
                            bVar.f34625a.j(this, bVar);
                        }
                        ((e) cVar.f34632w).a(bVar);
                        this.f34645j--;
                    }
                    z12 = true;
                    iVar = bVar.f34625a;
                    if (iVar != null || (iVar.C != 1 && bVar.f34626b < 0.0f)) {
                        z15 = false;
                    }
                    if (z15) {
                        return;
                    }
                    z10 = z12;
                }
            }
            z12 = false;
            iVar = bVar.f34625a;
            if (iVar != null) {
            }
            z15 = false;
            if (z15) {
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            h(bVar);
        }
    }

    public final void d(i iVar, int i6) {
        int i10 = iVar.f34662w;
        if (i10 == -1) {
            iVar.i(this, i6);
            for (int i11 = 0; i11 < this.f34638b + 1; i11++) {
                i iVar2 = ((i[]) this.f34647l.f34634y)[i11];
            }
        } else if (i10 != -1) {
            b bVar = this.f[i10];
            if (bVar.f34629e) {
                bVar.f34626b = i6;
            } else if (bVar.f34628d.c() == 0) {
                bVar.f34629e = true;
                bVar.f34626b = i6;
            } else {
                b l2 = l();
                if (i6 < 0) {
                    l2.f34626b = i6 * (-1);
                    l2.f34628d.b(iVar, 1.0f);
                } else {
                    l2.f34626b = i6;
                    l2.f34628d.b(iVar, -1.0f);
                }
                c(l2);
            }
        } else {
            b l10 = l();
            l10.f34625a = iVar;
            float f = i6;
            iVar.f34664y = f;
            l10.f34626b = f;
            l10.f34629e = true;
            c(l10);
        }
    }

    public final void e(i iVar, i iVar2, int i6, int i10) {
        if (i10 == 8 && iVar2.f34665z && iVar.f34662w == -1) {
            iVar.i(this, iVar2.f34664y + i6);
            return;
        }
        b l2 = l();
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            l2.f34626b = i6;
        }
        if (!z10) {
            l2.f34628d.b(iVar, -1.0f);
            l2.f34628d.b(iVar2, 1.0f);
        } else {
            l2.f34628d.b(iVar, 1.0f);
            l2.f34628d.b(iVar2, -1.0f);
        }
        if (i10 != 8) {
            l2.b(this, i10);
        }
        c(l2);
    }

    public final void f(i iVar, i iVar2, int i6, int i10) {
        b l2 = l();
        i m10 = m();
        m10.f34663x = 0;
        l2.c(iVar, iVar2, m10, i6);
        if (i10 != 8) {
            l2.f34628d.b(j(i10), (int) (l2.f34628d.j(m10) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(i iVar, i iVar2, int i6, int i10) {
        b l2 = l();
        i m10 = m();
        m10.f34663x = 0;
        l2.d(iVar, iVar2, m10, i6);
        if (i10 != 8) {
            l2.f34628d.b(j(i10), (int) (l2.f34628d.j(m10) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(b bVar) {
        int i6;
        if (bVar.f34629e) {
            bVar.f34625a.i(this, bVar.f34626b);
        } else {
            b[] bVarArr = this.f;
            int i10 = this.f34645j;
            bVarArr[i10] = bVar;
            i iVar = bVar.f34625a;
            iVar.f34662w = i10;
            this.f34645j = i10 + 1;
            iVar.j(this, bVar);
        }
        if (this.f34637a) {
            int i11 = 0;
            while (i11 < this.f34645j) {
                if (this.f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f[i11];
                if (bVar2 != null && bVar2.f34629e) {
                    bVar2.f34625a.i(this, bVar2.f34626b);
                    ((e) this.f34647l.f34632w).a(bVar2);
                    this.f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i6 = this.f34645j;
                        if (i12 >= i6) {
                            break;
                        }
                        b[] bVarArr2 = this.f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        i iVar2 = bVar3.f34625a;
                        if (iVar2.f34662w == i12) {
                            iVar2.f34662w = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i6) {
                        this.f[i13] = null;
                    }
                    this.f34645j = i6 - 1;
                    i11--;
                }
                i11++;
            }
            this.f34637a = false;
        }
    }

    public final void i() {
        for (int i6 = 0; i6 < this.f34645j; i6++) {
            b bVar = this.f[i6];
            bVar.f34625a.f34664y = bVar.f34626b;
        }
    }

    public final i j(int i6) {
        if (this.f34644i + 1 >= this.f34641e) {
            o();
        }
        i a10 = a(4);
        int i10 = this.f34638b + 1;
        this.f34638b = i10;
        this.f34644i++;
        a10.f34661v = i10;
        a10.f34663x = i6;
        ((i[]) this.f34647l.f34634y)[i10] = a10;
        f fVar = this.f34639c;
        fVar.f34656i.f34657a = a10;
        float[] fArr = a10.B;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f34663x] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f34644i + 1 >= this.f34641e) {
            o();
        }
        if (obj instanceof x.d) {
            x.d dVar = (x.d) obj;
            iVar = dVar.f37353i;
            c cVar = this.f34647l;
            if (iVar == null) {
                dVar.k();
                iVar = dVar.f37353i;
            }
            int i6 = iVar.f34661v;
            if (i6 == -1 || i6 > this.f34638b || ((i[]) cVar.f34634y)[i6] == null) {
                if (i6 != -1) {
                    iVar.h();
                }
                int i10 = this.f34638b + 1;
                this.f34638b = i10;
                this.f34644i++;
                iVar.f34661v = i10;
                iVar.C = 1;
                ((i[]) cVar.f34634y)[i10] = iVar;
            }
        }
        return iVar;
    }

    public final b l() {
        c cVar = this.f34647l;
        b bVar = (b) ((e) cVar.f34632w).b();
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f34625a = null;
        bVar.f34628d.clear();
        bVar.f34626b = 0.0f;
        bVar.f34629e = false;
        return bVar;
    }

    public final i m() {
        if (this.f34644i + 1 >= this.f34641e) {
            o();
        }
        i a10 = a(3);
        int i6 = this.f34638b + 1;
        this.f34638b = i6;
        this.f34644i++;
        a10.f34661v = i6;
        ((i[]) this.f34647l.f34634y)[i6] = a10;
        return a10;
    }

    public final void o() {
        int i6 = this.f34640d * 2;
        this.f34640d = i6;
        this.f = (b[]) Arrays.copyOf(this.f, i6);
        c cVar = this.f34647l;
        cVar.f34634y = (i[]) Arrays.copyOf((i[]) cVar.f34634y, this.f34640d);
        int i10 = this.f34640d;
        this.f34643h = new boolean[i10];
        this.f34641e = i10;
        this.f34646k = i10;
    }

    public final void p() {
        f fVar = this.f34639c;
        if (fVar.e()) {
            i();
        } else if (this.f34642g) {
            boolean z10 = false;
            int i6 = 0;
            while (true) {
                if (i6 < this.f34645j) {
                    if (!this.f[i6].f34629e) {
                        break;
                    }
                    i6++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                q(fVar);
            } else {
                i();
            }
        } else {
            q(fVar);
        }
    }

    public final void q(f fVar) {
        float f;
        int i6;
        boolean z10;
        int i10 = 0;
        while (true) {
            f = 0.0f;
            i6 = 1;
            if (i10 < this.f34645j) {
                b bVar = this.f[i10];
                if (bVar.f34625a.C != 1 && bVar.f34626b < 0.0f) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11 += i6;
                float f2 = Float.MAX_VALUE;
                int i12 = 0;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                while (i12 < this.f34645j) {
                    b bVar2 = this.f[i12];
                    if (bVar2.f34625a.C != i6 && !bVar2.f34629e && bVar2.f34626b < f) {
                        int c10 = bVar2.f34628d.c();
                        int i16 = 0;
                        while (i16 < c10) {
                            i d10 = bVar2.f34628d.d(i16);
                            float j10 = bVar2.f34628d.j(d10);
                            if (j10 > f) {
                                for (int i17 = 0; i17 < 9; i17++) {
                                    float f10 = d10.A[i17] / j10;
                                    if ((f10 < f2 && i17 == i15) || i17 > i15) {
                                        i14 = d10.f34661v;
                                        i15 = i17;
                                        f2 = f10;
                                        i13 = i12;
                                    }
                                }
                            }
                            i16++;
                            f = 0.0f;
                        }
                    }
                    i12++;
                    f = 0.0f;
                    i6 = 1;
                }
                if (i13 != -1) {
                    b bVar3 = this.f[i13];
                    bVar3.f34625a.f34662w = -1;
                    bVar3.g(((i[]) this.f34647l.f34634y)[i14]);
                    i iVar = bVar3.f34625a;
                    iVar.f34662w = i13;
                    iVar.j(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i11 > this.f34644i / 2) {
                    z11 = true;
                }
                f = 0.0f;
                i6 = 1;
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        for (int i6 = 0; i6 < this.f34644i; i6++) {
            this.f34643h[i6] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10++;
            if (i10 >= this.f34644i * 2) {
                return;
            }
            i iVar = bVar.f34625a;
            if (iVar != null) {
                this.f34643h[iVar.f34661v] = true;
            }
            i a10 = bVar.a(this.f34643h);
            if (a10 != null) {
                boolean[] zArr = this.f34643h;
                int i11 = a10.f34661v;
                if (zArr[i11]) {
                    return;
                }
                zArr[i11] = true;
            }
            if (a10 != null) {
                float f = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f34645j; i13++) {
                    b bVar2 = this.f[i13];
                    if (bVar2.f34625a.C != 1 && !bVar2.f34629e && bVar2.f34628d.e(a10)) {
                        float j10 = bVar2.f34628d.j(a10);
                        if (j10 < 0.0f) {
                            float f2 = (-bVar2.f34626b) / j10;
                            if (f2 < f) {
                                i12 = i13;
                                f = f2;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    b bVar3 = this.f[i12];
                    bVar3.f34625a.f34662w = -1;
                    bVar3.g(a10);
                    i iVar2 = bVar3.f34625a;
                    iVar2.f34662w = i12;
                    iVar2.j(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i6 = 0; i6 < this.f34645j; i6++) {
            b bVar = this.f[i6];
            if (bVar != null) {
                ((e) this.f34647l.f34632w).a(bVar);
            }
            this.f[i6] = null;
        }
    }

    public final void t() {
        c cVar;
        int i6 = 0;
        while (true) {
            cVar = this.f34647l;
            i[] iVarArr = (i[]) cVar.f34634y;
            if (i6 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i6];
            if (iVar != null) {
                iVar.h();
            }
            i6++;
        }
        e eVar = (e) cVar.f34633x;
        i[] iVarArr2 = this.f34648m;
        int i10 = this.f34649n;
        eVar.getClass();
        if (i10 > iVarArr2.length) {
            i10 = iVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            i iVar2 = iVarArr2[i11];
            int i12 = eVar.f34653c;
            Object[] objArr = eVar.f34652b;
            if (i12 < objArr.length) {
                objArr[i12] = iVar2;
                eVar.f34653c = i12 + 1;
            }
        }
        this.f34649n = 0;
        Arrays.fill((i[]) cVar.f34634y, (Object) null);
        this.f34638b = 0;
        f fVar = this.f34639c;
        fVar.f34655h = 0;
        fVar.f34626b = 0.0f;
        this.f34644i = 1;
        for (int i13 = 0; i13 < this.f34645j; i13++) {
            b bVar = this.f[i13];
        }
        s();
        this.f34645j = 0;
        this.f34650o = new b(cVar);
    }
}
