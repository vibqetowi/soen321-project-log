package com.google.android.gms.internal.p000firebaseauthapi;

import f6.b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
import v.c;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q4  reason: invalid package */
/* loaded from: classes.dex */
public final class q4 extends a7 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(int i6, Class cls) {
        super(cls);
        this.f8078b = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a7
    public final Object a(b2 b2Var) {
        boolean z10;
        int i6;
        b6 b6Var;
        int i10 = 3;
        boolean z11 = false;
        switch (this.f8078b) {
            case 0:
                n8 n8Var = (n8) b2Var;
                return new cc((gc) new s4(1).g(n8Var.z(), gc.class), (d4) new s4(12).g(n8Var.A(), d4.class), n8Var.A().A().v());
            case 1:
                s8 s8Var = (s8) b2Var;
                return new ub(s8Var.B().K(), s8Var.A().v());
            case 2:
                y8 y8Var = (y8) b2Var;
                return new vb(y8Var.A().K(), y8Var.z().v());
            case 3:
                return new wb(((e9) b2Var).z().K(), 0);
            case 4:
                return new b5(((j9) b2Var).z().K());
            case 5:
                return new wb(((r9) b2Var).z().K(), 1);
            case 6:
                String y10 = ((lb) b2Var).z().y();
                return c4.a(y10).e(y10);
            case 7:
                ob obVar = (ob) b2Var;
                String z12 = obVar.z().z();
                return new u4(obVar.z().v(), c4.a(z12).e(z12));
            case 8:
                return new wb(((sb) b2Var).z().K(), 2);
            case 9:
                return new xb(((n9) b2Var).z().K());
            case 10:
                ca caVar = (ca) b2Var;
                aa w10 = caVar.z().w();
                ga z13 = w10.z();
                return new ac(bc.g(caVar.A().K(), o5.c(z13.A())), z13.y().K(), o5.b(z13.B()), o5.d(w10.C()), new p5(w10.v().y()));
            case 11:
                ea eaVar = (ea) b2Var;
                aa w11 = eaVar.w();
                ga z14 = w11.z();
                int c10 = o5.c(z14.A());
                byte[] K = eaVar.B().K();
                byte[] K2 = eaVar.C().K();
                ECParameterSpec i11 = bc.i(c10);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, K), new BigInteger(1, K2));
                bc.d(eCPoint, i11.getCurve());
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, i11);
                p5 p5Var = new p5(w11.v().y());
                byte[] K3 = z14.y().K();
                String b10 = o5.b(z14.B());
                o5.d(w11.C());
                return new c((ECPublicKey) ((KeyFactory) dc.f7784i.a("EC")).generatePublic(eCPublicKeySpec), K3, b10, p5Var);
            case 12:
                ua uaVar = (ua) b2Var;
                if (uaVar.E()) {
                    if (uaVar.z().F()) {
                        if (uaVar.A().m() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            sa w12 = uaVar.z().w();
                            w5 J = r.J(w12);
                            s5 P = r.P(w12);
                            t5 y11 = r.y(w12);
                            int A = w12.A();
                            int i12 = A - 2;
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        if (i12 == 4) {
                                            i6 = 133;
                                        } else {
                                            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(b.X0(A)));
                                        }
                                    } else {
                                        i6 = 97;
                                    }
                                } else {
                                    i6 = 65;
                                }
                            } else {
                                i6 = 32;
                            }
                            int A2 = uaVar.z().w().A() - 2;
                            if (A2 != 1) {
                                if (A2 != 2 && A2 != 3 && A2 != 4) {
                                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                                }
                                byte[] K4 = uaVar.A().K();
                                byte[] K5 = uaVar.z().B().K();
                                int A3 = uaVar.z().w().A();
                                byte[] bArr = z5.f8276a;
                                int i13 = A3 - 2;
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 != 4) {
                                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                        }
                                    } else {
                                        i10 = 2;
                                    }
                                } else {
                                    i10 = 1;
                                }
                                ECPublicKey h10 = bc.h(bc.i(i10), 1, K5);
                                ECPrivateKey g5 = bc.g(K4, i10);
                                bc.e(g5, h10);
                                bc.d(h10.getW(), g5.getParams().getCurve());
                                b6Var = new b6(K4, K5, 0);
                            } else {
                                byte[] K6 = uaVar.A().K();
                                if (K6.length == 32) {
                                    byte[] bArr2 = new byte[32];
                                    bArr2[0] = 9;
                                    b6Var = new b6(K6, r.I(K6, bArr2), 1);
                                } else {
                                    throw new InvalidKeyException("Private key must have 32 bytes.");
                                }
                            }
                            return new v5(b6Var, J, P, y11, i6);
                        }
                        throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                    }
                    throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                }
                throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
            case 13:
                wa waVar = (wa) b2Var;
                if (waVar.B().m() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    sa w13 = waVar.w();
                    return new c(waVar, r.J(w13), r.P(w13), r.y(w13));
                }
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
            case 14:
                h8 h8Var = (h8) b2Var;
                return new jc(new q(h8Var.A().K()), h8Var.z().v());
            default:
                ka kaVar = (ka) b2Var;
                int A4 = kaVar.A().A();
                SecretKeySpec secretKeySpec = new SecretKeySpec(kaVar.B().K(), "HMAC");
                int v10 = kaVar.A().v();
                int i14 = A4 - 2;
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    return new jc(new ic("HMACSHA224", secretKeySpec), v10);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new jc(new ic("HMACSHA512", secretKeySpec), v10);
                        }
                        return new jc(new ic("HMACSHA256", secretKeySpec), v10);
                    }
                    return new jc(new ic("HMACSHA384", secretKeySpec), v10);
                }
                return new jc(new ic("HMACSHA1", secretKeySpec), v10);
        }
    }
}
