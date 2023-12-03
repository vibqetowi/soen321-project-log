package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import kotlin.jvm.internal.b0;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s4  reason: invalid package */
/* loaded from: classes.dex */
public final class s4 extends p6 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(int i6) {
        super(ka.class, new q4(15, d4.class));
        this.f8124d = i6;
        switch (i6) {
            case 1:
                super(s8.class, new q4(1, gc.class));
                return;
            case 2:
                super(y8.class, new q4(2, m3.class));
                return;
            case 3:
                super(e9.class, new q4(3, m3.class));
                return;
            case 4:
                super(j9.class, new q4(4, m3.class));
                return;
            case 5:
                super(r9.class, new q4(5, m3.class));
                return;
            case 6:
                super(lb.class, new q4(6, m3.class));
                return;
            case 7:
                super(ob.class, new q4(7, m3.class));
                return;
            case 8:
                super(sb.class, new q4(8, m3.class));
                return;
            case 9:
                super(ea.class, new q4(11, p3.class));
                return;
            case 10:
                super(wa.class, new q4(13, p3.class));
                return;
            case 11:
                super(h8.class, new q4(14, d4.class));
                return;
            case 12:
                return;
            default:
                super(n8.class, new q4(0, m3.class));
                return;
        }
    }

    public static n6 h(int i6, int i10) {
        z8 w10 = a9.w();
        w10.e();
        ((a9) w10.f7723v).zze = i6;
        b9 w11 = c9.w();
        w11.e();
        ((c9) w11.f7723v).zzd = 16;
        w10.e();
        ((a9) w10.f7723v).zzd = (c9) w11.c();
        return new n6(i10, (a9) w10.c());
    }

    public static n6 i(int i6, int i10, int i11) {
        t8 w10 = u8.w();
        v8 w11 = w8.w();
        w11.e();
        ((w8) w11.f7723v).zzd = 16;
        w10.e();
        ((u8) w10.f7723v).zzd = (w8) w11.c();
        w10.e();
        ((u8) w10.f7723v).zze = i6;
        la w12 = ma.w();
        na w13 = oa.w();
        w13.e();
        ((oa) w13.f7723v).zzd = b0.v(5);
        w13.e();
        ((oa) w13.f7723v).zze = i10;
        w12.e();
        ((ma) w12.f7723v).zzd = (oa) w13.c();
        w12.e();
        ((ma) w12.f7723v).zze = 32;
        o8 v10 = p8.v();
        v10.e();
        ((p8) v10.f7723v).zzd = (u8) w10.c();
        v10.e();
        ((p8) v10.f7723v).zze = (ma) w12.c();
        return new n6(i11, (p8) v10.c());
    }

    public static n6 j(int i6, int i10) {
        f9 w10 = g9.w();
        w10.e();
        ((g9) w10.f7723v).zzd = i6;
        return new n6(i10, (g9) w10.c());
    }

    public static n6 k(int i6, int i10) {
        k9 w10 = l9.w();
        w10.e();
        ((l9) w10.f7723v).zzd = i6;
        return new n6(i10, (l9) w10.c());
    }

    public static final void l(ka kaVar) {
        mc.c(kaVar.v());
        if (kaVar.B().m() >= 16) {
            o(kaVar.A());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static n6 m(int i6, int i10, int i11, int i12) {
        la w10 = ma.w();
        na w11 = oa.w();
        w11.e();
        ((oa) w11.f7723v).zzd = b0.v(i11);
        w11.e();
        ((oa) w11.f7723v).zze = i10;
        w10.e();
        ((ma) w10.f7723v).zzd = (oa) w11.c();
        w10.e();
        ((ma) w10.f7723v).zze = i6;
        return new n6(i12, (ma) w10.c());
    }

    public static void n(l8 l8Var) {
        if (l8Var.v() >= 10) {
            if (l8Var.v() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void o(oa oaVar) {
        if (oaVar.v() >= 10) {
            int A = oaVar.A() - 2;
            if (A != 1) {
                if (A != 2) {
                    if (A != 3) {
                        if (A != 4) {
                            if (A == 5) {
                                if (oaVar.v() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (oaVar.v() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (oaVar.v() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (oaVar.v() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (oaVar.v() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final o6 a() {
        switch (this.f8124d) {
            case 0:
                return new r4(p8.class, 0);
            case 1:
                return new t4(this);
            case 2:
                return new r4(a9.class, 1);
            case 3:
                return new r4(g9.class, 2);
            case 4:
                return new r4(l9.class, 3);
            case 5:
                return new r4(t9.class, 4);
            case 6:
                return new r4(mb.class, 5);
            case 7:
                return new r4(pb.class, 6);
            case 8:
                return new r4(tb.class, 7);
            case 9:
            case 10:
            default:
                throw new UnsupportedOperationException("Creating keys is not supported.");
            case 11:
                return new l7();
            case 12:
                return new r4(ma.class, 10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final int b() {
        switch (this.f8124d) {
            case 6:
            case 7:
                return 5;
            case 8:
            default:
                return 2;
            case 9:
            case 10:
                return 4;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final b2 c(h0 h0Var) {
        switch (this.f8124d) {
            case 0:
                return n8.y(h0Var, r0.f8101b);
            case 1:
                return s8.z(h0Var, r0.f8101b);
            case 2:
                return y8.y(h0Var, r0.f8101b);
            case 3:
                return e9.y(h0Var, r0.f8101b);
            case 4:
                return j9.y(h0Var, r0.f8101b);
            case 5:
                return r9.y(h0Var, r0.f8101b);
            case 6:
                return lb.y(h0Var, r0.f8101b);
            case 7:
                return ob.y(h0Var, r0.f8101b);
            case 8:
                return sb.y(h0Var, r0.f8101b);
            case 9:
                return ea.A(h0Var, r0.f8101b);
            case 10:
                return wa.A(h0Var, r0.f8101b);
            case 11:
                return h8.y(h0Var, r0.f8101b);
            default:
                return ka.z(h0Var, r0.f8101b);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final String d() {
        switch (this.f8124d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            case 9:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
            case 10:
                return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
            case 11:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final void e(b2 b2Var) {
        switch (this.f8124d) {
            case 0:
                n8 n8Var = (n8) b2Var;
                mc.c(n8Var.v());
                new s4(1);
                s8 z10 = n8Var.z();
                mc.c(z10.v());
                mc.b(z10.B().m());
                w8 A = z10.A();
                if (A.v() >= 12 && A.v() <= 16) {
                    new s4(12);
                    l(n8Var.A());
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                s8 s8Var = (s8) b2Var;
                mc.c(s8Var.v());
                mc.b(s8Var.B().m());
                w8 A2 = s8Var.A();
                if (A2.v() >= 12 && A2.v() <= 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 2:
                y8 y8Var = (y8) b2Var;
                mc.c(y8Var.v());
                mc.b(y8Var.A().m());
                if (y8Var.z().v() != 12 && y8Var.z().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                e9 e9Var = (e9) b2Var;
                mc.c(e9Var.v());
                mc.b(e9Var.z().m());
                return;
            case 4:
                j9 j9Var = (j9) b2Var;
                mc.c(j9Var.v());
                mc.b(j9Var.z().m());
                return;
            case 5:
                r9 r9Var = (r9) b2Var;
                mc.c(r9Var.v());
                if (r9Var.z().m() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            case 6:
                mc.c(((lb) b2Var).v());
                return;
            case 7:
                mc.c(((ob) b2Var).v());
                return;
            case 8:
                sb sbVar = (sb) b2Var;
                mc.c(sbVar.v());
                if (sbVar.z().m() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
            case 9:
                ea eaVar = (ea) b2Var;
                mc.c(eaVar.v());
                o5.a(eaVar.w());
                return;
            case 10:
                wa waVar = (wa) b2Var;
                mc.c(waVar.v());
                if (waVar.F()) {
                    z5.a(waVar.w());
                    return;
                }
                throw new GeneralSecurityException("Missing HPKE key params.");
            case 11:
                h8 h8Var = (h8) b2Var;
                mc.c(h8Var.v());
                if (h8Var.A().m() == 32) {
                    n(h8Var.z());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                l((ka) b2Var);
                return;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p6
    public final int f() {
        switch (this.f8124d) {
            case 0:
            case 3:
            case 12:
                return 2;
            default:
                return 1;
        }
    }
}
