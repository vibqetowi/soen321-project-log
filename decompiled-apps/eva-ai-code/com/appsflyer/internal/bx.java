package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class bx {
    public static final Charset AFInAppEventParameterName = Charset.forName("UTF-8");
    public long AFInAppEventType;
    public final bv AFKeystoreWrapper;
    public long valueOf;
    public ao values = values();

    public bx(bv bvVar) {
        this.AFKeystoreWrapper = bvVar;
        this.AFInAppEventType = bvVar.AFKeystoreWrapper("af_rc_timestamp");
        this.valueOf = bvVar.AFKeystoreWrapper("af_rc_max_age");
    }

    private ao values() {
        String AFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType("af_remote_config", (String) null);
        if (AFInAppEventType == null) {
            AFLogger.AFInAppEventParameterName("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new ao(new String(Base64.decode(AFInAppEventType, 2), AFInAppEventParameterName));
        } catch (Exception e) {
            AFLogger.AFInAppEventParameterName("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e);
            return null;
        }
    }
}
