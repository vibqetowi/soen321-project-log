package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzs extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzrVar);
        zzc.zzd(zza, publicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    public final void zzd(zzr zzrVar, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzrVar);
        zzc.zzd(zza, publicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    public final void zze(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeVar);
        zzb(3, zza);
    }
}
