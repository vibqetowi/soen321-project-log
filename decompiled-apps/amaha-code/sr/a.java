package sr;

import com.google.android.gms.internal.p000firebaseauthapi.qd;
/* compiled from: DoubleCheck.java */
/* loaded from: classes2.dex */
public final class a<T> implements gs.a<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final Object f31927w = new Object();

    /* renamed from: u  reason: collision with root package name */
    public volatile gs.a<T> f31928u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f31929v = f31927w;

    public a(qd qdVar) {
        this.f31928u = qdVar;
    }

    @Override // gs.a
    public final T get() {
        boolean z10;
        T t3 = (T) this.f31929v;
        Object obj = f31927w;
        if (t3 == obj) {
            synchronized (this) {
                t3 = this.f31929v;
                if (t3 == obj) {
                    t3 = this.f31928u.get();
                    Object obj2 = this.f31929v;
                    if (obj2 != obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj2 != t3) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                    }
                    this.f31929v = t3;
                    this.f31928u = null;
                }
            }
        }
        return t3;
    }
}
