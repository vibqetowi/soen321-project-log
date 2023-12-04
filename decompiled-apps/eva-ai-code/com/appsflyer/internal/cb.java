package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class cb {
    private static final long AFInAppEventParameterName = TimeUnit.HOURS.toSeconds(24);
    private final aa AFInAppEventType;
    private final bx values;

    public cb(aa aaVar, bx bxVar) {
        this.AFInAppEventType = aaVar;
        this.values = bxVar;
    }

    public final boolean AFInAppEventType() {
        return Boolean.parseBoolean(this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.rc.sandbox"));
    }

    public final long valueOf() {
        String AFInAppEventParameterName2 = this.AFInAppEventType.AFInAppEventParameterName("com.appsflyer.rc.cache.max-age-fallback");
        if (AFInAppEventParameterName2 != null) {
            try {
                return Long.parseLong(AFInAppEventParameterName2);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb.append(e.getMessage());
                AFLogger.valueOf(sb.toString(), e);
                return AFInAppEventParameterName;
            }
        }
        return AFInAppEventParameterName;
    }

    public final boolean AFInAppEventParameterName() {
        if (this.values.values != null) {
            return System.currentTimeMillis() - this.values.AFInAppEventType > TimeUnit.SECONDS.toMillis(this.values.valueOf);
        }
        AFLogger.values("CFG: active config is missing - fetching from CDN");
        return true;
    }
}
