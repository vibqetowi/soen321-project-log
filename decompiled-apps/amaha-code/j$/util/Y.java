package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class Y implements F {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f21113a;

    /* renamed from: b  reason: collision with root package name */
    private int f21114b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21115c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21116d;

    public Y(double[] dArr, int i6, int i10, int i11) {
        this.f21113a = dArr;
        this.f21114b = i6;
        this.f21115c = i10;
        this.f21116d = i11 | 64 | 16384;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return this.f21116d;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21115c - this.f21114b;
    }

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.a(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i6;
        doubleConsumer.getClass();
        double[] dArr = this.f21113a;
        int length = dArr.length;
        int i10 = this.f21115c;
        if (length < i10 || (i6 = this.f21114b) < 0) {
            return;
        }
        this.f21114b = i10;
        if (i6 < i10) {
            do {
                doubleConsumer.accept(dArr[i6]);
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

    @Override // j$.util.F, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.h(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i6 = this.f21114b;
        if (i6 < 0 || i6 >= this.f21115c) {
            return false;
        }
        this.f21114b = i6 + 1;
        doubleConsumer.accept(this.f21113a[i6]);
        return true;
    }

    @Override // j$.util.F, j$.util.O, j$.util.S
    public final F trySplit() {
        int i6 = this.f21114b;
        int i10 = (this.f21115c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f21114b = i10;
        return new Y(this.f21113a, i6, i10, this.f21116d);
    }
}
