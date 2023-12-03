package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import t.g;
import tr.r;
/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {
    public static Object[] A;
    public static int B;
    public static Object[] C;
    public static int D;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f32224y = new int[0];

    /* renamed from: z  reason: collision with root package name */
    public static final Object[] f32225z = new Object[0];

    /* renamed from: u  reason: collision with root package name */
    public int[] f32226u;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f32227v;

    /* renamed from: w  reason: collision with root package name */
    public int f32228w;

    /* renamed from: x  reason: collision with root package name */
    public c f32229x;

    public d() {
        this(0);
    }

    public static void g(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (D < 10) {
                    objArr[0] = C;
                    objArr[1] = iArr;
                    for (int i10 = i6 - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    C = objArr;
                    D++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (B < 10) {
                    objArr[0] = A;
                    objArr[1] = iArr;
                    for (int i11 = i6 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A = objArr;
                    B++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i6;
        int m10;
        if (e10 == null) {
            m10 = o();
            i6 = 0;
        } else {
            int hashCode = e10.hashCode();
            i6 = hashCode;
            m10 = m(hashCode, e10);
        }
        if (m10 >= 0) {
            return false;
        }
        int i10 = ~m10;
        int i11 = this.f32228w;
        int[] iArr = this.f32226u;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f32227v;
            e(i12);
            int[] iArr2 = this.f32226u;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f32227v, 0, objArr.length);
            }
            g(iArr, objArr, this.f32228w);
        }
        int i13 = this.f32228w;
        if (i10 < i13) {
            int[] iArr3 = this.f32226u;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.f32227v;
            System.arraycopy(objArr2, i10, objArr2, i14, this.f32228w - i10);
        }
        this.f32226u[i10] = i6;
        this.f32227v[i10] = e10;
        this.f32228w++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f32228w;
        int[] iArr = this.f32226u;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f32227v;
            e(size);
            int i6 = this.f32228w;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f32226u, 0, i6);
                System.arraycopy(objArr, 0, this.f32227v, 0, this.f32228w);
            }
            g(iArr, objArr, this.f32228w);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f32228w;
        if (i6 != 0) {
            g(this.f32226u, this.f32227v, i6);
            this.f32226u = f32224y;
            this.f32227v = f32225z;
            this.f32228w = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i6) {
        if (i6 == 8) {
            synchronized (d.class) {
                Object[] objArr = C;
                if (objArr != null) {
                    this.f32227v = objArr;
                    C = (Object[]) objArr[0];
                    this.f32226u = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    D--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = A;
                if (objArr2 != null) {
                    this.f32227v = objArr2;
                    A = (Object[]) objArr2[0];
                    this.f32226u = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    B--;
                    return;
                }
            }
        }
        this.f32226u = new int[i6];
        this.f32227v = new Object[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f32228w != set.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f32228w; i6++) {
                try {
                    if (!set.contains(this.f32227v[i6])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f32226u;
        int i6 = this.f32228w;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return o();
        }
        return m(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f32228w <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f32229x == null) {
            this.f32229x = new c(this);
        }
        c cVar = this.f32229x;
        if (cVar.f32241b == null) {
            cVar.f32241b = new g.c();
        }
        return (Iterator<E>) cVar.f32241b.iterator();
    }

    public final int m(int i6, Object obj) {
        int i10 = this.f32228w;
        if (i10 == 0) {
            return -1;
        }
        int j10 = r.j(i10, i6, this.f32226u);
        if (j10 < 0) {
            return j10;
        }
        if (obj.equals(this.f32227v[j10])) {
            return j10;
        }
        int i11 = j10 + 1;
        while (i11 < i10 && this.f32226u[i11] == i6) {
            if (obj.equals(this.f32227v[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = j10 - 1; i12 >= 0 && this.f32226u[i12] == i6; i12--) {
            if (obj.equals(this.f32227v[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int o() {
        int i6 = this.f32228w;
        if (i6 == 0) {
            return -1;
        }
        int j10 = r.j(i6, 0, this.f32226u);
        if (j10 < 0) {
            return j10;
        }
        if (this.f32227v[j10] == null) {
            return j10;
        }
        int i10 = j10 + 1;
        while (i10 < i6 && this.f32226u[i10] == 0) {
            if (this.f32227v[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = j10 - 1; i11 >= 0 && this.f32226u[i11] == 0; i11--) {
            if (this.f32227v[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final void q(int i6) {
        Object[] objArr = this.f32227v;
        Object obj = objArr[i6];
        int i10 = this.f32228w;
        if (i10 <= 1) {
            g(this.f32226u, objArr, i10);
            this.f32226u = f32224y;
            this.f32227v = f32225z;
            this.f32228w = 0;
            return;
        }
        int[] iArr = this.f32226u;
        int i11 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i11 = i10 + (i10 >> 1);
            }
            e(i11);
            this.f32228w--;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f32226u, 0, i6);
                System.arraycopy(objArr, 0, this.f32227v, 0, i6);
            }
            int i12 = this.f32228w;
            if (i6 < i12) {
                int i13 = i6 + 1;
                System.arraycopy(iArr, i13, this.f32226u, i6, i12 - i6);
                System.arraycopy(objArr, i13, this.f32227v, i6, this.f32228w - i6);
                return;
            }
            return;
        }
        int i14 = i10 - 1;
        this.f32228w = i14;
        if (i6 < i14) {
            int i15 = i6 + 1;
            System.arraycopy(iArr, i15, iArr, i6, i14 - i6);
            Object[] objArr2 = this.f32227v;
            System.arraycopy(objArr2, i15, objArr2, i6, this.f32228w - i6);
        }
        this.f32227v[this.f32228w] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            q(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i6 = this.f32228w - 1; i6 >= 0; i6--) {
            if (!collection.contains(this.f32227v[i6])) {
                q(i6);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f32228w;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i6 = this.f32228w;
        Object[] objArr = new Object[i6];
        System.arraycopy(this.f32227v, 0, objArr, 0, i6);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f32228w * 14);
        sb2.append('{');
        for (int i6 = 0; i6 < this.f32228w; i6++) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f32227v[i6];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i6) {
        if (i6 == 0) {
            this.f32226u = f32224y;
            this.f32227v = f32225z;
        } else {
            e(i6);
        }
        this.f32228w = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f32228w) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f32228w));
        }
        System.arraycopy(this.f32227v, 0, tArr, 0, this.f32228w);
        int length = tArr.length;
        int i6 = this.f32228w;
        if (length > i6) {
            tArr[i6] = null;
        }
        return tArr;
    }
}
