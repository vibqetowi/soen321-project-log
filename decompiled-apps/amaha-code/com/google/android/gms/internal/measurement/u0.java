package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 2:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 3:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\b':
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new t0(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new t0[i6];
    }
}
