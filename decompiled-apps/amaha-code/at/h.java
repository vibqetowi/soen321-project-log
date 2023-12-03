package at;

import gt.z0;
/* compiled from: KCallableImpl.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<gt.i0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ gt.b f3519u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f3520v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gt.b bVar, int i6) {
        super(0);
        this.f3519u = bVar;
        this.f3520v = i6;
    }

    @Override // ss.a
    public final gt.i0 invoke() {
        z0 z0Var = this.f3519u.i().get(this.f3520v);
        kotlin.jvm.internal.i.f(z0Var, "descriptor.valueParameters[i]");
        return z0Var;
    }
}
