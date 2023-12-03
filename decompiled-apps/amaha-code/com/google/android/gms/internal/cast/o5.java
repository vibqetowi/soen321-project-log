package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class o5 extends z6.a implements p5 {
    public o5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 4);
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void A1(Bundle bundle, String str) {
        Parcel z10 = z();
        z10.writeString(str);
        d.b(z10, bundle);
        R1(z10, 4);
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void H0(Bundle bundle, String str) {
        Parcel z10 = z();
        z10.writeString(str);
        d.b(z10, bundle);
        R1(z10, 1);
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void H1(String str, int i6, Bundle bundle) {
        Parcel z10 = z();
        z10.writeString(str);
        d.b(z10, bundle);
        z10.writeInt(i6);
        R1(z10, 6);
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void W0(Bundle bundle, String str) {
        Parcel z10 = z();
        z10.writeString(str);
        d.b(z10, bundle);
        R1(z10, 2);
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void g1(Bundle bundle, String str) {
        Parcel z10 = z();
        z10.writeString(str);
        d.b(z10, bundle);
        R1(z10, 3);
    }
}
