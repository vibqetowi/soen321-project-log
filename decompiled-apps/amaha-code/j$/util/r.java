package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements PrimitiveIterator.OfDouble {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0730s f21246a;

    private /* synthetic */ r(InterfaceC0730s interfaceC0730s) {
        this.f21246a = interfaceC0730s;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(InterfaceC0730s interfaceC0730s) {
        if (interfaceC0730s == null) {
            return null;
        }
        return interfaceC0730s instanceof C0729q ? ((C0729q) interfaceC0730s).f21245a : new r(interfaceC0730s);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0730s interfaceC0730s = this.f21246a;
        if (obj instanceof r) {
            obj = ((r) obj).f21246a;
        }
        return interfaceC0730s.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f21246a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21246a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f21246a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21246a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21246a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f21246a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21246a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f21246a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21246a.remove();
    }
}
