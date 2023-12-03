package pu;

import is.u;
import iu.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import pu.i;
import wu.b0;
/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes2.dex */
public final class n extends pu.a {

    /* renamed from: b  reason: collision with root package name */
    public final i f29019b;

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static i a(String message, Collection types) {
            i iVar;
            kotlin.jvm.internal.i.g(message, "message");
            kotlin.jvm.internal.i.g(types, "types");
            ArrayList arrayList = new ArrayList(is.i.H1(types, 10));
            Iterator it = types.iterator();
            while (it.hasNext()) {
                arrayList.add(((b0) it.next()).p());
            }
            dv.d Q = kotlin.jvm.internal.h.Q(arrayList);
            int i6 = Q.f13514u;
            if (i6 != 0) {
                if (i6 != 1) {
                    Object[] array = Q.toArray(new i[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    iVar = new pu.b(message, (i[]) array);
                } else {
                    iVar = (i) Q.get(0);
                }
            } else {
                iVar = i.b.f29008b;
            }
            if (Q.f13514u <= 1) {
                return iVar;
            }
            return new n(iVar);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<gt.a, gt.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f29020u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final gt.a invoke(gt.a aVar) {
            gt.a selectMostSpecificInEachOverridableGroup = aVar;
            kotlin.jvm.internal.i.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public n(i iVar) {
        this.f29019b = iVar;
    }

    @Override // pu.a, pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return s.a(super.a(name, cVar), o.f29021u);
    }

    @Override // pu.a, pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        return s.a(super.c(name, cVar), p.f29022u);
    }

    @Override // pu.a, pu.k
    public final Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        Collection<gt.j> f = super.f(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f) {
            if (((gt.j) obj) instanceof gt.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return u.u2(arrayList2, s.a(arrayList, b.f29020u));
    }

    @Override // pu.a
    public final i i() {
        return this.f29019b;
    }
}
