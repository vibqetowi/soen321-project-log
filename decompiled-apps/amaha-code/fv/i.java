package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: SequenceBuilder.kt */
/* loaded from: classes2.dex */
public final class i<T> extends j<T> implements Iterator<T>, ls.d<hs.k>, ts.a, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f15979u;

    /* renamed from: v  reason: collision with root package name */
    public T f15980v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator<? extends T> f15981w;

    /* renamed from: x  reason: collision with root package name */
    public ls.d<? super hs.k> f15982x;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fv.j
    public final void b(Object obj, ls.d frame) {
        this.f15980v = obj;
        this.f15979u = 3;
        this.f15982x = frame;
        kotlin.jvm.internal.i.g(frame, "frame");
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // fv.j
    public final Object g(java.util.Iterator<? extends T> it, ls.d<? super hs.k> frame) {
        if (!it.hasNext()) {
            return hs.k.f19476a;
        }
        this.f15981w = it;
        this.f15979u = 2;
        this.f15982x = frame;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        kotlin.jvm.internal.i.g(frame, "frame");
        return aVar;
    }

    @Override // ls.d
    public final ls.f getContext() {
        return ls.g.f24521u;
    }

    public final RuntimeException h() {
        int i6 = this.f15979u;
        if (i6 != 4) {
            if (i6 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f15979u);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i6 = this.f15979u;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        return true;
                    }
                    if (i6 == 4) {
                        return false;
                    }
                    throw h();
                }
                java.util.Iterator<? extends T> it = this.f15981w;
                kotlin.jvm.internal.i.d(it);
                if (it.hasNext()) {
                    this.f15979u = 2;
                    return true;
                }
                this.f15981w = null;
            }
            this.f15979u = 5;
            ls.d<? super hs.k> dVar = this.f15982x;
            kotlin.jvm.internal.i.d(dVar);
            this.f15982x = null;
            dVar.resumeWith(hs.k.f19476a);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        int i6 = this.f15979u;
        if (i6 != 0 && i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    this.f15979u = 0;
                    T t3 = this.f15980v;
                    this.f15980v = null;
                    return t3;
                }
                throw h();
            }
            this.f15979u = 1;
            java.util.Iterator<? extends T> it = this.f15981w;
            kotlin.jvm.internal.i.d(it);
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ls.d
    public final void resumeWith(Object obj) {
        sp.b.d0(obj);
        this.f15979u = 4;
    }
}
