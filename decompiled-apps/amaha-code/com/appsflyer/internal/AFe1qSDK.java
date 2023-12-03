package com.appsflyer.internal;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class AFe1qSDK extends AFe1wSDK {
    public AFe1qSDK() {
        this(null, null, null);
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final boolean afInfoLog() {
        return false;
    }

    public AFe1qSDK(String str, Boolean bool, Context context) {
        super(str, null, Boolean.FALSE, null, bool, context);
    }
}
