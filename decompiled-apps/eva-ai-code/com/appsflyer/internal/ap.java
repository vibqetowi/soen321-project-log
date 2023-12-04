package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ap {
    private long AFInAppEventParameterName;
    private int AFInAppEventType;
    private String AFKeystoreWrapper;
    private cw AFLogger$LogLevel;
    private Throwable AppsFlyer2dXConversionCallback;
    private long valueOf;
    private String values;

    public ap() {
    }

    public static Uri AFKeystoreWrapper(Activity activity) {
        return activity.getReferrer();
    }

    public ap(String str, String str2, long j, long j2, int i, cw cwVar, Throwable th) {
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.valueOf = j;
        this.AFInAppEventParameterName = j2;
        this.AFInAppEventType = i;
        this.AFLogger$LogLevel = cwVar;
        this.AppsFlyer2dXConversionCallback = th;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("cdn_token", this.AFKeystoreWrapper);
        String str = this.values;
        if (str != null) {
            hashMap.put("c_ver", str);
        }
        long j = this.valueOf;
        if (j > 0) {
            hashMap.put("latency", Long.valueOf(j));
        }
        long j2 = this.AFInAppEventParameterName;
        if (j2 > 0) {
            hashMap.put("delay", Long.valueOf(j2));
        }
        int i = this.AFInAppEventType;
        if (i > 0) {
            hashMap.put("res_code", Integer.valueOf(i));
        }
        if (this.AppsFlyer2dXConversionCallback != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AppsFlyer2dXConversionCallback.getClass().getSimpleName());
            sb.append(": ");
            sb.append(this.AppsFlyer2dXConversionCallback.getMessage());
            hashMap.put("error", sb.toString());
        }
        cw cwVar = this.AFLogger$LogLevel;
        if (cwVar != null) {
            hashMap.put("sig", cwVar.toString());
        }
        return hashMap;
    }
}
