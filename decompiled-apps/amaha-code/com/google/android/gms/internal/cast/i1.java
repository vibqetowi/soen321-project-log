package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class i1 extends c3<i1, x> implements d4 {
    private static final i1 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        i1 i1Var = new i1();
        zzi = i1Var;
        c3.f(i1.class, i1Var);
    }

    @Override // com.google.android.gms.internal.cast.c3
    public final Object c(c3 c3Var, int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            byte b10 = 0;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (c3Var != null) {
                                b10 = 1;
                            }
                            this.zzh = b10;
                            return null;
                        }
                        return zzi;
                    }
                    return new x(21, 0);
                }
                return new i1();
            }
            return new n4(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zze", g.f7523g, "zzf", "zzg", ca.a.C});
        }
        return Byte.valueOf(this.zzh);
    }
}
