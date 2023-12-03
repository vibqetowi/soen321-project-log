package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        p pVar = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\n':
                    str8 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 11:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    pVar = (p) SafeParcelReader.c(parcel, readInt, p.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a(str, str2, j10, str3, str4, str5, str6, str7, str8, j11, str9, pVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i6) {
        return new a[i6];
    }
}
