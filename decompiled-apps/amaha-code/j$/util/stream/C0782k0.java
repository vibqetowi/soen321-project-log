package j$.util.stream;

import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0782k0 extends AbstractC0797n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0782k0(j$.util.S s10, int i6) {
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

    @Override // j$.util.stream.AbstractC0797n0, j$.util.stream.InterfaceC0812q0
    public final void forEach(LongConsumer longConsumer) {
        j$.util.L c12;
        if (isParallel()) {
            super.forEach(longConsumer);
            return;
        }
        c12 = AbstractC0797n0.c1(Y0());
        c12.forEachRemaining(longConsumer);
    }

    @Override // j$.util.stream.AbstractC0797n0, j$.util.stream.InterfaceC0812q0
    public final void forEachOrdered(LongConsumer longConsumer) {
        j$.util.L c12;
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
            return;
        }
        c12 = AbstractC0797n0.c1(Y0());
        c12.forEachRemaining(longConsumer);
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ InterfaceC0812q0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0741c, j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* bridge */ /* synthetic */ InterfaceC0812q0 sequential() {
        sequential();
        return this;
    }
}
