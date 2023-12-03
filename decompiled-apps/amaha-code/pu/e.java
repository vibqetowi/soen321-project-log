package pu;

import gt.k0;
import gt.p0;
import gt.u;
import is.q;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import pu.k;
import wu.b0;
/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes2.dex */
public abstract class e extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f28995d = {y.c(new s(y.a(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final gt.e f28996b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.i f28997c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<List<? extends gt.j>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [is.w] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
        @Override // ss.a
        public final List<? extends gt.j> invoke() {
            ?? r72;
            e eVar = e.this;
            List<u> h10 = eVar.h();
            ArrayList arrayList = new ArrayList(3);
            Collection<b0> c10 = eVar.f28996b.l().c();
            kotlin.jvm.internal.i.f(c10, "containingClass.typeConstructor.supertypes");
            ArrayList arrayList2 = new ArrayList();
            for (b0 b0Var : c10) {
                q.R1(k.a.a(b0Var.p(), null, 3), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof gt.b) {
                    arrayList3.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                fu.e name = ((gt.b) next2).getName();
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                fu.e eVar2 = (fu.e) entry.getKey();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : (List) entry.getValue()) {
                    Boolean valueOf = Boolean.valueOf(((gt.b) obj2) instanceof u);
                    Object obj3 = linkedHashMap2.get(valueOf);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap2.put(valueOf, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                    List list = (List) entry2.getValue();
                    iu.l lVar = iu.l.f;
                    if (booleanValue) {
                        r72 = new ArrayList();
                        for (Object obj4 : h10) {
                            if (kotlin.jvm.internal.i.b(((u) obj4).getName(), eVar2)) {
                                r72.add(obj4);
                            }
                        }
                    } else {
                        r72 = w.f20676u;
                    }
                    lVar.h(eVar2, list, r72, eVar.f28996b, new f(arrayList, eVar));
                }
            }
            return is.u.u2(ca.a.A(arrayList), h10);
        }
    }

    public e(vu.l storageManager, gt.e containingClass) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(containingClass, "containingClass");
        this.f28996b = containingClass;
        this.f28997c = storageManager.e(new a());
    }

    @Override // pu.j, pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        ys.m<Object> mVar = f28995d[0];
        dv.d dVar = new dv.d();
        for (Object obj : (List) kotlin.jvm.internal.h.C(this.f28997c, mVar)) {
            if ((obj instanceof p0) && kotlin.jvm.internal.i.b(((p0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // pu.j, pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        ys.m<Object> mVar = f28995d[0];
        dv.d dVar = new dv.d();
        for (Object obj : (List) kotlin.jvm.internal.h.C(this.f28997c, mVar)) {
            if ((obj instanceof k0) && kotlin.jvm.internal.i.b(((k0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // pu.j, pu.k
    public final Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        if (!kindFilter.a(d.f28986n.f28992b)) {
            return w.f20676u;
        }
        return (List) kotlin.jvm.internal.h.C(this.f28997c, f28995d[0]);
    }

    public abstract List<u> h();
}
