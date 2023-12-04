package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznr extends zznt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zznr(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzc(Object obj, long j, boolean z) {
        if (zznu.zzb) {
            zznu.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zznu.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzd(Object obj, long j, byte b) {
        if (zznu.zzb) {
            zznu.zzD(obj, j, b);
        } else {
            zznu.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzg(Object obj, long j) {
        if (zznu.zzb) {
            return zznu.zzt(obj, j);
        }
        return zznu.zzu(obj, j);
    }
}
