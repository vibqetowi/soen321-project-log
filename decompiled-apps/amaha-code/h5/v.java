package h5;

import java.util.Arrays;
/* compiled from: HttpMethod.kt */
/* loaded from: classes.dex */
public enum v {
    GET,
    POST,
    /* JADX INFO: Fake field, exist only in values array */
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static v[] valuesCustom() {
        return (v[]) Arrays.copyOf(values(), 3);
    }
}
