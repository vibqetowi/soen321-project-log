package mt;

import gv.n;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import nt.d0;
import nt.s;
import pt.q;
/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes2.dex */
public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f25736a;

    public b(ClassLoader classLoader) {
        this.f25736a = classLoader;
    }

    @Override // pt.q
    public final void a(fu.c packageFqName) {
        i.g(packageFqName, "packageFqName");
    }

    @Override // pt.q
    public final s b(q.a aVar) {
        fu.b bVar = aVar.f28947a;
        fu.c h10 = bVar.h();
        i.f(h10, "classId.packageFqName");
        String E0 = n.E0(bVar.i().b(), '.', '$');
        if (!h10.d()) {
            E0 = h10.b() + '.' + E0;
        }
        Class j02 = h.j0(this.f25736a, E0);
        if (j02 != null) {
            return new s(j02);
        }
        return null;
    }

    @Override // pt.q
    public final d0 c(fu.c fqName) {
        i.g(fqName, "fqName");
        return new d0(fqName);
    }
}
