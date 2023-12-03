package j$.util.stream;

import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0764g2 extends AbstractC0779j2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0764g2(j$.util.S s10, int i6, boolean z10) {
        super(s10, i6, z10);
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

    @Override // j$.util.stream.AbstractC0779j2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            Y0().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0779j2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            Y0().forEachRemaining(consumer);
        }
    }
}
