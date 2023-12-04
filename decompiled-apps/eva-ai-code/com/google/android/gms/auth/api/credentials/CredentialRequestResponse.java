package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
@Deprecated
/* loaded from: classes2.dex */
public class CredentialRequestResponse extends Response<CredentialRequestResult> {
    public Credential getCredential() {
        return getResult().getCredential();
    }
}
