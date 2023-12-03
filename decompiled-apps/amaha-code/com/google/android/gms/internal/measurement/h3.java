package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class h3 extends w5 implements w6 {
    private static final h3 zza;
    private int zzd;
    private b6 zze = e7.f8360x;
    private f3 zzf;

    static {
        h3 h3Var = new h3();
        zza = h3Var;
        w5.n(h3.class, h3Var);
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
                    return new q1(9, (defpackage.e) null);
                }
                return new h3();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", j3.class, "zzf"});
        }
        return (byte) 1;
    }

    public final f3 u() {
        f3 f3Var = this.zzf;
        if (f3Var == null) {
            return f3.w();
        }
        return f3Var;
    }

    public final b6 w() {
        return this.zze;
    }
}
