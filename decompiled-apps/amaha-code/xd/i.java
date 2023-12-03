package xd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import xd.h;
/* compiled from: ShortDynamicLinkImplCreator.java */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        SafeParcelReader.p(parcel, readInt);
                    } else {
                        arrayList = SafeParcelReader.g(parcel, readInt, h.a.CREATOR);
                    }
                } else {
                    uri2 = (Uri) SafeParcelReader.c(parcel, readInt, Uri.CREATOR);
                }
            } else {
                uri = (Uri) SafeParcelReader.c(parcel, readInt, Uri.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new h(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final h[] newArray(int i6) {
        return new h[i6];
    }
}
