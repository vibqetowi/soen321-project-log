package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class u1 extends c3<u1, s1> implements d4 {
    private static final u1 zzh;
    private int zzb;
    private j3<b2> zze;
    private j3<u0> zzf;
    private y1 zzg;

    static {
        u1 u1Var = new u1();
        zzh = u1Var;
        c3.f(u1.class, u1Var);
    }

    public u1() {
        m4<Object> m4Var = m4.f7592x;
        this.zze = m4Var;
        this.zzf = m4Var;
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
                        return zzh;
                    }
                    return new s1(1);
                }
                return new u1();
            }
            return new n4(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzb", "zze", b2.class, "zzf", u0.class, "zzg"});
        }
        return (byte) 1;
    }
}
