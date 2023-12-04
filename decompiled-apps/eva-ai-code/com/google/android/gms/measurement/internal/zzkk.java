package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkk implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkk(zzkl zzklVar, long j, long j2) {
        this.zzc = zzklVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk zzkkVar = zzkk.this;
                zzkl zzklVar = zzkkVar.zzc;
                long j = zzkkVar.zza;
                long j2 = zzkkVar.zzb;
                zzklVar.zza.zzg();
                zzklVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzklVar.zza.zzt.zzm().zzm.zza(true);
                zzklVar.zza.zzm(true);
                if (!zzklVar.zza.zzt.zzf().zzu()) {
                    zzklVar.zza.zzb.zzb(j2);
                    zzklVar.zza.zzb.zzd(false, false, j2);
                }
                zzqo.zzc();
                if (!zzklVar.zza.zzt.zzf().zzs(null, zzeg.zzaB)) {
                    zzklVar.zza.zzt.zzq().zzH("auto", "_ab", j, new Bundle());
                } else {
                    zzklVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                }
            }
        });
    }
}
