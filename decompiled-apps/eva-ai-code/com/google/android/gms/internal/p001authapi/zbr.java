package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* renamed from: com.google.android.gms.internal.auth-api.zbr  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zbc.zbb(parcel);
            zbb((Status) zbc.zba(parcel, Status.CREATOR), (Credential) zbc.zba(parcel, Credential.CREATOR));
        } else if (i == 2) {
            zbc.zbb(parcel);
            zbc((Status) zbc.zba(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zbc.zbb(parcel);
            zbd((Status) zbc.zba(parcel, Status.CREATOR), readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
