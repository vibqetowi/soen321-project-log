package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;
/* loaded from: classes7.dex */
public final class RsaKemHybridDecrypt implements HybridDecrypt {
    private final AeadFactory aeadFactory;
    private final String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final RSAPrivateKey recipientPrivateKey;

    public RsaKemHybridDecrypt(final RSAPrivateKey recipientPrivateKey, String hkdfHmacAlgo, final byte[] hkdfSalt, AeadFactory aeadFactory) throws GeneralSecurityException {
        RsaKem.validateRsaModulus(recipientPrivateKey.getModulus());
        this.recipientPrivateKey = recipientPrivateKey;
        this.hkdfSalt = hkdfSalt;
        this.hkdfHmacAlgo = hkdfHmacAlgo;
        this.aeadFactory = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(final byte[] ciphertext, final byte[] contextInfo) throws GeneralSecurityException {
        int bigIntSizeInBytes = RsaKem.bigIntSizeInBytes(this.recipientPrivateKey.getModulus());
        if (ciphertext.length < bigIntSizeInBytes) {
            throw new GeneralSecurityException(String.format("Ciphertext must be of at least size %d bytes, but got %d", Integer.valueOf(bigIntSizeInBytes), Integer.valueOf(ciphertext.length)));
        }
        ByteBuffer wrap = ByteBuffer.wrap(ciphertext);
        byte[] bArr = new byte[bigIntSizeInBytes];
        wrap.get(bArr);
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(2, this.recipientPrivateKey);
        Aead createAead = this.aeadFactory.createAead(Hkdf.computeHkdf(this.hkdfHmacAlgo, cipher.doFinal(bArr), this.hkdfSalt, contextInfo, this.aeadFactory.getKeySizeInBytes()));
        byte[] bArr2 = new byte[wrap.remaining()];
        wrap.get(bArr2);
        return createAead.decrypt(bArr2, RsaKem.EMPTY_AAD);
    }
}
