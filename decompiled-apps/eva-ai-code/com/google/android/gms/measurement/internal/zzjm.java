package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            zzjzVar.zzt.zzaA().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
