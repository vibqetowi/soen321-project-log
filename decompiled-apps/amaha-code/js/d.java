package js;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import js.b;
import kotlin.jvm.internal.i;
/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class d<V> extends AbstractCollection<Object> implements Collection<Object>, ts.b {

    /* renamed from: u  reason: collision with root package name */
    public final b<?, V> f22618u;

    public d(b<?, V> backing) {
        i.g(backing, "backing");
        this.f22618u = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f22618u.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22618u.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f22618u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        b<?, V> bVar = this.f22618u;
        bVar.getClass();
        return new b.f(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i6;
        b<?, V> bVar = this.f22618u;
        bVar.b();
        int i10 = bVar.f22610z;
        while (true) {
            i6 = -1;
            i10--;
            if (i10 < 0) {
                break;
            } else if (bVar.f22607w[i10] >= 0) {
                V[] vArr = bVar.f22606v;
                i.d(vArr);
                if (i.b(vArr[i10], obj)) {
                    i6 = i10;
                    break;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        bVar.j(i6);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        this.f22618u.b();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.g(elements, "elements");
        this.f22618u.b();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22618u.B;
    }
}
