package com.appsflyer.internal;

import android.content.Context;
/* loaded from: classes2.dex */
public abstract class cm extends i {
    private final boolean onAttributionFailureNative;
    public boolean onConversionDataSuccess;
    private final boolean onInstallConversionDataLoadedNative;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cm() {
        this(null, null, null, null, null, null);
    }

    public cm(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onAttributionFailureNative = bool != null ? bool.booleanValue() : true;
        this.onInstallConversionDataLoadedNative = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean AFLogger$LogLevel() {
        return this.onConversionDataSuccess;
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onAttributionFailureNative;
    }

    public final boolean getLevel() {
        return this.onInstallConversionDataLoadedNative;
    }
}
