package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final MediaInfo createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        i iVar = null;
        ArrayList arrayList = null;
        o oVar = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        p pVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        long j11 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    iVar = (i) SafeParcelReader.c(parcel, readInt, i.CREATOR);
                    break;
                case 6:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 7:
                    arrayList = SafeParcelReader.g(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case '\b':
                    oVar = (o) SafeParcelReader.c(parcel, readInt, o.CREATOR);
                    break;
                case '\t':
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\n':
                    arrayList2 = SafeParcelReader.g(parcel, readInt, b.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.g(parcel, readInt, a.CREATOR);
                    break;
                case '\f':
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    pVar = (p) SafeParcelReader.c(parcel, readInt, p.CREATOR);
                    break;
                case 14:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 15:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 16:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 17:
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 18:
                    str8 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new MediaInfo(str, i6, str2, iVar, j10, arrayList, oVar, str3, arrayList2, arrayList3, str4, pVar, j11, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaInfo[] newArray(int i6) {
        return new MediaInfo[i6];
    }
}
