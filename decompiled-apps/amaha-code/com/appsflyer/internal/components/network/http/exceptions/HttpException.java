package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1sSDK;
import java.io.IOException;
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFc1sSDK valueOf;

    public HttpException(Throwable th2, AFc1sSDK aFc1sSDK) {
        super(th2.getMessage(), th2);
        this.valueOf = aFc1sSDK;
    }

    public AFc1sSDK getMetrics() {
        return this.valueOf;
    }
}
