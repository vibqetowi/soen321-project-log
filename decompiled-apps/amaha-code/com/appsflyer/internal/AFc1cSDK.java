package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFc1cSDK extends AFc1fSDK {
    private final AFb1aSDK afRDLog;

    public AFc1cSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1zSDK aFc1zSDK) {
        super(AFc1kSDK.PURCHASE_VALIDATE, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.afRDLog = aFc1zSDK.AFInAppEventParameterName();
        this.AFKeystoreWrapper.add(AFc1kSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.afRDLog.AFKeystoreWrapper.values.getPackageName());
        String obj = sb2.toString();
        String jSONObject = new JSONObject(getLevel()).toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this);
        sb3.append(": preparing data: ");
        sb3.append(jSONObject);
        AFb1rSDK.valueOf(sb3.toString());
        ((AFc1aSDK) this).afInfoLog.valueOf(obj, jSONObject);
        return ((AFc1aSDK) this).afErrorLog.AFInAppEventParameterName(getLevel(), str);
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        ResponseNetwork responseNetwork = this.afDebugLog;
        if (responseNetwork != null && responseNetwork.getStatusCode() == 503) {
            return true;
        }
        return super.AFKeystoreWrapper();
    }
}
