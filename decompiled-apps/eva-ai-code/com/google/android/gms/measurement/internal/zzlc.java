package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlc implements zzlo {
    final /* synthetic */ zzlh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(zzlh zzlhVar) {
        this.zza = zzlhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        zzgd zzgdVar;
        zzgd zzgdVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaB().zzp(new zzlb(this, str, "_err", bundle));
            return;
        }
        zzlh zzlhVar = this.zza;
        zzgdVar = zzlhVar.zzn;
        if (zzgdVar != null) {
            zzgdVar2 = zzlhVar.zzn;
            zzgdVar2.zzaA().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
