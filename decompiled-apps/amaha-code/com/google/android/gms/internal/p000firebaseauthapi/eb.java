package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.eb  reason: invalid package */
/* loaded from: classes.dex */
public final class eb extends e1 implements c2 {
    private static final eb zzb;
    private ya zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        eb ebVar = new eb();
        zzb = ebVar;
        e1.f(eb.class, ebVar);
    }

    public static /* synthetic */ void A(eb ebVar, ya yaVar) {
        yaVar.getClass();
        ebVar.zzd = yaVar;
    }

    public static void F(eb ebVar) {
        ebVar.zze = 1;
    }

    public static db x() {
        return (db) zzb.o();
    }

    public final boolean D() {
        if (this.zzd != null) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i6 = this.zze;
        int i10 = 2;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i10 = 0;
                    } else {
                        i10 = 5;
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
                    return new db(0);
                }
                return new eb();
            }
            return new l2(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int v() {
        return this.zzf;
    }

    public final ya w() {
        ya yaVar = this.zzd;
        if (yaVar == null) {
            return ya.y();
        }
        return yaVar;
    }

    public final int z() {
        int f = c.f(this.zzg);
        if (f == 0) {
            return 6;
        }
        return f;
    }
}
