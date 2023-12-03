package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class g<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ss.a<T> f15974a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<T, T> f15975b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public T f15976u;

        /* renamed from: v  reason: collision with root package name */
        public int f15977v = -2;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g<T> f15978w;

        public a(g<T> gVar) {
            this.f15978w = gVar;
        }

        public final void a() {
            T invoke;
            int i6;
            int i10 = this.f15977v;
            g<T> gVar = this.f15978w;
            if (i10 == -2) {
                invoke = gVar.f15974a.invoke();
            } else {
                ss.l<T, T> lVar = gVar.f15975b;
                T t3 = this.f15976u;
                kotlin.jvm.internal.i.d(t3);
                invoke = lVar.invoke(t3);
            }
            this.f15976u = invoke;
            if (invoke == null) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            this.f15977v = i6;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f15977v < 0) {
                a();
            }
            if (this.f15977v == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f15977v < 0) {
                a();
            }
            if (this.f15977v != 0) {
                T t3 = this.f15976u;
                kotlin.jvm.internal.i.e(t3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f15977v = -1;
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
    public g(ss.a<? extends T> aVar, ss.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.i.g(getNextValue, "getNextValue");
        this.f15974a = aVar;
        this.f15975b = getNextValue;
    }

    @Override // fv.h
    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
