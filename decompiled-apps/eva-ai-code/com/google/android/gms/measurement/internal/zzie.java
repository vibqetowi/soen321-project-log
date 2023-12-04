package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzie implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzik zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(zzik zzikVar, Boolean bool) {
        this.zzb = zzikVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
