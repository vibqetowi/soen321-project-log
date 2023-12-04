package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzn extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzgVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmVar);
        zzc.zzd(zza, browserPublicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmVar);
        zzc.zzd(zza, browserPublicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeVar);
        zzb(3, zza);
    }
}
