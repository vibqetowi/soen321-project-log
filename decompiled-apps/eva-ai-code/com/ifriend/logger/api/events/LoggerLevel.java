package com.ifriend.logger.api.events;

import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggerEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/logger/api/events/LoggerLevel;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INFO", OkHttpClientProviderKt.DEBUG_KEY, "WARNING", "ERROR", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggerLevel[] $VALUES;
    private final String value;
    public static final LoggerLevel INFO = new LoggerLevel("INFO", 0, "info");
    public static final LoggerLevel DEBUG = new LoggerLevel(OkHttpClientProviderKt.DEBUG_KEY, 1, "debug");
    public static final LoggerLevel WARNING = new LoggerLevel("WARNING", 2, "warn");
    public static final LoggerLevel ERROR = new LoggerLevel("ERROR", 3, "error");

    private static final /* synthetic */ LoggerLevel[] $values() {
        return new LoggerLevel[]{INFO, DEBUG, WARNING, ERROR};
    }

    public static EnumEntries<LoggerLevel> getEntries() {
        return $ENTRIES;
    }

    public static LoggerLevel valueOf(String str) {
        return (LoggerLevel) Enum.valueOf(LoggerLevel.class, str);
    }

    public static LoggerLevel[] values() {
        return (LoggerLevel[]) $VALUES.clone();
    }

    private LoggerLevel(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        LoggerLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
