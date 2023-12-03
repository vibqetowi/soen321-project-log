package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
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
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new h0(str, str2, str3, str4, str5, str6, z10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new h0[i6];
    }
}
