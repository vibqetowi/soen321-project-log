package su;

import gt.q0;
/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<fu.b, q0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f32066u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.f32066u = sVar;
    }

    @Override // ss.l
    public final q0 invoke(fu.b bVar) {
        fu.b it = bVar;
        kotlin.jvm.internal.i.g(it, "it");
        uu.g gVar = this.f32066u.B;
        if (gVar == null) {
            return q0.f16815a;
        }
        return gVar;
    }
}
