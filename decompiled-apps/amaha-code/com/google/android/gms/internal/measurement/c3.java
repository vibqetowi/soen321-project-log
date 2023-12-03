package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class c3 extends w5 implements w6 {
    private static final c3 zza;
    private int zzd;
    private int zze;
    private a6 zzf = l6.f8456x;

    static {
        c3 c3Var = new c3();
        zza = c3Var;
        w5.n(c3.class, c3Var);
    }

    public static /* synthetic */ void A(c3 c3Var, int i6) {
        c3Var.zzd |= 1;
        c3Var.zze = i6;
    }

    public static void B(c3 c3Var, List list) {
        a6 a6Var = c3Var.zzf;
        if (!((s4) a6Var).f8591u) {
            c3Var.zzf = w5.i(a6Var);
        }
        r4.f(list, c3Var.zzf);
    }

    public static b3 x() {
        return (b3) zza.q();
    }

    public final boolean C() {
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
                    return new b3(0);
                }
                return new c3();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int u() {
        return ((l6) this.zzf).f8458w;
    }

    public final int v() {
        return this.zze;
    }

    public final long w(int i6) {
        l6 l6Var = (l6) this.zzf;
        l6Var.m(i6);
        return l6Var.f8457v[i6];
    }

    public final List z() {
        return this.zzf;
    }
}
