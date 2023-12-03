package wa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        Intent intent = null;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        intent = (Intent) SafeParcelReader.c(parcel, readInt, Intent.CREATOR);
                    }
                } else {
                    i10 = SafeParcelReader.l(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new b(i6, i10, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i6) {
        return new b[i6];
    }
}
