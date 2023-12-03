package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1xSDK;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        LinkGenerator addParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AFb1xSDK.AFInAppEventType()).addParameter("af_siteid", context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_SCHEME);
        if (string3 != null && string3.length() > 3) {
            addParameter.setBaseDeeplink(string3);
        }
        return addParameter;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
        } else {
            LinkGenerator generateInviteUrl = generateInviteUrl(context);
            generateInviteUrl.addParameters(map);
            AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
            StringBuilder sb2 = new StringBuilder("[Invite] Generated URL: ");
            sb2.append(generateInviteUrl.generateLink());
            AFLogger.afDebugLog(sb2.toString());
            String mediaSource = generateInviteUrl.getMediaSource();
            if ("af_app_invites".equals(mediaSource)) {
                mediaSource = AFInAppEventType.INVITE;
            } else if ("af_user_share".equals(mediaSource)) {
                mediaSource = AFInAppEventType.SHARE;
            }
            HashMap hashMap = new HashMap();
            if (generateInviteUrl.getUserParams() != null) {
                hashMap.putAll(generateInviteUrl.getUserParams());
            }
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str);
            AppsFlyerLib.getInstance().logEvent(context, mediaSource, hashMap);
        }
    }
}
