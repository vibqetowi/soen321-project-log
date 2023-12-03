package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    j11 = SafeParcelReader.m(parcel, readInt);
                }
            } else {
                j10 = SafeParcelReader.m(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new m0(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new m0[i6];
    }
}
