package j9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        Bundle bundle = null;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        bundle = SafeParcelReader.a(parcel, readInt);
                    }
                } else {
                    i10 = SafeParcelReader.l(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a(i6, i10, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i6) {
        return new a[i6];
    }
}
