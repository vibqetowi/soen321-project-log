package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFd1fSDK extends AFc1aSDK<Map<String, Object>> {
    private static final List<String> afRDLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFd1bSDK AFLogger$LogLevel;
    private final AFb1aSDK AFVersionDeclaration;
    private final AFd1qSDK afWarnLog;
    private Map<String, Object> getLevel;
    private final AFc1uSDK init;
    private String onAttributionFailureNative;

    public AFd1fSDK(AFc1zSDK aFc1zSDK) {
        super(AFc1kSDK.GCDSDK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, "GCD-FETCH");
        this.init = aFc1zSDK.AFInAppEventType();
        this.afWarnLog = aFc1zSDK.afRDLog();
        this.AFLogger$LogLevel = aFc1zSDK.afInfoLog();
        this.AFVersionDeclaration = aFc1zSDK.AFInAppEventParameterName();
        this.AFKeystoreWrapper.add(AFc1kSDK.CONVERSION);
        this.AFKeystoreWrapper.add(AFc1kSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        super.AFInAppEventParameterName();
        Map<String, Object> map = this.getLevel;
        String str = this.onAttributionFailureNative;
        if (map != null) {
            AFd1hSDK.valueOf(map);
        } else if (str != null && !str.isEmpty()) {
            AFd1hSDK.AFInAppEventParameterName(str);
        } else {
            AFd1hSDK.AFInAppEventParameterName("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<Map<String, Object>> AFInAppEventType(String str) {
        String str2;
        String AFInAppEventParameterName = AFb1xSDK.AFInAppEventParameterName(this.afWarnLog, this.AFVersionDeclaration.AFInAppEventType());
        if (AFInAppEventParameterName != null && !AFInAppEventParameterName.trim().isEmpty()) {
            if (!afRDLog.contains(AFInAppEventParameterName.toLowerCase())) {
                str2 = "-".concat(AFInAppEventParameterName);
                AFc1wSDK<Map<String, Object>> valueOf = this.init.valueOf(str2, str);
                StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
                sb2.append(valueOf.valueOf.AFInAppEventType);
                AFb1rSDK.valueOf(sb2.toString());
                return valueOf;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFInAppEventParameterName));
        }
        str2 = "";
        AFc1wSDK<Map<String, Object>> valueOf2 = this.init.valueOf(str2, str);
        StringBuilder sb22 = new StringBuilder("[GCD-B01] URL: ");
        sb22.append(valueOf2.valueOf.AFInAppEventType);
        AFb1rSDK.valueOf(sb22.toString());
        return valueOf2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[Catch: all -> 0x0105, Exception -> 0x0107, AFc1gSDK -> 0x0136, TryCatch #1 {AFc1gSDK -> 0x0136, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:33:0x0069, B:35:0x007d, B:37:0x0097, B:39:0x009d, B:40:0x00a8, B:42:0x00ae, B:44:0x00b4, B:45:0x00ca, B:46:0x00db, B:48:0x00fa, B:49:0x00ff), top: B:68:0x0025, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x0105, Exception -> 0x0107, AFc1gSDK -> 0x0136, TryCatch #1 {AFc1gSDK -> 0x0136, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:33:0x0069, B:35:0x007d, B:37:0x0097, B:39:0x009d, B:40:0x00a8, B:42:0x00ae, B:44:0x00b4, B:45:0x00ca, B:46:0x00db, B:48:0x00fa, B:49:0x00ff), top: B:68:0x0025, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[Catch: all -> 0x0105, Exception -> 0x0107, AFc1gSDK -> 0x0136, TryCatch #1 {AFc1gSDK -> 0x0136, blocks: (B:12:0x0025, B:15:0x002f, B:22:0x003f, B:30:0x0052, B:33:0x0069, B:35:0x007d, B:37:0x0097, B:39:0x009d, B:40:0x00a8, B:42:0x00ae, B:44:0x00b4, B:45:0x00ca, B:46:0x00db, B:48:0x00fa, B:49:0x00ff), top: B:68:0x0025, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0052 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1jSDK AFInAppEventType() {
        AFc1jSDK aFc1jSDK;
        boolean z10;
        Map<String, Object> map;
        int statusCode;
        Boolean bool;
        AFc1jSDK aFc1jSDK2;
        if (!((AFc1aSDK) this).AFLogger.values()) {
            AFc1jSDK aFc1jSDK3 = AFc1jSDK.FAILURE;
            int i6 = 0;
            while (i6 <= 2) {
                boolean z11 = i6 >= 2;
                this.AFLogger$LogLevel.afWarnLog = System.currentTimeMillis();
                try {
                    try {
                        try {
                            aFc1jSDK = super.AFInAppEventType();
                            ResponseNetwork responseNetwork = this.afDebugLog;
                            if (responseNetwork != null) {
                                int statusCode2 = responseNetwork.getStatusCode();
                                if (statusCode2 != 403 && statusCode2 < 500) {
                                    z10 = false;
                                    if (!responseNetwork.isSuccessful() && statusCode2 != 404) {
                                        if (!z11) {
                                            if (!z10) {
                                            }
                                        }
                                        this.onAttributionFailureNative = "Error connection to server: ".concat(String.valueOf(statusCode2));
                                        aFc1jSDK2 = AFc1jSDK.FAILURE;
                                        return aFc1jSDK2;
                                    }
                                    map = (Map) responseNetwork.getBody();
                                    statusCode = responseNetwork.getStatusCode();
                                    bool = (Boolean) map.get("iscache");
                                    if (statusCode == 404) {
                                        map.remove("error_reason");
                                        map.remove("status_code");
                                        map.put("af_status", "Organic");
                                        map.put("af_message", "organic install");
                                    }
                                    if (bool != null && !bool.booleanValue()) {
                                        this.afWarnLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                    }
                                    if (map.containsKey("af_siteid")) {
                                        if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                            StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                            sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                            AFLogger.afDebugLog(sb2.toString());
                                        } else {
                                            AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                        }
                                    }
                                    map.put("is_first_launch", Boolean.FALSE);
                                    this.afWarnLog.valueOf("attributionId", new JSONObject(map).toString());
                                    if (!this.afWarnLog.AFInAppEventParameterName("sixtyDayConversionData")) {
                                        map.put("is_first_launch", Boolean.TRUE);
                                    }
                                    this.getLevel = map;
                                    aFc1jSDK2 = AFc1jSDK.SUCCESS;
                                    return aFc1jSDK2;
                                }
                                z10 = true;
                                if (!responseNetwork.isSuccessful()) {
                                    if (!z11) {
                                    }
                                    this.onAttributionFailureNative = "Error connection to server: ".concat(String.valueOf(statusCode2));
                                    aFc1jSDK2 = AFc1jSDK.FAILURE;
                                    return aFc1jSDK2;
                                }
                                map = (Map) responseNetwork.getBody();
                                statusCode = responseNetwork.getStatusCode();
                                bool = (Boolean) map.get("iscache");
                                if (statusCode == 404) {
                                }
                                if (bool != null) {
                                    this.afWarnLog.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                }
                                if (map.containsKey("af_siteid")) {
                                }
                                map.put("is_first_launch", Boolean.FALSE);
                                this.afWarnLog.valueOf("attributionId", new JSONObject(map).toString());
                                if (!this.afWarnLog.AFInAppEventParameterName("sixtyDayConversionData")) {
                                }
                                this.getLevel = map;
                                aFc1jSDK2 = AFc1jSDK.SUCCESS;
                                return aFc1jSDK2;
                            }
                        } catch (AFc1gSDK e10) {
                            AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                            this.onAttributionFailureNative = "AppsFlyer dev key is missing";
                            throw e10;
                        }
                    } catch (Exception e11) {
                        StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                        sb3.append(e11.getMessage());
                        AFLogger.afErrorLog(sb3.toString(), e11);
                        aFc1jSDK = AFc1jSDK.FAILURE;
                        if (z11) {
                            this.onAttributionFailureNative = e11.getMessage();
                            throw e11;
                        }
                    }
                    aFc1jSDK3 = aFc1jSDK;
                    i6++;
                } finally {
                    this.AFLogger$LogLevel.values(i6);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                }
            }
            return aFc1jSDK3;
        }
        AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
        this.onAttributionFailureNative = "'isStopTracking' enabled";
        throw new AFc1dSDK();
    }
}
