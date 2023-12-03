package oa;

import java.util.NoSuchElementException;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class o extends h {

    /* renamed from: u  reason: collision with root package name */
    public final int f27334u;

    /* renamed from: v  reason: collision with root package name */
    public int f27335v;

    /* renamed from: w  reason: collision with root package name */
    public final q f27336w;

    public o(q qVar, int i6) {
        int size = qVar.size();
        sc.b.q0(i6, size);
        this.f27334u = size;
        this.f27335v = i6;
        this.f27336w = qVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: b */
    public final boolean hasNext() {
        if (this.f27335v < this.f27334u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    /* renamed from: c */
    public final boolean hasPrevious() {
        if (this.f27335v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i6 = this.f27335v;
            this.f27335v = i6 + 1;
            return this.f27336w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i6 = this.f27335v - 1;
            this.f27335v = i6;
            return this.f27336w.get(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27335v;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27335v - 1;
    }
}
