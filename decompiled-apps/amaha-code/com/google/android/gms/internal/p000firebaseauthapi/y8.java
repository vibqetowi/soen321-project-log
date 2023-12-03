package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y8 */
/* loaded from: classes.dex */
public final class y8 extends e1 implements c2 {
    private static final y8 zzb;
    private int zzd;
    private c9 zze;
    private h0 zzf = h0.f7869v;

    static {
        y8 y8Var = new y8();
        zzb = y8Var;
        e1.f(y8.class, y8Var);
    }

    public static /* synthetic */ void C(y8 y8Var, c9 c9Var) {
        c9Var.getClass();
        y8Var.zze = c9Var;
    }

    public static x8 w() {
        return (x8) zzb.o();
    }

    public static y8 y(h0 h0Var, r0 r0Var) {
        return (y8) e1.t(zzb, h0Var, r0Var);
    }

    public final h0 A() {
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
                    return new x8(0);
                }
                return new y8();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final c9 z() {
        c9 c9Var = this.zze;
        if (c9Var == null) {
            return c9.y();
        }
        return c9Var;
    }
}
