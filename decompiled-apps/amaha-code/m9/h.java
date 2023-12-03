package m9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        f fVar = null;
        boolean z10 = false;
        boolean z11 = false;
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
                    iBinder = SafeParcelReader.k(parcel, readInt);
                    break;
                case 5:
                    fVar = (f) SafeParcelReader.c(parcel, readInt, f.CREATOR);
                    break;
                case 6:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a(str, str2, iBinder, fVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i6) {
        return new a[i6];
    }
}
