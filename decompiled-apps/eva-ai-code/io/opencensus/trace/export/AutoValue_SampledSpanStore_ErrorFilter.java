package io.opencensus.trace.export;

import io.opencensus.trace.Status;
import io.opencensus.trace.export.SampledSpanStore;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
final class AutoValue_SampledSpanStore_ErrorFilter extends SampledSpanStore.ErrorFilter {
    private final Status.CanonicalCode canonicalCode;
    private final int maxSpansToReturn;
    private final String spanName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SampledSpanStore_ErrorFilter(String str, @Nullable Status.CanonicalCode canonicalCode, int i) {
        if (str == null) {
            throw new NullPointerException("Null spanName");
        }
        this.spanName = str;
        this.canonicalCode = canonicalCode;
        this.maxSpansToReturn = i;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public String getSpanName() {
        return this.spanName;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    @Nullable
    public Status.CanonicalCode getCanonicalCode() {
        return this.canonicalCode;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public int getMaxSpansToReturn() {
        return this.maxSpansToReturn;
    }

    public String toString() {
        return "ErrorFilter{spanName=" + this.spanName + ", canonicalCode=" + this.canonicalCode + ", maxSpansToReturn=" + this.maxSpansToReturn + "}";
    }

    public boolean equals(Object obj) {
        Status.CanonicalCode canonicalCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SampledSpanStore.ErrorFilter) {
            SampledSpanStore.ErrorFilter errorFilter = (SampledSpanStore.ErrorFilter) obj;
            return this.spanName.equals(errorFilter.getSpanName()) && ((canonicalCode = this.canonicalCode) != null ? canonicalCode.equals(errorFilter.getCanonicalCode()) : errorFilter.getCanonicalCode() == null) && this.maxSpansToReturn == errorFilter.getMaxSpansToReturn();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.spanName.hashCode() ^ 1000003) * 1000003;
        Status.CanonicalCode canonicalCode = this.canonicalCode;
        return ((hashCode ^ (canonicalCode == null ? 0 : canonicalCode.hashCode())) * 1000003) ^ this.maxSpansToReturn;
    }
}
