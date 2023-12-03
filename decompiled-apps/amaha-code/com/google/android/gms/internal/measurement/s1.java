package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class s1 extends w5 implements w6 {
    private static final s1 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        s1 s1Var = new s1();
        zza = s1Var;
        w5.n(s1.class, s1Var);
    }

    public static /* synthetic */ s1 u() {
        return zza;
    }

    public static s1 v() {
        return zza;
    }

    public final boolean A() {
        if ((this.zzd & 1) != 0) {
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
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int F() {
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
                    return new q1(0);
                }
                return new s1();
            }
            return new f7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", r1.f8577a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzi;
    }

    public final String y() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzf;
    }
}
