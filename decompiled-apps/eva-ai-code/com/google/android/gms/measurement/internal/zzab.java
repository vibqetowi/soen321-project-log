package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzab {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(Context context) {
    }

    public static final boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
