package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class d1 extends c3<d1, x> implements d4 {
    private static final d1 zzf;
    private int zzb;
    private int zze;

    static {
        d1 d1Var = new d1();
        zzf = d1Var;
        c3.f(d1.class, d1Var);
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
                        return zzf;
                    }
                    return new x(16, 0);
                }
                return new d1();
            }
            return new n4(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zze", kotlin.jvm.internal.h.B});
        }
        return (byte) 1;
    }
}
