package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ya  reason: invalid package */
/* loaded from: classes.dex */
public final class ya extends e1 implements c2 {
    private static final ya zzb;
    private String zzd = "";
    private h0 zze = h0.f7869v;
    private int zzf;

    static {
        ya yaVar = new ya();
        zzb = yaVar;
        e1.f(ya.class, yaVar);
    }

    public static void D(ya yaVar, int i6) {
        if (i6 != 6) {
            yaVar.zzf = b.c(i6);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static xa v() {
        return (xa) zzb.o();
    }

    public static ya y() {
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
                    return new xa(0);
                }
                return new ya();
            }
            return new l2(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int w() {
        int i6 = this.zzf;
        int i10 = 1;
        if (i6 != 0) {
            if (i6 != 1) {
                i10 = 3;
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            i10 = 0;
                        } else {
                            i10 = 5;
                        }
                    } else {
                        i10 = 4;
                    }
                }
            } else {
                i10 = 2;
            }
        }
        if (i10 == 0) {
            return 6;
        }
        return i10;
    }

    public final h0 z() {
        return this.zze;
    }
}
