package androidx.lifecycle;

import androidx.lifecycle.j;
import java.util.HashMap;
/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements n {

    /* renamed from: u  reason: collision with root package name */
    public final g[] f2347u;

    public CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.f2347u = gVarArr;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        new HashMap();
        g[] gVarArr = this.f2347u;
        for (g gVar : gVarArr) {
            gVar.a();
        }
        for (g gVar2 : gVarArr) {
            gVar2.a();
        }
    }
}
