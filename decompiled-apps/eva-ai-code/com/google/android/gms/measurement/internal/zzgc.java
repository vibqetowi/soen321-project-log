package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgc implements Runnable {
    final /* synthetic */ zzhi zza;
    final /* synthetic */ zzgd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzgd zzgdVar, zzhi zzhiVar) {
        this.zzb = zzgdVar;
        this.zza = zzhiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
