package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Value;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_Value_ValueSummary extends Value.ValueSummary {
    private final Summary value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Value_ValueSummary(Summary summary) {
        if (summary == null) {
            throw new NullPointerException("Null value");
        }
        this.value = summary;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.opencensus.metrics.export.Value.ValueSummary
    public Summary getValue() {
        return this.value;
    }

    public String toString() {
        return "ValueSummary{value=" + this.value + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Value.ValueSummary) {
            return this.value.equals(((Value.ValueSummary) obj).getValue());
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }
}
