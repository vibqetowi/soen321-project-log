package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgg implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgg(zzgv zzgvVar, zzac zzacVar) {
        this.zzb = zzgvVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlh zzlhVar3;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlhVar3 = this.zzb.zza;
            zzlhVar3.zzN(this.zza);
            return;
        }
        zzlhVar2 = this.zzb.zza;
        zzlhVar2.zzT(this.zza);
    }
}
