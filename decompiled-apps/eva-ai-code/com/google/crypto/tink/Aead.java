package com.google.crypto.tink;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface Aead {
    byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException;

    byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException;
}
