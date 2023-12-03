package ld;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cast.w;
import gd.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public final class c implements b, a {

    /* renamed from: u  reason: collision with root package name */
    public final d f24204u;

    /* renamed from: v  reason: collision with root package name */
    public final TimeUnit f24205v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f24206w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public CountDownLatch f24207x;

    public c(d dVar, TimeUnit timeUnit) {
        this.f24204u = dVar;
        this.f24205v = timeUnit;
    }

    @Override // ld.b
    public final void A(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f24207x;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // ld.a
    public final void e(Bundle bundle) {
        synchronized (this.f24206w) {
            w wVar = w.A;
            wVar.h("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f24207x = new CountDownLatch(1);
            this.f24204u.e(bundle);
            wVar.h("Awaiting app exception callback from Analytics...");
            try {
                if (this.f24207x.await(500, this.f24205v)) {
                    wVar.h("App exception callback received from Analytics listener.");
                } else {
                    wVar.j("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f24207x = null;
        }
    }
}
