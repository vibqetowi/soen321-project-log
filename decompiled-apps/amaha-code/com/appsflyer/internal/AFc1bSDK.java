package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1mSDK;
/* loaded from: classes.dex */
public final class AFc1bSDK extends AFc1lSDK<Boolean> {
    private static volatile boolean afErrorLog = false;
    private final AFc1zSDK AFLogger;
    private final AFc1mSDK afDebugLog;
    private final AFa1pSDK afInfoLog;

    public AFc1bSDK(AFc1zSDK aFc1zSDK) {
        super(AFc1kSDK.LOAD_CACHE, new AFc1kSDK[0], "LoadCachedRequests");
        this.afInfoLog = aFc1zSDK.getLevel();
        this.afDebugLog = aFc1zSDK.afErrorLog();
        this.AFLogger = aFc1zSDK;
    }

    public static boolean afRDLog() {
        return afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final AFc1jSDK AFInAppEventType() {
        for (AFa1dSDK aFa1dSDK : this.afInfoLog.valueOf()) {
            StringBuilder sb2 = new StringBuilder("CACHE: resending request: ");
            sb2.append(aFa1dSDK.values);
            AFLogger.afInfoLog(sb2.toString());
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long parseLong = Long.parseLong(aFa1dSDK.AFInAppEventParameterName, 10);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(aFa1dSDK.values);
                sb3.append("&isCachedRequest=true&timeincache=");
                sb3.append((currentTimeMillis - parseLong) / 1000);
                AFe1ySDK aFe1ySDK = new AFe1ySDK(sb3.toString(), aFa1dSDK.AFInAppEventParameterName(), aFa1dSDK.AFInAppEventParameterName, aFa1dSDK.AFInAppEventType);
                AFc1mSDK aFc1mSDK = this.afDebugLog;
                aFc1mSDK.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(new AFd1vSDK(aFe1ySDK, this.AFLogger)));
            } catch (Exception e10) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e10);
            }
        }
        afErrorLog = true;
        return AFc1jSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 30000L;
    }
}
