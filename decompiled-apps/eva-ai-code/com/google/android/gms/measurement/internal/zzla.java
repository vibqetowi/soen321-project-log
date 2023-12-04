package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzla implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzlh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzla(zzlh zzlhVar, zzq zzqVar) {
        this.zzb = zzlhVar;
        this.zza = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (!this.zzb.zzq((String) Preconditions.checkNotNull(this.zza.zza)).zzj(zzha.ANALYTICS_STORAGE) || !zzhb.zzc(this.zza.zzv, 100).zzj(zzha.ANALYTICS_STORAGE)) {
            this.zzb.zzaA().zzj().zza("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.zzb.zzd(this.zza).zzw();
    }
}
