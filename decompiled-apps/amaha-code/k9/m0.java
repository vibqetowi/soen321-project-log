package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        j jVar = null;
        ArrayList arrayList = null;
        long j10 = 0;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
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
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    jVar = (j) SafeParcelReader.c(parcel, readInt, j.CREATOR);
                    break;
                case 7:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.g(parcel, readInt, l.CREATOR);
                    break;
                case '\t':
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new k(str, str2, i6, str3, jVar, i10, arrayList, i11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k[] newArray(int i6) {
        return new k[i6];
    }
}
