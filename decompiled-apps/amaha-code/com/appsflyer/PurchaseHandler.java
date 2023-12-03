package com.appsflyer;

import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
/* loaded from: classes.dex */
public final class PurchaseHandler {
    public final AFc1zSDK AFInAppEventType;
    public final AFc1mSDK AFKeystoreWrapper;
    private final AFb1aSDK valueOf;

    /* loaded from: classes.dex */
    public interface PurchaseValidationCallback {
        void onFailure(Throwable th2);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFc1zSDK aFc1zSDK) {
        this.AFInAppEventType = aFc1zSDK;
        this.valueOf = aFc1zSDK.AFInAppEventParameterName();
        this.AFKeystoreWrapper = aFc1zSDK.afErrorLog();
    }

    public final boolean AFInAppEventType(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean values = AFb1tSDK.values(map, strArr, this.valueOf);
        if (!values && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return values;
    }
}
