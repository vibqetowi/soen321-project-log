package wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    str = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                arrayList = SafeParcelReader.e(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new h(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i6) {
        return new h[i6];
    }
}
