package vr;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import vr.k;
/* compiled from: ExponentialBackoffPolicy.java */
/* loaded from: classes2.dex */
public final class j0 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Random f35721a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final long f35722b;

    /* renamed from: c  reason: collision with root package name */
    public final double f35723c;

    /* renamed from: d  reason: collision with root package name */
    public final double f35724d;

    /* renamed from: e  reason: collision with root package name */
    public long f35725e;

    /* compiled from: ExponentialBackoffPolicy.java */
    /* loaded from: classes2.dex */
    public static final class a implements k.a {
    }

    public j0() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f35722b = TimeUnit.MINUTES.toNanos(2L);
        this.f35723c = 1.6d;
        this.f35724d = 0.2d;
        this.f35725e = nanos;
    }

    public final long a() {
        boolean z10;
        long j10 = this.f35725e;
        double d10 = j10;
        this.f35725e = Math.min((long) (this.f35723c * d10), this.f35722b);
        double d11 = this.f35724d;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        if (d13 >= d12) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.t(z10);
        return j10 + ((long) ((this.f35721a.nextDouble() * (d13 - d12)) + d12));
    }
}
