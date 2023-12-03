package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.b0;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o5  reason: invalid package */
/* loaded from: classes.dex */
public final class o5 {
    public static void a(aa aaVar) {
        bc.i(c(aaVar.z().A()));
        b(aaVar.z().B());
        if (aaVar.C() != 2) {
            k4.a(aaVar.v().y());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String b(int i6) {
        int i10 = i6 - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(b0.v(i6))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int c(int i6) {
        int i10 = i6 - 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i6 != 1) {
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i10)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int d(int i6) {
        int i10 = i6 - 2;
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return 3;
            }
            if (i6 != 1) {
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i10)));
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return 2;
    }
}
