package o1;

import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26943u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c.j f26944v;

    public h(c.j jVar, c.l lVar) {
        this.f26944v = jVar;
        this.f26943u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.b remove = c.this.f26906x.remove(((c.l) this.f26943u).a());
        if (remove != null) {
            ((c.l) remove.f26914d).a().unlinkToDeath(remove, 0);
        }
    }
}
