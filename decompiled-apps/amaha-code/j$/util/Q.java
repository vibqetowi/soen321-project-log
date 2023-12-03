package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class Q implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f21096a;

    private /* synthetic */ Q(S s10) {
        this.f21096a = s10;
    }

    public static /* synthetic */ Spliterator a(S s10) {
        if (s10 == null) {
            return null;
        }
        return s10 instanceof P ? ((P) s10).f21095a : s10 instanceof O ? N.a((O) s10) : new Q(s10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f21096a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        S s10 = this.f21096a;
        if (obj instanceof Q) {
            obj = ((Q) obj).f21096a;
        }
        return s10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f21096a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21096a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21096a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21096a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21096a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21096a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21096a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return a(this.f21096a.trySplit());
    }
}
