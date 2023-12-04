package com.appsflyer.internal;
/* loaded from: classes2.dex */
public class bk {
    public final long AFKeystoreWrapper;

    public bk(long j) {
        this.AFKeystoreWrapper = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((bk) obj).AFKeystoreWrapper;
    }

    public int hashCode() {
        long j = this.AFKeystoreWrapper;
        return (int) (j ^ (j >>> 32));
    }
}
