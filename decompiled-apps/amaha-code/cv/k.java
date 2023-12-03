package cv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class k extends b {

    /* renamed from: u  reason: collision with root package name */
    public static final k f12069u = new k();

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator, ts.a, j$.util.Iterator {
        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // cv.b
    public final int g() {
        return 0;
    }

    @Override // cv.b
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        return null;
    }

    @Override // cv.b, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new a();
    }

    @Override // cv.b
    public final void m(int i6, Object obj) {
        Void r22 = (Void) obj;
        throw new IllegalStateException();
    }
}
