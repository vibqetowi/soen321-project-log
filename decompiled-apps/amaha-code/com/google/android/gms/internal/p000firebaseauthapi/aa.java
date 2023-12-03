package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.aa */
/* loaded from: classes.dex */
public final class aa extends e1 implements c2 {
    private static final aa zzb;
    private ga zzd;
    private v9 zze;
    private int zzf;

    static {
        aa aaVar = new aa();
        zzb = aaVar;
        e1.f(aa.class, aaVar);
    }

    public static void D(aa aaVar, int i6) {
        if (i6 != 1) {
            aaVar.zzf = i6 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static y9 w() {
        return (y9) zzb.o();
    }

    public static aa y() {
        return zzb;
    }

    public final int C() {
        int i6 = this.zzf;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i10 = 0;
                    } else {
                        i10 = 5;
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
                    return new y9(0);
                }
                return new aa();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final v9 v() {
        v9 v9Var = this.zze;
        if (v9Var == null) {
            return v9.x();
        }
        return v9Var;
    }

    public final ga z() {
        ga gaVar = this.zzd;
        if (gaVar == null) {
            return ga.x();
        }
        return gaVar;
    }
}
