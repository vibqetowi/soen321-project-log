package mt;

import java.io.InputStream;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import mt.c;
import yt.n;
/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes2.dex */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f25739a;

    /* renamed from: b  reason: collision with root package name */
    public final tu.d f25740b = new tu.d();

    public d(ClassLoader classLoader) {
        this.f25739a = classLoader;
    }

    @Override // yt.n
    public final n.a.b a(fu.b classId) {
        c a10;
        i.g(classId, "classId");
        String E0 = gv.n.E0(classId.i().b(), '.', '$');
        if (!classId.h().d()) {
            E0 = classId.h() + '.' + E0;
        }
        Class j02 = h.j0(this.f25739a, E0);
        if (j02 != null && (a10 = c.a.a(j02)) != null) {
            return new n.a.b(a10);
        }
        return null;
    }

    @Override // su.w
    public final InputStream b(fu.c packageFqName) {
        i.g(packageFqName, "packageFqName");
        if (!packageFqName.h(dt.n.f13389i)) {
            return null;
        }
        tu.a.f33700m.getClass();
        String a10 = tu.a.a(packageFqName);
        this.f25740b.getClass();
        return tu.d.a(a10);
    }

    @Override // yt.n
    public final n.a.b c(wt.g javaClass) {
        c a10;
        i.g(javaClass, "javaClass");
        fu.c e10 = javaClass.e();
        if (e10 == null) {
            return null;
        }
        Class j02 = h.j0(this.f25739a, e10.b());
        if (j02 == null || (a10 = c.a.a(j02)) == null) {
            return null;
        }
        return new n.a.b(a10);
    }
}
