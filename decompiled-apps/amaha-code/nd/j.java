package nd;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import nd.c0;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class j implements c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f26073a;

    public j(t tVar) {
        this.f26073a = tVar;
    }

    public final void a(ud.f fVar, Thread thread, Throwable th2) {
        t tVar = this.f26073a;
        synchronized (tVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    o0.a(tVar.f26116e.b(new l(tVar, System.currentTimeMillis(), th2, thread, fVar)));
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }
}
