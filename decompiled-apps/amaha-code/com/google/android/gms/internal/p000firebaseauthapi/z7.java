package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import kc.f;
import kotlin.jvm.internal.h;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z7  reason: invalid package */
/* loaded from: classes.dex */
public final class z7 implements d4 {

    /* renamed from: a  reason: collision with root package name */
    public final e4 f8292a;

    public z7(e4 e4Var) {
        this.f8292a = e4Var;
        if (e4Var.c()) {
            c8 a10 = u6.f8172b.a();
            h.n0(e4Var);
            a10.a();
            a10.a();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d4
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            e4 e4Var = this.f8292a;
            for (f4 f4Var : e4Var.a(copyOf)) {
                if (v.h.b(f4Var.f7846c, 3)) {
                    bArr3 = r.Q(bArr2, a8.f7708b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((d4) f4Var.f7844a).a(copyOfRange, bArr3);
                    return;
                } catch (GeneralSecurityException e10) {
                    a8.f7707a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (f4 f4Var2 : e4Var.a(f.f23232v)) {
                try {
                    ((d4) f4Var2.f7844a).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
