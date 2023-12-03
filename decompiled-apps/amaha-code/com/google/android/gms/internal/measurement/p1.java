package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class p1 extends w5 implements w6 {
    private static final p1 zza;
    private int zzd;
    private w1 zze;
    private s1 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        p1 p1Var = new p1();
        zza = p1Var;
        w5.n(p1.class, p1Var);
    }

    public static p1 v() {
        return zza;
    }

    public static /* synthetic */ void z(p1 p1Var, String str) {
        p1Var.zzd |= 8;
        p1Var.zzh = str;
    }

    public final boolean A() {
        return this.zzg;
    }

    public final boolean B() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if ((this.zzd & 1) != 0) {
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
                    return new o1(0);
                }
                return new p1();
            }
            return new f7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final s1 w() {
        s1 s1Var = this.zzf;
        if (s1Var == null) {
            return s1.v();
        }
        return s1Var;
    }

    public final w1 x() {
        w1 w1Var = this.zze;
        if (w1Var == null) {
            return w1.w();
        }
        return w1Var;
    }

    public final String y() {
        return this.zzh;
    }
}
