package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        ArrayList arrayList = null;
        g gVar = null;
        String str = null;
        fd.x xVar = null;
        k0 k0Var = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                SafeParcelReader.p(parcel, readInt);
                            } else {
                                k0Var = (k0) SafeParcelReader.c(parcel, readInt, k0.CREATOR);
                            }
                        } else {
                            xVar = (fd.x) SafeParcelReader.c(parcel, readInt, fd.x.CREATOR);
                        }
                    } else {
                        str = SafeParcelReader.d(parcel, readInt);
                    }
                } else {
                    gVar = (g) SafeParcelReader.c(parcel, readInt, g.CREATOR);
                }
            } else {
                arrayList = SafeParcelReader.g(parcel, readInt, fd.n.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new e(arrayList, gVar, str, xVar, k0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new e[i6];
    }
}
