package fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        com.google.android.gms.internal.p000firebaseauthapi.j jVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    jVar = (com.google.android.gms.internal.p000firebaseauthapi.j) SafeParcelReader.c(parcel, readInt, com.google.android.gms.internal.p000firebaseauthapi.j.CREATOR);
                    break;
                case 5:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new x(str, str2, str3, jVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new x[i6];
    }
}
