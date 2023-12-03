package cv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import wu.t0;
/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class q<T> extends b<T> {

    /* renamed from: u  reason: collision with root package name */
    public final T f12076u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12077v;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public boolean f12078u = true;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q<T> f12079v;

        public a(q<T> qVar) {
            this.f12079v = qVar;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f12078u;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f12078u) {
                this.f12078u = false;
                return this.f12079v.f12076u;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(int i6, t0 t0Var) {
        this.f12076u = t0Var;
        this.f12077v = i6;
    }

    @Override // cv.b
    public final int g() {
        return 1;
    }

    @Override // cv.b
    public final T get(int i6) {
        if (i6 == this.f12077v) {
            return this.f12076u;
        }
        return null;
    }

    @Override // cv.b, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }

    @Override // cv.b
    public final void m(int i6, T t3) {
        throw new IllegalStateException();
    }
}
