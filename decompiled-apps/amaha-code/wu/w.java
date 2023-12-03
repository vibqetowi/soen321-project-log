package wu;

import kotlin.NoWhenBranchMatchedException;
/* compiled from: flexibleTypes.kt */
/* loaded from: classes2.dex */
public final class w extends v implements m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i0 lowerBound, i0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.i.g(upperBound, "upperBound");
    }

    @Override // wu.m
    public final m1 C0(b0 replacement) {
        m1 c10;
        kotlin.jvm.internal.i.g(replacement, "replacement");
        m1 R0 = replacement.R0();
        if (R0 instanceof v) {
            c10 = R0;
        } else if (R0 instanceof i0) {
            i0 i0Var = (i0) R0;
            c10 = c0.c(i0Var, i0Var.S0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ca.a.B0(c10, R0);
    }

    @Override // wu.m
    public final boolean D0() {
        i0 i0Var = this.f37298v;
        if ((i0Var.O0().a() instanceof gt.v0) && kotlin.jvm.internal.i.b(i0Var.O0(), this.f37299w.O0())) {
            return true;
        }
        return false;
    }

    @Override // wu.m1
    public final m1 S0(boolean z10) {
        return c0.c(this.f37298v.S0(z10), this.f37299w.S0(z10));
    }

    @Override // wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return c0.c(this.f37298v.U0(newAttributes), this.f37299w.U0(newAttributes));
    }

    @Override // wu.v
    public final i0 V0() {
        return this.f37298v;
    }

    @Override // wu.v
    public final String W0(hu.c renderer, hu.j options) {
        kotlin.jvm.internal.i.g(renderer, "renderer");
        kotlin.jvm.internal.i.g(options, "options");
        boolean m10 = options.m();
        i0 i0Var = this.f37299w;
        i0 i0Var2 = this.f37298v;
        if (m10) {
            return "(" + renderer.u(i0Var2) + ".." + renderer.u(i0Var) + ')';
        }
        return renderer.r(renderer.u(i0Var2), renderer.u(i0Var), hc.d.F(this));
    }

    @Override // wu.m1
    /* renamed from: X0 */
    public final v T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b0 H = kotlinTypeRefiner.H(this.f37298v);
        kotlin.jvm.internal.i.e(H, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        b0 H2 = kotlinTypeRefiner.H(this.f37299w);
        kotlin.jvm.internal.i.e(H2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new w((i0) H, (i0) H2);
    }

    @Override // wu.v
    public final String toString() {
        return "(" + this.f37298v + ".." + this.f37299w + ')';
    }
}
