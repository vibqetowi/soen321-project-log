package io.opencensus.stats;

import io.opencensus.common.Timestamp;
import io.opencensus.stats.ViewData;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes4.dex */
public final class AutoValue_ViewData_AggregationWindowData_CumulativeData extends ViewData.AggregationWindowData.CumulativeData {
    private final Timestamp end;
    private final Timestamp start;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ViewData_AggregationWindowData_CumulativeData(Timestamp timestamp, Timestamp timestamp2) {
        if (timestamp == null) {
            throw new NullPointerException("Null start");
        }
        this.start = timestamp;
        if (timestamp2 == null) {
            throw new NullPointerException("Null end");
        }
        this.end = timestamp2;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.CumulativeData
    public Timestamp getStart() {
        return this.start;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.CumulativeData
    public Timestamp getEnd() {
        return this.end;
    }

    public String toString() {
        return "CumulativeData{start=" + this.start + ", end=" + this.end + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewData.AggregationWindowData.CumulativeData) {
            ViewData.AggregationWindowData.CumulativeData cumulativeData = (ViewData.AggregationWindowData.CumulativeData) obj;
            return this.start.equals(cumulativeData.getStart()) && this.end.equals(cumulativeData.getEnd());
        }
        return false;
    }

    public int hashCode() {
        return ((this.start.hashCode() ^ 1000003) * 1000003) ^ this.end.hashCode();
    }
}
