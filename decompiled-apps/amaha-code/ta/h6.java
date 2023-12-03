package ta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class h6 implements Parcelable.Creator {
    public static void a(g6 g6Var, Parcel parcel) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, g6Var.f32577u);
        hc.d.x0(parcel, 2, g6Var.f32578v);
        hc.d.u0(parcel, 3, g6Var.f32579w);
        hc.d.v0(parcel, 4, g6Var.f32580x);
        hc.d.x0(parcel, 6, g6Var.f32581y);
        hc.d.x0(parcel, 7, g6Var.f32582z);
        Double d10 = g6Var.A;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        hc.d.C0(parcel, B0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        Long l2 = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 4:
                    l2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 5:
                    int o10 = SafeParcelReader.o(parcel, readInt);
                    if (o10 == 0) {
                        f = null;
                        break;
                    } else {
                        SafeParcelReader.r(parcel, o10, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    }
                case 6:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    int o11 = SafeParcelReader.o(parcel, readInt);
                    if (o11 == 0) {
                        d10 = null;
                        break;
                    } else {
                        SafeParcelReader.r(parcel, o11, 8);
                        d10 = Double.valueOf(parcel.readDouble());
                        break;
                    }
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new g6(i6, str, j10, l2, f, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new g6[i6];
    }
}
