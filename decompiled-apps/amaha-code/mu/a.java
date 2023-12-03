package mu;

import dv.b;
import fu.e;
import gt.a0;
import gt.d0;
import gt.g;
import gt.h;
import gt.j;
import gt.j0;
import gt.k0;
import gt.z0;
import is.i;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import ss.l;
import xu.e;
import xu.n;
/* compiled from: DescriptorUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f25746a = 0;

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: mu.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0418a<N> implements b.InterfaceC0206b {

        /* renamed from: u  reason: collision with root package name */
        public static final C0418a<N> f25747u = new C0418a<>();

        @Override // dv.b.InterfaceC0206b
        public final Iterable m(Object obj) {
            Collection<z0> f = ((z0) obj).f();
            ArrayList arrayList = new ArrayList(i.H1(f, 10));
            for (z0 z0Var : f) {
                arrayList.add(z0Var.b());
            }
            return arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends f implements l<z0, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f25748u = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return y.a(z0.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // ss.l
        public final Boolean invoke(z0 z0Var) {
            z0 p02 = z0Var;
            kotlin.jvm.internal.i.g(p02, "p0");
            return Boolean.valueOf(p02.v0());
        }
    }

    static {
        e.j("value");
    }

    public static final boolean a(z0 z0Var) {
        kotlin.jvm.internal.i.g(z0Var, "<this>");
        Boolean d10 = dv.b.d(ca.a.O0(z0Var), C0418a.f25747u, b.f25748u);
        kotlin.jvm.internal.i.f(d10, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return d10.booleanValue();
    }

    public static gt.b b(gt.b bVar, l predicate) {
        kotlin.jvm.internal.i.g(bVar, "<this>");
        kotlin.jvm.internal.i.g(predicate, "predicate");
        return (gt.b) dv.b.b(ca.a.O0(bVar), new mu.b(false), new c(new x(), predicate));
    }

    public static final fu.c c(j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        fu.d h10 = h(jVar);
        if (!h10.e()) {
            h10 = null;
        }
        if (h10 == null) {
            return null;
        }
        return h10.h();
    }

    public static final gt.e d(ht.c cVar) {
        kotlin.jvm.internal.i.g(cVar, "<this>");
        g a10 = cVar.a().O0().a();
        if (a10 instanceof gt.e) {
            return (gt.e) a10;
        }
        return null;
    }

    public static final dt.j e(j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        return j(jVar).o();
    }

    public static final fu.b f(g gVar) {
        j c10;
        fu.b f;
        if (gVar == null || (c10 = gVar.c()) == null) {
            return null;
        }
        if (c10 instanceof d0) {
            return new fu.b(((d0) c10).e(), gVar.getName());
        }
        if (!(c10 instanceof h) || (f = f((g) c10)) == null) {
            return null;
        }
        return f.d(gVar.getName());
    }

    public static final fu.c g(j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        fu.c h10 = iu.g.h(jVar);
        if (h10 == null) {
            h10 = iu.g.g(jVar.c()).b(jVar.getName()).h();
        }
        if (h10 != null) {
            return h10;
        }
        iu.g.a(4);
        throw null;
    }

    public static final fu.d h(j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        fu.d g5 = iu.g.g(jVar);
        kotlin.jvm.internal.i.f(g5, "getFqName(this)");
        return g5;
    }

    public static final e.a i(a0 a0Var) {
        kotlin.jvm.internal.i.g(a0Var, "<this>");
        n nVar = (n) a0Var.s0(xu.f.f38098a);
        return e.a.f38097b;
    }

    public static final a0 j(j jVar) {
        kotlin.jvm.internal.i.g(jVar, "<this>");
        a0 d10 = iu.g.d(jVar);
        kotlin.jvm.internal.i.f(d10, "getContainingModule(this)");
        return d10;
    }

    public static final gt.b k(gt.b bVar) {
        kotlin.jvm.internal.i.g(bVar, "<this>");
        if (bVar instanceof j0) {
            k0 correspondingProperty = ((j0) bVar).E0();
            kotlin.jvm.internal.i.f(correspondingProperty, "correspondingProperty");
            return correspondingProperty;
        }
        return bVar;
    }
}
