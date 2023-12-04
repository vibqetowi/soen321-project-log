package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzr extends zzn {
    final /* synthetic */ zzx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzm zzmVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzm zzmVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzmVar2 = this.zza.zzc;
                    zzmVar2.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzx zzxVar = this.zza;
            iInterface = zzxVar.zzn;
            if (iInterface != null) {
                zzmVar = zzxVar.zzc;
                zzmVar.zzd("Unbind from service.", new Object[0]);
                zzx zzxVar2 = this.zza;
                context = zzxVar2.zzb;
                serviceConnection = zzxVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
