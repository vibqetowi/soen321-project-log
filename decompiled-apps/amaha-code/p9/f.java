package p9;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class f extends ja.a implements g {
    public f() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10 = false;
        switch (i6) {
            case 1:
                l0(parcel.readInt());
                break;
            case 2:
                k9.d dVar = (k9.d) com.google.android.gms.internal.cast.d.a(parcel, k9.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                O1(dVar, readString, readString2, z10);
                break;
            case 3:
                j(parcel.readInt());
                break;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i11 = com.google.android.gms.internal.cast.d.f7498a;
                parcel.readInt();
                p0();
                break;
            case 5:
                a(parcel.readString(), parcel.readString());
                break;
            case 6:
                S(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                D(parcel.readInt());
                break;
            case 8:
                y1(parcel.readInt());
                break;
            case 9:
                x(parcel.readInt());
                break;
            case 10:
                parcel.readString();
                k1(parcel.readLong(), parcel.readInt());
                break;
            case 11:
                parcel.readString();
                F1(parcel.readLong());
                break;
            case 12:
                J((c) com.google.android.gms.internal.cast.d.a(parcel, c.CREATOR));
                break;
            case 13:
                w1((a0) com.google.android.gms.internal.cast.d.a(parcel, a0.CREATOR));
                break;
            case 14:
                u(parcel.readInt());
                break;
            case 15:
                k(parcel.readInt());
                break;
            default:
                return false;
        }
        return true;
    }
}
