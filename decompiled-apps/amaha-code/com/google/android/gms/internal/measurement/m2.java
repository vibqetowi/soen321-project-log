package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class m2 extends w5 implements w6 {
    private static final m2 zza;
    private int zzd;
    private b6 zze = e7.f8360x;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        m2 m2Var = new m2();
        zza = m2Var;
        w5.n(m2.class, m2Var);
    }

    public static /* synthetic */ void D(m2 m2Var, int i6, q2 q2Var) {
        m2Var.O();
        m2Var.zze.set(i6, q2Var);
    }

    public static /* synthetic */ void E(m2 m2Var, q2 q2Var) {
        m2Var.O();
        m2Var.zze.add(q2Var);
    }

    public static /* synthetic */ void F(m2 m2Var, Iterable iterable) {
        m2Var.O();
        r4.f(iterable, m2Var.zze);
    }

    public static void G(m2 m2Var) {
        m2Var.zze = e7.f8360x;
    }

    public static /* synthetic */ void H(m2 m2Var, int i6) {
        m2Var.O();
        m2Var.zze.remove(i6);
    }

    public static /* synthetic */ void I(m2 m2Var, String str) {
        str.getClass();
        m2Var.zzd |= 1;
        m2Var.zzf = str;
    }

    public static /* synthetic */ void J(long j10, m2 m2Var) {
        m2Var.zzd |= 2;
        m2Var.zzg = j10;
    }

    public static /* synthetic */ void K(long j10, m2 m2Var) {
        m2Var.zzd |= 4;
        m2Var.zzh = j10;
    }

    public static l2 y() {
        return (l2) zza.q();
    }

    public final q2 A(int i6) {
        return (q2) this.zze.get(i6);
    }

    public final String B() {
        return this.zzf;
    }

    public final b6 C() {
        return this.zze;
    }

    public final boolean L() {
        if ((this.zzd & 8) != 0) {
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

    public final boolean N() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void O() {
        b6 b6Var = this.zze;
        if (!b6Var.c()) {
            this.zze = w5.j(b6Var);
        }
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
                    return new l2(0);
                }
                return new m2();
            }
            return new f7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", q2.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzi;
    }

    public final int v() {
        return this.zze.size();
    }

    public final long w() {
        return this.zzh;
    }

    public final long x() {
        return this.zzg;
    }
}
