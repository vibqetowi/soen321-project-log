package com.facebook;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/HttpMethod;", "", "(Ljava/lang/String;I)V", "GET", "POST", "DELETE", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum HttpMethod {
    GET,
    POST,
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HttpMethod[] valuesCustom() {
        HttpMethod[] valuesCustom = values();
        return (HttpMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
