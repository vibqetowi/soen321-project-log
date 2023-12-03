package o1;

import android.os.IBinder;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26963u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c.j f26964v;

    public m(c.j jVar, c.l lVar) {
        this.f26964v = jVar;
        this.f26963u = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26963u).a();
        c.b remove = c.this.f26906x.remove(a10);
        if (remove != null) {
            a10.unlinkToDeath(remove, 0);
        }
    }
}
