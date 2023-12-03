package s9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        boolean z10 = false;
        String str = null;
        int i6 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            i10 = SafeParcelReader.l(parcel, readInt);
                        }
                    } else {
                        i6 = SafeParcelReader.l(parcel, readInt);
                    }
                } else {
                    str = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                z10 = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new w(i6, i10, str, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new w[i6];
    }
}
