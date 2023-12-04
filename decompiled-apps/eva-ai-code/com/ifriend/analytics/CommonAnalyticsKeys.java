package com.ifriend.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAnalyticsKeys.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/analytics/CommonAnalyticsKeys;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BOT_USER_ID", "HEADER", "TEXT", "IN_APP_PUSH_TYPE", "QTY_NOTIFICATIONS", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAnalyticsKeys {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommonAnalyticsKeys[] $VALUES;
    private final String value;
    public static final CommonAnalyticsKeys BOT_USER_ID = new CommonAnalyticsKeys("BOT_USER_ID", 0, "bot_UserId");
    public static final CommonAnalyticsKeys HEADER = new CommonAnalyticsKeys("HEADER", 1, "header");
    public static final CommonAnalyticsKeys TEXT = new CommonAnalyticsKeys("TEXT", 2, "text");
    public static final CommonAnalyticsKeys IN_APP_PUSH_TYPE = new CommonAnalyticsKeys("IN_APP_PUSH_TYPE", 3, "inapp_push_type");
    public static final CommonAnalyticsKeys QTY_NOTIFICATIONS = new CommonAnalyticsKeys("QTY_NOTIFICATIONS", 4, "qty_notifications");

    private static final /* synthetic */ CommonAnalyticsKeys[] $values() {
        return new CommonAnalyticsKeys[]{BOT_USER_ID, HEADER, TEXT, IN_APP_PUSH_TYPE, QTY_NOTIFICATIONS};
    }

    public static EnumEntries<CommonAnalyticsKeys> getEntries() {
        return $ENTRIES;
    }

    public static CommonAnalyticsKeys valueOf(String str) {
        return (CommonAnalyticsKeys) Enum.valueOf(CommonAnalyticsKeys.class, str);
    }

    public static CommonAnalyticsKeys[] values() {
        return (CommonAnalyticsKeys[]) $VALUES.clone();
    }

    private CommonAnalyticsKeys(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CommonAnalyticsKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
