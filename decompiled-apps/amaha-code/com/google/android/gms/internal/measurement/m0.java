package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class m0 extends y implements n0 {
    public m0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean v(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 == 1) {
            z.b(parcel);
            ((g0) this).t((Bundle) z.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
