package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
abstract class C3 extends E3 implements j$.util.O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(j$.util.O o10, long j10, long j11) {
        super(o10, j10, j11, 0L, Math.min(o10.estimateSize(), j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(j$.util.O o10, long j10, long j11, long j12, long j13) {
        super(o10, j10, j11, j12, j13);
    }

    protected abstract Object b();

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f21278e;
        long j11 = this.f21274a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f21277d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && ((j$.util.O) this.f21276c).estimateSize() + j12 <= this.f21275b) {
            ((j$.util.O) this.f21276c).forEachRemaining(obj);
            this.f21277d = this.f21278e;
            return;
        }
        while (j11 > this.f21277d) {
            ((j$.util.O) this.f21276c).tryAdvance(b());
            this.f21277d++;
        }
        while (this.f21277d < this.f21278e) {
            ((j$.util.O) this.f21276c).tryAdvance(obj);
            this.f21277d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
        long j11 = this.f21278e;
        long j12 = this.f21274a;
        if (j12 >= j11) {
            return false;
        }
        while (true) {
            j10 = this.f21277d;
            if (j12 <= j10) {
                break;
            }
            ((j$.util.O) this.f21276c).tryAdvance(b());
            this.f21277d++;
        }
        if (j10 >= this.f21278e) {
            return false;
        }
        this.f21277d = j10 + 1;
        return ((j$.util.O) this.f21276c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
