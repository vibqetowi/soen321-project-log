package ev;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: ConsPStack.java */
/* loaded from: classes2.dex */
public final class a<E> implements Iterable<E> {

    /* renamed from: x  reason: collision with root package name */
    public static final a<Object> f14569x = new a<>();

    /* renamed from: u  reason: collision with root package name */
    public final E f14570u;

    /* renamed from: v  reason: collision with root package name */
    public final a<E> f14571v;

    /* renamed from: w  reason: collision with root package name */
    public final int f14572w;

    /* compiled from: ConsPStack.java */
    /* renamed from: ev.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0225a<E> implements Iterator<E>, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public a<E> f14573u;

        public C0225a(a<E> aVar) {
            this.f14573u = aVar;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f14573u.f14572w > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            a<E> aVar = this.f14573u;
            E e10 = aVar.f14570u;
            this.f14573u = aVar.f14571v;
            return e10;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a() {
        this.f14572w = 0;
        this.f14570u = null;
        this.f14571v = null;
    }

    public final a<E> e(Object obj) {
        if (this.f14572w == 0) {
            return this;
        }
        E e10 = this.f14570u;
        boolean equals = e10.equals(obj);
        a<E> aVar = this.f14571v;
        if (equals) {
            return aVar;
        }
        a<E> e11 = aVar.e(obj);
        if (e11 == aVar) {
            return this;
        }
        return new a<>(e10, e11);
    }

    public final a<E> g(int i6) {
        if (i6 >= 0 && i6 <= this.f14572w) {
            if (i6 == 0) {
                return this;
            }
            return this.f14571v.g(i6 - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new C0225a(g(0));
    }

    public a(E e10, a<E> aVar) {
        this.f14570u = e10;
        this.f14571v = aVar;
        this.f14572w = aVar.f14572w + 1;
    }
}
