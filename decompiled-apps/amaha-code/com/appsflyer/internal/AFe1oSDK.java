package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFe1hSDK;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFe1oSDK extends AFe1hSDK {
    public AFe1oSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public final void values(Context context, AFb1gSDK<Map<String, Object>> aFb1gSDK) {
        AFb1xSDK.AFKeystoreWrapper();
        if (AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.valueOf(context), false) <= 0 && aFb1gSDK.AFInAppEventType()) {
            aFb1gSDK.AFInAppEventParameterName.values().execute(aFb1gSDK.AFInAppEventType);
            this.afDebugLog = System.currentTimeMillis();
            this.afRDLog = AFe1hSDK.AFa1zSDK.STARTED;
            addObserver(new AFe1hSDK.AnonymousClass2());
        }
    }
}
