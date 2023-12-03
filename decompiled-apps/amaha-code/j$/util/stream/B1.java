package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
final class B1 extends V1 implements U1, InterfaceC0814q2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f21252b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f21253c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f21254d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(Supplier supplier, ObjLongConsumer objLongConsumer, BinaryOperator binaryOperator) {
        this.f21252b = supplier;
        this.f21253c = objLongConsumer;
        this.f21254d = binaryOperator;
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
        this.f21253c.accept(this.f21399a, j10);
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
        this.f21399a = this.f21252b.get();
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
        this.f21399a = this.f21254d.apply(this.f21399a, ((B1) u12).f21399a);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
