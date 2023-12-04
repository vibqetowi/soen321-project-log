package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;
/* loaded from: classes2.dex */
public final class cu extends ct {
    public cu(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.i
    public final i AFInAppEventType(String str) {
        return super.AFInAppEventType(values(str));
    }
}
