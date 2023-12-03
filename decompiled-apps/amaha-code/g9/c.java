package g9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: u  reason: collision with root package name */
    public final WeakReference<a> f16389u;

    /* renamed from: v  reason: collision with root package name */
    public final long f16390v;

    /* renamed from: w  reason: collision with root package name */
    public final CountDownLatch f16391w = new CountDownLatch(1);

    /* renamed from: x  reason: collision with root package name */
    public boolean f16392x = false;

    public c(a aVar, long j10) {
        this.f16389u = new WeakReference<>(aVar);
        this.f16390v = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference<a> weakReference = this.f16389u;
        try {
            if (!this.f16391w.await(this.f16390v, TimeUnit.MILLISECONDS) && (aVar = weakReference.get()) != null) {
                aVar.b();
                this.f16392x = true;
            }
        } catch (InterruptedException unused) {
            a aVar2 = weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f16392x = true;
            }
        }
    }
}
