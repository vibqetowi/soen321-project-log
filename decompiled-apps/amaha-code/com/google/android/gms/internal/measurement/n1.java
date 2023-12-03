package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class n1 extends w5 implements w6 {
    private static final n1 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private b6 zzg = e7.f8360x;
    private boolean zzh;
    private s1 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        n1 n1Var = new n1();
        zza = n1Var;
        w5.n(n1.class, n1Var);
    }

    public static /* synthetic */ void C(n1 n1Var, String str) {
        n1Var.zzd |= 2;
        n1Var.zzf = str;
    }

    public static /* synthetic */ void D(n1 n1Var, int i6, p1 p1Var) {
        b6 b6Var = n1Var.zzg;
        if (!b6Var.c()) {
            n1Var.zzg = w5.j(b6Var);
        }
        n1Var.zzg.set(i6, p1Var);
    }

    public static m1 w() {
        return (m1) zza.q();
    }

    public final String A() {
        return this.zzf;
    }

    public final b6 B() {
        return this.zzg;
    }

    public final boolean E() {
        return this.zzj;
    }

    public final boolean F() {
        return this.zzk;
    }

    public final boolean G() {
        return this.zzl;
    }

    public final boolean H() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        if ((this.zzd & 64) != 0) {
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
                    return new m1(0);
                }
                return new n1();
            }
            return new f7(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", p1.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzg.size();
    }

    public final int v() {
        return this.zze;
    }

    public final p1 y(int i6) {
        return (p1) this.zzg.get(i6);
    }

    public final s1 z() {
        s1 s1Var = this.zzi;
        if (s1Var == null) {
            return s1.v();
        }
        return s1Var;
    }
}
