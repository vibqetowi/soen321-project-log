package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ac;
import com.appsflyer.internal.am;
import com.appsflyer.internal.db;
import com.appsflyer.internal.k;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import org.apache.http.HttpHost;
/* loaded from: classes2.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private final Map<String, String> onAppOpenAttributionNative = new HashMap();
    private String onAttributionFailureNative;
    private String onInstallConversionFailureNative;
    private String valueOf;
    private final String values;

    public LinkGenerator(String str) {
        this.values = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onInstallConversionFailureNative = str;
        return this;
    }

    public String getBrandDomain() {
        return this.onInstallConversionFailureNative;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onAttributionFailureNative = str;
        return this;
    }

    public String getChannel() {
        return this.valueOf;
    }

    public LinkGenerator setChannel(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.getLevel = str;
        return this;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.onAppOpenAttributionNative);
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAppOpenAttributionNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAppOpenAttributionNative.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventType = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()), str3);
        } else {
            this.AFInAppEventType = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : "go.onelink.me", str);
        }
        return this;
    }

    private Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.values);
        String str = this.AppsFlyer2dXConversionCallback;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.valueOf;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.getLevel;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.AFVersionDeclaration;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.init;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.onAttributionFailureNative != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onAttributionFailureNative);
            String str7 = this.AFLogger$LogLevel;
            if (str7 != null) {
                this.AFLogger$LogLevel = str7.replaceFirst("^[/]", "");
                sb.append(this.onAttributionFailureNative.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? "" : RemoteSettings.FORWARD_SLASH_STRING);
                sb.append(this.AFLogger$LogLevel);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.onAppOpenAttributionNative.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return am.AFKeystoreWrapper(hashMap);
    }

    private static String AFInAppEventParameterName(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() == 0) {
                sb.append('?');
            } else {
                sb.append(Typography.amp);
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventType;
        if (str != null && str.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
            sb.append(this.AFInAppEventType);
        } else {
            sb.append(String.format(db.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
        }
        if (this.AFKeystoreWrapper != null) {
            sb.append('/');
            sb.append(this.AFKeystoreWrapper);
        }
        sb.append(AFInAppEventParameterName(values()));
        return sb.toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.onInstallConversionFailureNative;
        Map<String, String> values = values();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, values, ac.AFInAppEventParameterName(), context);
        createOneLinkHttpTask.AFKeystoreWrapper = responseListener;
        createOneLinkHttpTask.values = str;
        if (k.values == null) {
            k.values = new k();
        }
        k.values.AFInAppEventType().execute(createOneLinkHttpTask);
    }
}
