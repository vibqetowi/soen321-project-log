package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    public String zza;
    public String zzb;
    public zzlk zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzau zzg;
    public long zzh;
    public zzau zzi;
    public final long zzj;
    public final zzau zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        this.zza = zzacVar.zza;
        this.zzb = zzacVar.zzb;
        this.zzc = zzacVar.zzc;
        this.zzd = zzacVar.zzd;
        this.zze = zzacVar.zze;
        this.zzf = zzacVar.zzf;
        this.zzg = zzacVar.zzg;
        this.zzh = zzacVar.zzh;
        this.zzi = zzacVar.zzi;
        this.zzj = zzacVar.zzj;
        this.zzk = zzacVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(String str, String str2, zzlk zzlkVar, long j, boolean z, String str3, zzau zzauVar, long j2, zzau zzauVar2, long j3, zzau zzauVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzlkVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzauVar;
        this.zzh = j2;
        this.zzi = zzauVar2;
        this.zzj = j3;
        this.zzk = zzauVar3;
    }
}
