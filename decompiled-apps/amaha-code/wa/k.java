package wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import v9.e0;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        e0 e0Var = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    e0Var = (e0) SafeParcelReader.c(parcel, readInt, e0.CREATOR);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new j(i6, e0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i6) {
        return new j[i6];
    }
}
