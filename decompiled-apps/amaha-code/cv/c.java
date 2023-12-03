package cv;

import java.util.Arrays;
import java.util.Iterator;
/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class c<T> extends b<T> {

    /* renamed from: u  reason: collision with root package name */
    public Object[] f12053u = new Object[20];

    /* renamed from: v  reason: collision with root package name */
    public int f12054v = 0;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a extends is.b<T> {

        /* renamed from: w  reason: collision with root package name */
        public int f12055w = -1;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c<T> f12056x;

        public a(c<T> cVar) {
            this.f12056x = cVar;
        }

        @Override // is.b
        public final void a() {
            int i6;
            Object[] objArr;
            do {
                i6 = this.f12055w + 1;
                this.f12055w = i6;
                objArr = this.f12056x.f12053u;
                if (i6 >= objArr.length) {
                    break;
                }
            } while (objArr[i6] == null);
            if (i6 >= objArr.length) {
                this.f20638u = 3;
                return;
            }
            T t3 = (T) objArr[i6];
            kotlin.jvm.internal.i.e(t3, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.f20639v = t3;
            this.f20638u = 1;
        }
    }

    @Override // cv.b
    public final int g() {
        return this.f12054v;
    }

    @Override // cv.b
    public final T get(int i6) {
        return (T) is.k.V1(i6, this.f12053u);
    }

    @Override // cv.b, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // cv.b
    public final void m(int i6, T value) {
        kotlin.jvm.internal.i.g(value, "value");
        Object[] objArr = this.f12053u;
        if (objArr.length <= i6) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            kotlin.jvm.internal.i.f(copyOf, "copyOf(this, newSize)");
            this.f12053u = copyOf;
        }
        Object[] objArr2 = this.f12053u;
        if (objArr2[i6] == null) {
            this.f12054v++;
        }
        objArr2[i6] = value;
    }
}
