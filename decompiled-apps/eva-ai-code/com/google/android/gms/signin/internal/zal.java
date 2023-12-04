package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zal implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zak createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel, readHeader, ConnectionResult.CREATOR);
            } else if (fieldId == 3) {
                zavVar = (zav) SafeParcelReader.createParcelable(parcel, readHeader, zav.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zak(i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }
}
