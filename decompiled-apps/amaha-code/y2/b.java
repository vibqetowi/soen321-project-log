package y2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w2.o;
/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class b implements y2.a {

    /* renamed from: a  reason: collision with root package name */
    public final o f38188a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f38189b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final a f38190c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f38189b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f38188a = new o(executorService);
    }

    public final void a(Runnable runnable) {
        this.f38188a.execute(runnable);
    }
}
