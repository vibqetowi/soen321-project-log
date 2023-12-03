package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class l0 extends z6.a implements n0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 6);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void t(Bundle bundle) {
        Parcel z10 = z();
        z.c(z10, bundle);
        R1(z10, 1);
    }
}
