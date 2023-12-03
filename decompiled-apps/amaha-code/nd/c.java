package nd;

import android.os.Process;
/* compiled from: BackgroundPriorityRunnable.java */
/* loaded from: classes.dex */
public abstract class c implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
