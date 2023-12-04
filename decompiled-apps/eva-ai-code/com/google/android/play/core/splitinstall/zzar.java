package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzar extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzbc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzb = zzbcVar;
        this.zza = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.splitinstall.internal.zzbo, android.os.IInterface] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    protected final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        String str;
        try {
            ?? zze = this.zzb.zza.zze();
            zzbc zzbcVar = this.zzb;
            str = zzbcVar.zzd;
            zze.zzi(str, new zzaz(zzbcVar, this.zza));
        } catch (RemoteException e) {
            zzuVar = zzbc.zzb;
            zzuVar.zzc(e, "getSessionStates", new Object[0]);
            this.zza.trySetException(new RuntimeException(e));
        }
    }
}
