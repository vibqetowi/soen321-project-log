package x;

import java.util.ArrayList;
import java.util.HashMap;
import x.d;
import x.e;
/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class h extends e {
    public boolean B0;

    /* renamed from: w0  reason: collision with root package name */
    public float f37434w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    public int f37435x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f37436y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public d f37437z0 = this.L;
    public int A0 = 0;

    public h() {
        this.T.clear();
        this.T.add(this.f37437z0);
        int length = this.S.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.S[i6] = this.f37437z0;
        }
    }

    @Override // x.e
    public final boolean E() {
        return this.B0;
    }

    @Override // x.e
    public final boolean F() {
        return this.B0;
    }

    @Override // x.e
    public final void T(v.d dVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        d dVar2 = this.f37437z0;
        dVar.getClass();
        int n10 = v.d.n(dVar2);
        if (this.A0 == 1) {
            this.f37363b0 = n10;
            this.c0 = 0;
            O(this.W.o());
            R(0);
            return;
        }
        this.f37363b0 = 0;
        this.c0 = n10;
        R(this.W.u());
        O(0);
    }

    public final void U(int i6) {
        this.f37437z0.l(i6);
        this.B0 = true;
    }

    public final void V(int i6) {
        if (this.A0 == i6) {
            return;
        }
        this.A0 = i6;
        ArrayList<d> arrayList = this.T;
        arrayList.clear();
        if (this.A0 == 1) {
            this.f37437z0 = this.K;
        } else {
            this.f37437z0 = this.L;
        }
        arrayList.add(this.f37437z0);
        d[] dVarArr = this.S;
        int length = dVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = this.f37437z0;
        }
    }

    @Override // x.e
    public final void e(v.d dVar, boolean z10) {
        boolean z11;
        f fVar = (f) this.W;
        if (fVar == null) {
            return;
        }
        Object m10 = fVar.m(d.a.LEFT);
        Object m11 = fVar.m(d.a.RIGHT);
        e eVar = this.W;
        e.a aVar = e.a.WRAP_CONTENT;
        boolean z12 = true;
        if (eVar != null && eVar.V[0] == aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.A0 == 0) {
            m10 = fVar.m(d.a.TOP);
            m11 = fVar.m(d.a.BOTTOM);
            e eVar2 = this.W;
            z11 = (eVar2 == null || eVar2.V[1] != aVar) ? false : false;
        }
        if (this.B0) {
            d dVar2 = this.f37437z0;
            if (dVar2.f37348c) {
                v.i k10 = dVar.k(dVar2);
                dVar.d(k10, this.f37437z0.d());
                if (this.f37435x0 != -1) {
                    if (z11) {
                        dVar.f(dVar.k(m11), k10, 0, 5);
                    }
                } else if (this.f37436y0 != -1 && z11) {
                    v.i k11 = dVar.k(m11);
                    dVar.f(k10, dVar.k(m10), 0, 5);
                    dVar.f(k11, k10, 0, 5);
                }
                this.B0 = false;
                return;
            }
        }
        if (this.f37435x0 != -1) {
            v.i k12 = dVar.k(this.f37437z0);
            dVar.e(k12, dVar.k(m10), this.f37435x0, 8);
            if (z11) {
                dVar.f(dVar.k(m11), k12, 0, 5);
            }
        } else if (this.f37436y0 != -1) {
            v.i k13 = dVar.k(this.f37437z0);
            v.i k14 = dVar.k(m11);
            dVar.e(k13, k14, -this.f37436y0, 8);
            if (z11) {
                dVar.f(k13, dVar.k(m10), 0, 5);
                dVar.f(k14, k13, 0, 5);
            }
        } else if (this.f37434w0 != -1.0f) {
            v.i k15 = dVar.k(this.f37437z0);
            v.i k16 = dVar.k(m11);
            float f = this.f37434w0;
            v.b l2 = dVar.l();
            l2.f34628d.b(k15, -1.0f);
            l2.f34628d.b(k16, f);
            dVar.c(l2);
        }
    }

    @Override // x.e
    public final boolean f() {
        return true;
    }

    @Override // x.e
    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        h hVar = (h) eVar;
        this.f37434w0 = hVar.f37434w0;
        this.f37435x0 = hVar.f37435x0;
        this.f37436y0 = hVar.f37436y0;
        V(hVar.A0);
    }

    @Override // x.e
    public final d m(d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.A0 == 0) {
                return this.f37437z0;
            }
            return null;
        }
        if (this.A0 == 1) {
            return this.f37437z0;
        }
        return null;
    }
}
