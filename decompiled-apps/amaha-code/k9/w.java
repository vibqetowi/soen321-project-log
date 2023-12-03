package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<v> {
    @Override // android.os.Parcelable.Creator
    public final v createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        t tVar = null;
        t tVar2 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    tVar2 = (t) SafeParcelReader.c(parcel, readInt, t.CREATOR);
                }
            } else {
                tVar = (t) SafeParcelReader.c(parcel, readInt, t.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new v(tVar, tVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ v[] newArray(int i6) {
        return new v[i6];
    }
}
