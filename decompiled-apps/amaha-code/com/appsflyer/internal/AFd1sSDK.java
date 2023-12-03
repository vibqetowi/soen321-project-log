package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFe1hSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFd1sSDK extends AFd1uSDK {
    private final AFd1qSDK AFLogger$LogLevel;
    private final AppsFlyerProperties AppsFlyer2dXConversionCallback;
    private final AFd1bSDK afWarnLog;
    public Map<String, Object> getLevel;
    private final AFe1iSDK init;
    private final CreateOneLinkHttpTask onAppOpenAttributionNative;

    /* renamed from: com.appsflyer.internal.AFd1sSDK$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1hSDK.AFa1zSDK.values().length];
            values = iArr;
            try {
                iArr[AFe1hSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AFe1hSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1sSDK(AFa1tSDK aFa1tSDK, AFc1zSDK aFc1zSDK) {
        super(aFa1tSDK, aFc1zSDK);
        this.init = aFc1zSDK.init();
        this.AFLogger$LogLevel = aFc1zSDK.afRDLog();
        this.afWarnLog = aFc1zSDK.afInfoLog();
        this.onAppOpenAttributionNative = aFc1zSDK.afDebugLog();
        this.AppsFlyer2dXConversionCallback = AppsFlyerProperties.getInstance();
        this.AFKeystoreWrapper.add(AFc1kSDK.RESOLVE_ESP);
        this.AFKeystoreWrapper.add(AFc1kSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        super.AFInAppEventParameterName();
        AFd1bSDK aFd1bSDK = this.afWarnLog;
        int i6 = ((AFd1uSDK) this).afRDLog.afInfoLog;
        long currentTimeMillis = System.currentTimeMillis();
        if (i6 == 1) {
            long j10 = aFd1bSDK.afInfoLog;
            if (j10 != 0) {
                aFd1bSDK.values.put("net", Long.valueOf(currentTimeMillis - j10));
                aFd1bSDK.AFInAppEventType.valueOf("first_launch", new JSONObject(aFd1bSDK.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFInAppEventParameterName(AFa1tSDK aFa1tSDK) {
        AFe1hSDK[] AFInAppEventType;
        super.AFInAppEventParameterName(aFa1tSDK);
        int i6 = aFa1tSDK.afInfoLog;
        this.afWarnLog.AFInAppEventType(i6);
        Map map = (Map) aFa1tSDK.AFInAppEventParameterName().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1tSDK.AFInAppEventParameterName().put("meta", map);
        }
        AFb1mSDK AFKeystoreWrapper = this.onAppOpenAttributionNative.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFKeystoreWrapper.AFInAppEventType);
            String str = AFKeystoreWrapper.AFKeystoreWrapper;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j10 = AFKeystoreWrapper.values;
            if (j10 > 0) {
                hashMap.put("latency", Long.valueOf(j10));
            }
            long j11 = AFKeystoreWrapper.AFInAppEventParameterName;
            if (j11 > 0) {
                hashMap.put("delay", Long.valueOf(j11));
            }
            int i10 = AFKeystoreWrapper.valueOf;
            if (i10 > 0) {
                hashMap.put("res_code", Integer.valueOf(i10));
            }
            if (AFKeystoreWrapper.afRDLog != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFKeystoreWrapper.afRDLog.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(AFKeystoreWrapper.afRDLog.getMessage());
                hashMap.put("error", sb2.toString());
            }
            AFe1lSDK aFe1lSDK = AFKeystoreWrapper.afErrorLog;
            if (aFe1lSDK != null) {
                hashMap.put("sig", aFe1lSDK.toString());
            }
            String str2 = AFKeystoreWrapper.AFLogger;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        if (i6 == 1) {
            if (this.AppsFlyer2dXConversionCallback.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1tSDK.AFInAppEventParameterName().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afWarnLog.valueOf);
            this.afWarnLog.AFInAppEventType.values("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afWarnLog.values);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i6 == 2) {
            HashMap hashMap4 = new HashMap(this.afWarnLog.values);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afWarnLog.AFInAppEventType.values("first_launch");
        }
        if (map.isEmpty()) {
            aFa1tSDK.AFInAppEventParameterName().remove("meta");
        }
        if (i6 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFe1hSDK aFe1hSDK : this.init.AFInAppEventType()) {
                boolean z10 = aFe1hSDK instanceof AFe1fSDK;
                int i11 = AnonymousClass4.values[aFe1hSDK.afRDLog.ordinal()];
                if (i11 == 1) {
                    if (z10) {
                        aFa1tSDK.AFKeystoreWrapper("rfr", ((AFe1fSDK) aFe1hSDK).AFInAppEventParameterName);
                        this.AFLogger$LogLevel.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFe1hSDK.AFInAppEventType);
                } else if (i11 == 2 && i6 == 2 && !z10) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFe1hSDK.AFKeystoreWrapper);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFe1hSDK.afErrorLog);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1tSDK.AFKeystoreWrapper("referrers", arrayList);
            }
            Object obj = this.getLevel;
            if (obj != null) {
                aFa1tSDK.AFKeystoreWrapper("fb_ddl", obj);
            }
        }
    }
}
