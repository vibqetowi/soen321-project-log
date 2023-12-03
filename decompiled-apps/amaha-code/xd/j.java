package xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import xd.h;
/* compiled from: WarningImplCreator.java */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<h.a> {
    @Override // android.os.Parcelable.Creator
    public final h.a createFromParcel(Parcel parcel) {
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
        return new h.a(str);
    }

    @Override // android.os.Parcelable.Creator
    public final h.a[] newArray(int i6) {
        return new h.a[i6];
    }
}
