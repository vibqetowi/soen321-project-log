package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: AbstractIterator.java */
/* loaded from: classes.dex */
public abstract class b<T> extends v0<T> {

    /* renamed from: u  reason: collision with root package name */
    public int f9348u = 2;

    /* renamed from: v  reason: collision with root package name */
    public T f9349v;

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        T t3;
        if (this.f9348u != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.D(z10);
        int d10 = v.h.d(this.f9348u);
        if (d10 == 0) {
            return true;
        }
        if (d10 == 2) {
            return false;
        }
        this.f9348u = 4;
        q0 q0Var = (q0) this;
        while (true) {
            Iterator<Object> it = q0Var.f9440w;
            if (it.hasNext()) {
                t3 = (T) it.next();
                if (q0Var.f9441x.f9445v.contains(t3)) {
                    break;
                }
            } else {
                q0Var.f9348u = 3;
                t3 = null;
                break;
            }
        }
        this.f9349v = t3;
        if (this.f9348u != 3) {
            this.f9348u = 1;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f9348u = 2;
            T t3 = this.f9349v;
            this.f9349v = null;
            return t3;
        }
        throw new NoSuchElementException();
    }
}
