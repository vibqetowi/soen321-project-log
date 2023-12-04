package io.opencensus.stats;

import io.opencensus.common.Timestamp;
import io.opencensus.stats.ViewData;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes4.dex */
public final class AutoValue_ViewData_AggregationWindowData_IntervalData extends ViewData.AggregationWindowData.IntervalData {
    private final Timestamp end;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ViewData_AggregationWindowData_IntervalData(Timestamp timestamp) {
        if (timestamp == null) {
            throw new NullPointerException("Null end");
        }
        this.end = timestamp;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.IntervalData
    public Timestamp getEnd() {
        return this.end;
    }

    public String toString() {
        return "IntervalData{end=" + this.end + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewData.AggregationWindowData.IntervalData) {
            return this.end.equals(((ViewData.AggregationWindowData.IntervalData) obj).getEnd());
        }
        return false;
    }

    public int hashCode() {
        return this.end.hashCode() ^ 1000003;
    }
}
