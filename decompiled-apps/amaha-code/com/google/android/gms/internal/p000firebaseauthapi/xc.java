package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import fd.m;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xc  reason: invalid package */
/* loaded from: classes.dex */
public final class xc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        m mVar = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    SafeParcelReader.p(parcel, readInt);
                } else {
                    mVar = (m) SafeParcelReader.c(parcel, readInt, m.CREATOR);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new wc(mVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new wc[i6];
    }
}
