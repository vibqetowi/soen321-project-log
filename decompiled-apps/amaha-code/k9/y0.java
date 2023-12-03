package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final CastDevice createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i6 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = false;
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
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.g(parcel, readInt, u9.a.CREATOR);
                    break;
                case '\t':
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 11:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\f':
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 14:
                    str8 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 15:
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (o10 == 0) {
                        bArr = null;
                        break;
                    } else {
                        bArr = parcel.createByteArray();
                        parcel.setDataPosition(dataPosition + o10);
                        break;
                    }
                case 16:
                    str9 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 17:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new CastDevice(str, str2, str3, str4, str5, i6, arrayList, i10, i11, str6, str7, i12, str8, bArr, str9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CastDevice[] newArray(int i6) {
        return new CastDevice[i6];
    }
}
