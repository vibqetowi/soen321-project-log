package v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
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
                                i11 = SafeParcelReader.l(parcel, readInt);
                            }
                        } else {
                            i10 = SafeParcelReader.l(parcel, readInt);
                        }
                    } else {
                        z11 = SafeParcelReader.i(parcel, readInt);
                    }
                } else {
                    z10 = SafeParcelReader.i(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new q(i6, z10, z11, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new q[i6];
    }
}
