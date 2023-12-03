package hs;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
public final class h<T> implements d<T>, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<h<?>, Object> f19467w = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "v");

    /* renamed from: u  reason: collision with root package name */
    public volatile ss.a<? extends T> f19468u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f19469v;

    public h(ss.a<? extends T> initializer) {
        kotlin.jvm.internal.i.g(initializer, "initializer");
        this.f19468u = initializer;
        this.f19469v = kc.f.c0;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // hs.d
    public final T getValue() {
        boolean z10;
        T t3 = (T) this.f19469v;
        kc.f fVar = kc.f.c0;
        if (t3 != fVar) {
            return t3;
        }
        ss.a<? extends T> aVar = this.f19468u;
        if (aVar != null) {
            T invoke = aVar.invoke();
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f19467w;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, invoke)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != fVar) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f19468u = null;
                return invoke;
            }
        }
        return (T) this.f19469v;
    }

    public final String toString() {
        boolean z10;
        if (this.f19469v != kc.f.c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
