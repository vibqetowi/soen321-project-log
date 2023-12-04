package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzig implements Runnable {
    final /* synthetic */ zzhb zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzhb zzd;
    final /* synthetic */ zzik zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzig(zzik zzikVar, zzhb zzhbVar, long j, boolean z, zzhb zzhbVar2) {
        this.zze = zzikVar;
        this.zza = zzhbVar;
        this.zzb = j;
        this.zzc = z;
        this.zzd = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzV(this.zza);
        zzik.zzw(this.zze, this.zza, this.zzb, false, this.zzc);
        zzqu.zzc();
        if (this.zze.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzik.zzv(this.zze, this.zza, this.zzd);
        }
    }
}
