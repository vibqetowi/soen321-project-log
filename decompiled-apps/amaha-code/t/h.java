package t;

import java.util.ConcurrentModificationException;
import java.util.Map;
import tr.r;
/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class h<K, V> {
    public static int A;

    /* renamed from: x  reason: collision with root package name */
    public static Object[] f32255x;

    /* renamed from: y  reason: collision with root package name */
    public static int f32256y;

    /* renamed from: z  reason: collision with root package name */
    public static Object[] f32257z;

    /* renamed from: u  reason: collision with root package name */
    public int[] f32258u;

    /* renamed from: v  reason: collision with root package name */
    public Object[] f32259v;

    /* renamed from: w  reason: collision with root package name */
    public int f32260w;

    public h() {
        this.f32258u = r.f33556o0;
        this.f32259v = r.f33558q0;
        this.f32260w = 0;
    }

    private void a(int i6) {
        if (i6 == 8) {
            synchronized (h.class) {
                Object[] objArr = f32257z;
                if (objArr != null) {
                    this.f32259v = objArr;
                    f32257z = (Object[]) objArr[0];
                    this.f32258u = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A--;
                    return;
                }
            }
        } else if (i6 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f32255x;
                if (objArr2 != null) {
                    this.f32259v = objArr2;
                    f32255x = (Object[]) objArr2[0];
                    this.f32258u = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f32256y--;
                    return;
                }
            }
        }
        this.f32258u = new int[i6];
        this.f32259v = new Object[i6 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (A < 10) {
                    objArr[0] = f32257z;
                    objArr[1] = iArr;
                    for (int i10 = (i6 << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f32257z = objArr;
                    A++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f32256y < 10) {
                    objArr[0] = f32255x;
                    objArr[1] = iArr;
                    for (int i11 = (i6 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f32255x = objArr;
                    f32256y++;
                }
            }
        }
    }

    public final void b(int i6) {
        int i10 = this.f32260w;
        int[] iArr = this.f32258u;
        if (iArr.length < i6) {
            Object[] objArr = this.f32259v;
            a(i6);
            if (this.f32260w > 0) {
                System.arraycopy(iArr, 0, this.f32258u, 0, i10);
                System.arraycopy(objArr, 0, this.f32259v, 0, i10 << 1);
            }
            c(iArr, objArr, i10);
        }
        if (this.f32260w == i10) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i6 = this.f32260w;
        if (i6 > 0) {
            int[] iArr = this.f32258u;
            Object[] objArr = this.f32259v;
            this.f32258u = r.f33556o0;
            this.f32259v = r.f33558q0;
            this.f32260w = 0;
            c(iArr, objArr, i6);
        }
        if (this.f32260w <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i6, Object obj) {
        int i10 = this.f32260w;
        if (i10 == 0) {
            return -1;
        }
        try {
            int j10 = r.j(i10, i6, this.f32258u);
            if (j10 < 0) {
                return j10;
            }
            if (obj.equals(this.f32259v[j10 << 1])) {
                return j10;
            }
            int i11 = j10 + 1;
            while (i11 < i10 && this.f32258u[i11] == i6) {
                if (obj.equals(this.f32259v[i11 << 1])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = j10 - 1; i12 >= 0 && this.f32258u[i12] == i6; i12--) {
                if (obj.equals(this.f32259v[i12 << 1])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f32260w != hVar.f32260w) {
                return false;
            }
            for (int i6 = 0; i6 < this.f32260w; i6++) {
                try {
                    K i10 = i(i6);
                    V m10 = m(i6);
                    Object orDefault = hVar.getOrDefault(i10, null);
                    if (m10 == null) {
                        if (orDefault != null || !hVar.containsKey(i10)) {
                            return false;
                        }
                    } else if (!m10.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f32260w != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f32260w; i11++) {
                try {
                    K i12 = i(i11);
                    V m11 = m(i11);
                    Object obj2 = map.get(i12);
                    if (m11 == null) {
                        if (obj2 != null || !map.containsKey(i12)) {
                            return false;
                        }
                    } else if (!m11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        if (obj == null) {
            return g();
        }
        return d(obj.hashCode(), obj);
    }

    public final int g() {
        int i6 = this.f32260w;
        if (i6 == 0) {
            return -1;
        }
        try {
            int j10 = r.j(i6, 0, this.f32258u);
            if (j10 < 0) {
                return j10;
            }
            if (this.f32259v[j10 << 1] == null) {
                return j10;
            }
            int i10 = j10 + 1;
            while (i10 < i6 && this.f32258u[i10] == 0) {
                if (this.f32259v[i10 << 1] == null) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = j10 - 1; i11 >= 0 && this.f32258u[i11] == 0; i11--) {
                if (this.f32259v[i11 << 1] == null) {
                    return i11;
                }
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int f = f(obj);
        if (f >= 0) {
            return (V) this.f32259v[(f << 1) + 1];
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h(Object obj) {
        int i6 = this.f32260w * 2;
        Object[] objArr = this.f32259v;
        if (obj == null) {
            for (int i10 = 1; i10 < i6; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i6; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f32258u;
        Object[] objArr = this.f32259v;
        int i6 = this.f32260w;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i6) {
            Object obj = objArr[i10];
            int i13 = iArr[i11];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i12 += hashCode ^ i13;
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final K i(int i6) {
        return (K) this.f32259v[i6 << 1];
    }

    public final boolean isEmpty() {
        if (this.f32260w <= 0) {
            return true;
        }
        return false;
    }

    public void j(b bVar) {
        int i6 = bVar.f32260w;
        b(this.f32260w + i6);
        if (this.f32260w == 0) {
            if (i6 > 0) {
                System.arraycopy(bVar.f32258u, 0, this.f32258u, 0, i6);
                System.arraycopy(bVar.f32259v, 0, this.f32259v, 0, i6 << 1);
                this.f32260w = i6;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            put(bVar.i(i10), bVar.m(i10));
        }
    }

    public V k(int i6) {
        Object[] objArr = this.f32259v;
        int i10 = i6 << 1;
        V v10 = (V) objArr[i10 + 1];
        int i11 = this.f32260w;
        int i12 = 0;
        if (i11 <= 1) {
            c(this.f32258u, objArr, i11);
            this.f32258u = r.f33556o0;
            this.f32259v = r.f33558q0;
        } else {
            int i13 = i11 - 1;
            int[] iArr = this.f32258u;
            int i14 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i14 = i11 + (i11 >> 1);
                }
                a(i14);
                if (i11 == this.f32260w) {
                    if (i6 > 0) {
                        System.arraycopy(iArr, 0, this.f32258u, 0, i6);
                        System.arraycopy(objArr, 0, this.f32259v, 0, i10);
                    }
                    if (i6 < i13) {
                        int i15 = i6 + 1;
                        int i16 = i13 - i6;
                        System.arraycopy(iArr, i15, this.f32258u, i6, i16);
                        System.arraycopy(objArr, i15 << 1, this.f32259v, i10, i16 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i6 < i13) {
                    int i17 = i6 + 1;
                    int i18 = i13 - i6;
                    System.arraycopy(iArr, i17, iArr, i6, i18);
                    Object[] objArr2 = this.f32259v;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i10, i18 << 1);
                }
                Object[] objArr3 = this.f32259v;
                int i19 = i13 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            i12 = i13;
        }
        if (i11 == this.f32260w) {
            this.f32260w = i12;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i6, V v10) {
        int i10 = (i6 << 1) + 1;
        Object[] objArr = this.f32259v;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }

    public final V m(int i6) {
        return (V) this.f32259v[(i6 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i6;
        int d10;
        int i10 = this.f32260w;
        if (k10 == null) {
            d10 = g();
            i6 = 0;
        } else {
            int hashCode = k10.hashCode();
            i6 = hashCode;
            d10 = d(hashCode, k10);
        }
        if (d10 >= 0) {
            int i11 = (d10 << 1) + 1;
            Object[] objArr = this.f32259v;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~d10;
        int[] iArr = this.f32258u;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            Object[] objArr2 = this.f32259v;
            a(i13);
            if (i10 == this.f32260w) {
                int[] iArr2 = this.f32258u;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f32259v, 0, objArr2.length);
                }
                c(iArr, objArr2, i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr3 = this.f32258u;
            int i14 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i14, i10 - i12);
            Object[] objArr3 = this.f32259v;
            System.arraycopy(objArr3, i12 << 1, objArr3, i14 << 1, (this.f32260w - i12) << 1);
        }
        int i15 = this.f32260w;
        if (i10 == i15) {
            int[] iArr4 = this.f32258u;
            if (i12 < iArr4.length) {
                iArr4[i12] = i6;
                Object[] objArr4 = this.f32259v;
                int i16 = i12 << 1;
                objArr4[i16] = k10;
                objArr4[i16 + 1] = v10;
                this.f32260w = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        if (orDefault == null) {
            return put(k10, v10);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return k(f);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int f = f(k10);
        if (f >= 0) {
            return l(f, v10);
        }
        return null;
    }

    public final int size() {
        return this.f32260w;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f32260w * 28);
        sb2.append('{');
        for (int i6 = 0; i6 < this.f32260w; i6++) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            K i10 = i(i6);
            if (i10 != this) {
                sb2.append(i10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m10 = m(i6);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            V m10 = m(f);
            if (obj2 == m10 || (obj2 != null && obj2.equals(m10))) {
                k(f);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int f = f(k10);
        if (f >= 0) {
            V m10 = m(f);
            if (m10 == v10 || (v10 != null && v10.equals(m10))) {
                l(f, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public h(int i6) {
        if (i6 == 0) {
            this.f32258u = r.f33556o0;
            this.f32259v = r.f33558q0;
        } else {
            a(i6);
        }
        this.f32260w = 0;
    }
}
