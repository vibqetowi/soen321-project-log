package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
/* loaded from: classes7.dex */
public final class RsaKemHybridEncrypt implements HybridEncrypt {
    private final AeadFactory aeadFactory;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final RSAPublicKey recipientPublicKey;

    public RsaKemHybridEncrypt(final RSAPublicKey recipientPublicKey, String hkdfHmacAlgo, final byte[] hkdfSalt, AeadFactory aeadFactory) throws GeneralSecurityException {
        RsaKem.validateRsaModulus(recipientPublicKey.getModulus());
        this.recipientPublicKey = recipientPublicKey;
        this.hkdfHmacAlgo = hkdfHmacAlgo;
        this.hkdfSalt = hkdfSalt;
        this.aeadFactory = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(final byte[] plaintext, final byte[] contextInfo) throws GeneralSecurityException {
        byte[] generateSecret = RsaKem.generateSecret(this.recipientPublicKey.getModulus());
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(1, this.recipientPublicKey);
        byte[] doFinal = cipher.doFinal(generateSecret);
        byte[] encrypt = this.aeadFactory.createAead(Hkdf.computeHkdf(this.hkdfHmacAlgo, generateSecret, this.hkdfSalt, contextInfo, this.aeadFactory.getKeySizeInBytes())).encrypt(plaintext, RsaKem.EMPTY_AAD);
        return ByteBuffer.allocate(doFinal.length + encrypt.length).put(doFinal).put(encrypt).array();
    }
}
