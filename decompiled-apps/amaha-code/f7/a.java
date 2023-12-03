package f7;
/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements gs.a<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final Object f14872w = new Object();

    /* renamed from: u  reason: collision with root package name */
    public volatile gs.a<T> f14873u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f14874v = f14872w;

    public a(b bVar) {
        this.f14873u = bVar;
    }

    public static gs.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    @Override // gs.a
    public final T get() {
        boolean z10;
        T t3 = (T) this.f14874v;
        Object obj = f14872w;
        if (t3 == obj) {
            synchronized (this) {
                t3 = this.f14874v;
                if (t3 == obj) {
                    t3 = this.f14873u.get();
                    Object obj2 = this.f14874v;
                    if (obj2 != obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj2 != t3) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t3 + ". This is likely due to a circular dependency.");
                    }
                    this.f14874v = t3;
                    this.f14873u = null;
                }
            }
        }
        return t3;
    }
}
