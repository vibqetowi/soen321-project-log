package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class l1 extends w5 implements w6 {
    private static final l1 zza;
    private int zzd;
    private int zze;
    private b6 zzf;
    private b6 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        l1 l1Var = new l1();
        zza = l1Var;
        w5.n(l1.class, l1Var);
    }

    public l1() {
        e7 e7Var = e7.f8360x;
        this.zzf = e7Var;
        this.zzg = e7Var;
    }

    public static /* synthetic */ void C(l1 l1Var, int i6, u1 u1Var) {
        b6 b6Var = l1Var.zzf;
        if (!b6Var.c()) {
            l1Var.zzf = w5.j(b6Var);
        }
        l1Var.zzf.set(i6, u1Var);
    }

    public static /* synthetic */ void D(l1 l1Var, int i6, n1 n1Var) {
        b6 b6Var = l1Var.zzg;
        if (!b6Var.c()) {
            l1Var.zzg = w5.j(b6Var);
        }
        l1Var.zzg.set(i6, n1Var);
    }

    public final List A() {
        return this.zzg;
    }

    public final b6 B() {
        return this.zzf;
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
                    return new k1(0);
                }
                return new l1();
            }
            return new f7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", u1.class, "zzg", n1.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zze;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int w() {
        return this.zzf.size();
    }

    public final n1 y(int i6) {
        return (n1) this.zzg.get(i6);
    }

    public final u1 z(int i6) {
        return (u1) this.zzf.get(i6);
    }
}
