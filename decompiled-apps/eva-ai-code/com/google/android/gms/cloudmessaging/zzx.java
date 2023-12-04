package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzx implements SuccessContinuation {
    public static final /* synthetic */ zzx zza = new zzx();

    private /* synthetic */ zzx() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Rpc.zza((Bundle) obj);
    }
}
