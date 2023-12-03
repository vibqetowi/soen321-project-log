package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFd1pSDK extends AFc1aSDK<String> {
    private final Map<String, Object> afRDLog;

    public AFd1pSDK(Map<String, Object> map, AFc1zSDK aFc1zSDK) {
        super(AFc1kSDK.MONITORSDK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, String.valueOf(map.hashCode()));
        this.afRDLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        return ((AFc1aSDK) this).afErrorLog.AFInAppEventParameterName(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return true;
    }
}
