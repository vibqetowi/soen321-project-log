package js;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import js.b;
import kotlin.jvm.internal.i;
/* compiled from: MapBuilder.kt */
/* loaded from: classes2.dex */
public final class c extends is.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f22616u;

    /* renamed from: v  reason: collision with root package name */
    public final b f22617v;

    public c(b backing, int i6) {
        this.f22616u = i6;
        if (i6 != 1) {
            i.g(backing, "backing");
            this.f22617v = backing;
            return;
        }
        i.g(backing, "backing");
        this.f22617v = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f22616u) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                i.g(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f22616u) {
            case 0:
                i.g(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                i.g(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                bVar.clear();
                return;
            default:
                bVar.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f22616u) {
            case 0:
                return m(obj);
            default:
                return this.f22617v.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        switch (this.f22616u) {
            case 0:
                i.g(elements, "elements");
                return this.f22617v.c(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // is.e
    public final int g() {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                return bVar.B;
            default:
                return bVar.B;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                return bVar.isEmpty();
            default:
                return bVar.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                bVar.getClass();
                return new b.C0344b(bVar);
            default:
                bVar.getClass();
                return new b.e(bVar);
        }
    }

    public final boolean m(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        i.g(element, "element");
        return this.f22617v.d(element);
    }

    public final boolean o(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        i.g(element, "element");
        b bVar = this.f22617v;
        bVar.getClass();
        bVar.b();
        int g5 = bVar.g(element.getKey());
        if (g5 < 0) {
            return false;
        }
        Object[] objArr = bVar.f22606v;
        i.d(objArr);
        if (!i.b(objArr[g5], element.getValue())) {
            return false;
        }
        bVar.j(g5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f22616u) {
            case 0:
                return o(obj);
            default:
                b bVar = this.f22617v;
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
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                i.g(elements, "elements");
                bVar.b();
                return super.removeAll(elements);
            default:
                i.g(elements, "elements");
                bVar.b();
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        int i6 = this.f22616u;
        b bVar = this.f22617v;
        switch (i6) {
            case 0:
                i.g(elements, "elements");
                bVar.b();
                return super.retainAll(elements);
            default:
                i.g(elements, "elements");
                bVar.b();
                return super.retainAll(elements);
        }
    }
}
