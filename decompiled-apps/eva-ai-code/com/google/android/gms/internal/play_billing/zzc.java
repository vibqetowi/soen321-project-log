package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public final class zzc extends zzh implements zze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zza(int i, String str, String str2) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        Parcel zzo = zzo(5, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(i);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(10, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(9);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(TypedValues.Custom.TYPE_COLOR, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(9);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(12, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzn.writeString(null);
        Parcel zzo = zzo(3, zzn);
        Bundle bundle = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(i);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzn.writeString(null);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(8, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(6);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(9, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        Parcel zzo = zzo(4, zzn);
        Bundle bundle = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(i);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzn.writeString(str3);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(11, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(3);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        Parcel zzo = zzo(2, zzn);
        Bundle bundle2 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(i);
        zzn.writeString(str);
        zzn.writeString(str2);
        zzj.zzb(zzn, bundle);
        zzj.zzb(zzn, bundle2);
        Parcel zzo = zzo(TypedValues.Custom.TYPE_FLOAT, zzn);
        Bundle bundle3 = (Bundle) zzj.zza(zzo, Bundle.CREATOR);
        zzo.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zze
    public final void zzm(int i, String str, Bundle bundle, zzg zzgVar) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(12);
        zzn.writeString(str);
        zzj.zzb(zzn, bundle);
        zzn.writeStrongBinder(zzgVar);
        zzp(1201, zzn);
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzq(int i, String str, String str2) throws RemoteException {
        Parcel zzn = zzn();
        zzn.writeInt(i);
        zzn.writeString(str);
        zzn.writeString(str2);
        Parcel zzo = zzo(1, zzn);
        int readInt = zzo.readInt();
        zzo.recycle();
        return readInt;
    }
}
