package io.sentry;

import io.sentry.util.Objects;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class SpanId {
    public static final SpanId EMPTY_ID = new SpanId(new UUID(0, 0).toString());
    private final String value;

    public SpanId(String str) {
        this.value = (String) Objects.requireNonNull(str, "value is required");
    }

    public SpanId() {
        this(UUID.randomUUID());
    }

    private SpanId(UUID uuid) {
        this(uuid.toString().replace("-", "").substring(0, 16));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.value.equals(((SpanId) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value;
    }
}
