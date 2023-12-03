package ft;

import gt.a0;
import gt.z;
import is.y;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.a<kt.n> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f15875u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ vu.l f15876v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, vu.l lVar) {
        super(0);
        this.f15875u = eVar;
        this.f15876v = lVar;
    }

    @Override // ss.a
    public final kt.n invoke() {
        e eVar = this.f15875u;
        ss.l<a0, gt.j> lVar = eVar.f15873b;
        a0 a0Var = eVar.f15872a;
        kt.n nVar = new kt.n(lVar.invoke(a0Var), e.f15870g, z.ABSTRACT, 2, ca.a.O0(a0Var.o().f()), this.f15876v);
        nVar.M0(new a(this.f15876v, nVar), y.f20678u, null);
        return nVar;
    }
}
