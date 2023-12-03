package k4;

import k4.c;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f22824u;

    public b(c cVar) {
        this.f22824u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f22824u;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f22827c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
