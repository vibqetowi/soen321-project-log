package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kf  reason: invalid package */
/* loaded from: classes.dex */
public final class kf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        Long l10 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            if (c10 != 6) {
                                SafeParcelReader.p(parcel, readInt);
                            } else {
                                l10 = SafeParcelReader.n(parcel, readInt);
                            }
                        } else {
                            str3 = SafeParcelReader.d(parcel, readInt);
                        }
                    } else {
                        l2 = SafeParcelReader.n(parcel, readInt);
                    }
                } else {
                    str2 = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new jf(str, str2, l2, str3, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new jf[i6];
    }
}
