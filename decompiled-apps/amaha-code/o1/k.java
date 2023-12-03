package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26954u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26955v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c.b f26956w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c.j f26957x;

    public k(c.j jVar, c.l lVar, String str, c.b bVar) {
        this.f26957x = jVar;
        this.f26954u = lVar;
        this.f26955v = str;
        this.f26956w = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26954u).a();
        c.j jVar = this.f26957x;
        if (c.this.f26906x.getOrDefault(a10, null) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f26955v);
            return;
        }
        c.this.getClass();
        boolean z10 = true & true;
        c.b bVar = this.f26956w;
        if (z10) {
            bVar.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        bVar.b(0, bundle);
    }
}
