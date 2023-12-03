package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import kc.f;
import kotlin.jvm.internal.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k5  reason: invalid package */
/* loaded from: classes.dex */
public final class k5 implements o3 {

    /* renamed from: a  reason: collision with root package name */
    public final e4 f7943a;

    public k5(e4 e4Var) {
        this.f7943a = e4Var;
        if (e4Var.c()) {
            c8 a10 = u6.f8172b.a();
            h.n0(e4Var);
            a10.a();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o3
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        e4 e4Var = this.f7943a;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (f4 f4Var : e4Var.a(copyOfRange)) {
                try {
                    byte[] a10 = ((o3) f4Var.f7844a).a(copyOfRange2);
                    int length2 = copyOfRange2.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    l5.f7966a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (f4 f4Var2 : e4Var.a(f.f23232v)) {
            try {
                return ((o3) f4Var2.f7844a).a(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
