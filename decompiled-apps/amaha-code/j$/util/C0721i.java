package j$.util;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0721i implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    private double f21232a;

    /* renamed from: b  reason: collision with root package name */
    private double f21233b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final void a(C0721i c0721i) {
        this.count += c0721i.count;
        this.f21233b += c0721i.f21233b;
        double d10 = c0721i.sum - this.f21232a;
        double d11 = this.sum;
        double d12 = d11 + d10;
        double d13 = (d12 - d11) - d10;
        this.f21232a = d13;
        double d14 = c0721i.f21232a - d13;
        double d15 = d12 + d14;
        this.f21232a = (d15 - d12) - d14;
        this.sum = d15;
        this.min = Math.min(this.min, c0721i.min);
        this.max = Math.max(this.max, c0721i.max);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f21233b += d10;
        double d11 = d10 - this.f21232a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f21232a = (d13 - d12) - d11;
        this.sum = d13;
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    public final String toString() {
        double d10;
        Object[] objArr = new Object[6];
        objArr[0] = C0721i.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d11 = this.sum + this.f21232a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f21233b)) {
            d11 = this.f21233b;
        }
        objArr[2] = Double.valueOf(d11);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f21232a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f21233b)) {
                d12 = this.f21233b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        objArr[4] = Double.valueOf(d10);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
