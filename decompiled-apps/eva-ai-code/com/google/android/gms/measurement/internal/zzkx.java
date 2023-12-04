package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkx implements Runnable {
    final /* synthetic */ zzli zza;
    final /* synthetic */ zzlh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkx(zzlh zzlhVar, zzli zzliVar) {
        this.zzb = zzlhVar;
        this.zza = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
