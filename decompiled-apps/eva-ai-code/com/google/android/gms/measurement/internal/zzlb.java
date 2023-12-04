package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzlb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb = "_err";
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzlc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlb(zzlc zzlcVar, String str, String str2, Bundle bundle) {
        this.zzd = zzlcVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzF((zzau) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, "auto", this.zzd.zza.zzax().currentTimeMillis(), false, true)), this.zza);
    }
}
