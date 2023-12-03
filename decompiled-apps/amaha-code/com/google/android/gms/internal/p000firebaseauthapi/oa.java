package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oa */
/* loaded from: classes.dex */
public final class oa extends e1 implements c2 {
    private static final oa zzb;
    private int zzd;
    private int zze;

    static {
        oa oaVar = new oa();
        zzb = oaVar;
        e1.f(oa.class, oaVar);
    }

    public static na w() {
        return (na) zzb.o();
    }

    public static oa y() {
        return zzb;
    }

    public final int A() {
        int i6 = this.zzd;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    i10 = 5;
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                i10 = 0;
                            } else {
                                i10 = 7;
                            }
                        } else {
                            i10 = 6;
                        }
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 3;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
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
                    return new na(0);
                }
                return new oa();
            }
            return new l2(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zze;
    }
}
