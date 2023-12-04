package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhn implements Runnable {
    final /* synthetic */ zzik zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhn(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
