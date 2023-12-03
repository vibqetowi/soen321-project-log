package v;

import java.util.ArrayList;
import v.d;
/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public a f34628d;

    /* renamed from: a  reason: collision with root package name */
    public i f34625a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f34626b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<i> f34627c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f34629e = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        float a(b bVar, boolean z10);

        void b(i iVar, float f);

        int c();

        void clear();

        i d(int i6);

        boolean e(i iVar);

        void f();

        float g(int i6);

        float h(i iVar, boolean z10);

        void i(i iVar, float f, boolean z10);

        float j(i iVar);

        void k(float f);
    }

    public b() {
    }

    @Override // v.d.a
    public i a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(d dVar, int i6) {
        this.f34628d.b(dVar.j(i6), 1.0f);
        this.f34628d.b(dVar.j(i6), -1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i6) {
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            this.f34626b = i6;
        }
        if (!z10) {
            this.f34628d.b(iVar, -1.0f);
            this.f34628d.b(iVar2, 1.0f);
            this.f34628d.b(iVar3, 1.0f);
            return;
        }
        this.f34628d.b(iVar, 1.0f);
        this.f34628d.b(iVar2, -1.0f);
        this.f34628d.b(iVar3, -1.0f);
    }

    public final void d(i iVar, i iVar2, i iVar3, int i6) {
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            this.f34626b = i6;
        }
        if (!z10) {
            this.f34628d.b(iVar, -1.0f);
            this.f34628d.b(iVar2, 1.0f);
            this.f34628d.b(iVar3, -1.0f);
            return;
        }
        this.f34628d.b(iVar, 1.0f);
        this.f34628d.b(iVar2, -1.0f);
        this.f34628d.b(iVar3, 1.0f);
    }

    public boolean e() {
        if (this.f34625a == null && this.f34626b == 0.0f && this.f34628d.c() == 0) {
            return true;
        }
        return false;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i6;
        int c10 = this.f34628d.c();
        i iVar2 = null;
        float f = 0.0f;
        for (int i10 = 0; i10 < c10; i10++) {
            float g5 = this.f34628d.g(i10);
            if (g5 < 0.0f) {
                i d10 = this.f34628d.d(i10);
                if ((zArr == null || !zArr[d10.f34661v]) && d10 != iVar && (((i6 = d10.C) == 3 || i6 == 4) && g5 < f)) {
                    f = g5;
                    iVar2 = d10;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f34625a;
        if (iVar2 != null) {
            this.f34628d.b(iVar2, -1.0f);
            this.f34625a.f34662w = -1;
            this.f34625a = null;
        }
        float h10 = this.f34628d.h(iVar, true) * (-1.0f);
        this.f34625a = iVar;
        if (h10 == 1.0f) {
            return;
        }
        this.f34626b /= h10;
        this.f34628d.k(h10);
    }

    public final void h(d dVar, i iVar, boolean z10) {
        if (iVar != null && iVar.f34665z) {
            float j10 = this.f34628d.j(iVar);
            this.f34626b = (iVar.f34664y * j10) + this.f34626b;
            this.f34628d.h(iVar, z10);
            if (z10) {
                iVar.f(this);
            }
            if (this.f34628d.c() == 0) {
                this.f34629e = true;
                dVar.f34637a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z10) {
        float a10 = this.f34628d.a(bVar, z10);
        this.f34626b = (bVar.f34626b * a10) + this.f34626b;
        if (z10) {
            bVar.f34625a.f(this);
        }
        if (this.f34625a != null && this.f34628d.c() == 0) {
            this.f34629e = true;
            dVar.f34637a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z10;
        float g5;
        int i6;
        if (this.f34625a == null) {
            str = "0";
        } else {
            str = "" + this.f34625a;
        }
        String f = pl.a.f(str, " = ");
        if (this.f34626b != 0.0f) {
            StringBuilder c10 = h.c(f);
            c10.append(this.f34626b);
            f = c10.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int c11 = this.f34628d.c();
        for (int i10 = 0; i10 < c11; i10++) {
            i d10 = this.f34628d.d(i10);
            if (d10 != null && (this.f34628d.g(i10)) != 0.0f) {
                String iVar = d10.toString();
                if (!z10) {
                    if (g5 < 0.0f) {
                        f = pl.a.f(f, "- ");
                        g5 *= -1.0f;
                    }
                    if (g5 == 1.0f) {
                        f = pl.a.f(f, iVar);
                    } else {
                        f = f + g5 + " " + iVar;
                    }
                    z10 = true;
                } else if (i6 > 0) {
                    f = pl.a.f(f, " + ");
                    if (g5 == 1.0f) {
                    }
                    z10 = true;
                } else {
                    f = pl.a.f(f, " - ");
                    g5 *= -1.0f;
                    if (g5 == 1.0f) {
                    }
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return pl.a.f(f, "0.0");
        }
        return f;
    }

    public b(c cVar) {
        this.f34628d = new v.a(this, cVar);
    }
}
