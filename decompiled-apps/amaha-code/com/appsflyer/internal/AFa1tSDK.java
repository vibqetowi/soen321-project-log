package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFa1tSDK {
    String AFInAppEventParameterName;
    public AppsFlyerRequestListener AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    String AFLogger;
    private final boolean AFVersionDeclaration;
    public String afDebugLog;
    public String afErrorLog;
    public int afInfoLog;
    String afRDLog;
    private byte[] afWarnLog;
    public Application valueOf;
    public final Map<String, Object> values;

    public AFa1tSDK() {
        this(null, null, null, null);
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        return this.values;
    }

    public final AFa1tSDK AFInAppEventType(Map<String, ?> map) {
        synchronized (map) {
            this.values.putAll(map);
        }
        return this;
    }

    public AFa1tSDK AFKeystoreWrapper(String str) {
        this.afErrorLog = str;
        return this;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afErrorLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public final boolean valueOf() {
        if (this.AFLogger == null && this.afDebugLog == null) {
            return true;
        }
        return false;
    }

    public final AFa1tSDK values(byte[] bArr) {
        this.afWarnLog = bArr;
        return this;
    }

    public abstract AFc1kSDK values();

    public AFa1tSDK(String str, String str2, Boolean bool, Context context) {
        this.values = new HashMap();
        this.AFLogger = str;
        this.afErrorLog = str2;
        this.AFVersionDeclaration = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.valueOf = (Application) context.getApplicationContext();
        }
    }

    public final AFa1tSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.values) {
            this.values.put(str, obj);
        }
        return this;
    }

    public final String values(String str) {
        String AFInAppEventType = AFb1xSDK.AFKeystoreWrapper().AFInAppEventType(this.valueOf);
        return AFInAppEventType != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventType).build().toString() : str;
    }

    public final AFa1tSDK AFInAppEventType(int i6) {
        this.afInfoLog = i6;
        synchronized (this.values) {
            if (this.values.containsKey("counter")) {
                this.values.put("counter", Integer.toString(i6));
            }
            if (this.values.containsKey("launch_counter")) {
                this.values.put("launch_counter", Integer.toString(i6));
            }
        }
        return this;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFVersionDeclaration;
    }

    public final byte[] AFInAppEventType() {
        return this.afWarnLog;
    }
}
