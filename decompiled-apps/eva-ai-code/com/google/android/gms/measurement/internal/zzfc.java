package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfc {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzfc(zzfi zzfiVar, String str, boolean z) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z);
        edit.apply();
        this.zze = z;
    }

    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
