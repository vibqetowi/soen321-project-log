package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class t2 extends w5 implements w6 {
    private static final t2 zza;
    private b6 zzd = e7.f8360x;

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        w5.n(t2.class, t2Var);
    }

    public static s2 u() {
        return (s2) zza.q();
    }

    public static /* synthetic */ void y(t2 t2Var, v2 v2Var) {
        b6 b6Var = t2Var.zzd;
        if (!b6Var.c()) {
            t2Var.zzd = w5.j(b6Var);
        }
        t2Var.zzd.add(v2Var);
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
                    return new s2(0);
                }
                return new t2();
            }
            return new f7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", v2.class});
        }
        return (byte) 1;
    }

    public final v2 w() {
        return (v2) this.zzd.get(0);
    }

    public final b6 x() {
        return this.zzd;
    }
}
