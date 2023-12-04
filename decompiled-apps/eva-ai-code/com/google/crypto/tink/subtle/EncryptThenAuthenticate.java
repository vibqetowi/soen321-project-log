package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Mac;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class EncryptThenAuthenticate implements Aead {
    private final IndCpaCipher cipher;
    private final Mac mac;
    private final int macLength;

    public EncryptThenAuthenticate(final IndCpaCipher cipher, final Mac mac, int macLength) {
        this.cipher = cipher;
        this.mac = mac;
        this.macLength = macLength;
    }

    public static Aead newAesCtrHmac(final byte[] aesCtrKey, int ivSize, String hmacAlgorithm, final byte[] hmacKey, int tagSize) throws GeneralSecurityException {
        return new EncryptThenAuthenticate(new AesCtrJceCipher(aesCtrKey, ivSize), new PrfMac(new PrfHmacJce(hmacAlgorithm, new SecretKeySpec(hmacKey, "HMAC")), tagSize), tagSize);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] encrypt = this.cipher.encrypt(plaintext);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        return Bytes.concat(encrypt, this.mac.computeMac(Bytes.concat(associatedData, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(associatedData.length * 8).array(), 8))));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        int length = ciphertext.length;
        int i = this.macLength;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(ciphertext, 0, ciphertext.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, ciphertext.length - this.macLength, ciphertext.length);
        if (associatedData == null) {
            associatedData = new byte[0];
        }
        this.mac.verifyMac(copyOfRange2, Bytes.concat(associatedData, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(associatedData.length * 8).array(), 8)));
        return this.cipher.decrypt(copyOfRange);
    }
}
