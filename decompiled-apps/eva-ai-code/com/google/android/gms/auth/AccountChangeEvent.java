package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    final int zza;
    final long zzb;
    final String zzc;
    final int zzd;
    final int zze;
    final String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AccountChangeEvent) {
            if (obj == this) {
                return true;
            }
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && Objects.equal(this.zzf, accountChangeEvent.zzf);
        }
        return false;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    public String toString() {
        int i = this.zzd;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.zzc;
        String str3 = this.zzf;
        int i2 = this.zze;
        return "AccountChangeEvent {accountName = " + str2 + ", changeType = " + str + ", changeData = " + str3 + ", eventIndex = " + i2 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.zza = 1;
        this.zzb = j;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i;
        this.zze = i2;
        this.zzf = str2;
    }
}
