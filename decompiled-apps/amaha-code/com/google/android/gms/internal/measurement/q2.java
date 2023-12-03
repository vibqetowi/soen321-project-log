package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class q2 extends w5 implements w6 {
    private static final q2 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private b6 zzj = e7.f8360x;

    static {
        q2 q2Var = new q2();
        zza = q2Var;
        w5.n(q2.class, q2Var);
    }

    public static /* synthetic */ void D(q2 q2Var, String str) {
        str.getClass();
        q2Var.zzd |= 1;
        q2Var.zze = str;
    }

    public static /* synthetic */ void E(q2 q2Var, String str) {
        str.getClass();
        q2Var.zzd |= 2;
        q2Var.zzf = str;
    }

    public static /* synthetic */ void F(q2 q2Var) {
        q2Var.zzd &= -3;
        q2Var.zzf = zza.zzf;
    }

    public static /* synthetic */ void G(q2 q2Var, long j10) {
        q2Var.zzd |= 4;
        q2Var.zzg = j10;
    }

    public static /* synthetic */ void H(q2 q2Var) {
        q2Var.zzd &= -5;
        q2Var.zzg = 0L;
    }

    public static /* synthetic */ void I(q2 q2Var, double d10) {
        q2Var.zzd |= 16;
        q2Var.zzi = d10;
    }

    public static /* synthetic */ void J(q2 q2Var) {
        q2Var.zzd &= -17;
        q2Var.zzi = 0.0d;
    }

    public static void K(q2 q2Var, q2 q2Var2) {
        b6 b6Var = q2Var.zzj;
        if (!b6Var.c()) {
            q2Var.zzj = w5.j(b6Var);
        }
        q2Var.zzj.add(q2Var2);
    }

    public static void L(q2 q2Var, ArrayList arrayList) {
        b6 b6Var = q2Var.zzj;
        if (!b6Var.c()) {
            q2Var.zzj = w5.j(b6Var);
        }
        r4.f(arrayList, q2Var.zzj);
    }

    public static void M(q2 q2Var) {
        q2Var.zzj = e7.f8360x;
    }

    public static p2 y() {
        return (p2) zza.q();
    }

    public final String A() {
        return this.zze;
    }

    public final String B() {
        return this.zzf;
    }

    public final b6 C() {
        return this.zzj;
    }

    public final boolean N() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zzd & 2) != 0) {
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
                    return new p2(0);
                }
                return new q2();
            }
            return new f7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", q2.class});
        }
        return (byte) 1;
    }

    public final double u() {
        return this.zzi;
    }

    public final float v() {
        return this.zzh;
    }

    public final int w() {
        return this.zzj.size();
    }

    public final long x() {
        return this.zzg;
    }
}
