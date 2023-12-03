package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            z11 = SafeParcelReader.i(parcel, readInt);
                        }
                    } else {
                        z10 = SafeParcelReader.i(parcel, readInt);
                    }
                } else {
                    j11 = SafeParcelReader.m(parcel, readInt);
                }
            } else {
                j10 = SafeParcelReader.m(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new h(j10, j11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h[] newArray(int i6) {
        return new h[i6];
    }
}
