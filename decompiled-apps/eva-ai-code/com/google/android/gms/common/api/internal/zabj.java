package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zabj {
    private static final ExecutorService zaa = com.google.android.gms.internal.base.zap.zaa().zac(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return zaa;
    }
}
