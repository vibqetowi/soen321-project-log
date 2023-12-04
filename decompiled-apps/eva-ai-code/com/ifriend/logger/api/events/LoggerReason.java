package com.ifriend.logger.api.events;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggerEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ifriend/logger/api/events/LoggerReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PURCHASES", "UNKNOWN", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggerReason[] $VALUES;
    public static final LoggerReason PURCHASES = new LoggerReason("PURCHASES", 0, "purchases-service");
    public static final LoggerReason UNKNOWN = new LoggerReason("UNKNOWN", 1, "unknown");
    private final String value;

    private static final /* synthetic */ LoggerReason[] $values() {
        return new LoggerReason[]{PURCHASES, UNKNOWN};
    }

    public static EnumEntries<LoggerReason> getEntries() {
        return $ENTRIES;
    }

    public static LoggerReason valueOf(String str) {
        return (LoggerReason) Enum.valueOf(LoggerReason.class, str);
    }

    public static LoggerReason[] values() {
        return (LoggerReason[]) $VALUES.clone();
    }

    private LoggerReason(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        LoggerReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
