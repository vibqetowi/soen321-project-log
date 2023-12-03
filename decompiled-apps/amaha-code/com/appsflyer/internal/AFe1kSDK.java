package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public abstract class AFe1kSDK extends AFe1hSDK {
    public AFe1kSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public static boolean values(Context context) {
        AFb1xSDK.AFKeystoreWrapper();
        if (AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.valueOf(context), false) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}
