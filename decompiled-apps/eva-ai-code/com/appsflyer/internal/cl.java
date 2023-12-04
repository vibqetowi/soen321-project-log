package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class cl {
    public final Map<String, Object> AFInAppEventParameterName;
    public long AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger$LogLevel;
    public final long[] AFVersionDeclaration;
    public long AppsFlyer2dXConversionCallback;
    public long getLevel;
    public final long[] init;
    private long onAttributionFailureNative;
    public long onDeepLinkingNative;
    public final bv valueOf;
    public final Map<String, Object> values;

    public cl(bv bvVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.values = concurrentHashMap3;
        this.AFInAppEventType = 0L;
        this.AppsFlyer2dXConversionCallback = 0L;
        this.AFVersionDeclaration = new long[2];
        this.init = new long[2];
        this.AFLogger$LogLevel = new long[2];
        this.onAttributionFailureNative = 0L;
        this.getLevel = 0L;
        this.valueOf = bvVar;
        concurrentHashMap.putAll(values("first_launch"));
        concurrentHashMap2.putAll(values("ddl"));
        concurrentHashMap3.putAll(values("gcd"));
        this.onDeepLinkingNative = bvVar.valueOf("prev_session_dur");
    }

    public final void AFKeystoreWrapper() {
        this.AppsFlyer2dXConversionCallback = System.currentTimeMillis();
        if (AFInAppEventType()) {
            long j = this.AFInAppEventType;
            if (j != 0) {
                this.AFInAppEventParameterName.put("init_to_fg", Long.valueOf(this.AppsFlyer2dXConversionCallback - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map<?, ?>) this.AFInAppEventParameterName).toString());
                return;
            }
            AFLogger.values("Metrics: init ts is missing");
        }
    }

    public final void valueOf(cj cjVar) {
        if (AFInAppEventType()) {
            this.AFInAppEventParameterName.put("start_with", cjVar.toString());
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map<?, ?>) this.AFInAppEventParameterName).toString());
        }
    }

    public final void valueOf(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.onAttributionFailureNative = currentTimeMillis;
        if (i == 1) {
            long j = this.AppsFlyer2dXConversionCallback;
            if (j != 0) {
                this.AFInAppEventParameterName.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map<?, ?>) this.AFInAppEventParameterName).toString());
                return;
            }
            AFLogger.values("Metrics: fg ts is missing");
        }
    }

    public final void AFInAppEventType(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = this.onAttributionFailureNative;
            if (j != 0) {
                this.AFInAppEventParameterName.put("net", Long.valueOf(currentTimeMillis - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject((Map<?, ?>) this.AFInAppEventParameterName).toString());
                return;
            }
            AFLogger.values("Metrics: launch start ts is missing");
        }
    }

    public final void AFInAppEventType(DeepLinkResult deepLinkResult, long j) {
        this.AFKeystoreWrapper.put("status", deepLinkResult.getStatus().toString());
        this.AFKeystoreWrapper.put("timeout_value", Long.valueOf(j));
        this.valueOf.AFInAppEventParameterName("ddl", new JSONObject((Map<?, ?>) this.AFKeystoreWrapper).toString());
    }

    private Map<String, Object> values(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFInAppEventType = this.valueOf.AFInAppEventType(str, (String) null);
        if (AFInAppEventType != null) {
            try {
                return n.valueOf(new JSONObject(AFInAppEventType));
            } catch (Exception e) {
                AFLogger.AFInAppEventParameterName("Error while parsing cached json data", e);
                return emptyMap;
            }
        }
        return emptyMap;
    }

    public final boolean AFInAppEventType() {
        return this.valueOf.valueOf("appsFlyerCount") == 0;
    }
}
