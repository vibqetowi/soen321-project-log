package a3;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f271e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f272a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f273b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f274c;

    /* renamed from: d  reason: collision with root package name */
    public volatile p<T> f275d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<p<T>> {
        public a(Callable<p<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            r rVar = r.this;
            if (isCancelled()) {
                return;
            }
            try {
                rVar.d(get());
            } catch (InterruptedException | ExecutionException e10) {
                rVar.d(new p<>(e10));
            }
        }
    }

    public r() {
        throw null;
    }

    public r(Callable<p<T>> callable) {
        this.f272a = new LinkedHashSet(1);
        this.f273b = new LinkedHashSet(1);
        this.f274c = new Handler(Looper.getMainLooper());
        this.f275d = null;
        f271e.execute(new a(callable));
    }

    public static void a(r rVar, Object obj) {
        synchronized (rVar) {
            Iterator it = new ArrayList(rVar.f272a).iterator();
            while (it.hasNext()) {
                ((m) it.next()).onResult(obj);
            }
        }
    }

    public final synchronized void b(m mVar) {
        if (this.f275d != null && this.f275d.f268a != null) {
            mVar.onResult(this.f275d.f268a);
        }
        this.f272a.add(mVar);
    }

    public final synchronized void c(LottieAnimationView.c cVar) {
        this.f273b.remove(cVar);
    }

    public final void d(p<T> pVar) {
        if (this.f275d == null) {
            this.f275d = pVar;
            this.f274c.post(new q(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
