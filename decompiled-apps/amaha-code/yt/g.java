package yt;

import gt.a0;
import gt.c0;
import gt.q0;
import gt.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kt.g0;
import ku.k;
import wu.b0;
import yt.o;
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class g extends yt.a<ht.c, ku.g<?>> {

    /* renamed from: c  reason: collision with root package name */
    public final a0 f39015c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f39016d;

    /* renamed from: e  reason: collision with root package name */
    public final su.f f39017e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes2.dex */
    public abstract class a implements o.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: yt.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0661a implements o.b {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<ku.g<?>> f39019a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g f39020b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ fu.e f39021c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f39022d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: yt.g$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0662a implements o.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ o.a f39023a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ o.a f39024b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0661a f39025c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ ArrayList<ht.c> f39026d;

                public C0662a(h hVar, C0661a c0661a, ArrayList arrayList) {
                    this.f39024b = hVar;
                    this.f39025c = c0661a;
                    this.f39026d = arrayList;
                    this.f39023a = hVar;
                }

                @Override // yt.o.a
                public final void a() {
                    this.f39024b.a();
                    this.f39025c.f39019a.add(new ku.a((ht.c) is.u.y2(this.f39026d)));
                }

                @Override // yt.o.a
                public final void b(Object obj, fu.e eVar) {
                    this.f39023a.b(obj, eVar);
                }

                @Override // yt.o.a
                public final o.b c(fu.e eVar) {
                    return this.f39023a.c(eVar);
                }

                @Override // yt.o.a
                public final o.a d(fu.b bVar, fu.e eVar) {
                    return this.f39023a.d(bVar, eVar);
                }

                @Override // yt.o.a
                public final void e(fu.e eVar, ku.f fVar) {
                    this.f39023a.e(eVar, fVar);
                }

                @Override // yt.o.a
                public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
                    this.f39023a.f(eVar, bVar, eVar2);
                }
            }

            public C0661a(g gVar, fu.e eVar, a aVar) {
                this.f39020b = gVar;
                this.f39021c = eVar;
                this.f39022d = aVar;
            }

            @Override // yt.o.b
            public final void a() {
                ArrayList<ku.g<?>> elements = this.f39019a;
                h hVar = (h) this.f39022d;
                hVar.getClass();
                kotlin.jvm.internal.i.g(elements, "elements");
                fu.e eVar = this.f39021c;
                if (eVar != null) {
                    z0 I = sc.b.I(eVar, hVar.f39029d);
                    if (I != null) {
                        HashMap<fu.e, ku.g<?>> hashMap = hVar.f39027b;
                        List A = ca.a.A(elements);
                        b0 a10 = I.a();
                        kotlin.jvm.internal.i.f(a10, "parameter.type");
                        hashMap.put(eVar, new ku.b(A, new ku.h(a10)));
                    } else if (hVar.f39028c.p(hVar.f39030e) && kotlin.jvm.internal.i.b(eVar.f(), "value")) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<ku.g<?>> it = elements.iterator();
                        while (it.hasNext()) {
                            ku.g<?> next = it.next();
                            if (next instanceof ku.a) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            hVar.f.add((ht.c) ((ku.a) it2.next()).f23941a);
                        }
                    }
                }
            }

            @Override // yt.o.b
            public final void b(ku.f fVar) {
                this.f39019a.add(new ku.q(fVar));
            }

            @Override // yt.o.b
            public final o.a c(fu.b bVar) {
                ArrayList arrayList = new ArrayList();
                return new C0662a(this.f39020b.q(bVar, q0.f16815a, arrayList), this, arrayList);
            }

            @Override // yt.o.b
            public final void d(Object obj) {
                this.f39019a.add(g.u(this.f39020b, this.f39021c, obj));
            }

            @Override // yt.o.b
            public final void e(fu.b bVar, fu.e eVar) {
                this.f39019a.add(new ku.j(bVar, eVar));
            }
        }

        public a() {
        }

        @Override // yt.o.a
        public final void b(Object obj, fu.e eVar) {
            ((h) this).f39027b.put(eVar, g.u(g.this, eVar, obj));
        }

        @Override // yt.o.a
        public final o.b c(fu.e eVar) {
            return new C0661a(g.this, eVar, this);
        }

        @Override // yt.o.a
        public final o.a d(fu.b bVar, fu.e eVar) {
            ArrayList arrayList = new ArrayList();
            return new f(g.this.q(bVar, q0.f16815a, arrayList), this, eVar, arrayList);
        }

        @Override // yt.o.a
        public final void e(fu.e eVar, ku.f fVar) {
            ((h) this).f39027b.put(eVar, new ku.q(fVar));
        }

        @Override // yt.o.a
        public final void f(fu.e eVar, fu.b bVar, fu.e eVar2) {
            ((h) this).f39027b.put(eVar, new ku.j(bVar, eVar2));
        }

        public abstract void g(fu.e eVar, ku.g<?> gVar);
    }

    public g(g0 g0Var, c0 c0Var, vu.c cVar, mt.d dVar) {
        super(cVar, dVar);
        this.f39015c = g0Var;
        this.f39016d = c0Var;
        this.f39017e = new su.f(g0Var, c0Var);
    }

    public static final ku.g u(g gVar, fu.e eVar, Object obj) {
        gVar.getClass();
        ku.g b10 = ku.i.b(obj);
        if (b10 == null) {
            String message = "Unsupported annotation argument: " + eVar;
            kotlin.jvm.internal.i.g(message, "message");
            return new k.a(message);
        }
        return b10;
    }

    @Override // yt.d
    public final h q(fu.b bVar, q0 q0Var, List result) {
        kotlin.jvm.internal.i.g(result, "result");
        return new h(this, gt.t.c(this.f39015c, bVar, this.f39016d), bVar, result, q0Var);
    }
}
