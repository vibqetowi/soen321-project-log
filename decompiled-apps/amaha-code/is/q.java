package is;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: ReversedViews.kt */
/* loaded from: classes2.dex */
public class q extends p {
    public static final int Q1(int i6, List list) {
        if (new xs.f(0, ca.a.l0(list)).m(i6)) {
            return ca.a.l0(list) - i6;
        }
        StringBuilder u10 = defpackage.c.u("Element index ", i6, " must be in range [");
        u10.append(new xs.f(0, ca.a.l0(list)));
        u10.append("].");
        throw new IndexOutOfBoundsException(u10.toString());
    }

    public static final void R1(Iterable elements, Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        kotlin.jvm.internal.i.g(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            collection.add(obj);
        }
    }

    public static final f0 S1(List list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        return new f0(list);
    }

    public static final boolean T1(Collection collection, ss.l lVar) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static final void U1(ArrayList arrayList, ss.l predicate) {
        int l02;
        kotlin.jvm.internal.i.g(arrayList, "<this>");
        kotlin.jvm.internal.i.g(predicate, "predicate");
        int i6 = 0;
        xs.e it = new xs.f(0, ca.a.l0(arrayList)).iterator();
        while (it.f38001w) {
            int nextInt = it.nextInt();
            Object obj = arrayList.get(nextInt);
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (i6 != nextInt) {
                    arrayList.set(i6, obj);
                }
                i6++;
            }
        }
        if (i6 >= arrayList.size() || i6 > (l02 = ca.a.l0(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(l02);
            if (l02 != i6) {
                l02--;
            } else {
                return;
            }
        }
    }

    public static final Object V1(List list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(ca.a.l0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
