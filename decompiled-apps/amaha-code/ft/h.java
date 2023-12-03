package ft;

import ft.g;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<g.a> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f15881u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(0);
        this.f15881u = gVar;
    }

    @Override // ss.a
    public final g.a invoke() {
        g gVar = this.f15881u;
        ss.a<g.a> aVar = gVar.f;
        if (aVar != null) {
            g.a invoke = aVar.invoke();
            gVar.f = null;
            return invoke;
        }
        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
    }
}
