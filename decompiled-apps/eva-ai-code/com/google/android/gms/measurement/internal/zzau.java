package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    public final String zza;
    public final zzas zzb;
    public final String zzc;
    public final long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzau zzauVar, long j) {
        Preconditions.checkNotNull(zzauVar);
        this.zza = zzauVar.zza;
        this.zzb = zzauVar.zzb;
        this.zzc = zzauVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzav.zza(this, parcel, i);
    }

    public zzau(String str, zzas zzasVar, String str2, long j) {
        this.zza = str;
        this.zzb = zzasVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
