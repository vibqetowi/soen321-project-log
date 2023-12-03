package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final t createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f10 = 0.0f;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        SafeParcelReader.s(parcel, readInt, 4);
                        f10 = parcel.readFloat();
                    }
                } else {
                    SafeParcelReader.s(parcel, readInt, 4);
                    f2 = parcel.readFloat();
                }
            } else {
                SafeParcelReader.s(parcel, readInt, 4);
                f = parcel.readFloat();
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new t(f, f2, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t[] newArray(int i6) {
        return new t[i6];
    }
}
