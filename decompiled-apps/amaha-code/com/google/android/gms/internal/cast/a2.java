package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a2 extends c3<a2, s1> implements d4 {
    private static final a2 zzi;
    private int zzb;
    private long zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;

    static {
        a2 a2Var = new a2();
        zzi = a2Var;
        c3.f(a2.class, a2Var);
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
                    return new s1(6);
                }
                return new a2();
            }
            return new n4(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
