package com.google.android.play.core.appupdate;

import android.content.Context;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzb {
    private static zza zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized zza zza(Context context) {
        zza zzaVar;
        synchronized (zzb.class) {
            if (zza == null) {
                zzab zzabVar = new zzab(null);
                zzabVar.zzb(new zzi(com.google.android.play.core.appupdate.internal.zzz.zza(context)));
                zza = zzabVar.zza();
            }
            zzaVar = zza;
        }
        return zzaVar;
    }
}
