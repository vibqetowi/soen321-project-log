package io.opencensus.tags;
/* loaded from: classes4.dex */
final class AutoValue_TagValue extends TagValue {
    private final String asString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TagValue(String str) {
        if (str == null) {
            throw new NullPointerException("Null asString");
        }
        this.asString = str;
    }

    @Override // io.opencensus.tags.TagValue
    public String asString() {
        return this.asString;
    }

    public String toString() {
        return "TagValue{asString=" + this.asString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TagValue) {
            return this.asString.equals(((TagValue) obj).asString());
        }
        return false;
    }

    public int hashCode() {
        return this.asString.hashCode() ^ 1000003;
    }
}
