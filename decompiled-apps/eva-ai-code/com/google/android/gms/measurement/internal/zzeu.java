package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeu {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzeu(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzeu zzb(zzau zzauVar) {
        return new zzeu(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
