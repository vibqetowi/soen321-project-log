package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D3 extends E3 implements j$.util.S {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(j$.util.S s10, long j10, long j11) {
        super(s10, j10, j11, 0L, Math.min(s10.estimateSize(), j11));
    }

    private D3(j$.util.S s10, long j10, long j11, long j12, long j13) {
        super(s10, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.S a(j$.util.S s10, long j10, long j11, long j12, long j13) {
        return new D3(s10, j10, j11, j12, j13);
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f21278e;
        long j11 = this.f21274a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f21277d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && this.f21276c.estimateSize() + j12 <= this.f21275b) {
            this.f21276c.forEachRemaining(consumer);
            this.f21277d = this.f21278e;
            return;
        }
        while (j11 > this.f21277d) {
            this.f21276c.tryAdvance(new O0(8));
            this.f21277d++;
        }
        while (this.f21277d < this.f21278e) {
            this.f21276c.tryAdvance(consumer);
            this.f21277d++;
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

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
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
            this.f21276c.tryAdvance(new O0(9));
            this.f21277d++;
        }
        if (j10 >= this.f21278e) {
            return false;
        }
        this.f21277d = j10 + 1;
        return this.f21276c.tryAdvance(consumer);
    }
}
