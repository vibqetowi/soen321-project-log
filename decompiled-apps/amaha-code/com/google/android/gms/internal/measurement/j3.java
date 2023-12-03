package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class j3 extends w5 implements w6 {
    private static final j3 zza;
    private int zzd;
    private int zze;
    private b6 zzf = e7.f8360x;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        j3 j3Var = new j3();
        zza = j3Var;
        w5.n(j3.class, j3Var);
    }

    public final boolean A() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }

    public final int D() {
        int i6;
        int i10 = this.zze;
        if (i10 != 0) {
            i6 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i6 = 4;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            i6 = 0;
                        } else {
                            i6 = 5;
                        }
                    }
                } else {
                    i6 = 3;
                }
            }
        } else {
            i6 = 1;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
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
                    return new q1(10, (defpackage.e) null);
                }
                return new j3();
            }
            return new f7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", i3.f8422a, "zzf", j3.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double u() {
        return this.zzj;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }

    public final b6 y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzi;
    }
}
