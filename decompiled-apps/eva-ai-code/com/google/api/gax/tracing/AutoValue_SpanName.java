package com.google.api.gax.tracing;
/* loaded from: classes7.dex */
final class AutoValue_SpanName extends SpanName {
    private final String clientName;
    private final String methodName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SpanName(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null clientName");
        }
        this.clientName = str;
        if (str2 == null) {
            throw new NullPointerException("Null methodName");
        }
        this.methodName = str2;
    }

    @Override // com.google.api.gax.tracing.SpanName
    public String getClientName() {
        return this.clientName;
    }

    @Override // com.google.api.gax.tracing.SpanName
    public String getMethodName() {
        return this.methodName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpanName) {
            SpanName spanName = (SpanName) obj;
            return this.clientName.equals(spanName.getClientName()) && this.methodName.equals(spanName.getMethodName());
        }
        return false;
    }

    public int hashCode() {
        return ((this.clientName.hashCode() ^ 1000003) * 1000003) ^ this.methodName.hashCode();
    }
}
