package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzd extends zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.zzf
    public final void zzc(String str, Bundle bundle, zzh zzhVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zza.writeStrongBinder(zzhVar);
        zzb(3, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.zzf
    public final void zzd(String str, Bundle bundle, zzh zzhVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zza.writeStrongBinder(zzhVar);
        zzb(2, zza);
    }
}
