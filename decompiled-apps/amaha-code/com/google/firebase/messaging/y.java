package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public final x createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.p(parcel, readInt);
            } else {
                bundle = SafeParcelReader.a(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new x(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final x[] newArray(int i6) {
        return new x[i6];
    }
}
