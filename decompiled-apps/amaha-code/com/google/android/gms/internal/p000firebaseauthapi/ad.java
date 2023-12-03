package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ad  reason: invalid package */
/* loaded from: classes.dex */
public final class ad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        j jVar = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.p(parcel, readInt);
            } else {
                jVar = (j) SafeParcelReader.c(parcel, readInt, j.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new zc(jVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new zc[i6];
    }
}
