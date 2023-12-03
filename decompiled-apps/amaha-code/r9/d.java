package r9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.p(parcel, readInt);
            } else {
                intent = (Intent) SafeParcelReader.c(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i6) {
        return new a[i6];
    }
}
