package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class M implements O {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f21091a;

    private /* synthetic */ M(Spliterator.OfPrimitive ofPrimitive) {
        this.f21091a = ofPrimitive;
    }

    public static /* synthetic */ O a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof N ? ((N) ofPrimitive).f21092a : ofPrimitive instanceof Spliterator.OfDouble ? D.a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? G.a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? J.a((Spliterator.OfLong) ofPrimitive) : new M(ofPrimitive);
    }

    @Override // j$.util.S
    public final /* synthetic */ int characteristics() {
        return this.f21091a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof M) {
            obj = ((M) obj).f21091a;
        }
        return this.f21091a.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ long estimateSize() {
        return this.f21091a.estimateSize();
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21091a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21091a.forEachRemaining(consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21091a.getComparator();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21091a.getExactSizeIfKnown();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21091a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21091a.hashCode();
    }

    @Override // j$.util.O
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f21091a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21091a.tryAdvance(consumer);
    }

    @Override // j$.util.O, j$.util.S
    public final /* synthetic */ O trySplit() {
        return a(this.f21091a.trySplit());
    }

    @Override // j$.util.O, j$.util.S
    public final /* synthetic */ S trySplit() {
        return P.a(this.f21091a.trySplit());
    }
}
