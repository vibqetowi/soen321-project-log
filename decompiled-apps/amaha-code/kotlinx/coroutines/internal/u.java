package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.s0;
/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes2.dex */
public class u<T extends v & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f23624a;

    public final void a(s0.b bVar) {
        bVar.h((s0.c) this);
        T[] tArr = this.f23624a;
        if (tArr == null) {
            tArr = (T[]) new v[4];
            this.f23624a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            kotlin.jvm.internal.i.f(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((v[]) copyOf);
            this.f23624a = tArr;
        }
        int i6 = this._size;
        this._size = i6 + 1;
        tArr[i6] = bVar;
        bVar.f23652v = i6;
        g(i6);
    }

    public final boolean b() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final T c() {
        T t3;
        synchronized (this) {
            T[] tArr = this.f23624a;
            if (tArr != null) {
                t3 = tArr[0];
            } else {
                t3 = null;
            }
        }
        return t3;
    }

    public final void d(v vVar) {
        synchronized (this) {
            if (vVar.f() != null) {
                e(vVar.getIndex());
            }
        }
    }

    public final T e(int i6) {
        T[] tArr = this.f23624a;
        kotlin.jvm.internal.i.d(tArr);
        this._size--;
        if (i6 < this._size) {
            h(i6, this._size);
            int i10 = (i6 - 1) / 2;
            if (i6 > 0) {
                T t3 = tArr[i6];
                kotlin.jvm.internal.i.d(t3);
                T t10 = tArr[i10];
                kotlin.jvm.internal.i.d(t10);
                if (((Comparable) t3).compareTo(t10) < 0) {
                    h(i6, i10);
                    g(i10);
                }
            }
            while (true) {
                int i11 = (i6 * 2) + 1;
                if (i11 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f23624a;
                kotlin.jvm.internal.i.d(tArr2);
                int i12 = i11 + 1;
                if (i12 < this._size) {
                    T t11 = tArr2[i12];
                    kotlin.jvm.internal.i.d(t11);
                    T t12 = tArr2[i11];
                    kotlin.jvm.internal.i.d(t12);
                    if (((Comparable) t11).compareTo(t12) < 0) {
                        i11 = i12;
                    }
                }
                T t13 = tArr2[i6];
                kotlin.jvm.internal.i.d(t13);
                T t14 = tArr2[i11];
                kotlin.jvm.internal.i.d(t14);
                if (((Comparable) t13).compareTo(t14) <= 0) {
                    break;
                }
                h(i6, i11);
                i6 = i11;
            }
        }
        T t15 = tArr[this._size];
        kotlin.jvm.internal.i.d(t15);
        t15.h(null);
        t15.setIndex(-1);
        tArr[this._size] = null;
        return t15;
    }

    public final T f() {
        T t3;
        synchronized (this) {
            if (this._size > 0) {
                t3 = e(0);
            } else {
                t3 = null;
            }
        }
        return t3;
    }

    public final void g(int i6) {
        while (i6 > 0) {
            T[] tArr = this.f23624a;
            kotlin.jvm.internal.i.d(tArr);
            int i10 = (i6 - 1) / 2;
            T t3 = tArr[i10];
            kotlin.jvm.internal.i.d(t3);
            T t10 = tArr[i6];
            kotlin.jvm.internal.i.d(t10);
            if (((Comparable) t3).compareTo(t10) <= 0) {
                return;
            }
            h(i6, i10);
            i6 = i10;
        }
    }

    public final void h(int i6, int i10) {
        T[] tArr = this.f23624a;
        kotlin.jvm.internal.i.d(tArr);
        T t3 = tArr[i10];
        kotlin.jvm.internal.i.d(t3);
        T t10 = tArr[i6];
        kotlin.jvm.internal.i.d(t10);
        tArr[i6] = t3;
        tArr[i10] = t10;
        t3.setIndex(i6);
        t10.setIndex(i10);
    }
}
