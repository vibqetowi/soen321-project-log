package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
final class R1 extends V1 implements U1, InterfaceC0809p2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f21371b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f21372c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f21373d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(Supplier supplier, ObjIntConsumer objIntConsumer, BinaryOperator binaryOperator) {
        this.f21371b = supplier;
        this.f21372c = objIntConsumer;
        this.f21373d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        this.f21372c.accept(this.f21399a, i6);
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21399a = this.f21371b.get();
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        AbstractC0850z0.C(this, num);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f21399a = this.f21373d.apply(this.f21399a, ((R1) u12).f21399a);
    }
}
