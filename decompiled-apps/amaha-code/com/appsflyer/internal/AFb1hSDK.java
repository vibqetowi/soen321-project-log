package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class AFb1hSDK {
    public static void AFInAppEventParameterName(String str, DeepLinkResult.Error error) {
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventType(new DeepLinkResult(null, error));
            return;
        }
        valueOf(str);
    }

    public static void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName != null) {
            StringBuilder sb2 = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            AFLogger.afDebugLog(sb2.toString());
            try {
                AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
                return;
            }
        }
        AFLogger.afDebugLog("[DDL] skipping, no callback registered");
    }

    private static void valueOf(Map<String, String> map) {
        if (AFb1xSDK.AFInAppEventType != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                AFb1xSDK.AFInAppEventType.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public static void values(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName != null) {
            try {
                try {
                    DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                    AFKeystoreWrapper.AFKeystoreWrapper.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(AFKeystoreWrapper, null);
                } catch (JSONException e10) {
                    AFLogger.afErrorLog("[DDL] Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventType(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFInAppEventType(new DeepLinkResult(null, null));
                throw th2;
            }
        }
        valueOf(map);
    }

    private static void valueOf(String str) {
        if (AFb1xSDK.AFInAppEventType != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                AFb1xSDK.AFInAppEventType.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
