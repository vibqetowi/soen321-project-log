package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0729q implements InterfaceC0730s, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f21245a;

    private /* synthetic */ C0729q(PrimitiveIterator.OfDouble ofDouble) {
        this.f21245a = ofDouble;
    }

    public static /* synthetic */ InterfaceC0730s a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof r ? ((r) ofDouble).f21246a : new C0729q(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0729q) {
            obj = ((C0729q) obj).f21245a;
        }
        return this.f21245a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21245a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.InterfaceC0730s, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21245a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.InterfaceC0730s
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f21245a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21245a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21245a.hashCode();
    }

    @Override // j$.util.InterfaceC0730s, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f21245a.next();
    }

    @Override // j$.util.InterfaceC0730s, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21245a.next();
    }

    @Override // j$.util.InterfaceC0730s
    public final /* synthetic */ double nextDouble() {
        return this.f21245a.nextDouble();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21245a.remove();
    }
}
