package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
/* loaded from: classes.dex */
public final class AFd1eSDK extends AFa1tSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFd1eSDK(Context context) {
        super("Register", r0.toString(), Boolean.FALSE, context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFd1iSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(context.getPackageName());
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFc1kSDK values() {
        return AFc1kSDK.REGISTER;
    }
}
