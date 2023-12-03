package com.google.android.gms.internal.p000firebaseauthapi;

import g.x;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ac  reason: invalid package */
/* loaded from: classes.dex */
public final class ac implements o3 {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f7709g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final ECPrivateKey f7710a;

    /* renamed from: b  reason: collision with root package name */
    public final x f7711b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7712c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7713d;

    /* renamed from: e  reason: collision with root package name */
    public final zb f7714e;
    public final int f;

    public ac(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i6, p5 p5Var) {
        this.f7710a = eCPrivateKey;
        this.f7711b = new x(18, eCPrivateKey);
        this.f7713d = bArr;
        this.f7712c = str;
        this.f = i6;
        this.f7714e = p5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d8  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(byte[] bArr) {
        int i6;
        int length;
        p2 p2Var;
        int a10 = bc.a(this.f7710a.getParams().getCurve());
        int i10 = this.f;
        int i11 = i10 - 1;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 2) {
                i6 = a10 + a10;
                length = bArr.length;
                if (length < i6) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i6);
                    p5 p5Var = (p5) this.f7714e;
                    int i13 = p5Var.f8042b;
                    x xVar = this.f7711b;
                    byte[] Q = r.Q(copyOfRange, bc.f((ECPrivateKey) xVar.f16143v, bc.h(((ECPrivateKey) xVar.f16143v).getParams(), i10, copyOfRange)));
                    dc dcVar = dc.f;
                    String str = this.f7712c;
                    Mac mac = (Mac) dcVar.a(str);
                    if (i13 <= mac.getMacLength() * 255) {
                        byte[] bArr2 = this.f7713d;
                        if (bArr2 != null && bArr2.length != 0) {
                            mac.init(new SecretKeySpec(bArr2, str));
                        } else {
                            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                        }
                        byte[] bArr3 = new byte[i13];
                        mac.init(new SecretKeySpec(mac.doFinal(Q), str));
                        byte[] bArr4 = new byte[0];
                        int i14 = 0;
                        while (true) {
                            mac.update(bArr4);
                            mac.update((byte[]) null);
                            mac.update((byte) i12);
                            bArr4 = mac.doFinal();
                            int length2 = bArr4.length;
                            int i15 = i14 + length2;
                            if (i15 >= i13) {
                                break;
                            }
                            System.arraycopy(bArr4, 0, bArr3, i14, length2);
                            i12++;
                            i14 = i15;
                        }
                        System.arraycopy(bArr4, 0, bArr3, i14, i13 - i14);
                        p5Var.getClass();
                        int i16 = p5Var.f8042b;
                        if (i13 == i16) {
                            String str2 = m4.f7979b;
                            String str3 = p5Var.f8041a;
                            if (str3.equals(str2)) {
                                d9 w10 = e9.w();
                                w10.b(p5Var.f8043c);
                                g0 J = h0.J(0, bArr3, i16);
                                w10.e();
                                ((e9) w10.f7723v).zze = J;
                                p2Var = new p2((m3) k4.c(str3, (e9) w10.c(), m3.class));
                            } else if (str3.equals(m4.f7978a)) {
                                int i17 = p5Var.f8045e;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, 0, i17);
                                byte[] copyOfRange3 = Arrays.copyOfRange(bArr3, i17, i16);
                                r8 w11 = s8.w();
                                n8 n8Var = p5Var.f8044d;
                                w11.b(n8Var.z());
                                g0 I = h0.I(copyOfRange2);
                                w11.e();
                                ((s8) w11.f7723v).zzf = I;
                                ja w12 = ka.w();
                                w12.b(n8Var.A());
                                g0 I2 = h0.I(copyOfRange3);
                                w12.e();
                                ((ka) w12.f7723v).zzf = I2;
                                m8 w13 = n8.w();
                                int v10 = n8Var.v();
                                w13.e();
                                ((n8) w13.f7723v).zzd = v10;
                                w13.e();
                                ((n8) w13.f7723v).zze = (s8) w11.c();
                                w13.e();
                                n8.D((n8) w13.f7723v, (ka) w12.c());
                                p2Var = new p2((m3) k4.c(str3, (n8) w13.c(), m3.class));
                            } else if (str3.equals(f5.f7849a)) {
                                m9 w14 = n9.w();
                                w14.b(p5Var.f);
                                g0 J2 = h0.J(0, bArr3, i16);
                                w14.e();
                                ((n9) w14.f7723v).zze = J2;
                                p2Var = new p2((n3) k4.c(str3, (n9) w14.c(), n3.class));
                            } else {
                                throw new GeneralSecurityException("unknown DEM key type");
                            }
                            byte[] copyOfRange4 = Arrays.copyOfRange(bArr, i6, length);
                            byte[] bArr5 = f7709g;
                            m3 m3Var = (m3) p2Var.f8038v;
                            if (m3Var != null) {
                                return m3Var.a(copyOfRange4, bArr5);
                            }
                            return ((n3) p2Var.f8039w).a(copyOfRange4, bArr5);
                        }
                        throw new GeneralSecurityException("Symmetric key has incorrect length");
                    }
                    throw new GeneralSecurityException("size too large");
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
        } else {
            a10 += a10;
        }
        i6 = a10 + 1;
        length = bArr.length;
        if (length < i6) {
        }
    }
}
