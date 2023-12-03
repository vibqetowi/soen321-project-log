package com.google.android.gms.internal.p000firebaseauthapi;

import g.x;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q7  reason: invalid package */
/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a  reason: collision with root package name */
    public u7 f8082a = null;

    /* renamed from: b  reason: collision with root package name */
    public x f8083b = null;

    /* renamed from: c  reason: collision with root package name */
    public Integer f8084c = null;

    public final r7 a() {
        x xVar;
        boolean z10;
        boolean z11;
        nc a10;
        u7 u7Var = this.f8082a;
        if (u7Var != null && (xVar = this.f8083b) != null) {
            if (u7Var.f8175b == ((nc) xVar.f16143v).f8012a.length) {
                t7 t7Var = t7.f8154e;
                t7 t7Var2 = u7Var.f8177d;
                if (t7Var2 != t7Var) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && this.f8084c == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
                }
                if (t7Var2 != t7Var) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && this.f8084c != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
                }
                if (t7Var2 == t7Var) {
                    a10 = nc.a(new byte[0]);
                } else if (t7Var2 != t7.f8153d && t7Var2 != t7.f8152c) {
                    if (t7Var2 == t7.f8151b) {
                        a10 = nc.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f8084c.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f8082a.f8177d)));
                    }
                } else {
                    a10 = nc.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f8084c.intValue()).array());
                }
                return new r7(this.f8082a, a10);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}
