package is;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: _Collections.kt */
/* loaded from: classes2.dex */
public class u extends r {
    public static final <T> T A2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> B2(List<? extends T> list, xs.f fVar) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (fVar.isEmpty()) {
            return w.f20676u;
        }
        return I2(list.subList(Integer.valueOf(fVar.f37996u).intValue(), Integer.valueOf(fVar.f37997v).intValue() + 1));
    }

    public static final List C2(AbstractList abstractList) {
        if (abstractList.size() <= 1) {
            return I2(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.i.g(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.G1(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> D2(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return I2(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            kotlin.jvm.internal.i.g(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return i.G1(array);
        }
        List<T> K2 = K2(iterable);
        p.P1(K2, comparator);
        return K2;
    }

    public static final <T> List<T> E2(Iterable<? extends T> iterable, int i6) {
        boolean z10;
        kotlin.jvm.internal.i.g(iterable, "<this>");
        int i10 = 0;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 == 0) {
                return w.f20676u;
            }
            if (iterable instanceof Collection) {
                if (i6 >= ((Collection) iterable).size()) {
                    return I2(iterable);
                }
                if (i6 == 1) {
                    return ca.a.O0(f2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i6);
            for (T t3 : iterable) {
                arrayList.add(t3);
                i10++;
                if (i10 == i6) {
                    break;
                }
            }
            return ca.a.a1(arrayList);
        }
        throw new IllegalArgumentException(defpackage.c.q("Requested element count ", i6, " is less than zero.").toString());
    }

    public static final void F2(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final HashSet G2(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        HashSet hashSet = new HashSet(sp.b.P(i.H1(collection, 12)));
        F2(collection, hashSet);
        return hashSet;
    }

    public static final int[] H2(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = ((Number) it.next()).intValue();
            i6++;
        }
        return iArr;
    }

    public static final <T> List<T> I2(Iterable<? extends T> iterable) {
        Object next;
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return J2(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return ca.a.O0(next);
            }
            return w.f20676u;
        }
        return ca.a.a1(K2(iterable));
    }

    public static final ArrayList J2(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> K2(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return J2((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        F2(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> L2(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        F2(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> M2(Iterable<? extends T> iterable) {
        Object next;
        kotlin.jvm.internal.i.g(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        y yVar = y.f20678u;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(collection.size()));
                    F2(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return ca.a.l1(next);
            }
            return yVar;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        F2(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return ca.a.l1(linkedHashSet2.iterator().next());
        }
        return yVar;
    }

    public static final a0 N2(Iterable iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        return new a0(new t(iterable));
    }

    public static final ArrayList O2(List list, Iterable other) {
        kotlin.jvm.internal.i.g(list, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        Iterator it = list.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(i.H1(list, 10), i.H1(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new hs.f(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final s X1(Iterable iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        return new s(iterable);
    }

    public static final ArrayList Y1(Iterable iterable, int i6) {
        boolean z10;
        ArrayList arrayList;
        Iterator it;
        int i10;
        boolean z11;
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (i6 > 0 && i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
                List list = (List) iterable;
                int size = list.size();
                int i11 = size / i6;
                if (size % i6 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                arrayList = new ArrayList(i11 + i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= 0 && i12 < size) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    int i13 = size - i12;
                    if (i6 <= i13) {
                        i13 = i6;
                    }
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList2.add(list.get(i14 + i12));
                    }
                    arrayList.add(arrayList2);
                    i12 += i6;
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = iterable.iterator();
                kotlin.jvm.internal.i.g(iterator, "iterator");
                if (!iterator.hasNext()) {
                    it = v.f20675u;
                } else {
                    i0 i0Var = new i0(i6, i6, iterator, false, true, null);
                    fv.i iVar = new fv.i();
                    iVar.f15982x = ca.a.M(iVar, iVar, i0Var);
                    it = iVar;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(defpackage.c.q("size ", i6, " must be greater than zero.").toString());
    }

    public static final <T> boolean Z1(Iterable<? extends T> iterable, T t3) {
        int i6;
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t3);
        }
        if (iterable instanceof List) {
            i6 = ((List) iterable).indexOf(t3);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (i10 >= 0) {
                        if (kotlin.jvm.internal.i.b(t3, next)) {
                            i6 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    public static final <T> List<T> a2(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        return I2(L2(iterable));
    }

    public static final List b2(List list, int i6) {
        boolean z10;
        kotlin.jvm.internal.i.g(list, "<this>");
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 == 0) {
                return I2(list);
            }
            int size = list.size() - i6;
            if (size <= 0) {
                return w.f20676u;
            }
            if (size == 1) {
                return ca.a.O0(n2(list));
            }
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                while (i6 < size2) {
                    arrayList.add(list.get(i6));
                    i6++;
                }
            } else {
                ListIterator listIterator = list.listIterator(i6);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(defpackage.c.q("Requested element count ", i6, " is less than zero.").toString());
    }

    public static final List c2(List list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return E2(list, size);
    }

    public static final ArrayList d2(Iterable iterable, ss.l lVar) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList e2(Iterable iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T f2(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) g2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T g2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T h2(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T> T i2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object j2(int i6, List list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (i6 >= 0 && i6 <= ca.a.l0(list)) {
            return list.get(i6);
        }
        return null;
    }

    public static final void k2(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i6, CharSequence truncated, ss.l lVar) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        kotlin.jvm.internal.i.g(buffer, "buffer");
        kotlin.jvm.internal.i.g(separator, "separator");
        kotlin.jvm.internal.i.g(prefix, "prefix");
        kotlin.jvm.internal.i.g(postfix, "postfix");
        kotlin.jvm.internal.i.g(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            kotlin.jvm.internal.h.d(buffer, obj, lVar);
        }
        if (i6 >= 0 && i10 > i6) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void l2(Iterable iterable, Appendable appendable, String str, String str2, String str3, ss.l lVar, int i6) {
        String str4;
        String str5;
        int i10;
        CharSequence charSequence;
        ss.l lVar2;
        if ((i6 & 2) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i6 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i6 & 8) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i6 & 16) != 0) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        if ((i6 & 32) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i6 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        k2(iterable, appendable, str6, str4, str5, i10, charSequence, lVar2);
    }

    public static String m2(Iterable iterable, String str, String str2, String str3, ss.l lVar, int i6) {
        String prefix;
        String postfix;
        int i10;
        CharSequence truncated;
        ss.l lVar2;
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i6 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i6 & 4) != 0) {
            postfix = "";
        } else {
            postfix = str3;
        }
        if ((i6 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        if ((i6 & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i6 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        kotlin.jvm.internal.i.g(iterable, "<this>");
        kotlin.jvm.internal.i.g(separator, "separator");
        kotlin.jvm.internal.i.g(prefix, "prefix");
        kotlin.jvm.internal.i.g(postfix, "postfix");
        kotlin.jvm.internal.i.g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        k2(iterable, sb2, separator, prefix, postfix, i10, truncated, lVar2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final Object n2(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        if (collection instanceof List) {
            return o2((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T o2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(ca.a.l0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T p2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable q2(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final ArrayList r2(Iterable iterable, Object obj) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(i.H1(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.i.b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final ArrayList s2(Iterable iterable, Iterable iterable2) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return u2(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        q.R1(iterable, arrayList);
        q.R1(iterable2, arrayList);
        return arrayList;
    }

    public static final ArrayList t2(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return v2(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        q.R1(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList u2(Iterable elements, Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        kotlin.jvm.internal.i.g(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        q.R1(elements, arrayList2);
        return arrayList2;
    }

    public static final ArrayList v2(Object obj, Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final List w2(List list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (list.size() <= 1) {
            return I2(list);
        }
        List K2 = K2(list);
        Collections.reverse(K2);
        return K2;
    }

    public static final Object x2(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        if (collection instanceof List) {
            return y2((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T y2(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object z2(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() != 1) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }
}
