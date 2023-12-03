package j$.util;

import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class X implements S {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f21109a;

    /* renamed from: b  reason: collision with root package name */
    private int f21110b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21111c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21112d;

    public X(Object[] objArr, int i6, int i10, int i11) {
        this.f21109a = objArr;
        this.f21110b = i6;
        this.f21111c = i10;
        this.f21112d = i11 | 64 | 16384;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return this.f21112d;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        return this.f21111c - this.f21110b;
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        int i6;
        consumer.getClass();
        Object[] objArr = this.f21109a;
        int length = objArr.length;
        int i10 = this.f21111c;
        if (length < i10 || (i6 = this.f21110b) < 0) {
            return;
        }
        this.f21110b = i10;
        if (i6 < i10) {
            do {
                consumer.accept(objArr[i6]);
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

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i6 = this.f21110b;
        if (i6 < 0 || i6 >= this.f21111c) {
            return false;
        }
        this.f21110b = i6 + 1;
        consumer.accept(this.f21109a[i6]);
        return true;
    }

    @Override // j$.util.S
    public final S trySplit() {
        int i6 = this.f21110b;
        int i10 = (this.f21111c + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f21110b = i10;
        return new X(this.f21109a, i6, i10, this.f21112d);
    }
}
