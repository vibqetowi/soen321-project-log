package tt;

import dt.n;
import gt.q0;
import gt.v0;
import gt.z0;
import is.e0;
import java.util.ArrayList;
import java.util.Map;
import ku.q;
import pt.d0;
import wu.b0;
import wu.d1;
import wu.i0;
/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* loaded from: classes2.dex */
public final class d implements ht.c, rt.g {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f33606i = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(d.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(d.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(d.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a  reason: collision with root package name */
    public final q.f f33607a;

    /* renamed from: b  reason: collision with root package name */
    public final wt.a f33608b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.j f33609c;

    /* renamed from: d  reason: collision with root package name */
    public final vu.i f33610d;

    /* renamed from: e  reason: collision with root package name */
    public final vt.a f33611e;
    public final vu.i f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f33612g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33613h;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<Map<fu.e, ? extends ku.g<?>>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final Map<fu.e, ? extends ku.g<?>> invoke() {
            hs.f fVar;
            d dVar = d.this;
            ArrayList<wt.b> d10 = dVar.f33608b.d();
            ArrayList arrayList = new ArrayList();
            for (wt.b bVar : d10) {
                fu.e name = bVar.getName();
                if (name == null) {
                    name = d0.f28871b;
                }
                ku.g<?> c10 = dVar.c(bVar);
                if (c10 != null) {
                    fVar = new hs.f(name, c10);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return e0.w0(arrayList);
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<fu.c> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final fu.c invoke() {
            fu.b g5 = d.this.f33608b.g();
            if (g5 != null) {
                return g5.b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<i0> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final i0 invoke() {
            gt.e eVar;
            d dVar = d.this;
            fu.c e10 = dVar.e();
            wt.a aVar = dVar.f33608b;
            if (e10 == null) {
                return yu.i.c(yu.h.Y, aVar.toString());
            }
            ca.a aVar2 = ca.a.D;
            q.f fVar = dVar.f33607a;
            gt.e W0 = ca.a.W0(aVar2, e10, fVar.a().o());
            if (W0 == null) {
                nt.s E = aVar.E();
                Object obj = fVar.f29104v;
                if (E != null) {
                    eVar = ((st.c) obj).f31943k.a(E);
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    W0 = gt.t.c(fVar.a(), fu.b.l(e10), ((st.c) obj).f31937d.c().f32054l);
                } else {
                    W0 = eVar;
                }
            }
            return W0.r();
        }
    }

    public d(q.f c10, wt.a javaAnnotation, boolean z10) {
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(javaAnnotation, "javaAnnotation");
        this.f33607a = c10;
        this.f33608b = javaAnnotation;
        this.f33609c = c10.b().f(new b());
        this.f33610d = c10.b().e(new c());
        this.f33611e = ((st.c) c10.f29104v).f31942j.a(javaAnnotation);
        this.f = c10.b().e(new a());
        javaAnnotation.h();
        this.f33612g = false;
        javaAnnotation.y();
        this.f33613h = z10;
    }

    @Override // ht.c
    public final b0 a() {
        return (i0) kotlin.jvm.internal.h.C(this.f33610d, f33606i[1]);
    }

    @Override // ht.c
    public final Map<fu.e, ku.g<?>> b() {
        return (Map) kotlin.jvm.internal.h.C(this.f, f33606i[2]);
    }

    public final ku.g<?> c(wt.b bVar) {
        ku.g<?> qVar;
        b0 h10;
        if (bVar instanceof wt.o) {
            return ku.i.b(((wt.o) bVar).getValue());
        }
        ku.j jVar = null;
        if (bVar instanceof wt.m) {
            wt.m mVar = (wt.m) bVar;
            fu.b b10 = mVar.b();
            fu.e d10 = mVar.d();
            if (b10 != null && d10 != null) {
                jVar = new ku.j(b10, d10);
            }
        } else {
            boolean z10 = bVar instanceof wt.e;
            q.f fVar = this.f33607a;
            if (z10) {
                wt.e eVar = (wt.e) bVar;
                fu.e name = eVar.getName();
                if (name == null) {
                    name = d0.f28871b;
                }
                kotlin.jvm.internal.i.f(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
                ArrayList<wt.b> elements = eVar.getElements();
                i0 type = (i0) kotlin.jvm.internal.h.C(this.f33610d, f33606i[1]);
                kotlin.jvm.internal.i.f(type, "type");
                if (!ta.v.E(type)) {
                    gt.e d11 = mu.a.d(this);
                    kotlin.jvm.internal.i.d(d11);
                    z0 I = sc.b.I(name, d11);
                    if (I == null || (h10 = I.a()) == null) {
                        h10 = ((st.c) fVar.f29104v).f31947o.o().h(yu.i.c(yu.h.X, new String[0]));
                    }
                    ArrayList arrayList = new ArrayList(is.i.H1(elements, 10));
                    for (wt.b bVar2 : elements) {
                        ku.g<?> c10 = c(bVar2);
                        if (c10 == null) {
                            c10 = new ku.s();
                        }
                        arrayList.add(c10);
                    }
                    return new ku.b(arrayList, new ku.h(h10));
                }
            } else {
                if (bVar instanceof wt.c) {
                    qVar = new ku.a(new d(fVar, ((wt.c) bVar).a(), false));
                } else if (bVar instanceof wt.h) {
                    b0 e10 = ((ut.c) fVar.f29108z).e(((wt.h) bVar).c(), ca.a.u1(2, false, false, null, 7));
                    if (!ta.v.E(e10)) {
                        b0 b0Var = e10;
                        int i6 = 0;
                        while (dt.j.z(b0Var)) {
                            b0Var = ((d1) is.u.y2(b0Var.M0())).a();
                            kotlin.jvm.internal.i.f(b0Var, "type.arguments.single().type");
                            i6++;
                        }
                        gt.g a10 = b0Var.O0().a();
                        if (a10 instanceof gt.e) {
                            fu.b f = mu.a.f(a10);
                            if (f == null) {
                                qVar = new ku.q(new q.a.C0371a(e10));
                            } else {
                                return new ku.q(f, i6);
                            }
                        } else if (a10 instanceof v0) {
                            return new ku.q(fu.b.l(n.a.f13395a.h()), 0);
                        }
                    }
                }
                return qVar;
            }
        }
        return jVar;
    }

    @Override // ht.c
    public final fu.c e() {
        ys.m<Object> p10 = f33606i[0];
        vu.j jVar = this.f33609c;
        kotlin.jvm.internal.i.g(jVar, "<this>");
        kotlin.jvm.internal.i.g(p10, "p");
        return (fu.c) jVar.invoke();
    }

    @Override // ht.c
    public final q0 g() {
        return this.f33611e;
    }

    @Override // rt.g
    public final boolean h() {
        return this.f33612g;
    }

    public final String toString() {
        return hu.c.f19528a.p(this, null);
    }
}
