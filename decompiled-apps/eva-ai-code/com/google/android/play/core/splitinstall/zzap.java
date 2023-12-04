package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzap extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ List zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzbc zzbcVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.splitinstall.internal.zzbo, android.os.IInterface] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    protected final void zzc() {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        String str;
        Bundle zzo;
        try {
            ?? zze = this.zzc.zza.zze();
            str = this.zzc.zzd;
            ArrayList zzm = zzbc.zzm(this.zza);
            zzo = zzbc.zzo();
            zze.zzf(str, zzm, zzo, new zzaw(this.zzc, this.zzb));
        } catch (RemoteException e) {
            zzuVar = zzbc.zzb;
            zzuVar.zzc(e, "deferredLanguageUninstall(%s)", this.zza);
            this.zzb.trySetException(new RuntimeException(e));
        }
    }
}
