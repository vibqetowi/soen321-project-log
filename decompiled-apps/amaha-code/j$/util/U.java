package j$.util;

import j$.time.AbstractC0689a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U implements InterfaceC0856w, IntConsumer, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f21100a = false;

    /* renamed from: b  reason: collision with root package name */
    int f21101b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ I f21102c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(I i6) {
        this.f21102c = i6;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f21100a = true;
        this.f21101b = i6;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.InterfaceC0856w, java.util.Iterator, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (i0.f21234a) {
            i0.a(U.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C0853t(consumer));
    }

    @Override // j$.util.B
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f21100a) {
            this.f21102c.tryAdvance((IntConsumer) this);
        }
        return this.f21100a;
    }

    @Override // j$.util.InterfaceC0856w, java.util.Iterator, j$.util.Iterator
    public final Integer next() {
        if (i0.f21234a) {
            i0.a(U.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.InterfaceC0856w
    public final int nextInt() {
        if (this.f21100a || hasNext()) {
            this.f21100a = false;
            return this.f21101b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
