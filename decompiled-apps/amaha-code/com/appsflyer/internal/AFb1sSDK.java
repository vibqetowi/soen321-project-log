package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFb1sSDK {
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    private final boolean valueOf;
    public final AFe1mSDK values;

    public AFb1sSDK() {
    }

    public AFb1sSDK(String str) {
        AFe1mSDK aFe1mSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.AFInAppEventType = string;
                this.valueOf = jSONObject.optBoolean("test_mode");
                this.AFInAppEventParameterName = str;
                if (string.startsWith("default")) {
                    aFe1mSDK = AFe1mSDK.DEFAULT;
                } else {
                    aFe1mSDK = AFe1mSDK.CUSTOM;
                }
                this.values = aFe1mSDK;
                return;
            } catch (JSONException unused) {
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public static Map<String, String> AFInAppEventType(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e10) {
                AFLogger.afErrorLog(e10);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFb1sSDK.class != obj.getClass()) {
            return false;
        }
        AFb1sSDK aFb1sSDK = (AFb1sSDK) obj;
        if (this.valueOf != aFb1sSDK.valueOf || !this.AFInAppEventType.equals(aFb1sSDK.AFInAppEventType)) {
            return false;
        }
        return this.AFInAppEventParameterName.equals(aFb1sSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        int hashCode = this.AFInAppEventType.hashCode();
        return this.AFInAppEventParameterName.hashCode() + ((hashCode + ((this.valueOf ? 1 : 0) * 31)) * 31);
    }
}
