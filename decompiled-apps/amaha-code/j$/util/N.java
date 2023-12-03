package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class N implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ O f21092a;

    private /* synthetic */ N(O o10) {
        this.f21092a = o10;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(O o10) {
        if (o10 == null) {
            return null;
        }
        return o10 instanceof M ? ((M) o10).f21091a : o10 instanceof F ? E.a((F) o10) : o10 instanceof I ? H.a((I) o10) : o10 instanceof L ? K.a((L) o10) : new N(o10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f21092a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        O o10 = this.f21092a;
        if (obj instanceof N) {
            obj = ((N) obj).f21092a;
        }
        return o10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f21092a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21092a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21092a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f21092a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f21092a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return this.f21092a.hasCharacteristics(i6);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21092a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f21092a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f21092a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f21092a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Q.a(this.f21092a.trySplit());
    }
}
