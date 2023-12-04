package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzix implements Runnable {
    final /* synthetic */ zzir zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zziz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzix(zziz zzizVar, zzir zzirVar, long j) {
        this.zzc = zzizVar;
        this.zza = zzirVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zziz zzizVar = this.zzc;
        zzizVar.zza = null;
        zzizVar.zzt.zzt().zzG(null);
    }
}
