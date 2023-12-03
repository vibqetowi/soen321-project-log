package is;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Iterators.kt */
/* loaded from: classes2.dex */
public final class b0 implements Iterator, ts.a, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20640u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f20641v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f20642w;

    public b0(Iterator iterator) {
        kotlin.jvm.internal.i.g(iterator, "iterator");
        this.f20642w = iterator;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f20640u) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f20640u;
        Object obj = this.f20642w;
        switch (i6) {
            case 0:
                return ((java.util.Iterator) obj).hasNext();
            default:
                if (this.f20641v < ((Object[]) obj).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i6 = this.f20640u;
        Object obj = this.f20642w;
        switch (i6) {
            case 0:
                int i10 = this.f20641v;
                this.f20641v = i10 + 1;
                if (i10 >= 0) {
                    return new z(i10, ((java.util.Iterator) obj).next());
                }
                ca.a.t1();
                throw null;
            default:
                try {
                    int i11 = this.f20641v;
                    this.f20641v = i11 + 1;
                    return ((Object[]) obj)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f20641v--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.f20640u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(Object[] array) {
        kotlin.jvm.internal.i.g(array, "array");
        this.f20642w = array;
    }
}
