package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhr implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzik zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzik zzikVar, AtomicReference atomicReference, boolean z) {
        this.zzc = zzikVar;
        this.zza = atomicReference;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
