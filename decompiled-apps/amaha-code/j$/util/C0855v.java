package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0855v implements PrimitiveIterator.OfInt {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0856w f21614a;

    private /* synthetic */ C0855v(InterfaceC0856w interfaceC0856w) {
        this.f21614a = interfaceC0856w;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC0856w interfaceC0856w) {
        if (interfaceC0856w == null) {
            return null;
        }
        return interfaceC0856w instanceof C0854u ? ((C0854u) interfaceC0856w).f21613a : new C0855v(interfaceC0856w);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0856w interfaceC0856w = this.f21614a;
        if (obj instanceof C0855v) {
            obj = ((C0855v) obj).f21614a;
        }
        return interfaceC0856w.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f21614a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21614a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f21614a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21614a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21614a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f21614a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21614a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f21614a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21614a.remove();
    }
}
