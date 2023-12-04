package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
@Immutable
/* loaded from: classes7.dex */
public final class AesGcmFactory implements AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int keySizeInBytes) throws GeneralSecurityException {
        this.keySizeInBytes = validateAesKeySize(keySizeInBytes);
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
        return this.keySizeInBytes;
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public Aead createAead(final byte[] symmetricKey) throws GeneralSecurityException {
        if (symmetricKey.length != getKeySizeInBytes()) {
            throw new GeneralSecurityException(String.format("Symmetric key has incorrect length; expected %s, but got %s", Integer.valueOf(getKeySizeInBytes()), Integer.valueOf(symmetricKey.length)));
        }
        return new AesGcmJce(symmetricKey);
    }

    private static int validateAesKeySize(int sizeInBytes) throws InvalidAlgorithmParameterException {
        if (sizeInBytes == 16 || sizeInBytes == 32) {
            return sizeInBytes;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", Integer.valueOf(sizeInBytes)));
    }
}
