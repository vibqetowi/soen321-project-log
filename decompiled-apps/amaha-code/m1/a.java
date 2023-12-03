package m1;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import j9.f;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.b;
import m1.b;
import v.h;
/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: g  reason: collision with root package name */
    public final Executor f24768g;

    /* renamed from: h  reason: collision with root package name */
    public volatile a<D>.RunnableC0398a f24769h;

    /* renamed from: i  reason: collision with root package name */
    public volatile a<D>.RunnableC0398a f24770i;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: m1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0398a extends c<Void, Void, D> implements Runnable {
        public final CountDownLatch B = new CountDownLatch(1);

        public RunnableC0398a() {
        }

        @Override // m1.c
        public final void a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                a.this.c();
            } catch (OperationCanceledException e10) {
                if (this.f24780x.get()) {
                    return;
                }
                throw e10;
            }
        }

        @Override // m1.c
        public final void b(D d10) {
            CountDownLatch countDownLatch = this.B;
            try {
                a aVar = a.this;
                if (aVar.f24770i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f24770i = null;
                    aVar.b();
                }
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // m1.c
        public final void c(D d10) {
            try {
                a aVar = a.this;
                if (aVar.f24769h != this) {
                    if (aVar.f24770i == this) {
                        SystemClock.uptimeMillis();
                        aVar.f24770i = null;
                        aVar.b();
                    }
                } else if (!aVar.f24774d) {
                    SystemClock.uptimeMillis();
                    aVar.f24769h = null;
                    b.a<D> aVar2 = aVar.f24772b;
                    if (aVar2 != null) {
                        b.a aVar3 = (b.a) aVar2;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.l(d10);
                        } else {
                            aVar3.i(d10);
                        }
                    }
                }
            } finally {
                this.B.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = c.f24776z;
        this.f24768g = threadPoolExecutor;
    }

    public final void b() {
        if (this.f24770i == null && this.f24769h != null) {
            this.f24769h.getClass();
            a<D>.RunnableC0398a runnableC0398a = this.f24769h;
            Executor executor = this.f24768g;
            if (runnableC0398a.f24779w != 1) {
                int d10 = h.d(runnableC0398a.f24779w);
                if (d10 != 1) {
                    if (d10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            runnableC0398a.f24779w = 2;
            runnableC0398a.f24777u.f24787u = null;
            executor.execute(runnableC0398a.f24778v);
        }
    }

    public final void c() {
        f fVar = (f) this;
        Iterator it = fVar.f21761k.iterator();
        if (!it.hasNext()) {
            try {
                fVar.f21760j.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((com.google.android.gms.common.api.c) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
