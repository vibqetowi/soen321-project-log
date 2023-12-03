package kt;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.l<fu.c, gt.h0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g0 f23838u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var) {
        super(1);
        this.f23838u = g0Var;
    }

    @Override // ss.l
    public final gt.h0 invoke(fu.c cVar) {
        fu.c fqName = cVar;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        g0 g0Var = this.f23838u;
        return g0Var.f23843z.a(g0Var, fqName, g0Var.f23840w);
    }
}
