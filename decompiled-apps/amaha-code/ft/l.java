package ft;

import gt.a0;
import gt.c0;
import wu.i0;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.a<i0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f15898u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ vu.l f15899v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, vu.l lVar) {
        super(0);
        this.f15898u = kVar;
        this.f15899v = lVar;
    }

    @Override // ss.a
    public final i0 invoke() {
        k kVar = this.f15898u;
        a0 a0Var = kVar.g().f15879a;
        e.f15868d.getClass();
        return gt.t.c(a0Var, e.f15871h, new c0(this.f15899v, kVar.g().f15879a)).r();
    }
}
