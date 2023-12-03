package cs;

import cs.f;
import io.grpc.h;
import java.util.List;
import nc.f;
/* compiled from: ForwardingSubchannel.java */
/* loaded from: classes2.dex */
public abstract class c extends h.g {
    @Override // io.grpc.h.g
    public final List<io.grpc.d> b() {
        return ((f.h) this).f11989a.b();
    }

    @Override // io.grpc.h.g
    public final Object d() {
        return ((f.h) this).f11989a.d();
    }

    @Override // io.grpc.h.g
    public final void e() {
        ((f.h) this).f11989a.e();
    }

    @Override // io.grpc.h.g
    public final void f() {
        ((f.h) this).f11989a.f();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(((f.h) this).f11989a, "delegate");
        return c10.toString();
    }
}
