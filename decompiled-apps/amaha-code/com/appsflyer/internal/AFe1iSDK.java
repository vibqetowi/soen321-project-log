package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AFe1iSDK {
    public final List<AFe1hSDK> valueOf = new ArrayList();

    public final synchronized void AFInAppEventType(AFe1hSDK aFe1hSDK) {
        this.valueOf.add(aFe1hSDK);
    }

    public final synchronized AFe1hSDK[] AFInAppEventType() {
        return (AFe1hSDK[]) this.valueOf.toArray(new AFe1hSDK[0]);
    }
}
