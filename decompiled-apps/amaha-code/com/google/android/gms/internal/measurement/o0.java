package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class o0 extends z6.a implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 6);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final void d0(long j10, Bundle bundle, String str, String str2) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeString(str2);
        z.c(z10, bundle);
        z10.writeLong(j10);
        R1(z10, 1);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final int e() {
        Parcel c12 = c1(z(), 2);
        int readInt = c12.readInt();
        c12.recycle();
        return readInt;
    }
}
