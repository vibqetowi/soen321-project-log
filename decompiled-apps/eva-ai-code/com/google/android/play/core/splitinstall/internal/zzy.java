package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzy extends zzv {
    final /* synthetic */ zzv zza;
    final /* synthetic */ zzaf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzaf zzafVar, TaskCompletionSource taskCompletionSource, zzv zzvVar) {
        super(taskCompletionSource);
        this.zzb = zzafVar;
        this.zza = zzvVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        zzaf.zzm(this.zzb, this.zza);
    }
}
