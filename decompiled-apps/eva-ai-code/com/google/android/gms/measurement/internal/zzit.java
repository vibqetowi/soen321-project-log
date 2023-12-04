package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzit implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzir zzb;
    final /* synthetic */ zzir zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zziz zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j) {
        this.zze = zzizVar;
        this.zza = bundle;
        this.zzb = zzirVar;
        this.zzc = zzirVar2;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
