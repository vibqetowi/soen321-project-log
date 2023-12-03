package com.google.android.gms.internal.p000firebaseauthapi;

import g.x;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j7  reason: invalid package */
/* loaded from: classes.dex */
public final class j7 {

    /* renamed from: a  reason: collision with root package name */
    public o7 f7916a = null;

    /* renamed from: b  reason: collision with root package name */
    public x f7917b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f7918c = null;

    public final k7 a() {
        x xVar;
        boolean z10;
        boolean z11;
        nc a10;
        o7 o7Var = this.f7916a;
        if (o7Var != null && (xVar = this.f7917b) != null) {
            if (o7Var.f8024b == ((nc) xVar.f16143v).f8012a.length) {
                n7 n7Var = n7.f8010e;
                n7 n7Var2 = o7Var.f8026d;
                if (n7Var2 != n7Var) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && this.f7918c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                }
                if (n7Var2 != n7Var) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && this.f7918c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                }
                if (n7Var2 == n7Var) {
                    a10 = nc.a(new byte[0]);
                } else if (n7Var2 != n7.f8009d && n7Var2 != n7.f8008c) {
                    if (n7Var2 == n7.f8007b) {
                        a10 = nc.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f7918c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f7916a.f8026d)));
                    }
                } else {
                    a10 = nc.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f7918c.intValue()).array());
                }
                return new k7(this.f7916a, a10);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}
