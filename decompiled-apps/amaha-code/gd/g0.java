package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        k0 k0Var = null;
        d0 d0Var = null;
        fd.x xVar = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        xVar = (fd.x) SafeParcelReader.c(parcel, readInt, fd.x.CREATOR);
                    }
                } else {
                    d0Var = (d0) SafeParcelReader.c(parcel, readInt, d0.CREATOR);
                }
            } else {
                k0Var = (k0) SafeParcelReader.c(parcel, readInt, k0.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new f0(k0Var, d0Var, xVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new f0[i6];
    }
}
