package nd;

import android.util.Log;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f26103u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Throwable f26104v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Thread f26105w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t f26106x;

    public q(t tVar, long j10, Throwable th2, Thread thread) {
        this.f26106x = tVar;
        this.f26103u = j10;
        this.f26104v = th2;
        this.f26105w = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        t tVar = this.f26106x;
        c0 c0Var = tVar.f26123m;
        if (c0Var != null && c0Var.f26036e.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long j10 = this.f26103u / 1000;
            String e10 = tVar.e();
            if (e10 == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                return;
            }
            Throwable th2 = this.f26104v;
            Thread thread = this.f26105w;
            l0 l0Var = tVar.f26122l;
            l0Var.getClass();
            String concat = "Persisting non-fatal event for session ".concat(e10);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            l0Var.d(th2, thread, e10, "error", j10, false);
        }
    }
}
