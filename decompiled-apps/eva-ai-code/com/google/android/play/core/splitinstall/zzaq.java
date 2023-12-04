package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzaq extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = i;
        this.zzb = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.splitinstall.internal.zzbo, android.os.IInterface] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    protected final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        String str;
        try {
            ?? zze = this.zzc.zza.zze();
            zzbc zzbcVar = this.zzc;
            str = zzbcVar.zzd;
            zze.zzh(str, this.zza, new zzay(zzbcVar, this.zzb));
        } catch (RemoteException e) {
            zzuVar = zzbc.zzb;
            zzuVar.zzc(e, "getSessionState(%d)", Integer.valueOf(this.zza));
            this.zzb.trySetException(new RuntimeException(e));
        }
    }
}
