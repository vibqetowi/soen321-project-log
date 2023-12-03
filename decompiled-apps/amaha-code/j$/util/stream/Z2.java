package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Z2 implements j$.util.O {

    /* renamed from: a  reason: collision with root package name */
    int f21412a;

    /* renamed from: b  reason: collision with root package name */
    final int f21413b;

    /* renamed from: c  reason: collision with root package name */
    int f21414c;

    /* renamed from: d  reason: collision with root package name */
    final int f21415d;

    /* renamed from: e  reason: collision with root package name */
    Object f21416e;
    final /* synthetic */ AbstractC0735a3 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(AbstractC0735a3 abstractC0735a3, int i6, int i10, int i11, int i12) {
        this.f = abstractC0735a3;
        this.f21412a = i6;
        this.f21413b = i10;
        this.f21414c = i11;
        this.f21415d = i12;
        Object[] objArr = abstractC0735a3.f;
        this.f21416e = objArr == null ? abstractC0735a3.f21421e : objArr[i6];
    }

    abstract void a(int i6, Object obj, Object obj2);

    abstract j$.util.O b(Object obj, int i6, int i10);

    abstract j$.util.O c(int i6, int i10, int i11, int i12);

    @Override // j$.util.S
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        int i6 = this.f21412a;
        int i10 = this.f21415d;
        int i11 = this.f21413b;
        if (i6 == i11) {
            return i10 - this.f21414c;
        }
        long[] jArr = this.f.f21447d;
        return ((jArr[i11] + i10) - jArr[i6]) - this.f21414c;
    }

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        AbstractC0735a3 abstractC0735a3;
        Objects.requireNonNull(obj);
        int i6 = this.f21412a;
        int i10 = this.f21415d;
        int i11 = this.f21413b;
        if (i6 < i11 || (i6 == i11 && this.f21414c < i10)) {
            int i12 = this.f21414c;
            while (true) {
                abstractC0735a3 = this.f;
                if (i6 >= i11) {
                    break;
                }
                Object obj2 = abstractC0735a3.f[i6];
                abstractC0735a3.o(obj2, i12, abstractC0735a3.p(obj2), obj);
                i6++;
                i12 = 0;
            }
            abstractC0735a3.o(this.f21412a == i11 ? this.f21416e : abstractC0735a3.f[i11], i12, i10, obj);
            this.f21412a = i11;
            this.f21414c = i10;
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
        Objects.requireNonNull(obj);
        int i6 = this.f21412a;
        int i10 = this.f21413b;
        if (i6 < i10 || (i6 == i10 && this.f21414c < this.f21415d)) {
            Object obj2 = this.f21416e;
            int i11 = this.f21414c;
            this.f21414c = i11 + 1;
            a(i11, obj2, obj);
            int i12 = this.f21414c;
            Object obj3 = this.f21416e;
            AbstractC0735a3 abstractC0735a3 = this.f;
            if (i12 == abstractC0735a3.p(obj3)) {
                this.f21414c = 0;
                int i13 = this.f21412a + 1;
                this.f21412a = i13;
                Object[] objArr = abstractC0735a3.f;
                if (objArr != null && i13 <= i10) {
                    this.f21416e = objArr[i13];
                }
            }
            return true;
        }
        return false;
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

    @Override // j$.util.O, j$.util.S
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.O, j$.util.S
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.O, j$.util.S
    public /* bridge */ /* synthetic */ j$.util.L trySplit() {
        return (j$.util.L) trySplit();
    }

    @Override // j$.util.O, j$.util.S
    public final j$.util.O trySplit() {
        int i6 = this.f21412a;
        int i10 = this.f21413b;
        if (i6 < i10) {
            int i11 = this.f21414c;
            AbstractC0735a3 abstractC0735a3 = this.f;
            j$.util.O c10 = c(i6, i10 - 1, i11, abstractC0735a3.p(abstractC0735a3.f[i10 - 1]));
            this.f21412a = i10;
            this.f21414c = 0;
            this.f21416e = abstractC0735a3.f[i10];
            return c10;
        } else if (i6 == i10) {
            int i12 = this.f21414c;
            int i13 = (this.f21415d - i12) / 2;
            if (i13 == 0) {
                return null;
            }
            j$.util.O b10 = b(this.f21416e, i12, i13);
            this.f21414c += i13;
            return b10;
        } else {
            return null;
        }
    }
}
