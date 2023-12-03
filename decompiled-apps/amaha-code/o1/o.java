package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26969u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26970v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f26971w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c.b f26972x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c.j f26973y;

    public o(c.j jVar, c.l lVar, String str, Bundle bundle, c.b bVar) {
        this.f26973y = jVar;
        this.f26969u = lVar;
        this.f26970v = str;
        this.f26971w = bundle;
        this.f26972x = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26969u).a();
        c.j jVar = this.f26973y;
        if (c.this.f26906x.getOrDefault(a10, null) == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f26970v + ", extras=" + this.f26971w);
            return;
        }
        c.this.getClass();
        this.f26972x.b(-1, null);
    }
}
