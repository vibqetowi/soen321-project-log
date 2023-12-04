package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhv implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzik zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhv(zzik zzikVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.zzd = zzikVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzt.zzt().zzw(this.zza, null, this.zzb, this.zzc);
    }
}
