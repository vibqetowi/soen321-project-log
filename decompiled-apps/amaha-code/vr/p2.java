package vr;

import io.grpc.h;
import java.util.Arrays;
/* compiled from: PickSubchannelArgsImpl.java */
/* loaded from: classes2.dex */
public final class p2 extends h.e {

    /* renamed from: a  reason: collision with root package name */
    public final io.grpc.b f35840a;

    /* renamed from: b  reason: collision with root package name */
    public final tr.c0 f35841b;

    /* renamed from: c  reason: collision with root package name */
    public final tr.d0<?, ?> f35842c;

    public p2(tr.d0<?, ?> d0Var, tr.c0 c0Var, io.grpc.b bVar) {
        sc.b.w(d0Var, "method");
        this.f35842c = d0Var;
        sc.b.w(c0Var, "headers");
        this.f35841b = c0Var;
        sc.b.w(bVar, "callOptions");
        this.f35840a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p2.class != obj.getClass()) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (f6.b.v0(this.f35840a, p2Var.f35840a) && f6.b.v0(this.f35841b, p2Var.f35841b) && f6.b.v0(this.f35842c, p2Var.f35842c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35840a, this.f35841b, this.f35842c});
    }

    public final String toString() {
        return "[method=" + this.f35842c + " headers=" + this.f35841b + " callOptions=" + this.f35840a + "]";
    }
}
