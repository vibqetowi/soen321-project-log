package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgm(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzlhVar2.zzaB().zzg();
        zzlhVar2.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzlhVar2.zzd(zzqVar);
    }
}
