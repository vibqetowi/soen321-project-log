package xt;

import wu.m1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.k implements ss.l<m1, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final n f38072u = new n();

    public n() {
        super(1);
    }

    @Override // ss.l
    public final Boolean invoke(m1 m1Var) {
        boolean z10;
        gt.g a10 = m1Var.O0().a();
        if (a10 == null) {
            return Boolean.FALSE;
        }
        fu.e name = a10.getName();
        fu.c cVar = ft.c.f;
        if (kotlin.jvm.internal.i.b(name, cVar.f()) && kotlin.jvm.internal.i.b(mu.a.c(a10), cVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
