package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class InstantApps {
    private static Context zza;
    private static Boolean zzb;

    public static synchronized boolean isInstantApp(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = zza;
            if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            zzb = null;
            if (PlatformVersion.isAtLeastO()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                zzb = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = true;
                } catch (ClassNotFoundException unused) {
                    zzb = false;
                }
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
