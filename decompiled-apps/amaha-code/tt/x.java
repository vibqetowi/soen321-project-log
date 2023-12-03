package tt;

import gt.b;
import gt.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pu.i;
/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes2.dex */
public final class x extends y {

    /* renamed from: n  reason: collision with root package name */
    public final wt.g f33698n;

    /* renamed from: o  reason: collision with root package name */
    public final e f33699o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q.f fVar, wt.g jClass, e ownerDescriptor) {
        super(fVar);
        kotlin.jvm.internal.i.g(jClass, "jClass");
        kotlin.jvm.internal.i.g(ownerDescriptor, "ownerDescriptor");
        this.f33698n = jClass;
        this.f33699o = ownerDescriptor;
    }

    public static k0 v(k0 k0Var) {
        boolean z10;
        b.a m02 = k0Var.m0();
        m02.getClass();
        if (m02 != b.a.FAKE_OVERRIDE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return k0Var;
        }
        Collection<? extends k0> f = k0Var.f();
        kotlin.jvm.internal.i.f(f, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(is.i.H1(f, 10));
        for (k0 it : f) {
            kotlin.jvm.internal.i.f(it, "it");
            arrayList.add(v(it));
        }
        return (k0) is.u.y2(is.u.a2(arrayList));
    }

    @Override // pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return null;
    }

    @Override // tt.o
    public final Set h(pu.d kindFilter, i.a.C0490a c0490a) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        return is.y.f20678u;
    }

    @Override // tt.o
    public final Set i(pu.d kindFilter, i.a.C0490a c0490a) {
        Set<fu.e> set;
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        Set L2 = is.u.L2(this.f33661e.invoke().a());
        e eVar = this.f33699o;
        x n02 = ca.a.n0(eVar);
        if (n02 != null) {
            set = n02.b();
        } else {
            set = null;
        }
        if (set == null) {
            set = is.y.f20678u;
        }
        L2.addAll(set);
        if (this.f33698n.D()) {
            L2.addAll(ca.a.P0(dt.n.f13383b, dt.n.f13382a));
        }
        L2.addAll(((st.c) this.f33658b.f29104v).f31955x.a(eVar));
        return L2;
    }

    @Override // tt.o
    public final void j(ArrayList arrayList, fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        ((st.c) this.f33658b.f29104v).f31955x.d(this.f33699o, name, arrayList);
    }

    @Override // tt.o
    public final b k() {
        return new a(this.f33698n, s.f33691u);
    }

    @Override // tt.o
    public final void m(LinkedHashSet linkedHashSet, fu.e name) {
        Collection M2;
        kotlin.jvm.internal.i.g(name, "name");
        e eVar = this.f33699o;
        x n02 = ca.a.n0(eVar);
        if (n02 == null) {
            M2 = is.y.f20678u;
        } else {
            M2 = is.u.M2(n02.a(name, ot.c.WHEN_GET_SUPER_MEMBERS));
        }
        Collection collection = M2;
        e eVar2 = this.f33699o;
        st.c cVar = (st.c) this.f33658b.f29104v;
        linkedHashSet.addAll(sc.b.b0(name, collection, linkedHashSet, eVar2, cVar.f, cVar.f31952u.a()));
        if (this.f33698n.D()) {
            if (kotlin.jvm.internal.i.b(name, dt.n.f13383b)) {
                linkedHashSet.add(iu.f.e(eVar));
            } else if (kotlin.jvm.internal.i.b(name, dt.n.f13382a)) {
                linkedHashSet.add(iu.f.f(eVar));
            }
        }
    }

    @Override // tt.y, tt.o
    public final void n(ArrayList arrayList, fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t tVar = new t(name);
        e eVar = this.f33699o;
        dv.b.b(ca.a.O0(eVar), tr.r.f33560s0, new w(eVar, linkedHashSet, tVar));
        boolean z10 = !arrayList.isEmpty();
        q.f fVar = this.f33658b;
        if (z10) {
            e eVar2 = this.f33699o;
            st.c cVar = (st.c) fVar.f29104v;
            arrayList.addAll(sc.b.b0(name, linkedHashSet, arrayList, eVar2, cVar.f, cVar.f31952u.a()));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            k0 v10 = v((k0) obj);
            Object obj2 = linkedHashMap.get(v10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(v10, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Collection collection = (Collection) entry.getValue();
            e eVar3 = this.f33699o;
            st.c cVar2 = (st.c) fVar.f29104v;
            is.q.R1(sc.b.b0(name, collection, arrayList, eVar3, cVar2.f, cVar2.f31952u.a()), arrayList2);
        }
        arrayList.addAll(arrayList2);
    }

    @Override // tt.o
    public final Set o(pu.d kindFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        Set L2 = is.u.L2(this.f33661e.invoke().e());
        u uVar = u.f33693u;
        e eVar = this.f33699o;
        dv.b.b(ca.a.O0(eVar), tr.r.f33560s0, new w(eVar, L2, uVar));
        return L2;
    }

    @Override // tt.o
    public final gt.j q() {
        return this.f33699o;
    }
}
