package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzbs extends zzbj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbs(zzbt zzbtVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.internal.auth.zzbj
    protected final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zzd(new zzbr(this));
    }
}
