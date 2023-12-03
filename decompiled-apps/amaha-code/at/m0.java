package at;

import gt.t0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import jt.a;
import jt.c;
import ot.b;
import pt.r;
import qt.g;
import qt.k;
import st.d;
import xu.k;
import yt.s;
/* compiled from: moduleByClassLoader.kt */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f3580a = new ConcurrentHashMap();

    public static final mt.f a(Class<?> cls) {
        ft.g gVar;
        jt.a aVar;
        jt.c cVar;
        kotlin.jvm.internal.i.g(cls, "<this>");
        ClassLoader d10 = nt.d.d(cls);
        u0 u0Var = new u0(d10);
        ConcurrentHashMap concurrentHashMap = f3580a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(u0Var);
        if (weakReference != null) {
            mt.f fVar = (mt.f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            concurrentHashMap.remove(u0Var, weakReference);
        }
        mt.d dVar = new mt.d(d10);
        ClassLoader classLoader = hs.k.class.getClassLoader();
        kotlin.jvm.internal.i.f(classLoader, "Unit::class.java.classLoader");
        mt.d dVar2 = new mt.d(classLoader);
        mt.b bVar = new mt.b(d10);
        String moduleName = "runtime module for " + d10;
        ca.a aVar2 = ca.a.K;
        mt.g gVar2 = mt.g.f25744a;
        kotlin.jvm.internal.i.g(moduleName, "moduleName");
        vu.c cVar2 = new vu.c("DeserializationComponentsForJava.ModuleData");
        ft.g gVar3 = new ft.g(cVar2);
        kt.g0 g0Var = new kt.g0(fu.e.l("<" + moduleName + '>'), cVar2, gVar3, 56);
        cVar2.j(new dt.i(gVar3, g0Var));
        gVar3.f = new ft.j(g0Var);
        yt.j jVar = new yt.j();
        st.i iVar = new st.i();
        u0 u0Var2 = u0Var;
        gt.c0 c0Var = new gt.c0(cVar2, g0Var);
        s.a aVar3 = s.a.f39057a;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        k.a aVar4 = qt.k.f30134a;
        g.a aVar5 = g.a.f30126a;
        is.w wVar = is.w.f20676u;
        ou.b bVar2 = new ou.b(cVar2);
        t0.a aVar6 = t0.a.f16820a;
        b.a aVar7 = b.a.f27780a;
        dt.l lVar = new dt.l(g0Var, c0Var);
        pt.y yVar = pt.y.f28965d;
        pt.e eVar = new pt.e(yVar);
        d.a aVar8 = d.a.f31956a;
        xt.s sVar = new xt.s(new xt.f());
        r.a aVar9 = r.a.f28950a;
        xu.k.f38114b.getClass();
        xu.l lVar2 = k.a.f38116b;
        st.f fVar2 = new st.f(new st.c(cVar2, bVar, dVar, jVar, aVar4, aVar2, aVar5, bVar2, gVar2, iVar, aVar3, aVar6, aVar7, g0Var, lVar, eVar, sVar, aVar9, aVar8, lVar2, yVar, new uf.c()));
        yt.k kVar = new yt.k(dVar, jVar);
        yt.g gVar4 = new yt.g(g0Var, c0Var, cVar2, dVar);
        List O0 = ca.a.O0(wu.n.f37270a);
        dt.j jVar2 = g0Var.f23841x;
        if (jVar2 instanceof ft.g) {
            gVar = (ft.g) jVar2;
        } else {
            gVar = null;
        }
        ta.v vVar = ta.v.f32902w;
        if (gVar == null || (aVar = gVar.M()) == null) {
            aVar = a.C0345a.f22623a;
        }
        jt.a aVar10 = aVar;
        if (gVar == null || (cVar = gVar.M()) == null) {
            cVar = c.b.f22625a;
        }
        su.l lVar3 = new su.l(cVar2, g0Var, kVar, gVar4, fVar2, aVar2, vVar, wVar, c0Var, aVar10, cVar, eu.h.f14568a, lVar2, new ou.b(cVar2), O0, 262144);
        jVar.f39037a = lVar3;
        nd.z zVar = new nd.z(fVar2);
        iVar.f31972a = zVar;
        ft.u uVar = new ft.u(cVar2, dVar2, g0Var, c0Var, gVar3.M(), gVar3.M(), lVar2, new ou.b(cVar2));
        g0Var.A = new kt.d0(is.k.i2(new kt.g0[]{g0Var}));
        g0Var.B = new kt.o("CompositeProvider@RuntimeModuleData for " + g0Var, ca.a.P0((st.f) zVar.f26148b, uVar));
        mt.f fVar3 = new mt.f(lVar3, new s1.s(jVar, dVar));
        while (true) {
            u0 u0Var3 = u0Var2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(u0Var3, new WeakReference(fVar3));
            if (weakReference2 == null) {
                return fVar3;
            }
            mt.f fVar4 = (mt.f) weakReference2.get();
            if (fVar4 != null) {
                return fVar4;
            }
            concurrentHashMap3.remove(u0Var3, weakReference2);
            u0Var2 = u0Var3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
