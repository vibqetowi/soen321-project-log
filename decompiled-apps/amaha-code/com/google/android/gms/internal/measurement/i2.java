package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class i2 extends w5 implements w6 {
    private static final i2 zza;
    private int zzd;
    private int zze;
    private a3 zzf;
    private a3 zzg;
    private boolean zzh;

    static {
        i2 i2Var = new i2();
        zza = i2Var;
        w5.n(i2.class, i2Var);
    }

    public static /* synthetic */ void A(i2 i2Var, a3 a3Var) {
        i2Var.zzf = a3Var;
        i2Var.zzd |= 2;
    }

    public static /* synthetic */ void B(i2 i2Var, a3 a3Var) {
        i2Var.zzg = a3Var;
        i2Var.zzd |= 4;
    }

    public static /* synthetic */ void C(i2 i2Var, boolean z10) {
        i2Var.zzd |= 8;
        i2Var.zzh = z10;
    }

    public static h2 v() {
        return (h2) zza.q();
    }

    public static /* synthetic */ void z(i2 i2Var, int i6) {
        i2Var.zzd |= 1;
        i2Var.zze = i6;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final boolean E() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
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
                    return new h2(0);
                }
                return new i2();
            }
            return new f7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zze;
    }

    public final a3 x() {
        a3 a3Var = this.zzf;
        if (a3Var == null) {
            return a3.B();
        }
        return a3Var;
    }

    public final a3 y() {
        a3 a3Var = this.zzg;
        if (a3Var == null) {
            return a3.B();
        }
        return a3Var;
    }
}
