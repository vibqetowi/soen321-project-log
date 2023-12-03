package p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final a0 createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        k9.d dVar = null;
        k9.v vVar = null;
        boolean z10 = false;
        int i6 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d10 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 3:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    dVar = (k9.d) SafeParcelReader.c(parcel, readInt, k9.d.CREATOR);
                    break;
                case 6:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    vVar = (k9.v) SafeParcelReader.c(parcel, readInt, k9.v.CREATOR);
                    break;
                case '\b':
                    d11 = SafeParcelReader.j(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a0(d10, z10, i6, dVar, i10, vVar, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a0[] newArray(int i6) {
        return new a0[i6];
    }
}
