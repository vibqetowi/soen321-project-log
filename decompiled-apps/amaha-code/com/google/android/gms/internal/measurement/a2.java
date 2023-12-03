package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a2 extends w5 implements w6 {
    private static final a2 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        a2 a2Var = new a2();
        zza = a2Var;
        w5.n(a2.class, a2Var);
    }

    public static /* synthetic */ void x(a2 a2Var, String str) {
        str.getClass();
        a2Var.zzd |= 1;
        a2Var.zze = str;
    }

    public final boolean A() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.zzd & 8) != 0) {
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
                    return new z1(0);
                }
                return new a2();
            }
            return new f7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zzh;
    }

    public final String w() {
        return this.zze;
    }

    public final boolean y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzg;
    }
}
