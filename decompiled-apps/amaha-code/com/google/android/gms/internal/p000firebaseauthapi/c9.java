package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c9 */
/* loaded from: classes.dex */
public final class c9 extends e1 implements c2 {
    private static final c9 zzb;
    private int zzd;

    static {
        c9 c9Var = new c9();
        zzb = c9Var;
        e1.f(c9.class, c9Var);
    }

    public static b9 w() {
        return (b9) zzb.o();
    }

    public static c9 y() {
        return zzb;
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
                    return new b9(0);
                }
                return new c9();
            }
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
