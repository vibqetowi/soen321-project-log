package nd;
/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ud.f f26130u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f26131v;

    public w(x xVar, ud.d dVar) {
        this.f26131v = xVar;
        this.f26130u = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.a(this.f26131v, this.f26130u);
    }
}
