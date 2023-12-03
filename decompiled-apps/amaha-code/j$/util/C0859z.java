package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0859z implements PrimitiveIterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ A f21617a;

    private /* synthetic */ C0859z(A a10) {
        this.f21617a = a10;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(A a10) {
        if (a10 == null) {
            return null;
        }
        return a10 instanceof C0858y ? ((C0858y) a10).f21616a : new C0859z(a10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        A a10 = this.f21617a;
        if (obj instanceof C0859z) {
            obj = ((C0859z) obj).f21617a;
        }
        return a10.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f21617a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21617a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f21617a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21617a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21617a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f21617a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21617a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f21617a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21617a.remove();
    }
}
