package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Summary;
/* loaded from: classes4.dex */
final class AutoValue_Summary_Snapshot_ValueAtPercentile extends Summary.Snapshot.ValueAtPercentile {
    private final double percentile;
    private final double value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Summary_Snapshot_ValueAtPercentile(double d, double d2) {
        this.percentile = d;
        this.value = d2;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot.ValueAtPercentile
    public double getPercentile() {
        return this.percentile;
    }

    @Override // io.opencensus.metrics.export.Summary.Snapshot.ValueAtPercentile
    public double getValue() {
        return this.value;
    }

    public String toString() {
        return "ValueAtPercentile{percentile=" + this.percentile + ", value=" + this.value + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Summary.Snapshot.ValueAtPercentile) {
            Summary.Snapshot.ValueAtPercentile valueAtPercentile = (Summary.Snapshot.ValueAtPercentile) obj;
            return Double.doubleToLongBits(this.percentile) == Double.doubleToLongBits(valueAtPercentile.getPercentile()) && Double.doubleToLongBits(this.value) == Double.doubleToLongBits(valueAtPercentile.getValue());
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((int) (1000003 ^ ((Double.doubleToLongBits(this.percentile) >>> 32) ^ Double.doubleToLongBits(this.percentile)))) * 1000003) ^ ((Double.doubleToLongBits(this.value) >>> 32) ^ Double.doubleToLongBits(this.value)));
    }
}
