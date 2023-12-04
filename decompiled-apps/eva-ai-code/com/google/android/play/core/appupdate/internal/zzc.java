package com.google.android.play.core.appupdate.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
