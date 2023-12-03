package p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.p(parcel, readInt);
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new c(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c[] newArray(int i6) {
        return new c[i6];
    }
}
