package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class k2 extends w5 implements w6 {
    private static final k2 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        k2 k2Var = new k2();
        zza = k2Var;
        w5.n(k2.class, k2Var);
    }

    public static j2 w() {
        return (j2) zza.q();
    }

    public static /* synthetic */ void y(k2 k2Var, int i6) {
        k2Var.zzd |= 1;
        k2Var.zze = i6;
    }

    public static /* synthetic */ void z(k2 k2Var, long j10) {
        k2Var.zzd |= 2;
        k2Var.zzf = j10;
    }

    public final boolean A() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
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
                    return new j2(0);
                }
                return new k2();
            }
            return new f7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int u() {
        return this.zze;
    }

    public final long v() {
        return this.zzf;
    }
}
