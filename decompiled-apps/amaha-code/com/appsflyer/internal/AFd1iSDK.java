package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFc1mSDK;
import com.google.firebase.messaging.FirebaseMessagingService;
/* loaded from: classes.dex */
public final class AFd1iSDK {
    public static String AFKeystoreWrapper;
    public final AFd1qSDK values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(AFb1xSDK.AFInAppEventParameterName);
        AFKeystoreWrapper = sb2.toString();
    }

    public AFd1iSDK(Context context) {
        this.values = AFb1xSDK.AFKeystoreWrapper().AFInAppEventParameterName(context);
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th2);
        }
        if (!AFb1wSDK.AFInAppEventType(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
            return false;
        }
        return true;
    }

    public static void valueOf(String str) {
        AFc1zSDK values = AFb1xSDK.AFKeystoreWrapper().values();
        AFd1rSDK aFd1rSDK = new AFd1rSDK(str, values);
        AFc1mSDK afErrorLog = values.afErrorLog();
        afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1rSDK));
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    public final AFb1rSDK AFInAppEventParameterName() {
        String string;
        String string2;
        String AFInAppEventType = this.values.AFInAppEventType("afUninstallToken", (String) null);
        long AFKeystoreWrapper2 = this.values.AFKeystoreWrapper("afUninstallToken_received_time");
        boolean AFInAppEventParameterName = this.values.AFInAppEventParameterName("afUninstallToken_queued");
        this.values.AFKeystoreWrapper("afUninstallToken_queued", false);
        if (AFInAppEventType == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string2.split(",");
            AFInAppEventType = split[split.length - 1];
        }
        if (AFKeystoreWrapper2 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split2 = string.split(",");
            if (split2.length >= 2) {
                try {
                    AFKeystoreWrapper2 = Long.parseLong(split2[split2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (AFInAppEventType == null) {
            return null;
        }
        return new AFb1rSDK(AFInAppEventType, AFKeystoreWrapper2, AFInAppEventParameterName);
    }
}
