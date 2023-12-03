package e4;

import e4.a;
import e4.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: WaitingRequestManager.java */
/* loaded from: classes.dex */
public final class p implements j.b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f13800a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final m f13801b;

    /* renamed from: c  reason: collision with root package name */
    public final c f13802c;

    /* renamed from: d  reason: collision with root package name */
    public final BlockingQueue<j<?>> f13803d;

    public p(c cVar, PriorityBlockingQueue priorityBlockingQueue, m mVar) {
        this.f13801b = mVar;
        this.f13802c = cVar;
        this.f13803d = priorityBlockingQueue;
    }

    public final synchronized boolean a(j<?> jVar) {
        String cacheKey = jVar.getCacheKey();
        if (this.f13800a.containsKey(cacheKey)) {
            List list = (List) this.f13800a.get(cacheKey);
            if (list == null) {
                list = new ArrayList();
            }
            jVar.addMarker("waiting-for-response");
            list.add(jVar);
            this.f13800a.put(cacheKey, list);
            if (o.f13792a) {
                o.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        }
        this.f13800a.put(cacheKey, null);
        jVar.setNetworkRequestCompleteListener(this);
        if (o.f13792a) {
            o.b("new request, sending to network %s", cacheKey);
        }
        return false;
    }

    public final synchronized void b(j<?> jVar) {
        BlockingQueue<j<?>> blockingQueue;
        String cacheKey = jVar.getCacheKey();
        List list = (List) this.f13800a.remove(cacheKey);
        if (list != null && !list.isEmpty()) {
            if (o.f13792a) {
                o.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
            }
            j<?> jVar2 = (j) list.remove(0);
            this.f13800a.put(cacheKey, list);
            jVar2.setNetworkRequestCompleteListener(this);
            if (this.f13802c != null && (blockingQueue = this.f13803d) != null) {
                try {
                    blockingQueue.put(jVar2);
                } catch (InterruptedException e10) {
                    o.c("Couldn't add request to queue. %s", e10.toString());
                    Thread.currentThread().interrupt();
                    this.f13802c.b();
                }
            }
        }
    }

    public final void c(j<?> jVar, l<?> lVar) {
        boolean z10;
        List<j> list;
        a.C0214a c0214a = lVar.f13789b;
        if (c0214a != null) {
            if (c0214a.f13742e < System.currentTimeMillis()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String cacheKey = jVar.getCacheKey();
                synchronized (this) {
                    list = (List) this.f13800a.remove(cacheKey);
                }
                if (list != null) {
                    if (o.f13792a) {
                        o.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                    }
                    for (j jVar2 : list) {
                        ((e) this.f13801b).a(jVar2, lVar, null);
                    }
                    return;
                }
                return;
            }
        }
        b(jVar);
    }
}
