package k5;

import java.util.Arrays;
/* compiled from: AppEventsConversionsAPITransformer.kt */
/* loaded from: classes.dex */
public enum j {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_EVENTS("custom_events");

    j(String str) {
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        return (j[]) Arrays.copyOf(values(), 4);
    }
}
