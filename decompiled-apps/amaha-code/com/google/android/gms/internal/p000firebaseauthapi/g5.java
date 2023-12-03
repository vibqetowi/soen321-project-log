package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import kc.f;
import kotlin.jvm.internal.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g5  reason: invalid package */
/* loaded from: classes.dex */
public final class g5 implements n3 {

    /* renamed from: a  reason: collision with root package name */
    public final e4 f7862a;

    public g5(e4 e4Var) {
        this.f7862a = e4Var;
        if (e4Var.c()) {
            c8 a10 = u6.f8172b.a();
            h.n0(e4Var);
            a10.a();
            a10.a();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        e4 e4Var = this.f7862a;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (f4 f4Var : e4Var.a(copyOf)) {
                try {
                    byte[] a10 = ((n3) f4Var.f7844a).a(copyOfRange, bArr2);
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    h5.f7872a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (f4 f4Var2 : e4Var.a(f.f23232v)) {
            try {
                return ((n3) f4Var2.f7844a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
