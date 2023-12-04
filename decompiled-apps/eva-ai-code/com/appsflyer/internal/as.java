package com.appsflyer.internal;

import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class as {
    private final boolean AFInAppEventParameterName;
    public final Map<String, String> AFInAppEventType;
    private final boolean valueOf;
    public final List<Purchase> values;

    public as() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject AFInAppEventParameterName(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (jSONObject.optBoolean("monitor", false) && !z) {
                ak.AFInAppEventType().AFKeystoreWrapper();
            } else {
                ak.AFInAppEventType().valueOf();
                ak.AFInAppEventType().AFInAppEventParameterName();
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
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.valueOf(th.getMessage(), th);
            ak.AFInAppEventType().valueOf();
            ak.AFInAppEventType().AFInAppEventParameterName();
            return jSONObject2;
        }
    }

    public as(boolean z, boolean z2, List<Purchase> list, Map<String, String> map) {
        this.valueOf = z;
        this.AFInAppEventParameterName = z2;
        this.values = list;
        this.AFInAppEventType = map;
    }

    public final boolean AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            as asVar = (as) obj;
            if (this.valueOf != asVar.valueOf || this.AFInAppEventParameterName != asVar.AFInAppEventParameterName || !this.values.equals(asVar.values)) {
                return false;
            }
            Map<String, String> map = this.AFInAppEventType;
            Map<String, String> map2 = asVar.AFInAppEventType;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.valueOf ? 1 : 0) * 31) + (this.AFInAppEventParameterName ? 1 : 0)) * 31) + this.values.hashCode()) * 31;
        Map<String, String> map = this.AFInAppEventType;
        return hashCode + (map != null ? map.hashCode() : 0);
    }
}
