package fv;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SequencesJVM.kt */
/* loaded from: classes2.dex */
public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<h<T>> f15955a;

    public a(h<? extends T> hVar) {
        this.f15955a = new AtomicReference<>(hVar);
    }

    @Override // fv.h
    public final Iterator<T> iterator() {
        h<T> andSet = this.f15955a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
