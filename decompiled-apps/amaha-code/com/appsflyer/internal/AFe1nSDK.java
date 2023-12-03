package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;
/* loaded from: classes.dex */
public final class AFe1nSDK extends AFe1qSDK {
    public AFe1nSDK(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFa1tSDK AFKeystoreWrapper(String str) {
        return super.AFKeystoreWrapper(values(str));
    }

    @Override // com.appsflyer.internal.AFa1tSDK
    public final AFc1kSDK values() {
        return AFc1kSDK.PURCHASE_VALIDATE;
    }
}
