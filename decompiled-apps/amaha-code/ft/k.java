package ft;

import com.appsflyer.R;
import dt.n;
import ft.g;
import gt.a0;
import gt.b;
import gt.p0;
import gt.u;
import gt.z;
import gt.z0;
import is.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import kt.g0;
import pu.i;
import vu.c;
import wu.f0;
import wu.i0;
import wu.j1;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes2.dex */
public final class k implements jt.a, jt.c {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f15886h = {y.c(new kotlin.jvm.internal.s(y.a(k.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), y.c(new kotlin.jvm.internal.s(y.a(k.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), y.c(new kotlin.jvm.internal.s(y.a(k.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a  reason: collision with root package name */
    public final a0 f15887a;

    /* renamed from: b  reason: collision with root package name */
    public final ca.a f15888b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.i f15889c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f15890d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.i f15891e;
    public final vu.a<fu.c, gt.e> f;

    /* renamed from: g  reason: collision with root package name */
    public final vu.i f15892g;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes2.dex */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    public k(g0 g0Var, vu.l storageManager, h hVar) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f15887a = g0Var;
        this.f15888b = ca.a.D;
        this.f15889c = storageManager.e(hVar);
        kt.n nVar = new kt.n(new m(g0Var, new fu.c("java.io")), fu.e.j("Serializable"), z.ABSTRACT, 2, ca.a.O0(new f0(storageManager, new n(this))), storageManager);
        nVar.M0(i.b.f29008b, is.y.f20678u, null);
        i0 r = nVar.r();
        kotlin.jvm.internal.i.f(r, "mockSerializableClass.defaultType");
        this.f15890d = r;
        this.f15891e = storageManager.e(new l(this, storageManager));
        this.f = storageManager.d();
        this.f15892g = storageManager.e(new t(this));
    }

    @Override // jt.a
    public final Collection a(uu.d dVar) {
        boolean z10;
        boolean z11;
        fu.d dVar2;
        boolean z12;
        w wVar = w.f20676u;
        if (dVar.E == 1 && g().f15880b) {
            tt.e f = f(dVar);
            if (f == null) {
                return wVar;
            }
            gt.e W0 = ca.a.W0(this.f15888b, mu.a.g(f), b.f);
            if (W0 == null) {
                return wVar;
            }
            j1 e10 = j1.e(sp.b.l(W0, f));
            ArrayList arrayList = new ArrayList();
            for (Object obj : f.L.f33629q.invoke()) {
                gt.d dVar3 = (gt.d) obj;
                boolean z13 = false;
                if (dVar3.getVisibility().a().f16789b) {
                    Collection<gt.d> y10 = W0.y();
                    kotlin.jvm.internal.i.f(y10, "defaultKotlinVersion.constructors");
                    if (!y10.isEmpty()) {
                        for (gt.d it : y10) {
                            kotlin.jvm.internal.i.f(it, "it");
                            if (iu.l.j(it, dVar3.d(e10)) == 1) {
                                z12 = true;
                                continue;
                            } else {
                                z12 = false;
                                continue;
                            }
                            if (z12) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        if (dVar3.i().size() == 1) {
                            List<z0> valueParameters = dVar3.i();
                            kotlin.jvm.internal.i.f(valueParameters, "valueParameters");
                            gt.g a10 = ((z0) is.u.y2(valueParameters)).a().O0().a();
                            if (a10 != null) {
                                dVar2 = mu.a.h(a10);
                            } else {
                                dVar2 = null;
                            }
                            if (kotlin.jvm.internal.i.b(dVar2, mu.a.h(dVar))) {
                                z11 = true;
                                if (!z11 && !dt.j.D(dVar3) && !v.f15913e.contains(ca.a.n1(f, ta.v.n(dVar3, 3)))) {
                                    z13 = true;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                gt.d dVar4 = (gt.d) it2.next();
                u.a<? extends gt.u> s10 = dVar4.s();
                s10.a(dVar);
                s10.n(dVar.r());
                s10.e();
                s10.o(e10.g());
                if (!v.f.contains(ca.a.n1(f, ta.v.n(dVar4, 3)))) {
                    s10.p((ht.h) kotlin.jvm.internal.h.C(this.f15892g, f15886h[2]));
                }
                gt.u build = s10.build();
                kotlin.jvm.internal.i.e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((gt.d) build);
            }
            return arrayList2;
        }
        return wVar;
    }

    @Override // jt.a
    public final Collection b(uu.d classDescriptor) {
        kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
        fu.d h10 = mu.a.h(classDescriptor);
        LinkedHashSet linkedHashSet = v.f15909a;
        boolean a10 = v.a(h10);
        i0 i0Var = this.f15890d;
        boolean z10 = true;
        if (a10) {
            i0 cloneableType = (i0) kotlin.jvm.internal.h.C(this.f15891e, f15886h[1]);
            kotlin.jvm.internal.i.f(cloneableType, "cloneableType");
            return ca.a.P0(cloneableType, i0Var);
        }
        if (!v.a(h10)) {
            String str = c.f15851a;
            fu.b g5 = c.g(h10);
            if (g5 != null) {
                try {
                    z10 = Serializable.class.isAssignableFrom(Class.forName(g5.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
            z10 = false;
        }
        if (z10) {
            return ca.a.O0(i0Var);
        }
        return w.f20676u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c4, code lost:
        if (r4 != 3) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0247  */
    @Override // jt.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection c(fu.e name, uu.d classDescriptor) {
        boolean z10;
        p0 p0Var;
        Iterable<gt.e> P0;
        Object obj;
        gt.e eVar;
        boolean z11;
        boolean z12;
        boolean booleanValue;
        boolean z13;
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
        boolean b10 = kotlin.jvm.internal.i.b(name, ft.a.f15850e);
        w<p0> wVar = w.f20676u;
        ys.m<Object>[] mVarArr = f15886h;
        boolean z14 = false;
        if (b10) {
            fu.e eVar2 = dt.j.f13360e;
            if (!dt.j.c(classDescriptor, n.a.f13402g) && dt.j.s(classDescriptor) == null) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                List<au.h> list = classDescriptor.f34533y.K;
                kotlin.jvm.internal.i.f(list, "classDescriptor.classProto.functionList");
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (kotlin.jvm.internal.i.b(ta.v.x((cu.c) classDescriptor.F.f21733v, ((au.h) it.next()).f3743z), ft.a.f15850e)) {
                                z14 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z14) {
                    return wVar;
                }
                u.a<? extends p0> s10 = ((p0) is.u.x2(((i0) kotlin.jvm.internal.h.C(this.f15891e, mVarArr[1])).p().a(name, ot.c.FROM_BUILTINS))).s();
                s10.a(classDescriptor);
                s10.k(gt.p.f16804e);
                s10.n(classDescriptor.r());
                s10.h(classDescriptor.L0());
                p0 build = s10.build();
                kotlin.jvm.internal.i.d(build);
                return ca.a.O0(build);
            }
        }
        if (!g().f15880b) {
            return wVar;
        }
        p pVar = new p(name);
        tt.e f = f(classDescriptor);
        if (f != null) {
            fu.c g5 = mu.a.g(f);
            b builtIns = b.f;
            ca.a aVar = this.f15888b;
            aVar.getClass();
            kotlin.jvm.internal.i.g(builtIns, "builtIns");
            gt.e W0 = ca.a.W0(aVar, g5, builtIns);
            if (W0 == null) {
                P0 = is.y.f20678u;
            } else {
                String str = c.f15851a;
                fu.c cVar = c.f15860k.get(mu.a.h(W0));
                if (cVar == null) {
                    P0 = ca.a.l1(W0);
                } else {
                    P0 = ca.a.P0(W0, builtIns.j(cVar));
                }
            }
            if (P0 instanceof List) {
                List list2 = (List) P0;
                if (!list2.isEmpty()) {
                    obj = list2.get(list2.size() - 1);
                    eVar = (gt.e) obj;
                    if (eVar != null) {
                        int i6 = dv.e.f13520w;
                        ArrayList arrayList = new ArrayList(is.i.H1(P0, 10));
                        for (gt.e eVar3 : P0) {
                            arrayList.add(mu.a.g(eVar3));
                        }
                        dv.e eVar4 = new dv.e();
                        eVar4.addAll(arrayList);
                        String str2 = c.f15851a;
                        boolean containsKey = c.f15859j.containsKey(iu.g.g(classDescriptor));
                        pu.i G0 = ((gt.e) ((c.b) this.f).c(mu.a.g(f), new o(f, eVar))).G0();
                        kotlin.jvm.internal.i.f(G0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : pVar.invoke(G0)) {
                            p0 p0Var2 = (p0) obj2;
                            if (p0Var2.m0() == b.a.DECLARATION && p0Var2.getVisibility().a().f16789b && !dt.j.D(p0Var2)) {
                                Collection<? extends gt.u> f2 = p0Var2.f();
                                kotlin.jvm.internal.i.f(f2, "analogueMember.overriddenDescriptors");
                                if (!f2.isEmpty()) {
                                    for (gt.u uVar : f2) {
                                        gt.j c10 = uVar.c();
                                        kotlin.jvm.internal.i.f(c10, "it.containingDeclaration");
                                        if (eVar4.contains(mu.a.g(c10))) {
                                            z12 = true;
                                            break;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                    gt.j c11 = p0Var2.c();
                                    kotlin.jvm.internal.i.e(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (v.f15912d.contains(ca.a.n1((gt.e) c11, ta.v.n(p0Var2, 3))) ^ containsKey) {
                                        booleanValue = true;
                                    } else {
                                        Boolean d10 = dv.b.d(ca.a.O0(p0Var2), f6.b.B, new s(this));
                                        kotlin.jvm.internal.i.f(d10, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        booleanValue = d10.booleanValue();
                                    }
                                    if (!booleanValue) {
                                        z11 = true;
                                        if (!z11) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        wVar = arrayList2;
                    }
                }
                obj = null;
                eVar = (gt.e) obj;
                if (eVar != null) {
                }
            } else {
                Iterator it2 = P0.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                    eVar = (gt.e) obj;
                    if (eVar != null) {
                    }
                }
                obj = null;
                eVar = (gt.e) obj;
                if (eVar != null) {
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (p0 p0Var3 : wVar) {
            gt.j c12 = p0Var3.c();
            kotlin.jvm.internal.i.e(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            gt.u d11 = p0Var3.d(j1.e(sp.b.l((gt.e) c12, classDescriptor)));
            kotlin.jvm.internal.i.e(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            u.a<? extends p0> s11 = ((p0) d11).s();
            s11.a(classDescriptor);
            s11.h(classDescriptor.L0());
            s11.e();
            gt.j c13 = p0Var3.c();
            kotlin.jvm.internal.i.e(c13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object b11 = dv.b.b(ca.a.O0((gt.e) c13), new q(this), new r(ta.v.n(p0Var3, 3), new x()));
            kotlin.jvm.internal.i.f(b11, "private fun FunctionDesc…ERED\n            })\n    }");
            int ordinal = ((a) b11).ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    s11.p((ht.h) kotlin.jvm.internal.h.C(this.f15892g, mVarArr[2]));
                }
                p0 build2 = s11.build();
                kotlin.jvm.internal.i.d(build2);
                p0Var = build2;
            } else {
                if (classDescriptor.m() == z.FINAL && classDescriptor.j() != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    s11.f();
                    p0 build22 = s11.build();
                    kotlin.jvm.internal.i.d(build22);
                    p0Var = build22;
                }
                p0Var = null;
            }
            if (p0Var != null) {
                arrayList3.add(p0Var);
            }
        }
        return arrayList3;
    }

    @Override // jt.c
    public final boolean d(uu.d classDescriptor, uu.l lVar) {
        kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
        tt.e f = f(classDescriptor);
        if (f == null || !lVar.getAnnotations().H(jt.d.f22626a)) {
            return true;
        }
        if (!g().f15880b) {
            return false;
        }
        String n10 = ta.v.n(lVar, 3);
        tt.k G0 = f.G0();
        fu.e name = lVar.getName();
        kotlin.jvm.internal.i.f(name, "functionDescriptor.name");
        Collection<p0> a10 = G0.a(name, ot.c.FROM_BUILTINS);
        if (!(a10 instanceof Collection) || !a10.isEmpty()) {
            for (p0 p0Var : a10) {
                if (kotlin.jvm.internal.i.b(ta.v.n(p0Var, 3), n10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jt.a
    public final Collection e(uu.d classDescriptor) {
        tt.e f;
        Set<fu.e> b10;
        kotlin.jvm.internal.i.g(classDescriptor, "classDescriptor");
        boolean z10 = g().f15880b;
        is.y yVar = is.y.f20678u;
        if (z10 && (f = f(classDescriptor)) != null && (b10 = f.G0().b()) != null) {
            return b10;
        }
        return yVar;
    }

    public final tt.e f(gt.e eVar) {
        fu.c b10;
        if (eVar != null) {
            fu.e eVar2 = dt.j.f13360e;
            if (dt.j.c(eVar, n.a.f13395a) || !dt.j.L(eVar)) {
                return null;
            }
            fu.d h10 = mu.a.h(eVar);
            if (!h10.e()) {
                return null;
            }
            String str = c.f15851a;
            fu.b g5 = c.g(h10);
            if (g5 == null || (b10 = g5.b()) == null) {
                return null;
            }
            gt.e i12 = ca.a.i1(g().f15879a, b10);
            if (!(i12 instanceof tt.e)) {
                return null;
            }
            return (tt.e) i12;
        }
        dt.j.a(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        throw null;
    }

    public final g.a g() {
        return (g.a) kotlin.jvm.internal.h.C(this.f15889c, f15886h[0]);
    }
}
