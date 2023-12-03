package fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    str2 = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new p(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new p[i6];
    }
}
