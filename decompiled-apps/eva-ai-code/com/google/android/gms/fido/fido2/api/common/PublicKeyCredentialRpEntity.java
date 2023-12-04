package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new zzak();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = (String) Preconditions.checkNotNull(str2);
        this.zzc = str3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialRpEntity) {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
            return Objects.equal(this.zza, publicKeyCredentialRpEntity.zza) && Objects.equal(this.zzb, publicKeyCredentialRpEntity.zzb) && Objects.equal(this.zzc, publicKeyCredentialRpEntity.zzc);
        }
        return false;
    }

    public String getIcon() {
        return this.zzc;
    }

    public String getId() {
        return this.zza;
    }

    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
