package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@Deprecated
/* loaded from: classes2.dex */
public interface WorkAccountApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface AddAccountResult extends Result {
        Account getAccount();
    }

    @Deprecated
    PendingResult<AddAccountResult> addWorkAccount(GoogleApiClient googleApiClient, String str);

    @Deprecated
    PendingResult<Result> removeWorkAccount(GoogleApiClient googleApiClient, Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z);

    @Deprecated
    PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z);
}
