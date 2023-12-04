package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzd extends zza implements zzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, account);
        zza.writeString(str);
        zzc.zzd(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, accountChangeEventsRequest);
        Parcel zzb = zzb(3, zza);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(zzb, AccountChangeEventsResponse.CREATOR);
        zzb.recycle();
        return accountChangeEventsResponse;
    }
}
