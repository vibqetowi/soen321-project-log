package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFd1bSDK {
    public long AFInAppEventParameterName;
    public final AFd1qSDK AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public long AFLogger$LogLevel;
    public final long[] afDebugLog;
    public final long[] afErrorLog;
    public long afInfoLog;
    public long afRDLog;
    public long afWarnLog;
    public final Map<String, Object> valueOf;
    public final Map<String, Object> values;

    public AFd1bSDK(AFd1qSDK aFd1qSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.values = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap3;
        this.AFInAppEventParameterName = 0L;
        this.afRDLog = 0L;
        this.AFLogger = new long[2];
        this.afDebugLog = new long[2];
        this.afErrorLog = new long[2];
        this.afInfoLog = 0L;
        this.afWarnLog = 0L;
        this.AFInAppEventType = aFd1qSDK;
        concurrentHashMap.putAll(AFKeystoreWrapper("first_launch"));
        concurrentHashMap2.putAll(AFKeystoreWrapper("ddl"));
        concurrentHashMap3.putAll(AFKeystoreWrapper("gcd"));
        this.AFLogger$LogLevel = aFd1qSDK.AFKeystoreWrapper("prev_session_dur");
    }

    private Map<String, Object> AFKeystoreWrapper(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFInAppEventType = this.AFInAppEventType.AFInAppEventType(str, (String) null);
        if (AFInAppEventType != null) {
            try {
                return AFa1pSDK.AFInAppEventType(new JSONObject(AFInAppEventType));
            } catch (Exception e10) {
                AFLogger.afErrorLog("Error while parsing cached json data", e10, true);
                return emptyMap;
            }
        }
        return emptyMap;
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult, long j10) {
        this.valueOf.put("status", deepLinkResult.getStatus().toString());
        this.valueOf.put("timeout_value", Long.valueOf(j10));
        this.AFInAppEventType.valueOf("ddl", new JSONObject(this.valueOf).toString());
    }

    public final void AFInAppEventType(int i6) {
        long currentTimeMillis = System.currentTimeMillis();
        this.afInfoLog = currentTimeMillis;
        if (i6 == 1) {
            long j10 = this.afRDLog;
            if (j10 != 0) {
                this.values.put("from_fg", Long.valueOf(currentTimeMillis - j10));
                this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void valueOf() {
        this.afRDLog = System.currentTimeMillis();
        if (AFKeystoreWrapper()) {
            long j10 = this.AFInAppEventParameterName;
            if (j10 != 0) {
                this.values.put("init_to_fg", Long.valueOf(this.afRDLog - j10));
                this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void values(AFe1zSDK aFe1zSDK) {
        if (AFKeystoreWrapper()) {
            this.values.put("start_with", aFe1zSDK.toString());
            this.AFInAppEventType.valueOf("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType.valueOf("appsFlyerCount") == 0;
    }

    public final void values(int i6) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.afWarnLog;
        if (j10 != 0) {
            this.AFKeystoreWrapper.put("net", Long.valueOf(currentTimeMillis - j10));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFKeystoreWrapper.put("retries", Integer.valueOf(i6));
        this.AFInAppEventType.valueOf("gcd", new JSONObject(this.AFKeystoreWrapper).toString());
    }
}
