package st;

import gt.g0;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k;
import nt.d0;
import ss.l;
import st.j;
import tt.m;
import vu.c;
import wt.t;
/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class f implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final q.f f31962a;

    /* renamed from: b  reason: collision with root package name */
    public final vu.a<fu.c, m> f31963b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<m> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ t f31965v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar) {
            super(0);
            this.f31965v = tVar;
        }

        @Override // ss.a
        public final m invoke() {
            return new m(f.this.f31962a, this.f31965v);
        }
    }

    public f(c cVar) {
        q.f fVar = new q.f(cVar, j.a.f31973a, new hs.b(null));
        this.f31962a = fVar;
        this.f31963b = fVar.b().d();
    }

    @Override // gt.g0
    public final void a(fu.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        ca.a.g(d(fqName), arrayList);
    }

    @Override // gt.g0
    public final boolean b(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        if (((c) this.f31962a.f29104v).f31935b.c(fqName) == null) {
            return true;
        }
        return false;
    }

    @Override // gt.e0
    public final List<m> c(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return ca.a.Q0(d(fqName));
    }

    public final m d(fu.c cVar) {
        d0 c10 = ((c) this.f31962a.f29104v).f31935b.c(cVar);
        if (c10 == null) {
            return null;
        }
        return (m) ((c.b) this.f31963b).c(cVar, new a(c10));
    }

    @Override // gt.e0
    public final Collection k(fu.c fqName, l nameFilter) {
        List<fu.c> list;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        m d10 = d(fqName);
        if (d10 != null) {
            list = d10.E.invoke();
        } else {
            list = null;
        }
        if (list == null) {
            return w.f20676u;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((c) this.f31962a.f29104v).f31947o;
    }
}
