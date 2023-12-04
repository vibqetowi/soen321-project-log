package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkw implements zzmg {
    private static final zzkw zza = new zzkw();

    private zzkw() {
    }

    public static zzkw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        if (!zzlb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzmf) zzlb.zzbC(cls.asSubclass(zzlb.class)).zzl(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        return zzlb.class.isAssignableFrom(cls);
    }
}
