package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0768h1 extends W2 implements F0, B0 {
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

    @Override // j$.util.stream.W2, java.util.function.IntConsumer
    public final void accept(int i6) {
        super.accept(i6);
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

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final I0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        clear();
        r(j10);
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
    public final void end() {
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final void f(Object obj, int i6) {
        super.f((int[]) obj, i6);
    }

    @Override // j$.util.stream.AbstractC0735a3, j$.util.stream.H0
    public final void g(Object obj) {
        super.g((IntConsumer) obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.Q(this, j10, j11);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return AbstractC0850z0.I(this, intFunction);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.W2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.O spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.W2, j$.util.stream.AbstractC0735a3, java.lang.Iterable
    public final j$.util.S spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.W2
    public final j$.util.I u() {
        return super.spliterator();
    }

    @Override // j$.util.stream.I0
    /* renamed from: v */
    public final /* synthetic */ void j(Integer[] numArr, int i6) {
        AbstractC0850z0.K(this, numArr, i6);
    }
}
