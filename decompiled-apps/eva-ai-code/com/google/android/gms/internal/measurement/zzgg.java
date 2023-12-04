package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgg extends zzlb implements zzmj {
    private static final zzgg zza;
    private int zzd;
    private int zze = 1;
    private zzli zzf = zzbH();

    static {
        zzgg zzggVar = new zzgg();
        zza = zzggVar;
        zzlb.zzbO(zzgg.class, zzggVar);
    }

    private zzgg() {
    }

    public static zzge zza() {
        return (zzge) zza.zzbA();
    }

    public static /* synthetic */ void zzc(zzgg zzggVar, zzfv zzfvVar) {
        zzfvVar.getClass();
        zzli zzliVar = zzggVar.zzf;
        if (!zzliVar.zzc()) {
            zzggVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzggVar.zzf.add(zzfvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzge(null);
                }
                return new zzgg();
            }
            return zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzgf.zza, "zzf", zzfv.class});
        }
        return (byte) 1;
    }
}
