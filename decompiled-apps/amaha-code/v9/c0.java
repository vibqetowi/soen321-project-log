package v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    i13 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new l(i6, i10, i11, j10, j11, str, str2, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i6) {
        return new l[i6];
    }
}
