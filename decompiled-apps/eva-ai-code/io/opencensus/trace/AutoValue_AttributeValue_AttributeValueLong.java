package io.opencensus.trace;

import io.opencensus.trace.AttributeValue;
/* loaded from: classes4.dex */
final class AutoValue_AttributeValue_AttributeValueLong extends AttributeValue.AttributeValueLong {
    private final Long longValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_AttributeValue_AttributeValueLong(Long l) {
        if (l == null) {
            throw new NullPointerException("Null longValue");
        }
        this.longValue = l;
    }

    @Override // io.opencensus.trace.AttributeValue.AttributeValueLong
    Long getLongValue() {
        return this.longValue;
    }

    public String toString() {
        return "AttributeValueLong{longValue=" + this.longValue + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeValue.AttributeValueLong) {
            return this.longValue.equals(((AttributeValue.AttributeValueLong) obj).getLongValue());
        }
        return false;
    }

    public int hashCode() {
        return this.longValue.hashCode() ^ 1000003;
    }
}
