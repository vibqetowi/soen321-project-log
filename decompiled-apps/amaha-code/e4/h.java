package e4;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.VolleyError;
import e4.e;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: NetworkDispatcher.java */
/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: u  reason: collision with root package name */
    public final BlockingQueue<j<?>> f13763u;

    /* renamed from: v  reason: collision with root package name */
    public final g f13764v;

    /* renamed from: w  reason: collision with root package name */
    public final a f13765w;

    /* renamed from: x  reason: collision with root package name */
    public final m f13766x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f13767y = false;

    public h(PriorityBlockingQueue priorityBlockingQueue, g gVar, a aVar, m mVar) {
        this.f13763u = priorityBlockingQueue;
        this.f13764v = gVar;
        this.f13765w = aVar;
        this.f13766x = mVar;
    }

    private void a() {
        j<?> take = this.f13763u.take();
        m mVar = this.f13766x;
        SystemClock.elapsedRealtime();
        take.sendEvent(3);
        try {
            try {
                try {
                    take.addMarker("network-queue-take");
                    if (take.isCanceled()) {
                        take.finish("network-discard-cancelled");
                        take.notifyListenerResponseNotUsable();
                    } else {
                        TrafficStats.setThreadStatsTag(take.getTrafficStatsTag());
                        i a10 = ((com.android.volley.toolbox.b) this.f13764v).a(take);
                        take.addMarker("network-http-complete");
                        if (a10.f13772e && take.hasHadResponseDelivered()) {
                            take.finish("not-modified");
                            take.notifyListenerResponseNotUsable();
                        } else {
                            l<?> parseNetworkResponse = take.parseNetworkResponse(a10);
                            take.addMarker("network-parse-complete");
                            if (take.shouldCache() && parseNetworkResponse.f13789b != null) {
                                ((com.android.volley.toolbox.d) this.f13765w).f(take.getCacheKey(), parseNetworkResponse.f13789b);
                                take.addMarker("network-cache-written");
                            }
                            take.markDelivered();
                            ((e) mVar).a(take, parseNetworkResponse, null);
                            take.notifyListenerResponseReceived(parseNetworkResponse);
                        }
                    }
                } catch (VolleyError e10) {
                    SystemClock.elapsedRealtime();
                    VolleyError parseNetworkError = take.parseNetworkError(e10);
                    e eVar = (e) mVar;
                    eVar.getClass();
                    take.addMarker("post-error");
                    eVar.f13756a.execute(new e.b(take, new l(parseNetworkError), null));
                    take.notifyListenerResponseNotUsable();
                }
            } catch (Exception e11) {
                Log.e("Volley", o.a("Unhandled exception %s", e11.toString()), e11);
                VolleyError volleyError = new VolleyError(e11);
                SystemClock.elapsedRealtime();
                e eVar2 = (e) mVar;
                eVar2.getClass();
                take.addMarker("post-error");
                eVar2.f13756a.execute(new e.b(take, new l(volleyError), null));
                take.notifyListenerResponseNotUsable();
            }
        } finally {
            take.sendEvent(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f13767y) {
                    Thread.currentThread().interrupt();
                    return;
                }
                o.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
