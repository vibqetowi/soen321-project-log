package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class S2 implements j$.util.S {

    /* renamed from: a  reason: collision with root package name */
    int f21380a;

    /* renamed from: b  reason: collision with root package name */
    final int f21381b;

    /* renamed from: c  reason: collision with root package name */
    int f21382c;

    /* renamed from: d  reason: collision with root package name */
    final int f21383d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f21384e;
    final /* synthetic */ C0740b3 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S2(C0740b3 c0740b3, int i6, int i10, int i11, int i12) {
        this.f = c0740b3;
        this.f21380a = i6;
        this.f21381b = i10;
        this.f21382c = i11;
        this.f21383d = i12;
        Object[][] objArr = c0740b3.f;
        this.f21384e = objArr == null ? c0740b3.f21427e : objArr[i6];
    }

    @Override // j$.util.S
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        int i6 = this.f21380a;
        int i10 = this.f21383d;
        int i11 = this.f21381b;
        if (i6 == i11) {
            return i10 - this.f21382c;
        }
        long[] jArr = this.f.f21447d;
        return ((jArr[i11] + i10) - jArr[i6]) - this.f21382c;
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        C0740b3 c0740b3;
        Objects.requireNonNull(consumer);
        int i6 = this.f21380a;
        int i10 = this.f21383d;
        int i11 = this.f21381b;
        if (i6 < i11 || (i6 == i11 && this.f21382c < i10)) {
            int i12 = this.f21382c;
            while (true) {
                c0740b3 = this.f;
                if (i6 >= i11) {
                    break;
                }
                Object[] objArr = c0740b3.f[i6];
                while (i12 < objArr.length) {
                    consumer.accept(objArr[i12]);
                    i12++;
                }
                i6++;
                i12 = 0;
            }
            Object[] objArr2 = this.f21380a == i11 ? this.f21384e : c0740b3.f[i11];
            while (i12 < i10) {
                consumer.accept(objArr2[i12]);
                i12++;
            }
            this.f21380a = i11;
            this.f21382c = i10;
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
        Objects.requireNonNull(consumer);
        int i6 = this.f21380a;
        int i10 = this.f21381b;
        if (i6 < i10 || (i6 == i10 && this.f21382c < this.f21383d)) {
            Object[] objArr = this.f21384e;
            int i11 = this.f21382c;
            this.f21382c = i11 + 1;
            consumer.accept(objArr[i11]);
            if (this.f21382c == this.f21384e.length) {
                this.f21382c = 0;
                int i12 = this.f21380a + 1;
                this.f21380a = i12;
                Object[][] objArr2 = this.f.f;
                if (objArr2 != null && i12 <= i10) {
                    this.f21384e = objArr2[i12];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.S
    public final j$.util.S trySplit() {
        int i6 = this.f21380a;
        int i10 = this.f21381b;
        if (i6 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f21382c;
            C0740b3 c0740b3 = this.f;
            S2 s22 = new S2(c0740b3, i6, i11, i12, c0740b3.f[i11].length);
            this.f21380a = i10;
            this.f21382c = 0;
            this.f21384e = c0740b3.f[i10];
            return s22;
        } else if (i6 == i10) {
            int i13 = this.f21382c;
            int i14 = (this.f21383d - i13) / 2;
            if (i14 == 0) {
                return null;
            }
            j$.util.S m10 = j$.util.g0.m(this.f21384e, i13, i13 + i14);
            this.f21382c += i14;
            return m10;
        } else {
            return null;
        }
    }
}
