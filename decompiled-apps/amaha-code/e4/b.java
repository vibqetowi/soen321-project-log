package e4;
/* compiled from: CacheDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f13745u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f13746v;

    public b(c cVar, j jVar) {
        this.f13746v = cVar;
        this.f13745u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13746v.f13748v.put(this.f13745u);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
