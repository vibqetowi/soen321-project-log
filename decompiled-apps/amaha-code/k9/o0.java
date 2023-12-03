package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i6 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.c(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    d10 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 6:
                    d11 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 7:
                    d12 = SafeParcelReader.j(parcel, readInt);
                    break;
                case '\b':
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (o10 == 0) {
                        jArr = null;
                        break;
                    } else {
                        long[] createLongArray = parcel.createLongArray();
                        parcel.setDataPosition(dataPosition + o10);
                        jArr = createLongArray;
                        break;
                    }
                case '\t':
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new l(mediaInfo, i6, z10, d10, d11, d12, jArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l[] newArray(int i6) {
        return new l[i6];
    }
}
