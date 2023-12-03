package yu;

import is.w;
import is.y;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import ss.l;
/* compiled from: ErrorScope.kt */
/* loaded from: classes2.dex */
public class e implements pu.i {

    /* renamed from: b  reason: collision with root package name */
    public final String f39075b;

    public e(int i6, String... formatParams) {
        defpackage.d.j(i6, "kind");
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(v.g.a(i6), Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.i.f(format, "format(this, *args)");
        this.f39075b = format;
    }

    @Override // pu.i
    public Set<fu.e> b() {
        return y.f20678u;
    }

    @Override // pu.i
    public Set<fu.e> d() {
        return y.f20678u;
    }

    @Override // pu.i
    public Set<fu.e> e() {
        return y.f20678u;
    }

    @Override // pu.k
    public Collection<gt.j> f(pu.d kindFilter, l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        return w.f20676u;
    }

    @Override // pu.k
    public gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1));
        kotlin.jvm.internal.i.f(format, "format(this, *args)");
        return new a(fu.e.l(format));
    }

    @Override // pu.i
    /* renamed from: h */
    public Set a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return ca.a.l1(new b(i.f39092c));
    }

    @Override // pu.i
    /* renamed from: i */
    public Set c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return i.f;
    }

    public String toString() {
        return v.g.c(new StringBuilder("ErrorScope{"), this.f39075b, '}');
    }
}
