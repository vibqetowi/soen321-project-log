package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        boolean z10 = false;
        String str = null;
        f fVar = null;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            fVar = (f) SafeParcelReader.c(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        z11 = SafeParcelReader.i(parcel, readInt);
                    }
                } else {
                    str = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                z10 = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new g(z10, str, z11, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g[] newArray(int i6) {
        return new g[i6];
    }
}
