package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjs implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzq zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjz zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.zzf = zzjzVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                zzjzVar = this.zzf;
                zzejVar = zzjzVar.zzb;
            } catch (RemoteException e) {
                this.zzf.zzt.zzaA().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzejVar != null) {
                if (TextUtils.isEmpty(null)) {
                    Preconditions.checkNotNull(this.zzd);
                    this.zza.set(zzejVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
                } else {
                    this.zza.set(zzejVar.zzi(null, this.zzb, this.zzc, this.zze));
                }
                this.zzf.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
                return;
            }
            zzjzVar.zzt.zzaA().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
            this.zza.set(Collections.emptyList());
            this.zza.notify();
        }
    }
}
