package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
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
                                j12 = SafeParcelReader.m(parcel, readInt);
                            }
                        } else {
                            str2 = SafeParcelReader.d(parcel, readInt);
                        }
                    } else {
                        str = SafeParcelReader.d(parcel, readInt);
                    }
                } else {
                    j11 = SafeParcelReader.m(parcel, readInt);
                }
            } else {
                j10 = SafeParcelReader.m(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new c(j10, j11, str, str2, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c[] newArray(int i6) {
        return new c[i6];
    }
}
