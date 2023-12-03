package i9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptions createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i6 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.g(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.c(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    z12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.g(parcel, readInt, j9.a.CREATOR);
                    break;
                case '\n':
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new GoogleSignInOptions(i6, arrayList2, account, z10, z11, z12, str, str2, GoogleSignInOptions.g0(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i6) {
        return new GoogleSignInOptions[i6];
    }
}
