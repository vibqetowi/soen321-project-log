package gd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        int q10 = SafeParcelReader.q(parcel);
        jf jfVar = null;
        h0 h0Var = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        m0 m0Var = null;
        boolean z11 = false;
        fd.x xVar = null;
        q qVar = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    jfVar = (jf) SafeParcelReader.c(parcel, readInt, jf.CREATOR);
                    break;
                case 2:
                    h0Var = (h0) SafeParcelReader.c(parcel, readInt, h0.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.g(parcel, readInt, h0.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.e(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    if (o10 == 0) {
                        bool = null;
                        break;
                    } else {
                        SafeParcelReader.r(parcel, o10, 4);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bool = Boolean.valueOf(z10);
                        break;
                    }
                case '\t':
                    m0Var = (m0) SafeParcelReader.c(parcel, readInt, m0.CREATOR);
                    break;
                case '\n':
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    xVar = (fd.x) SafeParcelReader.c(parcel, readInt, fd.x.CREATOR);
                    break;
                case '\f':
                    qVar = (q) SafeParcelReader.c(parcel, readInt, q.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new k0(jfVar, h0Var, str, str2, arrayList, arrayList2, str3, bool, m0Var, z11, xVar, qVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new k0[i6];
    }
}
