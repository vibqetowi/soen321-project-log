package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesCtrJceCipher implements IndCpaCipher {
    private static final String CIPHER_ALGORITHM = "AES/CTR/NoPadding";
    private static final String KEY_ALGORITHM = "AES";
    private static final int MIN_IV_SIZE_IN_BYTES = 12;
    private static final ThreadLocal<Cipher> localCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesCtrJceCipher.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance(AesCtrJceCipher.CIPHER_ALGORITHM);
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final int blockSize;
    private final int ivSize;
    private final SecretKeySpec keySpec;

    public AesCtrJceCipher(final byte[] key, int ivSize) throws GeneralSecurityException {
        Validators.validateAesKeySize(key.length);
        this.keySpec = new SecretKeySpec(key, "AES");
        int blockSize = localCipher.get().getBlockSize();
        this.blockSize = blockSize;
        if (ivSize < 12 || ivSize > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.ivSize = ivSize;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(final byte[] plaintext) throws GeneralSecurityException {
        int length = plaintext.length;
        int i = this.ivSize;
        if (length > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.ivSize));
        }
        byte[] bArr = new byte[plaintext.length + i];
        byte[] randBytes = Random.randBytes(i);
        System.arraycopy(randBytes, 0, bArr, 0, this.ivSize);
        doCtr(plaintext, 0, plaintext.length, bArr, this.ivSize, randBytes, true);
        return bArr;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(final byte[] ciphertext) throws GeneralSecurityException {
        int length = ciphertext.length;
        int i = this.ivSize;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(ciphertext, 0, bArr, 0, i);
        int length2 = ciphertext.length;
        int i2 = this.ivSize;
        byte[] bArr2 = new byte[length2 - i2];
        doCtr(ciphertext, i2, ciphertext.length - i2, bArr2, 0, bArr, false);
        return bArr2;
    }

    private void doCtr(final byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset, final byte[] iv, boolean encrypt) throws GeneralSecurityException {
        Cipher cipher = localCipher.get();
        byte[] bArr = new byte[this.blockSize];
        System.arraycopy(iv, 0, bArr, 0, this.ivSize);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        if (encrypt) {
            cipher.init(1, this.keySpec, ivParameterSpec);
        } else {
            cipher.init(2, this.keySpec, ivParameterSpec);
        }
        if (cipher.doFinal(input, inputOffset, inputLen, output, outputOffset) != inputLen) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
