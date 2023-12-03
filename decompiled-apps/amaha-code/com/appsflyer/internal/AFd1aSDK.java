package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class AFd1aSDK extends AFc1lSDK<Void> {
    private final AFd1qSDK afDebugLog;
    private final AFc1nSDK<String> afErrorLog;
    private final Throwable afInfoLog;

    public AFd1aSDK(AFd1sSDK aFd1sSDK, AFd1qSDK aFd1qSDK) {
        super(AFc1kSDK.GCDSDK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, "GCD-CHECK");
        this.afInfoLog = aFd1sSDK.afErrorLog();
        this.afErrorLog = aFd1sSDK.afDebugLog;
        this.afDebugLog = aFd1qSDK;
    }

    private Map<String, Object> afDebugLog() {
        String AFInAppEventType = this.afDebugLog.AFInAppEventType("attributionId", (String) null);
        if (AFInAppEventType == null) {
            return null;
        }
        try {
            return AFc1vSDK.AFInAppEventParameterName(AFInAppEventType);
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final AFc1jSDK AFInAppEventType() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afDebugLog.valueOf("appsFlyerCount"))));
        long AFKeystoreWrapper = this.afDebugLog.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration");
        if (AFKeystoreWrapper != 0 && System.currentTimeMillis() - AFKeystoreWrapper > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afDebugLog.AFKeystoreWrapper("sixtyDayConversionData", true);
            this.afDebugLog.valueOf("attributionId", null);
            this.afDebugLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> afDebugLog = afDebugLog();
        if (afDebugLog != null) {
            try {
                if (!afDebugLog.containsKey("is_first_launch")) {
                    afDebugLog.put("is_first_launch", Boolean.FALSE);
                }
                AFd1hSDK.valueOf(afDebugLog);
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e10.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e10);
            }
            return AFc1jSDK.SUCCESS;
        }
        try {
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb3.append(e11.getLocalizedMessage());
            AFLogger.afErrorLog(sb3.toString(), e11);
        }
        if (this.afInfoLog != null) {
            StringBuilder sb4 = new StringBuilder("Launch exception: ");
            sb4.append(this.afInfoLog.getMessage());
            AFd1hSDK.AFInAppEventParameterName(sb4.toString());
            return AFc1jSDK.SUCCESS;
        }
        AFc1nSDK<String> aFc1nSDK = this.afErrorLog;
        if (aFc1nSDK != null && !aFc1nSDK.isSuccessful()) {
            StringBuilder sb5 = new StringBuilder("Launch status code: ");
            sb5.append(this.afErrorLog.getStatusCode());
            AFd1hSDK.AFInAppEventParameterName(sb5.toString());
            return AFc1jSDK.SUCCESS;
        }
        return AFc1jSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 1000L;
    }
}
