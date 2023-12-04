package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzp zzpVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzw zzwVar = null;
        zzy zzyVar = null;
        zzaa zzaaVar = null;
        zzr zzrVar = null;
        zzad zzadVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) SafeParcelReader.createParcelable(parcel, readHeader, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzpVar = (zzp) SafeParcelReader.createParcelable(parcel, readHeader, zzp.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) SafeParcelReader.createParcelable(parcel, readHeader, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzwVar = (zzw) SafeParcelReader.createParcelable(parcel, readHeader, zzw.CREATOR);
                    break;
                case 6:
                    zzyVar = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 7:
                    zzaaVar = (zzaa) SafeParcelReader.createParcelable(parcel, readHeader, zzaa.CREATOR);
                    break;
                case 8:
                    zzrVar = (zzr) SafeParcelReader.createParcelable(parcel, readHeader, zzr.CREATOR);
                    break;
                case 9:
                    zzadVar = (zzad) SafeParcelReader.createParcelable(parcel, readHeader, zzad.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) SafeParcelReader.createParcelable(parcel, readHeader, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AuthenticationExtensions(fidoAppIdExtension, zzpVar, userVerificationMethodExtension, zzwVar, zzyVar, zzaaVar, zzrVar, zzadVar, googleThirdPartyPaymentExtension);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}
