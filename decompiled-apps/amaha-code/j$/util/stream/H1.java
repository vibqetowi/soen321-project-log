package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
final class H1 extends V1 implements U1, InterfaceC0804o2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f21288b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f21289c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f21290d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BinaryOperator binaryOperator) {
        this.f21288b = supplier;
        this.f21289c = objDoubleConsumer;
        this.f21290d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        this.f21289c.accept(this.f21399a, d10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21399a = this.f21288b.get();
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
        this.f21399a = this.f21290d.apply(this.f21399a, ((H1) u12).f21399a);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
