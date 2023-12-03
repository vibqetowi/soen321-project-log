package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.i;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class x0 extends s0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final i.a<?> f7444c;

    public x0(i.a<?> aVar, ya.i<Boolean> iVar) {
        super(4, iVar);
        this.f7444c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final boolean f(b0<?> b0Var) {
        l0 l0Var = (l0) b0Var.f.get(this.f7444c);
        if (l0Var != null && l0Var.f7404a.f7403c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.h0
    public final s9.d[] g(b0<?> b0Var) {
        l0 l0Var = (l0) b0Var.f.get(this.f7444c);
        if (l0Var == null) {
            return null;
        }
        return l0Var.f7404a.f7402b;
    }

    @Override // com.google.android.gms.common.api.internal.s0
    public final void h(b0<?> b0Var) {
        l0 l0Var = (l0) b0Var.f.remove(this.f7444c);
        if (l0Var != null) {
            q<Object, ?> qVar = l0Var.f7405b;
            ((o0) qVar).f7414a.f7408b.p(b0Var.f7344b, this.f7435b);
            l0Var.f7404a.f7401a.f7386b = null;
            return;
        }
        this.f7435b.d(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.y0
    public final /* bridge */ /* synthetic */ void d(t tVar, boolean z10) {
    }
}
