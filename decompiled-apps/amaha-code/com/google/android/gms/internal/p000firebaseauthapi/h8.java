package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h8 */
/* loaded from: classes.dex */
public final class h8 extends e1 implements c2 {
    private static final h8 zzb;
    private int zzd;
    private h0 zze = h0.f7869v;
    private l8 zzf;

    static {
        h8 h8Var = new h8();
        zzb = h8Var;
        e1.f(h8.class, h8Var);
    }

    public static /* synthetic */ void D(h8 h8Var, l8 l8Var) {
        l8Var.getClass();
        h8Var.zzf = l8Var;
    }

    public static g8 w() {
        return (g8) zzb.o();
    }

    public static h8 y(h0 h0Var, r0 r0Var) {
        return (h8) e1.t(zzb, h0Var, r0Var);
    }

    public final h0 A() {
        return this.zze;
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
                    return new g8(0);
                }
                return new h8();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }

    public final l8 z() {
        l8 l8Var = this.zzf;
        if (l8Var == null) {
            return l8.y();
        }
        return l8Var;
    }
}
