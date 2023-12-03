package uu;

import au.h;
import au.m;
import au.q;
import fv.t;
import gt.k0;
import gt.p0;
import gt.u0;
import gu.p;
import is.h0;
import is.u;
import is.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import ta.v;
import vu.c;
/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes2.dex */
public abstract class i extends pu.j {
    public static final /* synthetic */ ys.m<Object>[] f = {y.c(new s(y.a(i.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), y.c(new s(y.a(i.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    public final j7.k f34561b;

    /* renamed from: c  reason: collision with root package name */
    public final a f34562c;

    /* renamed from: d  reason: collision with root package name */
    public final vu.i f34563d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.j f34564e;

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public interface a {
        Collection a(fu.e eVar, ot.c cVar);

        Set<fu.e> b();

        Collection c(fu.e eVar, ot.c cVar);

        Set<fu.e> d();

        void e(ArrayList arrayList, pu.d dVar, ss.l lVar);

        Set<fu.e> f();

        u0 g(fu.e eVar);
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public final class b implements a {

        /* renamed from: j  reason: collision with root package name */
        public static final /* synthetic */ ys.m<Object>[] f34565j = {y.c(new s(y.a(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), y.c(new s(y.a(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f34566a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f34567b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<fu.e, byte[]> f34568c;

        /* renamed from: d  reason: collision with root package name */
        public final vu.g<fu.e, Collection<p0>> f34569d;

        /* renamed from: e  reason: collision with root package name */
        public final vu.g<fu.e, Collection<k0>> f34570e;
        public final vu.h<fu.e, u0> f;

        /* renamed from: g  reason: collision with root package name */
        public final vu.i f34571g;

        /* renamed from: h  reason: collision with root package name */
        public final vu.i f34572h;

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ p f34574u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ByteArrayInputStream f34575v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ i f34576w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gu.b bVar, ByteArrayInputStream byteArrayInputStream, i iVar) {
                super(0);
                this.f34574u = bVar;
                this.f34575v = byteArrayInputStream;
                this.f34576w = iVar;
            }

            @Override // ss.a
            public final Object invoke() {
                return ((gu.b) this.f34574u).c(this.f34575v, ((su.l) this.f34576w.f34561b.f21732u).f32058p);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: uu.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0586b extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f34578v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0586b(i iVar) {
                super(0);
                this.f34578v = iVar;
            }

            @Override // ss.a
            public final Set<? extends fu.e> invoke() {
                return h0.I1(b.this.f34566a.keySet(), this.f34578v.o());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class c extends kotlin.jvm.internal.k implements ss.l<fu.e, Collection<? extends p0>> {
            public c() {
                super(1);
            }

            @Override // ss.l
            public final Collection<? extends p0> invoke(fu.e eVar) {
                Collection<au.h> collection;
                fu.e it = eVar;
                kotlin.jvm.internal.i.g(it, "it");
                b bVar = b.this;
                LinkedHashMap linkedHashMap = bVar.f34566a;
                h.a PARSER = au.h.P;
                kotlin.jvm.internal.i.f(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                i iVar = i.this;
                if (bArr != null) {
                    a aVar = new a(PARSER, new ByteArrayInputStream(bArr), iVar);
                    collection = ca.a.a1(t.J0(fv.k.v0(new fv.g(aVar, new fv.n(aVar)))));
                } else {
                    collection = w.f20676u;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (au.h it2 : collection) {
                    kotlin.jvm.internal.i.f(it2, "it");
                    l e10 = ((su.y) iVar.f34561b.C).e(it2);
                    if (!iVar.r(e10)) {
                        e10 = null;
                    }
                    if (e10 != null) {
                        arrayList.add(e10);
                    }
                }
                iVar.j(it, arrayList);
                return ca.a.A(arrayList);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class d extends kotlin.jvm.internal.k implements ss.l<fu.e, Collection<? extends k0>> {
            public d() {
                super(1);
            }

            @Override // ss.l
            public final Collection<? extends k0> invoke(fu.e eVar) {
                Collection<au.m> collection;
                fu.e it = eVar;
                kotlin.jvm.internal.i.g(it, "it");
                b bVar = b.this;
                LinkedHashMap linkedHashMap = bVar.f34567b;
                m.a PARSER = au.m.P;
                kotlin.jvm.internal.i.f(PARSER, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                i iVar = i.this;
                if (bArr != null) {
                    a aVar = new a(PARSER, new ByteArrayInputStream(bArr), iVar);
                    collection = ca.a.a1(t.J0(fv.k.v0(new fv.g(aVar, new fv.n(aVar)))));
                } else {
                    collection = w.f20676u;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (au.m it2 : collection) {
                    kotlin.jvm.internal.i.f(it2, "it");
                    arrayList.add(((su.y) iVar.f34561b.C).f(it2));
                }
                iVar.k(it, arrayList);
                return ca.a.A(arrayList);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class e extends kotlin.jvm.internal.k implements ss.l<fu.e, u0> {
            public e() {
                super(1);
            }

            @Override // ss.l
            public final u0 invoke(fu.e eVar) {
                fu.e it = eVar;
                kotlin.jvm.internal.i.g(it, "it");
                b bVar = b.this;
                byte[] bArr = bVar.f34568c.get(it);
                if (bArr != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    i iVar = i.this;
                    q qVar = (q) q.J.c(byteArrayInputStream, ((su.l) iVar.f34561b.f21732u).f32058p);
                    if (qVar != null) {
                        return ((su.y) iVar.f34561b.C).g(qVar);
                    }
                }
                return null;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes2.dex */
        public static final class f extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f34583v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(i iVar) {
                super(0);
                this.f34583v = iVar;
            }

            @Override // ss.a
            public final Set<? extends fu.e> invoke() {
                return h0.I1(b.this.f34567b.keySet(), this.f34583v.p());
            }
        }

        public b(List<au.h> list, List<au.m> list2, List<q> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                fu.e x10 = v.x((cu.c) i.this.f34561b.f21733v, ((au.h) ((gu.n) obj)).f3743z);
                Object obj2 = linkedHashMap.get(x10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(x10, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f34566a = h(linkedHashMap);
            i iVar = i.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                fu.e x11 = v.x((cu.c) iVar.f34561b.f21733v, ((au.m) ((gu.n) obj3)).f3771z);
                Object obj4 = linkedHashMap2.get(x11);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(x11, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f34567b = h(linkedHashMap2);
            ((su.l) i.this.f34561b.f21732u).f32046c.f();
            i iVar2 = i.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : list3) {
                fu.e x12 = v.x((cu.c) iVar2.f34561b.f21733v, ((q) ((gu.n) obj5)).f3833y);
                Object obj6 = linkedHashMap3.get(x12);
                if (obj6 == null) {
                    obj6 = new ArrayList();
                    linkedHashMap3.put(x12, obj6);
                }
                ((List) obj6).add(obj5);
            }
            this.f34568c = h(linkedHashMap3);
            this.f34569d = i.this.f34561b.c().h(new c());
            this.f34570e = i.this.f34561b.c().h(new d());
            this.f = i.this.f34561b.c().b(new e());
            this.f34571g = i.this.f34561b.c().e(new C0586b(i.this));
            this.f34572h = i.this.f34561b.c().e(new f(i.this));
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(sp.b.P(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<gu.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
                for (gu.a aVar : iterable) {
                    int b10 = aVar.b();
                    int f2 = CodedOutputStream.f(b10) + b10;
                    if (f2 > 4096) {
                        f2 = 4096;
                    }
                    CodedOutputStream j10 = CodedOutputStream.j(byteArrayOutputStream, f2);
                    j10.v(b10);
                    aVar.f(j10);
                    j10.i();
                    arrayList.add(hs.k.f19476a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // uu.i.a
        public final Collection a(fu.e name, ot.c cVar) {
            kotlin.jvm.internal.i.g(name, "name");
            if (!b().contains(name)) {
                return w.f20676u;
            }
            return (Collection) ((c.k) this.f34569d).invoke(name);
        }

        @Override // uu.i.a
        public final Set<fu.e> b() {
            return (Set) kotlin.jvm.internal.h.C(this.f34571g, f34565j[0]);
        }

        @Override // uu.i.a
        public final Collection c(fu.e name, ot.c cVar) {
            kotlin.jvm.internal.i.g(name, "name");
            if (!d().contains(name)) {
                return w.f20676u;
            }
            return (Collection) ((c.k) this.f34570e).invoke(name);
        }

        @Override // uu.i.a
        public final Set<fu.e> d() {
            return (Set) kotlin.jvm.internal.h.C(this.f34572h, f34565j[1]);
        }

        @Override // uu.i.a
        public final void e(ArrayList arrayList, pu.d kindFilter, ss.l nameFilter) {
            ot.c cVar = ot.c.WHEN_GET_ALL_DESCRIPTORS;
            kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
            kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
            boolean a10 = kindFilter.a(pu.d.f28982j);
            iu.j jVar = iu.j.f20697u;
            if (a10) {
                Set<fu.e> d10 = d();
                ArrayList arrayList2 = new ArrayList();
                for (fu.e eVar : d10) {
                    if (((Boolean) nameFilter.invoke(eVar)).booleanValue()) {
                        arrayList2.addAll(c(eVar, cVar));
                    }
                }
                is.p.P1(arrayList2, jVar);
                arrayList.addAll(arrayList2);
            }
            if (kindFilter.a(pu.d.f28981i)) {
                Set<fu.e> b10 = b();
                ArrayList arrayList3 = new ArrayList();
                for (fu.e eVar2 : b10) {
                    if (((Boolean) nameFilter.invoke(eVar2)).booleanValue()) {
                        arrayList3.addAll(a(eVar2, cVar));
                    }
                }
                is.p.P1(arrayList3, jVar);
                arrayList.addAll(arrayList3);
            }
        }

        @Override // uu.i.a
        public final Set<fu.e> f() {
            return this.f34568c.keySet();
        }

        @Override // uu.i.a
        public final u0 g(fu.e name) {
            kotlin.jvm.internal.i.g(name, "name");
            return this.f.invoke(name);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.a<Collection<fu.e>> f34584u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ss.a<? extends Collection<fu.e>> aVar) {
            super(0);
            this.f34584u = aVar;
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            return u.M2(this.f34584u.invoke());
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<Set<? extends fu.e>> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final Set<? extends fu.e> invoke() {
            i iVar = i.this;
            Set<fu.e> n10 = iVar.n();
            if (n10 == null) {
                return null;
            }
            return h0.I1(h0.I1(iVar.m(), iVar.f34562c.f()), n10);
        }
    }

    public i(j7.k c10, List<au.h> list, List<au.m> list2, List<q> list3, ss.a<? extends Collection<fu.e>> classNames) {
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(classNames, "classNames");
        this.f34561b = c10;
        ((su.l) c10.f21732u).f32046c.a();
        this.f34562c = new b(list, list2, list3);
        this.f34563d = c10.c().e(new c(classNames));
        this.f34564e = c10.c().f(new d());
    }

    @Override // pu.j, pu.i
    public Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return this.f34562c.a(name, cVar);
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> b() {
        return this.f34562c.b();
    }

    @Override // pu.j, pu.i
    public Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return this.f34562c.c(name, cVar);
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> d() {
        return this.f34562c.d();
    }

    @Override // pu.j, pu.i
    public final Set<fu.e> e() {
        ys.m<Object> p10 = f[1];
        vu.j jVar = this.f34564e;
        kotlin.jvm.internal.i.g(jVar, "<this>");
        kotlin.jvm.internal.i.g(p10, "p");
        return (Set) jVar.invoke();
    }

    @Override // pu.j, pu.k
    public gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        if (q(name)) {
            return ((su.l) this.f34561b.f21732u).b(l(name));
        }
        a aVar = this.f34562c;
        if (aVar.f().contains(name)) {
            return aVar.g(name);
        }
        return null;
    }

    public abstract void h(ArrayList arrayList, ss.l lVar);

    public final List i(pu.d kindFilter, ss.l nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(pu.d.f)) {
            h(arrayList, nameFilter);
        }
        a aVar = this.f34562c;
        aVar.e(arrayList, kindFilter, nameFilter);
        if (kindFilter.a(pu.d.f28984l)) {
            for (fu.e eVar : m()) {
                if (((Boolean) nameFilter.invoke(eVar)).booleanValue()) {
                    ca.a.g(((su.l) this.f34561b.f21732u).b(l(eVar)), arrayList);
                }
            }
        }
        if (kindFilter.a(pu.d.f28979g)) {
            for (fu.e eVar2 : aVar.f()) {
                if (((Boolean) nameFilter.invoke(eVar2)).booleanValue()) {
                    ca.a.g(aVar.g(eVar2), arrayList);
                }
            }
        }
        return ca.a.A(arrayList);
    }

    public void j(fu.e name, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(name, "name");
    }

    public void k(fu.e name, ArrayList arrayList) {
        kotlin.jvm.internal.i.g(name, "name");
    }

    public abstract fu.b l(fu.e eVar);

    public final Set<fu.e> m() {
        return (Set) kotlin.jvm.internal.h.C(this.f34563d, f[0]);
    }

    public abstract Set<fu.e> n();

    public abstract Set<fu.e> o();

    public abstract Set<fu.e> p();

    public boolean q(fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        return m().contains(name);
    }

    public boolean r(l lVar) {
        return true;
    }
}
