package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final o createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    SafeParcelReader.s(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 3:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    i13 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    i14 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    i15 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 11:
                    i16 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\f':
                    i17 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\r':
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new o(f, i6, i10, i11, i12, i13, i14, i15, str, i16, i17, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o[] newArray(int i6) {
        return new o[i6];
    }
}
