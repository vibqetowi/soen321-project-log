package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class i0 extends z6.a implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 6);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeLong(j10);
        R1(z10, 23);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeString(str2);
        z.c(z10, bundle);
        R1(z10, 9);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void clearMeasurementEnabled(long j10) {
        Parcel z10 = z();
        z10.writeLong(j10);
        R1(z10, 43);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeLong(j10);
        R1(z10, 24);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void generateEventId(n0 n0Var) {
        Parcel z10 = z();
        z.d(z10, n0Var);
        R1(z10, 22);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel z10 = z();
        z.d(z10, n0Var);
        R1(z10, 19);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeString(str2);
        z.d(z10, n0Var);
        R1(z10, 10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel z10 = z();
        z.d(z10, n0Var);
        R1(z10, 17);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel z10 = z();
        z.d(z10, n0Var);
        R1(z10, 16);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getGmpAppId(n0 n0Var) {
        Parcel z10 = z();
        z.d(z10, n0Var);
        R1(z10, 21);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel z10 = z();
        z10.writeString(str);
        z.d(z10, n0Var);
        R1(z10, 6);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getUserProperties(String str, String str2, boolean z10, n0 n0Var) {
        Parcel z11 = z();
        z11.writeString(str);
        z11.writeString(str2);
        ClassLoader classLoader = z.f8723a;
        z11.writeInt(z10 ? 1 : 0);
        z.d(z11, n0Var);
        R1(z11, 5);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void initialize(da.a aVar, t0 t0Var, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z.c(z10, t0Var);
        z10.writeLong(j10);
        R1(z10, 1);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel z12 = z();
        z12.writeString(str);
        z12.writeString(str2);
        z.c(z12, bundle);
        z12.writeInt(z10 ? 1 : 0);
        z12.writeInt(z11 ? 1 : 0);
        z12.writeLong(j10);
        R1(z12, 2);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logHealthData(int i6, String str, da.a aVar, da.a aVar2, da.a aVar3) {
        Parcel z10 = z();
        z10.writeInt(5);
        z10.writeString(str);
        z.d(z10, aVar);
        z.d(z10, aVar2);
        z.d(z10, aVar3);
        R1(z10, 33);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityCreated(da.a aVar, Bundle bundle, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z.c(z10, bundle);
        z10.writeLong(j10);
        R1(z10, 27);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityDestroyed(da.a aVar, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeLong(j10);
        R1(z10, 28);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityPaused(da.a aVar, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeLong(j10);
        R1(z10, 29);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityResumed(da.a aVar, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeLong(j10);
        R1(z10, 30);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivitySaveInstanceState(da.a aVar, n0 n0Var, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z.d(z10, n0Var);
        z10.writeLong(j10);
        R1(z10, 31);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStarted(da.a aVar, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeLong(j10);
        R1(z10, 25);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStopped(da.a aVar, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeLong(j10);
        R1(z10, 26);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void registerOnMeasurementEventListener(q0 q0Var) {
        Parcel z10 = z();
        z.d(z10, q0Var);
        R1(z10, 35);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel z10 = z();
        z.c(z10, bundle);
        z10.writeLong(j10);
        R1(z10, 8);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setCurrentScreen(da.a aVar, String str, String str2, long j10) {
        Parcel z10 = z();
        z.d(z10, aVar);
        z10.writeString(str);
        z10.writeString(str2);
        z10.writeLong(j10);
        R1(z10, 15);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel z11 = z();
        ClassLoader classLoader = z.f8723a;
        z11.writeInt(z10 ? 1 : 0);
        R1(z11, 39);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel z11 = z();
        ClassLoader classLoader = z.f8723a;
        z11.writeInt(z10 ? 1 : 0);
        z11.writeLong(j10);
        R1(z11, 11);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setUserId(String str, long j10) {
        Parcel z10 = z();
        z10.writeString(str);
        z10.writeLong(j10);
        R1(z10, 7);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setUserProperty(String str, String str2, da.a aVar, boolean z10, long j10) {
        Parcel z11 = z();
        z11.writeString(str);
        z11.writeString(str2);
        z.d(z11, aVar);
        z11.writeInt(z10 ? 1 : 0);
        z11.writeLong(j10);
        R1(z11, 4);
    }
}
