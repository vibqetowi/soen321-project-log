package io.opencensus.trace.export;

import io.opencensus.trace.Status;
import io.opencensus.trace.export.SampledSpanStore;
import java.util.Map;
/* loaded from: classes4.dex */
final class AutoValue_SampledSpanStore_PerSpanNameSummary extends SampledSpanStore.PerSpanNameSummary {
    private final Map<Status.CanonicalCode, Integer> numbersOfErrorSampledSpans;
    private final Map<SampledSpanStore.LatencyBucketBoundaries, Integer> numbersOfLatencySampledSpans;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SampledSpanStore_PerSpanNameSummary(Map<SampledSpanStore.LatencyBucketBoundaries, Integer> map, Map<Status.CanonicalCode, Integer> map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.numbersOfLatencySampledSpans = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.numbersOfErrorSampledSpans = map2;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map<SampledSpanStore.LatencyBucketBoundaries, Integer> getNumbersOfLatencySampledSpans() {
        return this.numbersOfLatencySampledSpans;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.PerSpanNameSummary
    public Map<Status.CanonicalCode, Integer> getNumbersOfErrorSampledSpans() {
        return this.numbersOfErrorSampledSpans;
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.numbersOfLatencySampledSpans + ", numbersOfErrorSampledSpans=" + this.numbersOfErrorSampledSpans + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SampledSpanStore.PerSpanNameSummary) {
            SampledSpanStore.PerSpanNameSummary perSpanNameSummary = (SampledSpanStore.PerSpanNameSummary) obj;
            return this.numbersOfLatencySampledSpans.equals(perSpanNameSummary.getNumbersOfLatencySampledSpans()) && this.numbersOfErrorSampledSpans.equals(perSpanNameSummary.getNumbersOfErrorSampledSpans());
        }
        return false;
    }

    public int hashCode() {
        return ((this.numbersOfLatencySampledSpans.hashCode() ^ 1000003) * 1000003) ^ this.numbersOfErrorSampledSpans.hashCode();
    }
}
