package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class D1 implements U1, InterfaceC0804o2 {

    /* renamed from: a  reason: collision with root package name */
    private double f21265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f21266b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f21267c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D1(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        this.f21266b = d10;
        this.f21267c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        this.f21265a = ((O0) this.f21267c).g(this.f21265a, d10);
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
        this.f21265a = this.f21266b;
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
        return Double.valueOf(this.f21265a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((D1) u12).f21265a);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
