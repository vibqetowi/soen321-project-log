package pu;

import is.q;
import is.w;
import is.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pu.i;
/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: b  reason: collision with root package name */
    public final String f28971b;

    /* renamed from: c  reason: collision with root package name */
    public final i[] f28972c;

    /* compiled from: ChainedMemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static i a(String debugName, List list) {
            kotlin.jvm.internal.i.g(debugName, "debugName");
            dv.d dVar = new dv.d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar != i.b.f29008b) {
                    if (iVar instanceof b) {
                        i[] elements = ((b) iVar).f28972c;
                        kotlin.jvm.internal.i.g(elements, "elements");
                        dVar.addAll(is.i.G1(elements));
                    } else {
                        dVar.add(iVar);
                    }
                }
            }
            int i6 = dVar.f13514u;
            if (i6 != 0) {
                if (i6 != 1) {
                    Object[] array = dVar.toArray(new i[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return new b(debugName, (i[]) array);
                }
                return (i) dVar.get(0);
            }
            return i.b.f29008b;
        }
    }

    public b(String str, i[] iVarArr) {
        this.f28971b = str;
        this.f28972c = iVarArr;
    }

    @Override // pu.i
    public final Collection a(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        i[] iVarArr = this.f28972c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (i iVar : iVarArr) {
                    collection = kotlin.jvm.internal.h.p(collection, iVar.a(name, cVar));
                }
                if (collection == null) {
                    return y.f20678u;
                }
                return collection;
            }
            return iVarArr[0].a(name, cVar);
        }
        return w.f20676u;
    }

    @Override // pu.i
    public final Set<fu.e> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i iVar : this.f28972c) {
            q.R1(iVar.b(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // pu.i
    public final Collection c(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        i[] iVarArr = this.f28972c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (i iVar : iVarArr) {
                    collection = kotlin.jvm.internal.h.p(collection, iVar.c(name, cVar));
                }
                if (collection == null) {
                    return y.f20678u;
                }
                return collection;
            }
            return iVarArr[0].c(name, cVar);
        }
        return w.f20676u;
    }

    @Override // pu.i
    public final Set<fu.e> d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i iVar : this.f28972c) {
            q.R1(iVar.d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // pu.i
    public final Set<fu.e> e() {
        boolean z10;
        Iterable jVar;
        i[] iVarArr = this.f28972c;
        kotlin.jvm.internal.i.g(iVarArr, "<this>");
        if (iVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jVar = w.f20676u;
        } else {
            jVar = new is.j(iVarArr);
        }
        return ca.a.Y(jVar);
    }

    @Override // pu.k
    public final Collection<gt.j> f(d kindFilter, ss.l<? super fu.e, Boolean> nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        i[] iVarArr = this.f28972c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<gt.j> collection = null;
                for (i iVar : iVarArr) {
                    collection = kotlin.jvm.internal.h.p(collection, iVar.f(kindFilter, nameFilter));
                }
                if (collection == null) {
                    return y.f20678u;
                }
                return collection;
            }
            return iVarArr[0].f(kindFilter, nameFilter);
        }
        return w.f20676u;
    }

    @Override // pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        gt.g gVar = null;
        for (i iVar : this.f28972c) {
            gt.g g5 = iVar.g(name, cVar);
            if (g5 != null) {
                if ((g5 instanceof gt.h) && ((gt.h) g5).M()) {
                    if (gVar == null) {
                        gVar = g5;
                    }
                } else {
                    return g5;
                }
            }
        }
        return gVar;
    }

    public final String toString() {
        return this.f28971b;
    }
}
