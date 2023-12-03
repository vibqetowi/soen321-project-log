package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class j1 extends c3<j1, x> implements d4 {
    private static final j1 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        j1 j1Var = new j1();
        zzg = j1Var;
        c3.f(j1.class, j1Var);
    }

    public static /* synthetic */ j1 h() {
        return zzg;
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
                    return new x(22, 0);
                }
                return new j1();
            }
            return new n4(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
