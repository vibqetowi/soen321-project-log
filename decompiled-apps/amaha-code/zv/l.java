package zv;

import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes2.dex */
public final class l extends a0 {

    /* renamed from: e  reason: collision with root package name */
    public a0 f39894e;

    public l(a0 delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f39894e = delegate;
    }

    @Override // zv.a0
    public final a0 a() {
        return this.f39894e.a();
    }

    @Override // zv.a0
    public final a0 b() {
        return this.f39894e.b();
    }

    @Override // zv.a0
    public final long c() {
        return this.f39894e.c();
    }

    @Override // zv.a0
    public final a0 d(long j10) {
        return this.f39894e.d(j10);
    }

    @Override // zv.a0
    public final boolean e() {
        return this.f39894e.e();
    }

    @Override // zv.a0
    public final void f() {
        this.f39894e.f();
    }

    @Override // zv.a0
    public final a0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.i.g(unit, "unit");
        return this.f39894e.g(j10, unit);
    }
}
