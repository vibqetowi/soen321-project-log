package is;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: AbstractIterator.kt */
/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, ts.a, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f20638u = 2;

    /* renamed from: v  reason: collision with root package name */
    public T f20639v;

    public abstract void a();

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        int i6 = this.f20638u;
        if (i6 != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int d10 = v.h.d(i6);
            if (d10 != 0) {
                if (d10 == 2) {
                    return false;
                }
                this.f20638u = 4;
                a();
                if (this.f20638u != 1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f20638u = 2;
            return this.f20639v;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
