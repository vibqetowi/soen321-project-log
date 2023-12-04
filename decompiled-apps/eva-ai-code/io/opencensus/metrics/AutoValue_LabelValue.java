package io.opencensus.metrics;

import javax.annotation.Nullable;
/* loaded from: classes4.dex */
final class AutoValue_LabelValue extends LabelValue {
    private final String value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LabelValue(@Nullable String str) {
        this.value = str;
    }

    @Override // io.opencensus.metrics.LabelValue
    @Nullable
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "LabelValue{value=" + this.value + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LabelValue) {
            String str = this.value;
            String value = ((LabelValue) obj).getValue();
            return str == null ? value == null : str.equals(value);
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
