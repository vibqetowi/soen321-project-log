package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class w1 extends w5 implements w6 {
    private static final w1 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private b6 zzh = e7.f8360x;

    static {
        w1 w1Var = new w1();
        zza = w1Var;
        w5.n(w1.class, w1Var);
    }

    public static /* synthetic */ w1 v() {
        return zza;
    }

    public static w1 w() {
        return zza;
    }

    public final boolean A() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int D() {
        int E1 = ca.a.E1(this.zze);
        if (E1 == 0) {
            return 1;
        }
        return E1;
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
                    return new q1(1);
                }
                return new w1();
            }
            return new f7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", v1.f8630a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final String x() {
        return this.zzf;
    }

    public final b6 y() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzg;
    }
}
