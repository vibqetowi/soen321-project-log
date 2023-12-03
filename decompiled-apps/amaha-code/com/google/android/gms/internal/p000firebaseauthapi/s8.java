package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s8 */
/* loaded from: classes.dex */
public final class s8 extends e1 implements c2 {
    private static final s8 zzb;
    private int zzd;
    private w8 zze;
    private h0 zzf = h0.f7869v;

    static {
        s8 s8Var = new s8();
        zzb = s8Var;
        e1.f(s8.class, s8Var);
    }

    public static /* synthetic */ void D(s8 s8Var, w8 w8Var) {
        w8Var.getClass();
        s8Var.zze = w8Var;
    }

    public static r8 w() {
        return (r8) zzb.o();
    }

    public static s8 y() {
        return zzb;
    }

    public static s8 z(h0 h0Var, r0 r0Var) {
        return (s8) e1.t(zzb, h0Var, r0Var);
    }

    public final w8 A() {
        w8 w8Var = this.zze;
        if (w8Var == null) {
            return w8.y();
        }
        return w8Var;
    }

    public final h0 B() {
        return this.zzf;
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
                    return new r8(0);
                }
                return new s8();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
