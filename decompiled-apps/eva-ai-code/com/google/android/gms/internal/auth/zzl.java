package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzb(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), (AccountChangeEventsResponse) zzc.zza(parcel, AccountChangeEventsResponse.CREATOR));
            return true;
        }
        return false;
    }
}
