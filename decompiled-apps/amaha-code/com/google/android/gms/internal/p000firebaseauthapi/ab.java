package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ab  reason: invalid package */
/* loaded from: classes.dex */
public final class ab extends e1 implements c2 {
    private static final ab zzb;
    private String zzd = "";
    private h0 zze = h0.f7869v;
    private int zzf;

    static {
        ab abVar = new ab();
        zzb = abVar;
        e1.f(ab.class, abVar);
    }

    public static /* synthetic */ void B(ab abVar, String str) {
        str.getClass();
        abVar.zzd = str;
    }

    public static za v() {
        return (za) zzb.o();
    }

    public static ab x() {
        return zzb;
    }

    public final String A() {
        return this.zzd;
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
                    return new za(0);
                }
                return new ab();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int y() {
        int f = c.f(this.zzf);
        if (f == 0) {
            return 6;
        }
        return f;
    }

    public final h0 z() {
        return this.zze;
    }
}
