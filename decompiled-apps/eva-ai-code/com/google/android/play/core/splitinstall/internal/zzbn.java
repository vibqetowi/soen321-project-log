package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class zzbn extends zzl implements zzbo {
    public static zzbo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder);
    }
}
