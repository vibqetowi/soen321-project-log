package m9;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class w extends ja.a implements x {
    public w() {
        super("com.google.android.gms.cast.framework.media.IImagePicker", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return false;
                    }
                    ((b0) this).f24948b.getClass();
                    int i11 = ((b) com.google.android.gms.internal.cast.d.a(parcel, b.CREATOR)).f24945u;
                    u9.a a10 = c.a((k9.i) com.google.android.gms.internal.cast.d.a(parcel, k9.i.CREATOR));
                    parcel2.writeNoException();
                    if (a10 == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        a10.writeToParcel(parcel2, 1);
                    }
                } else {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
            } else {
                da.a h10 = ((b0) this).h();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.d.c(parcel2, h10);
            }
        } else {
            parcel.readInt();
            ((b0) this).f24948b.getClass();
            u9.a a11 = c.a((k9.i) com.google.android.gms.internal.cast.d.a(parcel, k9.i.CREATOR));
            parcel2.writeNoException();
            if (a11 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                a11.writeToParcel(parcel2, 1);
            }
        }
        return true;
    }
}
