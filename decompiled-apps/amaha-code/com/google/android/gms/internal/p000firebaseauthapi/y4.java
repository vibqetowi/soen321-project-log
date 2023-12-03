package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y4  reason: invalid package */
/* loaded from: classes.dex */
public abstract class y4 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8257a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8258b;

    public y4(byte[] bArr, int i6) {
        if (bArr.length == 32) {
            this.f8257a = v4.c(bArr);
            this.f8258b = i6;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final ByteBuffer a(byte[] bArr, int i6) {
        int[] iArr;
        int[] c10 = v4.c(bArr);
        x4 x4Var = (x4) this;
        int i10 = x4Var.f8240c;
        int[] iArr2 = x4Var.f8257a;
        switch (i10) {
            case 0:
                int length = c10.length;
                if (length == 3) {
                    iArr = new int[16];
                    int[] iArr3 = v4.f8196a;
                    System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
                    System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
                    iArr[12] = i6;
                    System.arraycopy(c10, 0, iArr, 13, 3);
                    break;
                } else {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
            default:
                int length2 = c10.length;
                if (length2 == 6) {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = v4.f8196a;
                    System.arraycopy(iArr5, 0, r11, 0, iArr5.length);
                    System.arraycopy(iArr2, 0, r11, iArr5.length, 8);
                    int[] iArr6 = {0, 0, 0, 0, iArr6[12], iArr6[13], iArr6[14], iArr6[15], 0, 0, 0, 0, c10[0], c10[1], c10[2], c10[3]};
                    v4.b(iArr6);
                    int[] copyOf = Arrays.copyOf(iArr6, 8);
                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr5.length, 8);
                    iArr4[12] = i6;
                    iArr4[13] = 0;
                    iArr4[14] = c10[4];
                    iArr4[15] = c10[5];
                    iArr = iArr4;
                    break;
                } else {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length2 * 32)));
                }
        }
        int[] iArr7 = (int[]) iArr.clone();
        v4.b(iArr7);
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = iArr[i11] + iArr7[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }
}
