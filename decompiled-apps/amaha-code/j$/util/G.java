package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class G implements I {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f21087a;

    private /* synthetic */ G(Spliterator.OfInt ofInt) {
        this.f21087a = ofInt;
    }

    public static /* synthetic */ I a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof H ? ((H) ofInt).f21088a : new G(ofInt);
    }

    @Override // j$.util.S
    public final /* synthetic */ int characteristics() {
        return this.f21087a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof G) {
            obj = ((G) obj).f21087a;
        }
        return this.f21087a.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ long estimateSize() {
        return this.f21087a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21087a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21087a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.I
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f21087a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21087a.getComparator();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21087a.getExactSizeIfKnown();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21087a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21087a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f21087a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21087a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.I
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f21087a.tryAdvance(intConsumer);
    }

    @Override // j$.util.I, j$.util.O, j$.util.S
    public final /* synthetic */ I trySplit() {
        return a(this.f21087a.trySplit());
    }

    @Override // j$.util.I, j$.util.O, j$.util.S
    public final /* synthetic */ O trySplit() {
        return M.a(this.f21087a.trySplit());
    }

    @Override // j$.util.I, j$.util.O, j$.util.S
    public final /* synthetic */ S trySplit() {
        return P.a(this.f21087a.trySplit());
    }
}
