package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface IndCpaCipher {
    byte[] decrypt(final byte[] ciphertext) throws GeneralSecurityException;

    byte[] encrypt(final byte[] plaintext) throws GeneralSecurityException;
}
