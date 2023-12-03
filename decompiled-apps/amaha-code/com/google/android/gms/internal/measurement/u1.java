package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class u1 extends w5 implements w6 {
    private static final u1 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private p1 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        u1 u1Var = new u1();
        zza = u1Var;
        w5.n(u1.class, u1Var);
    }

    public static t1 w() {
        return (t1) zza.q();
    }

    public static /* synthetic */ void z(u1 u1Var, String str) {
        u1Var.zzd |= 2;
        u1Var.zzf = str;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if ((this.zzd & 32) != 0) {
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
                    return new t1(0);
                }
                return new u1();
            }
            return new f7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zze;
    }

    public final p1 v() {
        p1 p1Var = this.zzg;
        if (p1Var == null) {
            return p1.v();
        }
        return p1Var;
    }

    public final String y() {
        return this.zzf;
    }
}
