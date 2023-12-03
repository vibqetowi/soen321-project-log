package cs;

import io.grpc.h;
import io.grpc.l;
import java.util.Map;
/* compiled from: SecretRoundRobinLoadBalancerProvider.java */
/* loaded from: classes2.dex */
public final class i extends io.grpc.i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f12010b = 0;

    @Override // io.grpc.h.b
    public final io.grpc.h a(h.c cVar) {
        return new h(cVar);
    }

    @Override // io.grpc.i
    public String b() {
        return "round_robin";
    }

    @Override // io.grpc.i
    public int c() {
        return 5;
    }

    @Override // io.grpc.i
    public boolean d() {
        return true;
    }

    @Override // io.grpc.i
    public l.b e(Map<String, ?> map) {
        return new l.b("no service config");
    }
}
