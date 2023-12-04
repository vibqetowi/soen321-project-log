package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class zzbp extends zzl implements zzbq {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzl
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                zzm.zzb(parcel);
                zzi(parcel.readInt(), (Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzm.zzb(parcel);
                zzj(parcel.readInt(), (Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzm.zzb(parcel);
                zzb(parcel.readInt(), (Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 5:
                zzm.zzb(parcel);
                zzg(parcel.readInt(), (Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 6:
                zzm.zzb(parcel);
                zzl((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                zzm.zzb(parcel);
                zzh(createTypedArrayList);
                return true;
            case 8:
                zzm.zzb(parcel);
                zzf((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 9:
                zzm.zzb(parcel);
                zzc((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 10:
                zzm.zzb(parcel);
                zzm((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 11:
                zzm.zzb(parcel);
                zzk((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 12:
                zzm.zzb(parcel);
                zzd((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            case 13:
                zzm.zzb(parcel);
                zze((Bundle) zzm.zza(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
