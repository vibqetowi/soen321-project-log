package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class i {
    AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public Application AFKeystoreWrapper;
    byte[] AFLogger$LogLevel;
    String AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    String getLevel;
    String init;
    String onDeepLinkingNative;
    private final boolean onInstallConversionDataLoadedNative;
    public int onInstallConversionFailureNative;
    String valueOf;
    Map<String, Object> values;

    public i() {
        this(null, null, null, null);
    }

    public i(String str, String str2, Boolean bool, Context context) {
        this.AFInAppEventType = new HashMap();
        this.getLevel = str;
        this.onDeepLinkingNative = str2;
        this.onInstallConversionDataLoadedNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
    }

    public i AFInAppEventType(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public final boolean valueOf() {
        return this.getLevel == null && this.init == null;
    }

    public final i AFInAppEventParameterName(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventType.putAll(map);
        }
        return this;
    }

    public final Map<String, Object> values() {
        return this.AFInAppEventType;
    }

    public final i valueOf(int i) {
        this.onInstallConversionFailureNative = i;
        synchronized (this.AFInAppEventType) {
            if (this.AFInAppEventType.containsKey("counter")) {
                this.AFInAppEventType.put("counter", Integer.toString(i));
            }
            if (this.AFInAppEventType.containsKey("launch_counter")) {
                this.AFInAppEventType.put("launch_counter", Integer.toString(i));
            }
        }
        return this;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.AFLogger$LogLevel;
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String values(String str) {
        String AFInAppEventParameterName = ac.AFInAppEventParameterName().AFInAppEventParameterName(this.AFKeystoreWrapper);
        return AFInAppEventParameterName != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName).build().toString() : str;
    }
}
