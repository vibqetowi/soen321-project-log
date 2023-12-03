package v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    qVar = (q) SafeParcelReader.c(parcel, readInt, q.CREATOR);
                    break;
                case 2:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    iArr = SafeParcelReader.b(parcel, readInt);
                    break;
                case 5:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.b(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new d(qVar, z10, z11, iArr, i6, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new d[i6];
    }
}
