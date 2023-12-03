package j$.util.stream;

import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0747d0 extends AbstractC0762g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0747d0(j$.util.S s10, int i6) {
        super(s10, i6);
    }

    @Override // j$.util.stream.AbstractC0741c
    final boolean V0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0762g0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.I c12;
        if (isParallel()) {
            super.forEach(intConsumer);
            return;
        }
        c12 = AbstractC0762g0.c1(Y0());
        c12.forEachRemaining(intConsumer);
    }

    @Override // j$.util.stream.AbstractC0762g0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        j$.util.I c12;
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
            return;
        }
        c12 = AbstractC0762g0.c1(Y0());
        c12.forEachRemaining(intConsumer);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
