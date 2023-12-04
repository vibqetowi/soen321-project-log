package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgn(zzgv zzgvVar, zzq zzqVar) {
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
        zzhb zzc = zzhb.zzc(zzqVar.zzv, 100);
        zzhb zzq = zzlhVar2.zzq(zzqVar.zza);
        zzlhVar2.zzaA().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzc);
        zzlhVar2.zzV(zzqVar.zza, zzc);
        if (zzc.zzm(zzq)) {
            zzlhVar2.zzQ(zzqVar);
        }
    }
}
