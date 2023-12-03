package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap f21142a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ConcurrentHashMap concurrentHashMap) {
        this.f21142a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f21142a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsAll(Collection collection) {
        if (collection != this) {
            for (Object obj : collection) {
                if (obj == null || !contains(obj)) {
                    return false;
                }
                while (r2.hasNext()) {
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21142a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f21142a.f21129a;
        boolean z10 = false;
        if (lVarArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= lVarArr.length) {
            for (Object obj : collection) {
                z10 |= remove(obj);
            }
        } else {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f21142a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long k10 = this.f21142a.k();
        if (k10 < 0) {
            k10 = 0;
        }
        if (k10 <= 2147483639) {
            int i6 = (int) k10;
            Object[] objArr = new Object[i6];
            Iterator it = iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i10 == i6) {
                    if (i6 >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i11 = i6 < 1073741819 ? (i6 >>> 1) + 1 + i6 : 2147483639;
                    objArr = Arrays.copyOf(objArr, i11);
                    i6 = i11;
                }
                objArr[i10] = next;
                i10++;
            }
            return i10 == i6 ? objArr : Arrays.copyOf(objArr, i10);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long k10 = this.f21142a.k();
        if (k10 < 0) {
            k10 = 0;
        }
        if (k10 <= 2147483639) {
            int i6 = (int) k10;
            Object[] objArr2 = objArr.length >= i6 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
            int length = objArr2.length;
            Iterator it = iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i10 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArr2 = Arrays.copyOf(objArr2, i11);
                    length = i11;
                }
                objArr2[i10] = next;
                i10++;
            }
            if (objArr != objArr2 || i10 >= length) {
                return i10 == length ? objArr2 : Arrays.copyOf(objArr2, i10);
            }
            objArr2[i10] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
