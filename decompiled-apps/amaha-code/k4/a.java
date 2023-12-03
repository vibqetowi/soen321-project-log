package k4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: k4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0351a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Runnable f22817u;

        public RunnableC0351a(Runnable runnable) {
            this.f22817u = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f22817u.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0351a(runnable), "glide-active-resources");
    }
}
