package com.appsflyer;

import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.facebook.login.LoginLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, CreateOneLinkHttpTask.ResponseListener, DeepLinkListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFKeystoreWrapper("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFKeystoreWrapper("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: JSONException -> 0x0044, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:2:0x0000, B:17:0x003c, B:19:0x0040, B:7:0x0022, B:10:0x002c), top: B:24:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(String str, String str2) {
        char c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", LoginLogger.EVENT_EXTRAS_FAILURE);
            jSONObject.put("data", str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    c = 0;
                    if (c != 0) {
                        onInstallConversionFailureNative(jSONObject);
                        return;
                    } else if (c != 1) {
                        return;
                    } else {
                        onAttributionFailureNative(jSONObject);
                        return;
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("onAttributionFailure")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }
}
