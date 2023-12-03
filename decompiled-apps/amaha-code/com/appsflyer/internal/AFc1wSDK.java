package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class AFc1wSDK<ResponseBody> {
    private final AtomicBoolean AFInAppEventParameterName = new AtomicBoolean(false);
    private final AFc1pSDK<ResponseBody> AFInAppEventType;
    public final AFb1wSDK valueOf;
    private final AFc1tSDK values;

    public AFc1wSDK(AFb1wSDK aFb1wSDK, AFc1tSDK aFc1tSDK, AFc1pSDK<ResponseBody> aFc1pSDK) {
        this.valueOf = aFb1wSDK;
        this.values = aFc1tSDK;
        this.AFInAppEventType = aFc1pSDK;
    }

    public final AFc1nSDK<ResponseBody> AFInAppEventType() {
        if (!this.AFInAppEventParameterName.getAndSet(true)) {
            AFc1nSDK<String> valueOf = this.values.valueOf(this.valueOf);
            try {
                return new AFc1nSDK<>(this.AFInAppEventType.AFInAppEventType(valueOf.getBody()), valueOf.AFKeystoreWrapper, valueOf.values, valueOf.valueOf, valueOf.AFInAppEventParameterName);
            } catch (JSONException e10) {
                throw new ParsingException(e10.getMessage(), e10, valueOf);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
