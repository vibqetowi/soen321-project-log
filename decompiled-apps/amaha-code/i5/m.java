package i5;

import java.util.Arrays;
/* compiled from: FlushResult.kt */
/* loaded from: classes.dex */
public enum m {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        return (m[]) Arrays.copyOf(values(), 4);
    }
}
