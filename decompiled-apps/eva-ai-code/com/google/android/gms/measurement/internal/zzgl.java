package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgl implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzgv zzgvVar, zzq zzqVar) {
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
        zzlhVar2.zzQ(this.zza);
    }
}
