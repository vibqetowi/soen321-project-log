package is;

import java.util.Collection;
/* compiled from: AbstractCollection.kt */
/* loaded from: classes2.dex */
public abstract class a<E> implements Collection<E>, ts.a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: is.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0317a extends kotlin.jvm.internal.k implements ss.l<E, CharSequence> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a<E> f20636u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0317a(a<? extends E> aVar) {
            super(1);
            this.f20636u = aVar;
        }

        @Override // ss.l
        public final CharSequence invoke(Object obj) {
            if (obj == this.f20636u) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (E e11 : this) {
            if (kotlin.jvm.internal.i.b(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int g();

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kc.f.Y(this);
    }

    public final String toString() {
        return u.m2(this, ", ", "[", "]", new C0317a(this), 24);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.g(array, "array");
        return (T[]) kc.f.Z(this, array);
    }
}
