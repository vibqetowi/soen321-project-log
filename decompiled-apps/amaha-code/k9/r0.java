package k9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    SafeParcelReader.g(parcel, readInt, u9.a.CREATOR);
                    break;
                case 5:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.c(parcel, readInt, Uri.CREATOR);
                    break;
                case '\b':
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new d(str, str2, arrayList, str3, uri, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i6) {
        return new d[i6];
    }
}
