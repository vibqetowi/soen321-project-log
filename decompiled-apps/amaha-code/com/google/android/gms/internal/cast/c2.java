package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class c2 extends c3<c2, s1> implements d4 {
    private static final c2 zzi;
    private int zzb;
    private int zze;
    private j3<q1> zzf;
    private j3<q1> zzg;
    private int zzh;

    static {
        c2 c2Var = new c2();
        zzi = c2Var;
        c3.f(c2.class, c2Var);
    }

    public c2() {
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
                    return new s1(8);
                }
                return new c2();
            }
            return new n4(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzb", "zze", g.f7527k, "zzf", q1.class, "zzg", q1.class, "zzh"});
        }
        return (byte) 1;
    }
}
