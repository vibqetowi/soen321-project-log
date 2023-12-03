package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class b1 extends c3<b1, x> implements d4 {
    private static final b1 zzi;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private e2 zzg;
    private boolean zzh;

    static {
        b1 b1Var = new b1();
        zzi = b1Var;
        c3.f(b1.class, b1Var);
    }

    @Override // com.google.android.gms.internal.cast.c3
    public final Object c(c3 c3Var, int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzi;
                    }
                    return new x(14, 0);
                }
                return new b1();
            }
            return new n4(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
