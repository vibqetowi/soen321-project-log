package vr;

import java.util.Arrays;
import java.util.Set;
import nc.f;
import tr.i0;
/* compiled from: RetryPolicy.java */
/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f36118a;

    /* renamed from: b  reason: collision with root package name */
    public final long f36119b;

    /* renamed from: c  reason: collision with root package name */
    public final long f36120c;

    /* renamed from: d  reason: collision with root package name */
    public final double f36121d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f36122e;
    public final com.google.common.collect.u f;

    public x2(int i6, long j10, long j11, double d10, Long l2, Set<i0.a> set) {
        this.f36118a = i6;
        this.f36119b = j10;
        this.f36120c = j11;
        this.f36121d = d10;
        this.f36122e = l2;
        this.f = com.google.common.collect.u.z(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        if (this.f36118a != x2Var.f36118a || this.f36119b != x2Var.f36119b || this.f36120c != x2Var.f36120c || Double.compare(this.f36121d, x2Var.f36121d) != 0 || !f6.b.v0(this.f36122e, x2Var.f36122e) || !f6.b.v0(this.f, x2Var.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36118a), Long.valueOf(this.f36119b), Long.valueOf(this.f36120c), Double.valueOf(this.f36121d), this.f36122e, this.f});
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.a(this.f36118a, "maxAttempts");
        c10.b(this.f36119b, "initialBackoffNanos");
        c10.b(this.f36120c, "maxBackoffNanos");
        c10.e(String.valueOf(this.f36121d), "backoffMultiplier");
        c10.c(this.f36122e, "perAttemptRecvTimeoutNanos");
        c10.c(this.f, "retryableStatusCodes");
        return c10.toString();
    }
}
