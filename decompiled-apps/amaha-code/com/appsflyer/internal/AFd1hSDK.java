package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFd1hSDK {
    public static void AFInAppEventParameterName(String str) {
        if (AFb1xSDK.AFInAppEventType != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            AFb1xSDK.AFInAppEventType.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        if (AFb1xSDK.AFInAppEventType != null) {
            StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb2.append(map.toString());
            AFLogger.afDebugLog(sb2.toString());
            AFb1xSDK.AFInAppEventType.onConversionDataSuccess(map);
        }
    }
}
