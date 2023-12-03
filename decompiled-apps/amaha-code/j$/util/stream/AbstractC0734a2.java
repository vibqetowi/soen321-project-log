package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0734a2 extends V1 implements U1 {

    /* renamed from: b  reason: collision with root package name */
    long f21420b;

    public /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21420b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f21420b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f21420b += ((AbstractC0734a2) u12).f21420b;
    }
}
