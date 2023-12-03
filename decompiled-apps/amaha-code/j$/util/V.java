package j$.util;

import j$.time.AbstractC0689a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class V implements A, LongConsumer, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f21103a = false;

    /* renamed from: b  reason: collision with root package name */
    long f21104b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ L f21105c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(L l2) {
        this.f21105c = l2;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21103a = true;
        this.f21104b = j10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.A, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (i0.f21234a) {
            i0.a(V.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C0857x(consumer));
    }

    @Override // j$.util.B
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f21103a) {
            this.f21105c.tryAdvance((LongConsumer) this);
        }
        return this.f21103a;
    }

    @Override // j$.util.A, java.util.Iterator
    public final Long next() {
        if (i0.f21234a) {
            i0.a(V.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.A
    public final long nextLong() {
        if (this.f21103a || hasNext()) {
            this.f21103a = false;
            return this.f21104b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
