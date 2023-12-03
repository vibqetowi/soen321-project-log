package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class f<T, R, E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f15968a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<T, R> f15969b;

    /* renamed from: c  reason: collision with root package name */
    public final ss.l<R, Iterator<E>> f15970c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<E>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<T> f15971u;

        /* renamed from: v  reason: collision with root package name */
        public Iterator<? extends E> f15972v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f<T, R, E> f15973w;

        public a(f<T, R, E> fVar) {
            this.f15973w = fVar;
            this.f15971u = fVar.f15968a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a() {
            boolean z10;
            Iterator<? extends E> it = this.f15972v;
            if (it != null && !it.hasNext()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f15972v = null;
            }
            while (true) {
                if (this.f15972v != null) {
                    break;
                }
                Iterator<T> it2 = this.f15971u;
                if (!it2.hasNext()) {
                    return false;
                }
                T next = it2.next();
                f<T, R, E> fVar = this.f15973w;
                Iterator<E> invoke = fVar.f15970c.invoke(fVar.f15969b.invoke(next));
                if (invoke.hasNext()) {
                    this.f15972v = invoke;
                    break;
                }
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (a()) {
                java.util.Iterator<? extends E> it = this.f15972v;
                kotlin.jvm.internal.i.d(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> sequence, ss.l<? super T, ? extends R> transformer, ss.l<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.i.g(sequence, "sequence");
        kotlin.jvm.internal.i.g(transformer, "transformer");
        kotlin.jvm.internal.i.g(iterator, "iterator");
        this.f15968a = sequence;
        this.f15969b = transformer;
        this.f15970c = iterator;
    }

    @Override // fv.h
    public final java.util.Iterator<E> iterator() {
        return new a(this);
    }
}
