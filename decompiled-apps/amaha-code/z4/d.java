package z4;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import d5.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestFutureTarget.java */
/* loaded from: classes.dex */
public final class d<R> implements Future, a5.h, e<R> {
    public boolean A;
    public GlideException B;

    /* renamed from: u  reason: collision with root package name */
    public final int f39160u;

    /* renamed from: v  reason: collision with root package name */
    public final int f39161v;

    /* renamed from: w  reason: collision with root package name */
    public R f39162w;

    /* renamed from: x  reason: collision with root package name */
    public b f39163x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39164y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f39165z;

    /* compiled from: RequestFutureTarget.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public d(int i6, int i10) {
        this.f39160u = i6;
        this.f39161v = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.e
    public final synchronized void a(Object obj) {
        this.f39165z = true;
        this.f39162w = obj;
        notifyAll();
    }

    @Override // z4.e
    public final synchronized void b(GlideException glideException) {
        this.A = true;
        this.B = glideException;
        notifyAll();
    }

    @Override // a5.h
    public final synchronized void c(h hVar) {
        this.f39163x = hVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f39164y = true;
            notifyAll();
            b bVar = null;
            if (z10) {
                b bVar2 = this.f39163x;
                this.f39163x = null;
                bVar = bVar2;
            }
            if (bVar != null) {
                bVar.clear();
            }
            return true;
        }
    }

    @Override // a5.h
    public final void e(a5.g gVar) {
        gVar.a(this.f39160u, this.f39161v);
    }

    @Override // a5.h
    public final synchronized void f(Object obj) {
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return o(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // a5.h
    public final synchronized void h(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f39164y;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z10;
        if (!this.f39164y && !this.f39165z) {
            if (!this.A) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    @Override // a5.h
    public final synchronized b l() {
        return this.f39163x;
    }

    public final synchronized R o(Long l2) {
        boolean z10;
        if (!isDone()) {
            char[] cArr = j.f12201a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (!this.f39164y) {
            if (!this.A) {
                if (this.f39165z) {
                    return this.f39162w;
                }
                if (l2 == null) {
                    wait(0L);
                } else if (l2.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l2.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.A) {
                        if (!this.f39164y) {
                            if (this.f39165z) {
                                return this.f39162w;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.B);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.B);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return o(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // w4.g
    public final void g() {
    }

    @Override // w4.g
    public final void i() {
    }

    @Override // w4.g
    public final void n() {
    }

    @Override // a5.h
    public final void j(a5.g gVar) {
    }

    @Override // a5.h
    public final void k(Drawable drawable) {
    }

    @Override // a5.h
    public final void m(Drawable drawable) {
    }
}
