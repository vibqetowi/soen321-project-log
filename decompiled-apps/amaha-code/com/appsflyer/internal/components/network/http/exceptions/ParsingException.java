package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFc1nSDK;
import java.io.IOException;
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFc1nSDK<String> valueOf;

    public ParsingException(String str, Throwable th2, AFc1nSDK<String> aFc1nSDK) {
        super(str, th2);
        this.valueOf = aFc1nSDK;
    }

    public AFc1nSDK<String> getRawResponse() {
        return this.valueOf;
    }
}
