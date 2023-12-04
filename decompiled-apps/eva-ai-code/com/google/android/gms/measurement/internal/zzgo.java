package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgo implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(zzgv zzgvVar, zzau zzauVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
