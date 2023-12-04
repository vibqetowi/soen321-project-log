package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzab extends zzv {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzae zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzae zzaeVar, IBinder iBinder) {
        this.zzb = zzaeVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zzbn.zzb(this.zza);
        zzaf.zzn(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
