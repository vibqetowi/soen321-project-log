package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V0 extends K0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(I0 i02, I0 i03) {
        super(i02, i03);
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        this.f21309a.forEach(consumer);
        this.f21310b.forEach(consumer);
    }

    @Override // j$.util.stream.I0
    public final I0 i(long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long count = this.f21309a.count();
        return j10 >= count ? this.f21310b.i(j10 - count, j11 - count, intFunction) : j11 <= count ? this.f21309a.i(j10, j11, intFunction) : AbstractC0850z0.e0(EnumC0770h3.REFERENCE, this.f21309a.i(j10, count, intFunction), this.f21310b.i(0L, j11 - count, intFunction));
    }

    @Override // j$.util.stream.I0
    public final void j(Object[] objArr, int i6) {
        Objects.requireNonNull(objArr);
        I0 i02 = this.f21309a;
        i02.j(objArr, i6);
        this.f21310b.j(objArr, i6 + ((int) i02.count()));
    }

    @Override // j$.util.stream.I0
    public final Object[] k(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            j(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return new C0793m1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f21309a, this.f21310b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
