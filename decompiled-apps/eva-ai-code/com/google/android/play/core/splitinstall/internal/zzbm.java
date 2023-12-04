package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbm extends zzk implements zzbo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzc(String str, int i, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(4, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(8, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zze(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(13, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzf(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(14, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzg(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(7, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzh(String str, int i, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzm.zzd(zza, zzbqVar);
        zzb(5, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzi(String str, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzm.zzd(zza, zzbqVar);
        zzb(6, zza);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        zzm.zzc(zza, bundle);
        zzm.zzd(zza, zzbqVar);
        zzb(2, zza);
    }
}
