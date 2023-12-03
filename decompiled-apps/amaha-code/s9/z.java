package s9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            z11 = SafeParcelReader.i(parcel, readInt);
                        }
                    } else {
                        z10 = SafeParcelReader.i(parcel, readInt);
                    }
                } else {
                    iBinder = SafeParcelReader.k(parcel, readInt);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new y(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new y[i6];
    }
}
