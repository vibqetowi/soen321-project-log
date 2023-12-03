package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class AFd1lSDK {
    public static final Charset AFInAppEventType = Charset.forName("UTF-8");
    public final AFd1qSDK AFInAppEventParameterName;
    public AFb1sSDK AFKeystoreWrapper = valueOf();
    public long valueOf;
    public long values;

    public AFd1lSDK(AFd1qSDK aFd1qSDK) {
        this.AFInAppEventParameterName = aFd1qSDK;
        this.values = aFd1qSDK.AFKeystoreWrapper("af_rc_timestamp");
        this.valueOf = aFd1qSDK.AFKeystoreWrapper("af_rc_max_age");
    }

    private AFb1sSDK valueOf() {
        String AFInAppEventType2 = this.AFInAppEventParameterName.AFInAppEventType("af_remote_config", (String) null);
        if (AFInAppEventType2 == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFb1sSDK(new String(Base64.decode(AFInAppEventType2, 2), AFInAppEventType));
        } catch (Exception e10) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e10, true);
            return null;
        }
    }
}
