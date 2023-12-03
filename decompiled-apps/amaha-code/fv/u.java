package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class u<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f15991a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<T, Boolean> f15992b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<T> f15993u;

        /* renamed from: v  reason: collision with root package name */
        public int f15994v = -1;

        /* renamed from: w  reason: collision with root package name */
        public T f15995w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u<T> f15996x;

        public a(u<T> uVar) {
            this.f15996x = uVar;
            this.f15993u = uVar.f15991a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f15993u;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f15996x.f15992b.invoke(next).booleanValue()) {
                    this.f15994v = 1;
                    this.f15995w = next;
                    return;
                }
            }
            this.f15994v = 0;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f15994v == -1) {
                a();
            }
            if (this.f15994v == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f15994v == -1) {
                a();
            }
            if (this.f15994v != 0) {
                T t3 = this.f15995w;
                this.f15995w = null;
                this.f15994v = -1;
                return t3;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(h<? extends T> sequence, ss.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.i.g(sequence, "sequence");
        kotlin.jvm.internal.i.g(predicate, "predicate");
        this.f15991a = sequence;
        this.f15992b = predicate;
    }

    @Override // fv.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
