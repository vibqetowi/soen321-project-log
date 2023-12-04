package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzbh extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, ProxyRequest proxyRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc.zzd(zza, proxyRequest);
        zzc(1, zza);
    }
}
