package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class a0 extends AbstractC0714b implements I {
    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.I
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.S
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }

    @Override // j$.util.I
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // j$.util.AbstractC0714b, j$.util.F, j$.util.O, j$.util.S
    public final /* bridge */ /* synthetic */ I trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0714b, j$.util.F, j$.util.O, j$.util.S
    public final /* bridge */ /* synthetic */ O trySplit() {
        return null;
    }
}
