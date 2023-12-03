package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d10 = 0.0d;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            if (c10 != 6) {
                                SafeParcelReader.p(parcel, readInt);
                            } else {
                                d10 = SafeParcelReader.j(parcel, readInt);
                            }
                        } else {
                            arrayList2 = SafeParcelReader.g(parcel, readInt, u9.a.CREATOR);
                        }
                    } else {
                        arrayList = SafeParcelReader.g(parcel, readInt, i.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new j(i6, str, arrayList, arrayList2, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i6) {
        return new j[i6];
    }
}
