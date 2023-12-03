package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jb */
/* loaded from: classes.dex */
public final class jb extends e1 implements c2 {
    private static final jb zzb;
    private int zzd;
    private h1 zze = k2.f7933x;

    static {
        jb jbVar = new jb();
        zzb = jbVar;
        e1.f(jb.class, jbVar);
    }

    public static gb v() {
        return (gb) zzb.o();
    }

    public static void z(jb jbVar, ib ibVar) {
        int i6;
        h1 h1Var = jbVar.zze;
        if (!h1Var.c()) {
            int size = h1Var.size();
            if (size == 0) {
                i6 = 10;
            } else {
                i6 = size + size;
            }
            jbVar.zze = h1Var.k(i6);
        }
        jbVar.zze.add(ibVar);
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
                    return new gb(0);
                }
                return new jb();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", ib.class});
        }
        return (byte) 1;
    }

    public final ib w() {
        return (ib) this.zze.get(0);
    }
}
