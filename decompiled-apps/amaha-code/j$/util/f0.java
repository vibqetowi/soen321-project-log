package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class f0 implements L {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f21205a;

    /* renamed from: b  reason: collision with root package name */
    private int f21206b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21207c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21208d;

    public f0(long[] jArr, int i6, int i10, int i11) {
        this.f21205a = jArr;
        this.f21206b = i6;
        this.f21207c = i10;
        this.f21208d = i11 | 64 | 16384;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return this.f21208d;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21207c - this.f21206b;
    }

    @Override // j$.util.L, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.c(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i6;
        longConsumer.getClass();
        long[] jArr = this.f21205a;
        int length = jArr.length;
        int i10 = this.f21207c;
        if (length < i10 || (i6 = this.f21206b) < 0) {
            return;
        }
        this.f21206b = i10;
        if (i6 < i10) {
            do {
                longConsumer.accept(jArr[i6]);
                i6++;
            } while (i6 < i10);
        }
    }

    @Override // j$.util.S
    public final java.util.Comparator getComparator() {
        if (AbstractC0714b.e(this, 4)) {
            return null;
        }
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
        int i6 = this.f21206b;
        if (i6 < 0 || i6 >= this.f21207c) {
            return false;
        }
        this.f21206b = i6 + 1;
        longConsumer.accept(this.f21205a[i6]);
        return true;
    }

    @Override // j$.util.L, j$.util.O, j$.util.S
    public final L trySplit() {
        int i6 = this.f21206b;
        int i10 = (this.f21207c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f21206b = i10;
        return new f0(this.f21205a, i6, i10, this.f21208d);
    }
}
