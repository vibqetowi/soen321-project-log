package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fb */
/* loaded from: classes.dex */
public final class fb extends e1 implements c2 {
    private static final fb zzb;
    private int zzd;
    private h1 zze = k2.f7933x;

    static {
        fb fbVar = new fb();
        zzb = fbVar;
        e1.f(fb.class, fbVar);
    }

    public static fb A(byte[] bArr, r0 r0Var) {
        return (fb) e1.u(zzb, bArr, r0Var);
    }

    public static void D(fb fbVar, eb ebVar) {
        int i6;
        h1 h1Var = fbVar.zze;
        if (!h1Var.c()) {
            int size = h1Var.size();
            if (size == 0) {
                i6 = 10;
            } else {
                i6 = size + size;
            }
            fbVar.zze = h1Var.k(i6);
        }
        fbVar.zze.add(ebVar);
    }

    public static cb x() {
        return (cb) zzb.o();
    }

    public final h1 B() {
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
                    return new cb(0);
                }
                return new fb();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", eb.class});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze.size();
    }

    public final int w() {
        return this.zzd;
    }

    public final eb y(int i6) {
        return (eb) this.zze.get(i6);
    }
}
