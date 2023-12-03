package tt;

import fv.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final wt.g f33594a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<wt.p, Boolean> f33595b;

    /* renamed from: c  reason: collision with root package name */
    public final C0559a f33596c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f33597d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f33598e;
    public final LinkedHashMap f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: tt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0559a extends kotlin.jvm.internal.k implements ss.l<wt.q, Boolean> {
        public C0559a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            if (r0.equals("hashCode") == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
            if (r0.equals("toString") != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
            r6 = r6.i().isEmpty();
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(wt.q qVar) {
            boolean z10;
            boolean z11;
            wt.w wVar;
            fu.c e10;
            wt.q m10 = qVar;
            kotlin.jvm.internal.i.g(m10, "m");
            boolean z12 = false;
            if (a.this.f33595b.invoke(m10).booleanValue()) {
                if (m10.p().I()) {
                    String f = m10.getName().f();
                    int hashCode = f.hashCode();
                    if (hashCode != -1776922004) {
                        if (hashCode != -1295482945) {
                            if (hashCode == 147696667) {
                            }
                        } else if (f.equals("equals")) {
                            wt.z zVar = (wt.z) is.u.A2(m10.i());
                            wt.j jVar = null;
                            if (zVar != null) {
                                wVar = zVar.a();
                            } else {
                                wVar = null;
                            }
                            if (wVar instanceof wt.j) {
                                jVar = (wt.j) wVar;
                            }
                            if (jVar != null) {
                                wt.i f2 = jVar.f();
                                if ((f2 instanceof wt.g) && (e10 = ((wt.g) f2).e()) != null && kotlin.jvm.internal.i.b(e10.b(), "java.lang.Object")) {
                                    z11 = true;
                                }
                            }
                        }
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        if (!z10) {
                            z12 = true;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(wt.g jClass, ss.l<? super wt.p, Boolean> memberFilter) {
        kotlin.jvm.internal.i.g(jClass, "jClass");
        kotlin.jvm.internal.i.g(memberFilter, "memberFilter");
        this.f33594a = jClass;
        this.f33595b = memberFilter;
        C0559a c0559a = new C0559a();
        this.f33596c = c0559a;
        fv.e B0 = fv.t.B0(is.u.X1(jClass.x()), c0559a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e.a aVar = new e.a(B0);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            fu.e name = ((wt.q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f33597d = linkedHashMap;
        fv.e B02 = fv.t.B0(is.u.X1(this.f33594a.t()), this.f33595b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e.a aVar2 = new e.a(B02);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((wt.n) next2).getName(), next2);
        }
        this.f33598e = linkedHashMap2;
        ArrayList n10 = this.f33594a.n();
        ss.l<wt.p, Boolean> lVar = this.f33595b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : n10) {
            if (((Boolean) lVar.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int P = sp.b.P(is.i.H1(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(P < 16 ? 16 : P);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((wt.v) next3).getName(), next3);
        }
        this.f = linkedHashMap3;
    }

    @Override // tt.b
    public final Set<fu.e> a() {
        fv.e B0 = fv.t.B0(is.u.X1(this.f33594a.x()), this.f33596c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a(B0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((wt.q) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // tt.b
    public final wt.v b(fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        return (wt.v) this.f.get(name);
    }

    @Override // tt.b
    public final wt.n c(fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        return (wt.n) this.f33598e.get(name);
    }

    @Override // tt.b
    public final Set<fu.e> d() {
        return this.f.keySet();
    }

    @Override // tt.b
    public final Set<fu.e> e() {
        fv.e B0 = fv.t.B0(is.u.X1(this.f33594a.t()), this.f33595b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a(B0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((wt.n) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // tt.b
    public final Collection<wt.q> f(fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        List list = (List) this.f33597d.get(name);
        if (list == null) {
            return is.w.f20676u;
        }
        return list;
    }
}
