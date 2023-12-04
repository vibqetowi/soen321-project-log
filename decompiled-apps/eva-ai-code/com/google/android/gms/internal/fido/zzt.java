package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzt extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
    }

    public final void zzc(zzv zzvVar, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzvVar);
        zzc.zzd(zza, sourceStartDirectTransferOptions);
        zzc.zzd(zza, parcelFileDescriptor);
        zzc.zzd(zza, parcelFileDescriptor2);
        zzb(1, zza);
    }
}
