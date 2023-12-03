package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFf1zSDK {
    public static void values(byte[] bArr, byte b10, long j10) {
        for (int i6 = 0; i6 < bArr.length; i6++) {
            if (((1 << i6) & j10) != 0) {
                bArr[i6] = (byte) (bArr[i6] ^ b10);
            }
        }
    }
}
