package t;

import tr.r;
/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public final class e<E> implements Cloneable {

    /* renamed from: y  reason: collision with root package name */
    public static final Object f32230y = new Object();

    /* renamed from: u  reason: collision with root package name */
    public boolean f32231u;

    /* renamed from: v  reason: collision with root package name */
    public long[] f32232v;

    /* renamed from: w  reason: collision with root package name */
    public Object[] f32233w;

    /* renamed from: x  reason: collision with root package name */
    public int f32234x;

    public e() {
        this(10);
    }

    public final void a(long j10, Long l2) {
        int i6 = this.f32234x;
        if (i6 != 0 && j10 <= this.f32232v[i6 - 1]) {
            h(j10, l2);
            return;
        }
        if (this.f32231u && i6 >= this.f32232v.length) {
            d();
        }
        int i10 = this.f32234x;
        if (i10 >= this.f32232v.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] jArr = new long[i14];
            Object[] objArr = new Object[i14];
            long[] jArr2 = this.f32232v;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f32233w;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f32232v = jArr;
            this.f32233w = objArr;
        }
        this.f32232v[i10] = j10;
        this.f32233w[i10] = l2;
        this.f32234x = i10 + 1;
    }

    public final void b() {
        int i6 = this.f32234x;
        Object[] objArr = this.f32233w;
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = null;
        }
        this.f32234x = 0;
        this.f32231u = false;
    }

    /* renamed from: c */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f32232v = (long[]) this.f32232v.clone();
            eVar.f32233w = (Object[]) this.f32233w.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i6 = this.f32234x;
        long[] jArr = this.f32232v;
        Object[] objArr = this.f32233w;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            Object obj = objArr[i11];
            if (obj != f32230y) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f32231u = false;
        this.f32234x = i10;
    }

    public final Object e(long j10, Long l2) {
        Object obj;
        int k10 = r.k(this.f32232v, this.f32234x, j10);
        if (k10 >= 0 && (obj = this.f32233w[k10]) != f32230y) {
            return obj;
        }
        return l2;
    }

    public final long f(int i6) {
        if (this.f32231u) {
            d();
        }
        return this.f32232v[i6];
    }

    public final void h(long j10, E e10) {
        int k10 = r.k(this.f32232v, this.f32234x, j10);
        if (k10 >= 0) {
            this.f32233w[k10] = e10;
            return;
        }
        int i6 = ~k10;
        int i10 = this.f32234x;
        if (i6 < i10) {
            Object[] objArr = this.f32233w;
            if (objArr[i6] == f32230y) {
                this.f32232v[i6] = j10;
                objArr[i6] = e10;
                return;
            }
        }
        if (this.f32231u && i10 >= this.f32232v.length) {
            d();
            i6 = ~r.k(this.f32232v, this.f32234x, j10);
        }
        int i11 = this.f32234x;
        if (i11 >= this.f32232v.length) {
            int i12 = (i11 + 1) * 8;
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
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr2 = new Object[i15];
            long[] jArr2 = this.f32232v;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f32233w;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f32232v = jArr;
            this.f32233w = objArr2;
        }
        int i16 = this.f32234x - i6;
        if (i16 != 0) {
            long[] jArr3 = this.f32232v;
            int i17 = i6 + 1;
            System.arraycopy(jArr3, i6, jArr3, i17, i16);
            Object[] objArr4 = this.f32233w;
            System.arraycopy(objArr4, i6, objArr4, i17, this.f32234x - i6);
        }
        this.f32232v[i6] = j10;
        this.f32233w[i6] = e10;
        this.f32234x++;
    }

    public final void i(long j10) {
        int k10 = r.k(this.f32232v, this.f32234x, j10);
        if (k10 >= 0) {
            Object[] objArr = this.f32233w;
            Object obj = objArr[k10];
            Object obj2 = f32230y;
            if (obj != obj2) {
                objArr[k10] = obj2;
                this.f32231u = true;
            }
        }
    }

    public final int j() {
        if (this.f32231u) {
            d();
        }
        return this.f32234x;
    }

    public final E k(int i6) {
        if (this.f32231u) {
            d();
        }
        return (E) this.f32233w[i6];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f32234x * 28);
        sb2.append('{');
        for (int i6 = 0; i6 < this.f32234x; i6++) {
            if (i6 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i6));
            sb2.append('=');
            E k10 = k(i6);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i6) {
        this.f32231u = false;
        if (i6 == 0) {
            this.f32232v = r.f33557p0;
            this.f32233w = r.f33558q0;
            return;
        }
        int i10 = i6 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f32232v = new long[i13];
        this.f32233w = new Object[i13];
    }
}
