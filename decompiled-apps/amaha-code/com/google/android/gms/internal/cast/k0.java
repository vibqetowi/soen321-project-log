package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k0 extends c3<k0, j0> implements d4 {
    private static final k0 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        k0 k0Var = new k0();
        zzg = k0Var;
        c3.f(k0.class, k0Var);
    }

    public static j0 h() {
        return zzg.d();
    }

    public static /* synthetic */ void k(k0 k0Var, String str) {
        str.getClass();
        k0Var.zzb |= 1;
        k0Var.zze = str;
    }

    public static /* synthetic */ void l(k0 k0Var, String str) {
        str.getClass();
        k0Var.zzb |= 2;
        k0Var.zzf = str;
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
                    return new j0(0);
                }
                return new k0();
            }
            return new n4(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
