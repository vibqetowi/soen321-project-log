package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final n createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        c cVar = null;
        q qVar = null;
        h hVar = null;
        k kVar = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.c(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 4:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    d10 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 6:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\t':
                    j12 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\n':
                    d11 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 11:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
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
                case '\r':
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 14:
                    i13 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 15:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 16:
                    i14 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 17:
                    arrayList = SafeParcelReader.g(parcel, readInt, l.CREATOR);
                    break;
                case 18:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 19:
                    cVar = (c) SafeParcelReader.c(parcel, readInt, c.CREATOR);
                    break;
                case 20:
                    qVar = (q) SafeParcelReader.c(parcel, readInt, q.CREATOR);
                    break;
                case 21:
                    hVar = (h) SafeParcelReader.c(parcel, readInt, h.CREATOR);
                    break;
                case 22:
                    kVar = (k) SafeParcelReader.c(parcel, readInt, k.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new n(mediaInfo, j10, i6, d10, i10, i11, j11, j12, d11, z10, jArr, i12, i13, str, i14, arrayList, z11, cVar, qVar, hVar, kVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n[] newArray(int i6) {
        return new n[i6];
    }
}
