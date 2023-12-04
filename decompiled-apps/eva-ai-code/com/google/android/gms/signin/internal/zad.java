package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) com.google.android.gms.internal.base.zac.zaa(parcel, ConnectionResult.CREATOR);
                zaa zaaVar = (zaa) com.google.android.gms.internal.base.zac.zaa(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.internal.base.zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                zab((zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR));
                break;
            case 9:
                zag zagVar = (zag) com.google.android.gms.internal.base.zac.zaa(parcel, zag.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
