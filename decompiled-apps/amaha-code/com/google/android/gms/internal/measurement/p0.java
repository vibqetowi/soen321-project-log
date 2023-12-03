package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class p0 extends y implements q0 {
    public p0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean v(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            int e10 = ((f1) this).e();
            parcel2.writeNoException();
            parcel2.writeInt(e10);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            z.b(parcel);
            ((f1) this).d0(readLong, (Bundle) z.a(parcel, Bundle.CREATOR), readString, readString2);
            parcel2.writeNoException();
        }
        return true;
    }
}
