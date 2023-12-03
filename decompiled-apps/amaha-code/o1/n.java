package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26965u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26966v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c.b f26967w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c.j f26968x;

    public n(c.j jVar, c.l lVar, String str, Bundle bundle, c.b bVar) {
        this.f26968x = jVar;
        this.f26965u = lVar;
        this.f26966v = str;
        this.f26967w = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26965u).a();
        c.j jVar = this.f26968x;
        c.b orDefault = c.this.f26906x.getOrDefault(a10, null);
        String str = this.f26966v;
        if (orDefault == null) {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
            return;
        }
        c.this.getClass();
        b bVar = new b(str, this.f26967w);
        bVar.f26928c = 4;
        bVar.b(null);
        if (bVar.f26927b) {
            return;
        }
        throw new IllegalStateException(defpackage.c.r("onSearch must call detach() or sendResult() before returning for query=", str));
    }
}
