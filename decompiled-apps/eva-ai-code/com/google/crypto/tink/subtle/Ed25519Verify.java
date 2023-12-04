package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class Ed25519Verify implements PublicKeyVerify {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final ImmutableByteArray publicKey;

    public Ed25519Verify(final byte[] publicKey) {
        if (publicKey.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.publicKey = ImmutableByteArray.of(publicKey);
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] signature, byte[] data) throws GeneralSecurityException {
        if (signature.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!Ed25519.verify(data, signature, this.publicKey.getBytes())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
