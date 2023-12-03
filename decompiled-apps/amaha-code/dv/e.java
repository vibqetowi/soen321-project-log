package dv;

import is.b0;
import is.k;
import j$.util.Iterator;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
/* compiled from: SmartSet.kt */
/* loaded from: classes2.dex */
public final class e<T> extends AbstractSet<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f13520w = 0;

    /* renamed from: u  reason: collision with root package name */
    public Object f13521u;

    /* renamed from: v  reason: collision with root package name */
    public int f13522v;

    /* compiled from: SmartSet.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final b0 f13523u;

        public a(T[] tArr) {
            this.f13523u = h.N(tArr);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f13523u.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            return (T) this.f13523u.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements java.util.Iterator<T>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public final T f13524u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f13525v = true;

        public b(T t3) {
            this.f13524u = t3;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f13525v;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.f13525v) {
                this.f13525v = false;
                return this.f13524u;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t3) {
        Object[] objArr;
        int i6 = this.f13522v;
        if (i6 == 0) {
            this.f13521u = t3;
        } else if (i6 == 1) {
            if (i.b(this.f13521u, t3)) {
                return false;
            }
            this.f13521u = new Object[]{this.f13521u, t3};
        } else if (i6 < 5) {
            Object obj = this.f13521u;
            i.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (k.Q1(t3, objArr2)) {
                return false;
            }
            int i10 = this.f13522v;
            if (i10 == 4) {
                Object[] elements = Arrays.copyOf(objArr2, objArr2.length);
                i.g(elements, "elements");
                ?? linkedHashSet = new LinkedHashSet(sp.b.P(elements.length));
                k.h2(linkedHashSet, elements);
                linkedHashSet.add(t3);
                objArr = linkedHashSet;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, i10 + 1);
                i.f(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t3;
                objArr = copyOf;
            }
            this.f13521u = objArr;
        } else {
            Object obj2 = this.f13521u;
            i.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!c0.d(obj2).add(t3)) {
                return false;
            }
        }
        this.f13522v++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13521u = null;
        this.f13522v = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i6 = this.f13522v;
        if (i6 == 0) {
            return false;
        }
        if (i6 == 1) {
            return i.b(this.f13521u, obj);
        }
        if (i6 < 5) {
            Object obj2 = this.f13521u;
            i.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return k.Q1(obj, (Object[]) obj2);
        }
        Object obj3 = this.f13521u;
        i.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<T> iterator() {
        int i6 = this.f13522v;
        if (i6 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i6 == 1) {
            return new b(this.f13521u);
        }
        if (i6 < 5) {
            Object obj = this.f13521u;
            i.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f13521u;
        i.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return c0.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13522v;
    }
}
