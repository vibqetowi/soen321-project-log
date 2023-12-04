package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzq extends zzn {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzn zzb;
    final /* synthetic */ zzx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzx zzxVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzn zznVar) {
        super(taskCompletionSource);
        this.zzc = zzxVar;
        this.zza = taskCompletionSource2;
        this.zzb = zznVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzm zzmVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzx.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzmVar = this.zzc.zzc;
                zzmVar.zzd("Already connected to the service.", new Object[0]);
            }
            zzx.zzp(this.zzc, this.zzb);
        }
    }
}
