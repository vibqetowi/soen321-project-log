package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzax extends zzbb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzf(Bundle bundle) throws RemoteException {
        super.zzf(bundle);
        this.zza.trySetResult(null);
    }
}
