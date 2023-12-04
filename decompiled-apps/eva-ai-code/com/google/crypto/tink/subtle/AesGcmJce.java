package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreAesCbc;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class AesGcmJce implements Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private static final ThreadLocal<Cipher> localCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesGcmJce.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final SecretKey keySpec;

    public AesGcmJce(final byte[] key) throws GeneralSecurityException {
        Validators.validateAesKeySize(key.length);
        this.keySpec = new SecretKeySpec(key, CipherStorageKeystoreAesCbc.ALGORITHM_AES);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        if (plaintext.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr = new byte[plaintext.length + 12 + 16];
        byte[] randBytes = Random.randBytes(12);
        System.arraycopy(randBytes, 0, bArr, 0, 12);
        AlgorithmParameterSpec params = getParams(randBytes);
        ThreadLocal<Cipher> threadLocal = localCipher;
        threadLocal.get().init(1, this.keySpec, params);
        if (associatedData != null && associatedData.length != 0) {
            threadLocal.get().updateAAD(associatedData);
        }
        int doFinal = threadLocal.get().doFinal(plaintext, 0, plaintext.length, bArr, 12);
        if (doFinal == plaintext.length + 16) {
            return bArr;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - plaintext.length)));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        if (ciphertext.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec params = getParams(ciphertext, 0, 12);
        ThreadLocal<Cipher> threadLocal = localCipher;
        threadLocal.get().init(2, this.keySpec, params);
        if (associatedData != null && associatedData.length != 0) {
            threadLocal.get().updateAAD(associatedData);
        }
        return threadLocal.get().doFinal(ciphertext, 12, ciphertext.length - 12);
    }

    private static AlgorithmParameterSpec getParams(final byte[] iv) throws GeneralSecurityException {
        return getParams(iv, 0, iv.length);
    }

    private static AlgorithmParameterSpec getParams(final byte[] buf, int offset, int len) throws GeneralSecurityException {
        if (SubtleUtil.isAndroid() && SubtleUtil.androidApiLevel() <= 19) {
            return new IvParameterSpec(buf, offset, len);
        }
        return new GCMParameterSpec(128, buf, offset, len);
    }
}
