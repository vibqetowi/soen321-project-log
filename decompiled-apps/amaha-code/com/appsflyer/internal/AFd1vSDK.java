package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public final class AFd1vSDK extends AFc1aSDK<String> {
    private final AFe1ySDK afRDLog;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFd1vSDK(AFe1ySDK aFe1ySDK, AFc1zSDK aFc1zSDK) {
        super(r2, r3, aFc1zSDK, r0.toString(), aFe1ySDK.afDebugLog);
        AFc1kSDK aFc1kSDK = aFe1ySDK.getLevel;
        AFc1kSDK aFc1kSDK2 = aFc1kSDK == null ? AFc1kSDK.CACHED_EVENT : aFc1kSDK;
        AFc1kSDK[] aFc1kSDKArr = {AFc1kSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFe1ySDK.afDebugLog);
        sb2.append("-");
        sb2.append(AFKeystoreWrapper(aFe1ySDK));
        this.afRDLog = aFe1ySDK;
    }

    private static String AFKeystoreWrapper(AFe1ySDK aFe1ySDK) {
        try {
            return new URL(aFe1ySDK.afErrorLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        String encodeToString = Base64.encodeToString(this.afRDLog.AFInAppEventType(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFc1aSDK) this).afInfoLog.valueOf(this.afRDLog.afErrorLog, encodeToString);
        return ((AFc1aSDK) this).afErrorLog.valueOf(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afRDLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return false;
    }
}
