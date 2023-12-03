package dt;

import kt.g0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes2.dex */
public final class i implements ss.a<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g0 f13358u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f13359v;

    public i(ft.g gVar, g0 g0Var) {
        this.f13359v = gVar;
        this.f13358u = g0Var;
    }

    @Override // ss.a
    public final Void invoke() {
        j jVar = this.f13359v;
        g0 g0Var = jVar.f13361a;
        g0 g0Var2 = this.f13358u;
        if (g0Var == null) {
            jVar.f13361a = g0Var2;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + jVar.f13361a + " (attempting to reset to " + g0Var2 + ")");
    }
}
