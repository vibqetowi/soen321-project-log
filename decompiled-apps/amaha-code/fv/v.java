package fv;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class v<T, R> implements h<R> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f15997a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<T, R> f15998b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final Iterator<T> f15999u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v<T, R> f16000v;

        public a(v<T, R> vVar) {
            this.f16000v = vVar;
            this.f15999u = vVar.f15997a.iterator();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f15999u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final R next() {
            return this.f16000v.f15998b.invoke(this.f15999u.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(h<? extends T> hVar, ss.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.i.g(transformer, "transformer");
        this.f15997a = hVar;
        this.f15998b = transformer;
    }

    @Override // fv.h
    public final java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
