package e4;

import android.os.Process;
import e4.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: CacheDispatcher.java */
/* loaded from: classes.dex */
public final class c extends Thread {
    public static final boolean A = o.f13792a;

    /* renamed from: u  reason: collision with root package name */
    public final BlockingQueue<j<?>> f13747u;

    /* renamed from: v  reason: collision with root package name */
    public final BlockingQueue<j<?>> f13748v;

    /* renamed from: w  reason: collision with root package name */
    public final a f13749w;

    /* renamed from: x  reason: collision with root package name */
    public final m f13750x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f13751y = false;

    /* renamed from: z  reason: collision with root package name */
    public final p f13752z;

    public c(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, a aVar, m mVar) {
        this.f13747u = priorityBlockingQueue;
        this.f13748v = priorityBlockingQueue2;
        this.f13749w = aVar;
        this.f13750x = mVar;
        this.f13752z = new p(this, priorityBlockingQueue2, mVar);
    }

    private void a() {
        boolean z10;
        boolean z11;
        j<?> take = this.f13747u.take();
        take.addMarker("cache-queue-take");
        take.sendEvent(1);
        try {
            if (take.isCanceled()) {
                take.finish("cache-discard-canceled");
            } else {
                a.C0214a a10 = ((com.android.volley.toolbox.d) this.f13749w).a(take.getCacheKey());
                if (a10 == null) {
                    take.addMarker("cache-miss");
                    if (!this.f13752z.a(take)) {
                        this.f13748v.put(take);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z12 = false;
                    if (a10.f13742e < currentTimeMillis) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        take.addMarker("cache-hit-expired");
                        take.setCacheEntry(a10);
                        if (!this.f13752z.a(take)) {
                            this.f13748v.put(take);
                        }
                    } else {
                        take.addMarker("cache-hit");
                        l<?> parseNetworkResponse = take.parseNetworkResponse(new i(a10.f13738a, a10.f13743g));
                        take.addMarker("cache-hit-parsed");
                        if (parseNetworkResponse.f13790c == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            take.addMarker("cache-parsing-failed");
                            a aVar = this.f13749w;
                            String cacheKey = take.getCacheKey();
                            com.android.volley.toolbox.d dVar = (com.android.volley.toolbox.d) aVar;
                            synchronized (dVar) {
                                a.C0214a a11 = dVar.a(cacheKey);
                                if (a11 != null) {
                                    a11.f = 0L;
                                    a11.f13742e = 0L;
                                    dVar.f(cacheKey, a11);
                                }
                            }
                            take.setCacheEntry(null);
                            if (!this.f13752z.a(take)) {
                                this.f13748v.put(take);
                            }
                        } else {
                            if (a10.f < currentTimeMillis) {
                                z12 = true;
                            }
                            if (!z12) {
                                ((e) this.f13750x).a(take, parseNetworkResponse, null);
                            } else {
                                take.addMarker("cache-hit-refresh-needed");
                                take.setCacheEntry(a10);
                                parseNetworkResponse.f13791d = true;
                                if (!this.f13752z.a(take)) {
                                    ((e) this.f13750x).a(take, parseNetworkResponse, new b(this, take));
                                } else {
                                    ((e) this.f13750x).a(take, parseNetworkResponse, null);
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            take.sendEvent(2);
        }
    }

    public final void b() {
        this.f13751y = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (A) {
            o.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((com.android.volley.toolbox.d) this.f13749w).d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f13751y) {
                    Thread.currentThread().interrupt();
                    return;
                }
                o.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
