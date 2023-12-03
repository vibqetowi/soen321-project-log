package nd;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ExecutorUtils.java */
/* loaded from: classes.dex */
public final class f0 extends c {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f26055u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f26056v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f26057w = 2;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f26058x;

    public f0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f26055u = str;
        this.f26056v = executorService;
        this.f26058x = timeUnit;
    }

    @Override // nd.c
    public final void a() {
        boolean z10;
        boolean z11;
        String str = this.f26055u;
        ExecutorService executorService = this.f26056v;
        boolean z12 = false;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f26057w, this.f26058x)) {
                String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z12 = true;
            }
            if (z12) {
                Log.d("FirebaseCrashlytics", format, null);
            }
            executorService.shutdownNow();
        }
    }
}
