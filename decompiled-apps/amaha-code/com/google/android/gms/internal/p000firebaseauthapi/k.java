package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k  reason: invalid package */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
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
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    str8 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\n':
                    z10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    z11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    str10 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 14:
                    str11 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 15:
                    str12 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 16:
                    z12 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    str13 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new j(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new j[i6];
    }
}
