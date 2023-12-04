package com.google.crypto.tink.subtle;

import java.security.SecureRandom;
/* loaded from: classes7.dex */
public final class Random {
    private static final ThreadLocal<SecureRandom> localRandom = new ThreadLocal<SecureRandom>() { // from class: com.google.crypto.tink.subtle.Random.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return Random.newDefaultSecureRandom();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom newDefaultSecureRandom() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] randBytes(int size) {
        byte[] bArr = new byte[size];
        localRandom.get().nextBytes(bArr);
        return bArr;
    }

    public static final int randInt(int max) {
        return localRandom.get().nextInt(max);
    }

    public static final int randInt() {
        return localRandom.get().nextInt();
    }
}
