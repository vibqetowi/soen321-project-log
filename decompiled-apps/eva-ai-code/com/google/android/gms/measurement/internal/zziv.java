package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zziv implements Runnable {
    final /* synthetic */ zziz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zziz zzizVar) {
        this.zza = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar;
        zziz zzizVar = this.zza;
        zzirVar = zzizVar.zzh;
        zzizVar.zza = zzirVar;
    }
}
