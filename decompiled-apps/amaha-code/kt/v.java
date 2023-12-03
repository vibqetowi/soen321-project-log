package kt;

import java.util.Collection;
import wu.j1;
/* compiled from: FunctionDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class v implements ss.a<Collection<gt.u>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j1 f23898u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f23899v;

    public v(x xVar, j1 j1Var) {
        this.f23899v = xVar;
        this.f23898u = j1Var;
    }

    @Override // ss.a
    public final Collection<gt.u> invoke() {
        dv.d dVar = new dv.d();
        for (gt.u uVar : this.f23899v.f()) {
            dVar.add(uVar.d(this.f23898u));
        }
        return dVar;
    }
}
