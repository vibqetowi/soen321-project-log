package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r4  reason: invalid package */
/* loaded from: classes.dex */
public final class r4 extends o6 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4(Class cls, int i6) {
        super(cls);
        this.f8105b = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 a(b2 b2Var) {
        byte[] a10;
        byte[] I;
        switch (this.f8105b) {
            case 0:
                p8 p8Var = (p8) b2Var;
                new s4(1);
                s8 e10 = t4.e(p8Var.y());
                b2 a11 = new s4(12).a().a(p8Var.z());
                m8 w10 = n8.w();
                w10.e();
                ((n8) w10.f7723v).zze = e10;
                w10.e();
                n8.D((n8) w10.f7723v, (ka) a11);
                w10.e();
                ((n8) w10.f7723v).zzd = 0;
                return (n8) w10.c();
            case 1:
                a9 a9Var = (a9) b2Var;
                x8 w11 = y8.w();
                byte[] a12 = kc.a(a9Var.v());
                g0 J = h0.J(0, a12, a12.length);
                w11.e();
                ((y8) w11.f7723v).zzf = J;
                c9 z10 = a9Var.z();
                w11.e();
                y8.C((y8) w11.f7723v, z10);
                w11.e();
                ((y8) w11.f7723v).zzd = 0;
                return (y8) w11.c();
            case 2:
                d9 w12 = e9.w();
                byte[] a13 = kc.a(((g9) b2Var).v());
                g0 J2 = h0.J(0, a13, a13.length);
                w12.e();
                ((e9) w12.f7723v).zze = J2;
                w12.e();
                ((e9) w12.f7723v).zzd = 0;
                return (e9) w12.c();
            case 3:
                h9 w13 = j9.w();
                byte[] a14 = kc.a(((l9) b2Var).v());
                g0 J3 = h0.J(0, a14, a14.length);
                w13.e();
                ((j9) w13.f7723v).zze = J3;
                w13.e();
                ((j9) w13.f7723v).zzd = 0;
                return (j9) w13.c();
            case 4:
                t9 t9Var = (t9) b2Var;
                q9 w14 = r9.w();
                w14.e();
                ((r9) w14.f7723v).zzd = 0;
                byte[] a15 = kc.a(32);
                g0 J4 = h0.J(0, a15, a15.length);
                w14.e();
                ((r9) w14.f7723v).zze = J4;
                return (r9) w14.c();
            case 5:
                kb w15 = lb.w();
                w15.e();
                lb.B((lb) w15.f7723v, (mb) b2Var);
                w15.e();
                ((lb) w15.f7723v).zzd = 0;
                return (lb) w15.c();
            case 6:
                nb w16 = ob.w();
                w16.e();
                ob.B((ob) w16.f7723v, (pb) b2Var);
                w16.e();
                ((ob) w16.f7723v).zzd = 0;
                return (ob) w16.c();
            case 7:
                tb tbVar = (tb) b2Var;
                rb w17 = sb.w();
                w17.e();
                ((sb) w17.f7723v).zzd = 0;
                byte[] a16 = kc.a(32);
                g0 J5 = h0.J(0, a16, a16.length);
                w17.e();
                ((sb) w17.f7723v).zze = J5;
                return (sb) w17.c();
            case 8:
                x9 x9Var = (x9) b2Var;
                ECParameterSpec i6 = bc.i(o5.c(x9Var.y().z().A()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) dc.f7783h.a("EC");
                keyPairGenerator.initialize(i6);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                ECPoint w18 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                da x10 = ea.x();
                x10.e();
                ((ea) x10.f7723v).zzd = 0;
                aa y10 = x9Var.y();
                x10.e();
                ea.E((ea) x10.f7723v, y10);
                g0 I2 = h0.I(w18.getAffineX().toByteArray());
                x10.e();
                ((ea) x10.f7723v).zzf = I2;
                g0 I3 = h0.I(w18.getAffineY().toByteArray());
                x10.e();
                ((ea) x10.f7723v).zzg = I3;
                ba w19 = ca.w();
                w19.e();
                ((ca) w19.f7723v).zzd = 0;
                w19.e();
                ((ca) w19.f7723v).zze = (ea) x10.c();
                g0 I4 = h0.I(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray());
                w19.e();
                ((ca) w19.f7723v).zzf = I4;
                return (ca) w19.c();
            case 9:
                qa qaVar = (qa) b2Var;
                int A = qaVar.y().A() - 2;
                if (A != 1) {
                    int i10 = 3;
                    if (A != 2 && A != 3 && A != 4) {
                        throw new GeneralSecurityException("Invalid KEM");
                    }
                    int A2 = qaVar.y().A();
                    byte[] bArr = z5.f8276a;
                    int i11 = A2 - 2;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                            }
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 1;
                    }
                    ECParameterSpec i12 = bc.i(i10);
                    KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) dc.f7783h.a("EC");
                    keyPairGenerator2.initialize(i12);
                    KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                    ECPoint w20 = ((ECPublicKey) generateKeyPair2.getPublic()).getW();
                    EllipticCurve curve = bc.i(i10).getCurve();
                    bc.d(w20, curve);
                    int a17 = bc.a(curve);
                    int i13 = a17 + a17 + 1;
                    I = new byte[i13];
                    byte[] byteArray = w20.getAffineX().toByteArray();
                    byte[] byteArray2 = w20.getAffineY().toByteArray();
                    int length = byteArray2.length;
                    System.arraycopy(byteArray2, 0, I, i13 - length, length);
                    int length2 = byteArray.length;
                    System.arraycopy(byteArray, 0, I, (a17 + 1) - length2, length2);
                    I[0] = 4;
                    a10 = ((ECPrivateKey) generateKeyPair2.getPrivate()).getS().toByteArray();
                } else {
                    a10 = kc.a(32);
                    a10[0] = (byte) (a10[0] | 7);
                    int i14 = a10[31] & 63;
                    a10[31] = (byte) i14;
                    a10[31] = (byte) (i14 | 128);
                    if (a10.length == 32) {
                        byte[] bArr2 = new byte[32];
                        bArr2[0] = 9;
                        I = r.I(a10, bArr2);
                    } else {
                        throw new InvalidKeyException("Private key must have 32 bytes.");
                    }
                }
                va x11 = wa.x();
                x11.e();
                ((wa) x11.f7723v).zzd = 0;
                sa y11 = qaVar.y();
                x11.e();
                wa.D((wa) x11.f7723v, y11);
                g0 J6 = h0.J(0, I, I.length);
                x11.e();
                ((wa) x11.f7723v).zzf = J6;
                ta w21 = ua.w();
                w21.e();
                ((ua) w21.f7723v).zzd = 0;
                w21.e();
                ((ua) w21.f7723v).zze = (wa) x11.c();
                g0 I5 = h0.I(a10);
                w21.e();
                ((ua) w21.f7723v).zzf = I5;
                return (ua) w21.c();
            default:
                ma maVar = (ma) b2Var;
                ja w22 = ka.w();
                w22.e();
                ((ka) w22.f7723v).zzd = 0;
                oa A3 = maVar.A();
                w22.e();
                ka.D((ka) w22.f7723v, A3);
                byte[] a18 = kc.a(maVar.v());
                g0 J7 = h0.J(0, a18, a18.length);
                w22.e();
                ((ka) w22.f7723v).zzf = J7;
                return (ka) w22.c();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final b2 b(h0 h0Var) {
        switch (this.f8105b) {
            case 0:
                return p8.x(h0Var, r0.f8101b);
            case 1:
                return a9.y(h0Var, r0.f8101b);
            case 2:
                return g9.y(h0Var, r0.f8101b);
            case 3:
                return l9.y(h0Var, r0.f8101b);
            case 4:
                return t9.x(h0Var, r0.f8101b);
            case 5:
                return mb.x(h0Var, r0.f8101b);
            case 6:
                return pb.y(h0Var, r0.f8101b);
            case 7:
                return tb.x(h0Var, r0.f8101b);
            case 8:
                return x9.x(h0Var, r0.f8101b);
            case 9:
                return qa.x(h0Var, r0.f8101b);
            default:
                return ma.z(h0Var, r0.f8101b);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final Map c() {
        switch (this.f8105b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", s4.i(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", s4.i(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", s4.i(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", s4.i(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", s4.h(16, 1));
                hashMap2.put("AES128_EAX_RAW", s4.h(16, 3));
                hashMap2.put("AES256_EAX", s4.h(32, 1));
                hashMap2.put("AES256_EAX_RAW", s4.h(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", s4.j(16, 1));
                hashMap3.put("AES128_GCM_RAW", s4.j(16, 3));
                hashMap3.put("AES256_GCM", s4.j(32, 1));
                hashMap3.put("AES256_GCM_RAW", s4.j(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", s4.k(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", s4.k(16, 3));
                hashMap4.put("AES256_GCM_SIV", s4.k(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", s4.k(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new n6(1, t9.w()));
                hashMap5.put("CHACHA20_POLY1305_RAW", new n6(3, t9.w()));
                return Collections.unmodifiableMap(hashMap5);
            case 5:
            case 6:
            default:
                return Collections.emptyMap();
            case 7:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new n6(1, tb.w()));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new n6(3, tb.w()));
                return Collections.unmodifiableMap(hashMap6);
            case 8:
                HashMap hashMap7 = new HashMap();
                x3 a10 = y3.a("AES128_GCM");
                byte[] bArr = i5.f7888d;
                hashMap7.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", i5.i(3, a10, bArr, 1));
                hashMap7.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", i5.i(3, y3.a("AES128_GCM"), bArr, 3));
                hashMap7.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", i5.i(4, y3.a("AES128_GCM"), bArr, 1));
                hashMap7.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", i5.i(4, y3.a("AES128_GCM"), bArr, 3));
                hashMap7.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", i5.i(4, y3.a("AES128_GCM"), bArr, 3));
                hashMap7.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", i5.i(3, y3.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap7.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", i5.i(3, y3.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                hashMap7.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", i5.i(4, y3.a("AES128_CTR_HMAC_SHA256"), bArr, 1));
                hashMap7.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", i5.i(4, y3.a("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(hashMap7);
            case 9:
                HashMap hashMap8 = new HashMap();
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", y5.i(3, 3, 3, 1));
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", y5.i(3, 3, 3, 3));
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", y5.i(3, 3, 4, 1));
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", y5.i(3, 3, 4, 3));
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", y5.i(3, 3, 5, 1));
                hashMap8.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", y5.i(3, 3, 5, 3));
                hashMap8.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", y5.i(4, 3, 3, 1));
                hashMap8.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", y5.i(4, 3, 3, 3));
                hashMap8.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", y5.i(4, 3, 4, 1));
                hashMap8.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", y5.i(4, 3, 4, 3));
                hashMap8.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", y5.i(5, 4, 3, 1));
                hashMap8.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", y5.i(5, 4, 3, 3));
                hashMap8.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", y5.i(5, 4, 4, 1));
                hashMap8.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", y5.i(5, 4, 4, 3));
                hashMap8.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", y5.i(6, 5, 3, 1));
                hashMap8.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", y5.i(6, 5, 3, 3));
                hashMap8.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", y5.i(6, 5, 4, 1));
                hashMap8.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", y5.i(6, 5, 4, 3));
                return Collections.unmodifiableMap(hashMap8);
            case 10:
                HashMap hashMap9 = new HashMap();
                hashMap9.put("HMAC_SHA256_128BITTAG", s4.m(32, 16, 5, 1));
                hashMap9.put("HMAC_SHA256_128BITTAG_RAW", s4.m(32, 16, 5, 3));
                hashMap9.put("HMAC_SHA256_256BITTAG", s4.m(32, 32, 5, 1));
                hashMap9.put("HMAC_SHA256_256BITTAG_RAW", s4.m(32, 32, 5, 3));
                hashMap9.put("HMAC_SHA512_128BITTAG", s4.m(64, 16, 6, 1));
                hashMap9.put("HMAC_SHA512_128BITTAG_RAW", s4.m(64, 16, 6, 3));
                hashMap9.put("HMAC_SHA512_256BITTAG", s4.m(64, 32, 6, 1));
                hashMap9.put("HMAC_SHA512_256BITTAG_RAW", s4.m(64, 32, 6, 3));
                hashMap9.put("HMAC_SHA512_512BITTAG", s4.m(64, 64, 6, 1));
                hashMap9.put("HMAC_SHA512_512BITTAG_RAW", s4.m(64, 64, 6, 3));
                return Collections.unmodifiableMap(hashMap9);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o6
    public final void d(b2 b2Var) {
        switch (this.f8105b) {
            case 0:
                p8 p8Var = (p8) b2Var;
                o6 a10 = new s4(1).a();
                u8 y10 = p8Var.y();
                t4 t4Var = (t4) a10;
                mc.b(y10.v());
                w8 A = y10.A();
                if (A.v() >= 12 && A.v() <= 16) {
                    new s4(12).a().d(p8Var.z());
                    mc.b(p8Var.y().v());
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                a9 a9Var = (a9) b2Var;
                mc.b(a9Var.v());
                if (a9Var.z().v() != 12 && a9Var.z().v() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                mc.b(((g9) b2Var).v());
                return;
            case 3:
                mc.b(((l9) b2Var).v());
                return;
            case 4:
                t9 t9Var = (t9) b2Var;
                return;
            case 5:
                mb mbVar = (mb) b2Var;
                return;
            case 6:
                pb pbVar = (pb) b2Var;
                if (!pbVar.z().isEmpty() && pbVar.A()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            case 7:
                tb tbVar = (tb) b2Var;
                return;
            case 8:
                o5.a(((x9) b2Var).y());
                return;
            case 9:
                z5.a(((qa) b2Var).y());
                return;
            default:
                ma maVar = (ma) b2Var;
                if (maVar.v() >= 16) {
                    s4.o(maVar.A());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }
}
