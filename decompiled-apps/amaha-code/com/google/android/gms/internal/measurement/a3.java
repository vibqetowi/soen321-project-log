package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a3 extends w5 implements w6 {
    private static final a3 zza;
    private a6 zzd;
    private a6 zze;
    private b6 zzf;
    private b6 zzg;

    static {
        a3 a3Var = new a3();
        zza = a3Var;
        w5.n(a3.class, a3Var);
    }

    public a3() {
        l6 l6Var = l6.f8456x;
        this.zzd = l6Var;
        this.zze = l6Var;
        e7 e7Var = e7.f8360x;
        this.zzf = e7Var;
        this.zzg = e7Var;
    }

    public static a3 B() {
        return zza;
    }

    public static void H(a3 a3Var, List list) {
        a6 a6Var = a3Var.zzd;
        if (!((s4) a6Var).f8591u) {
            a3Var.zzd = w5.i(a6Var);
        }
        r4.f(list, a3Var.zzd);
    }

    public static void I(a3 a3Var) {
        a3Var.zzd = l6.f8456x;
    }

    public static void J(a3 a3Var, List list) {
        a6 a6Var = a3Var.zze;
        if (!((s4) a6Var).f8591u) {
            a3Var.zze = w5.i(a6Var);
        }
        r4.f(list, a3Var.zze);
    }

    public static void K(a3 a3Var) {
        a3Var.zze = l6.f8456x;
    }

    public static /* synthetic */ void L(a3 a3Var, ArrayList arrayList) {
        a3Var.R();
        r4.f(arrayList, a3Var.zzf);
    }

    public static void M(a3 a3Var) {
        a3Var.zzf = e7.f8360x;
    }

    public static /* synthetic */ void N(a3 a3Var, int i6) {
        a3Var.R();
        a3Var.zzf.remove(i6);
    }

    public static void O(a3 a3Var, List list) {
        b6 b6Var = a3Var.zzg;
        if (!b6Var.c()) {
            a3Var.zzg = w5.j(b6Var);
        }
        r4.f(list, a3Var.zzg);
    }

    public static void P(a3 a3Var) {
        a3Var.zzg = e7.f8360x;
    }

    public static void Q(a3 a3Var, int i6) {
        b6 b6Var = a3Var.zzg;
        if (!b6Var.c()) {
            a3Var.zzg = w5.j(b6Var);
        }
        a3Var.zzg.remove(i6);
    }

    public static z2 z() {
        return (z2) zza.q();
    }

    public final c3 C(int i6) {
        return (c3) this.zzg.get(i6);
    }

    public final b6 D() {
        return this.zzf;
    }

    public final List E() {
        return this.zze;
    }

    public final b6 F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzd;
    }

    public final void R() {
        b6 b6Var = this.zzf;
        if (!b6Var.c()) {
            this.zzf = w5.j(b6Var);
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
                    return new z2(0);
                }
                return new a3();
            }
            return new f7(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", k2.class, "zzg", c3.class});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final int v() {
        return ((l6) this.zze).f8458w;
    }

    public final int w() {
        return this.zzg.size();
    }

    public final int x() {
        return ((l6) this.zzd).f8458w;
    }

    public final k2 y(int i6) {
        return (k2) this.zzf.get(i6);
    }
}
