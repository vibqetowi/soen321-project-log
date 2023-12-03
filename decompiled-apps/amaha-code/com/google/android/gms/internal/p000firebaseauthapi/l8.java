package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l8 */
/* loaded from: classes.dex */
public final class l8 extends e1 implements c2 {
    private static final l8 zzb;
    private int zzd;

    static {
        l8 l8Var = new l8();
        zzb = l8Var;
        e1.f(l8.class, l8Var);
    }

    public static k8 w() {
        return (k8) zzb.o();
    }

    public static l8 y() {
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
                    return new k8(0);
                }
                return new l8();
            }
            return new l2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzd;
    }
}
