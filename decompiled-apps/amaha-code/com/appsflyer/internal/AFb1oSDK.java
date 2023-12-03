package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class AFb1oSDK {
    public final WeakReference<Context> AFKeystoreWrapper;
    public String values;

    public AFb1oSDK() {
    }

    public AFb1oSDK(Context context) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
    }

    public static boolean valueOf(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }
}
