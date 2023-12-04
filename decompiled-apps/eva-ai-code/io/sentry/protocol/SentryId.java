package io.sentry.protocol;

import java.util.UUID;
/* loaded from: classes4.dex */
public final class SentryId {
    public static final SentryId EMPTY_ID = new SentryId(new UUID(0, 0));
    private final UUID uuid;

    public SentryId() {
        this((UUID) null);
    }

    public SentryId(UUID uuid) {
        this.uuid = uuid == null ? UUID.randomUUID() : uuid;
    }

    public SentryId(String str) {
        this.uuid = fromStringSentryId(str);
    }

    public String toString() {
        return this.uuid.toString().replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.uuid.compareTo(((SentryId) obj).uuid) == 0;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    private UUID fromStringSentryId(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        return UUID.fromString(str);
    }
}
