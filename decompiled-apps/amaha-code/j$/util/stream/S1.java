package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class S1 implements U1, InterfaceC0814q2 {

    /* renamed from: a  reason: collision with root package name */
    private long f21377a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f21378b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f21379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S1(long j10, LongBinaryOperator longBinaryOperator) {
        this.f21378b = j10;
        this.f21379c = longBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21377a = ((Y) this.f21379c).b(this.f21377a, j10);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21377a = this.f21378b;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f21377a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((S1) u12).f21377a);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
