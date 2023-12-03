package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26950u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26951v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ IBinder f26952w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c.j f26953x;

    public j(c.j jVar, c.l lVar, String str, IBinder iBinder) {
        this.f26953x = jVar;
        this.f26950u = lVar;
        this.f26951v = str;
        this.f26952w = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26950u).a();
        c.j jVar = this.f26953x;
        c.b orDefault = c.this.f26906x.getOrDefault(a10, null);
        String str = this.f26951v;
        if (orDefault == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
            return;
        }
        c.this.getClass();
        boolean z10 = false;
        HashMap<String, List<s0.c<IBinder, Bundle>>> hashMap = orDefault.f26915e;
        IBinder iBinder = this.f26952w;
        if (iBinder == null) {
            if (hashMap.remove(str) != null) {
                z10 = true;
            }
        } else {
            List<s0.c<IBinder, Bundle>> list = hashMap.get(str);
            if (list != null) {
                Iterator<s0.c<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f31064a) {
                        it.remove();
                        z10 = true;
                    }
                }
                if (list.size() == 0) {
                    hashMap.remove(str);
                }
            }
        }
        if (!z10) {
            Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
        }
    }
}
