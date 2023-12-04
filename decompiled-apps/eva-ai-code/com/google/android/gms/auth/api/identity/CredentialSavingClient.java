package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes2.dex */
public interface CredentialSavingClient extends HasApiKey<zbc> {
    Status getStatusFromIntent(Intent intent);

    Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest);
}
