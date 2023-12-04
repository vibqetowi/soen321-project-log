package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes2.dex */
public abstract class zbq extends com.google.android.gms.internal.p001authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
                zbd((GoogleSignInAccount) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case 102:
                com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
                zbc((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            case 103:
                com.google.android.gms.internal.p001authapi.zbc.zbb(parcel);
                zbb((Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
