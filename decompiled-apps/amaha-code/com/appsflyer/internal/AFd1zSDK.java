package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
/* loaded from: classes.dex */
public final class AFd1zSDK extends AFc1aSDK<String> {
    private final String afRDLog;
    private final AFb1oSDK getLevel;

    public AFd1zSDK(AFc1zSDK aFc1zSDK, String str, AFb1oSDK aFb1oSDK) {
        super(AFc1kSDK.IMPRESSIONS, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, str);
        this.afRDLog = str;
        this.getLevel = aFb1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        super.AFInAppEventParameterName();
        AFc1nSDK<Result> aFc1nSDK = this.afDebugLog;
        if (aFc1nSDK != 0) {
            int statusCode = aFc1nSDK.getStatusCode();
            if (statusCode != 200) {
                if (statusCode != 301 && statusCode != 302) {
                    StringBuilder sb2 = new StringBuilder("call to ");
                    sb2.append(this.afRDLog);
                    sb2.append(" failed: ");
                    sb2.append(statusCode);
                    AFLogger.afInfoLog(sb2.toString());
                    return;
                }
                StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
                sb3.append(this.afRDLog);
                AFLogger.afInfoLog(sb3.toString(), false);
                String AFInAppEventType = aFc1nSDK.AFInAppEventType("Location");
                AFb1oSDK aFb1oSDK = this.getLevel;
                if (aFb1oSDK != null && AFInAppEventType != null) {
                    aFb1oSDK.values = AFInAppEventType;
                    Context context = aFb1oSDK.AFKeystoreWrapper.get();
                    if (context != null) {
                        try {
                            if (aFb1oSDK.values != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFb1oSDK.values)).setFlags(268435456));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e10)), e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion impressions success: ");
            sb4.append(this.afRDLog);
            AFLogger.afInfoLog(sb4.toString(), false);
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        return ((AFc1aSDK) this).afErrorLog.AFInAppEventType(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return false;
    }
}
