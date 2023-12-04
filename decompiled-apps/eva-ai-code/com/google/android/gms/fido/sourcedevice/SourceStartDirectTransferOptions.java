package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int CALLER_TYPE_BROWSER = 2;
    public static final int CALLER_TYPE_UNKNOWN = 0;
    public static final Parcelable.Creator<SourceStartDirectTransferOptions> CREATOR = new zzb();
    private int zza;
    private boolean zzb;
    private List zzc;
    private boolean zzd;
    private String zze;

    public SourceStartDirectTransferOptions(int i) {
        this.zza = i;
        this.zzb = false;
        this.zzd = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SourceStartDirectTransferOptions(int i, boolean z, List list, boolean z2, String str) {
        this.zza = i;
        this.zzb = z;
        this.zzc = list;
        this.zzd = z2;
        this.zze = str;
    }
}
