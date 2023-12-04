package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzif implements Runnable {
    final /* synthetic */ zzhb zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhb zze;
    final /* synthetic */ zzik zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzif(zzik zzikVar, zzhb zzhbVar, long j, long j2, boolean z, zzhb zzhbVar2) {
        this.zzf = zzikVar;
        this.zza = zzhbVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzV(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzik.zzw(this.zzf, this.zza, this.zzc, true, this.zzd);
        zzqu.zzc();
        if (this.zzf.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzik.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
