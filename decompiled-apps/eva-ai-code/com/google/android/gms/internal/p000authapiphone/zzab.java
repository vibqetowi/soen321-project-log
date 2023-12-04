package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzab  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzab extends SmsRetrieverClient {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsRetriever() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzac.zzc).setMethodKey(1567).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzabVar, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzac.zzd).setMethodKey(1568).build());
    }

    public zzab(Context context) {
        super(context);
    }
}
