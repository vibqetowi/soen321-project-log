package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhz implements zzlo {
    final /* synthetic */ zzik zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhz(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzF("auto", "_err", bundle, str);
        } else {
            this.zza.zzD("auto", "_err", bundle);
        }
    }
}
