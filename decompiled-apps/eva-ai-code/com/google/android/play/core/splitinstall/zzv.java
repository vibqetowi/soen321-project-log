package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzv implements zzf {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ Intent zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = intent;
        this.zzc = context;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        r0.zzd.post(new zzw(this.zzd, this.zza, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i) {
        r0.zzd.post(new zzw(this.zzd, this.zza, 6, i));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        if (!this.zzb.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.zzb.putExtra("triggered_from_app_after_verification", true);
            this.zzc.sendBroadcast(this.zzb);
            return;
        }
        zzuVar = this.zzd.zza;
        zzuVar.zzb("Splits copied and verified more than once.", new Object[0]);
    }
}
