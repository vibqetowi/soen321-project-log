package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzv extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new zzi(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
