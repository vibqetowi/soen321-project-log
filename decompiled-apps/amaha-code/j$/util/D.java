package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class D implements F {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f21080a;

    private /* synthetic */ D(Spliterator.OfDouble ofDouble) {
        this.f21080a = ofDouble;
    }

    public static /* synthetic */ F a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof E ? ((E) ofDouble).f21086a : new D(ofDouble);
    }

    @Override // j$.util.S
    public final /* synthetic */ int characteristics() {
        return this.f21080a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof D) {
            obj = ((D) obj).f21080a;
        }
        return this.f21080a.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ long estimateSize() {
        return this.f21080a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21080a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21080a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f21080a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21080a.getComparator();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21080a.getExactSizeIfKnown();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21080a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21080a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f21080a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21080a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.F
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f21080a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.F, j$.util.O, j$.util.S
    public final /* synthetic */ F trySplit() {
        return a(this.f21080a.trySplit());
    }

    @Override // j$.util.F, j$.util.O, j$.util.S
    public final /* synthetic */ O trySplit() {
        return M.a(this.f21080a.trySplit());
    }

    @Override // j$.util.F, j$.util.O, j$.util.S
    public final /* synthetic */ S trySplit() {
        return P.a(this.f21080a.trySplit());
    }
}
