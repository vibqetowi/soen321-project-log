package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
/* loaded from: classes.dex */
public final class AFb1aSDK {
    private static String AFInAppEventParameterName = "219";
    public final AFb1bSDK AFKeystoreWrapper;
    private Bundle valueOf = null;
    public final AFd1qSDK values;

    public AFb1aSDK(AFb1bSDK aFb1bSDK, AFd1qSDK aFd1qSDK) {
        this.AFKeystoreWrapper = aFb1bSDK;
        this.values = aFd1qSDK;
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String AFKeystoreWrapper() {
        StringBuilder sb2 = new StringBuilder("version: 6.9.1 (build ");
        sb2.append(AFInAppEventParameterName);
        sb2.append(")");
        return sb2.toString();
    }

    public final String AFInAppEventType() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = values("CHANNEL");
        }
        if (string != null && string.equals("")) {
            return null;
        }
        return string;
    }

    public final String values(String str) {
        Object obj;
        try {
            if (this.valueOf == null) {
                this.valueOf = ((PackageItemInfo) this.AFKeystoreWrapper.values.getPackageManager().getApplicationInfo(this.AFKeystoreWrapper.values.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.valueOf;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }
}
