package nd;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes.dex */
public final class c0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f26032a;

    /* renamed from: b  reason: collision with root package name */
    public final ud.f f26033b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26034c;

    /* renamed from: d  reason: collision with root package name */
    public final kd.a f26035d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f26036e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c0(j jVar, ud.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, kd.a aVar) {
        this.f26032a = jVar;
        this.f26033b = dVar;
        this.f26034c = uncaughtExceptionHandler;
        this.f26035d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else {
            boolean z10 = true;
            if (!this.f26035d.b()) {
                return true;
            }
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = false;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        r0.uncaughtException(r11, r12);
        r3.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        return;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th2) {
        boolean z10;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f26034c;
        AtomicBoolean atomicBoolean = this.f26036e;
        boolean z11 = true;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    ((j) this.f26032a).a(this.f26033b, thread, th2);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                    }
                }
                if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z11 = false;
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z11 = false;
                }
            }
        } catch (Throwable th3) {
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z11 = false;
            }
            if (z11) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
