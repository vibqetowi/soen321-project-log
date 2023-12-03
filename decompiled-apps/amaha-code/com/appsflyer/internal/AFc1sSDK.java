package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFc1sSDK {
    public final long AFKeystoreWrapper;

    public AFc1sSDK(long j10) {
        this.AFKeystoreWrapper = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFc1sSDK) obj).AFKeystoreWrapper) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.AFKeystoreWrapper;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
