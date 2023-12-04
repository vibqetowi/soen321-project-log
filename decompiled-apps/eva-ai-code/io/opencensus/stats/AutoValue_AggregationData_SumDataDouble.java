package io.opencensus.stats;

import io.opencensus.stats.AggregationData;
/* loaded from: classes4.dex */
final class AutoValue_AggregationData_SumDataDouble extends AggregationData.SumDataDouble {
    private final double sum;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_AggregationData_SumDataDouble(double d) {
        this.sum = d;
    }

    @Override // io.opencensus.stats.AggregationData.SumDataDouble
    public double getSum() {
        return this.sum;
    }

    public String toString() {
        return "SumDataDouble{sum=" + this.sum + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AggregationData.SumDataDouble) && Double.doubleToLongBits(this.sum) == Double.doubleToLongBits(((AggregationData.SumDataDouble) obj).getSum());
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.sum) >>> 32) ^ Double.doubleToLongBits(this.sum)));
    }
}
