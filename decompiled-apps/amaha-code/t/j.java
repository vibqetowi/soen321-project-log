package t;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: SparseArray.kt */
/* loaded from: classes.dex */
public final class j implements Iterator<Object>, ts.a, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f32266u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f32267v;

    public j(i<Object> iVar) {
        this.f32267v = iVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.f32266u < this.f32267v.f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i6 = this.f32266u;
        this.f32266u = i6 + 1;
        return this.f32267v.h(i6);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
