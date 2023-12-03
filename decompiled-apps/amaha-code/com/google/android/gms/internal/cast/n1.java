package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n1 extends c3<n1, x> implements d4 {
    private static final n1 zzh;
    private int zzb;
    private long zze;
    private h3 zzf;
    private h3 zzg;

    static {
        n1 n1Var = new n1();
        zzh = n1Var;
        c3.f(n1.class, n1Var);
    }

    public n1() {
        s3 s3Var = s3.f7637x;
        this.zzf = s3Var;
        this.zzg = s3Var;
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
                    return new x(25, 0);
                }
                return new n1();
            }
            return new n4(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
