package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0813q1 extends Y2 implements G0, C0 {
    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 a(int i6) {
        a(i6);
        throw null;
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

    @Override // j$.util.stream.Y2, java.util.function.LongConsumer
    public final void accept(long j10) {
        super.accept(j10);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.C0, j$.util.stream.D0
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
        super.f((long[]) obj, i6);
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.R(this, j10, j11);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return AbstractC0850z0.I(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.Y2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.O spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.Y2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.S spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.Y2
    public final j$.util.L u() {
        return super.spliterator();
    }

    @Override // j$.util.stream.I0
    /* renamed from: v */
    public final /* synthetic */ void j(Long[] lArr, int i6) {
        AbstractC0850z0.L(this, lArr, i6);
    }
}
