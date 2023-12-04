package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzal extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ Collection zza;
    final /* synthetic */ Collection zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzn zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzbc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzbcVar;
        this.zza = collection;
        this.zzb = collection2;
        this.zzc = zznVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.play.core.splitinstall.internal.zzbo, android.os.IInterface] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    protected final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        String str;
        ArrayList zzn = zzbc.zzn(this.zza);
        zzn.addAll(zzbc.zzm(this.zzb));
        try {
            this.zzc.zzb(2);
            ?? zze = this.zze.zza.zze();
            str = this.zze.zzd;
            zze.zzj(str, zzn, zzbc.zzb(this.zzc), new zzba(this.zze, this.zzd));
        } catch (RemoteException e) {
            zzuVar = zzbc.zzb;
            zzuVar.zzc(e, "startInstall(%s,%s)", this.zza, this.zzb);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
