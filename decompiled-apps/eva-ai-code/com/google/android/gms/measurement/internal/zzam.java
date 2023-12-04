package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzam implements Runnable {
    final /* synthetic */ zzgy zza;
    final /* synthetic */ zzan zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzan zzanVar, zzgy zzgyVar) {
        this.zzb = zzanVar;
        this.zza = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzay();
        if (zzab.zza()) {
            this.zza.zzaB().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
