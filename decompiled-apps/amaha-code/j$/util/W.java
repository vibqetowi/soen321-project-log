package j$.util;

import j$.time.AbstractC0689a;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class W implements InterfaceC0730s, DoubleConsumer, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f21106a = false;

    /* renamed from: b  reason: collision with root package name */
    double f21107b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F f21108c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(F f) {
        this.f21108c = f;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f21106a = true;
        this.f21107b = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.InterfaceC0730s, java.util.Iterator, j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (i0.f21234a) {
            i0.a(W.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C0728p(consumer));
    }

    @Override // j$.util.B
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f21106a) {
            this.f21108c.tryAdvance((DoubleConsumer) this);
        }
        return this.f21106a;
    }

    @Override // j$.util.InterfaceC0730s, java.util.Iterator, j$.util.Iterator
    public final Double next() {
        if (i0.f21234a) {
            i0.a(W.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.InterfaceC0730s
    public final double nextDouble() {
        if (this.f21106a || hasNext()) {
            this.f21106a = false;
            return this.f21107b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
