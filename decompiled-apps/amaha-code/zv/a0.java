package zv;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: Timeout.kt */
/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39875d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f39876a;

    /* renamed from: b  reason: collision with root package name */
    public long f39877b;

    /* renamed from: c  reason: collision with root package name */
    public long f39878c;

    public a0 a() {
        this.f39876a = false;
        return this;
    }

    public a0 b() {
        this.f39878c = 0L;
        return this;
    }

    public long c() {
        if (this.f39876a) {
            return this.f39877b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j10) {
        this.f39876a = true;
        this.f39877b = j10;
        return this;
    }

    public boolean e() {
        return this.f39876a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f39876a && this.f39877b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public a0 g(long j10, TimeUnit unit) {
        boolean z10;
        kotlin.jvm.internal.i.g(unit, "unit");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f39878c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "timeout < 0: ").toString());
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a0 {
        @Override // zv.a0
        public final a0 g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.i.g(unit, "unit");
            return this;
        }

        @Override // zv.a0
        public final void f() {
        }

        @Override // zv.a0
        public final a0 d(long j10) {
            return this;
        }
    }
}
