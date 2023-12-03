package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class P implements S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Spliterator f21095a;

    private /* synthetic */ P(Spliterator spliterator) {
        this.f21095a = spliterator;
    }

    public static /* synthetic */ S a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Q ? ((Q) spliterator).f21096a : spliterator instanceof Spliterator.OfPrimitive ? M.a((Spliterator.OfPrimitive) spliterator) : new P(spliterator);
    }

    @Override // j$.util.S
    public final /* synthetic */ int characteristics() {
        return this.f21095a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof P) {
            obj = ((P) obj).f21095a;
        }
        return this.f21095a.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ long estimateSize() {
        return this.f21095a.estimateSize();
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21095a.forEachRemaining(consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21095a.getComparator();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21095a.getExactSizeIfKnown();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21095a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21095a.hashCode();
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21095a.tryAdvance(consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ S trySplit() {
        return a(this.f21095a.trySplit());
    }
}
