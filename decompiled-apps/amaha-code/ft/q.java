package ft;

import dv.b;
import java.util.ArrayList;
import java.util.Collection;
import wu.b0;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class q<N> implements b.InterfaceC0206b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f15904u;

    public q(k kVar) {
        this.f15904u = kVar;
    }

    @Override // dv.b.InterfaceC0206b
    public final Iterable m(Object obj) {
        gt.g gVar;
        gt.e eVar;
        Collection<b0> c10 = ((gt.e) obj).l().c();
        kotlin.jvm.internal.i.f(c10, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : c10) {
            gt.g a10 = b0Var.O0().a();
            tt.e eVar2 = null;
            if (a10 != null) {
                gVar = a10.b();
            } else {
                gVar = null;
            }
            if (gVar instanceof gt.e) {
                eVar = (gt.e) gVar;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar2 = this.f15904u.f(eVar);
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }
}
