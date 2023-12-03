package is;

import java.util.List;
/* compiled from: ReversedViews.kt */
/* loaded from: classes2.dex */
public final class f0<T> extends d<T> {

    /* renamed from: u  reason: collision with root package name */
    public final List<T> f20651u;

    public f0(List<T> delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f20651u = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, T t3) {
        if (new xs.f(0, size()).m(i6)) {
            this.f20651u.add(size() - i6, t3);
            return;
        }
        StringBuilder u10 = defpackage.c.u("Position index ", i6, " must be in range [");
        u10.append(new xs.f(0, size()));
        u10.append("].");
        throw new IndexOutOfBoundsException(u10.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f20651u.clear();
    }

    @Override // is.d
    public final int g() {
        return this.f20651u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i6) {
        return this.f20651u.get(q.Q1(i6, this));
    }

    @Override // is.d
    public final T m(int i6) {
        return this.f20651u.remove(q.Q1(i6, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i6, T t3) {
        return this.f20651u.set(q.Q1(i6, this), t3);
    }
}
