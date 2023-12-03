package ft;

import dt.n;
import ht.h;
import is.e0;
import is.w;
import java.util.List;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.a<ht.h> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f15908u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k kVar) {
        super(0);
        this.f15908u = kVar;
    }

    @Override // ss.a
    public final ht.h invoke() {
        dt.j o10 = this.f15908u.f15887a.o();
        fu.e eVar = ht.g.f19490a;
        kotlin.jvm.internal.i.g(o10, "<this>");
        List O0 = ca.a.O0(new ht.j(o10, n.a.f13408m, e0.u0(new hs.f(ht.g.f19490a, new ku.u("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new hs.f(ht.g.f19491b, new ku.a(new ht.j(o10, n.a.f13410o, e0.u0(new hs.f(ht.g.f19493d, new ku.u("")), new hs.f(ht.g.f19494e, new ku.b(w.f20676u, new ht.f(o10))))))), new hs.f(ht.g.f19492c, new ku.j(fu.b.l(n.a.f13409n), fu.e.j("WARNING"))))));
        if (O0.isEmpty()) {
            return h.a.f19495a;
        }
        return new ht.i(O0);
    }
}
