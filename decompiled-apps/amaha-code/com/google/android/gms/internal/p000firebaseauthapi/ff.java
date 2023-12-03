package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import fd.x;
import java.util.ArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ff  reason: invalid package */
/* loaded from: classes.dex */
public final class ff implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        e eVar = null;
        String str5 = null;
        String str6 = null;
        x xVar = null;
        ArrayList arrayList = null;
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    eVar = (e) SafeParcelReader.c(parcel, readInt, e.CREATOR);
                    break;
                case '\b':
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\n':
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 11:
                    j11 = SafeParcelReader.m(parcel, readInt);
                    break;
                case '\f':
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    xVar = (x) SafeParcelReader.c(parcel, readInt, x.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.g(parcel, readInt, a.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new ef(str, str2, z10, str3, str4, eVar, str5, str6, j10, j11, z11, xVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new ef[i6];
    }
}
