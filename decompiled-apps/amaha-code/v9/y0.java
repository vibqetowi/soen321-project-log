package v9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Bundle bundle = null;
        s9.d[] dVarArr = null;
        d dVar = null;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            dVar = (d) SafeParcelReader.c(parcel, readInt, d.CREATOR);
                        }
                    } else {
                        i6 = SafeParcelReader.l(parcel, readInt);
                    }
                } else {
                    dVarArr = (s9.d[]) SafeParcelReader.f(parcel, readInt, s9.d.CREATOR);
                }
            } else {
                bundle = SafeParcelReader.a(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new x0(bundle, dVarArr, i6, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new x0[i6];
    }
}
