package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i7  reason: invalid package */
/* loaded from: classes.dex */
public final class i7 {
    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i6 = 0;
        while (i6 == 0) {
            secureRandom.nextBytes(bArr);
            i6 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i6;
    }

    public static final nc b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i6] = (byte) charAt;
            } else {
                throw new zzhi("Not a printable ASCII character: " + charAt);
            }
        }
        return nc.a(bArr);
    }
}
