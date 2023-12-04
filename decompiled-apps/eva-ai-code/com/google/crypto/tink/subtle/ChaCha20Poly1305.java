package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes7.dex */
public final class ChaCha20Poly1305 extends ChaCha20Poly1305Base {
    @Override // com.google.crypto.tink.subtle.ChaCha20Poly1305Base, com.google.crypto.tink.Aead
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] ciphertext, byte[] associatedData) throws GeneralSecurityException {
        return super.decrypt(ciphertext, associatedData);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Poly1305Base, com.google.crypto.tink.Aead
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] plaintext, byte[] associatedData) throws GeneralSecurityException {
        return super.encrypt(plaintext, associatedData);
    }

    public ChaCha20Poly1305(final byte[] key) throws InvalidKeyException {
        super(key);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Poly1305Base
    ChaCha20Base newChaCha20Instance(final byte[] key, int initialCounter) throws InvalidKeyException {
        return new ChaCha20(key, initialCounter);
    }
}
