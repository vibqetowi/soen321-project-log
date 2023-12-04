package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzji implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjz zzjzVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjzVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzc;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            zzjzVar.zzt.zzaA().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e) {
            this.zzc.zzt.zzaA().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}
