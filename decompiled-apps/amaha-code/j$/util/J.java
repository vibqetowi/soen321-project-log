package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class J implements L {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f21089a;

    private /* synthetic */ J(Spliterator.OfLong ofLong) {
        this.f21089a = ofLong;
    }

    public static /* synthetic */ L a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof K ? ((K) ofLong).f21090a : new J(ofLong);
    }

    @Override // j$.util.S
    public final /* synthetic */ int characteristics() {
        return this.f21089a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof J) {
            obj = ((J) obj).f21089a;
        }
        return this.f21089a.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ long estimateSize() {
        return this.f21089a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21089a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.L, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21089a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.L
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f21089a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21089a.getComparator();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21089a.getExactSizeIfKnown();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21089a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21089a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f21089a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.L, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21089a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.L
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f21089a.tryAdvance(longConsumer);
    }

    @Override // j$.util.L, j$.util.O, j$.util.S
    public final /* synthetic */ L trySplit() {
        return a(this.f21089a.trySplit());
    }

    @Override // j$.util.L, j$.util.O, j$.util.S
    public final /* synthetic */ O trySplit() {
        return M.a(this.f21089a.trySplit());
    }

    @Override // j$.util.L, j$.util.O, j$.util.S
    public final /* synthetic */ S trySplit() {
        return P.a(this.f21089a.trySplit());
    }
}
