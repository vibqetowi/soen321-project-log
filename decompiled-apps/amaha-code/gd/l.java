package gd;

import android.os.HandlerThread;
import com.google.android.gms.internal.p000firebaseauthapi.m6;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class l {
    public static final y9.a f = new y9.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f16431a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f16432b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16433c;

    /* renamed from: d  reason: collision with root package name */
    public final m6 f16434d;

    /* renamed from: e  reason: collision with root package name */
    public final k f16435e;

    public l(sc.e eVar) {
        f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f16434d = new m6(handlerThread.getLooper());
        eVar.b();
        this.f16435e = new k(this, eVar.f31433b);
        this.f16433c = 300000L;
    }

    public final void a() {
        y9.a aVar = f;
        long j10 = this.f16431a;
        long j11 = this.f16433c;
        aVar.e("Scheduling refresh for " + (j10 - j11), new Object[0]);
        this.f16434d.removeCallbacks(this.f16435e);
        this.f16432b = Math.max((this.f16431a - System.currentTimeMillis()) - this.f16433c, 0L) / 1000;
        this.f16434d.postDelayed(this.f16435e, this.f16432b * 1000);
    }
}
