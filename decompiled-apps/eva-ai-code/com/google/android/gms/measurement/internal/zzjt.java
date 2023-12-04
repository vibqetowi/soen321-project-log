package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjt implements Runnable {
    final /* synthetic */ zzej zza;
    final /* synthetic */ zzjy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjt(zzjy zzjyVar, zzej zzejVar) {
        this.zzb = zzjyVar;
        this.zza = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzaA().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
