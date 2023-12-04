package com.facebook;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: LoggingBehavior.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/LoggingBehavior;", "", "(Ljava/lang/String;I)V", "REQUESTS", "INCLUDE_ACCESS_TOKENS", "INCLUDE_RAW_RESPONSES", "CACHE", "APP_EVENTS", "DEVELOPER_ERRORS", "GRAPH_API_DEBUG_WARNING", "GRAPH_API_DEBUG_INFO", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum LoggingBehavior {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LoggingBehavior[] valuesCustom() {
        LoggingBehavior[] valuesCustom = values();
        return (LoggingBehavior[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
