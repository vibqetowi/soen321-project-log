package com.google.android.play.core.splitinstall.internal;

import android.os.Build;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzao {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzan zza() {
        switch (Build.VERSION.SDK_INT) {
            case 23:
                return new zzay();
            case 24:
                return new zzaz();
            case 25:
                return new zzba();
            case 26:
                return new zzbd();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new zzbe();
                }
                break;
        }
        return new zzbg();
    }
}
