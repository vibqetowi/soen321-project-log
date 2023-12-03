package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class y1 extends w5 implements w6 {
    private static final y1 zza;
    private int zzd;
    private String zze = "";
    private b6 zzf = e7.f8360x;
    private boolean zzg;

    static {
        y1 y1Var = new y1();
        zza = y1Var;
        w5.n(y1.class, y1Var);
    }

    public static /* synthetic */ y1 u() {
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
                    return new q1(2, 0);
                }
                return new y1();
            }
            return new f7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", d2.class, "zzg"});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zze;
    }
}
