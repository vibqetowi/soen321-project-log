package i5;

import java.util.Arrays;
/* compiled from: FlushReason.kt */
/* loaded from: classes.dex */
public enum l {
    EXPLICIT,
    TIMER,
    /* JADX INFO: Fake field, exist only in values array */
    SESSION_CHANGE,
    /* JADX INFO: Fake field, exist only in values array */
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        return (l[]) Arrays.copyOf(values(), 6);
    }
}
