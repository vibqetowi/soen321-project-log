package js;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import js.b;
import kotlin.jvm.internal.i;
/* compiled from: SetBuilder.kt */
/* loaded from: classes2.dex */
public final class g<E> extends is.e<E> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final b<E, ?> f22622u;

    public g(b<E, ?> bVar) {
        this.f22622u = bVar;
    }

    private final Object writeReplace() {
        if (this.f22622u.F) {
            return new e(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        if (this.f22622u.a(e10) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        i.g(elements, "elements");
        this.f22622u.b();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f22622u.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22622u.containsKey(obj);
    }

    @Override // is.e
    public final int g() {
        return this.f22622u.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22622u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f22622u;
        bVar.getClass();
        return new b.e(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f22622u;
        bVar.b();
        int g5 = bVar.g(obj);
        if (g5 < 0) {
            g5 = -1;
        } else {
            bVar.j(g5);
        }
        if (g5 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        this.f22622u.b();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        this.f22622u.b();
        return super.retainAll(elements);
    }

    public g() {
        this(new b());
    }
}
