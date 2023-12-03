package m;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public final class a extends com.android.volley.toolbox.a {

    /* renamed from: w  reason: collision with root package name */
    public static volatile a f24761w;

    /* renamed from: x  reason: collision with root package name */
    public static final ExecutorC0397a f24762x = new ExecutorC0397a();

    /* renamed from: v  reason: collision with root package name */
    public final b f24763v = new b();

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ExecutorC0397a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.J().f24763v.f24765w.execute(runnable);
        }
    }

    public static a J() {
        if (f24761w != null) {
            return f24761w;
        }
        synchronized (a.class) {
            if (f24761w == null) {
                f24761w = new a();
            }
        }
        return f24761w;
    }

    public final boolean K() {
        this.f24763v.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void L(Runnable runnable) {
        b bVar = this.f24763v;
        if (bVar.f24766x == null) {
            synchronized (bVar.f24764v) {
                if (bVar.f24766x == null) {
                    bVar.f24766x = b.J(Looper.getMainLooper());
                }
            }
        }
        bVar.f24766x.post(runnable);
    }
}
