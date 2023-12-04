package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzat extends zzbb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzb(int i, Bundle bundle) throws RemoteException {
        super.zzb(i, bundle);
        this.zza.trySetResult(null);
    }
}
