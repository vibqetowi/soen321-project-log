package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFc1fSDK extends AFc1aSDK<String> {
    private final AFd1qSDK AFVersionDeclaration;
    private final AFb1aSDK afRDLog;
    private final PurchaseHandler.PurchaseValidationCallback getLevel;
    private final Map<String, Object> init;

    public AFc1fSDK(AFc1kSDK aFc1kSDK, AFc1kSDK[] aFc1kSDKArr, AFc1zSDK aFc1zSDK, String str, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFc1kSDK, aFc1kSDKArr, aFc1zSDK, str);
        String str2;
        String str3;
        AFb1aSDK AFInAppEventParameterName = aFc1zSDK.AFInAppEventParameterName();
        this.afRDLog = AFInAppEventParameterName;
        AFd1qSDK afRDLog = aFc1zSDK.afRDLog();
        this.AFVersionDeclaration = afRDLog;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", AFInAppEventParameterName.AFKeystoreWrapper.values.getPackageName());
        String AFInAppEventParameterName2 = AFb1aSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName2 != null) {
            hashMap.put("cuid", AFInAppEventParameterName2);
        }
        Context context = AFInAppEventParameterName.AFKeystoreWrapper.values;
        hashMap.put("app_version_name", AFb1wSDK.AFInAppEventParameterName(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFa1uSDK AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFInAppEventParameterName.AFKeystoreWrapper.values, new HashMap());
        if (AFKeystoreWrapper != null) {
            str2 = AFKeystoreWrapper.AFInAppEventParameterName;
        } else {
            str2 = null;
        }
        if (!AFb1oSDK.valueOf(str2)) {
            hashMap2.put("advertising_id", str2);
        }
        AFa1uSDK valueOf = AFb1zSDK.valueOf(AFInAppEventParameterName.AFKeystoreWrapper.values.getContentResolver());
        if (valueOf != null) {
            str3 = valueOf.AFInAppEventParameterName;
        } else {
            str3 = null;
        }
        if (!AFb1oSDK.valueOf(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFa1uSDK valueOf2 = AFb1zSDK.valueOf(AFInAppEventParameterName.AFKeystoreWrapper.values.getContentResolver());
        String str4 = valueOf2 != null ? valueOf2.AFInAppEventParameterName : null;
        if (!AFb1oSDK.valueOf(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFInAppEventParameterName3 = ((AFc1aSDK) this).AFLogger.AFInAppEventParameterName(afRDLog);
            if (!AFb1oSDK.valueOf(AFInAppEventParameterName3)) {
                hashMap2.put("imei", AFInAppEventParameterName3);
            }
        }
        hashMap2.put("appsflyer_id", AFb1uSDK.values(new WeakReference(AFInAppEventParameterName.AFKeystoreWrapper.values)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb2.toString());
        hashMap2.put("sdk_version", AFb1xSDK.values);
        hashMap.put("device_data", hashMap2);
        this.init = hashMap;
        this.getLevel = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFInAppEventParameterName();
        Throwable afErrorLog = afErrorLog();
        if (afErrorLog != null && (purchaseValidationCallback2 = this.getLevel) != null) {
            purchaseValidationCallback2.onFailure(afErrorLog);
        }
        ResponseNetwork<String> responseNetwork = this.afDebugLog;
        if (responseNetwork != null && (purchaseValidationCallback = this.getLevel) != null) {
            purchaseValidationCallback.onResponse(responseNetwork);
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return true;
    }

    public final Map<String, Object> getLevel() {
        return this.init;
    }
}
