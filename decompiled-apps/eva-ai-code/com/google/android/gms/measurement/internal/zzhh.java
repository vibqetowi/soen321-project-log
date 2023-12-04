package com.google.android.gms.measurement.internal;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhh implements zzen {
    final /* synthetic */ zzgd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzhi zzhiVar, zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzen
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzaA().zzr(), 3);
    }
}
