package v9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<g0> {
    @Override // android.os.Parcelable.Creator
    public final g0 createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        IBinder iBinder = null;
        s9.b bVar = null;
        int i6 = 0;
        boolean z10 = false;
        boolean z11 = false;
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
                                z11 = SafeParcelReader.i(parcel, readInt);
                            }
                        } else {
                            z10 = SafeParcelReader.i(parcel, readInt);
                        }
                    } else {
                        bVar = (s9.b) SafeParcelReader.c(parcel, readInt, s9.b.CREATOR);
                    }
                } else {
                    iBinder = SafeParcelReader.k(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new g0(i6, iBinder, bVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g0[] newArray(int i6) {
        return new g0[i6];
    }
}
