package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u8 */
/* loaded from: classes.dex */
public final class u8 extends e1 implements c2 {
    private static final u8 zzb;
    private w8 zzd;
    private int zze;

    static {
        u8 u8Var = new u8();
        zzb = u8Var;
        e1.f(u8.class, u8Var);
    }

    public static t8 w() {
        return (t8) zzb.o();
    }

    public static u8 y() {
        return zzb;
    }

    public static u8 z(h0 h0Var, r0 r0Var) {
        return (u8) e1.t(zzb, h0Var, r0Var);
    }

    public final w8 A() {
        w8 w8Var = this.zzd;
        if (w8Var == null) {
            return w8.y();
        }
        return w8Var;
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
                    return new t8(0);
                }
                return new u8();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }
}
