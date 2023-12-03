package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ga */
/* loaded from: classes.dex */
public final class ga extends e1 implements c2 {
    private static final ga zzb;
    private int zzd;
    private int zze;
    private h0 zzf = h0.f7869v;

    static {
        ga gaVar = new ga();
        zzb = gaVar;
        e1.f(ga.class, gaVar);
    }

    public static void C(ga gaVar) {
        gaVar.zzd = 2;
    }

    public static fa v() {
        return (fa) zzb.o();
    }

    public static ga x() {
        return zzb;
    }

    public final int A() {
        int i6 = this.zzd;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            i10 = 0;
                        } else {
                            i10 = 7;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int B() {
        int i6 = this.zze;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    i10 = 5;
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                i10 = 0;
                            } else {
                                i10 = 7;
                            }
                        } else {
                            i10 = 6;
                        }
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 3;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e1
    public final Object m(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fa(0);
                }
                return new ga();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final h0 y() {
        return this.zzf;
    }
}
