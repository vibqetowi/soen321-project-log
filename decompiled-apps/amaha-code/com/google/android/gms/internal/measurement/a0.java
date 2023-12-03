package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a0 extends z6.a implements c0 {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 6);
    }

    @Override // com.google.android.gms.internal.measurement.c0
    public final Bundle D0(Bundle bundle) {
        Parcel z10 = z();
        z.c(z10, bundle);
        Parcel c12 = c1(z10, 1);
        Bundle bundle2 = (Bundle) z.a(c12, Bundle.CREATOR);
        c12.recycle();
        return bundle2;
    }
}
