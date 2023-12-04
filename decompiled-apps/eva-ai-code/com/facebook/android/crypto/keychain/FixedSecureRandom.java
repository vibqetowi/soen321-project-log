package com.facebook.android.crypto.keychain;

import java.security.SecureRandom;
/* loaded from: classes2.dex */
public class FixedSecureRandom extends SecureRandom {
    @Override // java.security.SecureRandom, java.util.Random
    public synchronized void nextBytes(byte[] bArr) {
        SecureRandomFix.tryApplyFixes();
        super.nextBytes(bArr);
    }
}
