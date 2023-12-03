package hu;

import wu.b0;
import wu.d1;
import wu.n1;
/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.l<d1, CharSequence> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f19547u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.f19547u = dVar;
    }

    @Override // ss.l
    public final CharSequence invoke(d1 d1Var) {
        d1 it = d1Var;
        kotlin.jvm.internal.i.g(it, "it");
        if (it.d()) {
            return "*";
        }
        b0 a10 = it.a();
        kotlin.jvm.internal.i.f(a10, "it.type");
        String u10 = this.f19547u.u(a10);
        if (it.b() == n1.INVARIANT) {
            return u10;
        }
        return it.b() + ' ' + u10;
    }
}
