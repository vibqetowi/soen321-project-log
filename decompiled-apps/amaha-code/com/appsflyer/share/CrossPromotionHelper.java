package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1oSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1eSDK;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String valueOf = "https://%simpression.%s";

    private static LinkGenerator AFInAppEventParameterName(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    private static void AFInAppEventType(String str, Context context, AFb1oSDK aFb1oSDK) {
        AFb1xSDK AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper();
        AFKeystoreWrapper.AFKeystoreWrapper(context);
        AFc1zSDK values = AFKeystoreWrapper.values();
        AFd1zSDK aFd1zSDK = new AFd1zSDK(values, str, aFb1oSDK);
        AFc1mSDK afErrorLog = values.afErrorLog();
        afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1zSDK));
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c10;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (key.equals("app")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    valueOf = value;
                }
            } else {
                AFe1eSDK.values = value;
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventParameterName = AFInAppEventParameterName(context, str, str2, map, String.format(AFe1eSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("af_campaign", str2);
            AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
            AFInAppEventType(AFInAppEventParameterName.generateLink(), context, new AFb1oSDK(context));
        }
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventType(AFInAppEventParameterName(context, str, str2, map, String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName())).generateLink(), context, null);
        }
    }
}
