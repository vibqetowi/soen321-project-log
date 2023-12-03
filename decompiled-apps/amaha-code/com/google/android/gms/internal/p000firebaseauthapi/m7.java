package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m7  reason: invalid package */
/* loaded from: classes.dex */
public final class m7 {

    /* renamed from: a  reason: collision with root package name */
    public Integer f7980a = null;

    /* renamed from: b  reason: collision with root package name */
    public Integer f7981b = null;

    /* renamed from: c  reason: collision with root package name */
    public n7 f7982c = n7.f8010e;

    public final void a(int i6) {
        if (i6 != 16 && i6 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i6 * 8)));
        }
        this.f7980a = Integer.valueOf(i6);
    }

    public final void b(int i6) {
        if (i6 >= 10 && i6 <= 16) {
            this.f7981b = Integer.valueOf(i6);
            return;
        }
        throw new GeneralSecurityException(c.p("Invalid tag size for AesCmacParameters: ", i6));
    }

    public final o7 c() {
        Integer num = this.f7980a;
        if (num != null && this.f7981b != null) {
            return new o7(num.intValue(), this.f7981b.intValue(), this.f7982c);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }
}
