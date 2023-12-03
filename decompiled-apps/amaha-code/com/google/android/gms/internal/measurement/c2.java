package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class c2 extends w5 implements w6 {
    private static final c2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private b6 zzh;
    private b6 zzi;
    private b6 zzj;
    private String zzk;
    private boolean zzl;
    private b6 zzm;
    private b6 zzn;
    private String zzo;

    static {
        c2 c2Var = new c2();
        zza = c2Var;
        w5.n(c2.class, c2Var);
    }

    public c2() {
        e7 e7Var = e7.f8360x;
        this.zzh = e7Var;
        this.zzi = e7Var;
        this.zzj = e7Var;
        this.zzk = "";
        this.zzm = e7Var;
        this.zzn = e7Var;
        this.zzo = "";
    }

    public static c2 A() {
        return zza;
    }

    public static /* synthetic */ void H(c2 c2Var, int i6, a2 a2Var) {
        b6 b6Var = c2Var.zzi;
        if (!b6Var.c()) {
            c2Var.zzi = w5.j(b6Var);
        }
        c2Var.zzi.set(i6, a2Var);
    }

    public static void I(c2 c2Var) {
        c2Var.zzj = e7.f8360x;
    }

    public static b2 y() {
        return (b2) zza.q();
    }

    public final String B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzo;
    }

    public final b6 D() {
        return this.zzj;
    }

    public final List E() {
        return this.zzn;
    }

    public final b6 F() {
        return this.zzm;
    }

    public final List G() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzl;
    }

    public final boolean K() {
        if ((this.zzd & 2) != 0) {
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
                    return new b2(0);
                }
                return new c2();
            }
            return new f7(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", e2.class, "zzi", a2.class, "zzj", l1.class, "zzk", "zzl", "zzm", h3.class, "zzn", y1.class, "zzo"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzm.size();
    }

    public final int v() {
        return this.zzi.size();
    }

    public final long w() {
        return this.zze;
    }

    public final a2 x(int i6) {
        return (a2) this.zzi.get(i6);
    }
}
