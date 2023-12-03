package j$.util;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0723k implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(C0723k c0723k) {
        this.count += c0723k.count;
        this.sum += c0723k.sum;
        this.min = Math.min(this.min, c0723k.min);
        this.max = Math.max(this.max, c0723k.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        accept(i6);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0723k.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
