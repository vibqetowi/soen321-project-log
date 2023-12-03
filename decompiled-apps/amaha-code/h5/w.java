package h5;

import java.util.Arrays;
/* compiled from: LoggingBehavior.kt */
/* loaded from: classes.dex */
public enum w {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    /* JADX INFO: Fake field, exist only in values array */
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static w[] valuesCustom() {
        return (w[]) Arrays.copyOf(values(), 8);
    }
}
