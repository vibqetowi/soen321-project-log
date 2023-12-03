package ta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        g6 g6Var = null;
        String str3 = null;
        s sVar = null;
        s sVar2 = null;
        s sVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
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
                    g6Var = (g6) SafeParcelReader.c(parcel, readInt, g6.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 6:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    sVar = (s) SafeParcelReader.c(parcel, readInt, s.CREATOR);
                    break;
                case '\t':
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\n':
                    sVar2 = (s) SafeParcelReader.c(parcel, readInt, s.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\f':
                    sVar3 = (s) SafeParcelReader.c(parcel, readInt, s.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new c(str, str2, g6Var, j10, z10, str3, sVar, j11, sVar2, j12, sVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new c[i6];
    }
}
