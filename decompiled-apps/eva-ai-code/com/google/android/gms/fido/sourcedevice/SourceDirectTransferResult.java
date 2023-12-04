package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class SourceDirectTransferResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SourceDirectTransferResult> CREATOR = new zza();
    private final Status zza;
    private final int zzb;

    public SourceDirectTransferResult(Status status) {
        this(status, 0);
    }

    public Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SourceDirectTransferResult(Status status, int i) {
        this.zza = status;
        this.zzb = i;
    }
}
