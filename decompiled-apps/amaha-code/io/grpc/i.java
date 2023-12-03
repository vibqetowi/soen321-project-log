package io.grpc;

import io.grpc.h;
import io.grpc.l;
import java.util.Map;
import nc.f;
/* compiled from: LoadBalancerProvider.java */
/* loaded from: classes2.dex */
public abstract class i extends h.b {

    /* renamed from: a  reason: collision with root package name */
    public static final l.b f20478a = new l.b(new a());

    /* compiled from: LoadBalancerProvider.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public l.b e(Map<String, ?> map) {
        return f20478a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(b(), "policy");
        c10.a(c(), "priority");
        c10.d("available", d());
        return c10.toString();
    }
}
