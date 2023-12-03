package s1;

import android.os.Bundle;
import s1.g0;
/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.k implements ss.l<f, f> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g0<u> f31133u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a0 f31134v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g0.a f31135w = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var, a0 a0Var) {
        super(1);
        this.f31133u = g0Var;
        this.f31134v = a0Var;
    }

    @Override // ss.l
    public final f invoke(f fVar) {
        f backStackEntry = fVar;
        kotlin.jvm.internal.i.g(backStackEntry, "backStackEntry");
        u uVar = backStackEntry.f31115v;
        if (!(uVar instanceof u)) {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        g0<u> g0Var = this.f31133u;
        Bundle bundle = backStackEntry.f31116w;
        u c10 = g0Var.c(uVar, bundle, this.f31134v, this.f31135w);
        if (c10 == null) {
            backStackEntry = null;
        } else if (!kotlin.jvm.internal.i.b(c10, uVar)) {
            backStackEntry = g0Var.b().a(c10, c10.m(bundle));
        }
        return backStackEntry;
    }
}
