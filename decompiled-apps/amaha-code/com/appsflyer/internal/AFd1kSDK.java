package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class AFd1kSDK {
    private static final long values = TimeUnit.HOURS.toSeconds(24);
    private final AFb1aSDK AFInAppEventParameterName;
    private final AFd1lSDK AFInAppEventType;

    public AFd1kSDK(AFb1aSDK aFb1aSDK, AFd1lSDK aFd1lSDK) {
        this.AFInAppEventParameterName = aFb1aSDK;
        this.AFInAppEventType = aFd1lSDK;
    }

    public final long AFKeystoreWrapper() {
        String values2 = this.AFInAppEventParameterName.values("com.appsflyer.rc.cache.max-age-fallback");
        if (values2 != null) {
            try {
                return Long.parseLong(values2);
            } catch (NumberFormatException e10) {
                StringBuilder sb2 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb2.append(e10.getMessage());
                AFLogger.afErrorLog(sb2.toString(), e10);
                return values;
            }
        }
        return values;
    }

    public final boolean valueOf() {
        if (this.AFInAppEventType.AFKeystoreWrapper == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AFd1lSDK aFd1lSDK = this.AFInAppEventType;
        if (currentTimeMillis - aFd1lSDK.values > TimeUnit.SECONDS.toMillis(aFd1lSDK.valueOf)) {
            return true;
        }
        return false;
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.values("com.appsflyer.rc.sandbox"));
    }
}
