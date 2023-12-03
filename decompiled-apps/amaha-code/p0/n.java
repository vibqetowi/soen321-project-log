package p0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final String f27859u = "fonts-androidx";

    /* renamed from: v  reason: collision with root package name */
    public final int f27860v = 10;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: u  reason: collision with root package name */
        public final int f27861u;

        public a(Runnable runnable, String str, int i6) {
            super(runnable, str);
            this.f27861u = i6;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f27861u);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f27859u, this.f27860v);
    }
}
