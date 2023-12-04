package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class cg {
    public static void AFInAppEventType(ac acVar, i iVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        if (iVar.valueOf()) {
            if (ac.AFKeystoreWrapper == null) {
                AFLogger.AFInAppEventParameterName("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb.append(iVar.onInstallConversionFailureNative);
            AFLogger.AFInAppEventParameterName(sb.toString());
            long j = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
            if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                AFLogger.AFInAppEventParameterName("[GCD-E02] Cached conversion data expired");
                ac.values(context, "sixtyDayConversionData");
                ac.valueOf(context, "attributionId", (String) null);
                acVar.AFInAppEventType(context, "appsflyerConversionDataCacheExpiration", 0L);
            }
            if (sharedPreferences.getString("attributionId", null) == null) {
                if (th != null) {
                    StringBuilder sb2 = new StringBuilder("Launch exception: ");
                    sb2.append(th.getMessage());
                    cc.AFInAppEventParameterName(sb2.toString());
                } else if (num.intValue() != 200) {
                    cc.AFInAppEventParameterName("Launch status code: ".concat(String.valueOf(num)));
                } else {
                    cc ccVar = new cc(acVar, (Application) context.getApplicationContext(), str);
                    ac.valueOf(ccVar.AFInAppEventParameterName, ccVar, 10L, TimeUnit.MILLISECONDS);
                }
            } else if (acVar.valueOf(sharedPreferences, false) <= 1) {
            } else {
                try {
                    Map<String, Object> AFInAppEventParameterName = AFInAppEventParameterName(context);
                    if (AFInAppEventParameterName == null) {
                        return;
                    }
                    if (!AFInAppEventParameterName.containsKey("is_first_launch")) {
                        AFInAppEventParameterName.put("is_first_launch", Boolean.FALSE);
                    }
                    cc.values(AFInAppEventParameterName);
                } catch (ce e) {
                    AFLogger.valueOf(e.getMessage(), e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> AFInAppEventParameterName(Context context) throws ce {
        String string = ac.AFInAppEventType(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return values(string);
        }
        throw new ce();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> values(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }
}
