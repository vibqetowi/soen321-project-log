package io.sentry;

import io.sentry.protocol.SentryId;
/* loaded from: classes4.dex */
public final class UserFeedback {
    private String comments;
    private String email;
    private final SentryId eventId;
    private String name;

    public UserFeedback(SentryId sentryId) {
        this(sentryId, null, null, null);
    }

    public UserFeedback(SentryId sentryId, String str, String str2, String str3) {
        this.eventId = sentryId;
        this.name = str;
        this.email = str2;
        this.comments = str3;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String str) {
        this.comments = str;
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.eventId + ", name='" + this.name + "', email='" + this.email + "', comments='" + this.comments + "'}";
    }
}
