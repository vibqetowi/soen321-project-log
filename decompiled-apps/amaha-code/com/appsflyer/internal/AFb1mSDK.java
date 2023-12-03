package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFb1mSDK {
    public long AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    public String AFLogger;
    public AFe1lSDK afErrorLog;
    public Throwable afRDLog;
    public int valueOf;
    public long values;

    public AFb1mSDK() {
    }

    public AFb1mSDK(String str, String str2, long j10, long j11, int i6, AFe1lSDK aFe1lSDK, String str3, Throwable th2) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = str2;
        this.values = j10;
        this.AFInAppEventParameterName = j11;
        this.valueOf = i6;
        this.afErrorLog = aFe1lSDK;
        this.AFLogger = str3;
        this.afRDLog = th2;
    }
}
