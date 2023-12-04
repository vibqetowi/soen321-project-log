package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzar(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double zzd(String str) {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long zze(String str) {
        return Long.valueOf(this.zza.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzf(String str) {
        return this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzg(String str) {
        return this.zza.getString(str);
    }
}
