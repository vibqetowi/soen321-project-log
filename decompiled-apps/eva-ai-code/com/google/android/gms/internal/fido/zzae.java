package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzae extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public final void zzc(zzad zzadVar, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzadVar);
        zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    public final void zzd(zzad zzadVar, SignRequestParams signRequestParams) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzadVar);
        zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
