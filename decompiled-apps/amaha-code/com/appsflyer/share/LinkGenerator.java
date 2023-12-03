package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFe1eSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private String afWarnLog;
    private final Map<String, String> getLevel = new HashMap();
    private String init;
    String valueOf;
    private final String values;

    /* loaded from: classes.dex */
    public interface AFa1ySDK {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.values = str;
    }

    private Map<String, String> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.values);
        String str = this.afDebugLog;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventParameterName;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.afInfoLog;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFKeystoreWrapper;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.afRDLog;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.AFLogger;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.afWarnLog != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.afWarnLog);
            String str7 = this.afErrorLog;
            if (str7 != null) {
                String str8 = "";
                this.afErrorLog = str7.replaceFirst("^[/]", "");
                if (!this.afWarnLog.endsWith("/")) {
                    str8 = "/";
                }
                sb2.append(str8);
                sb2.append(this.afErrorLog);
            }
            hashMap.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.getLevel.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1sSDK.AFInAppEventType(hashMap);
    }

    private static String AFKeystoreWrapper(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        return sb2.toString();
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.getLevel.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.getLevel.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFInAppEventType;
        if (str != null && str.startsWith("http")) {
            sb2.append(this.AFInAppEventType);
        } else {
            sb2.append(String.format(AFe1eSDK.values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        }
        if (this.valueOf != null) {
            sb2.append('/');
            sb2.append(this.valueOf);
        }
        sb2.append(AFKeystoreWrapper(AFInAppEventParameterName()));
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.init;
    }

    public String getCampaign() {
        return this.AFKeystoreWrapper;
    }

    public String getChannel() {
        return this.AFInAppEventParameterName;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.getLevel);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afWarnLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            this.AFInAppEventType = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : "go.onelink.me", str);
        } else {
            this.AFInAppEventType = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()), str3);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.afDebugLog = str;
        return this;
    }

    public void generateLink(Context context, AFa1ySDK aFa1ySDK) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.init;
        Map<String, String> AFInAppEventParameterName = AFInAppEventParameterName();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1xSDK.AFKeystoreWrapper().AFKeystoreWrapper(context);
        AFc1zSDK values = AFb1xSDK.AFKeystoreWrapper().values();
        AFd1ySDK aFd1ySDK = new AFd1ySDK(values, UUID.randomUUID(), string, AFInAppEventParameterName, str, aFa1ySDK);
        AFc1mSDK afErrorLog = values.afErrorLog();
        afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1ySDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new AFa1ySDK() { // from class: com.appsflyer.share.LinkGenerator.3
            @Override // com.appsflyer.share.LinkGenerator.AFa1ySDK
            public final void onResponse(String str) {
                CreateOneLinkHttpTask.ResponseListener.this.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.AFa1ySDK
            public final void onResponseError(String str) {
                CreateOneLinkHttpTask.ResponseListener.this.onResponseError(str);
            }
        });
    }
}
