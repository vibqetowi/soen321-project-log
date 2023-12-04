package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    private final FidoAppIdExtension zza;
    private final zzp zzb;
    private final UserVerificationMethodExtension zzc;
    private final zzw zzd;
    private final zzy zze;
    private final zzaa zzf;
    private final zzr zzg;
    private final zzad zzh;
    private final GoogleThirdPartyPaymentExtension zzi;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private FidoAppIdExtension zza;
        private UserVerificationMethodExtension zzb;
        private zzp zzc;
        private zzw zzd;
        private zzy zze;
        private zzaa zzf;
        private zzr zzg;
        private zzad zzh;
        private GoogleThirdPartyPaymentExtension zzi;

        public Builder() {
        }

        public Builder(AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zza();
                this.zzd = authenticationExtensions.zzc();
                this.zze = authenticationExtensions.zzd();
                this.zzf = authenticationExtensions.zze();
                this.zzg = authenticationExtensions.zzb();
                this.zzh = authenticationExtensions.zzg();
                this.zzi = authenticationExtensions.zzf();
            }
        }

        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }

        public Builder setFido2Extension(FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        public Builder setGoogleThirdPartyPaymentExtension(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        public Builder setUserVerificationMethodExtension(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzp zzpVar, UserVerificationMethodExtension userVerificationMethodExtension, zzw zzwVar, zzy zzyVar, zzaa zzaaVar, zzr zzrVar, zzad zzadVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzpVar;
        this.zzd = zzwVar;
        this.zze = zzyVar;
        this.zzf = zzaaVar;
        this.zzg = zzrVar;
        this.zzh = zzadVar;
        this.zzi = googleThirdPartyPaymentExtension;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AuthenticationExtensions) {
            AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
            return Objects.equal(this.zza, authenticationExtensions.zza) && Objects.equal(this.zzb, authenticationExtensions.zzb) && Objects.equal(this.zzc, authenticationExtensions.zzc) && Objects.equal(this.zzd, authenticationExtensions.zzd) && Objects.equal(this.zze, authenticationExtensions.zze) && Objects.equal(this.zzf, authenticationExtensions.zzf) && Objects.equal(this.zzg, authenticationExtensions.zzg) && Objects.equal(this.zzh, authenticationExtensions.zzh) && Objects.equal(this.zzi, authenticationExtensions.zzi);
        }
        return false;
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzp zza() {
        return this.zzb;
    }

    public final zzr zzb() {
        return this.zzg;
    }

    public final zzw zzc() {
        return this.zzd;
    }

    public final zzy zzd() {
        return this.zze;
    }

    public final zzaa zze() {
        return this.zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    public final zzad zzg() {
        return this.zzh;
    }
}
