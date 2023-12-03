package t;

import tr.r;
/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public final class i<E> implements Cloneable {

    /* renamed from: y  reason: collision with root package name */
    public static final Object f32261y = new Object();

    /* renamed from: u  reason: collision with root package name */
    public boolean f32262u = false;

    /* renamed from: v  reason: collision with root package name */
    public int[] f32263v;

    /* renamed from: w  reason: collision with root package name */
    public Object[] f32264w;

    /* renamed from: x  reason: collision with root package name */
    public int f32265x;

    public i() {
        int i6;
        int i10 = 4;
        while (true) {
            i6 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i6 = i11;
                break;
            }
            i10++;
        }
        int i12 = i6 / 4;
        this.f32263v = new int[i12];
        this.f32264w = new Object[i12];
    }

    public final void a(int i6, E e10) {
        int i10 = this.f32265x;
        if (i10 != 0 && i6 <= this.f32263v[i10 - 1]) {
            e(i6, e10);
            return;
        }
        if (this.f32262u && i10 >= this.f32263v.length) {
            c();
        }
        int i11 = this.f32265x;
        if (i11 >= this.f32263v.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f32263v;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f32264w;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f32263v = iArr;
            this.f32264w = objArr;
        }
        this.f32263v[i11] = i6;
        this.f32264w[i11] = e10;
        this.f32265x = i11 + 1;
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f32263v = (int[]) this.f32263v.clone();
            iVar.f32264w = (Object[]) this.f32264w.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i6 = this.f32265x;
        int[] iArr = this.f32263v;
        Object[] objArr = this.f32264w;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            Object obj = objArr[i11];
            if (obj != f32261y) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f32262u = false;
        this.f32265x = i10;
    }

    public final Object d(int i6, Integer num) {
        Object obj;
        int j10 = r.j(this.f32265x, i6, this.f32263v);
        if (j10 >= 0 && (obj = this.f32264w[j10]) != f32261y) {
            return obj;
        }
        return num;
    }

    public final void e(int i6, E e10) {
        int j10 = r.j(this.f32265x, i6, this.f32263v);
        if (j10 >= 0) {
            this.f32264w[j10] = e10;
            return;
        }
        int i10 = ~j10;
        int i11 = this.f32265x;
        if (i10 < i11) {
            Object[] objArr = this.f32264w;
            if (objArr[i10] == f32261y) {
                this.f32263v[i10] = i6;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f32262u && i11 >= this.f32263v.length) {
            c();
            i10 = ~r.j(this.f32265x, i6, this.f32263v);
        }
        int i12 = this.f32265x;
        if (i12 >= this.f32263v.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f32263v;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f32264w;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f32263v = iArr;
            this.f32264w = objArr2;
        }
        int i17 = this.f32265x - i10;
        if (i17 != 0) {
            int[] iArr3 = this.f32263v;
            int i18 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i18, i17);
            Object[] objArr4 = this.f32264w;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f32265x - i10);
        }
        this.f32263v[i10] = i6;
        this.f32264w[i10] = e10;
        this.f32265x++;
    }

    public final int f() {
        if (this.f32262u) {
            c();
        }
        return this.f32265x;
    }

    public final E h(int i6) {
        if (this.f32262u) {
            c();
        }
        return (E) this.f32264w[i6];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f32265x * 28);
        sb2.append('{');
        for (int i6 = 0; i6 < this.f32265x; i6++) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            if (this.f32262u) {
                c();
            }
            sb2.append(this.f32263v[i6]);
            sb2.append('=');
            E h10 = h(i6);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
