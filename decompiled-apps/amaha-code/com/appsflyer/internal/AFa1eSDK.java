package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1eSDK implements Runnable {
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private String AFInAppEventParameterName;
    private String AFInAppEventType;
    private Map<String, String> AFLogger;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private WeakReference<Context> values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%svalidate.%s/api/v");
        sb2.append(AFb1xSDK.values);
        sb2.append("/androidevent?buildnumber=6.9.1&app_id=");
        valueOf = sb2.toString();
    }

    public AFa1eSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.afErrorLog = str4;
        this.afRDLog = str5;
        this.afInfoLog = str6;
        this.AFLogger = map;
        this.afDebugLog = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(boolean z10, String str, String str2, String str3, String str4) {
        if (AFb1xSDK.valueOf != null) {
            StringBuilder sb2 = new StringBuilder("Validate callback parameters: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            AFLogger.afDebugLog(sb2.toString());
            if (z10) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1xSDK.valueOf.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1xSDK.valueOf;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.AFInAppEventParameterName);
            hashMap.put("sig-data", this.afErrorLog);
            hashMap.put("signature", this.afDebugLog);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
            sb2.append(context.getPackageName());
            String obj2 = sb2.toString();
            String string = AFb1xSDK.valueOf(context).getString("referrer", "");
            AFa1tSDK aFe1nSDK = new AFe1nSDK(context);
            aFe1nSDK.afRDLog = string;
            AFb1xSDK AFKeystoreWrapper2 = AFb1xSDK.AFKeystoreWrapper();
            Map<String, Object> values = AFKeystoreWrapper2.values(aFe1nSDK);
            values.put("price", this.afRDLog);
            values.put("currency", this.afInfoLog);
            values.put("receipt_data", hashMap2);
            if (obj != null) {
                values.put("extra_prms", obj);
            }
            values.putAll(AFKeystoreWrapper2.values().AFVersionDeclaration().AFInAppEventType());
            AFInAppEventType(context, (AFe1nSDK) aFe1nSDK.AFInAppEventType(values).AFKeystoreWrapper(obj2));
            hashMap.put("dev_key", this.AFInAppEventType);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put(SessionManager.KEY_UID, AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string2 != null) {
                hashMap.put("advertiserId", string2);
            }
            AFe1rSDK aFe1rSDK = (AFe1rSDK) new AFe1rSDK().AFInAppEventType(hashMap).AFKeystoreWrapper(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
            final AFd1uSDK AFInAppEventType = AFInAppEventType(context, aFe1rSDK);
            aFe1rSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1eSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i6, String str2) {
                    ResponseNetwork responseNetwork;
                    if (i6 == RequestError.RESPONSE_CODE_FAILURE && (responseNetwork = AFInAppEventType.afDebugLog) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1eSDK.values(false, AFa1eSDK.this.afErrorLog, AFa1eSDK.this.afRDLog, AFa1eSDK.this.afInfoLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) AFInAppEventType.afDebugLog.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1eSDK.values(jSONObject.optBoolean("result"), AFa1eSDK.this.afErrorLog, AFa1eSDK.this.afRDLog, AFa1eSDK.this.afInfoLog, jSONObject.toString());
                    } catch (Exception e10) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e10)), e10);
                        AFa1eSDK.values(false, AFa1eSDK.this.afErrorLog, AFa1eSDK.this.afRDLog, AFa1eSDK.this.afInfoLog, e10.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFb1xSDK.valueOf != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                values(false, this.afErrorLog, this.afRDLog, this.afInfoLog, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    private static AFd1uSDK AFInAppEventType(Context context, AFe1qSDK aFe1qSDK) {
        AFb1xSDK.AFKeystoreWrapper().AFKeystoreWrapper(context);
        AFc1zSDK values = AFb1xSDK.AFKeystoreWrapper().values();
        AFd1uSDK aFd1uSDK = new AFd1uSDK(aFe1qSDK, values);
        AFc1mSDK afErrorLog = values.afErrorLog();
        afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1uSDK));
        return aFd1uSDK;
    }
}
