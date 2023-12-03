package mu;

import dv.b;
import is.w;
import java.util.Collection;
/* compiled from: DescriptorUtils.kt */
/* loaded from: classes2.dex */
public final class b implements b.InterfaceC0206b {

    /* renamed from: u  reason: collision with root package name */
    public final boolean f25749u;

    public /* synthetic */ b(boolean z10) {
        this.f25749u = z10;
    }

    @Override // dv.b.InterfaceC0206b
    public Iterable m(Object obj) {
        gt.b bVar = (gt.b) obj;
        Collection<? extends gt.b> collection = null;
        if (this.f25749u) {
            if (bVar != null) {
                bVar = bVar.b();
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            collection = bVar.f();
        }
        if (collection == null) {
            return w.f20676u;
        }
        return collection;
    }
}
