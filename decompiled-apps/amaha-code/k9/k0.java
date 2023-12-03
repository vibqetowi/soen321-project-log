package k9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        i6 = SafeParcelReader.l(parcel, readInt);
                    }
                } else {
                    bundle = SafeParcelReader.a(parcel, readInt);
                }
            } else {
                arrayList = SafeParcelReader.g(parcel, readInt, u9.a.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new i(arrayList, bundle, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i6) {
        return new i[i6];
    }
}
