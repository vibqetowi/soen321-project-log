package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class x1 extends c3<x1, s1> implements d4 {
    private static final x1 zzi;
    private int zzb;
    private String zze = "";
    private j3<e1> zzf;
    private j3<x0> zzg;
    private boolean zzh;

    static {
        x1 x1Var = new x1();
        zzi = x1Var;
        c3.f(x1.class, x1Var);
    }

    public x1() {
        m4<Object> m4Var = m4.f7592x;
        this.zzf = m4Var;
        this.zzg = m4Var;
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
                    return new s1(4);
                }
                return new x1();
            }
            return new n4(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zze", "zzf", e1.class, "zzg", x0.class, "zzh"});
        }
        return (byte) 1;
    }
}
