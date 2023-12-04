package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzb(parcel);
            zzc((Bundle) zzc.zza(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzc.zzb(parcel);
            zzb((Bundle) zzc.zza(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
