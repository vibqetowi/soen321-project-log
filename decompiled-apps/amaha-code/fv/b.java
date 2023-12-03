package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f15956a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15957b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<T> f15958u;

        /* renamed from: v  reason: collision with root package name */
        public int f15959v;

        public a(b<T> bVar) {
            this.f15958u = bVar.f15956a.iterator();
            this.f15959v = bVar.f15957b;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            java.util.Iterator<T> it;
            while (true) {
                int i6 = this.f15959v;
                it = this.f15958u;
                if (i6 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f15959v--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            java.util.Iterator<T> it;
            while (true) {
                int i6 = this.f15959v;
                it = this.f15958u;
                if (i6 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f15959v--;
            }
            return it.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> sequence, int i6) {
        boolean z10;
        kotlin.jvm.internal.i.g(sequence, "sequence");
        this.f15956a = sequence;
        this.f15957b = i6;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i6 + '.').toString());
    }

    @Override // fv.c
    public final h<T> a(int i6) {
        int i10 = this.f15957b + i6;
        if (i10 < 0) {
            return new b(this, i6);
        }
        return new b(this.f15956a, i10);
    }

    @Override // fv.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
