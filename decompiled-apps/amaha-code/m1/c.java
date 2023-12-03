package m1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {
    public static e A;

    /* renamed from: z  reason: collision with root package name */
    public static final ThreadPoolExecutor f24776z;

    /* renamed from: u  reason: collision with root package name */
    public final b f24777u;

    /* renamed from: v  reason: collision with root package name */
    public final C0399c f24778v;

    /* renamed from: w  reason: collision with root package name */
    public volatile int f24779w = 1;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicBoolean f24780x = new AtomicBoolean();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f24781y = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: u  reason: collision with root package name */
        public final AtomicInteger f24782u = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f24782u.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public class b extends f<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c cVar = c.this;
            cVar.f24781y.set(true);
            try {
                Process.setThreadPriority(10);
                cVar.a(this.f24787u);
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: m1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0399c extends FutureTask<Result> {
        public C0399c(b bVar) {
            super(bVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            c cVar = c.this;
            try {
                Result result = get();
                if (!cVar.f24781y.get()) {
                    cVar.d(result);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                if (!cVar.f24781y.get()) {
                    cVar.d(null);
                }
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f24785a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f24786b;

        public d(c cVar, Data... dataArr) {
            this.f24785a = cVar;
            this.f24786b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i6 = message.what;
            if (i6 != 1) {
                if (i6 == 2) {
                    dVar.f24785a.getClass();
                    return;
                }
                return;
            }
            c cVar = dVar.f24785a;
            Object obj = dVar.f24786b[0];
            if (cVar.f24780x.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f24779w = 3;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static abstract class f<Params, Result> implements Callable<Result> {

        /* renamed from: u  reason: collision with root package name */
        public Params[] f24787u;
    }

    static {
        a aVar = new a();
        f24776z = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public c() {
        b bVar = new b();
        this.f24777u = bVar;
        this.f24778v = new C0399c(bVar);
    }

    public abstract void a(Object... objArr);

    public final void d(Object obj) {
        e eVar;
        synchronized (c.class) {
            if (A == null) {
                A = new e();
            }
            eVar = A;
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
