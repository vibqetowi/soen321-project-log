package l9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i0 extends z6.a implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession", 4);
    }

    @Override // l9.k0
    public final void i1(s9.b bVar) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.b(z10, bVar);
        R1(z10, 3);
    }

    @Override // l9.k0
    public final void j(int i6) {
        Parcel z10 = z();
        z10.writeInt(i6);
        R1(z10, 2);
    }

    @Override // l9.k0
    public final void r1(boolean z10) {
        Parcel z11 = z();
        int i6 = com.google.android.gms.internal.cast.d.f7498a;
        z11.writeInt(z10 ? 1 : 0);
        z11.writeInt(0);
        R1(z11, 6);
    }

    @Override // l9.k0
    public final void t(Bundle bundle) {
        Parcel z10 = z();
        com.google.android.gms.internal.cast.d.b(z10, null);
        R1(z10, 1);
    }

    @Override // l9.k0
    public final void x(int i6) {
        Parcel z10 = z();
        z10.writeInt(i6);
        R1(z10, 5);
    }

    @Override // l9.k0
    public final void x0(k9.d dVar, String str, String str2, boolean z10) {
        Parcel z11 = z();
        com.google.android.gms.internal.cast.d.b(z11, dVar);
        z11.writeString(str);
        z11.writeString(str2);
        z11.writeInt(z10 ? 1 : 0);
        R1(z11, 4);
    }
}
