package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import java.util.List;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class zzt extends zzn {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(zzw zzwVar, IBinder iBinder) {
        this.zzb = zzwVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zze.zzb(this.zza);
        zzx.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
