package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String[] strArr = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (o10 == 0) {
                        strArr = null;
                        break;
                    } else {
                        String[] createStringArray = parcel.createStringArray();
                        parcel.setDataPosition(dataPosition + o10);
                        strArr = createStringArray;
                        break;
                    }
                case 7:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    z12 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new b(j10, str, j11, z10, strArr, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i6) {
        return new b[i6];
    }
}
