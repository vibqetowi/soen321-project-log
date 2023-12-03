package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1nSDK {
    private boolean AFInAppEventParameterName;
    public AFe1lSDK AFInAppEventType;

    public AFb1nSDK() {
    }

    public AFb1nSDK(boolean z10, AFe1lSDK aFe1lSDK) {
        this.AFInAppEventParameterName = z10;
        this.AFInAppEventType = aFe1lSDK;
    }

    public static JSONObject AFInAppEventType(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (jSONObject.optBoolean("monitor", false) && !z10) {
                AFb1qSDK.AFInAppEventParameterName().values();
            } else {
                AFb1qSDK.AFInAppEventParameterName().AFInAppEventType();
                AFb1qSDK.AFInAppEventParameterName().AFKeystoreWrapper();
            }
            if (jSONObject.has("ol_id")) {
                String optString = jSONObject.optString("ol_scheme", null);
                String optString2 = jSONObject.optString("ol_domain", null);
                String optString3 = jSONObject.optString("ol_ver", null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 != null) {
                    AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                    return jSONObject;
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th3) {
            th = th3;
            jSONObject2 = jSONObject;
            AFLogger.afErrorLog(th.getMessage(), th);
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType();
            AFb1qSDK.AFInAppEventParameterName().AFKeystoreWrapper();
            return jSONObject2;
        }
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }
}
