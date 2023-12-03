package ta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static void a(s sVar, Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, sVar.f32858u);
        hc.d.w0(parcel, 3, sVar.f32859v, i6);
        hc.d.x0(parcel, 4, sVar.f32860w);
        hc.d.u0(parcel, 5, sVar.f32861x);
        hc.d.C0(parcel, B0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        q qVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            j10 = SafeParcelReader.m(parcel, readInt);
                        }
                    } else {
                        str2 = SafeParcelReader.d(parcel, readInt);
                    }
                } else {
                    qVar = (q) SafeParcelReader.c(parcel, readInt, q.CREATOR);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new s(str, qVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new s[i6];
    }
}
