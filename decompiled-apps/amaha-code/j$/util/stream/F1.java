package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0725m;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class F1 implements U1, InterfaceC0804o2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21280a;

    /* renamed from: b  reason: collision with root package name */
    private double f21281b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f21282c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f21282c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        if (this.f21280a) {
            this.f21280a = false;
        } else {
            d10 = ((O0) this.f21282c).g(this.f21281b, d10);
        }
        this.f21281b = d10;
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
        this.f21280a = true;
        this.f21281b = 0.0d;
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
        return this.f21280a ? C0725m.a() : C0725m.d(this.f21281b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        F1 f12 = (F1) u12;
        if (f12.f21280a) {
            return;
        }
        accept(f12.f21281b);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
