package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class y2 extends w5 implements w6 {
    private static final y2 zza;
    private int zzd;
    private int zze = 1;
    private b6 zzf = e7.f8360x;

    static {
        y2 y2Var = new y2();
        zza = y2Var;
        w5.n(y2.class, y2Var);
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
                    return new w2(0);
                }
                return new y2();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", x2.f8684a, "zzf", o2.class});
        }
        return (byte) 1;
    }
}
