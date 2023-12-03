package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c.k f26945u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26946v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ IBinder f26947w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f26948x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c.j f26949y;

    public i(c.j jVar, c.l lVar, String str, IBinder iBinder, Bundle bundle) {
        this.f26949y = jVar;
        this.f26945u = lVar;
        this.f26946v = str;
        this.f26947w = iBinder;
        this.f26948x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder a10 = ((c.l) this.f26945u).a();
        c.j jVar = this.f26949y;
        c.b orDefault = c.this.f26906x.getOrDefault(a10, null);
        if (orDefault == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f26946v);
            return;
        }
        String str = this.f26946v;
        Bundle bundle = this.f26948x;
        c cVar = c.this;
        cVar.getClass();
        HashMap<String, List<s0.c<IBinder, Bundle>>> hashMap = orDefault.f26915e;
        List<s0.c<IBinder, Bundle>> list = hashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<s0.c<IBinder, Bundle>> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            IBinder iBinder = this.f26947w;
            if (hasNext) {
                s0.c<IBinder, Bundle> next = it.next();
                if (iBinder == next.f31064a && kc.f.h(bundle, next.f31065b)) {
                    return;
                }
            } else {
                list.add(new s0.c<>(iBinder, bundle));
                hashMap.put(str, list);
                a aVar = new a(cVar, str, orDefault, str, bundle);
                if (bundle == null) {
                    cVar.c(str, aVar);
                } else {
                    aVar.f26928c = 1;
                    cVar.c(str, aVar);
                }
                if (aVar.f26927b) {
                    return;
                }
                throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + orDefault.f26911a + " id=" + str);
            }
        }
    }
}
