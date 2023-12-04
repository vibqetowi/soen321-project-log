package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbq extends zzbn implements zzbr {
    public static zzbr zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
    }
}
