package hs;

import java.io.Serializable;
/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
public final class i<T> implements d<T>, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public ss.a<? extends T> f19470u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f19471v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f19472w;

    public i(ss.a initializer) {
        kotlin.jvm.internal.i.g(initializer, "initializer");
        this.f19470u = initializer;
        this.f19471v = kc.f.c0;
        this.f19472w = this;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // hs.d
    public final T getValue() {
        T t3;
        T t10 = (T) this.f19471v;
        kc.f fVar = kc.f.c0;
        if (t10 != fVar) {
            return t10;
        }
        synchronized (this.f19472w) {
            t3 = (T) this.f19471v;
            if (t3 == fVar) {
                ss.a<? extends T> aVar = this.f19470u;
                kotlin.jvm.internal.i.d(aVar);
                t3 = aVar.invoke();
                this.f19471v = t3;
                this.f19470u = null;
            }
        }
        return t3;
    }

    public final String toString() {
        boolean z10;
        if (this.f19471v != kc.f.c0) {
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
