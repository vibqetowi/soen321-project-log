package com.facebook.appevents;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: FlushReason.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/FlushReason;", "", "(Ljava/lang/String;I)V", "EXPLICIT", "TIMER", "SESSION_CHANGE", "PERSISTED_EVENTS", "EVENT_THRESHOLD", "EAGER_FLUSHING_EVENT", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum FlushReason {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FlushReason[] valuesCustom() {
        FlushReason[] valuesCustom = values();
        return (FlushReason[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
