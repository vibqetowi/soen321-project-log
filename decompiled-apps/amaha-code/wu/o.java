package wu;

import wu.w0;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class o extends q implements m, zu.e {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f37280v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f37281w;

    /* compiled from: SpecialTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static o a(m1 type, boolean z10) {
            boolean z11;
            kt.t0 t0Var;
            boolean z12;
            kotlin.jvm.internal.i.g(type, "type");
            if (type instanceof o) {
                return (o) type;
            }
            boolean z13 = true;
            if (!(type.O0() instanceof xu.m) && !(type.O0().a() instanceof gt.v0) && !(type instanceof xu.g) && !(type instanceof p0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                z13 = false;
            } else if (type instanceof p0) {
                z13 = k1.g(type);
            } else {
                gt.g a10 = type.O0().a();
                if (a10 instanceof kt.t0) {
                    t0Var = (kt.t0) a10;
                } else {
                    t0Var = null;
                }
                if (t0Var != null && !t0Var.G) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (z10 && (type.O0().a() instanceof gt.v0)) {
                        z13 = k1.g(type);
                    } else {
                        z13 = true ^ sc.b.M(ta.v.p(false, true, f6.b.M, null, null, 24), ca.a.V0(type), w0.b.C0626b.f37310a);
                    }
                }
            }
            if (!z13) {
                return null;
            }
            if (type instanceof v) {
                v vVar = (v) type;
                kotlin.jvm.internal.i.b(vVar.f37298v.O0(), vVar.f37299w.O0());
            }
            return new o(ca.a.V0(type).S0(false), z10);
        }
    }

    public o(i0 i0Var, boolean z10) {
        this.f37280v = i0Var;
        this.f37281w = z10;
    }

    @Override // wu.m
    public final m1 C0(b0 replacement) {
        kotlin.jvm.internal.i.g(replacement, "replacement");
        return kotlin.jvm.internal.h.R(replacement.R0(), this.f37281w);
    }

    @Override // wu.m
    public final boolean D0() {
        i0 i0Var = this.f37280v;
        if (!(i0Var.O0() instanceof xu.m) && !(i0Var.O0().a() instanceof gt.v0)) {
            return false;
        }
        return true;
    }

    @Override // wu.q, wu.b0
    public final boolean P0() {
        return false;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10) {
            return this.f37280v.S0(z10);
        }
        return this;
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new o(this.f37280v.U0(newAttributes), this.f37281w);
    }

    @Override // wu.q
    public final i0 X0() {
        return this.f37280v;
    }

    @Override // wu.q
    public final q Z0(i0 i0Var) {
        return new o(i0Var, this.f37281w);
    }

    @Override // wu.i0
    public final String toString() {
        return this.f37280v + " & Any";
    }
}
