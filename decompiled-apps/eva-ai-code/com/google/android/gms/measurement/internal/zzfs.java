package com.google.android.gms.measurement.internal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzer zzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzc = this.zza.zzt.zzaA().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzc = this.zza.zzt.zzaA().zzj();
            } else if (i2 != 4) {
                zzc = this.zza.zzt.zzaA().zzi();
            } else if (z) {
                zzc = this.zza.zzt.zzaA().zzm();
            } else if (!z2) {
                zzc = this.zza.zzt.zzaA().zzl();
            } else {
                zzc = this.zza.zzt.zzaA().zzk();
            }
        } else if (z) {
            zzc = this.zza.zzt.zzaA().zzh();
        } else if (!z2) {
            zzc = this.zza.zzt.zzaA().zze();
        } else {
            zzc = this.zza.zzt.zzaA().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size == 3) {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        } else {
            zzc.zza(str);
        }
    }
}
