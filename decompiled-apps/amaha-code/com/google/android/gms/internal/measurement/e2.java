package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class e2 extends w5 implements w6 {
    private static final e2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        e2 e2Var = new e2();
        zza = e2Var;
        w5.n(e2.class, e2Var);
    }

    public static /* synthetic */ e2 u() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.w5
    public final Object t(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new q1(4, 0);
                }
                return new e2();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }
}
