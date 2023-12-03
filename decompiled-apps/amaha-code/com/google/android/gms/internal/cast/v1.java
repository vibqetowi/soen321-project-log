package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class v1 extends c3<v1, s1> implements d4 {
    private static final v1 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        v1 v1Var = new v1();
        zzg = v1Var;
        c3.f(v1.class, v1Var);
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
                        return zzg;
                    }
                    return new s1(2);
                }
                return new v1();
            }
            g gVar = g.f7525i;
            return new n4(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", gVar, "zzf", gVar});
        }
        return (byte) 1;
    }
}
