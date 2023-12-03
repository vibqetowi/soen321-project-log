package vr;

import java.util.Arrays;
import java.util.Set;
import nc.f;
import tr.i0;
/* compiled from: HedgingPolicy.java */
/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f36100a;

    /* renamed from: b  reason: collision with root package name */
    public final long f36101b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.common.collect.u f36102c;

    public w0(int i6, long j10, Set<i0.a> set) {
        this.f36100a = i6;
        this.f36101b = j10;
        this.f36102c = com.google.common.collect.u.z(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f36100a == w0Var.f36100a && this.f36101b == w0Var.f36101b && f6.b.v0(this.f36102c, w0Var.f36102c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36100a), Long.valueOf(this.f36101b), this.f36102c});
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.a(this.f36100a, "maxAttempts");
        c10.b(this.f36101b, "hedgingDelayNanos");
        c10.c(this.f36102c, "nonFatalStatusCodes");
        return c10.toString();
    }
}
