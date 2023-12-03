package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ic  reason: invalid package */
/* loaded from: classes.dex */
public final class ic implements f8 {

    /* renamed from: u  reason: collision with root package name */
    public final hc f7889u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7890v;

    /* renamed from: w  reason: collision with root package name */
    public final Key f7891w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7892x;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ic(String str, SecretKeySpec secretKeySpec) {
        char c10;
        int i6;
        hc hcVar = new hc(this);
        this.f7889u = hcVar;
        if (r.F(2)) {
            this.f7890v = str;
            this.f7891w = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 == 4) {
                                    i6 = 64;
                                } else {
                                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                                }
                            } else {
                                i6 = 48;
                            }
                        } else {
                            i6 = 32;
                        }
                    } else {
                        i6 = 28;
                    }
                    this.f7892x = i6;
                } else {
                    this.f7892x = 20;
                }
                hcVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f8
    public final byte[] a(byte[] bArr, int i6) {
        if (i6 <= this.f7892x) {
            hc hcVar = this.f7889u;
            ((Mac) hcVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) hcVar.get()).doFinal(), i6);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
