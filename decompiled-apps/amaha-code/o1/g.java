package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26938u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26939v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f26940w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f26941x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c.j f26942y;

    public g(int i6, int i10, Bundle bundle, c.j jVar, c.l lVar, String str) {
        this.f26942y = jVar;
        this.f26938u = lVar;
        this.f26939v = str;
        this.f26940w = i6;
        this.f26941x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.k kVar = this.f26938u;
        IBinder a10 = ((c.l) kVar).a();
        c.j jVar = this.f26942y;
        c.this.f26906x.remove(a10);
        c.b bVar = new c.b(this.f26939v, this.f26940w, this.f26941x, this.f26938u);
        c cVar = c.this;
        cVar.getClass();
        String str = this.f26939v;
        bVar.f = cVar.b(str);
        cVar.getClass();
        if (bVar.f == null) {
            StringBuilder g5 = defpackage.d.g("No root for client ", str, " from service ");
            g5.append(g.class.getName());
            Log.i("MBServiceCompat", g5.toString());
            try {
                ((c.l) kVar).c(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                return;
            }
        }
        try {
            cVar.f26906x.put(a10, bVar);
            a10.linkToDeath(bVar, 0);
            MediaSessionCompat.Token token = cVar.f26908z;
            if (token != null) {
                c.a aVar = bVar.f;
                String str2 = aVar.f26909a;
                Bundle bundle = aVar.f26910b;
                c.l lVar = (c.l) kVar;
                lVar.getClass();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", token);
                bundle2.putBundle("data_root_hints", bundle);
                lVar.c(1, bundle2);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
            cVar.f26906x.remove(a10);
        }
    }
}
