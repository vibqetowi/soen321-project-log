package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import fd.x;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ld  reason: invalid package */
/* loaded from: classes.dex */
public final class ld implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Status status = null;
        x xVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            str2 = SafeParcelReader.d(parcel, readInt);
                        }
                    } else {
                        str = SafeParcelReader.d(parcel, readInt);
                    }
                } else {
                    xVar = (x) SafeParcelReader.c(parcel, readInt, x.CREATOR);
                }
            } else {
                status = (Status) SafeParcelReader.c(parcel, readInt, Status.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new kd(status, xVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new kd[i6];
    }
}
