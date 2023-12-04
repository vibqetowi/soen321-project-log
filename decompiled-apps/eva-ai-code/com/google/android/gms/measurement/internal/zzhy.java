package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzqr;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzhy implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzik zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzik zzikVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzikVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l;
        zzkp zzu = this.zzb.zzt.zzu();
        zzqr.zzc();
        if (!zzu.zzt.zzf().zzs(null, zzeg.zzau)) {
            zzu.zzt.zzaA().zzl().zza("getSessionId has been disabled.");
        } else if (zzu.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
            if (!zzu.zzt.zzm().zzk(zzu.zzt.zzax().currentTimeMillis()) && zzu.zzt.zzm().zzk.zza() != 0) {
                l = Long.valueOf(zzu.zzt.zzm().zzk.zza());
                if (l == null) {
                    this.zzb.zzt.zzv().zzV(this.zza, l.longValue());
                    return;
                }
                try {
                    this.zza.zze(null);
                    return;
                } catch (RemoteException e) {
                    this.zzb.zzt.zzaA().zzd().zzb("getSessionId failed with exception", e);
                    return;
                }
            }
        } else {
            zzu.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get session id");
        }
        l = null;
        if (l == null) {
        }
    }
}
