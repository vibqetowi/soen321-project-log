package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0854u implements InterfaceC0856w, Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f21613a;

    private /* synthetic */ C0854u(PrimitiveIterator.OfInt ofInt) {
        this.f21613a = ofInt;
    }

    public static /* synthetic */ InterfaceC0856w a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0855v ? ((C0855v) ofInt).f21614a : new C0854u(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0854u) {
            obj = ((C0854u) obj).f21613a;
        }
        return this.f21613a.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21613a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.InterfaceC0856w, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21613a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.InterfaceC0856w
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f21613a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21613a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21613a.hashCode();
    }

    @Override // j$.util.InterfaceC0856w, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f21613a.next();
    }

    @Override // j$.util.InterfaceC0856w, java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21613a.next();
    }

    @Override // j$.util.InterfaceC0856w
    public final /* synthetic */ int nextInt() {
        return this.f21613a.nextInt();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21613a.remove();
    }
}
