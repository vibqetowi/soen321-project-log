package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class de {
    private final List<dd> AFInAppEventType = new ArrayList();

    public final synchronized void AFKeystoreWrapper(dd ddVar) {
        this.AFInAppEventType.add(ddVar);
    }

    public final synchronized dd[] AFInAppEventType() {
        return (dd[]) this.AFInAppEventType.toArray(new dd[0]);
    }
}
