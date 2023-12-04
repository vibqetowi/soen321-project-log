package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class cz extends dd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public cz(String str, Runnable runnable) {
        super(str, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(Context context, aw<Map<String, Object>> awVar) {
        if (ac.AFInAppEventParameterName().valueOf(ac.AFInAppEventType(context), false) > 0 || !awVar.values()) {
            return;
        }
        new Thread(awVar.AFInAppEventType).start();
        values();
    }
}
