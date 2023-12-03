package v9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.c(parcel, readInt, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        i10 = SafeParcelReader.l(parcel, readInt);
                    }
                } else {
                    account = (Account) SafeParcelReader.c(parcel, readInt, Account.CREATOR);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new e0(i6, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i6) {
        return new e0[i6];
    }
}
