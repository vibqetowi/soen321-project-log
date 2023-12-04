package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzh extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzgVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzb(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zze(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, iStatusCallback);
        zzb(3, zza);
    }

    public final void zzf(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, iStatusCallback);
        zzb(6, zza);
    }

    public final void zzg(zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, zzjVar);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzb(zza, zzjVar);
        zzb(2, zza);
    }
}
