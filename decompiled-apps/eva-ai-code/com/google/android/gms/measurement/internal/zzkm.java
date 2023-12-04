package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkm extends zzan {
    final /* synthetic */ zzkn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkm(zzkn zzknVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzknVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzkn zzknVar = this.zza;
        zzknVar.zzc.zzg();
        zzknVar.zzd(false, false, zzknVar.zzc.zzt.zzax().elapsedRealtime());
        zzknVar.zzc.zzt.zzd().zzf(zzknVar.zzc.zzt.zzax().elapsedRealtime());
    }
}
