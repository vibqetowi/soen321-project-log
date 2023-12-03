package xt;

import wu.b0;
import wu.c0;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.v0;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class i extends wu.q implements wu.m {

    /* renamed from: v  reason: collision with root package name */
    public final i0 f38026v;

    public i(i0 delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f38026v = delegate;
    }

    public static i0 a1(i0 i0Var) {
        i0 S0 = i0Var.S0(false);
        if (!k1.h(i0Var)) {
            return S0;
        }
        return new i(S0);
    }

    @Override // wu.m
    public final m1 C0(b0 replacement) {
        kotlin.jvm.internal.i.g(replacement, "replacement");
        m1 R0 = replacement.R0();
        kotlin.jvm.internal.i.g(R0, "<this>");
        if (!k1.h(R0) && !k1.g(R0)) {
            return R0;
        }
        if (R0 instanceof i0) {
            return a1((i0) R0);
        }
        if (R0 instanceof wu.v) {
            wu.v vVar = (wu.v) R0;
            return ca.a.C1(c0.c(a1(vVar.f37298v), a1(vVar.f37299w)), ca.a.h0(R0));
        }
        throw new IllegalStateException(("Incorrect type: " + R0).toString());
    }

    @Override // wu.m
    public final boolean D0() {
        return true;
    }

    @Override // wu.q, wu.b0
    public final boolean P0() {
        return false;
    }

    @Override // wu.i0, wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new i(this.f38026v.U0(newAttributes));
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10) {
            return this.f38026v.S0(true);
        }
        return this;
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return new i(this.f38026v.U0(newAttributes));
    }

    @Override // wu.q
    public final i0 X0() {
        return this.f38026v;
    }

    @Override // wu.q
    public final wu.q Z0(i0 i0Var) {
        return new i(i0Var);
    }
}
