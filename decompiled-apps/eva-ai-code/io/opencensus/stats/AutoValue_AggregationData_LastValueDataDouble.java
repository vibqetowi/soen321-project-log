package io.opencensus.stats;

import io.opencensus.stats.AggregationData;
/* loaded from: classes4.dex */
final class AutoValue_AggregationData_LastValueDataDouble extends AggregationData.LastValueDataDouble {
    private final double lastValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_AggregationData_LastValueDataDouble(double d) {
        this.lastValue = d;
    }

    @Override // io.opencensus.stats.AggregationData.LastValueDataDouble
    public double getLastValue() {
        return this.lastValue;
    }

    public String toString() {
        return "LastValueDataDouble{lastValue=" + this.lastValue + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AggregationData.LastValueDataDouble) && Double.doubleToLongBits(this.lastValue) == Double.doubleToLongBits(((AggregationData.LastValueDataDouble) obj).getLastValue());
    }

    public int hashCode() {
        return (int) (1000003 ^ ((Double.doubleToLongBits(this.lastValue) >>> 32) ^ Double.doubleToLongBits(this.lastValue)));
    }
}
