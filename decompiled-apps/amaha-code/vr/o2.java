package vr;

import io.grpc.h;
import io.grpc.l;
import java.util.Map;
/* compiled from: PickFirstLoadBalancerProvider.java */
/* loaded from: classes2.dex */
public final class o2 extends io.grpc.i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f35806b = 0;

    @Override // io.grpc.h.b
    public final io.grpc.h a(h.c cVar) {
        return new n2(cVar);
    }

    @Override // io.grpc.i
    public String b() {
        return "pick_first";
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
