package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgs implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(zzgv zzgvVar, String str) {
        this.zzb = zzgvVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzb.zza;
        return zzlhVar2.zzh().zzu(this.zza);
    }
}
