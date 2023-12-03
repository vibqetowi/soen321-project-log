package s9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        int i6 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            SafeParcelReader.p(parcel, readInt);
                        } else {
                            str = SafeParcelReader.d(parcel, readInt);
                        }
                    } else {
                        pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, readInt, PendingIntent.CREATOR);
                    }
                } else {
                    i10 = SafeParcelReader.l(parcel, readInt);
                }
            } else {
                i6 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new b(i6, i10, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new b[i6];
    }
}
