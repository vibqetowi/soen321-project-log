package androidx.work;

import android.content.Context;
import androidx.work.p;
/* loaded from: classes.dex */
public abstract class Worker extends p {
    x2.c<p.a> mFuture;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.i(worker.doWork());
            } catch (Throwable th2) {
                worker.mFuture.j(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x2.c f3198u;

        public b(x2.c cVar) {
            this.f3198u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x2.c cVar = this.f3198u;
            try {
                cVar.i(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                cVar.j(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract p.a doWork();

    public g getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.p
    public rc.b<g> getForegroundInfoAsync() {
        x2.c cVar = new x2.c();
        getBackgroundExecutor().execute(new b(cVar));
        return cVar;
    }

    @Override // androidx.work.p
    public final rc.b<p.a> startWork() {
        this.mFuture = new x2.c<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
