package hs;

import java.io.Serializable;
/* compiled from: Lazy.kt */
/* loaded from: classes2.dex */
public final class l<T> implements d<T>, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public ss.a<? extends T> f19477u;

    /* renamed from: v  reason: collision with root package name */
    public Object f19478v;

    public l(ss.a<? extends T> initializer) {
        kotlin.jvm.internal.i.g(initializer, "initializer");
        this.f19477u = initializer;
        this.f19478v = kc.f.c0;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // hs.d
    public final T getValue() {
        if (this.f19478v == kc.f.c0) {
            ss.a<? extends T> aVar = this.f19477u;
            kotlin.jvm.internal.i.d(aVar);
            this.f19478v = aVar.invoke();
            this.f19477u = null;
        }
        return (T) this.f19478v;
    }

    public final String toString() {
        boolean z10;
        if (this.f19478v != kc.f.c0) {
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
