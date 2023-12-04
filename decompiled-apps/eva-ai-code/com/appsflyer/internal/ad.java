package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.an;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ad implements Runnable {
    private static String AFInAppEventType = null;
    private static String valueOf = "https://%ssdk-services.%s/validate-android-signature";
    private String AFInAppEventParameterName;
    private WeakReference<Context> AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private Map<String, String> AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(ac.AFInAppEventType);
        sb.append("/androidevent?buildnumber=6.5.4&app_id=");
        AFInAppEventType = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.values = str2;
        this.init = str4;
        this.AFVersionDeclaration = str5;
        this.AFLogger$LogLevel = str6;
        this.AppsFlyer2dXConversionCallback = map;
        this.getLevel = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            Context context = this.AFKeystoreWrapper.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.values);
            hashMap.put("sig-data", this.init);
            hashMap.put("signature", this.getLevel);
            final HashMap hashMap2 = new HashMap(hashMap);
            new Thread(new Runnable() { // from class: com.appsflyer.internal.ad.3
                @Override // java.lang.Runnable
                public final void run() {
                    ad adVar = ad.this;
                    ad.valueOf(adVar, hashMap2, adVar.AppsFlyer2dXConversionCallback, ad.this.AFKeystoreWrapper);
                }
            }).start();
            hashMap.put("dev_key", this.AFInAppEventParameterName);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            String jSONObject = new JSONObject((Map<?, ?>) hashMap).toString();
            String format = String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName());
            ak.AFInAppEventType().AFInAppEventType(format, jSONObject);
            HttpURLConnection AFKeystoreWrapper = AFKeystoreWrapper((ct) new cr().AFInAppEventParameterName(hashMap).AFInAppEventType(format));
            int responseCode = AFKeystoreWrapper != null ? AFKeystoreWrapper.getResponseCode() : -1;
            ac.AFInAppEventParameterName();
            String AFInAppEventParameterName = ac.AFInAppEventParameterName(AFKeystoreWrapper);
            ak.AFInAppEventType().values(format, responseCode, AFInAppEventParameterName);
            JSONObject jSONObject2 = new JSONObject(AFInAppEventParameterName);
            jSONObject2.put("code", responseCode);
            if (responseCode == 200) {
                StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                sb.append(jSONObject2.toString());
                AFLogger.values(sb.toString());
                AFKeystoreWrapper(jSONObject2.optBoolean("result"), this.init, this.AFVersionDeclaration, this.AFLogger$LogLevel, jSONObject2.toString());
            } else {
                AFLogger.values("Failed Validate request");
                AFKeystoreWrapper(false, this.init, this.AFVersionDeclaration, this.AFLogger$LogLevel, jSONObject2.toString());
            }
            if (AFKeystoreWrapper != null) {
                AFKeystoreWrapper.disconnect();
            }
        } catch (Throwable th) {
            try {
                if (ac.AFInAppEventParameterName != null) {
                    AFLogger.valueOf("Failed Validate request + ex", th);
                    AFKeystoreWrapper(false, this.init, this.AFVersionDeclaration, this.AFLogger$LogLevel, th.getMessage());
                }
                AFLogger.valueOf(th.getMessage(), th);
            } finally {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    private static HttpURLConnection AFKeystoreWrapper(ct ctVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(ctVar.onDeepLinkingNative);
        AFLogger.AFInAppEventParameterName(sb.toString());
        ctVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new an.c(ctVar).values();
    }

    private static void AFKeystoreWrapper(boolean z, String str, String str2, String str3, String str4) {
        if (ac.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.AFInAppEventParameterName(sb.toString());
            if (z) {
                AFLogger.AFInAppEventParameterName("Validate in app purchase success: ".concat(String.valueOf(str4)));
                ac.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.AFInAppEventParameterName("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = ac.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    static /* synthetic */ void valueOf(ad adVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            w.AFKeystoreWrapper((Context) weakReference.get()).AFInAppEventType();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = ac.AFInAppEventType((Context) weakReference.get()).getString("referrer", "");
            i cuVar = new cu((Context) weakReference.get());
            cuVar.AFVersionDeclaration = adVar.AFInAppEventParameterName;
            cuVar.AppsFlyer2dXConversionCallback = string;
            cu cuVar2 = (cu) cuVar;
            ac AFInAppEventParameterName = ac.AFInAppEventParameterName();
            Map<String, Object> AFInAppEventType2 = AFInAppEventParameterName.AFInAppEventType(cuVar);
            AFInAppEventType2.put(FirebaseAnalytics.Param.PRICE, adVar.AFVersionDeclaration);
            AFInAppEventType2.put(FirebaseAnalytics.Param.CURRENCY, adVar.AFLogger$LogLevel);
            AFInAppEventType2.put("receipt_data", map);
            if (map2 != null) {
                AFInAppEventType2.put("extra_prms", map2);
            }
            AFInAppEventType2.putAll(AFInAppEventParameterName.values().init().AFInAppEventParameterName());
            ak.AFInAppEventType().AFInAppEventType(obj, new JSONObject((Map<?, ?>) AFInAppEventType2).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = AFKeystoreWrapper((ct) cuVar.AFInAppEventParameterName(AFInAppEventType2).AFInAppEventType(obj));
                int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
                String AFInAppEventParameterName2 = ac.AFInAppEventParameterName(httpURLConnection);
                ak.AFInAppEventType().values(obj, responseCode, AFInAppEventParameterName2);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(responseCode);
                sb2.append(": ");
                sb2.append(new JSONObject(AFInAppEventParameterName2).toString());
                AFLogger.values(sb2.toString());
            } catch (Throwable th) {
                try {
                    AFLogger.valueOf(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
    }
}
