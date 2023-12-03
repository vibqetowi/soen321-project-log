package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.L;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class z implements L {

    /* renamed from: a  reason: collision with root package name */
    long f21186a;

    /* renamed from: b  reason: collision with root package name */
    final long f21187b;

    /* renamed from: c  reason: collision with root package name */
    final long f21188c;

    /* renamed from: d  reason: collision with root package name */
    final long f21189d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j10, long j11, long j12, long j13) {
        this.f21186a = j10;
        this.f21187b = j11;
        this.f21188c = j12;
        this.f21189d = j13;
    }

    @Override // j$.util.L, j$.util.O, j$.util.S
    /* renamed from: a */
    public final z trySplit() {
        long j10 = this.f21186a;
        long j11 = (this.f21187b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f21186a = j11;
        return new z(j10, j11, this.f21188c, this.f21189d);
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21187b - this.f21186a;
    }

    @Override // j$.util.L, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.c(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f21186a;
        long j11 = this.f21187b;
        if (j10 < j11) {
            this.f21186a = j11;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f21188c, this.f21189d));
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

    @Override // j$.util.L, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.j(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f21186a;
        if (j10 < this.f21187b) {
            longConsumer.accept(ThreadLocalRandom.current().e(this.f21188c, this.f21189d));
            this.f21186a = j10 + 1;
            return true;
        }
        return false;
    }
}
