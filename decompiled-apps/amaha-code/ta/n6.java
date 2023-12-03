package ta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        int q10 = SafeParcelReader.q(parcel);
        String str = "";
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = -2147483648L;
        boolean z11 = true;
        boolean z12 = false;
        int i6 = 0;
        boolean z13 = true;
        boolean z14 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 7:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    z12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    j15 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\f':
                    str8 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    j12 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 14:
                    j13 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 15:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 16:
                    z13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case 18:
                    z14 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 19:
                    str9 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 21:
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    if (o10 == 0) {
                        bool = null;
                        break;
                    } else {
                        SafeParcelReader.r(parcel, o10, 4);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bool = Boolean.valueOf(z10);
                        break;
                    }
                case 22:
                    j14 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 24:
                    str10 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 25:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 26:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 27:
                    str11 = SafeParcelReader.d(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new m6(str3, str4, str5, str6, j10, j11, str7, z11, z12, j15, str8, j12, j13, i6, z13, z14, str9, bool, j14, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new m6[i6];
    }
}
