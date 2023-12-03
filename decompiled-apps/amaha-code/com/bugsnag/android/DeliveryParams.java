package com.bugsnag.android;

import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: DeliveryParams.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/DeliveryParams;", "", "endpoint", "", "headers", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEndpoint", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeliveryParams {
    private final String endpoint;
    private final Map<String, String> headers;

    public DeliveryParams(String endpoint, Map<String, String> headers) {
        i.h(endpoint, "endpoint");
        i.h(headers, "headers");
        this.endpoint = endpoint;
        this.headers = headers;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }
}
