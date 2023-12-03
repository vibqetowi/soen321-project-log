package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a5  reason: invalid package */
/* loaded from: classes.dex */
public abstract class a5 {

    /* renamed from: a  reason: collision with root package name */
    public final x4 f7702a;

    /* renamed from: b  reason: collision with root package name */
    public final x4 f7703b;

    public a5(byte[] bArr) {
        x4 x4Var;
        x4 x4Var2;
        if (r.F(1)) {
            int i6 = ((z4) this).f8275c;
            switch (i6) {
                case 0:
                    x4Var = new x4(1, bArr, 0);
                    break;
                default:
                    x4Var = new x4(1, bArr, 1);
                    break;
            }
            this.f7702a = x4Var;
            switch (i6) {
                case 0:
                    x4Var2 = new x4(0, bArr, 0);
                    break;
                default:
                    x4Var2 = new x4(0, bArr, 1);
                    break;
            }
            this.f7703b = x4Var2;
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int i6;
        int i10;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f7703b.a(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i11 = remaining % 16;
                if (i11 == 0) {
                    i6 = remaining;
                } else {
                    i6 = (remaining + 16) - i11;
                }
                ByteBuffer order = ByteBuffer.allocate(i6 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i6);
                order.putLong(0L);
                order.putLong(remaining);
                if (r.M(r.H(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    x4 x4Var = this.f7702a;
                    x4Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    int length = bArr.length;
                    int i12 = 24;
                    int i13 = x4Var.f8240c;
                    switch (i13) {
                        case 0:
                            i10 = 12;
                            break;
                        default:
                            i10 = 24;
                            break;
                    }
                    if (length == i10) {
                        int remaining2 = byteBuffer.remaining();
                        int i14 = (remaining2 / 64) + 1;
                        for (int i15 = 0; i15 < i14; i15++) {
                            ByteBuffer a10 = x4Var.a(bArr, x4Var.f8258b + i15);
                            if (i15 == i14 - 1) {
                                r.E(allocate, byteBuffer, a10, remaining2 % 64);
                            } else {
                                r.E(allocate, byteBuffer, a10, 64);
                            }
                        }
                        return allocate.array();
                    }
                    StringBuilder sb2 = new StringBuilder("The nonce length (in bytes) must be ");
                    switch (i13) {
                        case 0:
                            i12 = 12;
                            break;
                    }
                    sb2.append(i12);
                    throw new GeneralSecurityException(sb2.toString());
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
