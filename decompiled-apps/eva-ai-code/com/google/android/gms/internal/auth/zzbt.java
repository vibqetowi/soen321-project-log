package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzbt implements ProxyApi {
    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final PendingResult<ProxyApi.SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient);
        return googleApiClient.execute(new zzbs(this, googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        Preconditions.checkNotNull(googleApiClient);
        Preconditions.checkNotNull(proxyRequest);
        return googleApiClient.execute(new zzbq(this, googleApiClient, proxyRequest));
    }
}
