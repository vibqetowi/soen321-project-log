package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzai implements WorkAccountApi.AddAccountResult {
    private static final Account zza = new Account("DUMMY_NAME", "com.google");
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final Account getAccount() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzb;
    }
}
