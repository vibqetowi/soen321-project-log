package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class g3 extends w5 implements w6 {
    private static final g3 zza;
    private int zzd;
    private String zze = "";
    private b6 zzf = e7.f8360x;

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        w5.n(g3.class, g3Var);
    }

    @Override // com.google.android.gms.internal.measurement.w5
    public final Object t(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new q1(8, (defpackage.e) null);
                }
                return new g3();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", j3.class});
        }
        return (byte) 1;
    }

    public final String v() {
        return this.zze;
    }

    public final b6 w() {
        return this.zzf;
    }
}
