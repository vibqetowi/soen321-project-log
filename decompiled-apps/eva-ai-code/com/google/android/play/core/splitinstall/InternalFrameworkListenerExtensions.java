package com.google.android.play.core.splitinstall;

import android.content.Context;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class InternalFrameworkListenerExtensions {
    private InternalFrameworkListenerExtensions() {
    }

    public static void registerFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzu.zza(context).zza().zza(splitInstallStateUpdatedListener);
    }

    public static void unregisterFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzu.zza(context).zza().zzb(splitInstallStateUpdatedListener);
    }
}
