package xd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: DynamicLinkDataCreator.java */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        long j10 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    bundle = SafeParcelReader.a(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.c(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new a(str, str2, i6, j10, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final a[] newArray(int i6) {
        return new a[i6];
    }
}
