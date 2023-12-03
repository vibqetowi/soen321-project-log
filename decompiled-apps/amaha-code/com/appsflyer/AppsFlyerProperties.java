package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1xSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties values = new AppsFlyerProperties();
    private final Map<String, Object> AFInAppEventParameterName = new HashMap();
    private boolean AFInAppEventType = false;
    public boolean AFKeystoreWrapper;
    public String valueOf;

    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        
        private final int AFKeystoreWrapper;

        EmailsCryptType(int i6) {
            this.AFKeystoreWrapper = i6;
        }

        public final int getValue() {
            return this.AFKeystoreWrapper;
        }
    }

    private AppsFlyerProperties() {
    }

    private boolean AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public static AppsFlyerProperties getInstance() {
        return values;
    }

    public boolean getBoolean(String str, boolean z10) {
        String string = getString(str);
        if (string == null) {
            return z10;
        }
        return Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i6) {
        String string = getString(str);
        if (string == null) {
            return i6;
        }
        return Integer.parseInt(string);
    }

    public long getLong(String str, long j10) {
        String string = getString(str);
        if (string == null) {
            return j10;
        }
        return Long.parseLong(string);
    }

    public synchronized Object getObject(String str) {
        return this.AFInAppEventParameterName.get(str);
    }

    public String getReferrer(Context context) {
        String str = this.valueOf;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AFb1xSDK.valueOf(context).getString("referrer", null);
    }

    public synchronized String getString(String str) {
        return (String) this.AFInAppEventParameterName.get(str);
    }

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        if (getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel()) {
            return true;
        }
        return false;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(Context context) {
        if (AFInAppEventParameterName()) {
            return;
        }
        SharedPreferences valueOf = AFb1xSDK.valueOf(context);
        String string = valueOf.getString("savedProperties", null);
        if (string != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.AFInAppEventParameterName.get(next) == null) {
                        this.AFInAppEventParameterName.put(next, jSONObject.getString(next));
                    }
                }
                if (this.AFInAppEventParameterName.containsKey("AppsFlyerKey")) {
                    this.AFInAppEventParameterName.remove("AppsFlyerKey");
                    saveProperties(valueOf);
                }
                this.AFInAppEventType = true;
            } catch (JSONException e10) {
                AFLogger.afErrorLog("Failed loading properties", e10);
            }
            StringBuilder sb2 = new StringBuilder("Done loading properties: ");
            sb2.append(this.AFInAppEventType);
            AFLogger.afDebugLog(sb2.toString());
        }
    }

    public synchronized void remove(String str) {
        this.AFInAppEventParameterName.remove(str);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        this.AFInAppEventParameterName.remove("AppsFlyerKey");
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.AFInAppEventParameterName).toString()).apply();
    }

    public synchronized void set(String str, String str2) {
        this.AFInAppEventParameterName.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.AFInAppEventParameterName.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFInAppEventParameterName.put(USER_EMAILS, str);
    }

    public final boolean values() {
        return this.AFKeystoreWrapper;
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFInAppEventParameterName.put(str, strArr);
    }

    public synchronized void set(String str, int i6) {
        this.AFInAppEventParameterName.put(str, Integer.toString(i6));
    }

    public synchronized void set(String str, long j10) {
        this.AFInAppEventParameterName.put(str, Long.toString(j10));
    }

    public synchronized void set(String str, boolean z10) {
        this.AFInAppEventParameterName.put(str, Boolean.toString(z10));
    }
}
