package is;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
/* compiled from: SlidingWindow.kt */
/* loaded from: classes2.dex */
public final class g0<T> extends c<T> implements RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public final Object[] f20656u;

    /* renamed from: v  reason: collision with root package name */
    public final int f20657v;

    /* renamed from: w  reason: collision with root package name */
    public int f20658w;

    /* renamed from: x  reason: collision with root package name */
    public int f20659x;

    /* compiled from: SlidingWindow.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b<T> {

        /* renamed from: w  reason: collision with root package name */
        public int f20660w;

        /* renamed from: x  reason: collision with root package name */
        public int f20661x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g0<T> f20662y;

        public a(g0<T> g0Var) {
            this.f20662y = g0Var;
            this.f20660w = g0Var.g();
            this.f20661x = g0Var.f20658w;
        }

        @Override // is.b
        public final void a() {
            int i6 = this.f20660w;
            if (i6 == 0) {
                this.f20638u = 3;
                return;
            }
            g0<T> g0Var = this.f20662y;
            Object[] objArr = g0Var.f20656u;
            int i10 = this.f20661x;
            this.f20639v = (T) objArr[i10];
            this.f20638u = 1;
            this.f20661x = (i10 + 1) % g0Var.f20657v;
            this.f20660w = i6 - 1;
        }
    }

    public g0(int i6, Object[] objArr) {
        boolean z10;
        this.f20656u = objArr;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 <= objArr.length) {
                this.f20657v = objArr.length;
                this.f20659x = i6;
                return;
            }
            StringBuilder u10 = defpackage.c.u("ring buffer filled size: ", i6, " cannot be larger than the buffer size: ");
            u10.append(objArr.length);
            throw new IllegalArgumentException(u10.toString().toString());
        }
        throw new IllegalArgumentException(defpackage.c.p("ring buffer filled size should not be negative but it is ", i6).toString());
    }

    @Override // is.a
    public final int g() {
        return this.f20659x;
    }

    @Override // is.c, java.util.List
    public final T get(int i6) {
        int g5 = g();
        if (i6 >= 0 && i6 < g5) {
            return (T) this.f20656u[(this.f20658w + i6) % this.f20657v];
        }
        throw new IndexOutOfBoundsException(defpackage.b.j("index: ", i6, ", size: ", g5));
    }

    @Override // is.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    public final void m(int i6) {
        boolean z10;
        boolean z11 = true;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 > this.f20659x) {
                z11 = false;
            }
            if (z11) {
                if (i6 > 0) {
                    int i10 = this.f20658w;
                    int i11 = this.f20657v;
                    int i12 = (i10 + i6) % i11;
                    Object[] objArr = this.f20656u;
                    if (i10 > i12) {
                        i.M1(objArr, i10, i11);
                        i.M1(objArr, 0, i12);
                    } else {
                        i.M1(objArr, i10, i12);
                    }
                    this.f20658w = i12;
                    this.f20659x -= i6;
                    return;
                }
                return;
            }
            StringBuilder u10 = defpackage.c.u("n shouldn't be greater than the buffer size: n = ", i6, ", size = ");
            u10.append(this.f20659x);
            throw new IllegalArgumentException(u10.toString().toString());
        }
        throw new IllegalArgumentException(defpackage.c.p("n shouldn't be negative but it is ", i6).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // is.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // is.a, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.g(array, "array");
        if (array.length < g()) {
            array = (T[]) Arrays.copyOf(array, g());
            kotlin.jvm.internal.i.f(array, "copyOf(this, newSize)");
        }
        int g5 = g();
        int i6 = this.f20658w;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr = this.f20656u;
            if (i11 >= g5 || i6 >= this.f20657v) {
                break;
            }
            array[i11] = objArr[i6];
            i11++;
            i6++;
        }
        while (i11 < g5) {
            array[i11] = objArr[i10];
            i11++;
            i10++;
        }
        if (array.length > g()) {
            array[g()] = null;
        }
        return array;
    }
}
