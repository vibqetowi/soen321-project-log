package dt;

import kt.g0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes2.dex */
public final class h implements ss.l<fu.e, gt.e> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f13357u;

    public h(j jVar) {
        this.f13357u = jVar;
    }

    @Override // ss.l
    public final gt.e invoke(fu.e eVar) {
        fu.e eVar2 = eVar;
        g0 l2 = this.f13357u.l();
        fu.c cVar = n.f13390j;
        pu.i p10 = l2.H(cVar).p();
        if (p10 != null) {
            gt.g g5 = p10.g(eVar2, ot.c.FROM_BUILTINS);
            if (g5 != null) {
                if (g5 instanceof gt.e) {
                    return (gt.e) g5;
                }
                throw new AssertionError("Must be a class descriptor " + eVar2 + ", but was " + g5);
            }
            throw new AssertionError("Built-in class " + cVar.c(eVar2) + " is not found");
        }
        j.a(11);
        throw null;
    }
}
