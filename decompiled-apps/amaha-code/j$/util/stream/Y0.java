package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y0 extends U2 implements E0, A0 {
    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 a(int i6) {
        a(i6);
        throw null;
    }

    @Override // j$.util.stream.U2, java.util.function.DoubleConsumer
    public final void accept(double d10) {
        super.accept(d10);
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

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final E0 build() {
        return this;
    }

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final I0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        clear();
        r(j10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void end() {
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final void f(Object obj, int i6) {
        super.f((double[]) obj, i6);
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.P(this, j10, j11);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return AbstractC0850z0.I(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.U2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.O spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.U2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.S spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.U2
    public final j$.util.F u() {
        return super.spliterator();
    }

    @Override // j$.util.stream.I0
    /* renamed from: v */
    public final /* synthetic */ void j(Double[] dArr, int i6) {
        AbstractC0850z0.J(this, dArr, i6);
    }
}
