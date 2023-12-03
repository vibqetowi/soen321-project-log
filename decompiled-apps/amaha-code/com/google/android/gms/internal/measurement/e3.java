package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class e3 extends w5 implements w6 {
    private static final e3 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        e3 e3Var = new e3();
        zza = e3Var;
        w5.n(e3.class, e3Var);
    }

    public static /* synthetic */ void B(e3 e3Var, long j10) {
        e3Var.zzd |= 1;
        e3Var.zze = j10;
    }

    public static /* synthetic */ void C(e3 e3Var, String str) {
        str.getClass();
        e3Var.zzd |= 2;
        e3Var.zzf = str;
    }

    public static /* synthetic */ void D(e3 e3Var, String str) {
        str.getClass();
        e3Var.zzd |= 4;
        e3Var.zzg = str;
    }

    public static /* synthetic */ void E(e3 e3Var) {
        e3Var.zzd &= -5;
        e3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void F(e3 e3Var, long j10) {
        e3Var.zzd |= 8;
        e3Var.zzh = j10;
    }

    public static /* synthetic */ void G(e3 e3Var) {
        e3Var.zzd &= -9;
        e3Var.zzh = 0L;
    }

    public static /* synthetic */ void H(e3 e3Var, double d10) {
        e3Var.zzd |= 32;
        e3Var.zzj = d10;
    }

    public static /* synthetic */ void I(e3 e3Var) {
        e3Var.zzd &= -33;
        e3Var.zzj = 0.0d;
    }

    public static d3 x() {
        return (d3) zza.q();
    }

    public final String A() {
        return this.zzg;
    }

    public final boolean J() {
        if ((this.zzd & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
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
                    return new d3(0);
                }
                return new e3();
            }
            return new f7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double u() {
        return this.zzj;
    }

    public final long v() {
        return this.zzh;
    }

    public final long w() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
