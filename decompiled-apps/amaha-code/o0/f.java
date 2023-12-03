package o0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final Handler f26889u;

    public f(Handler handler) {
        this.f26889u = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f26889u;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
