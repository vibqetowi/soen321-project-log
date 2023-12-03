package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFc1eSDK extends AFc1fSDK {
    public AFc1eSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1zSDK aFc1zSDK) {
        super(AFc1kSDK.ARS_VALIDATE, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.AFKeystoreWrapper.add(AFc1kSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        return ((AFc1aSDK) this).afErrorLog.valueOf(getLevel(), str);
    }
}
