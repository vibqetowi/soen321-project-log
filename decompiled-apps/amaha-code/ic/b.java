package ic;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: w  reason: collision with root package name */
    public static final Object f19925w = new Object();

    /* renamed from: u  reason: collision with root package name */
    public volatile c f19926u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f19927v = f19925w;

    public b(c cVar) {
        this.f19926u = cVar;
    }

    public static c b(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        return new b(cVar);
    }

    @Override // ic.c, mc.a
    public final Object a() {
        Object obj = this.f19927v;
        Object obj2 = f19925w;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f19927v;
                if (obj == obj2) {
                    obj = this.f19926u.a();
                    Object obj3 = this.f19927v;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f19927v = obj;
                    this.f19926u = null;
                }
            }
        }
        return obj;
    }
}
