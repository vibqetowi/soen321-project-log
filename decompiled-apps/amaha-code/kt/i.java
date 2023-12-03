package kt;

import pu.n;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes2.dex */
public final class i implements ss.a<pu.i> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f23847u;

    public i(j jVar) {
        this.f23847u = jVar;
    }

    @Override // ss.a
    public final pu.i invoke() {
        StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
        j jVar = this.f23847u;
        sb2.append(jVar.f23850u.f());
        return n.a.a(sb2.toString(), jVar.f23851v.getUpperBounds());
    }
}
