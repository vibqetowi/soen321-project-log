package nd;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f26059a;

    /* renamed from: b  reason: collision with root package name */
    public ya.h<Void> f26060b = ya.k.e(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f26061c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f26062d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f26062d.set(Boolean.TRUE);
        }
    }

    public g(Executor executor) {
        this.f26059a = executor;
        executor.execute(new a());
    }

    public final <T> ya.h<T> a(Callable<T> callable) {
        ya.h<T> hVar;
        synchronized (this.f26061c) {
            hVar = (ya.h<T>) this.f26060b.continueWith(this.f26059a, new i(callable));
            this.f26060b = hVar.continueWith(this.f26059a, new f6.b());
        }
        return hVar;
    }

    public final <T> ya.h<T> b(Callable<ya.h<T>> callable) {
        ya.h<T> hVar;
        synchronized (this.f26061c) {
            hVar = (ya.h<T>) this.f26060b.continueWithTask(this.f26059a, new i(callable));
            this.f26060b = hVar.continueWith(this.f26059a, new f6.b());
        }
        return hVar;
    }
}
