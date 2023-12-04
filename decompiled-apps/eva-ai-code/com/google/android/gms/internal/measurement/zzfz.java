package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfz extends zzlb implements zzmj {
    private static final zzfz zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfn zzg;

    static {
        zzfz zzfzVar = new zzfz();
        zza = zzfzVar;
        zzlb.zzbO(zzfz.class, zzfzVar);
    }

    private zzfz() {
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
                    return new zzfy(null);
                }
                return new zzfz();
            }
            return zzbL(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
