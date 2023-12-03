package t9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        s9.b bVar = null;
        int i6 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 1000) {
                                SafeParcelReader.p(parcel, readInt);
                            } else {
                                i6 = SafeParcelReader.l(parcel, readInt);
                            }
                        } else {
                            bVar = (s9.b) SafeParcelReader.c(parcel, readInt, s9.b.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, readInt, PendingIntent.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.d(parcel, readInt);
                }
            } else {
                i10 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new Status(i6, i10, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new Status[i6];
    }
}
