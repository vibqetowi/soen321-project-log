package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26958u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f26959v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f26960w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f26961x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c.j f26962y;

    public l(int i6, int i10, Bundle bundle, c.j jVar, c.l lVar, String str) {
        this.f26962y = jVar;
        this.f26958u = lVar;
        this.f26959v = i6;
        this.f26960w = str;
        this.f26961x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.b bVar;
        IBinder a10 = ((c.l) this.f26958u).a();
        c.j jVar = this.f26962y;
        c.this.f26906x.remove(a10);
        c cVar = c.this;
        Iterator<c.b> it = cVar.f26905w.iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            c.b next = it.next();
            if (next.f26913c == this.f26959v) {
                if (TextUtils.isEmpty(this.f26960w) || this.f26961x <= 0) {
                    bVar = new c.b(next.f26911a, next.f26912b, next.f26913c, this.f26958u);
                }
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = new c.b(this.f26960w, this.f26961x, this.f26959v, this.f26958u);
        }
        cVar.f26906x.put(a10, bVar);
        try {
            a10.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
