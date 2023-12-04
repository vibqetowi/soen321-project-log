package io.sentry;

import androidx.core.app.NotificationCompat;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.SentryTransaction;
/* loaded from: classes4.dex */
public enum SentryItemType {
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Event(NotificationCompat.CATEGORY_EVENT),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Unknown("__unknown__");
    
    private final String itemType;

    public static SentryItemType resolve(Object obj) {
        if (obj instanceof SentryEvent) {
            return Event;
        }
        if (obj instanceof SentryTransaction) {
            return Transaction;
        }
        if (obj instanceof Session) {
            return Session;
        }
        return Attachment;
    }

    SentryItemType(String str) {
        this.itemType = str;
    }

    public String getItemType() {
        return this.itemType;
    }
}
