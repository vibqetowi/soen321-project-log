package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        k9.g gVar = null;
        m9.a aVar = null;
        double d10 = 0.0d;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 4:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    gVar = (k9.g) SafeParcelReader.c(parcel, readInt, k9.g.CREATOR);
                    break;
                case 6:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    aVar = (m9.a) SafeParcelReader.c(parcel, readInt, m9.a.CREATOR);
                    break;
                case '\b':
                    z12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    d10 = SafeParcelReader.j(parcel, readInt);
                    break;
                case '\n':
                    z13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    z14 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    z15 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new b(str, arrayList, z10, gVar, z11, aVar, z12, d10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i6) {
        return new b[i6];
    }
}
