package io.opencensus.stats;

import io.opencensus.stats.AggregationData;
@Deprecated
/* loaded from: classes4.dex */
final class AutoValue_AggregationData_MeanData extends AggregationData.MeanData {
    private final long count;
    private final double mean;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_AggregationData_MeanData(double d, long j) {
        this.mean = d;
        this.count = j;
    }

    @Override // io.opencensus.stats.AggregationData.MeanData
    public double getMean() {
        return this.mean;
    }

    @Override // io.opencensus.stats.AggregationData.MeanData
    public long getCount() {
        return this.count;
    }

    public String toString() {
        return "MeanData{mean=" + this.mean + ", count=" + this.count + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AggregationData.MeanData) {
            AggregationData.MeanData meanData = (AggregationData.MeanData) obj;
            return Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(meanData.getMean()) && this.count == meanData.getCount();
        }
        return false;
    }

    public int hashCode() {
        long j = this.count;
        return (int) ((((int) (1000003 ^ ((Double.doubleToLongBits(this.mean) >>> 32) ^ Double.doubleToLongBits(this.mean)))) * 1000003) ^ (j ^ (j >>> 32)));
    }
}
