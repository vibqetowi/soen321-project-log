package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class e<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f15961a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15962b;

    /* renamed from: c  reason: collision with root package name */
    public final ss.l<T, Boolean> f15963c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<T> f15964u;

        /* renamed from: v  reason: collision with root package name */
        public int f15965v = -1;

        /* renamed from: w  reason: collision with root package name */
        public T f15966w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e<T> f15967x;

        public a(e<T> eVar) {
            this.f15967x = eVar;
            this.f15964u = eVar.f15961a.iterator();
        }

        public final void a() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.f15964u;
                if (it.hasNext()) {
                    next = it.next();
                    eVar = this.f15967x;
                } else {
                    this.f15965v = 0;
                    return;
                }
            } while (eVar.f15963c.invoke(next).booleanValue() != eVar.f15962b);
            this.f15966w = next;
            this.f15965v = 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f15965v == -1) {
                a();
            }
            if (this.f15965v == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f15965v == -1) {
                a();
            }
            if (this.f15965v != 0) {
                T t3 = this.f15966w;
                this.f15966w = null;
                this.f15965v = -1;
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
    public e(h<? extends T> hVar, boolean z10, ss.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.i.g(predicate, "predicate");
        this.f15961a = hVar;
        this.f15962b = z10;
        this.f15963c = predicate;
    }

    @Override // fv.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
