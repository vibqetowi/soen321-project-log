package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgr implements Runnable {
    final /* synthetic */ zzlk zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgr(zzgv zzgvVar, zzlk zzlkVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzlkVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlh zzlhVar3;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        if (this.zza.zza() == null) {
            zzlhVar3 = this.zzc.zza;
            zzlhVar3.zzP(this.zza.zzb, this.zzb);
            return;
        }
        zzlhVar2 = this.zzc.zza;
        zzlhVar2.zzW(this.zza, this.zzb);
    }
}
