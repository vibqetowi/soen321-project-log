package st;

import dt.n;
import fv.e;
import fv.r;
import fv.t;
import fv.v;
import ht.h;
import is.u;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes2.dex */
public final class e implements ht.h {

    /* renamed from: u  reason: collision with root package name */
    public final q.f f31957u;

    /* renamed from: v  reason: collision with root package name */
    public final wt.d f31958v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f31959w;

    /* renamed from: x  reason: collision with root package name */
    public final vu.h<wt.a, ht.c> f31960x;

    /* compiled from: LazyJavaAnnotations.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<wt.a, ht.c> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final ht.c invoke(wt.a aVar) {
            wt.a annotation = aVar;
            kotlin.jvm.internal.i.g(annotation, "annotation");
            fu.e eVar = qt.c.f30116a;
            e eVar2 = e.this;
            return qt.c.b(eVar2.f31957u, annotation, eVar2.f31959w);
        }
    }

    public e(q.f c10, wt.d annotationOwner, boolean z10) {
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(annotationOwner, "annotationOwner");
        this.f31957u = c10;
        this.f31958v = annotationOwner;
        this.f31959w = z10;
        this.f31960x = ((c) c10.f29104v).f31934a.b(new a());
    }

    @Override // ht.h
    public final boolean H(fu.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ht.h
    public final boolean isEmpty() {
        wt.d dVar = this.f31958v;
        if (dVar.getAnnotations().isEmpty()) {
            dVar.o();
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ht.c> iterator() {
        wt.d dVar = this.f31958v;
        v G0 = t.G0(u.X1(dVar.getAnnotations()), this.f31960x);
        fu.e eVar = qt.c.f30116a;
        return new e.a(t.C0(t.I0(G0, qt.c.a(n.a.f13408m, dVar, this.f31957u)), r.f15989u));
    }

    @Override // ht.h
    public final ht.c l(fu.c fqName) {
        ht.c invoke;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        wt.d dVar = this.f31958v;
        wt.a l2 = dVar.l(fqName);
        if (l2 == null || (invoke = this.f31960x.invoke(l2)) == null) {
            fu.e eVar = qt.c.f30116a;
            return qt.c.a(fqName, dVar, this.f31957u);
        }
        return invoke;
    }
}
