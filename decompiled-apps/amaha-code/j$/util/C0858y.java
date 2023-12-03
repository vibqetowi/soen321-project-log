package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0858y implements A, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f21616a;

    private /* synthetic */ C0858y(PrimitiveIterator.OfLong ofLong) {
        this.f21616a = ofLong;
    }

    public static /* synthetic */ A a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0859z ? ((C0859z) ofLong).f21617a : new C0858y(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0858y) {
            obj = ((C0858y) obj).f21616a;
        }
        return this.f21616a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21616a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21616a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f21616a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21616a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21616a.hashCode();
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f21616a.next();
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21616a.next();
    }

    @Override // j$.util.A
    public final /* synthetic */ long nextLong() {
        return this.f21616a.nextLong();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21616a.remove();
    }
}
