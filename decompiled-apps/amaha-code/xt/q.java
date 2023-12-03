package xt;

import gt.z0;
import wu.b0;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<gt.b, b0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ z0 f38075u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z0 z0Var) {
        super(1);
        this.f38075u = z0Var;
    }

    @Override // ss.l
    public final b0 invoke(gt.b bVar) {
        gt.b it = bVar;
        kotlin.jvm.internal.i.g(it, "it");
        b0 a10 = it.i().get(this.f38075u.getIndex()).a();
        kotlin.jvm.internal.i.f(a10, "it.valueParameters[p.index].type");
        return a10;
    }
}
