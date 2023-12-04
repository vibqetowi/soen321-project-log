package com.facebook.appevents;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: FlushResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/FlushResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SERVER_ERROR", "NO_CONNECTIVITY", "UNKNOWN_ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum FlushResult {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FlushResult[] valuesCustom() {
        FlushResult[] valuesCustom = values();
        return (FlushResult[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
