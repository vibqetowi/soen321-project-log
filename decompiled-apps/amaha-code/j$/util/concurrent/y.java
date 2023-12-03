package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.I;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class y implements I {

    /* renamed from: a  reason: collision with root package name */
    long f21182a;

    /* renamed from: b  reason: collision with root package name */
    final long f21183b;

    /* renamed from: c  reason: collision with root package name */
    final int f21184c;

    /* renamed from: d  reason: collision with root package name */
    final int f21185d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j10, long j11, int i6, int i10) {
        this.f21182a = j10;
        this.f21183b = j11;
        this.f21184c = i6;
        this.f21185d = i10;
    }

    @Override // j$.util.I, j$.util.O, j$.util.S
    /* renamed from: a */
    public final y trySplit() {
        long j10 = this.f21182a;
        long j11 = (this.f21183b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f21182a = j11;
        return new y(j10, j11, this.f21184c, this.f21185d);
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21183b - this.f21182a;
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f21182a;
        long j11 = this.f21183b;
        if (j10 < j11) {
            this.f21182a = j11;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f21184c, this.f21185d));
                j10++;
            } while (j10 < j11);
        }
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f21182a;
        if (j10 < this.f21183b) {
            intConsumer.accept(ThreadLocalRandom.current().d(this.f21184c, this.f21185d));
            this.f21182a = j10 + 1;
            return true;
        }
        return false;
    }
}
