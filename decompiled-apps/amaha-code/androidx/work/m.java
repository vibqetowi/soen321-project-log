package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.e1;
import x2.a;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class m<R> implements rc.b<R> {

    /* renamed from: u  reason: collision with root package name */
    public final c1 f3325u;

    /* renamed from: v  reason: collision with root package name */
    public final x2.c<R> f3326v;

    public m(e1 e1Var) {
        x2.c<R> cVar = new x2.c<>();
        this.f3325u = e1Var;
        this.f3326v = cVar;
        e1Var.k0(new l(this));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f3326v.cancel(z10);
    }

    @Override // rc.b
    public final void d(Runnable runnable, Executor executor) {
        this.f3326v.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f3326v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3326v.f37581u instanceof a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3326v.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return this.f3326v.get(j10, timeUnit);
    }
}
