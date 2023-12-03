package com.appsflyer.internal;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class AFe1wSDK extends AFa1tSDK {
    private final boolean AFLogger$LogLevel;
    private final boolean AFVersionDeclaration;
    public boolean afWarnLog;

    public AFe1wSDK() {
        this(null, null, null, null, null, null);
    }

    public final boolean AFVersionDeclaration() {
        return this.AFVersionDeclaration;
    }

    public final boolean afRDLog() {
        return this.afWarnLog;
    }

    public final boolean init() {
        return this.AFLogger$LogLevel;
    }

    public AFe1wSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.AFVersionDeclaration = bool2 != null ? bool2.booleanValue() : true;
    }
}
