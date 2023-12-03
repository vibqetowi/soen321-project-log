package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class f3 extends w5 implements w6 {
    private static final f3 zza;
    private b6 zzd = e7.f8360x;

    static {
        f3 f3Var = new f3();
        zza = f3Var;
        w5.n(f3.class, f3Var);
    }

    public static f3 w() {
        return zza;
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
                    return new q1(7, (defpackage.e) null);
                }
                return new f3();
            }
            return new f7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g3.class});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzd.size();
    }

    public final b6 x() {
        return this.zzd;
    }
}
