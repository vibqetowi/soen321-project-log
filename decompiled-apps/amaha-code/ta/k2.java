package ta;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class k2 extends z6.a implements m2 {
    public k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 6);
    }

    @Override // ta.m2
    public final void E1(m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 18);
    }

    @Override // ta.m2
    public final List G(String str, String str2, boolean z10, m6 m6Var) {
        Parcel z11 = z();
        z11.writeString(str);
        z11.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f8723a;
        z11.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.c(z11, m6Var);
        Parcel c12 = c1(z11, 14);
        ArrayList createTypedArrayList = c12.createTypedArrayList(g6.CREATOR);
        c12.recycle();
        return createTypedArrayList;
    }

    @Override // ta.m2
    public final void G0(Bundle bundle, m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, bundle);
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 19);
    }

    @Override // ta.m2
    public final void K(m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 20);
    }

    @Override // ta.m2
    public final byte[] N0(s sVar, String str) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, sVar);
        z10.writeString(str);
        Parcel c12 = c1(z10, 9);
        byte[] createByteArray = c12.createByteArray();
        c12.recycle();
        return createByteArray;
    }

    @Override // ta.m2
    public final void O0(long j10, String str, String str2, String str3) {
        Parcel z10 = z();
        z10.writeLong(j10);
        z10.writeString(str);
        z10.writeString(str2);
        z10.writeString(str3);
        R1(z10, 10);
    }

    @Override // ta.m2
    public final List Q(String str, String str2, String str3, boolean z10) {
        Parcel z11 = z();
        z11.writeString(null);
        z11.writeString(str2);
        z11.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f8723a;
        z11.writeInt(z10 ? 1 : 0);
        Parcel c12 = c1(z11, 15);
        ArrayList createTypedArrayList = c12.createTypedArrayList(g6.CREATOR);
        c12.recycle();
        return createTypedArrayList;
    }

    @Override // ta.m2
    public final String Y0(m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        Parcel c12 = c1(z10, 11);
        String readString = c12.readString();
        c12.recycle();
        return readString;
    }

    @Override // ta.m2
    public final void e1(c cVar, m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, cVar);
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 12);
    }

    @Override // ta.m2
    public final List i0(String str, String str2, String str3) {
        Parcel z10 = z();
        z10.writeString(null);
        z10.writeString(str2);
        z10.writeString(str3);
        Parcel c12 = c1(z10, 17);
        ArrayList createTypedArrayList = c12.createTypedArrayList(c.CREATOR);
        c12.recycle();
        return createTypedArrayList;
    }

    @Override // ta.m2
    public final void k0(m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 4);
    }

    @Override // ta.m2
    public final void q1(g6 g6Var, m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, g6Var);
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 2);
    }

    @Override // ta.m2
    public final void s0(s sVar, m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, sVar);
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 1);
    }

    @Override // ta.m2
    public final List v0(String str, String str2, m6 m6Var) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeString(str2);
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        Parcel c12 = c1(z10, 16);
        ArrayList createTypedArrayList = c12.createTypedArrayList(c.CREATOR);
        c12.recycle();
        return createTypedArrayList;
    }

    @Override // ta.m2
    public final void y0(m6 m6Var) {
        Parcel z10 = z();
        com.google.android.gms.internal.measurement.z.c(z10, m6Var);
        R1(z10, 6);
    }
}
