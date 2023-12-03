package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class d0 implements I {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f21192a;

    /* renamed from: b  reason: collision with root package name */
    private int f21193b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21194c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21195d;

    public d0(int[] iArr, int i6, int i10, int i11) {
        this.f21192a = iArr;
        this.f21193b = i6;
        this.f21194c = i10;
        this.f21195d = i11 | 64 | 16384;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return this.f21195d;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21194c - this.f21193b;
    }

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i6;
        intConsumer.getClass();
        int[] iArr = this.f21192a;
        int length = iArr.length;
        int i10 = this.f21194c;
        if (length < i10 || (i6 = this.f21193b) < 0) {
            return;
        }
        this.f21193b = i10;
        if (i6 < i10) {
            do {
                intConsumer.accept(iArr[i6]);
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

    @Override // j$.util.I, j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i6 = this.f21193b;
        if (i6 < 0 || i6 >= this.f21194c) {
            return false;
        }
        this.f21193b = i6 + 1;
        intConsumer.accept(this.f21192a[i6]);
        return true;
    }

    @Override // j$.util.I, j$.util.O, j$.util.S
    public final I trySplit() {
        int i6 = this.f21193b;
        int i10 = (this.f21194c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f21193b = i10;
        return new d0(this.f21192a, i6, i10, this.f21195d);
    }
}
