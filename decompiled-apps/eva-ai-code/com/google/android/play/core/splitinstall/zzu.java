package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzu {
    private static zzp zza;

    public static synchronized zzp zza(Context context) {
        zzp zzpVar;
        synchronized (zzu.class) {
            if (zza == null) {
                zzc zzcVar = new zzc(null);
                zzcVar.zza(new zzac(zzbr.zza(context)));
                zza = zzcVar.zzb();
            }
            zzpVar = zza;
        }
        return zzpVar;
    }
}
