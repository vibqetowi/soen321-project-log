package j$.util.concurrent;

import j$.util.AbstractC0714b;
import j$.util.F;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class x implements F {

    /* renamed from: a  reason: collision with root package name */
    long f21178a;

    /* renamed from: b  reason: collision with root package name */
    final long f21179b;

    /* renamed from: c  reason: collision with root package name */
    final double f21180c;

    /* renamed from: d  reason: collision with root package name */
    final double f21181d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(long j10, long j11, double d10, double d11) {
        this.f21178a = j10;
        this.f21179b = j11;
        this.f21180c = d10;
        this.f21181d = d11;
    }

    @Override // j$.util.F, j$.util.O, j$.util.S
    /* renamed from: a */
    public final x trySplit() {
        long j10 = this.f21178a;
        long j11 = (this.f21179b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f21178a = j11;
        return new x(j10, j11, this.f21180c, this.f21181d);
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21179b - this.f21178a;
    }

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.a(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f21178a;
        long j11 = this.f21179b;
        if (j10 < j11) {
            this.f21178a = j11;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.c(this.f21180c, this.f21181d));
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

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.h(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f21178a;
        if (j10 < this.f21179b) {
            doubleConsumer.accept(ThreadLocalRandom.current().c(this.f21180c, this.f21181d));
            this.f21178a = j10 + 1;
            return true;
        }
        return false;
    }
}
