package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class x0 extends c3<x0, w0> implements d4 {
    private static final x0 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        x0 x0Var = new x0();
        zzg = x0Var;
        c3.f(x0.class, x0Var);
    }

    public static w0 h() {
        return zzg.d();
    }

    public static /* synthetic */ void k(x0 x0Var, String str) {
        str.getClass();
        x0Var.zzb |= 1;
        x0Var.zze = str;
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
                    return new w0(0);
                }
                return new x0();
            }
            return new n4(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
