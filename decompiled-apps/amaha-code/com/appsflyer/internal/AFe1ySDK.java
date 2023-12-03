package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFe1ySDK extends AFa1tSDK {
    public final AFc1kSDK getLevel;

    @Deprecated
    public AFe1ySDK() {
        this.getLevel = null;
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFc1kSDK values() {
        AFc1kSDK aFc1kSDK = this.getLevel;
        if (aFc1kSDK != null) {
            return aFc1kSDK;
        }
        return AFc1kSDK.CACHED_EVENT;
    }

    public AFe1ySDK(String str, byte[] bArr, String str2, AFc1kSDK aFc1kSDK) {
        super(null, str, Boolean.FALSE, null);
        this.afDebugLog = str2;
        values(bArr);
        this.getLevel = aFc1kSDK;
    }
}
