package ft;

import kt.g0;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f15882u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ vu.l f15883v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, vu.c cVar) {
        super(0);
        this.f15882u = gVar;
        this.f15883v = cVar;
    }

    @Override // ss.a
    public final k invoke() {
        g gVar = this.f15882u;
        g0 builtInsModule = gVar.l();
        kotlin.jvm.internal.i.f(builtInsModule, "builtInsModule");
        return new k(builtInsModule, this.f15883v, new h(gVar));
    }
}
