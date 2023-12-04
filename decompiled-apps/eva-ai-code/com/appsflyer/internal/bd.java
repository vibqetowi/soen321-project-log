package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class bd {
    private static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug?app_id=";
    public static String AFKeystoreWrapper = "https://cdn-testsettings.appsflyersdk.com/android/v1/%s/settings";
    public static String values = "https://cdn-settings.appsflyersdk.com/android/v1/%s/settings";
    public final ab AFInAppEventType;
    private final AppsFlyerProperties AFLogger$LogLevel;
    public final aa valueOf;

    public bd(ab abVar, aa aaVar, AppsFlyerProperties appsFlyerProperties) {
        this.AFInAppEventType = abVar;
        this.valueOf = aaVar;
        this.AFLogger$LogLevel = appsFlyerProperties;
    }

    public final bl<String> AFKeystoreWrapper(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
        sb.append(this.valueOf.AFInAppEventParameterName.getPackageName());
        z zVar = new z(sb.toString(), new JSONObject((Map<?, ?>) map).toString().getBytes(), "POST", Collections.emptyMap(), false);
        bj bjVar = new bj();
        zVar.AFInAppEventParameterName = AFInAppEventType();
        ab abVar = this.AFInAppEventType;
        return new bl<>(zVar, abVar.AFKeystoreWrapper, abVar.valueOf, bjVar);
    }

    public final boolean AFInAppEventType() {
        return !this.AFLogger$LogLevel.getBoolean(AppsFlyerProperties.HTTP_CACHE, true);
    }
}
