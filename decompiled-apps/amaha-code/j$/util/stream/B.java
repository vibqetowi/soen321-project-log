package j$.util.stream;

import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B extends E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B(j$.util.S s10, int i6) {
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

    @Override // j$.util.stream.E, j$.util.stream.H
    public final void forEach(DoubleConsumer doubleConsumer) {
        j$.util.F c12;
        if (isParallel()) {
            super.forEach(doubleConsumer);
            return;
        }
        c12 = E.c1(Y0());
        c12.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.stream.E, j$.util.stream.H
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        j$.util.F c12;
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
            return;
        }
        c12 = E.c1(Y0());
        c12.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ H parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ H sequential() {
        sequential();
        return this;
    }
}
