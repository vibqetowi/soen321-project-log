package wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import v9.g0;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        s9.b bVar = null;
        g0 g0Var = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        g0Var = (g0) SafeParcelReader.c(parcel, readInt, g0.CREATOR);
                    }
                } else {
                    bVar = (s9.b) SafeParcelReader.c(parcel, readInt, s9.b.CREATOR);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new l(i6, bVar, g0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i6) {
        return new l[i6];
    }
}
