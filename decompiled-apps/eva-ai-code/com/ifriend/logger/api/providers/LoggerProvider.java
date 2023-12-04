package com.ifriend.logger.api.providers;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggerProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/logger/api/providers/LoggerProvider;", "", "(Ljava/lang/String;I)V", "LOCAL_IN_APP", "DATA_DOG", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerProvider {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggerProvider[] $VALUES;
    public static final LoggerProvider LOCAL_IN_APP = new LoggerProvider("LOCAL_IN_APP", 0);
    public static final LoggerProvider DATA_DOG = new LoggerProvider("DATA_DOG", 1);

    private static final /* synthetic */ LoggerProvider[] $values() {
        return new LoggerProvider[]{LOCAL_IN_APP, DATA_DOG};
    }

    public static EnumEntries<LoggerProvider> getEntries() {
        return $ENTRIES;
    }

    public static LoggerProvider valueOf(String str) {
        return (LoggerProvider) Enum.valueOf(LoggerProvider.class, str);
    }

    public static LoggerProvider[] values() {
        return (LoggerProvider[]) $VALUES.clone();
    }

    private LoggerProvider(String str, int i) {
    }

    static {
        LoggerProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
