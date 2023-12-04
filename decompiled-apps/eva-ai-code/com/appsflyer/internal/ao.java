package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ao {
    public final String AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public final cs AFKeystoreWrapper;
    public final String valueOf;

    public ao() {
    }

    public static void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (f.valueOf().values != null) {
            AFLogger.AFInAppEventParameterName("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventType(new DeepLinkResult(null, error));
            return;
        }
        AFKeystoreWrapper(str);
    }

    public static void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (f.valueOf().values != null) {
            try {
                try {
                    DeepLink valueOf = DeepLink.valueOf(map);
                    valueOf.valueOf.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(valueOf, null);
                } catch (JSONException e) {
                    AFLogger.AFInAppEventParameterName("[DDL] Error occurred", e);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventType(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventType(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFKeystoreWrapper(map);
    }

    public static void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (f.valueOf().values != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.AFInAppEventParameterName(sb.toString());
            try {
                f.valueOf().values.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.AFInAppEventParameterName("[DDL] skipping, no callback registered");
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (ac.AFKeystoreWrapper != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.AFInAppEventParameterName(sb.toString());
                ac.AFKeystoreWrapper.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFKeystoreWrapper(String str) {
        if (ac.AFKeystoreWrapper != null) {
            try {
                AFLogger.AFInAppEventParameterName("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ac.AFKeystoreWrapper.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.valueOf(th.getLocalizedMessage(), th);
            }
        }
    }

    public ao(String str) throws JSONException {
        cs csVar;
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.valueOf = string;
            this.AFInAppEventType = jSONObject.optBoolean("test_mode");
            this.AFInAppEventParameterName = str;
            if (string.startsWith(CookieSpecs.DEFAULT)) {
                csVar = cs.DEFAULT;
            } else {
                csVar = cs.CUSTOM;
            }
            this.AFKeystoreWrapper = csVar;
        } catch (JSONException unused) {
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (this.AFInAppEventType == aoVar.AFInAppEventType && this.valueOf.equals(aoVar.valueOf)) {
            return this.AFInAppEventParameterName.equals(aoVar.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.AFInAppEventType ? 1 : 0) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }
}
